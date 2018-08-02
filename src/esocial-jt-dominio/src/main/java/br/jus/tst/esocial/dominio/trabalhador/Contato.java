package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class Contato {
	@Size(min=8, max=13)
	private String fonePrinc;
	
	@Size(min=8, max=13)
	private String foneAlternat;

	@Email
	private String emailPrinc;
	
	@Email
	private String emailAlternat;
	
	public String getFonePrinc() {
		return fonePrinc;
	}
	public void setFonePrinc(String fonePrincipal) {
		this.fonePrinc = fonePrincipal;
	}
	public String getFoneAlternat() {
		return foneAlternat;
	}
	public void setFoneAlternat(String foneAlternativo) {
		this.foneAlternat = foneAlternativo;
	}
	public String getEmailPrinc() {
		return emailPrinc;
	}
	public void setEmailPrinc(String emailPrincipal) {
		this.emailPrinc = emailPrincipal;
	}
	public String getEmailAlternat() {
		return emailAlternat;
	}
	public void setEmailAlternat(String emailAlternativo) {
		this.emailAlternat = emailAlternativo;
	}
}
