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

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class RegraNaoHaRemuneracaoEmFilaTest {

	@Autowired
	private EntityManager em;
	
	@Autowired
	private RegraNaoHaRemuneracaoEmFila regra;
	
	@Test
	public void deveSerVerdadeiroSeNaoExisteRemuneracaoRGPSEmFila() {
		List<Estado> estados = Arrays.asList( 
				Estado.ERRO, 
				Estado.PROCESSADO_COM_ERRO, 
				Estado.PROCESSADO_COM_SUCESSO);
		
		estados.forEach(estado -> {
			Evento evento = new Evento()
					.setTipoEvento(TipoEvento.REMUNERACAO_RGPS)
					.setEstado(estado);
			
			em.persist(evento);
			
			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isTrue();
		});
	}
	
	@Test
	public void deveSerVerdadeiroSeNaoExisteRemuneracaoRPPSEmFila() {
		List<Estado> estados = Arrays.asList( 
				Estado.ERRO, 
				Estado.PROCESSADO_COM_ERRO, 
				Estado.PROCESSADO_COM_SUCESSO);
		
		estados.forEach(estado -> {
			Evento evento = new Evento()
					.setTipoEvento(TipoEvento.REMUNERACAO_RPPS)
					.setEstado(estado);
			
			em.persist(evento);
			
			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isTrue();
		});
	}
	
	@Test
	public void deveSerFalsoSeExisteRemuneracaoRGPSEmFilaOuProcessamento() {
		List<Estado> estados = Arrays.asList( 
				Estado.EM_FILA, 
				Estado.PROCESSAMENTO);
		
		estados.forEach(estado -> {
			Evento evento = new Evento()
					.setTipoEvento(TipoEvento.REMUNERACAO_RGPS)
					.setEstado(estado);
			
			em.persist(evento);
			
			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isFalse();
		});
	}
	
	@Test
	public void deveSerFalsoSeExisteRemuneracaoRPPSEmFilaOuProcessamento() {
		List<Estado> estados = Arrays.asList( 
				Estado.EM_FILA, 
				Estado.PROCESSAMENTO);
		
		estados.forEach(estado -> {
			Evento evento = new Evento()
					.setTipoEvento(TipoEvento.REMUNERACAO_RPPS)
					.setEstado(estado);
			
			em.persist(evento);
			
			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isFalse();
		});
	}
	
	
	
}
