package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolhaSemRetificacao;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class ReabreEvPer extends DadosOcorrencia implements DadosFechamentoFolha {

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
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		ReabreEvPer that = (ReabreEvPer) o;

		return new EqualsBuilder().append(ideEvento, that.ideEvento).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(ideEvento).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(ideEvento)
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

	@Override
	public String getPeriodoApuracao() {
		return Optional
				.ofNullable(ideEvento)
				.map(IdeEventoFolhaSemRetificacao::getPerApur)
				.orElse(null);
	}
}
