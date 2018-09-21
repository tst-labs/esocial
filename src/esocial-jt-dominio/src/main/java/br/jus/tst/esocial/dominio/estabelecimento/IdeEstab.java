package br.jus.tst.esocial.dominio.estabelecimento;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import br.jus.tst.esocial.dominio.estabelecimentolotacao.RemunPerAnt;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.RemunPerApur;

public class IdeEstab {

	private byte tpInsc;
	
	@Valid
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;
	
	private List<RemunPerApur> remunPerApur;

	private List<RemunPerAnt> remunPerAnt;

	public byte getTpInsc() {
		return tpInsc;
	}


	public void setTpInsc(byte tpInsc) {
		this.tpInsc = tpInsc;
	}


	public String getNrInsc() {
		return nrInsc;
	}


	public void setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
	}


	public List<RemunPerApur> getRemunPerApur() {
		return remunPerApur;
	}


	public void setRemunPerApur(List<RemunPerApur> remunPerApur) {
		this.remunPerApur = remunPerApur;
	}


	public List<RemunPerAnt> getRemunPerAnt() {
		return remunPerAnt;
	}


	public void setRemunPerAnt(List<RemunPerAnt> remunPerAnt) {
		this.remunPerAnt = remunPerAnt;
	}
	
	
}
