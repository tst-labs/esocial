package br.jus.tst.esocialjt.ocorrencia;

import java.util.Date;

public class OcorrenciaSumario {
    Long id;
    String cpf;
    String matricula;
    String referencia;
    Long tipo;
    String estado;

    Date dataOcorrencia;

    public OcorrenciaSumario(Long id, String cpf, String matricula, String referencia, Long tipo, String estado, Date dataOcorrencia) {
        this.id = id;
        this.cpf = cpf;
        this.matricula = matricula;
        this.referencia = referencia;
        this.tipo = tipo;
        this.estado = estado;
        this.dataOcorrencia = dataOcorrencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
}
