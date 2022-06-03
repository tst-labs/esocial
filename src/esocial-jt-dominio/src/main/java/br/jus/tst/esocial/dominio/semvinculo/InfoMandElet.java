package br.jus.tst.esocial.dominio.semvinculo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

import java.math.BigInteger;
import java.util.Calendar;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoMandElet {
	
	private SimNao indRemunCargo;
	private byte tpRegTrab;
	private byte tpRegPrev;

	@NotNull
	private BigInteger categOrig;

	@CNPJ
	private String cnpjOrig;

	private String matricOrig;

	@NotNull
	private Calendar dtExercOrig;
	
	public SimNao getIndRemunCargo() {
		return indRemunCargo;
	}
	public void setIndRemunCargo(SimNao indRemunCargo) {
		this.indRemunCargo = indRemunCargo;
	}
	public byte getTpRegTrab() {
		return tpRegTrab;
	}
	public void setTpRegTrab(byte tpRegTrab) {
		this.tpRegTrab = tpRegTrab;
	}
	public byte getTpRegPrev() {
		return tpRegPrev;
	}
	public void setTpRegPrev(byte tpRegPrev) {
		this.tpRegPrev = tpRegPrev;
	}
	public BigInteger getCategOrig() {
		return categOrig;
	}
	public void setCategOrig(BigInteger categOrig) {
		this.categOrig = categOrig;
	}
	public String getCnpjOrig() {
		return cnpjOrig;
	}
	public void setCnpjOrig(String cnpjOrig) {
		this.cnpjOrig = cnpjOrig;
	}
	public String getMatricOrig() {
		return matricOrig;
	}
	public void setMatricOrig(String matricOrig) {
		this.matricOrig = matricOrig;
	}
	public Calendar getDtExercOrig() {
		return dtExercOrig;
	}
	public void setDtExercOrig(Calendar dtExercOrig) {
		this.dtExercOrig = dtExercOrig;
	}
}
