package br.jus.tst.esocial.dominio.rra;

import java.math.BigDecimal;

public class DespProcJud {
    public BigDecimal vlrDespCustas;
    public BigDecimal vlrDespAdvogados;

    public BigDecimal getVlrDespCustas() {
        return vlrDespCustas;
    }

    public void setVlrDespCustas(BigDecimal vlrDespCustas) {
        this.vlrDespCustas = vlrDespCustas;
    }

    public BigDecimal getVlrDespAdvogados() {
        return vlrDespAdvogados;
    }

    public void setVlrDespAdvogados(BigDecimal vlrDespAdvogados) {
        this.vlrDespAdvogados = vlrDespAdvogados;
    }
}
