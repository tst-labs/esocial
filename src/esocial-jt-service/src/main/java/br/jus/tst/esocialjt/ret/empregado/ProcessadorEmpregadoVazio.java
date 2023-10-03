package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ProcessadorEmpregadoVazio implements ProcessadorEmpregado{
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessadorEmpregadoVazio.class);

    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        LOGGER.error("Não foi encontrado um processador para o tipo " + ocorrencia.getTipoOcorrencia());
    }
}
