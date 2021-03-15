package br.jus.tst.esocial.dominio.vinculo;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TrabTemporario {

	private byte hipLeg;
	
	@NotNull
	@Size(min=3, max=999)
	private String justContr;
	
	@NotNull
	@Valid
	private IdeEstabVinc ideEstabVinc;
	
	@Valid
	private List<IdeTrabSubstituido> ideTrabSubstituido;
	
	public byte getHipLeg() {
		return hipLeg;
	}
	public void setHipLeg(byte hipoteseLegal) {
		this.hipLeg = hipoteseLegal;
	}
	public String getJustContr() {
		return justContr;
	}
	public void setJustContr(String justificativa) {
		this.justContr = justificativa;
	}
	public List<IdeTrabSubstituido> getIdeTrabSubstituido() {
		return ideTrabSubstituido;
	}
	public void setIdeTrabSubstituido(List<IdeTrabSubstituido> trabalhadorSubstituido) {
		this.ideTrabSubstituido = trabalhadorSubstituido;
	}
	public IdeEstabVinc getIdeEstabVinc() {
		return ideEstabVinc;
	}
	public void setIdeEstabVinc(IdeEstabVinc ideEstabVinc) {
		this.ideEstabVinc = ideEstabVinc;
	}
}
