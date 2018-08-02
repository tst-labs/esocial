package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InfoDecJud {
	@NotNull
	@Size(min=1, max=20)
	private String nrProcJud;

	public InfoDecJud setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
		return this;
	}

	public String getNrProcJud() {
		return nrProcJud;
	}

}
