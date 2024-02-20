package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

public class PlanSaude {

    @NotEmpty
    private String cnpjOper;
    private String regANS;
    @NotNull
    private BigDecimal vlrSaudeTit;
    @Valid
    private List<InfoDepSau> infoDepSau;

    public String getCnpjOper() {
        return cnpjOper;
    }

    public void setCnpjOper(String cnpjOper) {
        this.cnpjOper = cnpjOper;
    }

    public String getRegANS() {
        return regANS;
    }

    public void setRegANS(String regANS) {
        this.regANS = regANS;
    }

    public BigDecimal getVlrSaudeTit() {
        return vlrSaudeTit;
    }

    public void setVlrSaudeTit(BigDecimal vlrSaudeTit) {
        this.vlrSaudeTit = vlrSaudeTit;
    }

    public List<InfoDepSau> getInfoDepSau() {
        return infoDepSau;
    }

    public void setInfoDepSau(List<InfoDepSau> infoDepSau) {
        this.infoDepSau = infoDepSau;
    }
}
