package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.exprisco.InfoExpRisco;
import br.jus.tst.esocial.dominio.sst.IdeVinculoSST;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class ExpRisco extends DadosOcorrencia {

    @Valid
    @NotNull
    public IdeVinculoSST ideVinculo;

    @Valid
    @NotNull
    public InfoExpRisco infoExpRisco;

    public IdeVinculoSST getIdeVinculo() {
        return ideVinculo;
    }

    public void setIdeVinculo(IdeVinculoSST ideVinculo) {
        this.ideVinculo = ideVinculo;
    }

    public InfoExpRisco getInfoExpRisco() {
        return infoExpRisco;
    }

    public void setInfoExpRisco(InfoExpRisco infoExpRisco) {
        this.infoExpRisco = infoExpRisco;
    }

    @Override
    public Calendar getDataEvento() {
        return Optional
                .ofNullable(infoExpRisco)
                .map(InfoExpRisco::getDtIniCondicao)
                .orElse(null);
    }

    @Override
    public String getCpf() {
        return Optional.ofNullable(ideVinculo)
                .map(IdeVinculoSST::getCpfTrab)
                .orElse(null);
    }

    @Override
    public String getMatricula() {
        return Optional.ofNullable(ideVinculo)
                .map(IdeVinculoSST::getMatricula)
                .orElse(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ExpRisco expRisco = (ExpRisco) o;

        return new EqualsBuilder().append(ideVinculo, expRisco.ideVinculo).append(infoExpRisco, expRisco.infoExpRisco).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(ideVinculo).append(infoExpRisco).toHashCode();
    }
}
