package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class InfoFech {

	@NotNull
	@Pattern(regexp="[S|N]")
	private String evtRemun;
	
	@NotNull
	@Pattern(regexp="[S|N]")
	private String evtPgtos;
	
	@NotNull
	@Pattern(regexp="[S|N]")
	private String evtAqProd;
	
	@NotNull
	@Pattern(regexp="[S|N]")
	private String evtComProd;
	
	@NotNull
	@Pattern(regexp="[S|N]")
	private String evtContratAvNP;
	
	@NotNull
	@Pattern(regexp="[S|N]")
	private String evtInfoComplPer;
	
	@Size(min=0, max=7)
	private String compSemMovto;

	public String getEvtRemun() {
		return evtRemun;
	}

	public void setEvtRemun(String evtRemun) {
		this.evtRemun = evtRemun;
	}

	public String getEvtPgtos() {
		return evtPgtos;
	}

	public void setEvtPgtos(String evtPgtos) {
		this.evtPgtos = evtPgtos;
	}

	public String getEvtAqProd() {
		return evtAqProd;
	}

	public void setEvtAqProd(String evtAqProd) {
		this.evtAqProd = evtAqProd;
	}

	public String getEvtComProd() {
		return evtComProd;
	}

	public void setEvtComProd(String evtComProd) {
		this.evtComProd = evtComProd;
	}

	public String getEvtContratAvNP() {
		return evtContratAvNP;
	}

	public void setEvtContratAvNP(String evtContratAvNP) {
		this.evtContratAvNP = evtContratAvNP;
	}

	public String getEvtInfoComplPer() {
		return evtInfoComplPer;
	}

	public void setEvtInfoComplPer(String evtInfoComplPer) {
		this.evtInfoComplPer = evtInfoComplPer;
	}

	public String getCompSemMovto() {
		return compSemMovto;
	}

	public void setCompSemMovto(String compSemMovto) {
		this.compSemMovto = compSemMovto;
	}

}
