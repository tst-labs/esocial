package br.jus.tst.esocial.dominio.afasttemp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Emitente {
	
	@NotNull
	@Size(min=2, max=70)
    private String nmEmit;
	
    private byte ideOC;
    
    @Size(min=3, max=14)
    private String nrOc; 
    
    private String ufOC;

	public String getNmEmit() {
		return nmEmit;
	}

	public void setNmEmit(String nmEmit) {
		this.nmEmit = nmEmit;
	}

	public byte getIdeOC() {
		return ideOC;
	}

	public void setIdeOC(byte ideOC) {
		this.ideOC = ideOC;
	}

	public String getNrOc() {
		return nrOc;
	}

	public void setNrOc(String nrOc) {
		this.nrOc = nrOc;
	}

	public String getUfOC() {
		return ufOC;
	}

	public void setUfOC(String ufOC) {
		this.ufOC = ufOC;
	}
}
