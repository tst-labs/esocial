package br.jus.tst.esocialjt.ocorrencia;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OcorrenciaResourceTest {

	@Autowired
	OcorrenciaResource ocorrenciaResource;

	private OcorrenciaDTO ocorrenciaDTO;

	@Before
	public void init() throws Exception {
		ExemploOcorrenciaServico servico = new ExemploOcorrenciaServico();
		ocorrenciaDTO = servico.lerOcorrenciaDTO(TipoOcorrencia.INFORMACOES_EMPREGADOR);
		ocorrenciaDTO.setDataOcorrencia(
				new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
	}

	@Test
	public void deveReceberUmaOcorrencia() {
		Object obj = ocorrenciaResource.receber(ocorrenciaDTO);
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode objectNode = objectMapper.valueToTree(obj);
		assertThat(objectNode.findValue("id").asLong()).isGreaterThan(0);
	}
}
