package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

import java.util.ArrayList;

public interface ProcessadorEmpregado {
	void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia);
}
