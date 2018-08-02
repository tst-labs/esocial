package br.jus.tst.esocial.dominio.tabela.rubrica;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

public class IdeProcessoIRRF {
	
	@NotNull
	private String nrProc;
	
	@NotNull
	private BigInteger codSusp;

	public String getNrProc() {
		return nrProc;
	}

	public IdeProcessoIRRF setNrProc(String nrProc) {
		this.nrProc = nrProc;
		return this;
	}

	public BigInteger getCodSusp() {
		return codSusp;
	}

	public IdeProcessoIRRF setCodSusp(BigInteger codSusp) {
		this.codSusp = codSusp;
		return this;
	}

}
