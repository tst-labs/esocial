package br.jus.tst.esocialjt.auto.tarefas;

public interface Tarefa {
	
	/**
	 * Executa uma tarefa e indica se a próxima tarefa pode ser executada no mesmo ciclo
	 * 
	 * @return true se a próxima tarefa do ciclo pode ser executada.
	 */
	boolean executar();
}
