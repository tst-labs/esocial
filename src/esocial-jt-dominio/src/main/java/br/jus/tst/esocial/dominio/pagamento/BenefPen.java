package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class BenefPen {
    @NotEmpty
    private String cpfDep;
    @NotNull
    private BigDecimal vlrDepenSusp;

    public String getCpfDep() {
        return cpfDep;
    }

    public void setCpfDep(String cpfDep) {
        this.cpfDep = cpfDep;
    }

    public BigDecimal getVlrDepenSusp() {
        return vlrDepenSusp;
    }

    public void setVlrDepenSusp(BigDecimal vlrDepenSusp) {
        this.vlrDepenSusp = vlrDepenSusp;
    }
}
