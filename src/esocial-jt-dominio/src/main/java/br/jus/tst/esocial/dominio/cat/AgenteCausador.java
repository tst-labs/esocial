package br.jus.tst.esocial.dominio.cat;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

public class AgenteCausador {
    @NotNull
    public BigInteger codAgntCausador;

    public BigInteger getCodAgntCausador() {
        return codAgntCausador;
    }

    public void setCodAgntCausador(BigInteger codAgntCausador) {
        this.codAgntCausador = codAgntCausador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        AgenteCausador that = (AgenteCausador) o;

        return new EqualsBuilder().append(codAgntCausador, that.codAgntCausador).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(codAgntCausador).toHashCode();
    }
}
