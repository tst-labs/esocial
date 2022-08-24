package br.jus.tst.esocial.ret.empregado;

import br.jus.tst.esocial.dominio.afasttemp.InfoAfastamento;
import br.jus.tst.esocial.dominio.cessao.InfoCessao;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

public class Empregado {
    public DadosCadastrais dadosCadastrais;
    public DadosContratuais dadosContratuais;
    public DadosDesligamento dadosDesligamento;
    public List<InfoAfastamento> dadosAfastamentos;
    public List<InfoCessao> dadosCessoes;

    public DadosCadastrais getDadosCadastrais() {
        return dadosCadastrais;
    }

    public void setDadosCadastrais(DadosCadastrais dadosCadastrais) {
        this.dadosCadastrais = dadosCadastrais;
    }

    public DadosContratuais getDadosContratuais() {
        return dadosContratuais;
    }

    public void setDadosContratuais(DadosContratuais dadosContratuais) {
        this.dadosContratuais = dadosContratuais;
    }

    public DadosDesligamento getDadosDesligamento() {
        return dadosDesligamento;
    }

    public void setDadosDesligamento(DadosDesligamento dadosDesligamento) {
        this.dadosDesligamento = dadosDesligamento;
    }

    public List<InfoAfastamento> getDadosAfastamentos() {
        return dadosAfastamentos;
    }

    public void setDadosAfastamentos(List<InfoAfastamento> dadosAfastamentos) {
        this.dadosAfastamentos = dadosAfastamentos;
    }

    public List<InfoCessao> getDadosCessoes() {
        return dadosCessoes;
    }

    public void setDadosCessoes(List<InfoCessao> dadosCessoes) {
        this.dadosCessoes = dadosCessoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return new EqualsBuilder()
                .append(dadosCadastrais, empregado.dadosCadastrais)
                .append(dadosContratuais, empregado.dadosContratuais)
                .append(dadosDesligamento, empregado.dadosDesligamento)
                .append(dadosAfastamentos, empregado.dadosAfastamentos)
                .append(dadosCessoes, empregado.dadosCessoes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(dadosCadastrais)
                .append(dadosContratuais)
                .append(dadosDesligamento)
                .append(dadosAfastamentos)
                .append(dadosCessoes)
                .toHashCode();
    }
}
