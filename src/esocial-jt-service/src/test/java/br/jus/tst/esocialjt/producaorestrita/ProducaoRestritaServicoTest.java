package br.jus.tst.esocialjt.producaorestrita;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocialjt.TipoAmbiente;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
@Transactional
public class ProducaoRestritaServicoTest {

	private final String CNPJ = "00509968000148";
	
	@Autowired
	private ProducaoRestritaServico producaoRestritaServico;
	
	@Autowired
	private EntityManager em;
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveGerarEventoParaLimparProducaoRestrita() {
		Evento evento = producaoRestritaServico.gerarEventoLimparProducaoRestrita(CNPJ);

		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(evento.getIdEvento()).isNotNull();
		soft.assertThat(evento.getTipoEvento()).isEqualTo(TipoEvento.INFORMACOES_EMPREGADOR);		
		soft.assertAll();
	}
	
	@Test
	@DataSet(value = {"erro-processamento.yml", "evento.yml", "ocorrencia.yml"}, executeScriptsBefore = "cleanup.sql")
	public void deveApagarTodosRegistrosLocais() {
		assertThat(qtdErros()).isGreaterThan(0);
		assertThat(qtdEventos()).isGreaterThan(0);
		assertThat(qtdOcorrencias()).isGreaterThan(0);

		producaoRestritaServico.apagarRegistrosLocais(TipoAmbiente.PRODUCAO_RESTRITA);
		
		assertThat(qtdEventos()).isEqualTo(0);
		assertThat(qtdOcorrencias()).isEqualTo(0);
		assertThat(qtdErros()).isEqualTo(0);
	}

	private long qtdErros() {
		return em.createQuery("SELECT COUNT(e) FROM ErroProcessamento e", Long.class)
				.getSingleResult();
	}
	
	private long qtdEventos() {
		return em.createQuery("SELECT COUNT(e) FROM Evento e", Long.class)
				.getSingleResult();
	}
	
	private long qtdOcorrencias() {
		return em.createQuery("SELECT COUNT(o) FROM Ocorrencia o", Long.class)
				.getSingleResult();
	}
	
	@Test(expected=ProducaoRestritaException.class)
	public void deveLancarErroSeAmbienteDiferenteProducaoRestrita() {
		producaoRestritaServico.verificarAmbiente(TipoAmbiente.PRODUCAO);
	}
	
	@Test
	public void devePassarSeAmbienteIgualProducaoRestrita() {
		producaoRestritaServico.verificarAmbiente(TipoAmbiente.PRODUCAO_RESTRITA);
	}
}
