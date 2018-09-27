package br.jus.tst.esocial.dominio.beneficio.cadastro;

public class InfoBeneficio {

	private Byte tpPlanRP;

	private DadosBeneficio iniBeneficio;
	
	private DadosBeneficio altBeneficio;
	
	private FimBeneficio fimBeneficio;

	public Byte getTpPlanRP() {
		return tpPlanRP;
	}

	public void setTpPlanRP(Byte tpPlanRP) {
		this.tpPlanRP = tpPlanRP;
	}

	public DadosBeneficio getIniBeneficio() {
		return iniBeneficio;
	}

	public void setIniBeneficio(DadosBeneficio iniBeneficio) {
		this.iniBeneficio = iniBeneficio;
	}

	public DadosBeneficio getAltBeneficio() {
		return altBeneficio;
	}

	public void setAltBeneficio(DadosBeneficio altBeneficio) {
		this.altBeneficio = altBeneficio;
	}

	public FimBeneficio getFimBeneficio() {
		return fimBeneficio;
	}

	public void setFimBeneficio(FimBeneficio fimBeneficio) {
		this.fimBeneficio = fimBeneficio;
	}
		
}
