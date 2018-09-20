package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;

public class IdePgtoExt {
	@Valid
	private IdePais idePais;

	@Valid
	private EndExt endExt;

	public IdePais getIdePais() {
		return idePais;
	}

	public void setIdePais(IdePais idePais) {
		this.idePais = idePais;
	}

	public EndExt getEndExt() {
		return endExt;
	}

	public void setEndExt(EndExt endExt) {
		this.endExt = endExt;
	}
	
}
