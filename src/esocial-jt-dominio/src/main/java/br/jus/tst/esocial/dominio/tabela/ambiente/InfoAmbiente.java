package br.jus.tst.esocial.dominio.tabela.ambiente;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoAmbiente {

	@Valid
	@NotNull
	private IdeAmbiente ideAmbiente;

	@Valid
	@NotNull
	private DadosAmbiente dadosAmbiente;

	@Valid
	private IdePeriodo novaValidade;
	
	
	/**
	 * Informações de identificação do ambiente de trabalho do empregador
	 */
	public IdeAmbiente getIdeAmbiente() {
		return ideAmbiente;
	}

	/**
	 * Informações de identificação do ambiente de trabalho do empregador
	 * 
	 * @param IdeAmbiente
	 * @return InfoAmbiente
	 */
	public InfoAmbiente setIdeAmbiente(IdeAmbiente ideAmbiente) {
		this.ideAmbiente = ideAmbiente;
		return this;
	}

	/**
	 * Informações do ambiente de trabalho
	 */
	 public DadosAmbiente getDadosAmbiente() {
		return dadosAmbiente;
	}

	/**
	 * Informações do ambiente de trabalho
	 * 
	 * @param dadosAmbiente
	 * @return InfoAmbiente
	 */
	public InfoAmbiente setDadosAmbiente(DadosAmbiente dadosAmbiente) {
		this.dadosAmbiente = dadosAmbiente;
		return this;
	}
	
	/**
	 * Novo período de validade das informações
	 */ 
	public IdePeriodo getNovaValidade() {
		return novaValidade;
	}

	/**
	 * Novo período de validade das informações
	 * 
	 * @param novaValidade
	 */
	public void setNovaValidade(IdePeriodo novaValidade) {
		this.novaValidade = novaValidade;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InfoAmbiente)) {
			return false;
		}
		InfoAmbiente castOther = (InfoAmbiente) other;
		return new EqualsBuilder()
				.append(ideAmbiente, castOther.ideAmbiente)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideAmbiente)
				.toHashCode();
	}
}
