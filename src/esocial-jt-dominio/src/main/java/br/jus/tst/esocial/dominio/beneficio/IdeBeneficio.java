package br.jus.tst.esocial.dominio.beneficio;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(cpfBenef, nrBeneficio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdeBeneficio other = (IdeBeneficio) obj;
		return Objects.equals(cpfBenef, other.cpfBenef) && Objects.equals(nrBeneficio, other.nrBeneficio);
	}

}
