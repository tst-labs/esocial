package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class AltContratual {

	@NotNull
    private Calendar dtAlteracao;

    @Null
    private Calendar dtEf;

    @Size(min = 3, max = 150)
    private String dscAlt;

    @Valid
    @NotNull
    private Vinculo vinculo;

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

    @Override
    public boolean equals(Object other) {
		if (!(other instanceof AltContratual)) {
			return false;
		}
		AltContratual castOther = (AltContratual) other;
		return new EqualsBuilder().append(vinculo, castOther.vinculo).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                    .append(dtAlteracao)
                    .append(vinculo)
                    .toHashCode();
    }
}