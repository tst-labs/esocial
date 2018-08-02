package br.jus.tst.esocialjt.regras;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
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

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
@Transactional
public class RegraEmpregadorCadastradoTest{
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private RegraEmpregadorCadastrado regra; 

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveSerVerdadeiroSeExisteEmpregadorCadastrado() {
		Evento eventoEmpregador = new Evento()
				.setTipoEvento(TipoEvento.INFORMACOES_EMPREGADOR)
				.setEstado(Estado.PROCESSADO_COM_SUCESSO);
		
		salvar(eventoEmpregador);
		
		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isTrue();
	}
	
	@Test
	public void deveSerFalsoSeEventoEmpregadorEmOutroEstado() {
		List<Estado> estados = Arrays.asList(Estado.EM_FILA, 
				Estado.ERRO, 
				Estado.PROCESSADO_COM_ERRO, 
				Estado.PROCESSAMENTO);
		
		estados.forEach(estado -> {
			Evento eventoEmpregador = new Evento()
					.setTipoEvento(TipoEvento.INFORMACOES_EMPREGADOR)
					.setEstado(estado);
			
			salvar(eventoEmpregador);
			
			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isFalse();
		});
	}
	
	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveSerFalsoSeExisteOutroEvento() {
		Evento eventoEmpregador = new Evento()
				.setTipoEvento(TipoEvento.TABELA_CARGO)
				.setEstado(Estado.PROCESSADO_COM_SUCESSO);
		
		salvar(eventoEmpregador);
		
		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isFalse();
	}
	
	@Test
	public void deveSerFalsoSeNaoExisteEmpregadorCadastrado() {
		boolean habilitado = regra.habilitado(new EventoDTO());
		assertThat(habilitado).isFalse();
	}
	
	private void salvar(Evento evento) {
		em.persist(evento);
	}

}
