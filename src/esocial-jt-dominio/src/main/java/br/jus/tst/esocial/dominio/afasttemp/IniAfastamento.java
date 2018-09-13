package br.jus.tst.esocial.dominio.afasttemp;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class IniAfastamento {

	@NotNull
	private Calendar dtIniAfast;
	
	@NotNull
	@Size(min=2, max=2)
	private String codMotAfast;
	
	@Pattern(regexp="[N|S]")
	private String infoMesmoMtv;
	
	private Byte tpAcidTransito;
	
	@Size(min=3, max=255)
	private String observacao;
	
	@Valid
	private List<InfoAtestado> infoAtestado;
	
	@Valid
	private InfoCessao infoCessao;
	
	@Valid
	private InfoMandSind infoMandSind;

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

	public String getInfoMesmoMtv() {
		return infoMesmoMtv;
	}

	public void setInfoMesmoMtv(String infoMesmoMtv) {
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

	public List<InfoAtestado> getInfoAtestado() {
		return infoAtestado;
	}

	public void setInfoAtestado(List<InfoAtestado> infoAtestado) {
		this.infoAtestado = infoAtestado;
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
	
}
