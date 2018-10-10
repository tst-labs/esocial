package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.trabalhador.Trabalhador;
import br.jus.tst.esocial.dominio.vinculo.Vinculo;

public class Admissao extends DadosOcorrencia {
	
	@Valid
	private IdeEvento ideEvento;

	@Valid
	@NotNull
	private Trabalhador trabalhador;

	@Valid 
	@NotNull
	private Vinculo vinculo;

	public Trabalhador getTrabalhador() {
		return trabalhador;
	}

	public Admissao setTrabalhador(Trabalhador trabalhador) {
		this.trabalhador = trabalhador;
		return this;
	}

	public Vinculo getVinculo() {
		return vinculo;
	}

	public Admissao setVinculo(Vinculo vinculo) {
		this.vinculo = vinculo;
		return this;
	}
	
	public IdeEvento getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEvento ideEvento) {
		this.ideEvento = ideEvento;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Admissao)) {
			return false;
		}
		Admissao castOther = (Admissao) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador).append(vinculo, castOther.vinculo)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(vinculo).toHashCode();
	}
}
