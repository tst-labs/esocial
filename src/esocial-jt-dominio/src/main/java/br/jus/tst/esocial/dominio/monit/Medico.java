package br.jus.tst.esocial.dominio.monit;

import br.jus.tst.esocial.dominio.enums.UF;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class Medico {

    @NotNull
    public String nmMed;
    @NotNull
    public String nrCRM;
    @NotNull
    public UF ufCRM;

    public String getNmMed() {
        return nmMed;
    }

    public void setNmMed(String nmMed) {
        this.nmMed = nmMed;
    }

    public String getNrCRM() {
        return nrCRM;
    }

    public void setNrCRM(String nrCRM) {
        this.nrCRM = nrCRM;
    }

    public UF getUfCRM() {
        return ufCRM;
    }

    public void setUfCRM(UF ufCRM) {
        this.ufCRM = ufCRM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Medico medico = (Medico) o;

        return new EqualsBuilder().append(nmMed, medico.nmMed).append(nrCRM, medico.nrCRM).append(ufCRM, medico.ufCRM).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(nmMed).append(nrCRM).append(ufCRM).toHashCode();
    }
}
