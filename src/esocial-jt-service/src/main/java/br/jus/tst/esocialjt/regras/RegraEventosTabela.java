package br.jus.tst.esocialjt.regras;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegraEventosTabela extends Regra{
	
	@Autowired
	private RegraEmpregadorCadastrado regraEmpregadorCadastrado;
	
	@Override
	public List<Regra> regras() {
		return Arrays.asList(regraEmpregadorCadastrado);
	}
}
