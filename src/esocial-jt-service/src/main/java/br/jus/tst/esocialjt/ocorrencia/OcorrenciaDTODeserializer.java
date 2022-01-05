package br.jus.tst.esocialjt.ocorrencia;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;

@JsonComponent
public class OcorrenciaDTODeserializer extends JsonDeserializer<OcorrenciaDTO> {
	
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public OcorrenciaDTO deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JacksonException {
		JsonNode node = mapper.readTree(jsonParser);
		return converter(node);
	}
	
	public OcorrenciaDTO converter(InputStream stream) throws IllegalArgumentException, IOException {
		JsonNode node = mapper.readTree(stream);
		return converter(node);
	}

	public OcorrenciaDTO converter(JsonNode node) throws JsonProcessingException, IllegalArgumentException {
		String tipoOcorrenciaTxt = node.get("tipoOcorrencia").asText();
		TipoOcorrencia tipoOcorrencia = TipoOcorrencia.valueOf(tipoOcorrenciaTxt);
		ObjectNode dadosOcorrencia = (ObjectNode) node.get("dadosOcorrencia");
		dadosOcorrencia.put("tipo", tipoOcorrencia.getEstruturaDadosOcorrencia().getName());
		
		return mapper.treeToValue(node, OcorrenciaDTO.class);
	}
}
