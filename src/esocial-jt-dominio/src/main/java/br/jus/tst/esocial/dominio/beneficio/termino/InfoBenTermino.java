package br.jus.tst.esocial.dominio.beneficio.termino;

import java.util.Calendar;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class InfoBenTermino {

	@NotNull
	private Calendar dtTermBeneficio;
	
	private String mtvTermino;
	
	private String cnpjOrgaoSuc;
	
	private String novoCPF;

	public Calendar getDtTermBeneficio() {
		return dtTermBeneficio;
	}

	public void setDtTermBeneficio(Calendar dtTermBeneficio) {
		this.dtTermBeneficio = dtTermBeneficio;
	}

	public String getMtvTermino() {
		return mtvTermino;
	}

	public void setMtvTermino(String mtvTermino) {
		this.mtvTermino = mtvTermino;
	}

	public String getCnpjOrgaoSuc() {
		return cnpjOrgaoSuc;
	}

	public void setCnpjOrgaoSuc(String cnpjOrgaoSuc) {
		this.cnpjOrgaoSuc = cnpjOrgaoSuc;
	}

	public String getNovoCPF() {
		return novoCPF;
	}

	public void setNovoCPF(String novoCPF) {
		this.novoCPF = novoCPF;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpjOrgaoSuc, dtTermBeneficio, mtvTermino, novoCPF);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoBenTermino other = (InfoBenTermino) obj;
		return Objects.equals(cnpjOrgaoSuc, other.cnpjOrgaoSuc)
				&& Objects.equals(dtTermBeneficio, other.dtTermBeneficio) && mtvTermino == other.mtvTermino
				&& Objects.equals(novoCPF, other.novoCPF);
	}
	
}
