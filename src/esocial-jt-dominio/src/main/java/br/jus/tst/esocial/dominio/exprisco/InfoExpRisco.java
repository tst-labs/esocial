package br.jus.tst.esocial.dominio.exprisco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.List;

public class InfoExpRisco {

    @NotNull
    public Calendar dtIniCondicao;

    public Calendar dtFimCondicao;

    @Valid
    @NotNull
    public List<InfoAmb> infoAmb;

    @Valid
    @NotNull
    public InfoAtiv infoAtiv;

    @Valid
    @NotNull
    public List<AgNoc> agNoc;

    @Valid
    @NotNull
    public List<RespReg> respReg;

    @Valid
    public Obs obs;

    public Calendar getDtIniCondicao() {
        return dtIniCondicao;
    }

    public void setDtIniCondicao(Calendar dtIniCondicao) {
        this.dtIniCondicao = dtIniCondicao;
    }

    public Calendar getDtFimCondicao() {
        return dtFimCondicao;
    }

    public void setDtFimCondicao(Calendar dtFimCondicao) {
        this.dtFimCondicao = dtFimCondicao;
    }

    public List<InfoAmb> getInfoAmb() {
        return infoAmb;
    }

    public void setInfoAmb(List<InfoAmb> infoAmb) {
        this.infoAmb = infoAmb;
    }

    public InfoAtiv getInfoAtiv() {
        return infoAtiv;
    }

    public void setInfoAtiv(InfoAtiv infoAtiv) {
        this.infoAtiv = infoAtiv;
    }

    public List<AgNoc> getAgNoc() {
        return agNoc;
    }

    public void setAgNoc(List<AgNoc> agNoc) {
        this.agNoc = agNoc;
    }

    public List<RespReg> getRespReg() {
        return respReg;
    }

    public void setRespReg(List<RespReg> respReg) {
        this.respReg = respReg;
    }

    public Obs getObs() {
        return obs;
    }

    public void setObs(Obs obs) {
        this.obs = obs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        InfoExpRisco that = (InfoExpRisco) o;

        return new EqualsBuilder().append(dtIniCondicao, that.dtIniCondicao).append(dtFimCondicao, that.dtFimCondicao).append(infoAmb, that.infoAmb).append(infoAtiv, that.infoAtiv).append(agNoc, that.agNoc).append(respReg, that.respReg).append(obs, that.obs).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(dtIniCondicao).append(dtFimCondicao).append(infoAmb).append(infoAtiv).append(agNoc).append(respReg).append(obs).toHashCode();
    }
}
