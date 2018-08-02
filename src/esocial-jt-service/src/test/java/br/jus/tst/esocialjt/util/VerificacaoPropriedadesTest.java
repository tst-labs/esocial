package br.jus.tst.esocialjt.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class VerificacaoPropriedadesTest {

	private VerificacaoPropriedades verificacaoPropriedades = new VerificacaoPropriedades();

	@Test
	public void deveSerVerdadeiroSeNulo() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(null, String.class);
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeNaoNulo() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault("teste", String.class);
		assertThat(valor).isFalse();
	}
	
	@Test
	public void deveSerVerdadeiroSeZeroLong() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault((long)0, Long.TYPE);
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeNumeroLong() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault((long)1, Long.TYPE);
		assertThat(valor).isFalse();
	}
	
	@Test
	public void deveSerVerdadeiroSeZeroInteiro() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault((int)0, Integer.TYPE);
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeNumeroInteiro() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault((int)1, Integer.TYPE);
		assertThat(valor).isFalse();
	}
	
	@Test
	public void deveSerVerdadeiroSeZeroByte() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault((byte)0, Byte.TYPE);
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeNumeroByte() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault((byte)1, Byte.TYPE);
		assertThat(valor).isFalse();
	}
	
	@Test
	public void deveSerVerdadeiroSeZeroDouble() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(0.0, Double.TYPE);
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeNumeroDouble() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(1.0, Double.TYPE);
		assertThat(valor).isFalse();
	}
	
	
	@Test
	public void deveSerVerdadeiroSeValorFalso() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(false, Boolean.TYPE);
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeValorVerdadeiro() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(true, Boolean.TYPE);
		assertThat(valor).isFalse();
	}
	
	@Test
	public void deveSerVerdadeiroSeListaVazia() {
		List<String> emptyList = Collections.<String>emptyList();
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(emptyList, emptyList.getClass());
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeListaPreenchida() {
		List<String> list = Arrays.asList("teste");
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(list, list.getClass());
		assertThat(valor).isFalse();
	}
	
	@Test
	public void deveSerVerdadeiroSeZeroInteiroObj() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(Integer.valueOf(0), Integer.TYPE);
		assertThat(valor).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeValorInteiroObj() {
		boolean valor = verificacaoPropriedades.isPropriedadeNulaOuDefault(Integer.valueOf(1), Integer.TYPE);
		assertThat(valor).isFalse();
	}

}
