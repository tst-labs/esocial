package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class InfoEstatutario {
	@NotNull
	private byte indProvim;
	
	@NotNull
	private byte tpProv;
	
	@NotNull
	private Calendar dtNomeacao;
	
	@NotNull
	private Calendar dtPosse;
	
	@NotNull
	private Calendar dtExercicio;
	
	private Byte tpPlanRP;
	
	@Valid
	private InfoDecJud infoDecJud;

	public byte getIndProvim() {
		return indProvim;
	}

	public InfoEstatutario setIndProvim(byte indProvimento) {
		this.indProvim = indProvimento;
		return this;
	}

	public byte getTpProv() {
		return tpProv;
	}

	public InfoEstatutario setTpProv(byte tipoProvimento) {
		this.tpProv = tipoProvimento;
		return this;
	}

	public Calendar getDtNomeacao() {
		return dtNomeacao;
	}

	public InfoEstatutario setDtNomeacao(Calendar dataNomeacao) {
		this.dtNomeacao = dataNomeacao;
		return this;
	}

	public Calendar getDtPosse() {
		return dtPosse;
	}

	public InfoEstatutario setDtPosse(Calendar dataPosse) {
		this.dtPosse = dataPosse;
		return this;
	}

	public Calendar getDtExercicio() {
		return dtExercicio;
	}

	public InfoEstatutario setDtExercicio(Calendar dataExercicio) {
		this.dtExercicio = dataExercicio;
		return this;
	}

	public Byte getTpPlanRP() {
		return tpPlanRP;
	}

	public InfoEstatutario setTpPlanRP(Byte tipoPlanoRP) {
		this.tpPlanRP = tipoPlanoRP;
		return this;
	}

	public InfoDecJud getInfoDecJud() {
		return infoDecJud;
	}

	public InfoEstatutario setInfoDecJud(InfoDecJud decisaoJudicial) {
		this.infoDecJud = decisaoJudicial;
		return this;
	}

}
