package br.jus.tst.esocial.dominio.cat;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

public class ParteAtingida {
    @NotNull
    public BigInteger codParteAting;
    public byte lateralidade;

    public BigInteger getCodParteAting() {
        return codParteAting;
    }

    public void setCodParteAting(BigInteger codParteAting) {
        this.codParteAting = codParteAting;
    }

    public byte getLateralidade() {
        return lateralidade;
    }

    public void setLateralidade(byte lateralidade) {
        this.lateralidade = lateralidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ParteAtingida that = (ParteAtingida) o;

        return new EqualsBuilder().append(lateralidade, that.lateralidade).append(codParteAting, that.codParteAting).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(codParteAting).append(lateralidade).toHashCode();
    }
}
