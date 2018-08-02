package br.jus.tst.esocialjt.negocio;

import java.util.Arrays;

import javax.persistence.EntityManager;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocialjt.RetornoProcessamentoBuilder;
import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.comunicacaogov.RetornoErroProcessamento;
import br.jus.tst.esocialjt.comunicacaogov.RetornoProcessamento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
public class AtualizacaoProcessamentoServicoTest {

	@Autowired
	@InjectMocks
	private AtualizacaoProcessamentoServico atualizacaoProcessamentoServico;

	@MockBean
	private ComunicacaoEsocialGov comunicacaoEsocialGov;

	@Autowired
	private EntityManager em;
	
	@Test
	@Transactional
	@DataSet(value = {"ocorrencia.yml", "lote.yml", "evento.yml", "envio-evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveAtualizarRetornoProcessamentoLoteQuandoSucesso() throws ComunicacaoEsocialGovException {
		Lote lote = em.find(Lote.class, 2l);

		RetornoProcessamento retornoProcessamento = new RetornoProcessamentoBuilder(lote).criar();

		setRespostaEsperada(retornoProcessamento);

		Lote loteProcessado = atualizacaoProcessamentoServico.atualizarProcessamentoLote(Arrays.asList(lote)).get(0);

		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(loteProcessado.getEstado().getDescricao())
				.isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
		soft.assertThat(loteProcessado.getResposta().getCodResposta()).isEqualTo(201l);
		soft.assertAll();
	}

	@Test
	@Transactional
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml", "envio-evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveAtualizarRetornoProcessamentoLoteQuandoHaErro() throws ComunicacaoEsocialGovException {
		Lote lote = em.find(Lote.class, 2l);

		RetornoProcessamento retornoProcessamento = new RetornoProcessamentoBuilder(lote)
				.respostaLote(401, "Erro", new RetornoErroProcessamento(1, 537, "Erro", "lote"))
				.respostaEvento("ID1005099680001482017111609242200003", 401, "Erro").criar();

		setRespostaEsperada(retornoProcessamento);

		Lote loteProcessado = atualizacaoProcessamentoServico.atualizarProcessamentoLote(Arrays.asList(lote)).get(0);

		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(loteProcessado.getEstado().getDescricao()).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
		soft.assertThat(loteProcessado.getResposta().getCodResposta()).isEqualTo(401l);

		soft.assertAll();
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveAtualizarRetornoProcessamentoLoteQuandoEstadoAguardandoProcessamento()
			throws ComunicacaoEsocialGovException {
		Lote lote = em.find(Lote.class, 3l);

		RetornoProcessamento retornoProcessamento = new RetornoProcessamentoBuilder(lote).naoProcessado().criar();

		setRespostaEsperada(retornoProcessamento);

		Lote loteProcessado = atualizacaoProcessamentoServico.atualizarProcessamentoLote(Arrays.asList(lote)).get(0);

		SoftAssertions soft = new SoftAssertions();

		soft.assertThat(loteProcessado.getEstado().getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());
		soft.assertThat(loteProcessado.getResposta().getCodResposta()).isEqualTo(101l);

		soft.assertAll();
	}

	@Test
	@DataSet(value = {"ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveManterEstadoSeErroComunicacao() throws ComunicacaoEsocialGovException {
		Lote lote = em.find(Lote.class, 3l);

		Mockito.when(comunicacaoEsocialGov.consultarLoteEventos(Mockito.anyString()))
				.thenThrow(new ComunicacaoEsocialGovException("Erro de comunicação"));

		atualizacaoProcessamentoServico.atualizarProcessamentoLote(Arrays.asList(lote));

		SoftAssertions soft = new SoftAssertions();

		soft.assertThat(lote.getEstado().getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());

		soft.assertAll();
	}

	private void setRespostaEsperada(RetornoProcessamento retornoProcessamento) throws ComunicacaoEsocialGovException {
		Mockito.when(comunicacaoEsocialGov.consultarLoteEventos(Mockito.anyString())).thenReturn(retornoProcessamento);
	}
}
