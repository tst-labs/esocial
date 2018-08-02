package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.horario.InfoHorContratual;

public class TabelaHorario extends DadosOcorrencia {

	@Valid
	private InfoHorContratual infoHorContratual;
	
	public InfoHorContratual getInfoHorContratual() {
		return infoHorContratual;
	}

	public void setInfoHorContratual(InfoHorContratual infoHorContratual) {
		this.infoHorContratual = infoHorContratual;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaHorario)) {
			return false;
		}
		TabelaHorario castOther = (TabelaHorario) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(infoHorContratual, castOther.infoHorContratual)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(infoHorContratual)
				.toHashCode();
	}
}
