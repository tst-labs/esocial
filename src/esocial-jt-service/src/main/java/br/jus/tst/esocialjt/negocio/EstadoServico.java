package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;
import org.springframework.stereotype.Service;

@Service
public class EstadoServico {

	public void atualizarEstado(EnvioEvento envioEvento) {
		Estado estado = MaquinaEstadoEvento.proximoEstado(envioEvento);
		envioEvento.getEvento().setEstado(estado);
	}

	public void atualizarEstado(Lote lote) {
		Estado estado = MaquinaEstadoLote.proximoEstado(lote);
		lote.setEstado(estado);
	}
}
