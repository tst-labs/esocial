package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.ret.tsv.DadosCadastrais;
import br.jus.tst.esocial.ret.tsv.DadosContratuais;
import br.jus.tst.esocial.ret.tsv.TrabalhadorSemVinculo;
import br.jus.tst.esocialjt.dominio.Ocorrencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RetTrabalhadorSemVinculo {

    public TrabalhadorSemVinculo trabalhadorSemVinculo;
    public List<Ocorrencia> ocorrencias;

    public void addOcorrencia(Ocorrencia ocorrencia) {
        if (this.ocorrencias == null) {
            ocorrencias = new ArrayList<>();
        }
        ocorrencias.add(ocorrencia);
    }

    public String getCpf() {
        return Optional
                .ofNullable(trabalhadorSemVinculo)
                .map(TrabalhadorSemVinculo::getDadosCadastrais)
                .map(DadosCadastrais::getCpfTrab)
                .orElse(null);
    }

    public String getMatricula() {
        return Optional
                .ofNullable(trabalhadorSemVinculo)
                .map(TrabalhadorSemVinculo::getDadosContratuais)
                .map(DadosContratuais::getMatricula)
                .orElse(null);
    }
}
