package br.jus.tst.esocialjt.util;

import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class KafkaSerializer<T> extends JsonSerializer<T> {

	public KafkaSerializer() {
		super();
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	}
}
