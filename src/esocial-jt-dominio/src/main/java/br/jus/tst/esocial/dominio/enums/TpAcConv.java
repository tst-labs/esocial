package br.jus.tst.esocial.dominio.enums;

public enum TpAcConv {

	/**
	 * Acordo Coletivo de Trabalho
	 * 
	 */
	A,

	/**
	 * Legislação federal, estadual, municipal ou distrital
	 * 
	 */
	B,

	/**
	 * Convenção Coletiva de Trabalho
	 * 
	 */
	C,

	/**
	 * Sentença normativa - Dissídio
	 * 
	 */
	D,

	/**
	 * Conversão de licença saúde em acidente de trabalho
	 * 
	 */
	E,

	/**
	 * Outras verbas de natureza salarial ou não salarial devidas após o
	 * desligamento
	 * 
	 */
	F,

	/**
	 * Antecipação de diferenças de acordo, convenção ou dissídio coletivo
	 * 
	 */
	G,

	/**
	 * Recolhimento mensal de FGTS anterior ao início de obrigatoriedade dos eventos
	 * periódicos
	 * 
	 */
	H;

	public String value() {
		return name();
	}

	public static TpAcConv fromValue(String v) {
		return valueOf(v);
	}

}
