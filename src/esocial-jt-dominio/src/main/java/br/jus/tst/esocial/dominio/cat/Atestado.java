package br.jus.tst.esocial.dominio.cat;

import br.jus.tst.esocial.dominio.enums.SimNao;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.util.Calendar;

public class Atestado {
    @NotNull
    public Calendar dtAtendimento;
    @NotNull
    public String hrAtendimento;
    @NotNull
    public SimNao indInternacao;
    @NotNull
    public BigInteger durTrat;
    @NotNull
    public SimNao indAfast;
    @NotNull
    public BigInteger dscLesao;
    public String dscCompLesao;
    public String diagProvavel;
    @NotNull
    public String codCID;
    public String observacao;
    @NotNull
    @Valid
    public Emitente emitente;

    public Calendar getDtAtendimento() {
        return dtAtendimento;
    }

    public void setDtAtendimento(Calendar dtAtendimento) {
        this.dtAtendimento = dtAtendimento;
    }

    public String getHrAtendimento() {
        return hrAtendimento;
    }

    public void setHrAtendimento(String hrAtendimento) {
        this.hrAtendimento = hrAtendimento;
    }

    public SimNao getIndInternacao() {
        return indInternacao;
    }

    public void setIndInternacao(SimNao indInternacao) {
        this.indInternacao = indInternacao;
    }

    public BigInteger getDurTrat() {
        return durTrat;
    }

    public void setDurTrat(BigInteger durTrat) {
        this.durTrat = durTrat;
    }

    public SimNao getIndAfast() {
        return indAfast;
    }

    public void setIndAfast(SimNao indAfast) {
        this.indAfast = indAfast;
    }

    public BigInteger getDscLesao() {
        return dscLesao;
    }

    public void setDscLesao(BigInteger dscLesao) {
        this.dscLesao = dscLesao;
    }

    public String getDscCompLesao() {
        return dscCompLesao;
    }

    public void setDscCompLesao(String dscCompLesao) {
        this.dscCompLesao = dscCompLesao;
    }

    public String getDiagProvavel() {
        return diagProvavel;
    }

    public void setDiagProvavel(String diagProvavel) {
        this.diagProvavel = diagProvavel;
    }

    public String getCodCID() {
        return codCID;
    }

    public void setCodCID(String codCID) {
        this.codCID = codCID;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Emitente getEmitente() {
        return emitente;
    }

    public void setEmitente(Emitente emitente) {
        this.emitente = emitente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Atestado atestado = (Atestado) o;

        return new EqualsBuilder().append(dtAtendimento, atestado.dtAtendimento).append(hrAtendimento, atestado.hrAtendimento).append(indInternacao, atestado.indInternacao).append(durTrat, atestado.durTrat).append(indAfast, atestado.indAfast).append(dscLesao, atestado.dscLesao).append(dscCompLesao, atestado.dscCompLesao).append(diagProvavel, atestado.diagProvavel).append(codCID, atestado.codCID).append(observacao, atestado.observacao).append(emitente, atestado.emitente).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(dtAtendimento).append(hrAtendimento).append(indInternacao).append(durTrat).append(indAfast).append(dscLesao).append(dscCompLesao).append(diagProvavel).append(codCID).append(observacao).append(emitente).toHashCode();
    }
}
