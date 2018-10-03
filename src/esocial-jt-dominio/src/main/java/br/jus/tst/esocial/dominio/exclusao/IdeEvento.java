package br.jus.tst.esocial.dominio.exclusao;

import javax.validation.constraints.Size;

public class IdeEvento {
	
	private Byte tpAmb;
	
	private Byte procEmi;
	
	@Size(min=1, max=20)
	private String verProc;

	public Byte getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(Byte tpAmb) {
		this.tpAmb = tpAmb;
	}

	public Byte getProcEmi() {
		return procEmi;
	}

	public void setProcEmi(Byte procEmi) {
		this.procEmi = procEmi;
	}

	public String getVerProc() {
		return verProc;
	}

	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}
	
	
}
