package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.Valid;

public class InfoRegimeTrab {
	@Valid
	private InfoCeletista infoCeletista;
	
	@Valid
	private InfoEstatutario infoEstatutario;
	
	public InfoCeletista getInfoCeletista() {
		return infoCeletista;
	}
	public InfoRegimeTrab setInfoCeletista(InfoCeletista celetista) {
		this.infoCeletista = celetista;
		return this;
	}
	public InfoEstatutario getInfoEstatutario() {
		return infoEstatutario;
	}
	public InfoRegimeTrab setInfoEstatutario(InfoEstatutario estatutario) {
		this.infoEstatutario = estatutario;
		return this;
	}
	
}
