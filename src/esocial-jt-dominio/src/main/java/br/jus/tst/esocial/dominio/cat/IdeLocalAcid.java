package br.jus.tst.esocial.dominio.cat;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class IdeLocalAcid {
    public byte tpInsc;

    @NotNull
    public String nrInsc;

    public byte getTpInsc() {
        return tpInsc;
    }

    public void setTpInsc(byte tpInsc) {
        this.tpInsc = tpInsc;
    }

    public String getNrInsc() {
        return nrInsc;
    }

    public void setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        IdeLocalAcid that = (IdeLocalAcid) o;

        return new EqualsBuilder().append(tpInsc, that.tpInsc).append(nrInsc, that.nrInsc).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tpInsc).append(nrInsc).toHashCode();
    }
}
