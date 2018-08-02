package br.jus.tst.esocial.dominio.tabela.lotacao;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoLotacao {

	@NotNull
	private IdeLotacao ideLotacao;

	@NotNull
	private DadosLotacao dadosLotacao;

	@Valid
	private IdePeriodo novaValidade;
	
	public DadosLotacao getDadosLotacao() {
		return dadosLotacao;
	}
	

	/**
	 * Detalhamento das informações da lotação que está sendo incluída
	 * 
	 * @param dadosLotacao
	 * @return IdeLotacao
	 */
	public InfoLotacao setDadosLotacao(DadosLotacao dadosLotacao) {
		this.dadosLotacao = dadosLotacao;
		return this;
	}

	public IdeLotacao getIdeLotacao() {
		return ideLotacao;
	}

	/**
	 * Informações de identificação da lotação e validade das informações que
	 * estão sendo incluídas
	 * 
	 * @param ideLotacao
	 * @return InfoLotacao
	 */
	public InfoLotacao setIdeLotacao(IdeLotacao ideLotacao) {
		this.ideLotacao = ideLotacao;
		return this;
	}
	
	public IdePeriodo getNovaValidade() {
		return novaValidade;
	}

	/**
	 * Só deve ser informado se estiver alterando algum dado.
	 * 
	 * @param novaValidade
	 */
	public InfoLotacao setNovaValidade(IdePeriodo novaValidade) {
		this.novaValidade = novaValidade;
		return this;
	}


	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InfoLotacao)) {
			return false;
		}
		InfoLotacao castOther = (InfoLotacao) other;
		return new EqualsBuilder().append(ideLotacao, castOther.ideLotacao).isEquals();
	}


	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideLotacao).toHashCode();
	}
}
