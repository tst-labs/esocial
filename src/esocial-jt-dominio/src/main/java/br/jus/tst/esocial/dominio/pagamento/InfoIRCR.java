package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class InfoIRCR {

    @NotEmpty
    protected String tpCR;
    @Valid
    protected List<DedDepen> dedDepen;
    @Valid
    protected List<PenAlimIRCR> penAlim;
    @Valid
    protected List<PrevidCompl> previdCompl;
    @Valid
    protected List<InfoProcRet> infoProcRet;

    public String getTpCR() {
        return tpCR;
    }

    public void setTpCR(String tpCR) {
        this.tpCR = tpCR;
    }

    public List<DedDepen> getDedDepen() {
        return dedDepen;
    }

    public void setDedDepen(List<DedDepen> dedDepen) {
        this.dedDepen = dedDepen;
    }

    public List<PenAlimIRCR> getPenAlim() {
        return penAlim;
    }

    public void setPenAlim(List<PenAlimIRCR> penAlim) {
        this.penAlim = penAlim;
    }

    public List<PrevidCompl> getPrevidCompl() {
        return previdCompl;
    }

    public void setPrevidCompl(List<PrevidCompl> previdCompl) {
        this.previdCompl = previdCompl;
    }

    public List<InfoProcRet> getInfoProcRet() {
        return infoProcRet;
    }

    public void setInfoProcRet(List<InfoProcRet> infoProcRet) {
        this.infoProcRet = infoProcRet;
    }
}
