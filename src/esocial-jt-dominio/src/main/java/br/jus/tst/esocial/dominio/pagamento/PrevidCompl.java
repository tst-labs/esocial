package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class PrevidCompl {

    private byte tpPrev;
    @NotNull
    private String cnpjEntidPC;
    @NotNull
    private BigDecimal vlrDedPC;
    private BigDecimal vlrPatrocFunp;

    public byte getTpPrev() {
        return tpPrev;
    }

    public void setTpPrev(byte tpPrev) {
        this.tpPrev = tpPrev;
    }

    public String getCnpjEntidPC() {
        return cnpjEntidPC;
    }

    public void setCnpjEntidPC(String cnpjEntidPC) {
        this.cnpjEntidPC = cnpjEntidPC;
    }

    public BigDecimal getVlrDedPC() {
        return vlrDedPC;
    }

    public void setVlrDedPC(BigDecimal vlrDedPC) {
        this.vlrDedPC = vlrDedPC;
    }

    public BigDecimal getVlrPatrocFunp() {
        return vlrPatrocFunp;
    }

    public void setVlrPatrocFunp(BigDecimal vlrPatrocFunp) {
        this.vlrPatrocFunp = vlrPatrocFunp;
    }
}
