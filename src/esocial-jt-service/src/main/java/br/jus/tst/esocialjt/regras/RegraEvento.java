package br.jus.tst.esocialjt.regras;

import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.negocio.ConsultaEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;

@Component
public class RegraEvento extends Regra{

	private EventoServico eventoServico;
	
	private TipoEvento[] tipos;
	
	private Estado[] estados;
	
	private GrupoTipoEvento[] grupos;
	
	private boolean regraExiste = true;
	
	public RegraEvento(EventoServico eventoServico) {
		super();
		this.eventoServico = eventoServico;
	}

	public RegraEvento dosTipos(TipoEvento... tipos) {
		this.tipos = tipos;
		return this;
	}

	public RegraEvento nosEstados(Estado... estados) {
		this.estados = estados;
		return this;
	}
	
	public RegraEvento dosGrupos(GrupoTipoEvento... grupos) {
		this.grupos = grupos;
		return this;
	}

	public RegraEvento existe() {
		this.regraExiste = true;
		return this;
	}
	
	public RegraEvento naoExiste() {
		this.regraExiste = false;
		return this;
	}

	@Override
	public boolean habilitado(EventoDTO eventoDTO) {
		
		ConsultaEvento consulta = eventoServico.criarConsulta()
				.dosTipos(tipos)
				.nosEstados(estados)
				.dosGrupos(grupos);
		
		boolean resultado;
		if(regraExiste) {
			resultado = consulta.existe();
		} else {
			resultado = consulta.naoExiste();
		}
		return resultado;
	}
}
