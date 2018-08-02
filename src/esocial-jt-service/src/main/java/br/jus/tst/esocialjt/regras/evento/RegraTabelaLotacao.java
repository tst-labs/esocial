package br.jus.tst.esocialjt.regras.evento;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.regras.Regra;
import br.jus.tst.esocialjt.regras.RegraEventosTabela;

@Component
public class RegraTabelaLotacao extends Regra {

	@Autowired
	private RegraEventosTabela regraEventosTabela;

	@Override
	public List<Regra> regras() {
		return Arrays.asList(regraEventosTabela);
	}
	
}
