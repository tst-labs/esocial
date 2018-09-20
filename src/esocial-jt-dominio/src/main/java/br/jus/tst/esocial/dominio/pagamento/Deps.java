package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class Deps {
	
	@NotNull
	private BigDecimal vrDedDep;

	public BigDecimal getVrDedDep() {
		return vrDedDep;
	}

	public void setVrDedDep(BigDecimal vrDedDep) {
		this.vrDedDep = vrDedDep;
	}
	
}
