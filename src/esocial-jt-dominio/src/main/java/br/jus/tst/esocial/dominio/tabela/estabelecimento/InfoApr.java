package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Informações relacionadas à contratação de aprendiz
 *
 */
public class InfoApr {

	@NotNull
	private byte contApr;

	@Valid
	@Length(max = 20)
	private String nrProcJud;
	
	@Valid
	private String contEntEd;

	private List<InfoEntEduc> infoEntEduc;

	public String getNrProcJud() {
		return nrProcJud;
	}

	public String getContEntEd() {
		return contEntEd;
	}

	public List<InfoEntEduc> getInfoEntEduc() {
		return infoEntEduc;
	}

	/**
	 * Identificação da(s) entidade(s) educativa(s) ou de prática desportiva
	 * 
	 * @param infoEntEduc
	 * @return InfoApr
	 */
	public InfoApr setInfoEntEduc(List<InfoEntEduc> infoEntEduc) {
		this.infoEntEduc = infoEntEduc;
		return this;
	}

	/**
	 * Informar se o estabelecimento realiza a contratação de aprendiz por
	 * intermédio de entidade educativa sem fins lucrativos que tenha por
	 * objetivo a assistência ao adolescente e à educação profissional (art.
	 * 430, inciso II, CLT) ou por entidade de prática desportiva filiada ao
	 * Sistema Nacional do Desporto ou a Sistema de Desporto de Estado, do
	 * Distrito Federal ou de Município (art. 430, inciso III, CLT):</br>
	 * S - Sim;</br>
	 * N - Não.</br>
	 * Validação: O preenchimento é obrigatório se {contApr} for igual a [1,
	 * 2].</br>
	 * Valores Válidos: S, N. </br>
	 * 
	 * @param contEntEd
	 * @return
	 */
	public InfoApr setContEntEd(String contEntEd) {
		this.contEntEd = contEntEd;
		return this;
	}

	/**
	 * Preencher com o número do processo judicial. </br>
	 * Validação: O preenchimento é obrigatório se {contApr} for igual a [1].
	 * </br>
	 * Deve ser um número de processo judicial válido e existente na Tabela de
	 * Processos - S-1070.
	 * 
	 * @param nrProcJud
	 */
	public InfoApr setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
		return this;
	}

	public byte getContApr() {
		return contApr;
	}

	/**
	 * Indicativo de contratação de aprendiz: </br>
	 * 0 - Dispensado de acordo com a lei;</br>
	 * 1 - Dispensado, mesmo que parcialmente, em virtude de processo judicial;
	 * </br>
	 * 2 - Obrigado.</br>
	 * Valores Válidos: 0, 1, 2.
	 * 
	 * @param contApr
	 */
	public InfoApr setContApr(byte contApr) {
		this.contApr = contApr;
		return this;
	}
}
