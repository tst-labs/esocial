package br.jus.tst.esocial.dominio.beneficio.cadastro;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.validation.constraints.Size;

public class DadosBeneficio {

	private Byte tpBenef;
	
	@Size(min=3, max=20)
	private String nrBenefic;
	
	private Calendar dtIniBenef;
	
	private BigDecimal vrBenef;
	
	private InfoPenMorte infoPenMorte;

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

	public Calendar getDtIniBenef() {
		return dtIniBenef;
	}

	public void setDtIniBenef(Calendar dtIniBenef) {
		this.dtIniBenef = dtIniBenef;
	}

	public BigDecimal getVrBenef() {
		return vrBenef;
	}

	public void setVrBenef(BigDecimal vrBenef) {
		this.vrBenef = vrBenef;
	}

	public InfoPenMorte getInfoPenMorte() {
		return infoPenMorte;
	}

	public void setInfoPenMorte(InfoPenMorte infoPenMorte) {
		this.infoPenMorte = infoPenMorte;
	}

	
}
