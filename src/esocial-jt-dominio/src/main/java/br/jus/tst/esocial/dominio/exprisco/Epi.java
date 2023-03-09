package br.jus.tst.esocial.dominio.exprisco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class Epi {

    @NotNull
    public String docAval;

    @Deprecated
    public String dscEPI;

    public String getDocAval() {
        return docAval;
    }

    public void setDocAval(String docAval) {
        this.docAval = docAval;
    }

    public String getDscEPI() {
        return dscEPI;
    }

    public void setDscEPI(String dscEPI) {
        this.dscEPI = dscEPI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Epi epi = (Epi) o;

        return new EqualsBuilder().append(docAval, epi.docAval).append(dscEPI, epi.dscEPI).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(docAval).append(dscEPI).toHashCode();
    }
}
