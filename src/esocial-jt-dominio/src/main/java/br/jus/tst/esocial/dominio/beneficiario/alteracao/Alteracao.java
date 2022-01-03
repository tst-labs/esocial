package br.jus.tst.esocial.dominio.beneficiario.alteracao;

import java.util.Calendar;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Alteracao {
	
	@NotNull
	private Calendar dtAlteracao;
	
	@NotNull
	@Valid
	private DadosBenef dadosBenef;

	public Calendar getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Calendar dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public DadosBenef getDadosBenef() {
		return dadosBenef;
	}

	public void setDadosBenef(DadosBenef dadosBenef) {
		this.dadosBenef = dadosBenef;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dadosBenef, dtAlteracao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alteracao other = (Alteracao) obj;
		return Objects.equals(dadosBenef, other.dadosBenef) && Objects.equals(dtAlteracao, other.dtAlteracao);
	}
}
