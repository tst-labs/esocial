package br.jus.tst.esocial.dominio.desligamento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProcCS {
	
	@NotNull
	@Size(min=3, max=21)
	private String nrProcJud;

	public String getNrProcJud() {
		return nrProcJud;
	}

	public void setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
	}
	
}
