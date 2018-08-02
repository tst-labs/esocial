package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.semvinculo.InfoTSVInicio;
import br.jus.tst.esocial.dominio.trabalhador.Trabalhador;

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
}
