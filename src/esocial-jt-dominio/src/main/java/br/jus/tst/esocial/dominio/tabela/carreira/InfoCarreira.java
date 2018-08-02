package br.jus.tst.esocial.dominio.tabela.carreira;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoCarreira {

	@Valid
	@NotNull
	private IdeCarreira ideCarreira;

	@NotNull
	private DadosCarreira dadosCarreira;

	@Valid
	private IdePeriodo novaValidade;

	/**
	 * Informações de identificação do carreira
	 */
	public IdeCarreira getIdeCarreira() {
		return ideCarreira;
	}

	/**
	 * Informações de identificação do carreira.
	 * 
	 * @param IdeCarreira
	 * @return InfoCarreira
	 */
	public InfoCarreira setIdeCarreira(IdeCarreira ideCarreira) {
		this.ideCarreira = ideCarreira;
		return this;
	}

	public DadosCarreira getDadosCarreira() {
		return dadosCarreira;
	}

	/**
	 * Detalhamento das informações do carreira
	 * 
	 * @param dadosCarreira
	 * @return InfoCarreira
	 */
	public InfoCarreira setDadosCarreira(DadosCarreira dadosCarreira) {
		this.dadosCarreira = dadosCarreira;
		return this;
	}

	public IdePeriodo getNovaValidade() {
		return novaValidade;
	}

	/**
	 * Só deve ser informado se estiver alterando algum dado.
	 * 
	 * @param novaValidade
	 *            the novaValidade to set
	 */
	public void setNovaValidade(IdePeriodo novaValidade) {
		this.novaValidade = novaValidade;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InfoCarreira)) {
			return false;
		}
		InfoCarreira castOther = (InfoCarreira) other;
		return new EqualsBuilder().append(ideCarreira, castOther.ideCarreira).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideCarreira).toHashCode();
	}

}
