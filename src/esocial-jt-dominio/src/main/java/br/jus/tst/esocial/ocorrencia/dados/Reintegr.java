package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.reintegracao.InfoReintegr;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;

public class Reintegr extends DadosOcorrencia {
	
	@Valid
	@NotNull
    private IdeVinculo ideVinculo;
	
	@Valid
	@NotNull
	private InfoReintegr infoReintegr;
	
	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public InfoReintegr getInfoReintegr() {
		return infoReintegr;
	}

	public void setInfoReintegr(InfoReintegr infoReintegr) {
		this.infoReintegr = infoReintegr;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Reintegr)) {
			return false;
		}
		Reintegr castOther = (Reintegr) other;
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
