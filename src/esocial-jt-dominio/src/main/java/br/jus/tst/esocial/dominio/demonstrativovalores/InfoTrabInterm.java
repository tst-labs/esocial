package br.jus.tst.esocial.dominio.demonstrativovalores;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InfoTrabInterm {
	
	@NotNull
	@Size(min=1, max=30)
	private String codConv;

	public String getCodConv() {
		return codConv;
	}

	public void setCodConv(String codConv) {
		this.codConv = codConv;
	}
	
}
