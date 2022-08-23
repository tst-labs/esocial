package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class Processador2230 implements ProcessadorEmpregado{
    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        AfastTemp afastTemp = (AfastTemp) ocorrencia.getDadosOcorrencia();
        String matriculaOcorrencia = ocorrencia.getDadosOcorrencia().getMatricula();
        listaRetEmpregado
                .stream()
                .filter(re -> StringUtils.equals(matriculaOcorrencia, re.getMatricula()))
                .forEach(re -> {
                    if( re.empregado.dadosAfastamentos == null){
                        re.empregado.dadosAfastamentos = new ArrayList<>();
                    }
                    re.empregado.dadosAfastamentos.add(afastTemp.getInfoAfastamento());
                    re.addOcorrencia(ocorrencia);
                });
    }
}
