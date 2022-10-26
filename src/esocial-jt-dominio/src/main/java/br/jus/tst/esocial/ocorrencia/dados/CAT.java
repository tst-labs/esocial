package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.cat.Cat;
import br.jus.tst.esocial.dominio.sst.IdeVinculoSST;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class CAT extends DadosOcorrencia{


    @Valid
    @NotNull
    public IdeVinculoSST ideVinculo;

    @Valid
    @NotNull
    public Cat cat;

    public IdeVinculoSST getIdeVinculo() {
        return ideVinculo;
    }

    public void setIdeVinculo(IdeVinculoSST ideVinculo) {
        this.ideVinculo = ideVinculo;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public Calendar getDataEvento() {
        return null;
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
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
