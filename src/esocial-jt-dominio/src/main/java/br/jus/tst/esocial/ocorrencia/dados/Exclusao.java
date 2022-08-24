package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.exclusao.InfoExclusao;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class Exclusao extends DadosOcorrencia {

	@Valid
	private InfoExclusao infoExclusao;

	public InfoExclusao getInfoExclusao() {
		return infoExclusao;
	}

	public void setInfoExclusao(InfoExclusao infoExclusao) {
		this.infoExclusao = infoExclusao;
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Exclusao)) {
			return false;
		}
		Exclusao castOther = (Exclusao) other;
		return new EqualsBuilder()
					.append(ideEmpregador, castOther.ideEmpregador)
					.append(infoExclusao, castOther.infoExclusao)
					.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(ideEmpregador)
					.append(infoExclusao)
					.toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		// TODO Analisar o caso de evento de exclusao
		return null;
	}
	
	@Override
	public String getCpf() {
		return Optional.ofNullable(infoExclusao)
				.map(InfoExclusao::getIdeTrabalhador)
				.map(IdeTrabalhador::getCpfTrab)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}

}
