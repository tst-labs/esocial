package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Vinculo {

    private byte tpRegPrev;

    public void setTpRegPrev(byte tpRegPrev) {
        this.tpRegPrev = tpRegPrev;
    }

    public byte getTpRegPrev() {
        return tpRegPrev;
    }
    
    @Override
    public boolean equals(Object other) {
		if (!(other instanceof IdeVinculo)) {
			return false;
		}
		Vinculo castOther = (Vinculo) other;
		return new EqualsBuilder().append(tpRegPrev, castOther.tpRegPrev).isEquals();
    }

    @Override
    public int hashCode() {
		return new HashCodeBuilder().append(tpRegPrev).toHashCode();
    }

}