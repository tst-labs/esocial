package br.jus.tst.esocialjt.auto.tarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.negocio.EventoServico;

@Service
public class TarefaConexaoEsocial implements Tarefa {

	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;

	@Autowired
	private EventoServico eventoServico;

	@Override
	public boolean executar() {
		boolean conectou = true;
		if (verificarSeExisteEventosParaEnvio()) {
			conectou = comunicacaoEsocialGov.testarConexaoEsocial();
		}
		return conectou;
	}

	private boolean verificarSeExisteEventosParaEnvio() {
		return eventoServico
				.criarConsulta()
				.nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO )
				.existe();
	}
}
