package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ProcessadorTSVVazio implements ProcessadorTrabalhadorSemVinculo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessadorTSVVazio.class);

    @Override
    public void processaRegistro(ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo, Ocorrencia ocorrencia) {
        LOGGER.error("Não foi encontrado um processador para o tipo " + ocorrencia.getTipoOcorrencia());
    }
}
