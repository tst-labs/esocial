package br.jus.tst.esocial.dominio.cat;

import br.jus.tst.esocial.dominio.enums.UF;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;

public class LocalAcidente {
    public byte tpLocal;
    public String dscLocal;
    public String tpLograd;
    @NotNull
    public String dscLograd;
    @NotNull
    public String nrLograd;
    public String complemento;
    public String bairro;
    public String cep;
    public BigInteger codMunic;
    public UF uf;
    public String pais;
    public String codPostal;
    @Valid
    public IdeLocalAcid ideLocalAcid;

    public byte getTpLocal() {
        return tpLocal;
    }

    public void setTpLocal(byte tpLocal) {
        this.tpLocal = tpLocal;
    }

    public String getDscLocal() {
        return dscLocal;
    }

    public void setDscLocal(String dscLocal) {
        this.dscLocal = dscLocal;
    }

    public String getTpLograd() {
        return tpLograd;
    }

    public void setTpLograd(String tpLograd) {
        this.tpLograd = tpLograd;
    }

    public String getDscLograd() {
        return dscLograd;
    }

    public void setDscLograd(String dscLograd) {
        this.dscLograd = dscLograd;
    }

    public String getNrLograd() {
        return nrLograd;
    }

    public void setNrLograd(String nrLograd) {
        this.nrLograd = nrLograd;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public BigInteger getCodMunic() {
        return codMunic;
    }

    public void setCodMunic(BigInteger codMunic) {
        this.codMunic = codMunic;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public IdeLocalAcid getIdeLocalAcid() {
        return ideLocalAcid;
    }

    public void setIdeLocalAcid(IdeLocalAcid ideLocalAcid) {
        this.ideLocalAcid = ideLocalAcid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        LocalAcidente that = (LocalAcidente) o;

        return new EqualsBuilder().append(tpLocal, that.tpLocal).append(dscLocal, that.dscLocal).append(tpLograd, that.tpLograd).append(dscLograd, that.dscLograd).append(nrLograd, that.nrLograd).append(complemento, that.complemento).append(bairro, that.bairro).append(cep, that.cep).append(codMunic, that.codMunic).append(uf, that.uf).append(pais, that.pais).append(codPostal, that.codPostal).append(ideLocalAcid, that.ideLocalAcid).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tpLocal).append(dscLocal).append(tpLograd).append(dscLograd).append(nrLograd).append(complemento).append(bairro).append(cep).append(codMunic).append(uf).append(pais).append(codPostal).append(ideLocalAcid).toHashCode();
    }
}
