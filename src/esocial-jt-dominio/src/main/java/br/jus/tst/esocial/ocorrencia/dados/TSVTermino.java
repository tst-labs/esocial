package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.IdeTrabSemVinculo;
import br.jus.tst.esocial.dominio.semvinculo.termino.InfoTSVTermino;

public class TSVTermino extends DadosOcorrencia {
	
	@Valid
	private IdeEvento ideEvento;
	
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

	public IdeEvento getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEvento ideEvento) {
		this.ideEvento = ideEvento;
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

}
