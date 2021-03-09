package br.jus.tst.esocial.dominio.vinculo;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class HorContratual {

	@NotNull
	private BigDecimal qtdHrsSem;

	private byte tpJornada;

	@Size(min = 3, max = 100)
	private String dscTpJorn;

	private byte tmpParc;
	
	private SimNao horNoturno;

	private String dscJorn;


	public BigDecimal getQtdHrsSem() {
		return qtdHrsSem;
	}

	public HorContratual setQtdHrsSem(BigDecimal qtdHorasSemanais) {
		this.qtdHrsSem = qtdHorasSemanais;
		return this;
	}

	public byte getTpJornada() {
		return tpJornada;
	}

	public HorContratual setTpJornada(byte tipoJornada) {
		this.tpJornada = tipoJornada;
		return this;
	}

	public String getDscTpJorn() {
		return dscTpJorn;
	}

	public HorContratual setDscTpJorn(String descricaoTipoJornada) {
		this.dscTpJorn = descricaoTipoJornada;
		return this;
	}

	public byte getTmpParc() {
		return tmpParc;
	}

	public HorContratual setTmpParc(byte tempoParcial) {
		this.tmpParc = tempoParcial;
		return this;
	}

	public SimNao getHorNoturno() {
		return horNoturno;
	}

	public void setHorNoturno(SimNao horNoturno) {
		this.horNoturno = horNoturno;
	}

	public String getDscJorn() {
		return dscJorn;
	}

	public void setDscJorn(String dscJorn) {
		this.dscJorn = dscJorn;
	}
}
