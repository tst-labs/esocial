package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.empregador.InfoEmpregador;
import br.jus.tst.esocial.dominio.periodo.IdePeriodo;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class InformacoesEmpregador extends DadosOcorrencia {

	@Valid
	private InfoEmpregador infoEmpregador;

	/**
	 * @return the infoEmpregador
	 */
	public InfoEmpregador getInfoEmpregador() {
		return infoEmpregador;
	}

	/**
	 * @param infoEmpregador
	 *            the infoEmpregador to set
	 */
	public InformacoesEmpregador setInfoEmpregador(InfoEmpregador infoEmpregador) {
		this.infoEmpregador = infoEmpregador;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof InformacoesEmpregador)) {
			return false;
		}
		InformacoesEmpregador castOther = (InformacoesEmpregador) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(infoEmpregador, castOther.infoEmpregador)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(infoEmpregador)
				.toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(infoEmpregador)
					.map(InfoEmpregador::getIdePeriodo)
					.map(IdePeriodo::getIniValid)
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
