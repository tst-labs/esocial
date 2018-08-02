package br.jus.tst.esocialjt.negocio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.tabela.funcao.DadosFuncao;
import br.jus.tst.esocial.dominio.tabela.funcao.IdeFuncao;
import br.jus.tst.esocial.dominio.tabela.funcao.InfoFuncao;
import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.TabelaFuncao;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaDadosBasicosDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
public class OcorrenciaServicoTest{

	@Autowired
	OcorrenciaServico servico;

	@Autowired
	private EntityManager em;
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql") 
	public void testeSalvarOcorrencia() {
		Ocorrencia ocorrencia = getOcorrencia();

		servico.salvar(ocorrencia);

		Ocorrencia estOcorrencia = em.find(Ocorrencia.class, ocorrencia.getId());
		assertThat(estOcorrencia.getReferencia()).isEqualTo(ocorrencia.getReferencia());
		assertThat(estOcorrencia.getDadosOcorrencia()).isNotNull();

	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql" ) 
	public void deveRecuperarTodasOcorrencias(){
		List<Ocorrencia> ocorrencias = servico.recuperaTodos();
		assertThat(ocorrencias).isNotEmpty();
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosDadosBasicosOcorrenciasSemEvento(){
		List<OcorrenciaDadosBasicosDTO> ocorrencias = servico.recuperaDadosBasicos();
		assertThat(ocorrencias).isNotEmpty();
		assertThat(ocorrencias.get(0).getId()).isNotNull();
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarTodosDadosBasicosOcorrenciasComEvento(){
		List<OcorrenciaDadosBasicosDTO> ocorrencias = servico.recuperaDadosBasicos();
		assertThat(ocorrencias).isNotEmpty();
		assertThat(ocorrencias.get(0).getTipoEvento()).isNotNull();
		assertThat(ocorrencias.get(0).getEstadoEvento()).isNotNull();
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql")
	public void deveRecuperarPorId() throws Exception{
		Ocorrencia ocorrencia = servico.recuperaPorId(1l);
		assertThat(ocorrencia.getId()).isGreaterThan(0);
	}

	
	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void deveAguardarSeExisteEventoEmFila() throws Exception{
		boolean deveAguardar =  servico.deveAguardarGeracaoEvento(TipoEvento.S1000, "1");
		assertThat(deveAguardar).isTrue();
	}

	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void naoDeveAguardarSeExisteEventoComReferenciaDiferenteEmFila() throws Exception{
		boolean deveAguardar =  servico.deveAguardarGeracaoEvento(TipoEvento.S1000, "2");
		assertThat(deveAguardar).isFalse();
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void naoDeveAguardarSeExisteEventoComTipoDiferenteEmFila() throws Exception{
		boolean deveAguardar =  servico.deveAguardarGeracaoEvento(TipoEvento.S2200, "1");
		assertThat(deveAguardar).isFalse();
	}

	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void deveAguardarSeExisteEventoEmProcessamento() throws Exception{
		boolean deveAguardar =  servico.deveAguardarGeracaoEvento(TipoEvento.S1040, "2");
		assertThat(deveAguardar).isTrue();
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql") 
	@Transactional
	public void deveGerarEvento() throws Exception{
		Ocorrencia ocorrencia = em.find(Ocorrencia.class, 1l);
		assertThat(ocorrencia.getEvento()).isNull();
		Ocorrencia ocorrenciaComEvento = servico.gerarEvento(ocorrencia);
		assertThat(ocorrenciaComEvento.getEvento()).isNotNull();
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void naoDeveMudarSeOperacaoExclusao() throws Exception{
		Ocorrencia ocorrencia = em.find(Ocorrencia.class, 1l);
		ocorrencia.setOperacao(Operacao.EXCLUSAO);
		
		servico.atualizarOperacaoTabela(ocorrencia);
		
		assertThat(ocorrencia.getOperacao()).isEqualTo(Operacao.EXCLUSAO);
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void naoDeveMudarSeOperacaoNaoDeTabela() throws Exception{
		Ocorrencia ocorrencia = em.find(Ocorrencia.class, 3l);

		ocorrencia.setOperacao(Operacao.EXCLUSAO);
		servico.atualizarOperacaoTabela(ocorrencia);
		assertThat(ocorrencia.getOperacao()).isEqualTo(Operacao.EXCLUSAO);
		
		ocorrencia.setOperacao(Operacao.ALTERACAO);
		servico.atualizarOperacaoTabela(ocorrencia);
		assertThat(ocorrencia.getOperacao()).isEqualTo(Operacao.ALTERACAO);

		ocorrencia.setOperacao(Operacao.INCLUSAO);
		servico.atualizarOperacaoTabela(ocorrencia);
		assertThat(ocorrencia.getOperacao()).isEqualTo(Operacao.INCLUSAO);
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void deveSerAlteracaoSeExisteOutroIgual() throws Exception{
		Ocorrencia ocorrencia = em.find(Ocorrencia.class, 2l);

		ocorrencia.setOperacao(Operacao.INCLUSAO);
		servico.atualizarOperacaoTabela(ocorrencia);
		assertThat(ocorrencia.getOperacao()).isEqualTo(Operacao.ALTERACAO);
		
	}
	
	@Test
	@DataSet(value = {"ocorrencia.yml", "evento.yml"}, executeScriptsBefore = "cleanup.sql") 
	public void deveSerInclusaoSeNaoExisteOutroIgual() throws Exception{
		Ocorrencia ocorrencia = em.find(Ocorrencia.class, 2l);
		TabelaFuncao dados =  (TabelaFuncao) ocorrencia.getDadosOcorrencia();
		dados.getInfoFuncao().getIdeFuncao().setIniValid("2039-12");
		
		ocorrencia.setOperacao(Operacao.ALTERACAO);
		servico.atualizarOperacaoTabela(ocorrencia);
		assertThat(ocorrencia.getOperacao()).isEqualTo(Operacao.INCLUSAO);
		
	}
	
	private Ocorrencia getOcorrencia() {
		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setTipoOcorrencia(TipoOcorrencia.TABELA_FUNCAO).setReferencia("10000").setOperacao(Operacao.INCLUSAO)
				.setDataOcorrencia(new Date()).setDadosOcorrencia(getTabelaFuncao());
		return ocorrencia;
	}

	private TabelaFuncao getTabelaFuncao() {
		TabelaFuncao evento = new TabelaFuncao();
		evento.setIdeEmpregador(new IdeEmpregador());
		evento.getIdeEmpregador().setNrInsc("00509968000148");

		InfoFuncao informacao = new InfoFuncao();
		DadosFuncao dados = new DadosFuncao();
		dados.setDscFuncao("TESTE");
		dados.setCodCBO("123456");

		informacao.setDadosFuncao(dados);

		IdeFuncao ideFuncao = new IdeFuncao();
		ideFuncao.setCodFuncao("1");
		ideFuncao.setIniValid("2017-01");
		informacao.setIdeFuncao(ideFuncao);
		evento.setInfoFuncao(informacao);
		return evento;
	}

}
