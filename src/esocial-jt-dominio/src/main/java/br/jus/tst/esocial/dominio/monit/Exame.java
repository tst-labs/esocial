package br.jus.tst.esocial.dominio.monit;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Calendar;

public class Exame {
    @NotNull
    public Calendar dtExm;
    @NotNull
    public BigInteger procRealizado;
    public String obsProc;
    public Byte ordExame;
    public Byte indResult;

    public Calendar getDtExm() {
        return dtExm;
    }

    public void setDtExm(Calendar dtExm) {
        this.dtExm = dtExm;
    }

    public BigInteger getProcRealizado() {
        return procRealizado;
    }

    public void setProcRealizado(BigInteger procRealizado) {
        this.procRealizado = procRealizado;
    }

    public String getObsProc() {
        return obsProc;
    }

    public void setObsProc(String obsProc) {
        this.obsProc = obsProc;
    }

    public Byte getOrdExame() {
        return ordExame;
    }

    public void setOrdExame(Byte ordExame) {
        this.ordExame = ordExame;
    }

    public Byte getIndResult() {
        return indResult;
    }

    public void setIndResult(Byte indResult) {
        this.indResult = indResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Exame exame = (Exame) o;

        return new EqualsBuilder().append(dtExm, exame.dtExm).append(procRealizado, exame.procRealizado).append(obsProc, exame.obsProc).append(ordExame, exame.ordExame).append(indResult, exame.indResult).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(dtExm).append(procRealizado).append(obsProc).append(ordExame).append(indResult).toHashCode();
    }
}
