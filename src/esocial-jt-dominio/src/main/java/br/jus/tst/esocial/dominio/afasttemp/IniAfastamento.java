package br.jus.tst.esocial.dominio.afasttemp;

import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class IniAfastamento {

	@NotNull
	private Calendar dtIniAfast;
	
	@NotNull
	@Size(min=2, max=2)
	private String codMotAfast;
	
	private SimNao infoMesmoMtv;
	
	private Byte tpAcidTransito;
	
	@Size(min=3, max=255)
	private String observacao;
	
	@Valid
	private PerAquis perAquis;
	
	@Valid
	private InfoCessao infoCessao;
	
	@Valid
	private InfoMandSind infoMandSind;
	
	@Valid
	private InfoMandElet infoMandElet;

	public Calendar getDtIniAfast() {
		return dtIniAfast;
	}

	public void setDtIniAfast(Calendar dtIniAfast) {
		this.dtIniAfast = dtIniAfast;
	}

	public String getCodMotAfast() {
		return codMotAfast;
	}

	public void setCodMotAfast(String codMotAfast) {
		this.codMotAfast = codMotAfast;
	}

	public SimNao getInfoMesmoMtv() {
		return infoMesmoMtv;
	}

	public void setInfoMesmoMtv(SimNao infoMesmoMtv) {
		this.infoMesmoMtv = infoMesmoMtv;
	}

	public Byte getTpAcidTransito() {
		return tpAcidTransito;
	}

	public void setTpAcidTransito(Byte tpAcidTransito) {
		this.tpAcidTransito = tpAcidTransito;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public InfoCessao getInfoCessao() {
		return infoCessao;
	}

	public void setInfoCessao(InfoCessao infoCessao) {
		this.infoCessao = infoCessao;
	}

	public InfoMandSind getInfoMandSind() {
		return infoMandSind;
	}

	public void setInfoMandSind(InfoMandSind infoMandSind) {
		this.infoMandSind = infoMandSind;
	}

	public InfoMandElet getInfoMandElet() {
		return infoMandElet;
	}

	public void setInfoMandElet(InfoMandElet infoMandElet) {
		this.infoMandElet = infoMandElet;
	}

	public PerAquis getPerAquis() {
		return perAquis;
	}

	public void setPerAquis(PerAquis perAquis) {
		this.perAquis = perAquis;
	}
}
