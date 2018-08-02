package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoEstab {

	@NotNull
	@Valid
	private IdeEstab ideEstab;
	@NotNull
	private DadosEstab dadosEstab;

	public IdeEstab getIdeEstab() {
		return ideEstab;
	}

	public InfoEstab setIdeEstab(IdeEstab ideEstab) {
		this.ideEstab = ideEstab;
		return this;
	}

	public DadosEstab getDadosEstab() {
		return dadosEstab;
	}

	public InfoEstab setDadosEstab(DadosEstab dadosEstab) {
		this.dadosEstab = dadosEstab;
		return this;
	}
	
	@Valid
	private IdePeriodo novaValidade;

	public IdePeriodo getNovaValidade() {
		return novaValidade;
	}

	/**
	 * Só deve ser informado se estiver alterando algum dado.
	 * 
	 * @param novaValidade
	 *            the novaValidade to set
	 */
	public InfoEstab setNovaValidade(IdePeriodo novaValidade) {
		this.novaValidade = novaValidade;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InfoEstab)) {
			return false;
		}
		InfoEstab castOther = (InfoEstab) other;
		return new EqualsBuilder().append(ideEstab, castOther.ideEstab).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEstab).toHashCode();
	}

}
