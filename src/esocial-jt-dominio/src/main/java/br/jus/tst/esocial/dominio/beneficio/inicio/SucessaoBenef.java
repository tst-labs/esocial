package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class SucessaoBenef {

	@NotNull
	private String cnpjOrgaoAnt;

	@NotNull
	private String nrBeneficioAnt;

	@NotNull
	private Calendar dtTransf;

	private String observacao;

	public String getCnpjOrgaoAnt() {
		return cnpjOrgaoAnt;
	}

	public void setCnpjOrgaoAnt(String cnpjOrgaoAnt) {
		this.cnpjOrgaoAnt = cnpjOrgaoAnt;
	}

	public String getNrBeneficioAnt() {
		return nrBeneficioAnt;
	}

	public void setNrBeneficioAnt(String nrBeneficioAnt) {
		this.nrBeneficioAnt = nrBeneficioAnt;
	}

	public Calendar getDtTransf() {
		return dtTransf;
	}

	public void setDtTransf(Calendar dtTransf) {
		this.dtTransf = dtTransf;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
