package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2205TSV implements ProcessadorTrabalhadorSemVinculo {

    @Override
    public void processaRegistro(ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo, Ocorrencia ocorrencia) {
        AltCadastral alteracao = (AltCadastral) ocorrencia.getDadosOcorrencia();

        listaRetTrabalhadorSemVinculo.forEach(re -> {
            BeanUtils.copyProperties(alteracao.getAlteracao().getDadosTrabalhador(), re.trabalhadorSemVinculo.dadosCadastrais);
            re.trabalhadorSemVinculo.dadosCadastrais.nascimento.setPaisNac(alteracao.getAlteracao().getDadosTrabalhador().getPaisNac());
            re.addOcorrencia(ocorrencia);
        });
    }
}
