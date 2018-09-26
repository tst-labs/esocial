package br.jus.tst.esocialjt.regras.evento;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.regras.Regra;
import br.jus.tst.esocialjt.regras.RegraEmpregadorCadastrado;
import br.jus.tst.esocialjt.regras.RegraNaoHaEventoNaoPeriodicoEmFila;
import br.jus.tst.esocialjt.regras.RegraNaoHaEventoTabelaEmFila;

@Component
public class RegraRemuneracaoRGPS extends Regra {
	
	@Autowired
	private RegraEmpregadorCadastrado empregadorCadastrado;
	
	@Autowired
	private RegraNaoHaEventoTabelaEmFila naoHaEventoTabelaEmFila;
	
	@Autowired
	private RegraNaoHaEventoNaoPeriodicoEmFila regraNaoHaEventoNaoPeriodicoEmFila; 
	
	@Override
	public List<Regra> regras(){
		return Arrays.asList(
				empregadorCadastrado, 
				naoHaEventoTabelaEmFila, 
				regraNaoHaEventoNaoPeriodicoEmFila);
	}
}
