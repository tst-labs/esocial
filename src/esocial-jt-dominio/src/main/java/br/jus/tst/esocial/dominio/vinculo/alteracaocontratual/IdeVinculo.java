package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CPF;

public class IdeVinculo {

    @NotNull
	@CPF
    private String cpfTrab;

    @NotNull
	@Size(min = 1, max = 11)
    private String nisTrab;

    @NotNull
	@Size(min = 1, max = 30)
    private String matricula;

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

    @Override
    public boolean equals(Object other) {
		if (!(other instanceof IdeVinculo)) {
			return false;
		}
		IdeVinculo castOther = (IdeVinculo) other;
		return new EqualsBuilder().append(matricula, castOther.matricula).isEquals();
    }

    @Override
    public int hashCode() {
		return new HashCodeBuilder().append(matricula).toHashCode();
    }
}