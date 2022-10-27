package br.jus.tst.esocial.dominio.monit;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.List;

public class Aso {
    @NotNull
    public Calendar dtAso;
    public Byte resAso;
    @NotNull
    @Valid
    public List<Exame> exame;
    @NotNull
    @Valid
    public Medico medico;

    public Calendar getDtAso() {
        return dtAso;
    }

    public void setDtAso(Calendar dtAso) {
        this.dtAso = dtAso;
    }

    public Byte getResAso() {
        return resAso;
    }

    public void setResAso(Byte resAso) {
        this.resAso = resAso;
    }

    public List<Exame> getExame() {
        return exame;
    }

    public void setExame(List<Exame> exame) {
        this.exame = exame;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Aso aso = (Aso) o;

        return new EqualsBuilder().append(dtAso, aso.dtAso).append(resAso, aso.resAso).append(exame, aso.exame).append(medico, aso.medico).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(dtAso).append(resAso).append(exame).append(medico).toHashCode();
    }
}
