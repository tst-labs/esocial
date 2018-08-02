package br.jus.tst.esocial.dominio.vinculo;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Remuneracao {
	
	@NotNull
	private BigDecimal vrSalFx;
	
	@NotNull
	private byte undSalFixo;
	
	@Size(min=3, max=255)
	private String dscSalVar;

	public BigDecimal getVrSalFx() {
		return vrSalFx;
	}

	public Remuneracao setVrSalFx(BigDecimal valorSalarioFixo) {
		this.vrSalFx = valorSalarioFixo;
		return this;
	}

	public byte getUndSalFixo() {
		return undSalFixo;
	}

	public Remuneracao setUndSalFixo(byte unidadeSalarioFixo) {
		this.undSalFixo = unidadeSalarioFixo;
		return this;
	}

	public String getDscSalVar() {
		return dscSalVar;
	}

	public Remuneracao setDscSalVar(String descricaoSalarioVariavel) {
		this.dscSalVar = descricaoSalarioVariavel;
		return this;
	}

}
