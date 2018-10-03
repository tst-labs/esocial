package br.jus.tst.esocial.dominio.exclusao;

import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador;

public class InfoExclusao {

	@Size(min=5, max=6)
	private String tpEvento;
	
	@Size(min=1, max=40)
	private String nrRecEvt;
	
	private IdeTrabalhador ideTrabalhador;
	
	private IdeFolhaPagto ideFolhaPagto;

	public String getTpEvento() {
		return tpEvento;
	}

	public void setTpEvento(String tpEvento) {
		this.tpEvento = tpEvento;
	}

	public String getNrRecEvt() {
		return nrRecEvt;
	}

	public void setNrRecEvt(String nrRecEvt) {
		this.nrRecEvt = nrRecEvt;
	}

	public IdeTrabalhador getIdeTrabalhador() {
		return ideTrabalhador;
	}

	public void setIdeTrabalhador(IdeTrabalhador ideTrabalhador) {
		this.ideTrabalhador = ideTrabalhador;
	}

	public IdeFolhaPagto getIdeFolhaPagto() {
		return ideFolhaPagto;
	}

	public void setIdeFolhaPagto(IdeFolhaPagto ideFolhaPagto) {
		this.ideFolhaPagto = ideFolhaPagto;
	}

	
}
