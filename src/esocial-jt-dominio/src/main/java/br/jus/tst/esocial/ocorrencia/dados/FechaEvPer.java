package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.pagamento.IdeEvento;
import br.jus.tst.esocial.dominio.pagamento.IdeRespInf;
import br.jus.tst.esocial.dominio.pagamento.InfoFech;

public class FechaEvPer extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeEvento ideEvento;
	
	public IdeRespInf ideRespInf;
	
	public InfoFech infoFech;

	public IdeEvento getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEvento ideEvento) {
		this.ideEvento = ideEvento;
	}

	public IdeRespInf getIdeRespInf() {
		return ideRespInf;
	}

	public void setIdeRespInf(IdeRespInf ideRespInf) {
		this.ideRespInf = ideRespInf;
	}

	public InfoFech getInfoFech() {
		return infoFech;
	}

	public void setInfoFech(InfoFech infoFech) {
		this.infoFech = infoFech;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof FechaEvPer)) {
			return false;
		}
		FechaEvPer castOther = (FechaEvPer) other;
		return new EqualsBuilder()
				.append(ideEvento, castOther.ideEvento)
				.append(ideRespInf, castOther.ideRespInf)
				.append(infoFech, castOther.infoFech)
				.append(ideEmpregador, castOther.ideEmpregador)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEvento)
				.append(ideRespInf)
				.append(infoFech)
				.append(ideEmpregador)
				.toHashCode();
	}
}
