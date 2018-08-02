package br.jus.tst.esocialjt.auto.tarefas;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.negocio.AtualizacaoProcessamentoServico;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TarefaAtualizacaoProcessamentoIT{
	
	@Autowired
	private TarefaAtualizacaoProcessamento tarefa;
	
	@MockBean
	private AtualizacaoProcessamentoServico servico;

	@Test
	public void deveChamarAtualizarTodosEmProcessamento() {
		tarefa.executar();
		Mockito.verify(servico).atualizarTodosEmProcessamento();
	}
	
	@Test
	public void deveRetornarFalseSeProcessouAlgumLote() {
		Lote lote = new Lote();
		lote.setId(0);
		lote.setProtocolo("001");
		lote.setEstado(Estado.PROCESSADO_COM_SUCESSO);
		
		Mockito.when(servico.atualizarTodosEmProcessamento()).thenReturn(Arrays.asList(lote));
		boolean executarProximo = tarefa.executar();
		assertThat(executarProximo).isFalse();
	}
	
	@Test
	public void deveRetornarTrueSeNaoProcessouLote() {
		Mockito.when(servico.atualizarTodosEmProcessamento()).thenReturn(Collections.emptyList());
		boolean executarProximo = tarefa.executar();
		assertThat(executarProximo).isTrue();
	}

}
