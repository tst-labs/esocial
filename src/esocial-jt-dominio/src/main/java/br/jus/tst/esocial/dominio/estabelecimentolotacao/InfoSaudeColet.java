package br.jus.tst.esocial.dominio.estabelecimentolotacao;

import java.util.List;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.termino.DetOper;

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
