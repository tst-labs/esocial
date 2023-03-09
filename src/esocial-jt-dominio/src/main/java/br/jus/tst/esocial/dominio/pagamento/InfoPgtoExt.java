package br.jus.tst.esocial.dominio.pagamento;

public class InfoPgtoExt {
    public byte indNIF;
    public String nifBenef;
    public String frmTribut;
    public EndExt endExt;

    public byte getIndNIF() {
        return indNIF;
    }

    public void setIndNIF(byte indNIF) {
        this.indNIF = indNIF;
    }

    public String getNifBenef() {
        return nifBenef;
    }

    public void setNifBenef(String nifBenef) {
        this.nifBenef = nifBenef;
    }

    public String getFrmTribut() {
        return frmTribut;
    }

    public void setFrmTribut(String frmTribut) {
        this.frmTribut = frmTribut;
    }

    public EndExt getEndExt() {
        return endExt;
    }

    public void setEndExt(EndExt endExt) {
        this.endExt = endExt;
    }
}
