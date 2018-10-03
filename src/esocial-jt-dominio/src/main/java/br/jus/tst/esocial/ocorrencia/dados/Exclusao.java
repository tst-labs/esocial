package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.exclusao.IdeEvento;
import br.jus.tst.esocial.dominio.exclusao.InfoExclusao;

public class Exclusao extends DadosOcorrencia {

	@Valid
	private IdeEvento ideEvento;
	
	private InfoExclusao infoExclusao;

	public IdeEvento getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEvento ideEvento) {
		this.ideEvento = ideEvento;
	}

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
					.append(ideEvento, castOther.ideEvento)
					.append(infoExclusao, castOther.infoExclusao)
					.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(ideEmpregador)
					.append(ideEvento)
					.append(infoExclusao)
					.toHashCode();
	}


}
