package br.jus.tst.esocial.dominio.afasttemp;

import javax.validation.constraints.Size;

public class InfoRetif {
	
	private byte origRetif;
	
    private Byte tpProc;
    
    @Size(min=3, max=21)
    private String nrProc;

	public byte getOrigRetif() {
		return origRetif;
	}

	public void setOrigRetif(byte origRetif) {
		this.origRetif = origRetif;
	}

	public Byte getTpProc() {
		return tpProc;
	}

	public void setTpProc(Byte tpProc) {
		this.tpProc = tpProc;
	}

	public String getNrProc() {
		return nrProc;
	}

	public void setNrProc(String nrProc) {
		this.nrProc = nrProc;
	}
    
}
