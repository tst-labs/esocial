package br.jus.tst.esocial.dominio.empregador;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class IdeEmpregador {

	@NotNull
    private byte tpInsc;

	@NotNull
	@Pattern(regexp="\\d{8,15}")
    private String nrInsc;

    public String getNrInsc() {
        return nrInsc;
    }

    public IdeEmpregador setNrInsc(String numeroInscricao) {
        this.nrInsc = numeroInscricao;
        return this;
    }

    public byte getTpInsc() {
        return tpInsc;
    }

    public IdeEmpregador setTpInsc(byte tipoInscricao) {
        this.tpInsc = tipoInscricao;
        return this;
    }

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof IdeEmpregador)) {
			return false;
		}
		IdeEmpregador castOther = (IdeEmpregador) other;
		return new EqualsBuilder()
				.append(tpInsc, castOther.tpInsc)
				.append(nrInsc, castOther.nrInsc)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(tpInsc)
				.append(nrInsc)
				.toHashCode();
	}
}
