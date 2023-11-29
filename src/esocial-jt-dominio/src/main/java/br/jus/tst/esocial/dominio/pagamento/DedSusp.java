package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

public class DedSusp {
    private byte indTpDeducao;
    private BigDecimal vlrDedSusp;
    private String cnpjEntidPC;
    private BigDecimal vlrPatrocFunp;
    @Valid
    private List<BenefPen> benefPen;

    public byte getIndTpDeducao() {
        return indTpDeducao;
    }

    public void setIndTpDeducao(byte indTpDeducao) {
        this.indTpDeducao = indTpDeducao;
    }

    public BigDecimal getVlrDedSusp() {
        return vlrDedSusp;
    }

    public void setVlrDedSusp(BigDecimal vlrDedSusp) {
        this.vlrDedSusp = vlrDedSusp;
    }

    public String getCnpjEntidPC() {
        return cnpjEntidPC;
    }

    public void setCnpjEntidPC(String cnpjEntidPC) {
        this.cnpjEntidPC = cnpjEntidPC;
    }

    public BigDecimal getVlrPatrocFunp() {
        return vlrPatrocFunp;
    }

    public void setVlrPatrocFunp(BigDecimal vlrPatrocFunp) {
        this.vlrPatrocFunp = vlrPatrocFunp;
    }

    public List<BenefPen> getBenefPen() {
        return benefPen;
    }

    public void setBenefPen(List<BenefPen> benefPen) {
        this.benefPen = benefPen;
    }
}
