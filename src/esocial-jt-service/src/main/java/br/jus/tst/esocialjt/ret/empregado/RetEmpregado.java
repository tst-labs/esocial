package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ret.empregado.DadosCadastrais;
import br.jus.tst.esocial.ret.empregado.DadosContratuais;
import br.jus.tst.esocial.ret.empregado.Empregado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RetEmpregado {

	public Empregado empregado;
	public List<Ocorrencia> ocorrencias;

	public void addOcorrencia(Ocorrencia ocorrencia){
		if(this.ocorrencias == null){
			ocorrencias = new ArrayList<>();
		}
		ocorrencias.add(ocorrencia);
	}

	public String getCpf(){
		return Optional
				.ofNullable(empregado)
				.map(Empregado::getDadosCadastrais)
				.map(DadosCadastrais::getCpfTrab)
				.orElse(null);
	}

	public String getMatricula() {
		return Optional
				.ofNullable(empregado)
				.map(Empregado::getDadosContratuais)
				.map(DadosContratuais::getMatricula)
				.orElse(null);
	}
}
