package br.jus.tst.esocial.dominio.beneficio.demonstrativovalores;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Item {

	@NotNull
	@Size(min = 1, max = 30)
	private String codRubr;

	@NotNull
	@Size(min = 1, max = 8)
	private String ideTabRubr;

	private BigDecimal vrRubr;

	public String getCodRubr() {
		return codRubr;
	}

	public void setCodRubr(String codRubr) {
		this.codRubr = codRubr;
	}

	public String getIdeTabRubr() {
		return ideTabRubr;
	}

	public void setIdeTabRubr(String ideTabRubr) {
		this.ideTabRubr = ideTabRubr;
	}

	public BigDecimal getVrRubr() {
		return vrRubr;
	}

	public void setVrRubr(BigDecimal vrRubr) {
		this.vrRubr = vrRubr;
	}

}
