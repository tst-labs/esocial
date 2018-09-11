package br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CPF;

public class IdeTrabalhador {

	@NotNull
	@CPF
	private String cpfTrab;

	public String getCpfTrab() {
		return cpfTrab;
	}

	public void setCpfTrab(String cpfTrab) {
		this.cpfTrab = cpfTrab;
	}
	
    @Override
    public boolean equals(Object other) {
		if (!(other instanceof IdeTrabalhador)) {
			return false;
		}
		IdeTrabalhador castOther = (IdeTrabalhador) other;
		return new EqualsBuilder().append(cpfTrab, castOther.cpfTrab).isEquals();
    }

    @Override
    public int hashCode() {
		return new HashCodeBuilder().append(cpfTrab).toHashCode();
    }	
}
