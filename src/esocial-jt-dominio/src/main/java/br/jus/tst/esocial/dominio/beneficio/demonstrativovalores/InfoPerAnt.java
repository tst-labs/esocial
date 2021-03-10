package br.jus.tst.esocial.dominio.beneficio.demonstrativovalores;

import java.util.List;

import javax.validation.Valid;

public class InfoPerAnt {
	
	@Valid
	private List<IdePeriodo> idePeriodo;

	public List<IdePeriodo> getIdePeriodo() {
		return idePeriodo;
	}

	public void setIdePeriodo(List<IdePeriodo> idePeriodo) {
		this.idePeriodo = idePeriodo;
	}
}
