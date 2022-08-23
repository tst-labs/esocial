package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonIgnoreProperties(value = {"dataEvento", "cpf", "matricula"}, allowGetters = true)
public abstract class DadosOcorrencia{

	@Valid
	@NotNull
	IdeEmpregador ideEmpregador;

	public abstract Calendar getDataEvento();
	
	public abstract String getCpf();

	public abstract String getMatricula();

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
