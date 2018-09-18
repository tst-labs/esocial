package br.jus.tst.esocial.ocorrencia.dados;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.demonstrativovalores.DmDev;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador;

public class Remun extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeTrabalhador ideTrabalhador;
	
	@NotNull
	private List<DmDev> dmDevs;

	public IdeTrabalhador getIdeTrabalhador() {
		return ideTrabalhador;
	}

	public Remun setIdeTrabalhador(IdeTrabalhador ideTrabalhador) {
		this.ideTrabalhador = ideTrabalhador;
		return this;
	}

	public List<DmDev> getDmDevs() {
		return dmDevs;
	}

	public Remun setDmDevs(List<DmDev> dmDevs) {
		this.dmDevs = dmDevs;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Remun)) {
			return false;
		}
		Remun castOther = (Remun) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(ideTrabalhador, castOther.ideTrabalhador)
				.append(dmDevs, castOther.dmDevs)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(ideTrabalhador)
				.append(dmDevs)
				.toHashCode();
	}
}
