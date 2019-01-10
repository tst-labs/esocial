package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class FGTS {
	@NotNull
	private byte opcFGTS;
	
	private Calendar dtOpcFGTS;

	public byte getOpcFGTS() {
		return opcFGTS;
	}

	public void setOpcFGTS(byte opcaoFGTS) {
		this.opcFGTS = opcaoFGTS;
	}

	public Calendar getDtOpcFGTS() {
		return dtOpcFGTS;
	}

	public void setDtOpcFGTS(Calendar dataOpcaoFgts) {
		this.dtOpcFGTS = dataOpcaoFgts;
	}

}
