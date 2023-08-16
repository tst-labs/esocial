package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.EventoTotalizador;
import br.jus.tst.esocialjt.evento.EventoTotalizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class EventoTotalizadorServico {

	@Autowired
	private EntityManager em;

	@Autowired
	EventoTotalizadorRepository eventoTotalizadorRepository;

	private static final Map<String, String> evtMap = new HashMap<>();

	static {
		// Mapeamento dos pares de entrada e saída
		evtMap.put("S5001", "evtBasesTrab");
		evtMap.put("S5002", "evtIrrfBenef");
		evtMap.put("S5003", "evtBasesFGTS");
		evtMap.put("S5011", "evtCS");
		evtMap.put("S5012", "evtIrrf");
		evtMap.put("S5013", "evtFGTS");
		evtMap.put("S5501", "evtTribProcTrab");
	}

	@Transactional
	public void salvar(EventoTotalizador eventoTotalizador) {
		em.flush();
		em.persist(eventoTotalizador);
	}

	public String getCompiladoEventoTotalizador(String tipo, String perApuracao) {

		String xmls = eventoTotalizadorRepository
				.findByTipoAndPerApuracaoOrderById(tipo, perApuracao)
				.stream()
				.map(e -> extractTagContent(e.getXmlEventoTotalizador(), mapEvent(tipo)))
				.collect(Collectors.joining());

		return String.format("<tot tipo=\"%s\">%s</tot>", tipo, xmls);
	}

	public static String extractTagContent(String xmlContent, String tag) {
		// Formata a tag para uso em expressão regular
		String formattedTag = Pattern.quote(tag);

		// Cria a expressão regular para buscar a tag e seu conteúdo
		String regex = "<" + formattedTag + "(.*?)>(.*?)</" + formattedTag + ">";

		// Cria o padrão e o objeto Matcher
		Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(xmlContent);

		return matcher.find() ? matcher.group(0) : "";
	}
	public static String mapEvent(String input) {
		return evtMap.getOrDefault(input, "eSocial");
	}
}
