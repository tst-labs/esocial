package br.jus.tst.esocial.dominio.basestrabalhador;

import java.math.BigDecimal;
import java.math.BigInteger;

public class InfoCpCalc {
	
	private BigInteger tpCR;
	
	private BigDecimal vrCpSeg;
	
	private BigDecimal vrDescSeg;

	public BigInteger getTpCR() {
		return tpCR;
	}

	public void setTpCR(BigInteger tpCR) {
		this.tpCR = tpCR;
	}

	public BigDecimal getVrCpSeg() {
		return vrCpSeg;
	}

	public void setVrCpSeg(BigDecimal vrCpSeg) {
		this.vrCpSeg = vrCpSeg;
	}

	public BigDecimal getVrDescSeg() {
		return vrDescSeg;
	}

	public void setVrDescSeg(BigDecimal vrDescSeg) {
		this.vrDescSeg = vrDescSeg;
	}
	
}
