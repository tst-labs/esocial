package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;

public class AltContratual extends DadosOcorrencia {

	@Valid
	@NotNull
    private IdeVinculo ideVinculo;

	@Valid
	@NotNull
	private br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.AltContratual altContratual;
	
	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setAltContratual(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.AltContratual altContratual) {
		this.altContratual = altContratual;
	}

	public br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.AltContratual getAltContratual() {
		return altContratual;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AltContratual)) {
			return false;
		}
		AltContratual castOther = (AltContratual) other;
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