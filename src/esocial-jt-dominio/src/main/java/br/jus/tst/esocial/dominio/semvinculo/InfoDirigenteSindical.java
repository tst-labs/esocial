package br.jus.tst.esocial.dominio.semvinculo;

import java.util.Calendar;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

public class InfoDirigenteSindical {
	
	@NotNull
	private Integer categOrig;
	
	@CNPJ
	private String cnpjOrigem;
	private Calendar dtAdmOrig;
	
	@Min(1)
	@Max(30)
	private String matricOrig;

	public Integer getCategOrig() {
		return categOrig;
	}

	public InfoDirigenteSindical setCategOrig(Integer categoriaOrigem) {
		this.categOrig = categoriaOrigem;
		return this;
	}

	public String getCnpjOrigem() {
		return cnpjOrigem;
	}

	public InfoDirigenteSindical setCnpjOrigem(String cnpjOrigem) {
		this.cnpjOrigem = cnpjOrigem;
		return this;
	}

	public Calendar getDtAdmOrig() {
		return dtAdmOrig;
	}

	public InfoDirigenteSindical setDtAdmOrig(Calendar dataAdmissaoOrigem) {
		this.dtAdmOrig = dataAdmissaoOrigem;
		return this;
	}

	public String getMatricOrig() {
		return matricOrig;
	}

	public InfoDirigenteSindical setMatricOrig(String matriculaOrigem) {
		this.matricOrig = matriculaOrigem;
		return this;
	}

}
