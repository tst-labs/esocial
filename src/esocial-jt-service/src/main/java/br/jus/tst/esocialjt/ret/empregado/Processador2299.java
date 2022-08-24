package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.dominio.desligamento.InfoDeslig;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import br.jus.tst.esocial.ret.empregado.DadosDesligamento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2299 implements ProcessadorEmpregado{
    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        Deslig deslig = (Deslig) ocorrencia.getDadosOcorrencia();
        String matriculaOcorrencia = ocorrencia.getDadosOcorrencia().getMatricula();

        listaRetEmpregado
                .stream()
                .filter(re -> StringUtils.equals(matriculaOcorrencia, re.getMatricula()))
                .forEach(re -> {
                    re.empregado.dadosDesligamento = new DadosDesligamento();
                    re.empregado.dadosDesligamento.infoDeslig = new InfoDeslig();
                    BeanUtils.copyProperties(deslig.getInfoDeslig(), re.empregado.dadosDesligamento.infoDeslig);
                    re.addOcorrencia(ocorrencia);
                });
    }
}
