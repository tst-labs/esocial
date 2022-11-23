package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocialjt.dominio.Ocorrencia;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
public class OcorrenciaAtualizacaoPub {

    private static final Logger LOGGER = LoggerFactory.getLogger(OcorrenciaAtualizacaoPub.class);

    @Value("${esocial-jt-ocorrencia-atualizacao-topic:}")
    private String topic;

    @Value("${kafka.autostart:false}")
    private boolean kafkaAutostart;

    private final ObjectMapper objectMapper = new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

    @Autowired
    private KafkaTemplate<String, Ocorrencia> kafkaTemplate;

    @Transactional
    public void send(Ocorrencia ocorrencia) {
        if (kafkaAutostart) {
            try {
                String ocorrenciaStr = objectMapper.writeValueAsString(ocorrencia);
                Ocorrencia ocorrenciaObj = objectMapper.readValue(ocorrenciaStr, Ocorrencia.class);
                kafkaTemplate.send(topic, UUID.randomUUID().toString(), ocorrenciaObj);
            } catch (Exception e) {
                LOGGER.error("Erro ao publicar mensagem no Kafka", e);
            }
        }
    }
}
