package br.jus.tst.esocialjt.regras;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RegraVaziaTest {

	@Test
	public void deveSerSempreVerdadeiro() {
		assertThat(new RegraVazia().habilitado(null)).isTrue();
	}

}
