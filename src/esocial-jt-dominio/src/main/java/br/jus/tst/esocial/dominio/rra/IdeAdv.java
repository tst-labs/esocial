package br.jus.tst.esocial.dominio.rra;

import java.math.BigDecimal;

public class IdeAdv {
    public byte tpInsc;
    public String nrInsc;
    public BigDecimal vlrAdv;

    public byte getTpInsc() {
        return tpInsc;
    }

    public void setTpInsc(byte tpInsc) {
        this.tpInsc = tpInsc;
    }

    public String getNrInsc() {
        return nrInsc;
    }

    public void setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
    }

    public BigDecimal getVlrAdv() {
        return vlrAdv;
    }

    public void setVlrAdv(BigDecimal vlrAdv) {
        this.vlrAdv = vlrAdv;
    }
}
