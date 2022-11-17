package br.jus.tst.esocial.dominio.monit;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ExMedOcup {

    public byte tpExameOcup;

    @NotNull
    @Valid
    public Aso aso;

    @Valid
    public RespMonit respMonit;

    public byte getTpExameOcup() {
        return tpExameOcup;
    }

    public void setTpExameOcup(byte tpExameOcup) {
        this.tpExameOcup = tpExameOcup;
    }

    public Aso getAso() {
        return aso;
    }

    public void setAso(Aso aso) {
        this.aso = aso;
    }

    public RespMonit getRespMonit() {
        return respMonit;
    }

    public void setRespMonit(RespMonit respMonit) {
        this.respMonit = respMonit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ExMedOcup exMedOcup = (ExMedOcup) o;

        return new EqualsBuilder().append(tpExameOcup, exMedOcup.tpExameOcup).append(aso, exMedOcup.aso).append(respMonit, exMedOcup.respMonit).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tpExameOcup).append(aso).append(respMonit).toHashCode();
    }
}
