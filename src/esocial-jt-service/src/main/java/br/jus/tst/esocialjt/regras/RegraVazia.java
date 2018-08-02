package br.jus.tst.esocialjt.regras;

import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.evento.EventoDTO;

@Component
public class RegraVazia extends Regra{

	@Override
	public boolean habilitado(EventoDTO eventoDTO) {
		return true;
	}
}
