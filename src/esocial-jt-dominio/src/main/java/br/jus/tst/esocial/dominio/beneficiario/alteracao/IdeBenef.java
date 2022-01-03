package br.jus.tst.esocial.dominio.beneficiario.alteracao;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class IdeBenef {

	@NotNull
	@Pattern(regexp="\\d{11}")
	private String cpfBenef;

	public String getCpfBenef() {
		return cpfBenef;
	}

	public void setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfBenef);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdeBenef other = (IdeBenef) obj;
		return Objects.equals(cpfBenef, other.cpfBenef);
	}
}
