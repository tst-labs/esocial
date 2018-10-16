package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.IdeTrabSemVinculo;
import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.InfoTSVAlteracao;

public class TSVAltContr extends DadosOcorrencia {

	@Valid
	private IdeTrabSemVinculo ideTrabSemVinculo;
	
	@Valid
	private InfoTSVAlteracao infoTSVAlteracao;

	public IdeTrabSemVinculo getIdeTrabSemVinculo() {
		return ideTrabSemVinculo;
	}

	public TSVAltContr setIdeTrabSemVinculo(IdeTrabSemVinculo ideTrabSemVinculo) {
		this.ideTrabSemVinculo = ideTrabSemVinculo;
		return this;
	}

	public InfoTSVAlteracao getInfoTSVAlteracao() {
		return infoTSVAlteracao;
	}

	public TSVAltContr setInfoTSVAlteracao(InfoTSVAlteracao infoTSVAlteracao) {
		this.infoTSVAlteracao = infoTSVAlteracao;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		throw new NotImplementedException("Metodo nao implementado");
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(ideTrabSemVinculo).append(infoTSVAlteracao).toHashCode();
	}
	
}
