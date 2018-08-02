package br.jus.tst.esocialjt.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

public class OcorrenciaJsonSerializer extends JsonSerializer<Ocorrencia> {

	@Override
	public void serialize(Ocorrencia value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		if (value.getId() != null) {
			gen.writeNumber(value.getId());
		}

	}

}
