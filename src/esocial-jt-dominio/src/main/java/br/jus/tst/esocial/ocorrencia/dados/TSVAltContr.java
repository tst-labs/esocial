package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.IdeTrabSemVinculo;
import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.InfoTSVAlteracao;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

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

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(infoTSVAlteracao)
					.map(InfoTSVAlteracao::getDtAlteracao)
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
