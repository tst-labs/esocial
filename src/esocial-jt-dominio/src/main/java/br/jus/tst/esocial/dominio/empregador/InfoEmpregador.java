package br.jus.tst.esocial.dominio.empregador;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoEmpregador {

	@NotNull
	@Valid
	private IdePeriodo idePeriodo;
	@Valid
	private IdePeriodo novaValidade;

	@Valid
	private InfoCadastro infoCadastro;

	public IdePeriodo getIdePeriodo() {
		return idePeriodo;
	}

	public InfoEmpregador setIdePeriodo(IdePeriodo periodo) {
		this.idePeriodo = periodo;
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

	/**
	 * @return the infoCadastro
	 */
	public InfoCadastro getInfoCadastro() {
		return infoCadastro;
	}

	/**
	 * @param infoCadastro
	 *            the infoCadastro to set
	 */
	public InfoEmpregador setInfoCadastro(InfoCadastro dadosEmpregador) {
		this.infoCadastro = dadosEmpregador;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idePeriodo == null) ? 0 : idePeriodo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoEmpregador other = (InfoEmpregador) obj;
		
		return new EqualsBuilder()
				.append(idePeriodo, other.idePeriodo)
				.isEquals();
	}
	
}
