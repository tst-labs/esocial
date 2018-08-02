package br.jus.tst.esocialjt.regras;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
@Transactional
public class RegraEventoTest{
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private EventoServico eventoServico;

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveEncontrarEventoQueExiste() {
		Evento evento = new Evento()
			.setTipoEvento(TipoEvento.S1000)
			.setEstado(Estado.EM_FILA);
		
		salvar(evento);
		
		assertThat(new RegraEvento(eventoServico).dosTipos(TipoEvento.S1000).existe().habilitado(null)).isTrue();
		assertThat(new RegraEvento(eventoServico).nosEstados(Estado.EM_FILA).existe().habilitado(null)).isTrue();
		assertThat(new RegraEvento(eventoServico).dosGrupos(GrupoTipoEvento.TABELA).existe().habilitado(null)).isTrue();
		
		assertThat(new RegraEvento(eventoServico)
				.dosTipos(TipoEvento.S1000)
				.nosEstados(Estado.EM_FILA)
				.dosGrupos(GrupoTipoEvento.TABELA)
				.existe()
				.habilitado(null)).isTrue();
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveEncontrarEventoQueNaoExiste() {
		Evento evento = new Evento()
			.setTipoEvento(TipoEvento.S1000)
			.setEstado(Estado.EM_FILA);
		
		salvar(evento);
		
		assertThat(new RegraEvento(eventoServico).dosTipos(TipoEvento.S1010).naoExiste().habilitado(null)).isTrue();
		assertThat(new RegraEvento(eventoServico).nosEstados(Estado.PROCESSAMENTO).naoExiste().habilitado(null)).isTrue();
		assertThat(new RegraEvento(eventoServico).dosGrupos(GrupoTipoEvento.PERIODICO).naoExiste().habilitado(null)).isTrue();

		assertThat(new RegraEvento(eventoServico)
				.dosTipos(TipoEvento.S1010)
				.nosEstados(Estado.PROCESSAMENTO)
				.dosGrupos(GrupoTipoEvento.PERIODICO)
				.naoExiste()
				.habilitado(null)).isTrue();
	}

	
	private void salvar(Evento evento) {
		em.persist(evento);
	}
}
