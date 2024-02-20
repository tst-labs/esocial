package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.ret.tsv.TrabalhadorSemVinculo;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class Processador2205TSVTest {

    @Test
    public void deveProcessar2205SobreTSVExistente() {
        ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo = new ArrayList<>();
        TrabalhadorSemVinculo inicial = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2205/inicial.json");
        RetTrabalhadorSemVinculo retTSV = new RetTrabalhadorSemVinculo();
        retTSV.trabalhadorSemVinculo = inicial;

        listaRetTrabalhadorSemVinculo.add(retTSV);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/trabalhadorsemvinculo/s2205/alteracao_cadastral.json");
        TrabalhadorSemVinculo esperado = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2205/esperado.json");

        Processador2205TSV processador = new Processador2205TSV();
        processador.processaRegistro(listaRetTrabalhadorSemVinculo, ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo).hasSize(1);

        assertThat(listaRetTrabalhadorSemVinculo.get(0).trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetTrabalhadorSemVinculo.get(0).ocorrencias).contains(ocorrencia);
    }

    @Test
    public void deveProcessar2205SobreMaisDeUmTSVExistente() {
        ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo = new ArrayList<>();
        TrabalhadorSemVinculo inicial1 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2205/inicial.json");
        TrabalhadorSemVinculo inicial2 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2205/inicial.json");

        RetTrabalhadorSemVinculo retEmpregado1 = new RetTrabalhadorSemVinculo();
        retEmpregado1.trabalhadorSemVinculo = inicial1;
        listaRetTrabalhadorSemVinculo.add(retEmpregado1);

        RetTrabalhadorSemVinculo retEmpregado2 = new RetTrabalhadorSemVinculo();
        retEmpregado2.trabalhadorSemVinculo = inicial2;
        listaRetTrabalhadorSemVinculo.add(retEmpregado2);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/trabalhadorsemvinculo/s2205/alteracao_cadastral.json");
        TrabalhadorSemVinculo esperado = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2205/esperado.json");

        Processador2205TSV processador = new Processador2205TSV();
        processador.processaRegistro(listaRetTrabalhadorSemVinculo, ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo).hasSize(2);

        listaRetTrabalhadorSemVinculo.forEach(re -> {
            assertThat(re.trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado);
            assertThat(re.ocorrencias).contains(ocorrencia);
        });

    }

}