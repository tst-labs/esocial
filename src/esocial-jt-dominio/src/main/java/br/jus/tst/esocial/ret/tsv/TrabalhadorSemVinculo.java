package br.jus.tst.esocial.ret.tsv;

import br.jus.tst.esocial.dominio.afasttemp.InfoAfastamento;
import br.jus.tst.esocial.dominio.semvinculo.InfoComplementares;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import br.jus.tst.esocial.dominio.semvinculo.Termino;
        
public class TrabalhadorSemVinculo {

    public DadosCadastrais dadosCadastrais;
    public DadosContratuais dadosContratuais;
    public Termino termino;
    
    public DadosCadastrais getDadosCadastrais() {
        return dadosCadastrais;
    }

    public void setDadosCadastrais(DadosCadastrais dadosCadastrais) {
        this.dadosCadastrais = dadosCadastrais;
    }

    public Termino getTermino() {
        return termino;
    }

    public void setTermino(Termino termino) {
        this.termino = termino;
    }

    public DadosContratuais getDadosContratuais() {
        return dadosContratuais;
    }

    public void setDadosContratuais(DadosContratuais dadosContratuais) {
        this.dadosContratuais = dadosContratuais;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrabalhadorSemVinculo trabalhadorSemVinculo = (TrabalhadorSemVinculo) o;
        return new EqualsBuilder()
                .append(dadosCadastrais, trabalhadorSemVinculo.dadosCadastrais)
                .append(dadosCadastrais, trabalhadorSemVinculo.dadosContratuais)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(dadosCadastrais)
                .append(dadosContratuais)
                .toHashCode();
    }
}
