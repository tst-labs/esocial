package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.Valid;

import org.hibernate.validator.constraints.Length;

public class InfoPCD {

	@Valid
	@Length(max = 20)
	private String nrProcJud;

	public String getNrProcJud() {
		return nrProcJud;
	}
	
	public InfoPCD setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
		return this;
	}
}
