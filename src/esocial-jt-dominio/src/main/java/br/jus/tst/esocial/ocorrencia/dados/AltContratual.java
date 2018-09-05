package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.vinculo.AlteracaoContratual.IdeVinculo;

public class AltContratual extends DadosOcorrencia {

	@Valid
	@NotNull
    private IdeVinculo ideVinculo;

	@Valid
	@NotNull
	private br.jus.tst.esocial.dominio.vinculo.AlteracaoContratual.AltContratual altContratual;
	
	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setAltContratual(br.jus.tst.esocial.dominio.vinculo.AlteracaoContratual.AltContratual altContratual) {
		this.altContratual = altContratual;
	}

	public br.jus.tst.esocial.dominio.vinculo.AlteracaoContratual.AltContratual getAltContratual() {
		return altContratual;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AltContratual)) {
			return false;
		}
		AltContratual castOther = (AltContratual) other;
		return new EqualsBuilder()
					.append(ideVinculo, castOther.ideVinculo)
					.append(altContratual, castOther.altContratual)
					.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(ideVinculo)
					.append(altContratual)
					.toHashCode();
	}
}