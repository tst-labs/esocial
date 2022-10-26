package br.jus.tst.esocial.dominio.exprisco;

import br.jus.tst.esocial.dominio.enums.UF;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class RespReg {
    @NotNull
    public String cpfResp;
    public Byte ideOC;
    public String dscOC;
    public String nrOC;
    public UF ufOC;

    public String getCpfResp() {
        return cpfResp;
    }

    public void setCpfResp(String cpfResp) {
        this.cpfResp = cpfResp;
    }

    public Byte getIdeOC() {
        return ideOC;
    }

    public void setIdeOC(Byte ideOC) {
        this.ideOC = ideOC;
    }

    public String getDscOC() {
        return dscOC;
    }

    public void setDscOC(String dscOC) {
        this.dscOC = dscOC;
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

        RespReg respReg = (RespReg) o;

        return new EqualsBuilder().append(cpfResp, respReg.cpfResp).append(ideOC, respReg.ideOC).append(dscOC, respReg.dscOC).append(nrOC, respReg.nrOC).append(ufOC, respReg.ufOC).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(cpfResp).append(ideOC).append(dscOC).append(nrOC).append(ufOC).toHashCode();
    }
}
