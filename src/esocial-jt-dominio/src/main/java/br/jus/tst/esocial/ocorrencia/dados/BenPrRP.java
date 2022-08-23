package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.beneficiario.IdeBenef;
import br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.DmDev;
import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public class BenPrRP extends DadosOcorrencia {

	@Valid
	private IdeEventoFolha ideEvento;

	private IdeBenef ideBenef;
	
	private List<DmDev> dmDev;

	public IdeEventoFolha getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEventoFolha ideEvento) {
		this.ideEvento = ideEvento;
	}

	public IdeBenef getIdeBenef() {
		return ideBenef;
	}

	public void setIdeBenef(IdeBenef ideBenef) {
		this.ideBenef = ideBenef;
	}

	public List<DmDev> getDmDev() {
		return dmDev;
	}

	public void setDmDev(List<DmDev> dmDev) {
		this.dmDev = dmDev;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof BenPrRP)) {
			return false;
		}
		BenPrRP castOther = (BenPrRP) other;
		return new EqualsBuilder().append(ideEvento, castOther.ideEvento).append(ideEmpregador, castOther.ideEmpregador).append(ideBenef, castOther.ideBenef)
				.append(dmDev, castOther.dmDev)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEvento).append(ideEmpregador).append(ideBenef).append(dmDev).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(ideEvento)
				.map(IdeEventoFolha::getPerApur)
				.map(DataUtil::parseToCalendar)
				.orElse(null);
	}

	@Override
	public String getCpf() {
		return Optional
				.ofNullable(ideBenef)
				.map(IdeBenef::getCpfBenef)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}

}
