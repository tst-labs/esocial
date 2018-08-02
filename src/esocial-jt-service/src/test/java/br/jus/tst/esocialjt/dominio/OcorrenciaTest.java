package br.jus.tst.esocialjt.dominio;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.ocorrencia.dados.TabelaFuncao;

public class OcorrenciaTest {

	@Test
	public void deveCriarJsonAoAtribuirDadosOcorrencia() throws JsonProcessingException, IOException {
		TabelaFuncao tabelaFuncao = new TabelaFuncao();
		tabelaFuncao.setIdeEmpregador(new IdeEmpregador().setNrInsc("1"));
		Ocorrencia ocorrencia = new Ocorrencia();
		
		assertThat(ocorrencia.getTxtDadosOcorrencia()).isNull();
		
		ocorrencia.setDadosOcorrencia(tabelaFuncao);
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(ocorrencia.getTxtDadosOcorrencia());

		assertThat(jsonNode.has("ideEmpregador")).isTrue();
		
	}
	
	@Test
	public void deveCriarDadosOcorrenciaAoAtribuirJson() {
		String txtDadosOcorrencia = "{\"tipo\":\".TabelaFuncao\",\"ideEmpregador\":{\"tpInsc\":null,\"nrInsc\":\"1\"},\"infoFuncao\":null}";
		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setTxtDadosOcorrencia(txtDadosOcorrencia);
		
		assertThat(ocorrencia.getDadosOcorrencia().getIdeEmpregador().getNrInsc()).isEqualTo("1");
	}
	
	@Test
	public void naoDeveOcorrerDependenciaCircularJson() throws IOException {
		Ocorrencia ocorrencia = new Ocorrencia().setId(1l).setReferencia("1");
		Evento evento = new Evento().setId(1l);
		
		ocorrencia.setEvento(evento);
		evento.setOcorrencia(ocorrencia);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String ocorrenciaJson = objectMapper.writeValueAsString(ocorrencia);
		JsonNode jsonNode = objectMapper.readTree(ocorrenciaJson);
		assertThat(jsonNode.has("evento")).isTrue();
	}

}
