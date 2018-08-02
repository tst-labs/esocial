package br.jus.tst.esocialjt.regras;

import java.util.Collections;
import java.util.List;

import br.jus.tst.esocialjt.evento.EventoDTO;

public abstract class Regra {
	
	public List<Regra> regras(){
		return Collections.emptyList();
	};
	
	public boolean habilitado(EventoDTO eventoDTO) {
		return regras().stream().allMatch(regra -> regra.habilitado(eventoDTO));
	}
}
