package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigDecimal;
import java.util.List;

public class InfoValores {
    private byte indApuracao;
    private BigDecimal vlrNRetido;
    private BigDecimal vlrDepJud;
    private BigDecimal vlrCmpAnoCal;
    private BigDecimal vlrCmpAnoAnt;
    private BigDecimal vlrRendSusp;
    private List<DedSusp> dedSusp;

    public byte getIndApuracao() {
        return indApuracao;
    }

    public void setIndApuracao(byte indApuracao) {
        this.indApuracao = indApuracao;
    }

    public BigDecimal getVlrNRetido() {
        return vlrNRetido;
    }

    public void setVlrNRetido(BigDecimal vlrNRetido) {
        this.vlrNRetido = vlrNRetido;
    }

    public BigDecimal getVlrDepJud() {
        return vlrDepJud;
    }

    public void setVlrDepJud(BigDecimal vlrDepJud) {
        this.vlrDepJud = vlrDepJud;
    }

    public BigDecimal getVlrCmpAnoCal() {
        return vlrCmpAnoCal;
    }

    public void setVlrCmpAnoCal(BigDecimal vlrCmpAnoCal) {
        this.vlrCmpAnoCal = vlrCmpAnoCal;
    }

    public BigDecimal getVlrCmpAnoAnt() {
        return vlrCmpAnoAnt;
    }

    public void setVlrCmpAnoAnt(BigDecimal vlrCmpAnoAnt) {
        this.vlrCmpAnoAnt = vlrCmpAnoAnt;
    }

    public BigDecimal getVlrRendSusp() {
        return vlrRendSusp;
    }

    public void setVlrRendSusp(BigDecimal vlrRendSusp) {
        this.vlrRendSusp = vlrRendSusp;
    }

    public List<DedSusp> getDedSusp() {
        return dedSusp;
    }

    public void setDedSusp(List<DedSusp> dedSusp) {
        this.dedSusp = dedSusp;
    }
}
