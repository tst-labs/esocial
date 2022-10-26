package br.jus.tst.esocial.dominio.cat;

import br.jus.tst.esocial.dominio.enums.SimNao;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Calendar;

public class Cat {

    @NotNull
    public Calendar dtAcid;

    public byte tpAcid;

    public String hrAcid;

    public String hrsTrabAntesAcid;

    public byte tpCat;

    @NotNull
    public SimNao indCatObito;

    public Calendar dtObito;

    @NotNull
    public SimNao indComunPolicia;

    @NotNull
    public BigInteger codSitGeradora;

    public byte iniciatCAT;

    public String obsCAT;

    public Calendar ultDiaTrab;

    public SimNao houveAfast;

    @NotNull
    @Valid
    public LocalAcidente localAcidente;

    @NotNull
    @Valid
    public ParteAtingida parteAtingida;

    @NotNull
    @Valid
    public AgenteCausador agenteCausador;

    @NotNull
    @Valid
    public Atestado atestado;

    @Valid
    public CatOrigem catOrigem;

    public Calendar getDtAcid() {
        return dtAcid;
    }

    public void setDtAcid(Calendar dtAcid) {
        this.dtAcid = dtAcid;
    }

    public byte getTpAcid() {
        return tpAcid;
    }

    public void setTpAcid(byte tpAcid) {
        this.tpAcid = tpAcid;
    }

    public String getHrAcid() {
        return hrAcid;
    }

    public void setHrAcid(String hrAcid) {
        this.hrAcid = hrAcid;
    }

    public String getHrsTrabAntesAcid() {
        return hrsTrabAntesAcid;
    }

    public void setHrsTrabAntesAcid(String hrsTrabAntesAcid) {
        this.hrsTrabAntesAcid = hrsTrabAntesAcid;
    }

    public byte getTpCat() {
        return tpCat;
    }

    public void setTpCat(byte tpCat) {
        this.tpCat = tpCat;
    }

    public SimNao getIndCatObito() {
        return indCatObito;
    }

    public void setIndCatObito(SimNao indCatObito) {
        this.indCatObito = indCatObito;
    }

    public Calendar getDtObito() {
        return dtObito;
    }

    public void setDtObito(Calendar dtObito) {
        this.dtObito = dtObito;
    }

    public SimNao getIndComunPolicia() {
        return indComunPolicia;
    }

    public void setIndComunPolicia(SimNao indComunPolicia) {
        this.indComunPolicia = indComunPolicia;
    }

    public BigInteger getCodSitGeradora() {
        return codSitGeradora;
    }

    public void setCodSitGeradora(BigInteger codSitGeradora) {
        this.codSitGeradora = codSitGeradora;
    }

    public byte getIniciatCAT() {
        return iniciatCAT;
    }

    public void setIniciatCAT(byte iniciatCAT) {
        this.iniciatCAT = iniciatCAT;
    }

    public String getObsCAT() {
        return obsCAT;
    }

    public void setObsCAT(String obsCAT) {
        this.obsCAT = obsCAT;
    }

    public Calendar getUltDiaTrab() {
        return ultDiaTrab;
    }

    public void setUltDiaTrab(Calendar ultDiaTrab) {
        this.ultDiaTrab = ultDiaTrab;
    }

    public SimNao getHouveAfast() {
        return houveAfast;
    }

    public void setHouveAfast(SimNao houveAfast) {
        this.houveAfast = houveAfast;
    }

    public LocalAcidente getLocalAcidente() {
        return localAcidente;
    }

    public void setLocalAcidente(LocalAcidente localAcidente) {
        this.localAcidente = localAcidente;
    }

    public ParteAtingida getParteAtingida() {
        return parteAtingida;
    }

    public void setParteAtingida(ParteAtingida parteAtingida) {
        this.parteAtingida = parteAtingida;
    }

    public AgenteCausador getAgenteCausador() {
        return agenteCausador;
    }

    public void setAgenteCausador(AgenteCausador agenteCausador) {
        this.agenteCausador = agenteCausador;
    }

    public Atestado getAtestado() {
        return atestado;
    }

    public void setAtestado(Atestado atestado) {
        this.atestado = atestado;
    }

    public CatOrigem getCatOrigem() {
        return catOrigem;
    }

    public void setCatOrigem(CatOrigem catOrigem) {
        this.catOrigem = catOrigem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return new EqualsBuilder().append(tpAcid, cat.tpAcid).append(tpCat, cat.tpCat).append(iniciatCAT, cat.iniciatCAT).append(dtAcid, cat.dtAcid).append(hrAcid, cat.hrAcid).append(hrsTrabAntesAcid, cat.hrsTrabAntesAcid).append(indCatObito, cat.indCatObito).append(dtObito, cat.dtObito).append(indComunPolicia, cat.indComunPolicia).append(codSitGeradora, cat.codSitGeradora).append(obsCAT, cat.obsCAT).append(ultDiaTrab, cat.ultDiaTrab).append(houveAfast, cat.houveAfast).append(localAcidente, cat.localAcidente).append(parteAtingida, cat.parteAtingida).append(agenteCausador, cat.agenteCausador).append(atestado, cat.atestado).append(catOrigem, cat.catOrigem).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(dtAcid).append(tpAcid).append(hrAcid).append(hrsTrabAntesAcid).append(tpCat).append(indCatObito).append(dtObito).append(indComunPolicia).append(codSitGeradora).append(iniciatCAT).append(obsCAT).append(ultDiaTrab).append(houveAfast).append(localAcidente).append(parteAtingida).append(agenteCausador).append(atestado).append(catOrigem).toHashCode();
    }
}
