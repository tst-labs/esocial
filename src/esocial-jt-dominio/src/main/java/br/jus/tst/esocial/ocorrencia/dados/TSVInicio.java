package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.semvinculo.InfoTSVInicio;
import br.jus.tst.esocial.dominio.trabalhador.Trabalhador;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class TSVInicio extends DadosOcorrencia {
	
	@Valid
	private Trabalhador trabalhador;
	
	@Valid
	private InfoTSVInicio infoTSVInicio;

	public Trabalhador getTrabalhador() {
		return trabalhador;
	}

	public TSVInicio setTrabalhador(Trabalhador trabalhador) {
		this.trabalhador = trabalhador;
		return this;
	}

	public InfoTSVInicio getInfoTSVInicio() {
		return infoTSVInicio;
	}

	public TSVInicio setInfoTSVInicio(InfoTSVInicio informacoesTSV) {
		this.infoTSVInicio = informacoesTSV;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		throw new NotImplementedException("Metodo nao implementado");
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(trabalhador).append(infoTSVInicio).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(infoTSVInicio)
					.map(InfoTSVInicio::getDtInicio)
					.orElse(null);
	}

	@Override
	public String getCpf() {
		return Optional.ofNullable(trabalhador)
					.map(Trabalhador::getCpfTrab)
					.orElse(null);
	}

	@Override
	public String getMatricula() {
		return Optional.ofNullable(infoTSVInicio)
				.map(InfoTSVInicio::getMatricula)
				.orElse(null);
	}
}
