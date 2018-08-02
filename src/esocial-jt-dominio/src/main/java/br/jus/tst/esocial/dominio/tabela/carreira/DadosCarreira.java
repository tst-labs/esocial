package br.jus.tst.esocial.dominio.tabela.carreira;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class DadosCarreira {
	
	@NotNull
	@Length(min = 1, max = 100)
	private String dscCarreira;
	
	@Length(min = 0, max = 12)
	private String leiCarr;

	@NotNull
	private Calendar dtLeiCarr;
	
	@NotNull
	private byte sitCarr;

	public String getDscCarreira() {
		return dscCarreira;
	}

	public DadosCarreira setDscCarreira(String dscCarreira) {
		this.dscCarreira = dscCarreira;
		return this;
	}

	public String getLeiCarr() {
		return leiCarr;
	}

	public DadosCarreira setLeiCarr(String leiCarr) {
		this.leiCarr = leiCarr;
		return this;
	}

	public Calendar getDtLeiCarr() {
		return dtLeiCarr;
	}

	public DadosCarreira setDtLeiCarr(Calendar dtLeiCarr) {
		this.dtLeiCarr = dtLeiCarr;
		return this;
	}

	public byte getSitCarr() {
		return sitCarr;
	}

	public DadosCarreira setSitCarr(byte sitCarr) {
		this.sitCarr = sitCarr;
		return this;
	}
	
	
	
}
