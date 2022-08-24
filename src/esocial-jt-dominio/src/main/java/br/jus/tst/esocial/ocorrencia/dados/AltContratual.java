package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

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

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(altContratual)
					.map(a -> a.getDtAlteracao())
					.orElse(null);
	}

	@Override
	public String getCpf() {
		return Optional.ofNullable(ideVinculo)
				.map(IdeVinculo::getCpfTrab)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return Optional.ofNullable(ideVinculo)
				.map(IdeVinculo::getMatricula)
				.orElse(null);
	}
}