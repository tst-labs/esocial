package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SucessaoVinc {

	private byte tpInsc;

	@NotNull
	@Size(min=8, max=14)
	private String nrInsc;
	
	@NotNull
	private String matricAnt;
	
	@NotNull
	private Calendar dtTransf;

	@Size(min=3, max=255)
	private String observacao;

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

	public String getMatricAnt() {
		return matricAnt;
	}

	public void setMatricAnt(String matricAnt) {
		this.matricAnt = matricAnt;
	}

	public Calendar getDtTransf() {
		return dtTransf;
	}

	public void setDtTransf(Calendar dtTransf) {
		this.dtTransf = dtTransf;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
