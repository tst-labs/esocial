package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.ret.tsv.TrabalhadorSemVinculo;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class Processador2300Test {
    
    @Test
    void deveProcessar2300Novo() {
        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/trabalhadorsemvinculo/s2300/tsvinicio.json");
        TrabalhadorSemVinculo esperado = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2300/esperado.json");
        ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo = new ArrayList<>();

        Processador2300 processador = new Processador2300();

        processador.processaRegistro(listaRetTrabalhadorSemVinculo, ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo).hasSize(1);
        assertThat(listaRetTrabalhadorSemVinculo.get(0).trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetTrabalhadorSemVinculo.get(0).ocorrencias).contains(ocorrencia);
    }
}
