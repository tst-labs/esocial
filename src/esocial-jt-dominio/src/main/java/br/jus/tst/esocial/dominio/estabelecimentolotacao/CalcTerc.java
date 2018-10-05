package br.jus.tst.esocial.dominio.estabelecimentolotacao;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CalcTerc {

	private BigInteger tpCR;
	
	private BigDecimal vrCsSegTerc;
	
	private BigDecimal vrDescTerc;

	public BigInteger getTpCR() {
		return tpCR;
	}

	public void setTpCR(BigInteger tpCR) {
		this.tpCR = tpCR;
	}

	public BigDecimal getVrCsSegTerc() {
		return vrCsSegTerc;
	}

	public void setVrCsSegTerc(BigDecimal vrCsSegTerc) {
		this.vrCsSegTerc = vrCsSegTerc;
	}

	public BigDecimal getVrDescTerc() {
		return vrDescTerc;
	}

	public void setVrDescTerc(BigDecimal vrDescTerc) {
		this.vrDescTerc = vrDescTerc;
	}
	
}
