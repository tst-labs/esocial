package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolhaSemRetificacao;

public class ReabreEvPer extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeEventoFolhaSemRetificacao ideEvento;
	
	public IdeEventoFolhaSemRetificacao getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEventoFolhaSemRetificacao ideEvento) {
		this.ideEvento = ideEvento;
	}


	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof FechaEvPer)) {
			return false;
		}
		ReabreEvPer castOther = (ReabreEvPer) other;
		return new EqualsBuilder()
				.append(ideEvento, castOther.ideEvento)
				.append(ideEmpregador, castOther.ideEmpregador)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEvento)
				.append(ideEmpregador)
				.toHashCode();
	}
}
