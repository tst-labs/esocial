package br.jus.tst.esocial.dominio.tabela.horario;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class DadosHorContratual {
	
	@NotNull
	private String hrEntr;

	@NotNull
	private String hrSaida;

	@NotNull
	private BigInteger durJornada;

	@NotNull
	private String perHorFlexivel;

	@Valid
	private List<HorarioIntervalo> horarioIntervalo;

	public String getHrEntr() {
		return hrEntr;
	}

	public void setHrEntr(String hrEntr) {
		this.hrEntr = hrEntr;
	}

	public String getHrSaida() {
		return hrSaida;
	}

	public void setHrSaida(String hrSaida) {
		this.hrSaida = hrSaida;
	}

	public BigInteger getDurJornada() {
		return durJornada;
	}

	public void setDurJornada(BigInteger durJornada) {
		this.durJornada = durJornada;
	}

	public String getPerHorFlexivel() {
		return perHorFlexivel;
	}

	public void setPerHorFlexivel(String perHorFlexivel) {
		this.perHorFlexivel = perHorFlexivel;
	}

	public List<HorarioIntervalo> getHorarioIntervalo() {
		return horarioIntervalo;
	}

	public void setHorarioIntervalo(List<HorarioIntervalo> horarioIntervalo) {
		this.horarioIntervalo = horarioIntervalo;
	}
}
