package br.jus.tst.esocialjt.regras.evento;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.regras.Regra;
import br.jus.tst.esocialjt.regras.RegraEvento;
import br.jus.tst.esocialjt.regras.RegraEventosTabela;

@Component
public class RegraTabelaRubrica extends Regra {
	
	@Autowired
	private RegraEventosTabela regraEventosTabela;
	
	@Autowired
	private EventoServico eventoServico;
	
	@Override
	public List<Regra> regras() {
		Regra regra = new RegraEvento(eventoServico)
				.dosTipos(TipoEvento.S1070)
				.nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO)
				.naoExiste();
		
		return Arrays.asList(regraEventosTabela, regra);
	}
}
