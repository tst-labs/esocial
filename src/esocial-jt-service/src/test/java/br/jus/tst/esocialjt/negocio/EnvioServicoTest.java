package br.jus.tst.esocialjt.negocio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.comunicacaogov.RetornoEnvio;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;
import br.jus.tst.esocialjt.ocorrencia.ExemploOcorrenciaServico;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
@Transactional
public class EnvioServicoTest {

	@Autowired
	private EnvioServico envioServico;
	
	@Autowired
	private EntityManager em;
	
	@MockBean
	private ComunicacaoEsocialGov comunicacaoEsocialGov;

	@Test
	public void deveRetornarListaVaziaSePassadoListaVazia() {
		List<EnvioEvento> resultado = envioServico.enviarEventosParaESocialGov(Collections.emptyList());
		assertThat(resultado).isEmpty();
	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveEnviarComSucesso() throws ComunicacaoEsocialGovException {
		
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenReturn(getRetorno());

		Evento evento = getEvento();
		
		EnvioEvento envio = envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		Lote lote = envio.getLote();
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(envio.getDtaGeracaoEvento()).isNotNull();
		soft.assertThat(envio.getVersao()).isNotEmpty();
		soft.assertThat(envio.getEvento().getIdEvento()).isEqualTo(evento.getIdEvento());
		
		soft.assertThat(lote.getDtaEnvio()).isNotNull();
		soft.assertThat(lote.getProtocolo()).isEqualTo("1.2.201711.0000000000000037150");
		soft.assertThat(lote.getRetorno()).isNotEmpty();
		soft.assertThat(lote.getResposta().getCodResposta()).isEqualTo(201l);
		soft.assertThat(lote.getEstado().getId()).isEqualTo(Estado.PROCESSAMENTO.getId());
		
		
		soft.assertThat(lote.getDtaEnvio()).isNotNull();
		soft.assertAll();
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveEnviarDuasVezes() throws ComunicacaoEsocialGovException {
		
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenReturn(getRetorno());

		Evento evento = getEvento();
		em.persist(evento);
		
		envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		
		Set<EnvioEvento> enviosEventoDoEvento = em.createQuery("Select e From Evento e", Evento.class)
				.getSingleResult()
				.getEnviosEvento();
		
		List<Long> idsEventos = enviosEventoDoEvento
				.stream()
				.map(EnvioEvento::getId)
				.collect(Collectors.toList());
		
		Long[] idsEnvioEvento = em.createQuery("Select e From EnvioEvento e", EnvioEvento.class)
				.getResultList()
				.stream()
				.map(EnvioEvento::getId)
				.toArray(Long[]::new);
		
		assertThat(idsEventos).containsOnly(idsEnvioEvento);
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveSalvarUmEventoDoisEnviosDoisLotes() throws ComunicacaoEsocialGovException {
		
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenReturn(getRetorno());

		Evento evento = getEvento();
		envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		
		Long qtdEvento = em.createQuery("SELECT COUNT(e) FROM Evento e", Long.class).getSingleResult(); 
		Long qtdLote = em.createQuery("SELECT COUNT(e) FROM Lote e", Long.class).getSingleResult(); 
		Long qtdEnvioEvento = em.createQuery("SELECT COUNT(e) FROM EnvioEvento e", Long.class).getSingleResult(); 
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(qtdEvento).as("Eventos salvos").isEqualTo(1);
		soft.assertThat(qtdLote).as("Lotes salvos").isEqualTo(2);
		soft.assertThat(qtdEnvioEvento).as("EnviosEventos salvos").isEqualTo(2);
		
		soft.assertAll();
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveSalvarUmEventoGerenciadoDoisEnviosDoisLotes() throws ComunicacaoEsocialGovException {
		
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenReturn(getRetorno());

		Evento evento = getEvento();
		evento = em.merge(evento);
		envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		
		Long qtdEvento = em.createQuery("SELECT COUNT(e) FROM Evento e", Long.class).getSingleResult(); 
		Long qtdLote = em.createQuery("SELECT COUNT(e) FROM Lote e", Long.class).getSingleResult(); 
		Long qtdEnvioEvento = em.createQuery("SELECT COUNT(e) FROM EnvioEvento e", Long.class).getSingleResult(); 
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(qtdEvento).as("Eventos salvos").isEqualTo(1);
		soft.assertThat(qtdLote).as("Lotes salvos").isEqualTo(2);
		soft.assertThat(qtdEnvioEvento).as("EnviosEventos salvos").isEqualTo(2);
		 
		soft.assertAll();
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveSalvarDoisEventosDoisEnviosUmLote() throws ComunicacaoEsocialGovException {
		
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenReturn(getRetorno());

		envioServico.enviarEventosParaESocialGov(Arrays.asList(getEvento(), getEvento()))
				.stream()
				.map(EnvioEvento::getEvento)
				.collect(Collectors.toList());
		
		Long qtdEvento = em.createQuery("SELECT COUNT(e) FROM Evento e", Long.class).getSingleResult(); 
		Long qtdLote = em.createQuery("SELECT COUNT(e) FROM Lote e", Long.class).getSingleResult(); 
		Long qtdEnvioEvento = em.createQuery("SELECT COUNT(e) FROM EnvioEvento e", Long.class).getSingleResult(); 
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(qtdEvento).as("Eventos salvos").isEqualTo(2);
		soft.assertThat(qtdLote).as("Lotes salvos").isEqualTo(1);
		soft.assertThat(qtdEnvioEvento).as("EnviosEventos salvos").isEqualTo(2);
		
		soft.assertAll();
	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveEnviarDoisEventoComSucesso() throws ComunicacaoEsocialGovException {
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenReturn(getRetorno());

		List<Evento> resultado = envioServico
				.enviarEventosParaESocialGov(Arrays.asList(getEvento(), getEvento()))
				.stream()
				.map(EnvioEvento::getEvento)
				.collect(Collectors.toList());
		
		TypedQuery<Lote> query = em.createQuery("SELECT l from Lote l", Lote.class);
		List<Lote> lotes = query.getResultList();

		Evento evento0 = resultado.get(0);
		Evento evento1 = resultado.get(1);
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(evento0.getEstado().getId()).isEqualTo(Estado.PROCESSAMENTO.getId());
		soft.assertThat(evento1.getEstado().getId()).isEqualTo(Estado.PROCESSAMENTO.getId());
		soft.assertThat(lotes.size()).isEqualTo(1);
		
		soft.assertAll();
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveEnviarUmEventoComSucessoOutroComErro() throws ComunicacaoEsocialGovException {
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenReturn(getRetorno());

		Evento eventoA = getEvento();
		Evento eventoB = getEvento();
		eventoB.getOcorrencia().getDadosOcorrencia().getIdeEmpregador().setNrInsc("INVALIDO");
		
		List<Evento> resultado = envioServico
				.enviarEventosParaESocialGov(Arrays.asList(eventoA, eventoB))
				.stream()
				.map(EnvioEvento::getEvento)
				.collect(Collectors.toList());

		Evento evento0 = resultado.get(0);
		Evento evento1 = resultado.get(1);
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(evento0.getEstado().getId()).isEqualTo(Estado.PROCESSAMENTO.getId());
		soft.assertThat(evento1.getEstado().getDescricao()).isEqualTo(Estado.ERRO.getDescricao());

		soft.assertAll();
	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveMudarEstadoParaErroSeEventoNaoPuderSerGerado() {
		Evento evento = getEvento();
		evento.getOcorrencia().getDadosOcorrencia().getIdeEmpregador().setNrInsc("INVALIDO");
		EnvioEvento resultado = envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		assertThat(resultado.getEvento().getEstado().getId()).isEqualTo(Estado.ERRO.getId());
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveTratarErroComunicacaoEsocialGov() throws ComunicacaoEsocialGovException {
		
		String mensagem = "Erro de comunicacao";
		
		Mockito.when(comunicacaoEsocialGov.enviarLoteEventos(Mockito.anyString())).thenThrow(new ComunicacaoEsocialGovException(mensagem));

		Evento evento = getEvento();
		
		EnvioEvento envio = envioServico.enviarEventosParaESocialGov(Arrays.asList(evento)).get(0);
		Lote lote = envio.getLote();
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(envio.getDtaGeracaoEvento()).isNotNull();
		soft.assertThat(envio.getVersao()).isNotEmpty();
		soft.assertThat(envio.getEvento().getIdEvento()).isEqualTo(evento.getIdEvento());
		soft.assertThat(envio.getEvento().getEstado().getId()).isEqualTo(Estado.EM_FILA.getId());
		
		soft.assertThat(lote.getDtaEnvio()).isNull();
		soft.assertThat(lote.getProtocolo()).isNull();
		soft.assertThat(lote.getRetorno()).isNull();
		soft.assertThat(lote.getResposta()).isNull();
		soft.assertThat(lote.getEstado().getId()).isEqualTo(Estado.ERRO.getId());
		soft.assertThat(lote.getErroInterno()).contains(mensagem);
		
		soft.assertAll();
	}

	private Evento getEvento() {
		ExemploOcorrenciaServico servico = new ExemploOcorrenciaServico();
		Ocorrencia ocorrencia = null;
		
		try {
			ocorrencia = servico.lerOcorrencia(TipoOcorrencia.INFORMACOES_EMPREGADOR);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		Evento evento = new Evento();
		evento.setIdEvento("ID1005099680001482017092708200100001");
		evento.setOcorrencia(ocorrencia);
		evento.setTipoEvento(TipoEvento.S1000);
		evento.setEstado(Estado.EM_FILA);
		evento.getTipoEvento().setGrupoTipoEvento(new GrupoTipoEvento(1l));
		ocorrencia.setEvento(evento);
		return evento;
	}

	private RetornoEnvio getRetorno() {
		return new RetornoEnvio()
				.setCodigoResposta(201)
				.setDescricaoResposta("Lote Recebido com Sucesso.")
				.setProtocolo("1.2.201711.0000000000000037150")
				.setXmlRetorno("<xml/>");
	}

}
