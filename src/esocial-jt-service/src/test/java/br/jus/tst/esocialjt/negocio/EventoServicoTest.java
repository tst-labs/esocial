package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.empregador.InfoEmpregador;
import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocialjt.dominio.*;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
public class EventoServicoTest {

	@Autowired
	EventoServico eventoServico;

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveGerarEvento() {

		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setTipoOcorrencia(TipoOcorrencia.INFORMACOES_EMPREGADOR);
		ocorrencia.setDadosOcorrencia(getInformacoesEmpregador());
		ocorrencia.setOperacao(Operacao.INCLUSAO);
		ocorrencia.setReferencia("123");
		ocorrencia.setDataOcorrencia(
				new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
		ocorrencia.setDataRecebimento(
				new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));

		Evento evento = eventoServico.gerarEvento(ocorrencia, TipoEvento.INFORMACOES_EMPREGADOR);

		assertNotNull(evento);
		assertEquals(TipoOcorrencia.INFORMACOES_EMPREGADOR.name(), evento.getOcorrencia().getTipoOcorrencia().name());
		assertThat(evento.getIdEvento()).isNotNull().isNotBlank();

	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosEventosUsandoConsulta() {
		List<Evento> eventos = eventoServico.criarConsulta().buscar();
		assertThat(eventos).extracting("id").contains(1l, 2l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosEventosEmFila() {
		List<Evento> eventos = eventoServico.criarConsulta().nosEstados(Estado.EM_FILA).buscar();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosEventosEmDoisEstados() {
		List<Evento> eventos = eventoServico.criarConsulta().nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO).buscar();
		assertThat(eventos).extracting("id").containsOnly(1l, 2l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosEventosPeloId() {
		List<Evento> eventos = eventoServico.criarConsulta().comIds(1l).buscar();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosEventosDTOPeloId() {
		List<EventoDTO> eventos = eventoServico.criarConsulta().comIds(1l).buscarDTO();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosEventosPeloIdeEstado() {
		List<Evento> eventos = eventoServico.criarConsulta().comIds(1l).nosEstados(Estado.EM_FILA).buscar();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosEventosPeloIdeSemRetorno() {
		List<Evento> eventos = eventoServico.criarConsulta().comIds(2l).nosEstados(Estado.EM_FILA).buscar();
		assertThat(eventos).isEmpty();
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarPeloTipo() {
		List<Evento> eventos = eventoServico.criarConsulta().dosTipos(TipoEvento.S1000).buscar();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarPorTresParametros() {
		List<Evento> eventos = eventoServico.criarConsulta().comIds(1l).nosEstados(Estado.EM_FILA)
				.dosTipos(TipoEvento.S1000).buscar();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosSeParametroVazio() {
		List<Evento> eventos = eventoServico.criarConsulta().nosEstados().buscar();
		assertThat(eventos).extracting("id").contains(1l, 2l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosDTOSeParametroVazio() {
		List<EventoDTO> eventos = eventoServico.criarConsulta().nosEstados().buscarDTO();
		assertThat(eventos).extracting("id").contains(1l, 2l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarPorIdEvento() {
		List<Evento> eventos = eventoServico.criarConsulta().comIdsEvento("ID1005099680001482017111609242200001")
				.buscar();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarPorDoisIdEvento() {
		List<Evento> eventos = eventoServico.criarConsulta()
				.comIdsEvento("ID1005099680001482017111609242200001", "ID1005099680001482017111609242200002").buscar();
		assertThat(eventos).extracting("id").containsOnly(1l, 2l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarPorReferencia() {
		List<Evento> eventos = eventoServico.criarConsulta().comReferencias("1").buscar();
		assertThat(eventos).extracting("id").containsOnly(1l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarPeloGrupo() {
		List<Evento> eventos = eventoServico.criarConsulta().dosGrupos(new GrupoTipoEvento(1l)).buscar();
		assertThat(eventos).extracting("id").containsOnly(1l, 2l, 3l, 5l);
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveSerVerdadeiroSeEventoExiste() {
		boolean existe = eventoServico.criarConsulta().nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO).existe();
		assertThat(existe).isTrue();
	}

	@Test
	@DataSet(value = { "ocorrencia.yml", "lote.yml", "evento.yml" }, executeScriptsBefore = "cleanup.sql")
	public void deveSerFalsoSeEventoNaoExiste() {

		boolean existe = eventoServico.criarConsulta().dosTipos(TipoEvento.ADMISSAO_TRABALHADOR).nosEstados(Estado.ERRO)
				.existe();

		assertThat(existe).isFalse();
	}

	private InformacoesEmpregador getInformacoesEmpregador() {
		InformacoesEmpregador informacoesEmpregador = new InformacoesEmpregador();
		informacoesEmpregador.setIdeEmpregador(new IdeEmpregador());
		informacoesEmpregador.getIdeEmpregador().setNrInsc("00509968000148");

		InfoEmpregador infoEmpregador = new InfoEmpregador();

		informacoesEmpregador.setInfoEmpregador(infoEmpregador);

		return informacoesEmpregador;
	}

	@Test
	@Transactional
	@DataSet(value = {"ocorrencia.yml", "lote.yml", "evento.yml", "envio-evento.yml"}, executeScriptsBefore = "cleanup.sql")
	public void deveAbortarLoteEForcarErro() throws ComunicacaoEsocialGovException {
		List<Evento> eventos = eventoServico.abortarTodosEmProcessamento();

		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(eventos.size()).isEqualTo(1);
		eventos.forEach(evento -> {
			soft.assertThat(evento.getEstado().getDescricao()).isEqualTo(Estado.ERRO.getDescricao());
		});

		soft.assertAll();
	}

}
