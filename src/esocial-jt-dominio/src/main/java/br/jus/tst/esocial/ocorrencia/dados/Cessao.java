package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.cessao.FimCessao;
import br.jus.tst.esocial.dominio.cessao.IdeVinculo;
import br.jus.tst.esocial.dominio.cessao.InfoCessao;
import br.jus.tst.esocial.dominio.cessao.IniCessao;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class Cessao extends DadosOcorrencia {

	@NotNull
	@Valid
	private IdeVinculo ideVinculo;
	
	@NotNull
	@Valid
	private InfoCessao infoCessao;

	public IdeVinculo getIdeVinculo() {
		return ideVinculo;
	}

	public void setIdeVinculo(IdeVinculo ideVinculo) {
		this.ideVinculo = ideVinculo;
	}

	public InfoCessao getInfoCessao() {
		return infoCessao;
	}

	public void setInfoCessao(InfoCessao infoCessao) {
		this.infoCessao = infoCessao;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Admissao)) {
			return false;
		}
		Cessao castOther = (Cessao) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(ideVinculo, castOther.ideVinculo)
				.append(infoCessao, castOther.infoCessao)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(ideVinculo)
				.append(infoCessao)
				.toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		Calendar dtIniCessao = Optional
									.ofNullable(infoCessao)
									.map(InfoCessao::getIniCessao)
									.map(IniCessao::getDtIniCessao)
									.orElse(null);
		
		Calendar dtTermCessao = Optional
									.ofNullable(infoCessao)
									.map(InfoCessao::getFimCessao)
									.map(FimCessao::getDtTermCessao)
									.orElse(null);
		
		return Optional.ofNullable(dtIniCessao).orElse(dtTermCessao);
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
