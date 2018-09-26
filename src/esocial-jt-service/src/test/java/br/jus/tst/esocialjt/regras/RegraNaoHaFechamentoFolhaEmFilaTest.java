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
public class RegraNaoHaFechamentoFolhaEmFilaTest {

	@Autowired
	private EntityManager em;
	
	@Autowired
	private RegraNaoHaFechamentoFolhaEmFila regra;
	
	@Test
	public void deveSerVerdadeiroSeNaoExisteFechamentoFolhaEmFila() {
		List<Estado> estados = Arrays.asList( 
				Estado.ERRO, 
				Estado.PROCESSADO_COM_ERRO, 
				Estado.PROCESSADO_COM_SUCESSO);
		
		estados.forEach(estado -> {
			Evento evento = new Evento()
					.setTipoEvento(TipoEvento.FECHAMENTO_PERIODICOS)
					.setEstado(estado);
			
			em.persist(evento);
			
			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isTrue();
		});
	}
	
	@Test
	public void deveSerFalsoSeExisteFechamentoFolhaEmFilaOuProcessamento() {
		List<Estado> estados = Arrays.asList( 
				Estado.EM_FILA, 
				Estado.PROCESSAMENTO);
		
		estados.forEach(estado -> {
			Evento evento = new Evento()
					.setTipoEvento(TipoEvento.FECHAMENTO_PERIODICOS)
					.setEstado(estado);
			
			em.persist(evento);
			
			boolean habilitado = regra.habilitado(new EventoDTO());
			assertThat(habilitado).as(estado.getDescricao()).isFalse();
		});
	}
	
}
