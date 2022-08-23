package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.tabela.rubrica.IdeRubrica;
import br.jus.tst.esocial.dominio.tabela.rubrica.InfoRubrica;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class TabelaRubrica extends DadosOcorrencia {

	@Valid
	private InfoRubrica infoRubrica;

	public InfoRubrica getInfoRubrica() {
		return infoRubrica;
	}

	public TabelaRubrica setInfoRubrica(InfoRubrica informacaoRubrica) {
		this.infoRubrica = informacaoRubrica;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaRubrica)) {
			return false;
		}
		TabelaRubrica castOther = (TabelaRubrica) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(infoRubrica, castOther.infoRubrica)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoRubrica).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(infoRubrica)
				.map(InfoRubrica::getIdeRubrica)
				.map(IdeRubrica::getIniValid)
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
