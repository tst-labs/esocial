package br.jus.tst.esocial.dominio.exprisco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public class InfoAmb {
    @NotNull
    public Byte localAmb;

    @NotNull
    public String dscSetor;

    @NotNull
    public Byte tpInsc;

    @NotNull
    public String nrInsc;

    public Byte getLocalAmb() {
        return localAmb;
    }

    public void setLocalAmb(Byte localAmb) {
        this.localAmb = localAmb;
    }

    public String getDscSetor() {
        return dscSetor;
    }

    public void setDscSetor(String dscSetor) {
        this.dscSetor = dscSetor;
    }

    public Byte getTpInsc() {
        return tpInsc;
    }

    public void setTpInsc(Byte tpInsc) {
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

        InfoAmb infoAmb = (InfoAmb) o;

        return new EqualsBuilder().append(localAmb, infoAmb.localAmb).append(dscSetor, infoAmb.dscSetor).append(tpInsc, infoAmb.tpInsc).append(nrInsc, infoAmb.nrInsc).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(localAmb).append(dscSetor).append(tpInsc).append(nrInsc).toHashCode();
    }
}
