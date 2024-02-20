package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public class DetReemb {
    private byte tpInsc;
    @NotEmpty
    private String nrInsc;
    private BigDecimal vlrReemb;
    private BigDecimal vlrReembAnt;

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

    public BigDecimal getVlrReemb() {
        return vlrReemb;
    }

    public void setVlrReemb(BigDecimal vlrReemb) {
        this.vlrReemb = vlrReemb;
    }

    public BigDecimal getVlrReembAnt() {
        return vlrReembAnt;
    }

    public void setVlrReembAnt(BigDecimal vlrReembAnt) {
        this.vlrReembAnt = vlrReembAnt;
    }
}
