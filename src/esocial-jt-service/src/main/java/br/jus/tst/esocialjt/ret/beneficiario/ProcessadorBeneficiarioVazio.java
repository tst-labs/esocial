package br.jus.tst.esocialjt.ret.beneficiario;

import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ProcessadorBeneficiarioVazio implements ProcessadorBeneficiario{

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessadorBeneficiarioVazio.class);

    @Override
    public void processaRegistro(ArrayList<RetBeneficiario> beneficiarios, Ocorrencia ocorrencia) {
        LOGGER.error("Não foi encontrado um processador para o tipo " + ocorrencia.getTipoOcorrencia());
    }
}
