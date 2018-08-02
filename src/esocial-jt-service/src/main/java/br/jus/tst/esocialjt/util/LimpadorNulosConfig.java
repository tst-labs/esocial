package br.jus.tst.esocialjt.util;

import java.util.ArrayList;
import java.util.List;

public class LimpadorNulosConfig {
	
	private List<String> listaNaoLimpar = new ArrayList<>();
	
	public LimpadorNulosConfig naoLimparPropriedade(String nomePropriedade) {
		listaNaoLimpar.add(nomePropriedade);
		return this;
	}
	
	public boolean isPropriedadeMarcadaNaoLimpar(String nomePropriedade) {
		return listaNaoLimpar.contains(nomePropriedade);
	}
}
