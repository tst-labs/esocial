package br.jus.tst.esocialjt.regras;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegraEventosTabelaTest{

	@Autowired
	private RegraEventosTabela regra; 
	
	@Test
	public void testarComposicaoDeRegras() {
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class
		);
	}
}
