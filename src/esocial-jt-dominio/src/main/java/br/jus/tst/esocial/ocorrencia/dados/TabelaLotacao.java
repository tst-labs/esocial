package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.tabela.lotacao.IdeLotacao;
import br.jus.tst.esocial.dominio.tabela.lotacao.InfoLotacao;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class TabelaLotacao extends DadosOcorrencia {

	@Valid
	private InfoLotacao infoLotacao;

	public InfoLotacao getInfoLotacao() {
		return infoLotacao;
	}

	public TabelaLotacao setInfoLotacao(InfoLotacao infoLotacao) {
		this.infoLotacao = infoLotacao;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaLotacao)) {
			return false;
		}
		TabelaLotacao castOther = (TabelaLotacao) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador)
				.append(infoLotacao, castOther.infoLotacao).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoLotacao).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(infoLotacao)
				.map(InfoLotacao::getIdeLotacao)
				.map(IdeLotacao::getIniValid)
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
