package br.jus.tst.esocial.dominio.pagamento;

import br.jus.tst.esocial.dominio.enums.SimNao;

import javax.validation.constraints.NotNull;

public class InfoFech {

	@NotNull
	private SimNao evtRemun;
	
	@NotNull
	private SimNao evtComProd;
	
	@NotNull
	private SimNao evtContratAvNP;

	@NotNull
	private SimNao evtInfoComplPer;

	private String indExcApur1250;

	private String transDCTFWeb;

	private String naoValid;

	private SimNao evtPgtos;

	public SimNao getEvtRemun() {
		return evtRemun;
	}

	public void setEvtRemun(SimNao evtRemun) {
		this.evtRemun = evtRemun;
	}

	public SimNao getEvtComProd() {
		return evtComProd;
	}

	public void setEvtComProd(SimNao evtComProd) {
		this.evtComProd = evtComProd;
	}

	public SimNao getEvtContratAvNP() {
		return evtContratAvNP;
	}

	public void setEvtContratAvNP(SimNao evtContratAvNP) {
		this.evtContratAvNP = evtContratAvNP;
	}

	public SimNao getEvtInfoComplPer() {
		return evtInfoComplPer;
	}

	public void setEvtInfoComplPer(SimNao evtInfoComplPer) {
		this.evtInfoComplPer = evtInfoComplPer;
	}

	public String getIndExcApur1250() {
		return indExcApur1250;
	}

	public void setIndExcApur1250(String indExcApur1250) {
		this.indExcApur1250 = indExcApur1250;
	}

	public String getTransDCTFWeb() {
		return transDCTFWeb;
	}

	public void setTransDCTFWeb(String transDCTFWeb) {
		this.transDCTFWeb = transDCTFWeb;
	}

	public String getNaoValid() {
		return naoValid;
	}

	public void setNaoValid(String naoValid) {
		this.naoValid = naoValid;
	}

	public SimNao getEvtPgtos() {
		return evtPgtos;
	}

	public void setEvtPgtos(SimNao evtPgtos) {
		this.evtPgtos = evtPgtos;
	}
}
