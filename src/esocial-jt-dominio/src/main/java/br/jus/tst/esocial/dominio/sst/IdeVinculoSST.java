package br.jus.tst.esocial.dominio.sst;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigInteger;

public class IdeVinculoSST {
    public String cpfTrab;
    public String matricula;
    public BigInteger codCateg;

    public String getCpfTrab() {
        return cpfTrab;
    }

    public void setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
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
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        IdeVinculoSST that = (IdeVinculoSST) o;

        return new EqualsBuilder().append(cpfTrab, that.cpfTrab).append(matricula, that.matricula).append(codCateg, that.codCateg).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(cpfTrab).append(matricula).append(codCateg).toHashCode();
    }
}
