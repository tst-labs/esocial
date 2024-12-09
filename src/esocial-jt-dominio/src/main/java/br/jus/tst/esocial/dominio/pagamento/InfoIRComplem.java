package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.List;

public class InfoIRComplem {

    private Calendar dtLaudo;
    @Valid
    private List<InfoDep> infoDep;

    @Valid
    private List<InfoIRCR> infoIRCR;

    @Valid
    private List<PlanSaude> planSaude;

    @Valid
    private List<InfoReembMed> infoReembMed;

    @Valid
    private PerAnt perAnt;

    public Calendar getDtLaudo() {
        return dtLaudo;
    }

    public void setDtLaudo(Calendar dtLaudo) {
        this.dtLaudo = dtLaudo;
    }

    public List<InfoDep> getInfoDep() {
        return infoDep;
    }

    public void setInfoDep(List<InfoDep> infoDep) {
        this.infoDep = infoDep;
    }

    public List<InfoIRCR> getInfoIRCR() {
        return infoIRCR;
    }

    public void setInfoIRCR(List<InfoIRCR> infoIRCR) {
        this.infoIRCR = infoIRCR;
    }

    public List<PlanSaude> getPlanSaude() {
        return planSaude;
    }

    public void setPlanSaude(List<PlanSaude> planSaude) {
        this.planSaude = planSaude;
    }

    public List<InfoReembMed> getInfoReembMed() {
        return infoReembMed;
    }

    public void setInfoReembMed(List<InfoReembMed> infoReembMed) {
        this.infoReembMed = infoReembMed;
    }

    public PerAnt getPerAnt() {
        return perAnt;
    }

    public void setPerAnt(PerAnt perAnt) {
        this.perAnt = perAnt;
    }
}
