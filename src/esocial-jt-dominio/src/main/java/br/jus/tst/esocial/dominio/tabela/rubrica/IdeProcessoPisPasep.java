package br.jus.tst.esocial.dominio.tabela.rubrica;

import java.math.BigInteger;

public class IdeProcessoPisPasep {
    private String nrProc;
    private BigInteger codSusp;

    public String getNrProc() {
        return nrProc;
    }

    public void setNrProc(String nrProc) {
        this.nrProc = nrProc;
    }

    public BigInteger getCodSusp() {
        return codSusp;
    }

    public void setCodSusp(BigInteger codSusp) {
        this.codSusp = codSusp;
    }
}
