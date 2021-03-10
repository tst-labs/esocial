package br.jus.tst.esocial.dominio.demonstrativovalores;

import java.util.List;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdePeriodo;
import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoPerAnt {

	@Valid
	private List<IdeADC> ideADC;
	
	@Valid
	private List<IdePeriodo> idePeriodo;
	
	@Valid
	private SimNao remunOrgSuc;

	public List<IdeADC> getIdeADC() {
		return ideADC;
	}

	public void setIdeADC(List<IdeADC> ideADC) {
		this.ideADC = ideADC;
	}

	public List<IdePeriodo> getIdePeriodo() {
		return idePeriodo;
	}

	public void setIdePeriodo(List<IdePeriodo> idePeriodo) {
		this.idePeriodo = idePeriodo;
	}

	public SimNao getRemunOrgSuc() {
		return remunOrgSuc;
	}

	public void setRemunOrgSuc(SimNao remunOrgSuc) {
		this.remunOrgSuc = remunOrgSuc;
	}
	
}
