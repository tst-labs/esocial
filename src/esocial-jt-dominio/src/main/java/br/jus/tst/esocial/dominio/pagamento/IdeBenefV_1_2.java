package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public class IdeBenefV_1_2 {
	
	@NotNull
	@Pattern(regexp="\\d{11}")
	private String cpfBenef;
	
	@Valid
	private List<InfoPgto> infoPgto;

	@Valid
	private InfoIRComplem infoIRComplem;

	public String getCpfBenef() {
		return cpfBenef;
	}

	public void setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
	}

	public List<InfoPgto> getInfoPgto() {
		return infoPgto;
	}

	public void setInfoPgto(List<InfoPgto> infoPgto) {
		this.infoPgto = infoPgto;
	}

	public InfoIRComplem getInfoIRComplem() {
		return infoIRComplem;
	}

	public void setInfoIRComplem(InfoIRComplem infoIRComplem) {
		this.infoIRComplem = infoIRComplem;
	}
}
