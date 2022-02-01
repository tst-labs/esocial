package br.jus.tst.esocialjt.util;

import org.springframework.kafka.support.serializer.JsonSerializer;

public class KafkaSerializer<T> extends JsonSerializer<T> {

	public KafkaSerializer() {
		super();
	}
}
