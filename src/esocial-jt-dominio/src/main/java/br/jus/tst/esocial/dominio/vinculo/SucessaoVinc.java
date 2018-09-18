package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;

public class SucessaoVinc {

	@NotNull
	@CNPJ
	private String cnpjEmpregAnt;
	
	@NotNull
	@Size(min=1, max=30)
	private String matricAnt;
	
	private Calendar dtAdm;
	
	@NotNull
	private Calendar dtTransf;

	@Size(min=3, max=255)
	private String observacao;
	
	public String getCnpjEmpregAnt() {
		return cnpjEmpregAnt;
	}

	public void setCnpjEmpregAnt(String cnpjEmpregadorAnterior) {
		this.cnpjEmpregAnt = cnpjEmpregadorAnterior;
	}

	public String getMatricAnt() {
		return matricAnt;
	}

	public void setMatricAnt(String matriculaAnterior) {
		this.matricAnt = matriculaAnterior;
	}

	public Calendar getDtAdm() {
		return dtAdm;
	}

	public void setDtAdm(Calendar dtAdm) {
		this.dtAdm = dtAdm;
	}

	public Calendar getDtTransf() {
		return dtTransf;
	}

	public void setDtTransf(Calendar dataInicioVinculo) {
		this.dtTransf = dataInicioVinculo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
