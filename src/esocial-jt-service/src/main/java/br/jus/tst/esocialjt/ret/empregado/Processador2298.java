package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.dominio.reintegracao.InfoReintegr;
import br.jus.tst.esocial.ocorrencia.dados.Reintegr;
import br.jus.tst.esocial.ret.empregado.DadosDesligamento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2298 implements ProcessadorEmpregado{
    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        Reintegr reintegr = (Reintegr) ocorrencia.getDadosOcorrencia();

        String matriculaOcorrencia = ocorrencia.getDadosOcorrencia().getMatricula();

        listaRetEmpregado
                .stream()
                .filter(re -> StringUtils.equals(matriculaOcorrencia, re.getMatricula()))
                .forEach(re -> {
                    if( re.empregado.dadosDesligamento == null){
                        re.empregado.dadosDesligamento = new DadosDesligamento();
                    }
                    re.empregado.dadosDesligamento.infoReintegr = new InfoReintegr();
                    BeanUtils.copyProperties(reintegr.getInfoReintegr(), re.empregado.dadosDesligamento.infoReintegr);
                    re.addOcorrencia(ocorrencia);
                });
    }
}
