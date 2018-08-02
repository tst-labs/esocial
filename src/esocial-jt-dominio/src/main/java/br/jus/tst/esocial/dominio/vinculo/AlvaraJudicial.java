package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AlvaraJudicial {
	@NotNull
	@Size(min=1, max=20)
	private String nrProcJud;

	public void setNrProcJud(String numeroProcesso) {
		this.nrProcJud = numeroProcesso;
	}

	public String getNrProcJud() {
		return nrProcJud;
	}

}
