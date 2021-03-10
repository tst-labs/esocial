package br.jus.tst.esocial.dominio.semvinculo;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoMandElet {
	
	private SimNao indRemunCargo;
	private byte tpRegTrab;
	private byte tpRegPrev;
	
	public SimNao getIndRemunCargo() {
		return indRemunCargo;
	}
	public void setIndRemunCargo(SimNao indRemunCargo) {
		this.indRemunCargo = indRemunCargo;
	}
	public byte getTpRegTrab() {
		return tpRegTrab;
	}
	public void setTpRegTrab(byte tpRegTrab) {
		this.tpRegTrab = tpRegTrab;
	}
	public byte getTpRegPrev() {
		return tpRegPrev;
	}
	public void setTpRegPrev(byte tpRegPrev) {
		this.tpRegPrev = tpRegPrev;
	}
      
      
}
