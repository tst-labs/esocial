package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.vinculo.InfoContrato;
import br.jus.tst.esocial.dominio.vinculo.InfoRegimeTrab;

public class AltContratual {

	@NotNull
    private Calendar dtAlteracao;

    @Null
    private Calendar dtEf;

    @Null
    @Size(min = 3, max = 150)
    private String dscAlt;

    @Valid
    @NotNull
    private Vinculo vinculo;

    @Valid
    @NotNull
    private InfoRegimeTrab infoRegimeTrab;

    @Valid
    @NotNull
    private InfoContrato infoContrato;

    public void setDtAlteracao(Calendar dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    public Calendar getDtAlteracao() {
        return dtAlteracao;
    }

    public void setDtEf(Calendar dtEf) {
        this.dtEf = dtEf;
    }

    public Calendar getDtEf() {
        return dtEf;
    }

    public void setDscAlt(String dscAlt) {
        this.dscAlt = dscAlt;
    }

    public String getDscAlt() {
        return dscAlt;
    }

    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }

    public Vinculo getVinculo() {
        return vinculo;
    }

    public void setInfoRegimeTrab(InfoRegimeTrab infoRegimeTrab) {
        this.infoRegimeTrab = infoRegimeTrab;
    }

    public InfoRegimeTrab getInfoRegimeTrab() {
        return infoRegimeTrab;
    }

    public void setInfoContrato(InfoContrato infoContrato) {
        this.infoContrato = infoContrato;
    }

    public InfoContrato getInfoContrato() {
        return infoContrato;
    }

    @Override
    public boolean equals(Object other) {
		if (!(other instanceof AltContratual)) {
			return false;
		}
		AltContratual castOther = (AltContratual) other;
		return new EqualsBuilder().append(infoContrato, castOther.infoContrato).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                    .append(dtAlteracao)
                    .append(vinculo)
                    .append(infoContrato)
                    .toHashCode();
    }

}