package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral.Alteracao;
import br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral.IdeTrabalhador;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Optional;

public class AltCadastral extends DadosOcorrencia {
	
	@Valid
	@NotNull
	private IdeTrabalhador ideTrabalhador;

	@Valid
	@NotNull
	private Alteracao alteracao;

	public IdeTrabalhador getIdeTrabalhador() {
		return ideTrabalhador;
	}

	public AltCadastral setIdeTrabalhador(IdeTrabalhador ideTrabalhador) {
		this.ideTrabalhador = ideTrabalhador;
		return this;
	}

	public Alteracao getAlteracao() {
		return alteracao;
	}

	public AltCadastral setAlteracao(Alteracao alteracao) {
		this.alteracao = alteracao;
		return this;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AltContratual)) {
			return false;
		}
		AltCadastral castOther = (AltCadastral) other;
		return new EqualsBuilder()
					.append(ideEmpregador, castOther.ideEmpregador)
					.append(ideTrabalhador, castOther.ideTrabalhador)
					.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(ideEmpregador)
					.append(ideTrabalhador)
					.toHashCode();
	}

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(alteracao)
				.map(Alteracao::getDtAlteracao)
				.orElse(null);
	}

	@Override
	public String getCpf() {
		return Optional
					.ofNullable(ideTrabalhador)
					.map(IdeTrabalhador::getCpfTrab)
					.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}
}
