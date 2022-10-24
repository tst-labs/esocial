package br.jus.tst.esocial.dominio.exprisco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class InfoAtiv {

    @NotNull
    public String dscAtivDes;

    public String getDscAtivDes() {
        return dscAtivDes;
    }

    public void setDscAtivDes(String dscAtivDes) {
        this.dscAtivDes = dscAtivDes;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(dscAtivDes).toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        InfoAtiv infoAtiv = (InfoAtiv) o;

        return new EqualsBuilder().append(dscAtivDes, infoAtiv.dscAtivDes).isEquals();
    }
}
