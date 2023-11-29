package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;
import java.util.List;

public class InfoReembMed {
    private byte indOrgReemb;
    private String cnpjOper;
    private String regANS;
    @Valid
    private List<DetReemb> detReembTit;
    @Valid
    private List<InfoReembDep> infoReembDep;

    public byte getIndOrgReemb() {
        return indOrgReemb;
    }

    public void setIndOrgReemb(byte indOrgReemb) {
        this.indOrgReemb = indOrgReemb;
    }

    public String getCnpjOper() {
        return cnpjOper;
    }

    public void setCnpjOper(String cnpjOper) {
        this.cnpjOper = cnpjOper;
    }

    public String getRegANS() {
        return regANS;
    }

    public void setRegANS(String regANS) {
        this.regANS = regANS;
    }

    public List<InfoReembDep> getInfoReembDep() {
        return infoReembDep;
    }

    public void setInfoReembDep(List<InfoReembDep> infoReembDep) {
        this.infoReembDep = infoReembDep;
    }

    public List<DetReemb> getDetReembTit() {
        return detReembTit;
    }

    public void setDetReembTit(List<DetReemb> detReembTit) {
        this.detReembTit = detReembTit;
    }
}
