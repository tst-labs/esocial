package br.jus.tst.esocial.dominio.afasttemp;

import javax.validation.Valid;

public class InfoAfastamento {
	@Valid
	private IniAfastamento iniAfastamento;
	
	@Valid
	private InfoRetif infoRetif;
	
	@Valid
	private FimAfastamento fimAfastamento;

	public IniAfastamento getIniAfastamento() {
		return iniAfastamento;
	}

	public void setIniAfastamento(IniAfastamento iniAfastamento) {
		this.iniAfastamento = iniAfastamento;
	}

	public InfoRetif getInfoRetif() {
		return infoRetif;
	}

	public void setInfoRetif(InfoRetif infoRetif) {
		this.infoRetif = infoRetif;
	}

	public FimAfastamento getFimAfastamento() {
		return fimAfastamento;
	}

	public void setFimAfastamento(FimAfastamento fimAfastamento) {
		this.fimAfastamento = fimAfastamento;
	}
}
