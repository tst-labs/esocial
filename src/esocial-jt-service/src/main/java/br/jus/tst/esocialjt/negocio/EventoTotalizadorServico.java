package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.EventoTotalizador;
import br.jus.tst.esocialjt.evento.EventoTotalizadorRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wnameless.json.base.JacksonJsonValue;
import com.github.wnameless.json.flattener.JsonFlattener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static br.jus.tst.esocialjt.util.CSVUtil.convertToCSV;

@Service
public class EventoTotalizadorServico {

	@Autowired
	private EntityManager em;

	@Autowired
	EventoTotalizadorRepository eventoTotalizadorRepository;

	@Transactional
	public void salvar(EventoTotalizador eventoTotalizador) {
		em.flush();
		em.persist(eventoTotalizador);
	}

	public StringBuilder getCSVEventoTotalizador(String tipo, String perApuracao) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Map<String, Object>> flatMapList = eventoTotalizadorRepository
				.findByTipoAndPerApuracaoOrderById(tipo, perApuracao)
				.parallelStream()
				.map(e -> e.getJsonEventoTotalizador().get("eSocial").get(getTipoEvtTotalizador(tipo)))
				.map(j -> new JsonFlattener(new JacksonJsonValue(j)).flattenAsMap())
				.collect(Collectors.toList());

		return convertToCSV(flatMapList);
	}

	private String getTipoEvtTotalizador(String tipo) {
		switch (tipo) {
			case "S5001":
				return "evtBasesTrab";
			case "S5002":
				return "evtIrrfBenef";
			case "S5003":
				return "evtBasesFGTS";
			case "S5011":
				return "evtCS";
			case "S5012":
				return "evtIrrf";
			case "S5013":
				return "evtFGTS";
			default:
				return "";
		}
	}
}
