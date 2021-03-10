package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoEstatutario {
	
	@NotNull
	private Byte tpPlanRP;
	
	@NotNull
	private SimNao indTetoRGPS;
	
	@NotNull
    private SimNao indAbonoPerm;

	public Byte getTpPlanRP() {
		return tpPlanRP;
	}

	public void setTpPlanRP(Byte tpPlanRP) {
		this.tpPlanRP = tpPlanRP;
	}

	public SimNao getIndTetoRGPS() {
		return indTetoRGPS;
	}

	public void setIndTetoRGPS(SimNao indTetoRGPS) {
		this.indTetoRGPS = indTetoRGPS;
	}

	public SimNao getIndAbonoPerm() {
		return indAbonoPerm;
	}

	public void setIndAbonoPerm(SimNao indAbonoPerm) {
		this.indAbonoPerm = indAbonoPerm;
	}
}
