package br.jus.tst.esocial.dominio.afasttemp;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CPF;

import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;

public class IdeVinculo {
   
	@NotNull
	@CPF
    private String cpfTrab;

	@Size(max = 11)
    private String nisTrab;

	@Size(min = 1, max = 30)
    private String matricula;
	
	private BigInteger codCateg;

	public String getCpfTrab() {
		return cpfTrab;
	}

	public void setCpfTrab(String cpfTrab) {
		this.cpfTrab = cpfTrab;
	}

	public String getNisTrab() {
		return nisTrab;
	}

	public void setNisTrab(String nisTrab) {
		this.nisTrab = nisTrab;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
		this.codCateg = codCateg;
	}
	
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof AfastTemp)) {
			return false;
		}
		IdeVinculo castOther = (IdeVinculo) other;
		return new EqualsBuilder()
				.append(cpfTrab, castOther.cpfTrab)
				.append(nisTrab, castOther.nisTrab)
				.append(matricula, castOther.matricula)
				.append(codCateg, castOther.codCateg)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(cpfTrab)
				.append(nisTrab)
				.append(matricula)
				.append(codCateg)
				.toHashCode();
	}
}
