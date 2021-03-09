package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class Contato {
	@Size(min=8, max=13)
	private String fonePrinc;
	
	@Email
	private String emailPrinc;
	
	public String getFonePrinc() {
		return fonePrinc;
	}
	public void setFonePrinc(String fonePrincipal) {
		this.fonePrinc = fonePrincipal;
	}
	public String getEmailPrinc() {
		return emailPrinc;
	}
	public void setEmailPrinc(String emailPrincipal) {
		this.emailPrinc = emailPrincipal;
	}
}
