package br.jus.tst.esocial.dominio.beneficio.cadastro;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class InfoPenMorte {

	@Size(min=1, max=30)
	private String idQuota;
	
	@CPF
	private String cpfInst;

	public String getIdQuota() {
		return idQuota;
	}

	public void setIdQuota(String idQuota) {
		this.idQuota = idQuota;
	}

	public String getCpfInst() {
		return cpfInst;
	}

	public void setCpfInst(String cpfInst) {
		this.cpfInst = cpfInst;
	}
	
}
