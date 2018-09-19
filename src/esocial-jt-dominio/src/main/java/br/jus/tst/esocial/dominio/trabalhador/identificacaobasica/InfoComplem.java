package br.jus.tst.esocial.dominio.trabalhador.identificacaobasica;

import java.util.Calendar;

import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.vinculo.SucessaoVinc;

public class InfoComplem {
	
	@Size(min=2, max=70)
	private String nmTrab;

	private Calendar dtNascto;

	private SucessaoVinc sucessaoVinc;

	public String getNmTrab() {
		return nmTrab;
	}

	public void setNmTrab(String nmTrab) {
		this.nmTrab = nmTrab;
	}

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public void setDtNascto(Calendar dtNascto) {
		this.dtNascto = dtNascto;
	}

	public SucessaoVinc getSucessaoVinc() {
		return sucessaoVinc;
	}

	public void setSucessaoVinc(SucessaoVinc sucessaoVinc) {
		this.sucessaoVinc = sucessaoVinc;
	}
	
	
}
