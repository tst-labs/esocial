package br.jus.tst.esocialjt.ocorrencia;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;

public class ExemploOcorrenciaServicoTest {

	@Test
	public void deveLerDTOExemploParaTodosTiposOcorrencia() throws Exception {
		ExemploOcorrenciaServico exemploServico = new ExemploOcorrenciaServico();
		SoftAssertions soft = new SoftAssertions();

		for (TipoOcorrencia tipo : TipoOcorrencia.values()) {
			soft.assertThat(exemploServico.lerOcorrenciaDTO(tipo)).isNotNull();
		}

		soft.assertAll();
	}

	@Test
	public void deveLerOcorrenciaExemploParaTodosTiposOcorrencia() throws Exception {
		ExemploOcorrenciaServico exemploServico = new ExemploOcorrenciaServico();
		SoftAssertions soft = new SoftAssertions();

		for (TipoOcorrencia tipo : TipoOcorrencia.values()) {
			soft.assertThat(exemploServico.lerOcorrencia(tipo)).isNotNull();
		}

		soft.assertAll();
	}
}
