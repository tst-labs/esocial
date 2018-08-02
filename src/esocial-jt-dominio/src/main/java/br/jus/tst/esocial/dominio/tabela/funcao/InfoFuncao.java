package br.jus.tst.esocial.dominio.tabela.funcao;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoFuncao {

	@Valid
	private IdeFuncao ideFuncao;
	
	@Valid
	private DadosFuncao dadosFuncao;
	
	private IdePeriodo novaValidade;

	public IdeFuncao getIdeFuncao() {
		return ideFuncao;
	}

	public InfoFuncao setIdeFuncao(IdeFuncao ideFuncao) {
		this.ideFuncao = ideFuncao;
		return this;
	}

	public DadosFuncao getDadosFuncao() {
		return dadosFuncao;
	}

	public InfoFuncao setDadosFuncao(DadosFuncao dadosFuncao) {
		this.dadosFuncao = dadosFuncao;
		return this;
	}

	public IdePeriodo getNovaValidade() {
		return novaValidade;
	}

	public void setNovaValidade(IdePeriodo novaValidade) {
		this.novaValidade = novaValidade;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InfoFuncao)) {
			return false;
		}
		InfoFuncao castOther = (InfoFuncao) other;
		return new EqualsBuilder().append(ideFuncao, castOther.ideFuncao).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideFuncao).toHashCode();
	}
	
	
}
