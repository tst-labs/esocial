package br.jus.tst.esocialjt.auto.tarefas;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.negocio.EventoServico;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TarefaCorrigeDivergencias implements Tarefa {

    private static final Logger LOGGER = LoggerFactory.getLogger(TarefaCorrigeDivergencias.class);

    @Autowired
    private EventoServico eventoServico;

    @Override
    public boolean executar() {
        List<Evento> eventoEmProcessamento = eventoServico.criarConsulta().nosEstados(Estado.PROCESSAMENTO).buscar();

		List<Evento> eventosSemLoteEmProcessamento = eventoEmProcessamento
				.stream()
				.filter(evento ->
						evento.getEnviosEvento()
								.stream()
								.noneMatch(envioEvento -> envioEvento.getLote().getEstado() == Estado.PROCESSAMENTO)
				)
				.collect(Collectors.toList());
		log(eventosSemLoteEmProcessamento);
		eventosSemLoteEmProcessamento.forEach(e -> e.setEstado(Estado.EM_FILA));

		eventoServico.atualiza(eventosSemLoteEmProcessamento);
        return eventosSemLoteEmProcessamento.isEmpty();
    }

    private void log(List<Evento> eventos) {
		if(eventos.size() > 0){
			String info = String.format("Eventos com divergências de processamento: %d . Voltando para o estado EM_FILA", eventos.size());
			LOGGER.info(info);
		}
    }
}
