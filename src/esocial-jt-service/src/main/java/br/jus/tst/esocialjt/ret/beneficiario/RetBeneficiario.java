package br.jus.tst.esocialjt.ret.beneficiario;

import br.jus.tst.esocial.ret.beneficiario.Beneficiario;
import br.jus.tst.esocial.ret.beneficiario.DadosCadastrais;
import br.jus.tst.esocialjt.dominio.Ocorrencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RetBeneficiario {

    private Beneficiario beneficiario;
    private List<Ocorrencia> ocorrencias = new ArrayList<>();

    public RetBeneficiario() {
        this.beneficiario = new Beneficiario();
        this.beneficiario.setDadosCadastrais(new DadosCadastrais());
    }

    public RetBeneficiario addOcorrencia(Ocorrencia ocorrencia) {
        ocorrencias.add(ocorrencia);
        return this;
    }

    public String getCpf() {
        return Optional
                .ofNullable(beneficiario)
                .map(o -> o.getDadosCadastrais())
                .map(dadosCadastrais -> dadosCadastrais.getCpfBenef())
                .orElseGet(null);
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
}
