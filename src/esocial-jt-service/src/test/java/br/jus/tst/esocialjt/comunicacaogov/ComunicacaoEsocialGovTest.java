package br.jus.tst.esocialjt.comunicacaogov;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.any;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.oxm.XmlMappingException;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

public class ComunicacaoEsocialGovTest {
	
	private ComunicacaoEsocialGov comunicacao;
	
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(8189); 
	
	@Before
	public void init() throws XmlMappingException, IOException {
		comunicacao = new ComunicacaoEsocialGov();
		String retornoEnvio = LeitorXML.lerRetornoEnvio("sucesso.xml");
		String retornoProcessamento = LeitorXML.lerRetornoProcessamento("sem-erros-processamento.xml");
		
		String retornoEnvioLocal = retornoEnvio.replace("1.2.201711.0000000000000037150", "LOCAL");
		String retornoProcessamentoLocal = retornoProcessamento.replace("1.2.201711.0000000000000062303", "LOCAL");
		ComunicacaoServico comunicacaoServicoMock = mock(ComunicacaoServico.class);
		when(comunicacaoServicoMock.enviarLote(anyString())).thenReturn(retornoEnvioLocal);
		when(comunicacaoServicoMock.consultarLote(anyString())).thenReturn(retornoProcessamentoLocal);
		comunicacao.servico = comunicacaoServicoMock;
		
		String retornoEnvioRemoto = retornoEnvio.replace("1.2.201711.0000000000000037150", "REMOTO");
		String retornoProcessamentoRemoto = retornoProcessamento.replace("1.2.201711.0000000000000062303", "REMOTO");
		stubFor(any(urlEqualTo("/enviar"))
				.willReturn(aResponse().withStatus(200)
						.withHeader("Content-Type", "text/xml")
						.withBody(retornoEnvioRemoto)));
		
		stubFor(any(urlEqualTo("/consultar"))
				.willReturn(aResponse().withStatus(200)
						.withHeader("Content-Type", "text/xml")
						.withBody(retornoProcessamentoRemoto)));
	}

	@Test
	public void deveUsarEnvioRemotoSeHaUrlServicoEnvio() throws ComunicacaoEsocialGovException {
		comunicacao.urlServicoEnvioLote = "http://localhost:8189/enviar";
		RetornoEnvio retornoEnvio = comunicacao.enviarLoteEventos("");
		assertThat(retornoEnvio.getProtocolo()).isEqualTo("REMOTO");
	}
	
	@Test
	public void deveUsarEnvioLocalSeNaoHaUrlServicoEnvio() throws ComunicacaoEsocialGovException {
		comunicacao.urlServicoEnvioLote = null;
		RetornoEnvio retornoEnvio = comunicacao.enviarLoteEventos("");
		assertThat(retornoEnvio.getProtocolo()).isEqualTo("LOCAL");
	}
	
	@Test
	public void deveUsarConsultaRemotaSeHaUrlServicoConsulta() throws ComunicacaoEsocialGovException {
		comunicacao.urlServicoConsultaProcessamento = "http://localhost:8189/consultar";
		RetornoProcessamento retornoProcessamento = comunicacao.consultarLoteEventos("");
		assertThat(retornoProcessamento.getRetornoLote().getProtocolo()).isEqualTo("REMOTO");
	}
	
	@Test
	public void deveUsarConsultaLocalSeNaoHaUrlServicoConsulta() throws ComunicacaoEsocialGovException {
		comunicacao.urlServicoConsultaProcessamento = null;
		RetornoProcessamento retornoProcessamento = comunicacao.consultarLoteEventos("");
		assertThat(retornoProcessamento.getRetornoLote().getProtocolo()).isEqualTo("LOCAL");
	}
}
