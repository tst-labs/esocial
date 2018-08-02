package br.jus.tst.esocialjt.negocio;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocialjt.dominio.CodigoResposta;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
public class CodigoRespostaServicoTest {

	@Autowired
	CodigoRespostaServico codigoRespostaServico;
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveRetornarCodigoRespostaExistenteParaLote() {
		long codigoResposta = 201;
		int codigoGrupo = 1;

		List<CodigoResposta> listaCodigoResposta = codigoRespostaServico.obterCodigoResposta(codigoResposta,
				codigoGrupo);
		assertNotNull(listaCodigoResposta);
		assertThat(listaCodigoResposta).extracting("codResposta").contains(201l);

	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveRetornarCodigoRespostaExistenteParaEvento() {
		long codigoResposta = 401;
		int codigoGrupo = 2;

		List<CodigoResposta> listaCodigoResposta = codigoRespostaServico.obterCodigoResposta(codigoResposta,
				codigoGrupo);
		assertNotNull(listaCodigoResposta);
		assertThat(listaCodigoResposta).extracting("id").contains(4l);

	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveRetornarUmCodigoRespostaExistente() {
		CodigoResposta codigoResposta = new CodigoResposta(1, 201l, "Sucesso");
		codigoResposta = codigoRespostaServico.obterCodigoResposta(codigoResposta);

		assertNotNull(codigoResposta);
		assertThat(codigoResposta).extracting("codResposta").contains(201l);
	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveGravarUmCodigoRespostaNãoExistente() {
		CodigoResposta codigoResposta = new CodigoResposta(2, 601l, "TESTE");
		codigoResposta = codigoRespostaServico.obterCodigoResposta(codigoResposta);

		assertNotNull(codigoResposta);
		assertThat(codigoResposta).extracting("codResposta").contains(601l);
	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveRetornarUmCodigoRespostaExistenteSemGravarNovo() {
		CodigoResposta codigoResposta = new CodigoResposta(2, 201l, "TESTE");
		codigoResposta = codigoRespostaServico.obterCodigoResposta(codigoResposta);

		SoftAssertions soft = new SoftAssertions();

		assertNotNull(codigoResposta);

		soft.assertThat(codigoResposta.getDesResposta()).isEqualToIgnoringCase("Sucesso");
		soft.assertThat(codigoResposta.getCodResposta()).isEqualTo(201l);

		soft.assertAll();
	}

}
