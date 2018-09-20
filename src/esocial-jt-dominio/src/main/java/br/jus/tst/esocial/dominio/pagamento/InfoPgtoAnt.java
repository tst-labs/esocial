package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class InfoPgtoAnt {
	
	@NotNull
	@Pattern(regexp="\\d{2}")
	private String tpBcIRRF;

	@NotNull
	private BigDecimal vrBcIRRF;

	public String getTpBcIRRF() {
		return tpBcIRRF;
	}

	public void setTpBcIRRF(String tpBcIRRF) {
		this.tpBcIRRF = tpBcIRRF;
	}

	public BigDecimal getVrBcIRRF() {
		return vrBcIRRF;
	}

	public void setVrBcIRRF(BigDecimal vrBcIRRF) {
		this.vrBcIRRF = vrBcIRRF;
	}
	
}
