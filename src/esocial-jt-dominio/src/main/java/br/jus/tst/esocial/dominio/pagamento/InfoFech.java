package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.enums.SimNao;

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

}
