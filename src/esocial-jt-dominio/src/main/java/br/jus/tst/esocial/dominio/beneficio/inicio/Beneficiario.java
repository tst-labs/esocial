package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

public class Beneficiario {
	
	@CPF
	@NotNull
	private String cpfBenef;
	
	private String matricula;
	
	@CNPJ
	private String cnpjOrigem;

	public String getCpfBenef() {
		return cpfBenef;
	}

	public void setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCnpjOrigem() {
		return cnpjOrigem;
	}

	public void setCnpjOrigem(String cnpjOrigem) {
		this.cnpjOrigem = cnpjOrigem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpjOrigem, cpfBenef, matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beneficiario other = (Beneficiario) obj;
		return Objects.equals(cnpjOrigem, other.cnpjOrigem) && Objects.equals(cpfBenef, other.cpfBenef)
				&& Objects.equals(matricula, other.matricula);
	}
	
}
