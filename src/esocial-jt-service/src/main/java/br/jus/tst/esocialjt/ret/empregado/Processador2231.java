package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ocorrencia.dados.Cessao;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class Processador2231 implements ProcessadorEmpregado{
    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        Cessao cessao = (Cessao) ocorrencia.getDadosOcorrencia();
        String matriculaOcorrencia = ocorrencia.getDadosOcorrencia().getMatricula();
        listaRetEmpregado
                .stream()
                .filter(re -> StringUtils.equals(matriculaOcorrencia, re.getMatricula()))
                .forEach(re -> {
                    if( re.empregado.dadosCessoes == null){
                        re.empregado.dadosCessoes = new ArrayList<>();
                    }
                    re.empregado.dadosCessoes.add(cessao.getInfoCessao());
                    re.addOcorrencia(ocorrencia);
                });
    }
}
