package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Horario {
	@NotNull
	private byte dia;
	
	@NotNull
	@Size(min=1, max=30)
	private String codHorContrat;

	public byte getDia() {
		return dia;
	}

	public Horario setDia(byte dia) {
		this.dia = dia;
		return this;
	}

	public String getCodHorContrat() {
		return codHorContrat;
	}

	public Horario setCodHorContrat(String codHorarioContratual) {
		this.codHorContrat = codHorarioContratual;
		return this;
	}

}
