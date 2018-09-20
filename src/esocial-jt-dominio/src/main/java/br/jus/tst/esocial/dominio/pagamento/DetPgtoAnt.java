package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class DetPgtoAnt {
	@NotNull
	private BigInteger codCateg;

	@Valid
	@NotNull
	private List<InfoPgtoAnt> infoPgtoAnt;

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
		this.codCateg = codCateg;
	}

	public List<InfoPgtoAnt> getInfoPgtoAnt() {
		return infoPgtoAnt;
	}

	public void setInfoPgtoAnt(List<InfoPgtoAnt> infoPgtoAnt) {
		this.infoPgtoAnt = infoPgtoAnt;
	}
	
}
