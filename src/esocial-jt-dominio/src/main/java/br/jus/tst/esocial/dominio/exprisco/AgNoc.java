package br.jus.tst.esocial.dominio.exprisco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class AgNoc {
    @NotNull
    public String codAgNoc;
    public String dscAgNoc;
    public Byte tpAval;
    public BigDecimal intConc;
    public BigDecimal limTol;
    public Byte unMed;
    public String tecMedicao;

    @Valid
    public EpcEpi epcEpi;

    public String getCodAgNoc() {
        return codAgNoc;
    }

    public void setCodAgNoc(String codAgNoc) {
        this.codAgNoc = codAgNoc;
    }

    public String getDscAgNoc() {
        return dscAgNoc;
    }

    public void setDscAgNoc(String dscAgNoc) {
        this.dscAgNoc = dscAgNoc;
    }

    public Byte getTpAval() {
        return tpAval;
    }

    public void setTpAval(Byte tpAval) {
        this.tpAval = tpAval;
    }

    public BigDecimal getIntConc() {
        return intConc;
    }

    public void setIntConc(BigDecimal intConc) {
        this.intConc = intConc;
    }

    public BigDecimal getLimTol() {
        return limTol;
    }

    public void setLimTol(BigDecimal limTol) {
        this.limTol = limTol;
    }

    public Byte getUnMed() {
        return unMed;
    }

    public void setUnMed(Byte unMed) {
        this.unMed = unMed;
    }

    public String getTecMedicao() {
        return tecMedicao;
    }

    public void setTecMedicao(String tecMedicao) {
        this.tecMedicao = tecMedicao;
    }

    public EpcEpi getEpcEpi() {
        return epcEpi;
    }

    public void setEpcEpi(EpcEpi epcEpi) {
        this.epcEpi = epcEpi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        AgNoc agNoc = (AgNoc) o;

        return new EqualsBuilder().append(codAgNoc, agNoc.codAgNoc).append(dscAgNoc, agNoc.dscAgNoc).append(tpAval, agNoc.tpAval).append(intConc, agNoc.intConc).append(limTol, agNoc.limTol).append(unMed, agNoc.unMed).append(tecMedicao, agNoc.tecMedicao).append(epcEpi, agNoc.epcEpi).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(codAgNoc).append(dscAgNoc).append(tpAval).append(intConc).append(limTol).append(unMed).append(tecMedicao).append(epcEpi).toHashCode();
    }
}
