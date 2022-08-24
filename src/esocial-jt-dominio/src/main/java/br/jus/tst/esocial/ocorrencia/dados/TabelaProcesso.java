package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.tabela.processo.IdeProcesso;
import br.jus.tst.esocial.dominio.tabela.processo.InfoProcesso;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class TabelaProcesso extends DadosOcorrencia {

	@Valid
	private InfoProcesso infoProcesso;

	public InfoProcesso getInfoProcesso() {
		return infoProcesso;
	}

	public TabelaProcesso setInfoProcesso(InfoProcesso infoProcesso) {
		this.infoProcesso = infoProcesso;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaProcesso)) {
			return false;
		}
		TabelaProcesso castOther = (TabelaProcesso) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador)
				.append(infoProcesso, castOther.infoProcesso).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoProcesso).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(infoProcesso)
				.map(InfoProcesso::getIdeProcesso)
				.map(IdeProcesso::getIniValid)
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
