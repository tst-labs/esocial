package br.jus.tst.esocialjt.regras;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;

@Component
public class RegraNaoHaEventoNaoPeriodicoEmFila extends Regra{
	
	@Autowired
	private EventoServico eventoServico;
	
	@Override
	public List<Regra> regras() {
		RegraEvento naoHaEventoNaoPeriodicoEmFila = new RegraEvento(eventoServico)
				.dosGrupos(GrupoTipoEvento.NAO_PERIODICO)
				.nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO)
				.naoExiste();
	
		return Arrays.asList(naoHaEventoNaoPeriodicoEmFila);
	};
}
