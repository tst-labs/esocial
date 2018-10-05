package br.jus.tst.esocialjt.regras.evento;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.regras.Regra;
import br.jus.tst.esocialjt.regras.RegraEmpregadorCadastrado;
import br.jus.tst.esocialjt.regras.RegraNaoHaEventoNaoPeriodicoEmFila;
import br.jus.tst.esocialjt.regras.RegraNaoHaEventoTabelaEmFila;
import br.jus.tst.esocialjt.regras.RegraNaoHaPagamentoEmFila;
import br.jus.tst.esocialjt.regras.RegraNaoHaRemuneracaoEmFila;

@Component
public class RegraFechamentoPeriodicos extends Regra {
	
	@Autowired
	private RegraEmpregadorCadastrado empregadorCadastrado;
	
	@Autowired
	private RegraNaoHaEventoTabelaEmFila naoHaEventoTabelaEmFila;
	
	@Autowired
	private RegraNaoHaEventoNaoPeriodicoEmFila naoHaEventoNaoPeriodicoEmFila; 
	
	@Autowired
	private RegraNaoHaRemuneracaoEmFila naoHaRemuneracaoEmFila; 

	@Autowired
	private RegraNaoHaPagamentoEmFila regraNaoHaPagamentoEmFila; 
	
	@Override
	public List<Regra> regras(){
		return Arrays.asList(
				empregadorCadastrado, 
				naoHaEventoTabelaEmFila, 
				naoHaEventoNaoPeriodicoEmFila,
				naoHaRemuneracaoEmFila,
				regraNaoHaPagamentoEmFila);
	}
}
