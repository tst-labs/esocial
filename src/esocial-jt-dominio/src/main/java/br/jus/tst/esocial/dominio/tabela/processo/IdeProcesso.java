package br.jus.tst.esocial.dominio.tabela.processo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.validacao.CheckDate;

public class IdeProcesso {

	@NotNull
	private byte tpProc;
	
	@NotNull
	@Size(min = 1, max = 21)
	private String nrProc;
	
	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String iniValid;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String fimValid;

	public byte getTpProc() {
		return tpProc;
	}

	public IdeProcesso setTpProc(byte tipoProcesso) {
		this.tpProc = tipoProcesso;
		return this;
	}

	public String getNrProc() {
		return nrProc;
	}

	public IdeProcesso setNrProc(String numeroProcesso) {
		this.nrProc = numeroProcesso;
		return this;
	}

	public String getIniValid() {
		return iniValid;
	}

	public void setIniValid(String dataInicio) {
		this.iniValid = dataInicio;
	}

	public String getFimValid() {
		return fimValid;
	}

	public void setFimValid(String dataFim) {
		this.fimValid = dataFim;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof IdeProcesso)) {
			return false;
		}
		IdeProcesso castOther = (IdeProcesso) other;
		return new EqualsBuilder().append(tpProc, castOther.tpProc)
				.append(nrProc, castOther.nrProc).append(iniValid, castOther.iniValid)
				.append(fimValid, castOther.fimValid).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tpProc).append(nrProc).append(iniValid).append(fimValid)
				.toHashCode();
	}

}
