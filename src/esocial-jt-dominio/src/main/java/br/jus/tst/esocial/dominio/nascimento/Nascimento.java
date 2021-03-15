package br.jus.tst.esocial.dominio.nascimento;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Nascimento {
	
	@NotNull
	private Calendar dtNascto;
	
	@NotNull
	@Size(min=3, max=3)
	private String paisNascto;
	@NotNull
	@Size(min=3, max=3)
	private String paisNac;

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public Nascimento setDtNascto(Calendar dtNascto) {
		this.dtNascto = dtNascto;
		return this;
	}

	public String getPaisNascto() {
		return paisNascto;
	}

	public Nascimento setPaisNascto(String paisNascto) {
		this.paisNascto = paisNascto;
		return this;
	}

	public String getPaisNac() {
		return paisNac;
	}

	public Nascimento setPaisNac(String paisNac) {
		this.paisNac = paisNac;
		return this;
	}
}
