package br.jus.tst.esocialjt.ret.beneficiario;

import br.jus.tst.esocial.dominio.beneficiario.inicio.Beneficiario;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefIn;
import br.jus.tst.esocial.ret.beneficiario.DadosCadastrais;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2400 implements  ProcessadorBeneficiario {

    @Override
    public void processaRegistro(ArrayList<RetBeneficiario> beneficiarios, Ocorrencia ocorrencia) {

        CdBenefIn beneficiario = (CdBenefIn) ocorrencia.getDadosOcorrencia();
        RetBeneficiario ret = new RetBeneficiario();
        DadosCadastrais dadosCadastrais = new DadosCadastrais();
        BeanUtils.copyProperties(beneficiario.getBeneficiario(), dadosCadastrais);
        ret.getBeneficiario().setDadosCadastrais(dadosCadastrais);

        ret.addOcorrencia(ocorrencia);

        beneficiarios.add(ret);
    }
}
