package br.jus.tst.esocial.dominio.desligamento;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class IdeEstabLot {

	private byte tpInsc;
	
	@Valid
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;
	
	@Size(min=1, max=30)
	private String codLotacao;
	
	@Valid
	private List<DetVerbas> detVerbas;
	
	@Valid
	private InfoSaudeColet infoSaudeColet;
	
	@Valid
	private InfoAgNocivo infoAgNocivo;
	
	@Valid
	private InfoSimples infoSimples;

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

	public String getCodLotacao() {
		return codLotacao;
	}

	public void setCodLotacao(String codLotacao) {
		this.codLotacao = codLotacao;
	}

	public List<DetVerbas> getDetVerbas() {
		return detVerbas;
	}

	public void setDetVerbas(List<DetVerbas> detVerbas) {
		this.detVerbas = detVerbas;
	}

	public InfoSaudeColet getInfoSaudeColet() {
		return infoSaudeColet;
	}

	public void setInfoSaudeColet(InfoSaudeColet infoSaudeColet) {
		this.infoSaudeColet = infoSaudeColet;
	}

	public InfoAgNocivo getInfoAgNocivo() {
		return infoAgNocivo;
	}

	public void setInfoAgNocivo(InfoAgNocivo infoAgNocivo) {
		this.infoAgNocivo = infoAgNocivo;
	}

	public InfoSimples getInfoSimples() {
		return infoSimples;
	}

	public void setInfoSimples(InfoSimples infoSimples) {
		this.infoSimples = infoSimples;
	}
	
}
