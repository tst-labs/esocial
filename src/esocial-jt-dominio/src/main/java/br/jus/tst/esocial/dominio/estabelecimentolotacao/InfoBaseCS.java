package br.jus.tst.esocial.dominio.estabelecimentolotacao;

import java.math.BigDecimal;

public class InfoBaseCS {

	private byte ind13;
	
	private byte tpValor;
	
	private BigDecimal valor;

	public byte getInd13() {
		return ind13;
	}

	public void setInd13(byte ind13) {
		this.ind13 = ind13;
	}

	public byte getTpValor() {
		return tpValor;
	}

	public void setTpValor(byte tpValor) {
		this.tpValor = tpValor;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
