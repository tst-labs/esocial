package br.jus.tst.esocial.dominio.exprisco;

import br.jus.tst.esocial.dominio.enums.SimNao;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;

public class EpiCompl {
    @NotNull
    public SimNao medProtecao;
    @NotNull
    public SimNao condFuncto;
    @NotNull
    public SimNao usoInint;
    @NotNull
    public SimNao przValid;
    @NotNull
    public SimNao periodicTroca;
    @NotNull
    public SimNao higienizacao;

    public SimNao getMedProtecao() {
        return medProtecao;
    }

    public void setMedProtecao(SimNao medProtecao) {
        this.medProtecao = medProtecao;
    }

    public SimNao getCondFuncto() {
        return condFuncto;
    }

    public void setCondFuncto(SimNao condFuncto) {
        this.condFuncto = condFuncto;
    }

    public SimNao getUsoInint() {
        return usoInint;
    }

    public void setUsoInint(SimNao usoInint) {
        this.usoInint = usoInint;
    }

    public SimNao getPrzValid() {
        return przValid;
    }

    public void setPrzValid(SimNao przValid) {
        this.przValid = przValid;
    }

    public SimNao getPeriodicTroca() {
        return periodicTroca;
    }

    public void setPeriodicTroca(SimNao periodicTroca) {
        this.periodicTroca = periodicTroca;
    }

    public SimNao getHigienizacao() {
        return higienizacao;
    }

    public void setHigienizacao(SimNao higienizacao) {
        this.higienizacao = higienizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        EpiCompl epiCompl = (EpiCompl) o;

        return new EqualsBuilder().append(medProtecao, epiCompl.medProtecao).append(condFuncto, epiCompl.condFuncto).append(usoInint, epiCompl.usoInint).append(przValid, epiCompl.przValid).append(periodicTroca, epiCompl.periodicTroca).append(higienizacao, epiCompl.higienizacao).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(medProtecao).append(condFuncto).append(usoInint).append(przValid).append(periodicTroca).append(higienizacao).toHashCode();
    }
}
