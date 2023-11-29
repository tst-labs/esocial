package br.jus.tst.esocial.dominio.pagamento;

import br.jus.tst.esocial.dominio.enums.Sim;

import javax.validation.constraints.NotEmpty;
import java.util.Calendar;

public class InfoDep {

    @NotEmpty
    private String cpfDep;
    private Calendar dtNascto;
    private String nome;
    private Sim depIRRF;
    private String tpDep;
    private String descrDep;

    public String getCpfDep() {
        return cpfDep;
    }

    public void setCpfDep(String cpfDep) {
        this.cpfDep = cpfDep;
    }

    public Calendar getDtNascto() {
        return dtNascto;
    }

    public void setDtNascto(Calendar dtNascto) {
        this.dtNascto = dtNascto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sim getDepIRRF() {
        return depIRRF;
    }

    public void setDepIRRF(Sim depIRRF) {
        this.depIRRF = depIRRF;
    }

    public String getTpDep() {
        return tpDep;
    }

    public void setTpDep(String tpDep) {
        this.tpDep = tpDep;
    }

    public String getDescrDep() {
        return descrDep;
    }

    public void setDescrDep(String descrDep) {
        this.descrDep = descrDep;
    }
}
