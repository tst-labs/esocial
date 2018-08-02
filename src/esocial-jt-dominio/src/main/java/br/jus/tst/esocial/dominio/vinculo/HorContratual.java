package br.jus.tst.esocial.dominio.vinculo;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HorContratual {

	@NotNull
	private BigDecimal qtdHrsSem;

	@NotNull
	private byte tpJornada;

	@Size(min = 3, max = 100)
	private String dscTpJorn;

	@NotNull
	private byte tmpParc;

	@NotNull
	@Valid
	@Size(min = 1, max = 99)
	private List<Horario> horario;

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

	public List<Horario> getHorario() {
		return horario;
	}

	public HorContratual setHorario(List<Horario> horarios) {
		this.horario = horarios;
		return this;
	}

}
