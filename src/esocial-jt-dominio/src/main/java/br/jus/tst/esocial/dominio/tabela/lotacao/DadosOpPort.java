package br.jus.tst.esocial.dominio.tabela.lotacao;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class DadosOpPort {
	private byte aliqRat;
    
	@NotNull
	private BigDecimal fap;

	public byte getAliqRat() {
		return aliqRat;
	}

	public void setAliqRat(byte aliqRat) {
		this.aliqRat = aliqRat;
	}

	public BigDecimal getFap() {
		return fap;
	}

	public void setFap(BigDecimal fap) {
		this.fap = fap;
	}
}
