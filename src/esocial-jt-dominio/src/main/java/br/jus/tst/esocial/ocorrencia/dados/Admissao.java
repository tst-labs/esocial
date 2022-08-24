package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.trabalhador.Trabalhador;
import br.jus.tst.esocial.dominio.vinculo.InfoCeletista;
import br.jus.tst.esocial.dominio.vinculo.InfoEstatutario;
import br.jus.tst.esocial.dominio.vinculo.InfoRegimeTrab;
import br.jus.tst.esocial.dominio.vinculo.Vinculo;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class Admissao extends DadosOcorrencia {
	
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

	@Override
	public Calendar getDataEvento() {
		Calendar dtExercicio = Optional
			.ofNullable(vinculo)
			.map(Vinculo::getInfoRegimeTrab)
			.map(InfoRegimeTrab::getInfoEstatutario)
			.map(InfoEstatutario::getDtExercicio)
			.orElse(null);
		
		Calendar getDtAdm = Optional
			.ofNullable(vinculo)
			.map(Vinculo::getInfoRegimeTrab)
			.map(InfoRegimeTrab::getInfoCeletista)
			.map(InfoCeletista::getDtAdm)
			.orElse(null);
		
		return Optional.ofNullable(dtExercicio).orElse(getDtAdm);
	}

	@Override
	public String getCpf() {
		return Optional
					.ofNullable(trabalhador)
					.map(Trabalhador::getCpfTrab)
					.orElse(null);
	}

	@Override
	public String getMatricula() {
		return Optional
				.ofNullable(vinculo)
				.map(Vinculo::getMatricula)
				.orElse(null);
	}
}
