package br.jus.tst.esocial.dominio.beneficio.cadastro;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FimBeneficio {

	@NotNull
	private Byte tpBenef;
	
	@Size(min=3, max=20)
	private String nrBenefic;

	private Calendar dtFimBenef;
	
	private Byte mtvFim;

	public Byte getTpBenef() {
		return tpBenef;
	}

	public void setTpBenef(Byte tpBenef) {
		this.tpBenef = tpBenef;
	}

	public String getNrBenefic() {
		return nrBenefic;
	}

	public void setNrBenefic(String nrBenefic) {
		this.nrBenefic = nrBenefic;
	}

	public Calendar getDtFimBenef() {
		return dtFimBenef;
	}

	public void setDtFimBenef(Calendar dtFimBenef) {
		this.dtFimBenef = dtFimBenef;
	}

	public Byte getMtvFim() {
		return mtvFim;
	}

	public void setMtvFim(Byte mtvFim) {
		this.mtvFim = mtvFim;
	}
	
}
