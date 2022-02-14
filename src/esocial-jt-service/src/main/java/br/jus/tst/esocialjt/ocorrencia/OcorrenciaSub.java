package br.jus.tst.esocialjt.ocorrencia;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocialjt.dominio.Ocorrencia;

@Component
public class OcorrenciaSub {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OcorrenciaSub.class);
	
	@Value("${esocial-jt-ocorrencia-topic:}")
	private String topic;
	
	@Autowired
	OcorrenciaServico servico;
	
	@Autowired
	OcorrenciaDTODeserializer deserializer;
	
	@Autowired
	OcorrenciaRespPub ocorrenciaRespPub;

	@KafkaListener(topics = "${esocial-jt-ocorrencia-topic:}", autoStartup = "${kafka.autostart:false}")
	public void consume(@Payload String mensagem) {
		
		LOGGER.info("Lendo tópico: \n"
						+ "\ttpc: " + topic + "\n"
						+ "\tmsg: " + mensagem+"\n");
	
		try {
			OcorrenciaDTO ocorrenciaDTO = deserializer.converter(mensagem);
			Ocorrencia ocorrencia = OcorrenciaMapper.INSTANCE.comoOcorrencia(ocorrenciaDTO);
			ocorrencia.setDataRecebimento(new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
			Ocorrencia ocorrenciaSalva = servico.salvar(ocorrencia);
			ocorrenciaRespPub.send(200, false, ocorrenciaSalva);
		} catch (Exception e) {
			LOGGER.error("Erro ao ler tópico: \n"
					+ "\ttpc: " + topic + "\n"
					+ "\tmsg: " + mensagem+"\n"
					+ "\t"+e.getMessage());
			LOGGER.debug(e.getMessage(), e);
			ocorrenciaRespPub.send(400, true, e.getMessage());
		}
	}
}
