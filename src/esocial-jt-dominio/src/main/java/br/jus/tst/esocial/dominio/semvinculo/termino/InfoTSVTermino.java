package br.jus.tst.esocial.dominio.semvinculo.termino;

import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.termino.Quarentena;

public class InfoTSVTermino {
	
	@NotNull
	private Calendar dtTerm;
	
	private String mtvDesligTSV;
	
	@Valid
	private VerbasResc verbasResc;

	@Valid
	private Quarentena quarentena;

	public Calendar getDtTerm() {
		return dtTerm;
	}

	public void setDtTerm(Calendar dtTerm) {
		this.dtTerm = dtTerm;
	}

	public String getMtvDesligTSV() {
		return mtvDesligTSV;
	}

	public void setMtvDesligTSV(String mtvDesligTSV) {
		this.mtvDesligTSV = mtvDesligTSV;
	}

	public VerbasResc getVerbasResc() {
		return verbasResc;
	}

	public void setVerbasResc(VerbasResc verbasResc) {
		this.verbasResc = verbasResc;
	}

	public Quarentena getQuarentena() {
		return quarentena;
	}

	public void setQuarentena(Quarentena quarentena) {
		this.quarentena = quarentena;
	}
	
}
