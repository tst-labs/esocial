package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.reintegracao.InfoReintegr;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

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

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(infoReintegr)
				.map(InfoReintegr::getDtEfetRetorno)
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
