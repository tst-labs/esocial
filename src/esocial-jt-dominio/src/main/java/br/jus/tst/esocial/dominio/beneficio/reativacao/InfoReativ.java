package br.jus.tst.esocial.dominio.beneficio.reativacao;

import java.util.Calendar;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class InfoReativ {
	@NotNull
	private Calendar dtEfetReativ;
	
	@NotNull
	private Calendar dtEfeito;

	public Calendar getDtEfetReativ() {
		return dtEfetReativ;
	}

	public void setDtEfetReativ(Calendar dtEfetReativ) {
		this.dtEfetReativ = dtEfetReativ;
	}

	public Calendar getDtEfeito() {
		return dtEfeito;
	}

	public void setDtEfeito(Calendar dtEfeito) {
		this.dtEfeito = dtEfeito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dtEfeito, dtEfetReativ);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoReativ other = (InfoReativ) obj;
		return Objects.equals(dtEfeito, other.dtEfeito) && Objects.equals(dtEfetReativ, other.dtEfetReativ);
	}
	
}
