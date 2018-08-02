package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class IdeTomadorServ {

	private byte tpInsc;
	
	@NotNull
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;
	
	@Valid
	private IdeEstabVinc ideEstabVinc;
	
	public byte getTpInsc() {
		return tpInsc;
	}
	public void setTpInsc(byte tipoInscricao) {
		this.tpInsc = tipoInscricao;
	}
	public String getNrInsc() {
		return nrInsc;
	}
	public void setNrInsc(String numeroInscricao) {
		this.nrInsc = numeroInscricao;
	}
	public IdeEstabVinc getIdeEstabVinc() {
		return ideEstabVinc;
	}
	public void setIdeEstabVinc(IdeEstabVinc ideEstabVinc) {
		this.ideEstabVinc = ideEstabVinc;
	}
}
