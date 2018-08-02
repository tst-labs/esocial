package br.jus.tst.esocialjt.producaorestrita;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocial.validacao.ValidadorCampos;

public class ModeloTest {

	@Test
	public void deveTerValoresValidos() {
		Modelo modelo = new Modelo();
		InformacoesEmpregador informacoesEmpregador = modelo.obterDadosLimparProducaoRestrita("00509968000148");
		
		List<String> erros = ValidadorCampos.validarFormatado(informacoesEmpregador.getInfoEmpregador());
		String errosMsg = erros.stream().reduce("Erros de validação de campos:", (t, u) -> t + "\n" + u);
		assertThat(erros).overridingErrorMessage(errosMsg).isEmpty();
	}

}
