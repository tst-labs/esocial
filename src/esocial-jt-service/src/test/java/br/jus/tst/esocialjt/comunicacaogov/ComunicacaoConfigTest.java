package br.jus.tst.esocialjt.comunicacaogov;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocialjt.TipoAmbiente;
import br.jus.tst.esocialjt.certificado.Certificado;

public class ComunicacaoConfigTest {

	@Test
	public void deveConfigurarDadosProducaoRestrita() {
		ComunicacaoConfig comunicacaoConfig = new ComunicacaoConfig();
		comunicacaoConfig.ambiente = TipoAmbiente.PRODUCAO_RESTRITA;
		comunicacaoConfig.certificado = new Certificado(null, null, null, null, null, null);
		
		ComunicacaoServico servico = comunicacaoConfig.criarComunicacaoServico(null);

		assertThat(servico.getUrlEnviarLoteGov()).contains("producaorestrita");
		assertThat(servico.getUrlConsultaLoteGov()).contains("producaorestrita");
	}
	
	@Test
	public void deveConfigurarDadosProducao() {
		ComunicacaoConfig comunicacaoConfig = new ComunicacaoConfig();
		comunicacaoConfig.ambiente = TipoAmbiente.PRODUCAO;
		comunicacaoConfig.certificado = new Certificado(null, null, null, null, null, null);
		
		ComunicacaoServico servico = comunicacaoConfig.criarComunicacaoServico(null);
		
		assertThat(servico.getUrlEnviarLoteGov()).contains("webservices.envio.esocial");
		assertThat(servico.getUrlConsultaLoteGov()).contains("webservices.consulta.esocial");
	}

}
