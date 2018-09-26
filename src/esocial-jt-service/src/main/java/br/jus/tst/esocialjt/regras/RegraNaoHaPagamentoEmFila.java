package br.jus.tst.esocialjt.regras;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;

@Component
public class RegraNaoHaPagamentoEmFila extends Regra{
	
	@Autowired
	private EventoServico eventoServico;
	
	@Override
	public List<Regra> regras() {
		RegraEvento naoHaPagamentoEmFila = new RegraEvento(eventoServico)
				.dosTipos(TipoEvento.PAGAMENTOS)
				.nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO)
				.naoExiste();
	
		return Arrays.asList(naoHaPagamentoEmFila);
	};
}
