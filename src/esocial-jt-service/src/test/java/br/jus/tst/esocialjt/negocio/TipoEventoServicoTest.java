package br.jus.tst.esocialjt.negocio;

import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;

public class TipoEventoServicoTest {

	private TipoEventoServico servico = new TipoEventoServico();
	
	@Test
	public void deveTerMapeamentoParaTodosTiposOcorrencia() {
		Map<TipoOcorrencia, Integer> tiposEventoEsocial = servico.mapearTipoEventoEsocial();
		
		SoftAssertions soft = new SoftAssertions();
		
		for (TipoOcorrencia tipo : TipoOcorrencia.values()) {
			soft.assertThat(tiposEventoEsocial.get(tipo)).as(tipo.toString()).isNotNull();
		}
		
		soft.assertAll();
	}

}
