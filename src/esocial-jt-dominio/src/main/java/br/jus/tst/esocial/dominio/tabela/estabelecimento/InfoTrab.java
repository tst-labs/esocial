package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.Valid;

/**
 * Informações Trabalhistas relativas ao estabelecimento
 *
 */
public class InfoTrab {

	@Valid
	private InfoApr infoApr;

	@Valid
	private InfoPCD infoPCD;

	public InfoApr getInfoApr() {
		return infoApr;
	}

	public InfoPCD getInfoPCD() {
		return infoPCD;
	}

	public InfoTrab setInfoPCD(InfoPCD infoPCD) {
		this.infoPCD = infoPCD;
		return this;
	}

	public InfoTrab setInfoApr(InfoApr infoApr) {
		this.infoApr = infoApr;
		return this;
	}
}
