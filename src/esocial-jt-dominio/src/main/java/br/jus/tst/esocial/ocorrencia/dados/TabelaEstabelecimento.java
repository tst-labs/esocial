package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.tabela.estabelecimento.IdeEstab;
import br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoEstab;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class TabelaEstabelecimento extends DadosOcorrencia {

	@Valid
	private InfoEstab infoEstab;

	public InfoEstab getInfoEstab() {
		return infoEstab;
	}

	public TabelaEstabelecimento setInfoEstab(InfoEstab infoEstab) {
		this.infoEstab = infoEstab;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaEstabelecimento)) {
			return false;
		}
		TabelaEstabelecimento castOther = (TabelaEstabelecimento) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador).append(infoEstab, castOther.infoEstab)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoEstab).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(infoEstab)
					.map(InfoEstab::getIdeEstab)
					.map(IdeEstab::getIniValid)
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
