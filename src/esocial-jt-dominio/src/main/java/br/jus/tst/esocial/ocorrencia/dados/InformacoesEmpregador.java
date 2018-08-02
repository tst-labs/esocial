package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.empregador.InfoEmpregador;

public class InformacoesEmpregador extends DadosOcorrencia {

	@Valid
	private InfoEmpregador infoEmpregador;

	/**
	 * @return the infoEmpregador
	 */
	public InfoEmpregador getInfoEmpregador() {
		return infoEmpregador;
	}

	/**
	 * @param infoEmpregador
	 *            the infoEmpregador to set
	 */
	public InformacoesEmpregador setInfoEmpregador(InfoEmpregador infoEmpregador) {
		this.infoEmpregador = infoEmpregador;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InformacoesEmpregador)) {
			return false;
		}
		InformacoesEmpregador castOther = (InformacoesEmpregador) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(infoEmpregador, castOther.infoEmpregador)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(infoEmpregador)
				.toHashCode();
	}

}
