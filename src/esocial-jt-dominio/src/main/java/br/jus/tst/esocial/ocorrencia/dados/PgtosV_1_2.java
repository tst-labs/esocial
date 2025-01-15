package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;
import br.jus.tst.esocial.dominio.pagamento.IdeBenefV_1_2;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class PgtosV_1_2 extends DadosOcorrencia implements DadosFolha {

	@Valid
	private IdeEventoFolha ideEvento;
	
	@Valid
	private IdeBenefV_1_2 ideBenef;
	
	public IdeEventoFolha getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEventoFolha ideEvento) {
		this.ideEvento = ideEvento;
	}

	public IdeBenefV_1_2 getIdeBenef() {
		return ideBenef;
	}

	public void setIdeBenef(IdeBenefV_1_2 ideBenef) {
		this.ideBenef = ideBenef;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		PgtosV_1_2 pgtosV12 = (PgtosV_1_2) o;

		return new EqualsBuilder().append(ideEvento, pgtosV12.ideEvento).append(ideBenef, pgtosV12.ideBenef).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(ideEvento).append(ideBenef).toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return null;
	}

	@Override
	public String getCpf() {
		return Optional
				.ofNullable(ideBenef)
				.map(IdeBenefV_1_2::getCpfBenef)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}

}
