package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.afasttemp.FimAfastamento;
import br.jus.tst.esocial.dominio.afasttemp.IdeVinculo;
import br.jus.tst.esocial.dominio.afasttemp.InfoAfastamento;
import br.jus.tst.esocial.dominio.afasttemp.IniAfastamento;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class AfastTemp extends DadosOcorrencia {
	
	@Valid
	private IdeVinculo ideVinculo;
	
	@Valid
	private InfoAfastamento infoAfastamento;
	
	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public InfoAfastamento getInfoAfastamento() {
		return infoAfastamento;
	}

	public void setInfoAfastamento(InfoAfastamento infoAfastamento) {
		this.infoAfastamento = infoAfastamento;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof AfastTemp)) {
			return false;
		}
		AfastTemp castOther = (AfastTemp) other;
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
		Calendar dtIniAfast = Optional
			.ofNullable(infoAfastamento)
			.map(InfoAfastamento::getIniAfastamento)
			.map(IniAfastamento::getDtIniAfast)
			.orElse(null);

		Calendar dtFimAfast = Optional
				.ofNullable(infoAfastamento)
				.map(InfoAfastamento::getFimAfastamento)
				.map(FimAfastamento::getDtTermAfast)
				.orElse(null);
		
		return Optional.ofNullable(dtIniAfast).orElse(dtFimAfast);
	}

	@Override
	public String getCpf() {
		return Optional
				.ofNullable(ideVinculo)
				.map(IdeVinculo::getCpfTrab)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return Optional
				.ofNullable(ideVinculo)
				.map(IdeVinculo::getMatricula)
				.orElse(null);
	}

}
