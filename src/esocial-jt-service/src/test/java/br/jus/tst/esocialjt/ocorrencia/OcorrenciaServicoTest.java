package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.tabela.lotacao.DadosLotacao;
import br.jus.tst.esocial.dominio.tabela.lotacao.IdeLotacao;
import br.jus.tst.esocial.dominio.tabela.lotacao.InfoLotacao;
import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.TabelaLotacao;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
	@DataSet(value = {"ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql" ) 
	public void deveRecuperarOcorrenciasPaginadoMaisRecentePrimeiro(){
		int page = 0;
		int size = 2;
		Page<Ocorrencia> ocorrenciasPage = servico.recuperaPaginado(page, size, Collections.emptyList(), "", Collections.emptyList(), false, "").pagina;
		
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(ocorrenciasPage.getSize()).isEqualTo(2);
		soft.assertThat(ocorrenciasPage.getTotalElements()).isEqualTo(4);
		soft.assertThat(ocorrenciasPage.getTotalPages()).isEqualTo(2);
		soft.assertThat(ocorrenciasPage.get().findFirst().get().getId()).isEqualTo(4);
		soft.assertAll();
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
	@DataSet(value = {"ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql") 
	@Transactional
	public void deveGerarEvento() throws Exception{
		Ocorrencia ocorrencia = em.find(Ocorrencia.class, 1l);
		assertThat(ocorrencia.getEvento()).isNull();
		Ocorrencia ocorrenciaComEvento = servico.gerarEvento(ocorrencia);
		assertThat(ocorrenciaComEvento.getEvento()).isNotNull();
	}
	
	private Ocorrencia getOcorrencia() {
		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setTipoOcorrencia(TipoOcorrencia.TABELA_LOTACAO).setReferencia("10000").setOperacao(Operacao.INCLUSAO)
				.setDataOcorrencia(new Date()).setDadosOcorrencia(getTabelaLotacao());
		return ocorrencia;
	}

	private TabelaLotacao getTabelaLotacao() {
		TabelaLotacao evento = new TabelaLotacao();
		evento.setIdeEmpregador(new IdeEmpregador());
		evento.getIdeEmpregador().setNrInsc("00509968000148");

		InfoLotacao informacao = new InfoLotacao();
		DadosLotacao dados = new DadosLotacao();
		informacao.setDadosLotacao(dados);

		IdeLotacao ideLotacao = new IdeLotacao();
		ideLotacao.setCodLotacao("1");
		ideLotacao.setIniValid("2017-01");
		informacao.setIdeLotacao(ideLotacao);
		evento.setInfoLotacao(informacao);
		return evento;
	}

}
