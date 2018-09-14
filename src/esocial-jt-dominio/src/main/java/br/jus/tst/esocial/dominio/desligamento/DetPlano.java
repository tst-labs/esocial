package br.jus.tst.esocial.dominio.desligamento;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DetPlano {

	@NotNull
	private String tpDep;

	@Pattern(regexp="\\d{11}")
	private String cpfDep;
	
	@NotNull
	@Size(min=2, max=70)
	private String nmDep;
	
	@NotNull
	private Calendar dtNascto;
	
	@NotNull
	private BigDecimal vlrPgDep;

	public String getTpDep() {
		return tpDep;
	}

	public void setTpDep(String tpDep) {
		this.tpDep = tpDep;
	}

	public String getCpfDep() {
		return cpfDep;
	}

	public void setCpfDep(String cpfDep) {
		this.cpfDep = cpfDep;
	}

	public String getNmDep() {
		return nmDep;
	}

	public void setNmDep(String nmDep) {
		this.nmDep = nmDep;
	}

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public void setDtNascto(Calendar dtNascto) {
		this.dtNascto = dtNascto;
	}

	public BigDecimal getVlrPgDep() {
		return vlrPgDep;
	}

	public void setVlrPgDep(BigDecimal vlrPgDep) {
		this.vlrPgDep = vlrPgDep;
	}

}
