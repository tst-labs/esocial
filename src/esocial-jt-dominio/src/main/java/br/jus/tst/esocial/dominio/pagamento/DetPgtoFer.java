package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DetPgtoFer {
	
	@NotNull
	private BigInteger codCateg;
	
	@Size(min=1, max=30)
	private String matricula;
	
	@NotNull
	private Calendar dtIniGoz;
	
	private byte qtDias;
	
	@NotNull
	private BigDecimal vrLiq;
	
	@Valid
	@NotNull
	private List<DetRubrFer> detRubrFer;

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
		this.codCateg = codCateg;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Calendar getDtIniGoz() {
		return dtIniGoz;
	}

	public void setDtIniGoz(Calendar dtIniGoz) {
		this.dtIniGoz = dtIniGoz;
	}

	public byte getQtDias() {
		return qtDias;
	}

	public void setQtDias(byte qtDias) {
		this.qtDias = qtDias;
	}

	public BigDecimal getVrLiq() {
		return vrLiq;
	}

	public void setVrLiq(BigDecimal vrLiq) {
		this.vrLiq = vrLiq;
	}

	public List<DetRubrFer> getDetRubrFer() {
		return detRubrFer;
	}

	public void setDetRubrFer(List<DetRubrFer> detRubrFer) {
		this.detRubrFer = detRubrFer;
	}
	
}
