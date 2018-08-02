package br.jus.tst.esocialjt.regras.evento;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.regras.Regra;
import br.jus.tst.esocialjt.regras.RegraVazia;

@Component
public class RegraInformacoesEmpregador extends Regra{
	
	@Autowired
	private RegraVazia regraVazia;

	@Override
	public List<Regra> regras() {
		return Arrays.asList(regraVazia);
	}
}
