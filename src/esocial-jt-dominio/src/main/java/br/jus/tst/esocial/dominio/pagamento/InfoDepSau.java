package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class InfoDepSau {
    @NotEmpty
    private String cpfDep;
    @NotNull
    private BigDecimal vlrSaudeDep;

    public String getCpfDep() {
        return cpfDep;
    }

    public void setCpfDep(String cpfDep) {
        this.cpfDep = cpfDep;
    }

    public BigDecimal getVlrSaudeDep() {
        return vlrSaudeDep;
    }

    public void setVlrSaudeDep(BigDecimal vlrSaudeDep) {
        this.vlrSaudeDep = vlrSaudeDep;
    }
}
