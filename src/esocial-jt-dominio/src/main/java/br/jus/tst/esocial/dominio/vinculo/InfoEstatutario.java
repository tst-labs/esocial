package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoEstatutario {
	
	@NotNull
	private byte tpProv;
	
	@NotNull
	private Calendar dtExercicio;
	
	private Byte tpPlanRP;
	
	private SimNao indTetoRGPS;
	
    private SimNao indAbonoPerm;
    
    private Calendar dtIniAbono;

	public byte getTpProv() {
		return tpProv;
	}

	public void setTpProv(byte tpProv) {
		this.tpProv = tpProv;
	}

	public Calendar getDtExercicio() {
		return dtExercicio;
	}

	public void setDtExercicio(Calendar dtExercicio) {
		this.dtExercicio = dtExercicio;
	}

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

	public Calendar getDtIniAbono() {
		return dtIniAbono;
	}

	public void setDtIniAbono(Calendar dtIniAbono) {
		this.dtIniAbono = dtIniAbono;
	}
}
