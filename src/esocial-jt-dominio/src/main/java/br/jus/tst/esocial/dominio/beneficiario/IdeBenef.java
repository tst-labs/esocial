package br.jus.tst.esocial.dominio.beneficiario;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class IdeBenef {

	@NotNull
	@Pattern(regexp="\\d{11}")
	private String cpfBenef;
	
	@Size(min=1, max=70)
	private String nmBenefic;
		
	private DadosBenef dadosBenef;

	public String getCpfBenef() {
		return cpfBenef;
	}

	public void setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
	}

	public String getNmBenefic() {
		return nmBenefic;
	}

	public void setNmBenefic(String nmBenefic) {
		this.nmBenefic = nmBenefic;
	}

	public DadosBenef getDadosBenef() {
		return dadosBenef;
	}

	public void setDadosBenef(DadosBenef dadosBenef) {
		this.dadosBenef = dadosBenef;
	}
	
}
