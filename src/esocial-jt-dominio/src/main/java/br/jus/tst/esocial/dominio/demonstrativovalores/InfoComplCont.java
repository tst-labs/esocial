package br.jus.tst.esocial.dominio.demonstrativovalores;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

public class InfoComplCont {

	@NotNull
	@Length(min = 6, max = 6)
	@Pattern(regexp = "\\d{4,6}")
	private String codCBO;

	private Byte natAtividade;

	private Byte qtdDiasTrab;

	public String getCodCBO() {
		return codCBO;
	}

	public void setCodCBO(String codCBO) {
		this.codCBO = codCBO;
	}

	public Byte getNatAtividade() {
		return natAtividade;
	}

	public void setNatAtividade(Byte natAtividade) {
		this.natAtividade = natAtividade;
	}

	public Byte getQtdDiasTrab() {
		return qtdDiasTrab;
	}

	public void setQtdDiasTrab(Byte qtdDiasTrab) {
		this.qtdDiasTrab = qtdDiasTrab;
	}
	
	
}
