package br.jus.tst.esocialjt.auto.tarefas;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.negocio.ConsultaEvento;
import br.jus.tst.esocialjt.negocio.EnvioServico;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.regras.RegraVazia;
import br.jus.tst.esocialjt.regras.evento.RegrasFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TarefaEnvioEventosIT {
	
	@Autowired
	private TarefaEnvioEventos tarefa;
	
	@MockBean
	private EnvioServico envioServico;
	
	@MockBean
	private EventoServico eventoServico;
	
	@Mock
	private ConsultaEvento consultaEvento;
	
	@MockBean
	private RegrasFactory factory;
	
	@Autowired
	private RegraVazia regra;

	@Test
	public void deveChamarEnvio() {
		List<Evento> eventos = Arrays.asList(new Evento());
		EventoDTO eventoDTO = new EventoDTO();
		eventoDTO.setId(1l);
		List<EventoDTO> eventosDTO = Arrays.asList(eventoDTO);

		when(eventoServico.criarConsulta()).thenReturn(consultaEvento);
		when(consultaEvento.comIds(any())).thenReturn(consultaEvento);
		when(consultaEvento.nosEstados(any())).thenReturn(consultaEvento);
		when(consultaEvento.buscar()).thenReturn(eventos);
		when(consultaEvento.buscarDTO()).thenReturn(eventosDTO);
		when(factory.getRegra(eventoDTO)).thenReturn(regra);
		
		tarefa.executar();
		
		verify(consultaEvento).buscar();
		verify(consultaEvento).buscarDTO();
		verify(envioServico).enviarEventosParaESocialGov(eventos);
	}
	
	@Test
	public void naoDeveBuscarSeNaoHaDTO() {

		when(eventoServico.criarConsulta()).thenReturn(consultaEvento);
		when(consultaEvento.comIds(any())).thenReturn(consultaEvento);
		when(consultaEvento.nosEstados(any())).thenReturn(consultaEvento);
		when(consultaEvento.buscarDTO()).thenReturn(Collections.emptyList());
		
		tarefa.executar();
		
		verify(consultaEvento, never()).buscar();
	}
}
