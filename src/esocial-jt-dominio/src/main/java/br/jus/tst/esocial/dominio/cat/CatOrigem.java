package br.jus.tst.esocial.dominio.cat;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class CatOrigem {
    @NotNull
    public String nrRecCatOrig;

    public String getNrRecCatOrig() {
        return nrRecCatOrig;
    }

    public void setNrRecCatOrig(String nrRecCatOrig) {
        this.nrRecCatOrig = nrRecCatOrig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CatOrigem catOrigem = (CatOrigem) o;

        return new EqualsBuilder().append(nrRecCatOrig, catOrigem.nrRecCatOrig).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(nrRecCatOrig).toHashCode();
    }
}
