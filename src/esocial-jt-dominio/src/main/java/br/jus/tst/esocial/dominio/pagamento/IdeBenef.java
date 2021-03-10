package br.jus.tst.esocial.dominio.pagamento;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class IdeBenef {
	
	@NotNull
	@Pattern(regexp="\\d{11}")
	private String cpfBenef;
	
	@Valid
	private List<InfoPgto> infoPgto;

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

}
