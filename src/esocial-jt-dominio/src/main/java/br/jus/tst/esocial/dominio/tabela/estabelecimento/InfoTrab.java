package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.Valid;

/**
 * Informações Trabalhistas relativas ao estabelecimento
 *
 */
public class InfoTrab {

	private byte regPt;

	@Valid
	private InfoApr infoApr;

	public InfoApr getInfoApr() {
		return infoApr;
	}

	private InfoPCD infoPCD;

	public InfoPCD getInfoPCD() {
		return infoPCD;
	}

	/**
	 * Informações sobre a contratação de pessoa com deficiência (PCD). Essa
	 * informação deve ser prestada apenas no estabelecimento "Matriz".
	 * 
	 * @param infoPCD
	 */
	public InfoTrab setInfoPCD(InfoPCD infoPCD) {
		this.infoPCD = infoPCD;
		return this;
	}

	/**
	 * Informações relacionadas à contratação de aprendiz
	 * 
	 * @param infoApr
	 * @return InfoTrab
	 */
	public InfoTrab setInfoApr(InfoApr infoApr) {
		this.infoApr = infoApr;
		return this;
	}

	/**
	 * <p>
	 * Opção de registro de ponto (jornada) adotada pelo estabelecimento.
	 * Indicar o sistema de controle de ponto preponderante, conforme opções:
	 * </p>
	 * 0 - Não utiliza; </br>
	 * 1 - Manual; </br>
	 * 2 - Mecânico; </br>
	 * 3 - Eletrônico (portaria MTE 1.510/2009); </br>
	 * 4 - Não eletrônico alternativo (art. 1° da Portaria MTE 373/2011); </br>
	 * 5 - Eletrônico alternativo ( art. 2° da Portaria MTE 373/2011); </br>
	 * 6 - Eletrônico - outros. </br>
	 * </br>
	 * Valores Válidos: 0, 1, 2, 3, 4, 5, 6.
	 * 
	 * @param regPt
	 * @return InfoTrab
	 */
	public InfoTrab setRegPt(byte regPt) {
		this.regPt = regPt;
		return this;
	}

	public byte getRegPt() {
		return regPt;
	}

}
