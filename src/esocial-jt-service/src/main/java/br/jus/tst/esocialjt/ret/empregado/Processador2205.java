package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2205 implements ProcessadorEmpregado{
    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        AltCadastral alteracao = (AltCadastral) ocorrencia.getDadosOcorrencia();

        listaRetEmpregado.forEach(re -> {
            BeanUtils.copyProperties(alteracao.getAlteracao().getDadosTrabalhador(), re.empregado.dadosCadastrais);
            re.empregado.dadosCadastrais.nascimento.setPaisNac(alteracao.getAlteracao().getDadosTrabalhador().getPaisNac());
            re.addOcorrencia(ocorrencia);
        });

    }
}
