package br.jus.tst.esocialjt.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SequencialTest {

	@Test
	public void naoDeveGerarNumeroMaiorQue99999() {
		Sequencial sequencial = new Sequencial();
		for(long i=0; i<=100001; i++) {
			assertThat(sequencial.proximo()).isLessThan(100000);
		}
	}

}
