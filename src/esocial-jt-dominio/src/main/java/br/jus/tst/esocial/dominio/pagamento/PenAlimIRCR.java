package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class PenAlimIRCR {
    private byte tpRend;
    @NotNull
    private String cpfDep;
    @NotNull
    private BigDecimal vlrDedPenAlim;

    public byte getTpRend() {
        return tpRend;
    }

    public void setTpRend(byte tpRend) {
        this.tpRend = tpRend;
    }

    public String getCpfDep() {
        return cpfDep;
    }

    public void setCpfDep(String cpfDep) {
        this.cpfDep = cpfDep;
    }

    public BigDecimal getVlrDedPenAlim() {
        return vlrDedPenAlim;
    }

    public void setVlrDedPenAlim(BigDecimal vlrDedPenAlim) {
        this.vlrDedPenAlim = vlrDedPenAlim;
    }
}
