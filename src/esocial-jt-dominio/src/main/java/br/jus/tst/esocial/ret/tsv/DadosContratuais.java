package br.jus.tst.esocial.ret.tsv;

import br.jus.tst.esocial.dominio.semvinculo.InfoComplementares;
import br.jus.tst.esocial.dominio.semvinculo.MudancaCPF;
import br.jus.tst.esocial.dominio.semvinculo.Termino;
import br.jus.tst.esocial.dominio.vinculo.Afastamento;
import java.time.LocalDate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DadosContratuais {

    private String matricula;
    private Integer codCateg;
    private LocalDate dtInicio;
    private String nrProcTrab;
    private Byte natAtividade;
    private InfoComplementares infoComplementares;
    private Afastamento afastamento;
    private Termino termino;
    private MudancaCPF mudancaCPF;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getCodCateg() {
        return codCateg;
    }

    public void setCodCateg(Integer codCateg) {
        this.codCateg = codCateg;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getNrProcTrab() {
        return nrProcTrab;
    }

    public void setNrProcTrab(String nrProcTrab) {
        this.nrProcTrab = nrProcTrab;
    }

    public Byte getNatAtividade() {
        return natAtividade;
    }

    public void setNatAtividade(Byte natAtividade) {
        this.natAtividade = natAtividade;
    }

    public InfoComplementares getInfoComplementares() {
        return infoComplementares;
    }

    public void setInfoComplementares(InfoComplementares infoComplementares) {
        this.infoComplementares = infoComplementares;
    }

    public Afastamento getAfastamento() {
        return afastamento;
    }

    public void setAfastamento(Afastamento afastamento) {
        this.afastamento = afastamento;
    }

    public Termino getTermino() {
        return termino;
    }

    public void setTermino(Termino termino) {
        this.termino = termino;
    }

    public MudancaCPF getMudancaCPF() {
        return mudancaCPF;
    }

    public void setMudancaCPF(MudancaCPF mudancaCPF) {
        this.mudancaCPF = mudancaCPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DadosContratuais that = (DadosContratuais) o;

        return new EqualsBuilder()
                .append(codCateg, that.codCateg)
                .append(matricula, that.matricula)
                .append(dtInicio, that.dtInicio)
                .append(nrProcTrab, that.nrProcTrab)
                .append(natAtividade, that.natAtividade)
                .append(infoComplementares, that.infoComplementares)
                .append(afastamento, that.afastamento)
                .append(termino, that.termino)
                .append(mudancaCPF, that.mudancaCPF)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(matricula)
                .append(codCateg)
                .append(dtInicio)
                .append(natAtividade)
                .append(nrProcTrab)
                .append(infoComplementares)
                .append(afastamento)
                .append(termino)
                .append(mudancaCPF)
                .toHashCode();
    }
}
