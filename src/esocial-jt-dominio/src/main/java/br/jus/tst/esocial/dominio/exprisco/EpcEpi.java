package br.jus.tst.esocial.dominio.exprisco;

import br.jus.tst.esocial.dominio.enums.SimNao;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class EpcEpi {
    @NotNull
    public Byte utilizEPC;
    public SimNao eficEpc;
    @NotNull
    public Byte utilizEPI;
    public SimNao eficEpi;

    @Valid
    public List<Epi> epi;

    @Valid
    public EpiCompl epiCompl;

    public Byte getUtilizEPC() {
        return utilizEPC;
    }

    public void setUtilizEPC(Byte utilizEPC) {
        this.utilizEPC = utilizEPC;
    }

    public SimNao getEficEpc() {
        return eficEpc;
    }

    public void setEficEpc(SimNao eficEpc) {
        this.eficEpc = eficEpc;
    }

    public Byte getUtilizEPI() {
        return utilizEPI;
    }

    public void setUtilizEPI(Byte utilizEPI) {
        this.utilizEPI = utilizEPI;
    }

    public SimNao getEficEpi() {
        return eficEpi;
    }

    public void setEficEpi(SimNao eficEpi) {
        this.eficEpi = eficEpi;
    }

    public List<Epi> getEpi() {
        return epi;
    }

    public void setEpi(List<Epi> epi) {
        this.epi = epi;
    }

    public EpiCompl getEpiCompl() {
        return epiCompl;
    }

    public void setEpiCompl(EpiCompl epiCompl) {
        this.epiCompl = epiCompl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        EpcEpi epcEpi = (EpcEpi) o;

        return new EqualsBuilder().append(utilizEPC, epcEpi.utilizEPC).append(eficEpc, epcEpi.eficEpc).append(utilizEPI, epcEpi.utilizEPI).append(eficEpi, epcEpi.eficEpi).append(epi, epcEpi.epi).append(epiCompl, epcEpi.epiCompl).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(utilizEPC).append(eficEpc).append(utilizEPI).append(eficEpi).append(epi).append(epiCompl).toHashCode();
    }
}
