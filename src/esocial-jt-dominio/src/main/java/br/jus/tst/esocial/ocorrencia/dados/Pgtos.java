package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;
import br.jus.tst.esocial.dominio.pagamento.IdeBenef;

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

}
