package br.jus.tst.esocialjt.auto.tarefas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.negocio.AtualizacaoProcessamentoServico;

@Service
@Transactional
public class TarefaAtualizacaoProcessamento implements Tarefa {

	private static final Logger LOGGER = LoggerFactory.getLogger(TarefaAtualizacaoProcessamento.class);

	@Autowired
	private AtualizacaoProcessamentoServico servico;

	@Override
	public boolean executar() {
		List<Lote> lotes = servico.atualizarTodosEmProcessamento();
		log(lotes);
		return lotes.isEmpty();
	}

	private void log(List<Lote> lotes) {
		lotes.forEach(lote -> {
			
			Map<String, Long> resultado = lote.getEnviosEvento().stream()
					.map(EnvioEvento::getEvento)
					.map(Evento::getEstado)
					.collect(Collectors.groupingBy(Estado::getDescricao, Collectors.counting()));
			
			String infoLote = String.format("Lote: %s\t Protocolo: %s\t Estado: %s", 
					lote.getId(), 
					lote.getProtocolo(),
					lote.getEstado().getDescricao());
			
			String infoEvento = String.format("Eventos processados: %s", resultado.toString());
			
			LOGGER.info(infoLote);
			LOGGER.info(infoEvento);
		});
	}

}
