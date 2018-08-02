package br.jus.tst.esocial.dominio.empregador;

/**
 * Informações complementares sobre o declarante
 */
public class InfoComplementares {
	
	private SituacaoPJ situacaoPJ;
	private SituacaoPF situacaoPF;

	public SituacaoPJ getSituacaoPJ() {
		return situacaoPJ;
	}

	public InfoComplementares setSituacaoPJ(SituacaoPJ indSitPJ) {
		this.situacaoPJ = indSitPJ;
		return this;
	}
	
	public SituacaoPF getSituacaoPF() {
		return situacaoPF;
	}

	public InfoComplementares setSituacaoPF(SituacaoPF indSitPF) {
		this.situacaoPF = indSitPF;
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((situacaoPJ == null) ? 0 : situacaoPJ.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoComplementares other = (InfoComplementares) obj;
		if (situacaoPJ != other.situacaoPJ)
			return false;
		return true;
	}

}
