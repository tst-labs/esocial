package br.jus.tst.esocial.dominio.beneficio.demonstrativovalores;

import br.jus.tst.esocial.dominio.folha.DescFolha;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class ItemRemun {
		@NotNull
	 	private String codRubr;
		@NotNull
	    private String ideTabRubr;
	    private BigDecimal qtdRubr;
	    private BigDecimal fatorRubr;
	    @NotNull
	    private BigDecimal vrRubr;
	    private byte indApurIR;
		private DescFolha descFolha;
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
		public byte getIndApurIR() {
			return indApurIR;
		}
		public void setIndApurIR(byte indApurIR) {
			this.indApurIR = indApurIR;
		}
		public DescFolha getDescFolha() {
			return descFolha;
		}
		public void setDescFolha(DescFolha descFolha) {
			this.descFolha = descFolha;
		}
}
