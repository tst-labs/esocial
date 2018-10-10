package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.pagamento.IdeRespInf;

public class TotConting extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeEventoPagto ideEvento;
	
	public IdeRespInf ideRespInf;
	
	public IdeEventoPagto getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEventoPagto ideEvento) {
		this.ideEvento = ideEvento;
	}

	public IdeRespInf getIdeRespInf() {
		return ideRespInf;
	}

	public void setIdeRespInf(IdeRespInf ideRespInf) {
		this.ideRespInf = ideRespInf;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TotConting)) {
			return false;
		}
		TotConting castOther = (TotConting) other;
		return new EqualsBuilder()
				.append(ideEvento, castOther.ideEvento)
				.append(ideRespInf, castOther.ideRespInf)
				.append(ideEmpregador, castOther.ideEmpregador)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEvento)
				.append(ideRespInf)
				.append(ideEmpregador)
				.toHashCode();
	}
}
