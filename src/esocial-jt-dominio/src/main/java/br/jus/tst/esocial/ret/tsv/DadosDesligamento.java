package br.jus.tst.esocial.ret.tsv;

import br.jus.tst.esocial.dominio.semvinculo.termino.InfoTSVTermino;

import java.util.Objects;

public class DadosDesligamento {
    public InfoTSVTermino infoTSVTermino;

    public InfoTSVTermino getInfoTSVTermino() {
        return infoTSVTermino;
    }

    public void setInfoTSVTermino(InfoTSVTermino infoTSVTermino) {
        this.infoTSVTermino = infoTSVTermino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosDesligamento that = (DadosDesligamento) o;
        return Objects.equals(infoTSVTermino, that.infoTSVTermino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoTSVTermino);
    }
}
