package br.jus.tst.esocial.dominio.cat;

import br.jus.tst.esocial.dominio.enums.UF;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class Emitente {
    @NotNull
    public String nmEmit;
    public byte ideOC;
    @NotNull
    public String nrOC;
    public UF ufOC;

    public String getNmEmit() {
        return nmEmit;
    }

    public void setNmEmit(String nmEmit) {
        this.nmEmit = nmEmit;
    }

    public byte getIdeOC() {
        return ideOC;
    }

    public void setIdeOC(byte ideOC) {
        this.ideOC = ideOC;
    }

    public String getNrOC() {
        return nrOC;
    }

    public void setNrOC(String nrOC) {
        this.nrOC = nrOC;
    }

    public UF getUfOC() {
        return ufOC;
    }

    public void setUfOC(UF ufOC) {
        this.ufOC = ufOC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Emitente emitente = (Emitente) o;

        return new EqualsBuilder().append(ideOC, emitente.ideOC).append(nmEmit, emitente.nmEmit).append(nrOC, emitente.nrOC).append(ufOC, emitente.ufOC).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(nmEmit).append(ideOC).append(nrOC).append(ufOC).toHashCode();
    }
}
