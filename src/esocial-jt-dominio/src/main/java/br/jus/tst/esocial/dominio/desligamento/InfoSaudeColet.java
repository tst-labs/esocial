package br.jus.tst.esocial.dominio.desligamento;

import java.util.List;

import javax.validation.Valid;

public class InfoSaudeColet {

	@Valid
	private List<DetOper> detOper;

	public List<DetOper> getDetOper() {
		return detOper;
	}

	public void setDetOper(List<DetOper> detOper) {
		this.detOper = detOper;
	}
}
