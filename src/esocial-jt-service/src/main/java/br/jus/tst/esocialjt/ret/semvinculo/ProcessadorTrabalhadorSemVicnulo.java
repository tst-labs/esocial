package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

import java.util.ArrayList;

public interface ProcessadorTrabalhadorSemVicnulo {
	void processaRegistro(ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo, Ocorrencia ocorrencia);
}
