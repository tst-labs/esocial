package br.jus.tst.esocial.dominio.beneficiario;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class IdeBenef {

	@NotNull
	@Pattern(regexp="\\d{11}")
	private String cpfBenef;

	public String getCpfBenef() {
		return cpfBenef;
	}

	public void setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
	}

}
