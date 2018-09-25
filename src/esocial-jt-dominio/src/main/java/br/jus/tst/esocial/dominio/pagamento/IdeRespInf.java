package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class IdeRespInf {
	
	@NotNull
	@Size(min=2, max=70)
	private String nmResp;
	
	@NotNull
	@CPF
	private String cpfResp;
	
	@Size(min=8, max=13)
	private String telefone;
	
	@Email
	private String email;

	public String getNmResp() {
		return nmResp;
	}

	public void setNmResp(String nmResp) {
		this.nmResp = nmResp;
	}

	public String getCpfResp() {
		return cpfResp;
	}

	public void setCpfResp(String cpfResp) {
		this.cpfResp = cpfResp;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
