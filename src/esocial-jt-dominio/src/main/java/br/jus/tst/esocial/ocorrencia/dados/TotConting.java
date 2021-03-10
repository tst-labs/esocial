package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;

public class TotConting extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeEventoFolha ideEvento;
	
	public IdeEventoFolha getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEventoFolha ideEvento) {
		this.ideEvento = ideEvento;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TotConting)) {
			return false;
		}
		TotConting castOther = (TotConting) other;
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
