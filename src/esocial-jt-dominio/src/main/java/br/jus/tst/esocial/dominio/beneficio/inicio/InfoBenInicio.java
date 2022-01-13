package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Calendar;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoBenInicio {
	
	@NotNull
	private SimNao cadIni;
	
	private Byte indSitBenef;
	
	@NotNull
	private String nrBeneficio;
		
	@NotNull
	private Calendar dtIniBeneficio;

	private Calendar dtPublic;
	
	@Valid
	@NotNull
	private DadosBeneficio dadosBeneficio;
	
	@Valid
	private SucessaoBenef sucessaoBenef;
	
	@Valid
	private MudancaCPF mudancaCPF;
	
	@Valid
	private InfoBenTermino infoBenTermino;
	
	public SimNao getCadIni() {
		return cadIni;
	}

	public void setCadIni(SimNao cadIni) {
		this.cadIni = cadIni;
	}

	public Byte getIndSitBenef() {
		return indSitBenef;
	}

	public void setIndSitBenef(Byte indSitBenef) {
		this.indSitBenef = indSitBenef;
	}

	public String getNrBeneficio() {
		return nrBeneficio;
	}

	public void setNrBeneficio(String nrBeneficio) {
		this.nrBeneficio = nrBeneficio;
	}

	public Calendar getDtIniBeneficio() {
		return dtIniBeneficio;
	}

	public void setDtIniBeneficio(Calendar dtIniBeneficio) {
		this.dtIniBeneficio = dtIniBeneficio;
	}

	public Calendar getDtPublic() {
		return dtPublic;
	}

	public void setDtPublic(Calendar dtPublic) {
		this.dtPublic = dtPublic;
	}

	public DadosBeneficio getDadosBeneficio() {
		return dadosBeneficio;
	}

	public void setDadosBeneficio(DadosBeneficio dadosBeneficio) {
		this.dadosBeneficio = dadosBeneficio;
	}

	public SucessaoBenef getSucessaoBenef() {
		return sucessaoBenef;
	}

	public void setSucessaoBenef(SucessaoBenef sucessaoBenef) {
		this.sucessaoBenef = sucessaoBenef;
	}

	public MudancaCPF getMudancaCPF() {
		return mudancaCPF;
	}

	public void setMudancaCPF(MudancaCPF mudancaCPF) {
		this.mudancaCPF = mudancaCPF;
	}

	public InfoBenTermino getInfoBenTermino() {
		return infoBenTermino;
	}

	public void setInfoBenTermino(InfoBenTermino infoBenTermino) {
		this.infoBenTermino = infoBenTermino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cadIni, dtIniBeneficio, dtPublic, indSitBenef, nrBeneficio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoBenInicio other = (InfoBenInicio) obj;
		return cadIni == other.cadIni && Objects.equals(dtIniBeneficio, other.dtIniBeneficio)
				&& Objects.equals(dtPublic, other.dtPublic) && Objects.equals(indSitBenef, other.indSitBenef)
				&& Objects.equals(nrBeneficio, other.nrBeneficio);
	}
}
