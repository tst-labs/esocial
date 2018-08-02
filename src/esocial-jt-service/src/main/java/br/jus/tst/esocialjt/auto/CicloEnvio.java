package br.jus.tst.esocialjt.auto;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.auto.tarefas.Tarefa;
import br.jus.tst.esocialjt.auto.tarefas.TarefaAtualizacaoProcessamento;
import br.jus.tst.esocialjt.auto.tarefas.TarefaConexaoEsocial;
import br.jus.tst.esocialjt.auto.tarefas.TarefaEnvioEventos;
import br.jus.tst.esocialjt.auto.tarefas.TarefaGeracaoEventos;

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


	private List<Tarefa> tarefas;
	
	public void executar() {
		for(Tarefa tarefa:getTarefas()) {
			boolean continuarExecucao = tarefa.executar();
			if(!continuarExecucao) {
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
		}
		return tarefas;
	}
}
