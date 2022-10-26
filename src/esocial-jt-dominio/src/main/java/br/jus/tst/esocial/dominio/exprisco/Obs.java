package br.jus.tst.esocial.dominio.exprisco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class Obs {

    @NotNull
    public String obsCompl;

    public String getObsCompl() {
        return obsCompl;
    }

    public void setObsCompl(String obsCompl) {
        this.obsCompl = obsCompl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Obs obs = (Obs) o;

        return new EqualsBuilder().append(obsCompl, obs.obsCompl).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(obsCompl).toHashCode();
    }
}
