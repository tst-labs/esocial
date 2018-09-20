package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.pagamento.IdeBenef;
import br.jus.tst.esocial.dominio.pagamento.IdeEvento;

public class Pgtos extends DadosOcorrencia {

	@Valid
	private IdeEvento ideEvento;
	
	@Valid
	private IdeBenef ideBenef;
	
	public IdeEvento getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEvento ideEvento) {
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
