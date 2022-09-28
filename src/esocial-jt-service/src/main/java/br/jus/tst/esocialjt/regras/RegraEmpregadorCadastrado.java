package br.jus.tst.esocialjt.regras;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class RegraEmpregadorCadastrado extends Regra {

	@Autowired
	private EventoServico eventoServico;

	@Autowired
	private RegraVazia regraVazia;

	@Value("${esocialjt.regra-empregador-cadastrado.habilitado}")
	Boolean habilitado;

	@Override
	public List<Regra> regras() {
		Regra regra;
		if (habilitado) {
			regra = new RegraEvento(eventoServico)
					.dosTipos(TipoEvento.S1000)
					.nosEstados(Estado.PROCESSADO_COM_SUCESSO)
					.existe();
		} else {
			regra = regraVazia;
		}
		return Collections.singletonList(regra);
	}
}
