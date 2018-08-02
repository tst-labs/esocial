package br.jus.tst.esocial.dominio.tabela.horario;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;

import br.jus.tst.esocial.dominio.periodo.IdePeriodo;

public class InfoHorContratual {

	@NotNull
	@Valid
	private IdeHorContrat ideHorContratual;

	@NotNull
	@Valid
	private DadosHorContratual dadosHorContratual;
	
	@Valid
	private IdePeriodo novaValidade;
	
	public DadosHorContratual getDadosHorContratual() {
		return dadosHorContratual;
	}

	public void setDadosHorContratual(DadosHorContratual dadosHorContratual) {
		this.dadosHorContratual = dadosHorContratual;
	}

	public IdeHorContrat getIdeHorContratual() {
		return ideHorContratual;
	}

	public void setIdeHorContratual(IdeHorContrat ideHorContratual) {
		this.ideHorContratual = ideHorContratual;
	}
	
	public IdePeriodo getNovaValidade() {
		return novaValidade;
	}

	public void setNovaValidade(IdePeriodo novaValidade) {
		this.novaValidade = novaValidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ideHorContratual == null) ? 0 : ideHorContratual.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoHorContratual other = (InfoHorContratual) obj;
		
		return new EqualsBuilder()
				.append(ideHorContratual, other.ideHorContratual)
				.isEquals();
	}

}
