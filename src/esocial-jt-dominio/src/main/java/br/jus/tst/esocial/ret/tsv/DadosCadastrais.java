package br.jus.tst.esocial.ret.tsv;

import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.nascimento.Nascimento;
import br.jus.tst.esocial.dominio.trabalhador.Contato;
import br.jus.tst.esocial.dominio.trabalhador.Dependente;
import br.jus.tst.esocial.dominio.trabalhador.InfoDeficiencia;
import br.jus.tst.esocial.dominio.trabalhador.TrabImig;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

public class DadosCadastrais {
    public String cpfTrab;
    public String nmTrab;
    public Sexo sexo;
    public byte racaCor;
    public Byte estCiv;
    public String grauInstr;
    public String nmSoc;
    public Nascimento nascimento;
    public Endereco endereco;
    public TrabImig trabImig;
    public InfoDeficiencia infoDeficiencia;
    public List<Dependente> dependente;
    public Contato contato;

    public String getCpfTrab() {
        return cpfTrab;
    }

    public void setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
    }

    public String getNmTrab() {
        return nmTrab;
    }

    public void setNmTrab(String nmTrab) {
        this.nmTrab = nmTrab;
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

    public String getGrauInstr() {
        return grauInstr;
    }

    public void setGrauInstr(String grauInstr) {
        this.grauInstr = grauInstr;
    }

    public String getNmSoc() {
        return nmSoc;
    }

    public void setNmSoc(String nmSoc) {
        this.nmSoc = nmSoc;
    }

    public Nascimento getNascimento() {
        return nascimento;
    }

    public void setNascimento(Nascimento nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TrabImig getTrabImig() {
        return trabImig;
    }

    public void setTrabImig(TrabImig trabImig) {
        this.trabImig = trabImig;
    }

    public InfoDeficiencia getInfoDeficiencia() {
        return infoDeficiencia;
    }

    public void setInfoDeficiencia(InfoDeficiencia infoDeficiencia) {
        this.infoDeficiencia = infoDeficiencia;
    }

    public List<Dependente> getDependente() {
        return dependente;
    }

    public void setDependente(List<Dependente> dependente) {
        this.dependente = dependente;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosCadastrais that = (DadosCadastrais) o;
        return new EqualsBuilder()
                .append(racaCor, that.racaCor)
                .append(cpfTrab, that.cpfTrab)
                .append(nmTrab, that.nmTrab)
                .append(sexo, that.sexo)
                .append(estCiv, that.estCiv)
                .append(grauInstr, that.grauInstr)
                .append(nmSoc, that.nmSoc)
                .append(nascimento, that.nascimento)
                .append(endereco, that.endereco)
                .append(trabImig, that.trabImig)
                .append(infoDeficiencia, that.infoDeficiencia)
                .append(dependente, that.dependente)
                .append(contato, that.contato)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(cpfTrab)
                .append(nmTrab)
                .append(sexo)
                .append(racaCor)
                .append(estCiv)
                .append(grauInstr)
                .append(nmSoc)
                .append(nascimento)
                .append(endereco)
                .append(trabImig)
                .append(infoDeficiencia)
                .append(dependente)
                .append(contato)
                .toHashCode();
    }
}
