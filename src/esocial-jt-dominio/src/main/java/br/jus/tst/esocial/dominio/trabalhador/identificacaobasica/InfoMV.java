package br.jus.tst.esocial.dominio.trabalhador.identificacaobasica;

import java.util.List;

import javax.validation.Valid;

public class InfoMV {
	
	private byte indMV;
	
	@Valid
	private List<RemunOutrEmpr> remunOutrEmpr;

	public byte getIndMV() {
		return indMV;
	}

	public void setIndMV(byte indMV) {
		this.indMV = indMV;
	}

	public List<RemunOutrEmpr> getRemunOutrEmpr() {
		return remunOutrEmpr;
	}

	public void setRemunOutrEmpr(List<RemunOutrEmpr> remunOutrEmpr) {
		this.remunOutrEmpr = remunOutrEmpr;
	}
	
}
