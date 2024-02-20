package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class DedDepen {

    private byte tpRend;
    @NotEmpty
    private String cpfDep;
    @NotNull
    private BigDecimal vlrDedDep;

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

    public BigDecimal getVlrDedDep() {
        return vlrDedDep;
    }

    public void setVlrDedDep(BigDecimal vlrDedDep) {
        this.vlrDedDep = vlrDedDep;
    }
}
