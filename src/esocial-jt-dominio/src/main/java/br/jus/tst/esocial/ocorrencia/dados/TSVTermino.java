package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.IdeTrabSemVinculo;
import br.jus.tst.esocial.dominio.semvinculo.termino.InfoTSVTermino;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class TSVTermino extends DadosOcorrencia {
	
	@Valid
	private IdeTrabSemVinculo ideTrabSemVinculo;
	
	@Valid
	private InfoTSVTermino infoTSVTermino;
	
	public IdeTrabSemVinculo getIdeTrabSemVinculo() {
		return ideTrabSemVinculo;
	}

	public void setIdeTrabSemVinculo(IdeTrabSemVinculo ideTrabSemVinculo) {
		this.ideTrabSemVinculo = ideTrabSemVinculo;
	}

	public InfoTSVTermino getInfoTSVTermino() {
		return infoTSVTermino;
	}

	public void setInfoTSVTermino(InfoTSVTermino infoTSVTermino) {
		this.infoTSVTermino = infoTSVTermino;
	}

	@Override
	public boolean equals(final Object other) {
		throw new NotImplementedException("Metodo nao implementado");
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(ideTrabSemVinculo)
				.toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(infoTSVTermino)
				.map(InfoTSVTermino::getDtTerm)
				.orElse(null);
	}
	
	@Override
	public String getCpf() {
		return Optional.ofNullable(ideTrabSemVinculo)
					.map(IdeTrabSemVinculo::getCpfTrab)
					.orElse(null);
	}

	@Override
	public String getMatricula() {
		return Optional.ofNullable(ideTrabSemVinculo)
				.map(IdeTrabSemVinculo::getMatricula)
				.orElse(null);
	}

}
