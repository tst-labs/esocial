package br.jus.tst.esocial.dominio.tabela.rubrica;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoRubrica {
	
	@Valid
	private IdeRubrica ideRubrica;
	
	@Valid
	private DadosRubrica dadosRubrica;
	
	private IdePeriodo novaValidade;

    public IdeRubrica getIdeRubrica() {
		return ideRubrica;
	}

	public InfoRubrica setIdeRubrica(IdeRubrica identificacaoRubrica) {
		this.ideRubrica = identificacaoRubrica;
		return this;
	}

	public DadosRubrica getDadosRubrica() {
		return dadosRubrica;
	}

	public InfoRubrica setDadosRubrica(DadosRubrica dadosRubrica) {
		this.dadosRubrica = dadosRubrica;
		return this;
	}

	public IdePeriodo getNovaValidade() {
		return novaValidade;
	}

	public InfoRubrica setNovaValidade(IdePeriodo novaValidade) {
		this.novaValidade = novaValidade;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InfoRubrica)) {
			return false;
		}
		InfoRubrica castOther = (InfoRubrica) other;
		return new EqualsBuilder().append(ideRubrica, castOther.ideRubrica).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideRubrica).toHashCode();
	}

}
