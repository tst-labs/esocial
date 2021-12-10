package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.cessao.IdeVinculo;
import br.jus.tst.esocial.dominio.cessao.InfoCessao;

public class Cessao extends DadosOcorrencia {

	@NotNull
	@Valid
	private IdeVinculo ideVinculo;
	
	@NotNull
	@Valid
	private InfoCessao infoCessao;

	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public InfoCessao getInfoCessao() {
		return infoCessao;
	}

	public void setInfoCessao(InfoCessao infoCessao) {
		this.infoCessao = infoCessao;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Admissao)) {
			return false;
		}
		Cessao castOther = (Cessao) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(ideVinculo, castOther.ideVinculo)
				.append(infoCessao, castOther.infoCessao)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(ideVinculo)
				.append(infoCessao)
				.toHashCode();
	}

}
