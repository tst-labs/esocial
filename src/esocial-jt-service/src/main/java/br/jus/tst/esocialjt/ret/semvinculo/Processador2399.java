package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.dominio.semvinculo.termino.InfoTSVTermino;
import br.jus.tst.esocial.ocorrencia.dados.TSVTermino;
import br.jus.tst.esocial.ret.tsv.DadosDesligamento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2399 implements ProcessadorTrabalhadorSemVinculo {

    @Override
    public void processaRegistro(ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo, Ocorrencia ocorrencia) {
        TSVTermino termino = (TSVTermino) ocorrencia.getDadosOcorrencia();
        String matriculaOcorrencia = ocorrencia.getDadosOcorrencia().getMatricula();
        Integer codCateg = termino.getIdeTrabSemVinculo().getCodCateg();

        listaRetTrabalhadorSemVinculo
                .stream()
                .filter(re -> StringUtils.equals(matriculaOcorrencia, re.getMatricula()))
                .filter(re -> codCateg == null || codCateg.equals(re.trabalhadorSemVinculo.getDadosContratuais().getCodCateg()))
                .forEach(re -> {
                    re.trabalhadorSemVinculo.dadosDesligamento = new DadosDesligamento();
                    re.trabalhadorSemVinculo.dadosDesligamento.infoTSVTermino =  new InfoTSVTermino();
                    BeanUtils.copyProperties(termino.getInfoTSVTermino(), re.trabalhadorSemVinculo.dadosDesligamento.infoTSVTermino);
                    re.addOcorrencia(ocorrencia);
                });
    }
}
