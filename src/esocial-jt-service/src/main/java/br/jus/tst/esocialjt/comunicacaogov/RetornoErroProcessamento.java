package br.jus.tst.esocialjt.comunicacaogov;

public class RetornoErroProcessamento {
	private int tipo;
	private String localizacao;
	private int codigo;
	private String descricao;

	public RetornoErroProcessamento() {
	}

	public RetornoErroProcessamento(int tipo, int codigo, String descricao, String localizacao) {
		this.tipo = tipo;
		this.localizacao = localizacao;
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
