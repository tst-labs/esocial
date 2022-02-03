package br.jus.tst.esocialjt.ocorrencia;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class OcorrenciaRespPub {
	@Value("${esocial-jt-ocorrencia-resp-topic:}")
	private String topic;

	@Autowired
	private KafkaTemplate<String, OcorrenciaResp> kafkaTemplate;

	public void send(long statusCode, boolean isError, Object payload) {
		OcorrenciaResp ocorrenciaResp = new OcorrenciaResp();
		ocorrenciaResp.statusCode = statusCode;
		ocorrenciaResp.isError = isError;
		ocorrenciaResp.payload = payload;
		kafkaTemplate.send(topic, UUID.randomUUID().toString(), ocorrenciaResp);
	}
}
