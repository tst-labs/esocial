package br.jus.tst.esocialjt.auto.tarefas;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.negocio.EnvioServico;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.regras.evento.RegrasFactory;

@Service
@Transactional
public class TarefaEnvioEventos implements Tarefa {

	private static final Logger LOGGER = LoggerFactory.getLogger(TarefaEnvioEventos.class);

	@Autowired
	private EnvioServico envioServico;

	@Autowired
	private EventoServico eventoServico;

	@Autowired
	private RegrasFactory regrasFactory;

	@Value("${esocialjt.limite-eventos-por-lote: 50}")
	private Long LIMITE_EVENTOS_LOTE;

	@Value("${esocialjt.lotes-por-ciclo: 10}")
	private Long lotesPorCiclo;

	@Override
	public boolean executar() {
		List<Evento> eventos = selecionarEventosParaEnvio();
		if(!eventos.isEmpty()) {
			LOGGER.info("Enviando " + eventos.size() + " eventos para o eSocial-GOV");
			List<EnvioEvento> envios = envioServico.enviarEventosParaESocialGov(eventos);
			logResultado(envios);
		}
		return true;
	}

	private List<Evento> selecionarEventosParaEnvio() {
		List<EventoDTO> eventosEmFila = eventoServico
				.criarConsulta()
				.nosEstados(Estado.EM_FILA)
				.buscarDTO();

		if(eventosEmFila.isEmpty()) {
			return Collections.emptyList();
		}

		LOGGER.info(eventosEmFila.size() + " eventos na fila");

		List<EventoDTO> eventosHabilitados = filtrarHabilitados(eventosEmFila);

		if(eventosHabilitados.isEmpty()) {
			logNenhumEventoHabilitado(eventosEmFila);
			return Collections.emptyList();
		}

		boolean temEventoTabela = eventosHabilitados.stream()
			.anyMatch(evento -> GrupoTipoEvento.TABELA.getId().equals(evento.getCodGrupoEvento()));

		if(temEventoTabela) {
			LOGGER.info("Eventos de TABELA detectados. Limitando envio a 1 lote");
		}

		long limite = temEventoTabela ? LIMITE_EVENTOS_LOTE : (LIMITE_EVENTOS_LOTE * lotesPorCiclo);

		Long[] ids = eventosHabilitados
			.stream()
			.limit(limite)
			.map(EventoDTO::getId)
			.toArray(Long[]::new);

		return eventoServico
				.criarConsulta()
				.comIds(ids)
				.buscar();
	}

	/**
	 * O limite por ciclo só pode ser aplicado depois do filtro: cortar antes deixa fora da
	 * janela justamente os eventos que destravariam os demais, e a fila nunca volta a andar.
	 */
	private List<EventoDTO> filtrarHabilitados(List<EventoDTO> eventosEmFila) {
		Map<Long, Boolean> habilitadoPorTipo = new HashMap<>();

		return eventosEmFila.stream()
			.filter(evento -> habilitadoPorTipo.computeIfAbsent(
					evento.getCodTipoEvento(),
					codTipoEvento -> regrasFactory.getRegra(evento).habilitado(evento)))
			.collect(Collectors.toList());
	}

	private void logNenhumEventoHabilitado(List<EventoDTO> eventosEmFila) {
		Map<Long, Long> bloqueadosPorTipo = eventosEmFila.stream()
			.collect(Collectors.groupingBy(EventoDTO::getCodTipoEvento, TreeMap::new, Collectors.counting()));

		String info = String.format("Nenhum evento da fila está habilitado pelas regras. Bloqueados por tipo: %s", bloqueadosPorTipo);
		LOGGER.warn(info);
	}

	private void logResultado(List<EnvioEvento> envios) {
		Map<String, Long> resultado = envios.stream()
			.map(EnvioEvento::getEvento)
			.map(Evento::getEstado)
			.collect(Collectors.groupingBy(Estado::getDescricao, Collectors.counting()));
		String info = String.format("Eventos enviados: %s", resultado);
		LOGGER.info(info);
	}
}
