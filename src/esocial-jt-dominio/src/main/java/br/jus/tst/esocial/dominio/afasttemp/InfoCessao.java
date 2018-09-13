package br.jus.tst.esocial.dominio.afasttemp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class InfoCessao {
	
	@NotNull
	@Pattern(regexp="\\d{8,14}")
	private String cnpjCess;
	
    private byte infOnus;
    
	public String getCnpjCess() {
		return cnpjCess;
	}
	public void setCnpjCess(String cnpjCess) {
		this.cnpjCess = cnpjCess;
	}
	public byte getInfOnus() {
		return infOnus;
	}
	public void setInfOnus(byte infOnus) {
		this.infOnus = infOnus;
	}
    
}
