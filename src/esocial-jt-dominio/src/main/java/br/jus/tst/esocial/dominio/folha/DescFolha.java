package br.jus.tst.esocial.dominio.folha;

public class DescFolha {
    private byte tpDesc;
    private String instFinanc;
    private String nrDoc;
    private String observacao;

    public byte getTpDesc() {
        return tpDesc;
    }

    public void setTpDesc(byte tpDesc) {
        this.tpDesc = tpDesc;
    }

    public String getInstFinanc() {
        return instFinanc;
    }

    public void setInstFinanc(String instFinanc) {
        this.instFinanc = instFinanc;
    }

    public String getNrDoc() {
        return nrDoc;
    }

    public void setNrDoc(String nrDoc) {
        this.nrDoc = nrDoc;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
