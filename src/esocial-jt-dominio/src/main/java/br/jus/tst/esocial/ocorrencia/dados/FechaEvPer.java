package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolhaSemRetificacao;
import br.jus.tst.esocial.dominio.pagamento.InfoFech;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class FechaEvPer extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeEventoFolhaSemRetificacao ideEvento;
	
	public InfoFech infoFech;

	public IdeEventoFolhaSemRetificacao getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEventoFolhaSemRetificacao ideEvento) {
		this.ideEvento = ideEvento;
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
				.append(infoFech, castOther.infoFech)
				.append(ideEmpregador, castOther.ideEmpregador)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEvento)
				.append(infoFech)
				.append(ideEmpregador)
				.toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(ideEvento)
				.map(IdeEventoFolhaSemRetificacao::getPerApur)
				.map(DataUtil::parseToCalendar)
				.orElse(null);
	}

	@Override
	public String getCpf() {
		return null;
	}

	@Override
	public String getMatricula() {
		return null;
	}
}
