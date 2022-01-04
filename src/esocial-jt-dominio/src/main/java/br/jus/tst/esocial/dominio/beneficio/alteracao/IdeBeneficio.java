package br.jus.tst.esocial.dominio.beneficio.alteracao;

import javax.validation.constraints.NotNull;

public class IdeBeneficio {

	@NotNull
	private String cpfBenef;

	@NotNull
	private String nrBeneficio;

	public String getCpfBenef() {
		return cpfBenef;
	}

	public void setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
	}

	public String getNrBeneficio() {
		return nrBeneficio;
	}

	public void setNrBeneficio(String nrBeneficio) {
		this.nrBeneficio = nrBeneficio;
	}

}
