package br.jus.tst.esocial.dominio.tabela.cargo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoCargo {

	@Valid
	@NotNull
	private IdeCargo ideCargo;

	@Valid
	@NotNull
	private DadosCargo dadosCargo;

	@Valid
	private IdePeriodo novaValidade;
	
	
	/**
	 * Informações de identificação do cargo
	 */
	public IdeCargo getIdeCargo() {
		return ideCargo;
	}

	/**
	 * Informações de identificação do cargo.
	 * 
	 * @param IdeCargo
	 * @return InfoCargo
	 */
	public InfoCargo setIdeCargo(IdeCargo ideCargo) {
		this.ideCargo = ideCargo;
		return this;
	}

	public DadosCargo getDadosCargo() {
		return dadosCargo;
	}

	/**
	 * Detalhamento das informações do cargo
	 * 
	 * @param dadosCargo
	 * @return InfoCargo
	 */
	public InfoCargo setDadosCargo(DadosCargo dadosCargo) {
		this.dadosCargo = dadosCargo;
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
		if (!(other instanceof InfoCargo)) {
			return false;
		}
		InfoCargo castOther = (InfoCargo) other;
		return new EqualsBuilder()
				.append(ideCargo, castOther.ideCargo)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideCargo)
				.toHashCode();
	}
}
