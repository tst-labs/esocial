package br.jus.tst.esocialjt.auto.tarefas;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.negocio.ConsultaEvento;
import br.jus.tst.esocialjt.negocio.EnvioServico;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.regras.Regra;
import br.jus.tst.esocialjt.regras.evento.RegrasFactory;

@RunWith(MockitoJUnitRunner.class)
public class TarefaEnvioEventosTest {

	private static final long LIMITE_EVENTOS_LOTE = 2L;
	private static final long LOTES_POR_CICLO = 1L;

	@Mock
	private EnvioServico envioServico;

	@Mock
	private EventoServico eventoServico;

	@Mock
	private ConsultaEvento consultaEvento;

	@Mock
	private RegrasFactory regrasFactory;

	@Mock
	private Regra regraBloqueada;

	@Mock
	private Regra regraLiberada;

	private TarefaEnvioEventos tarefa;

	@Before
	public void inicializar() {
		tarefa = new TarefaEnvioEventos();
		ReflectionTestUtils.setField(tarefa, "envioServico", envioServico);
		ReflectionTestUtils.setField(tarefa, "eventoServico", eventoServico);
		ReflectionTestUtils.setField(tarefa, "regrasFactory", regrasFactory);
		ReflectionTestUtils.setField(tarefa, "LIMITE_EVENTOS_LOTE", LIMITE_EVENTOS_LOTE);
		ReflectionTestUtils.setField(tarefa, "lotesPorCiclo", LOTES_POR_CICLO);

		when(eventoServico.criarConsulta()).thenReturn(consultaEvento);
		when(consultaEvento.nosEstados(any())).thenReturn(consultaEvento);
		when(consultaEvento.comIds(any())).thenReturn(consultaEvento);
	}

	@Test
	public void deveEnviarEventoHabilitadoQueEstaAlemDoLimitePorCiclo() {
		EventoDTO bloqueado1 = naoPeriodico(1L, TipoEvento.ALTERACAO_CADASTRAL);
		EventoDTO bloqueado2 = naoPeriodico(2L, TipoEvento.ALTERACAO_CADASTRAL);
		EventoDTO liberado = naoPeriodico(3L, TipoEvento.TSV_INICIO);

		configurarFila(bloqueado1, bloqueado2, liberado);

		tarefa.executar();

		assertThat(idsSelecionados()).containsExactly(liberado.getId());
	}

	@Test
	public void deveConsultarRegraUmaVezPorTipoDeEvento() {
		configurarFila(
				naoPeriodico(1L, TipoEvento.ALTERACAO_CADASTRAL),
				naoPeriodico(2L, TipoEvento.ALTERACAO_CADASTRAL),
				naoPeriodico(3L, TipoEvento.TSV_INICIO));

		tarefa.executar();

		verify(regraBloqueada, times(1)).habilitado(any());
		verify(regraLiberada, times(1)).habilitado(any());
	}

	@Test
	public void naoDeveEnviarQuandoNenhumEventoDaFilaEstaHabilitado() {
		configurarFila(
				naoPeriodico(1L, TipoEvento.ALTERACAO_CADASTRAL),
				naoPeriodico(2L, TipoEvento.ALTERACAO_CADASTRAL));

		tarefa.executar();

		verify(consultaEvento, never()).buscar();
		verify(envioServico, never()).enviarEventosParaESocialGov(anyList());
	}

	private void configurarFila(EventoDTO... eventosEmFila) {
		when(consultaEvento.buscarDTO()).thenReturn(Arrays.asList(eventosEmFila));
		when(consultaEvento.buscar()).thenReturn(Collections.singletonList(new Evento()));
		when(envioServico.enviarEventosParaESocialGov(anyList())).thenReturn(Collections.emptyList());

		when(regraBloqueada.habilitado(any())).thenReturn(false);
		when(regraLiberada.habilitado(any())).thenReturn(true);
		when(regrasFactory.getRegra(any())).thenAnswer(invocacao -> {
			EventoDTO evento = invocacao.getArgument(0);
			return TipoEvento.TSV_INICIO.getCodTipo().equals(evento.getCodTipoEvento())
					? regraLiberada
					: regraBloqueada;
		});
	}

	private List<Long> idsSelecionados() {
		ArgumentCaptor<Long> ids = ArgumentCaptor.forClass(Long.class);
		verify(consultaEvento).comIds(ids.capture());
		return ids.getAllValues();
	}

	private EventoDTO naoPeriodico(Long id, TipoEvento tipoEvento) {
		return new EventoDTO()
				.setId(id)
				.setCodTipoEvento(tipoEvento.getCodTipo())
				.setCodGrupoEvento(GrupoTipoEvento.NAO_PERIODICO.getId());
	}
}
