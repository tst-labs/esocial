package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.demonstrativovalores.DmDev;
import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador;
import br.jus.tst.esocial.util.DataUtil;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public class RmnRPPS extends DadosOcorrencia implements DadosFolha {

	@Valid
	@NotNull
	private IdeEventoFolha ideEvento;
	
	@Valid
	@NotNull
	private IdeTrabalhador ideTrabalhador;
	
	@NotNull
	private List<DmDev> dmDev;

	public IdeEventoFolha getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEventoFolha ideEvento) {
		this.ideEvento = ideEvento;
	}

	public IdeTrabalhador getIdeTrabalhador() {
		return ideTrabalhador;
	}

	public RmnRPPS setIdeTrabalhador(IdeTrabalhador ideTrabalhador) {
		this.ideTrabalhador = ideTrabalhador;
		return this;
	}

	public List<DmDev> getDmDev() {
		return dmDev;
	}

	public RmnRPPS setDmDev(List<DmDev> dmDev) {
		this.dmDev = dmDev;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof RmnRPPS)) {
			return false;
		}
		RmnRPPS castOther = (RmnRPPS) other;
		return new EqualsBuilder()
				.append(ideEvento, castOther.ideEvento)
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(ideTrabalhador, castOther.ideTrabalhador)
				.append(dmDev, castOther.dmDev)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEvento)
				.append(ideEmpregador)
				.append(ideTrabalhador)
				.append(dmDev)
				.toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(ideEvento)
				.map(IdeEventoFolha::getPerApur)
				.map(DataUtil::parseToCalendar)
				.orElse(null);
	}

	@Override
	public String getCpf() {
		return Optional.ofNullable(ideTrabalhador)
					.map(IdeTrabalhador::getCpfTrab)
					.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}
}
