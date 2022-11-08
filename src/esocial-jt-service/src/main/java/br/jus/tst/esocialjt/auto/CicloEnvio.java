package br.jus.tst.esocialjt.auto;

import br.jus.tst.esocialjt.auto.tarefas.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CicloEnvio {
	
	@Autowired
	private TarefaAtualizacaoProcessamento atualizacao;

	@Autowired
	private TarefaEnvioEventos envio;

	@Autowired
	private TarefaConexaoEsocial conexaoEsocial;

	@Autowired
	private TarefaGeracaoEventos geracaoEventos;

	@Autowired
	private TarefaCorrigeDivergencias corrigeDivergencias;


	private List<Tarefa> tarefas;

	public void executar() {
		for (Tarefa tarefa : getTarefas()) {
			boolean continuarExecucao = tarefa.executar();
			if (!continuarExecucao) {
				break;
			}
		}
	}
	
	private List<Tarefa> getTarefas(){
		if(tarefas == null) {
			tarefas = new ArrayList<>();
			tarefas.add(geracaoEventos);
			tarefas.add(conexaoEsocial);
			tarefas.add(atualizacao);
			tarefas.add(envio);
			tarefas.add(corrigeDivergencias);
		}
		return tarefas;
	}
}
