package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.monit.Aso;
import br.jus.tst.esocial.dominio.monit.ExMedOcup;
import br.jus.tst.esocial.dominio.sst.IdeVinculoSST;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class Monit extends DadosOcorrencia{
    @Valid
    @NotNull
    public IdeVinculoSST ideVinculo;

    @Valid
    @NotNull
    public ExMedOcup exMedOcup;

    public IdeVinculoSST getIdeVinculo() {
        return ideVinculo;
    }

    public void setIdeVinculo(IdeVinculoSST ideVinculo) {
        this.ideVinculo = ideVinculo;
    }

    public ExMedOcup getExMedOcup() {
        return exMedOcup;
    }

    public void setExMedOcup(ExMedOcup exMedOcup) {
        this.exMedOcup = exMedOcup;
    }

    @Override
    public Calendar getDataEvento() {
        return Optional.ofNullable(exMedOcup)
                .map(ExMedOcup::getAso)
                .map(Aso::getDtAso)
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

        Monit monit = (Monit) o;

        return new EqualsBuilder().append(ideVinculo, monit.ideVinculo).append(exMedOcup, monit.exMedOcup).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(ideVinculo).append(exMedOcup).toHashCode();
    }
}
