package br.jus.tst.esocial.dominio.monit;

import br.jus.tst.esocial.dominio.enums.UF;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class RespMonit {
    public String cpfResp;
    @NotNull
    public String nmResp;
    @NotNull
    public String nrCRM;
    @NotNull
    public UF ufCRM;

    public String getCpfResp() {
        return cpfResp;
    }

    public void setCpfResp(String cpfResp) {
        this.cpfResp = cpfResp;
    }

    public String getNmResp() {
        return nmResp;
    }

    public void setNmResp(String nmResp) {
        this.nmResp = nmResp;
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

        RespMonit respMonit = (RespMonit) o;

        return new EqualsBuilder().append(cpfResp, respMonit.cpfResp).append(nmResp, respMonit.nmResp).append(nrCRM, respMonit.nrCRM).append(ufCRM, respMonit.ufCRM).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(cpfResp).append(nmResp).append(nrCRM).append(ufCRM).toHashCode();
    }
}
