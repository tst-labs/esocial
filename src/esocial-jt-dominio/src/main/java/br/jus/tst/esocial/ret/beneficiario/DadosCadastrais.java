package br.jus.tst.esocial.ret.beneficiario;

import br.jus.tst.esocial.dominio.beneficiario.inicio.Dependente;
import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;

import java.util.Calendar;
import java.util.List;

public class DadosCadastrais {

    private String cpfBenef;
    private String nmBenefic;
    private Calendar dtNascto;
    private Calendar dtInicio;
    private Sexo sexo;
    private byte racaCor;
    private Byte estCiv;
    private SimNao incFisMen;
    private Calendar dtIncFisMen;
    private Endereco endereco;
    private List<Dependente> dependente;

    public String getCpfBenef() {
        return cpfBenef;
    }

    public void setCpfBenef(String cpfBenef) {
        this.cpfBenef = cpfBenef;
    }

    public String getNmBenefic() {
        return nmBenefic;
    }

    public void setNmBenefic(String nmBenefic) {
        this.nmBenefic = nmBenefic;
    }

    public Calendar getDtNascto() {
        return dtNascto;
    }

    public void setDtNascto(Calendar dtNascto) {
        this.dtNascto = dtNascto;
    }

    public Calendar getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Calendar dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public byte getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(byte racaCor) {
        this.racaCor = racaCor;
    }

    public Byte getEstCiv() {
        return estCiv;
    }

    public void setEstCiv(Byte estCiv) {
        this.estCiv = estCiv;
    }

    public SimNao getIncFisMen() {
        return incFisMen;
    }

    public void setIncFisMen(SimNao incFisMen) {
        this.incFisMen = incFisMen;
    }

    public Calendar getDtIncFisMen() {
        return dtIncFisMen;
    }

    public void setDtIncFisMen(Calendar dtIncFisMen) {
        this.dtIncFisMen = dtIncFisMen;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Dependente> getDependente() {
        return dependente;
    }

    public void setDependente(List<Dependente> dependente) {
        this.dependente = dependente;
    }
}
