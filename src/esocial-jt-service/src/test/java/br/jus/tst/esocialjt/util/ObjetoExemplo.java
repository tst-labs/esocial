package br.jus.tst.esocialjt.util;

import java.util.List;

public class ObjetoExemplo {
	private ObjetoExemplo objetoInterno1;
	private ObjetoExemplo objetoInterno2;
	private String propriedade;
	private byte propriedadePrimitiva;
	private List<String> lista;

	public ObjetoExemplo getObjetoInterno1() {
		return objetoInterno1;
	}

	public void setObjetoInterno1(ObjetoExemplo objetoInterno1) {
		this.objetoInterno1 = objetoInterno1;
	}

	public ObjetoExemplo getObjetoInterno2() {
		return objetoInterno2;
	}

	public void setObjetoInterno2(ObjetoExemplo objetoInterno2) {
		this.objetoInterno2 = objetoInterno2;
	}

	public String getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(String propriedade) {
		this.propriedade = propriedade;
	}

	public byte getPropriedadePrimitiva() {
		return propriedadePrimitiva;
	}

	public void setPropriedadePrimitiva(byte propriedadePrimitiva) {
		this.propriedadePrimitiva = propriedadePrimitiva;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
}
