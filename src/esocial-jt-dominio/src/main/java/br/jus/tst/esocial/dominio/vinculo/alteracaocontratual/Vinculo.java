package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.vinculo.InfoContrato;

public class Vinculo {

    private byte tpRegPrev;
    
    @Valid
    @NotNull
    private InfoRegimeTrab infoRegimeTrab;

    @Valid
    @NotNull
    private InfoContrato infoContrato;

    public void setTpRegPrev(byte tpRegPrev) {
        this.tpRegPrev = tpRegPrev;
    }

    public byte getTpRegPrev() {
        return tpRegPrev;
    }
    
    public InfoRegimeTrab getInfoRegimeTrab() {
		return infoRegimeTrab;
	}

	public void setInfoRegimeTrab(InfoRegimeTrab infoRegimeTrab) {
		this.infoRegimeTrab = infoRegimeTrab;
	}

	public InfoContrato getInfoContrato() {
		return infoContrato;
	}

	public void setInfoContrato(InfoContrato infoContrato) {
		this.infoContrato = infoContrato;
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