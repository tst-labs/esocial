package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;

@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
public abstract class DadosOcorrencia{

	@Valid
	@NotNull
	IdeEmpregador ideEmpregador;

	public IdeEmpregador getIdeEmpregador() {
		return ideEmpregador;
	}

	public DadosOcorrencia setIdeEmpregador(IdeEmpregador empregador) {
		this.ideEmpregador = empregador;
		return this;
	}
	
	@Override
	public abstract boolean equals(Object obj);
	
	@Override
	public abstract int hashCode();
}
