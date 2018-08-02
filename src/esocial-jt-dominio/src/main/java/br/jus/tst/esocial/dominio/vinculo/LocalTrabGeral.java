package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LocalTrabGeral {
	
	private byte tpInsc;

	@NotNull
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;
	
	@Size(min=1, max=80)
	private String descComp;

	public byte getTpInsc() {
		return tpInsc;
	}

	public LocalTrabGeral setTpInsc(byte tipoInscricao) {
		this.tpInsc = tipoInscricao;
		return this;
	}

	public String getNrInsc() {
		return nrInsc;
	}

	public LocalTrabGeral setNrInsc(String numeroInscricao) {
		this.nrInsc = numeroInscricao;
		return this;
	}

	public String getDescComp() {
		return descComp;
	}

	public LocalTrabGeral setDescComp(String descricaoComplementar) {
		this.descComp = descricaoComplementar;
		return this;
	}

}
