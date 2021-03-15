package br.jus.tst.esocial.dominio.vinculo;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

public class TreiCap {
	
	@NotNull
	private BigInteger codTreiCap;

	public BigInteger getCodTreiCap() {
		return codTreiCap;
	}

	public void setCodTreiCap(BigInteger codTreiCap) {
		this.codTreiCap = codTreiCap;
	}
}
