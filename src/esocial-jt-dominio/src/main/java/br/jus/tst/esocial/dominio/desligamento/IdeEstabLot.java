package br.jus.tst.esocial.dominio.desligamento;

import java.util.List;

import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.estabelecimentolotacao.DetVerbas;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.InfoAgNocivo;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.InfoSimples;

public class IdeEstabLot {
	private byte tpInsc;
    @NotNull
    private String nrInsc;
    @NotNull
    private String codLotacao;
    @NotNull
    private List<DetVerbas> detVerbas;
    private InfoAgNocivo infoAgNocivo;
    private InfoSimples infoSimples;
	public byte getTpInsc() {
		return tpInsc;
	}
	public void setTpInsc(byte tpInsc) {
		this.tpInsc = tpInsc;
	}
	public String getNrInsc() {
		return nrInsc;
	}
	public void setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
	}
	public String getCodLotacao() {
		return codLotacao;
	}
	public void setCodLotacao(String codLotacao) {
		this.codLotacao = codLotacao;
	}
	public List<DetVerbas> getDetVerbas() {
		return detVerbas;
	}
	public void setDetVerbas(List<DetVerbas> detVerbas) {
		this.detVerbas = detVerbas;
	}
	public InfoAgNocivo getInfoAgNocivo() {
		return infoAgNocivo;
	}
	public void setInfoAgNocivo(InfoAgNocivo infoAgNocivo) {
		this.infoAgNocivo = infoAgNocivo;
	}
	public InfoSimples getInfoSimples() {
		return infoSimples;
	}
	public void setInfoSimples(InfoSimples infoSimples) {
		this.infoSimples = infoSimples;
	}
}
