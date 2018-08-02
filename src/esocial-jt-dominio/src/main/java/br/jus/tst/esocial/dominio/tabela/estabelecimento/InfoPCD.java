package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Informações sobre a contratação de pessoa com deficiência (PCD). Essa
 * informação deve ser prestada apenas no estabelecimento "Matriz".
 *
 */
public class InfoPCD {

	@NotNull

	private byte contPCD;

	@Valid
	@Length(max = 20)
	private String nrProcJud;

	public String getNrProcJud() {
		return nrProcJud;
	}

	/**
	 * Preencher com o número do processo judicial. </br>
	 * Validação: Informação obrigatória se {contPCD} = [1]. </br>
	 * Deve ser um número de processo administrativo ou judicial válido e
	 * existente na Tabela de Processos - S-1070.
	 * 
	 * @param nrProcJud
	 * @return InfoPCD
	 */
	public InfoPCD setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
		return this;
	}

	public byte getContPCD() {
		return contPCD;
	}

	/**
	 * Indicativo de contratação de PCD:</br>
	 * 0 - Dispensado de acordo com a lei;</br>
	 * 1 - Dispensado, mesmo que parcialmente, em virtude de processo
	 * judicial;</br>
	 * 2 - Com exigibilidade suspensa, mesmo que parcialmente em virtude de
	 * Termo de Compromisso firmado com o Ministério do Trabalho;</br>
	 * 9 - Obrigado.</br>
	 * Valores Válidos: 0, 1, 2, 9.
	 * 
	 * @param contPCD
	 */
	public InfoPCD setContPCD(byte contPCD) {
		this.contPCD = contPCD;
		return this;
	}

}
