package br.jus.tst.esocialjt.regras.evento;

import br.jus.tst.esocialjt.regras.Regra;
import br.jus.tst.esocialjt.regras.RegraEmpregadorCadastrado;
import br.jus.tst.esocialjt.regras.RegraNaoHaEventoTabelaEmFila;
import br.jus.tst.esocialjt.regras.RegraNaoHaIngressoTrabEmFila;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RegraCAT extends Regra {
	
	@Autowired
	private RegraEmpregadorCadastrado empregadorCadastrado;
	
	@Autowired
	private RegraNaoHaEventoTabelaEmFila naoHaEventoTabelaEmFila;

	@Autowired
	private RegraNaoHaIngressoTrabEmFila naoHaIngressoTrabEmFila;
	
	@Override
	public List<Regra> regras(){
		return Arrays.asList(empregadorCadastrado, naoHaEventoTabelaEmFila, naoHaIngressoTrabEmFila);
	}
}
