package br.jus.tst.esocialjt.negocio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.comunicacaogov.RetornoErroProcessamento;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.ErroProcessamento;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
public class ErroProcessamentoServicoTest {

	@Autowired
	ErroProcessamentoServico erroProcessamentoServico;

	@Autowired
	ConsultaLoteServico consultarLote;

	@MockBean
	ComunicacaoEsocialGov comunicacaoEsocialGov;
	
	@Test
	@DataSet(value = {"erro-processamento.yml", "lote.yml", "evento.yml", "ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarErroPorID() {
		ErroProcessamento erroProcessamento = erroProcessamentoServico.recuperaPorId(1L);
		assertThat(erroProcessamento).isNotNull();
	}

	@Test
	public void deveRetornarErroProcessamento() {
		RetornoErroProcessamento retornoErroProcessamento = new RetornoErroProcessamento();
		retornoErroProcessamento.setCodigo(537);
		retornoErroProcessamento.setTipo(1);
		retornoErroProcessamento.setDescricao("Erro");
		retornoErroProcessamento.setLocalizacao("evento");
		
		ErroProcessamento erroProcessamento = erroProcessamentoServico
				.retornaErroProcessamento(Arrays.asList(retornoErroProcessamento), new EnvioEvento())
				.iterator()
				.next();
		
		SoftAssertions soft = new SoftAssertions();
		
		
		soft.assertThat(erroProcessamento.getLocalizacao()).isEqualTo("evento");
		soft.assertThat(erroProcessamento.getDescricao()).contains("Erro");
		soft.assertThat(erroProcessamento.getCodMensagem()).isEqualTo(537l);
		soft.assertThat(erroProcessamento.getTipoErroProcessamento().getId()).isEqualTo(1l);
		
		
		soft.assertAll();
	}

}
