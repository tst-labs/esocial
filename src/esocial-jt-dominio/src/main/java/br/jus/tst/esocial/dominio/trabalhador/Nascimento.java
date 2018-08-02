package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;

public class Nascimento {
	
	@NotNull
	private Calendar dtNascto;
	
	private Integer codMunic;
	
	private String uf;
	
	@NotNull
	@Size(min=3, max=3)
	private String paisNascto;
	@NotNull
	@Size(min=3, max=3)
	private String paisNac;
	
	@Size(min=2, max=70)
	private String nmMae;

	@Size(min=2, max=70)
	private String nmPai;

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public Nascimento setDtNascto(Calendar dtNascto) {
		this.dtNascto = dtNascto;
		return this;
	}

	public Integer getCodMunic() {
		return codMunic;
	}

	public Nascimento setCodMunic(Integer codMunic) {
		this.codMunic = codMunic;
		return this;
	}

	public String getUf() {
		return uf;
	}

	public Nascimento setUf(String uf) {
		this.uf = uf;
		return this;
	}

	public String getPaisNascto() {
		return paisNascto;
	}

	public Nascimento setPaisNascto(String paisNascto) {
		this.paisNascto = paisNascto;
		return this;
	}

	public String getNmMae() {
		return nmMae;
	}

	public Nascimento setNmMae(String nmMae) {
		this.nmMae = StringUtils.trim(nmMae);
		return this;
	}

	public String getNmPai() {
		return nmPai;
	}

	public Nascimento setNmPai(String nmPai) {
		this.nmPai = StringUtils.trim(nmPai);
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
