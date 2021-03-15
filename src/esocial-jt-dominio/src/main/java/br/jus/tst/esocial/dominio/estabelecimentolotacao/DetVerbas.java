package br.jus.tst.esocial.dominio.estabelecimentolotacao;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DetVerbas {
	@NotNull
	@Size(min=1, max=30)
	private String codRubr;
	
	@NotNull
	@Size(min=1, max=8)
	private String ideTabRubr;
	
	private BigDecimal qtdRubr;
	
	private BigDecimal fatorRubr;
	
	@NotNull
	private BigDecimal vrRubr;
	
	private Byte indApurIR;

	public String getCodRubr() {
		return codRubr;
	}

	public void setCodRubr(String codRubr) {
		this.codRubr = codRubr;
	}

	public String getIdeTabRubr() {
		return ideTabRubr;
	}

	public void setIdeTabRubr(String ideTabRubr) {
		this.ideTabRubr = ideTabRubr;
	}

	public BigDecimal getQtdRubr() {
		return qtdRubr;
	}

	public void setQtdRubr(BigDecimal qtdRubr) {
		this.qtdRubr = qtdRubr;
	}

	public BigDecimal getFatorRubr() {
		return fatorRubr;
	}

	public void setFatorRubr(BigDecimal fatorRubr) {
		this.fatorRubr = fatorRubr;
	}

	public BigDecimal getVrRubr() {
		return vrRubr;
	}

	public void setVrRubr(BigDecimal vrRubr) {
		this.vrRubr = vrRubr;
	}

	public Byte getIndApurIR() {
		return indApurIR;
	}

	public void setIndApurIR(Byte indApurIR) {
		this.indApurIR = indApurIR;
	}
	
}
