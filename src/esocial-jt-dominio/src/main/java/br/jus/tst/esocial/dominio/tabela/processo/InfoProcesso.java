package br.jus.tst.esocial.dominio.tabela.processo;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoProcesso {

	@Valid
	private IdeProcesso ideProcesso;

	@Valid
	private DadosProc dadosProc;

	@Valid
	private IdePeriodo novaValidade;

	public IdeProcesso getIdeProcesso() {
		return ideProcesso;
	}

	/**
	 * Informações de identificação do Processo e validade das informações que
	 * estão sendo incluídas
	 * 
	 * @param dadosProc
	 * @return
	 */
	public InfoProcesso setIdeProcesso(IdeProcesso ideProcesso) {
		this.ideProcesso = ideProcesso;
		return this;
	}

	public DadosProc getDadosProc() {
		return dadosProc;
	}

	/**
	 * Dados do processo
	 * 
	 * @param ideProcesso
	 * @return
	 */
	public InfoProcesso setDadosProc(DadosProc dadosProc) {
		this.dadosProc = dadosProc;
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
		if (!(other instanceof InfoProcesso)) {
			return false;
		}
		InfoProcesso castOther = (InfoProcesso) other;
		return new EqualsBuilder().append(ideProcesso, castOther.ideProcesso).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideProcesso).toHashCode();
	}

}
