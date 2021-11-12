package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.Length;

public class InfoApr {

	@Valid
	@Length(max = 20)
	private String nrProcJud;
	
	private List<InfoEntEduc> infoEntEduc;

	public String getNrProcJud() {
		return nrProcJud;
	}

	public List<InfoEntEduc> getInfoEntEduc() {
		return infoEntEduc;
	}

	public InfoApr setInfoEntEduc(List<InfoEntEduc> infoEntEduc) {
		this.infoEntEduc = infoEntEduc;
		return this;
	}

	public InfoApr setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
		return this;
	}
}
