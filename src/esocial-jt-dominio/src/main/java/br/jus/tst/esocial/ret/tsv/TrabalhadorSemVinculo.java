package br.jus.tst.esocial.ret.tsv;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
        
public class TrabalhadorSemVinculo {

    public DadosCadastrais dadosCadastrais;
    public DadosContratuais dadosContratuais;
    public DadosDesligamento dadosDesligamento;
    
    public DadosCadastrais getDadosCadastrais() {
        return dadosCadastrais;
    }

    public void setDadosCadastrais(DadosCadastrais dadosCadastrais) {
        this.dadosCadastrais = dadosCadastrais;
    }

    public DadosDesligamento getDadosDesligamento() {
        return dadosDesligamento;
    }

    public void setDadosDesligamento(DadosDesligamento dadosDesligamento) {
        this.dadosDesligamento = dadosDesligamento;
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
                .append(dadosContratuais, trabalhadorSemVinculo.dadosContratuais)
                .append(dadosDesligamento, trabalhadorSemVinculo.dadosDesligamento)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(dadosCadastrais)
                .append(dadosContratuais)
                .append(dadosDesligamento)
                .toHashCode();
    }
}
