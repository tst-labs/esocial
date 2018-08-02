package br.jus.tst.esocialjt.auto.tarefas;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;

@RunWith(SpringRunner.class)
@SpringBootTest
@DBRider
public class TarefaConexaoEsocialIT {

	@Autowired
	private TarefaConexaoEsocial tarefa;

	@MockBean
	ComunicacaoEsocialGov comunicacaoEsocialGov;

	@Test
	@DataSet(value = {"ocorrencia.yml", "lote.yml", "evento.yml"}, 
			executeScriptsBefore = "cleanup.sql") 
	public void deveRetornarTrueAoTestarConexaoComEsocial() {
		when(comunicacaoEsocialGov.testarConexaoEsocial()).thenReturn(true);
		boolean conectouServidorEsocial = tarefa.executar();
		assertThat(conectouServidorEsocial).isTrue();
	}

	@Test
	@DataSet(executeScriptsBefore = "cleanup.sql")
	public void deveRetornarTrueSeNaoTemEventoParaSerEnviado() {
		boolean conectouServidorEsocial = tarefa.executar();
		assertThat(conectouServidorEsocial).isTrue();
	}
}
