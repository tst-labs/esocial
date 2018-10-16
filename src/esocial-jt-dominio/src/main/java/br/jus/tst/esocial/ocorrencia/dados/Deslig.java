package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.desligamento.InfoDeslig;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;

public class Deslig extends DadosOcorrencia {
	
	@Valid
	@NotNull
    private IdeVinculo ideVinculo;
	
	@Valid
	@NotNull
	private InfoDeslig infoDeslig;
	
	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public InfoDeslig getInfoDeslig() {
		return infoDeslig;
	}

	public void setInfoDeslig(InfoDeslig infoDeslig) {
		this.infoDeslig = infoDeslig;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Deslig)) {
			return false;
		}
		Deslig castOther = (Deslig) other;
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
