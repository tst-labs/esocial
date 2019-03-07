package br.jus.tst.esocialjt;

public enum TipoAmbiente {
	PRODUCAO(1), PRODUCAO_RESTRITA(2);

	private byte codigo;

	private TipoAmbiente(int codigo) {
		this.codigo = (byte) codigo;
	}

	public byte codigo() {
		return codigo;
	}

}
