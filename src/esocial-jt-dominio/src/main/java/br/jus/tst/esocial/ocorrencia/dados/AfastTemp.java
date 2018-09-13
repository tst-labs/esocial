package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.afasttemp.IdeVinculo;
import br.jus.tst.esocial.dominio.afasttemp.InfoAfastamento;

public class AfastTemp extends DadosOcorrencia {
	
	@Valid
	private IdeVinculo ideVinculo;
	
	@Valid
	private InfoAfastamento infoAfastamento;
	
	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public InfoAfastamento getInfoAfastamento() {
		return infoAfastamento;
	}

	public void setInfoAfastamento(InfoAfastamento infoAfastamento) {
		this.infoAfastamento = infoAfastamento;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof AfastTemp)) {
			return false;
		}
		AfastTemp castOther = (AfastTemp) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(ideVinculo, castOther.ideVinculo)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(ideVinculo)
				.toHashCode();
	}

}
