package br.jus.tst.esocial.dominio.rra;

import java.math.BigDecimal;
import java.util.List;

public class InfoRRA {
    public byte tpProcRRA;
    public String nrProcRRA;
    public String descRRA;
    public BigDecimal qtdMesesRRA;
    public DespProcJud despProcJud;
    public List<IdeAdv> ideAdv;

    public byte getTpProcRRA() {
        return tpProcRRA;
    }

    public void setTpProcRRA(byte tpProcRRA) {
        this.tpProcRRA = tpProcRRA;
    }

    public String getNrProcRRA() {
        return nrProcRRA;
    }

    public void setNrProcRRA(String nrProcRRA) {
        this.nrProcRRA = nrProcRRA;
    }

    public String getDescRRA() {
        return descRRA;
    }

    public void setDescRRA(String descRRA) {
        this.descRRA = descRRA;
    }

    public BigDecimal getQtdMesesRRA() {
        return qtdMesesRRA;
    }

    public void setQtdMesesRRA(BigDecimal qtdMesesRRA) {
        this.qtdMesesRRA = qtdMesesRRA;
    }

    public DespProcJud getDespProcJud() {
        return despProcJud;
    }

    public void setDespProcJud(DespProcJud despProcJud) {
        this.despProcJud = despProcJud;
    }

    public List<IdeAdv> getIdeAdv() {
        return ideAdv;
    }

    public void setIdeAdv(List<IdeAdv> ideAdv) {
        this.ideAdv = ideAdv;
    }
}
