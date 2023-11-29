package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.math.BigInteger;
import java.util.List;

public class InfoProcRet {
    private byte tpProcRet;
    @NotEmpty
    private String nrProcRet;
    private BigInteger codSusp;
    @Valid
    private List<InfoValores> infoValores;

    public byte getTpProcRet() {
        return tpProcRet;
    }

    public void setTpProcRet(byte tpProcRet) {
        this.tpProcRet = tpProcRet;
    }

    public String getNrProcRet() {
        return nrProcRet;
    }

    public void setNrProcRet(String nrProcRet) {
        this.nrProcRet = nrProcRet;
    }

    public BigInteger getCodSusp() {
        return codSusp;
    }

    public void setCodSusp(BigInteger codSusp) {
        this.codSusp = codSusp;
    }

    public List<InfoValores> getInfoValores() {
        return infoValores;
    }

    public void setInfoValores(List<InfoValores> infoValores) {
        this.infoValores = infoValores;
    }
}
