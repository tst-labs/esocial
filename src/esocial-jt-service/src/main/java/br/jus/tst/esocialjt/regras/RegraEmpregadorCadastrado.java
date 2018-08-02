package br.jus.tst.esocialjt.regras;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;

@Component
public class RegraEmpregadorCadastrado extends Regra {

	@Autowired
	private EventoServico eventoServico;

	@Override
	public List<Regra> regras() {
		Regra regra = new RegraEvento(eventoServico)
				.dosTipos(TipoEvento.S1000)
				.nosEstados(Estado.PROCESSADO_COM_SUCESSO)
				.existe();

		return Arrays.asList(regra);
	}
}
