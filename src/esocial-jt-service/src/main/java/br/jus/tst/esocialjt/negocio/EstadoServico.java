package br.jus.tst.esocialjt.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;

@Service
public class EstadoServico {
	
	@Autowired
	private MaquinaEstadoEvento maquinaEstadoEvento;
	
	@Autowired
	private MaquinaEstadoLote maquinaEstadoLote;

	public void atualizarEstado(Evento evento) {
		Estado estado = maquinaEstadoEvento.proximoEstado(evento);
		evento.setEstado(estado);
	}

	public void atualizarEstado(Lote lote) {
		Estado estado = maquinaEstadoLote.proximoEstado(lote);
		lote.setEstado(estado);
	}
}
