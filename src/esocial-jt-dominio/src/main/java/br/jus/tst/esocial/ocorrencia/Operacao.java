package br.jus.tst.esocial.ocorrencia;

import java.util.Arrays;

public enum Operacao {

	INCLUSAO("I"), 
	ALTERACAO("A"), 
	EXCLUSAO("E"), 
	RETIFICACAO("R");

	private final String ind;

	private Operacao(String ind) {
		this.ind = ind;
	}
	
	public boolean equalsName(String ind) {
		return this.ind.equals(ind);
	}
	
	@Override
	public String toString() {
		return this.ind;
	}

	public static Operacao getOperacao(String ind) {
		return Arrays.asList(Operacao.values()).stream()
				.filter(op -> op.ind.equalsIgnoreCase(ind))
				.findFirst()
				.orElse(null);
	}

}








