package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;
import br.jus.tst.esocial.dominio.pagamento.IdeBenef;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Optional;

public class Pgtos extends DadosOcorrencia {

	@Valid
	private IdeEventoFolha ideEvento;
	
	@Valid
	private IdeBenef ideBenef;
	
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

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Calendar getDataEvento() {
		return null;
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
