package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.ocorrencia.dados.TSVTermino;
import br.jus.tst.esocial.ret.tsv.TrabalhadorSemVinculo;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class Processador2399Test {

    @Test
    public void deveProcessar2399SobreTSVExistente() {
        ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo = new ArrayList<>();
        TrabalhadorSemVinculo inicial = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/inicial.json");
        RetTrabalhadorSemVinculo retTSV = new RetTrabalhadorSemVinculo();
        retTSV.trabalhadorSemVinculo = inicial;

        listaRetTrabalhadorSemVinculo.add(retTSV);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/trabalhadorsemvinculo/s2399/tsv_termino.json");
        TrabalhadorSemVinculo esperado = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/esperado.json");

        Processador2399 processador = new Processador2399();
        processador.processaRegistro(listaRetTrabalhadorSemVinculo, ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo).hasSize(1);

        assertThat(listaRetTrabalhadorSemVinculo.get(0).trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetTrabalhadorSemVinculo.get(0).ocorrencias).contains(ocorrencia);
    }

    @Test
    public void deveProcessar2399SomenteMatriculaIgual() {
        TrabalhadorSemVinculo inicial1 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/inicial.json");
        RetTrabalhadorSemVinculo retTSV1 = new RetTrabalhadorSemVinculo();
        retTSV1.trabalhadorSemVinculo = inicial1;

        TrabalhadorSemVinculo inicial2 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/inicial.json");
        inicial2.dadosContratuais.setMatricula("88888");
        RetTrabalhadorSemVinculo retTSV2 = new RetTrabalhadorSemVinculo();
        retTSV2.trabalhadorSemVinculo = inicial2;
        retTSV2.addOcorrencia(new Ocorrencia());

        ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo = new ArrayList<>();
        listaRetTrabalhadorSemVinculo.add(retTSV1);
        listaRetTrabalhadorSemVinculo.add(retTSV2);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/trabalhadorsemvinculo/s2399/tsv_termino.json");
        TrabalhadorSemVinculo esperado1 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/esperado.json");
        TrabalhadorSemVinculo esperado2 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/inicial.json");
        esperado2.dadosContratuais.setMatricula("88888");

        Processador2399 processador = new Processador2399();
        processador.processaRegistro(listaRetTrabalhadorSemVinculo, ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo).hasSize(2);

        assertThat(listaRetTrabalhadorSemVinculo.get(0).trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado1);
        assertThat(listaRetTrabalhadorSemVinculo.get(0).ocorrencias).contains(ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo.get(1).trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado2);
        assertThat(listaRetTrabalhadorSemVinculo.get(1).ocorrencias).doesNotContain(ocorrencia);
    }

    @Test
    public void deveProcessar2399SomenteCodCategIgual() {
        TrabalhadorSemVinculo inicial1 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/inicial.json");
        inicial1.dadosContratuais.setMatricula(null);
        RetTrabalhadorSemVinculo retTSV1 = new RetTrabalhadorSemVinculo();
        retTSV1.trabalhadorSemVinculo = inicial1;

        TrabalhadorSemVinculo inicial2 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/inicial.json");
        inicial2.dadosContratuais.setMatricula(null);
        inicial2.dadosContratuais.setCodCateg(2);
        RetTrabalhadorSemVinculo retTSV2 = new RetTrabalhadorSemVinculo();
        retTSV2.trabalhadorSemVinculo = inicial2;
        retTSV2.addOcorrencia(new Ocorrencia());

        ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo = new ArrayList<>();
        listaRetTrabalhadorSemVinculo.add(retTSV1);
        listaRetTrabalhadorSemVinculo.add(retTSV2);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/trabalhadorsemvinculo/s2399/tsv_termino.json");
        TSVTermino termino = (TSVTermino) ocorrencia.getDadosOcorrencia();
        termino.getIdeTrabSemVinculo().setMatricula(null);

        TrabalhadorSemVinculo esperado1 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/esperado.json");
        esperado1.dadosContratuais.setMatricula(null);

        TrabalhadorSemVinculo esperado2 = OcorrenciaUtil.lerTrabalhadorSemVinculo("ret/trabalhadorsemvinculo/s2399/inicial.json");
        esperado2.dadosContratuais.setMatricula(null);
        esperado2.dadosContratuais.setCodCateg(2);

        Processador2399 processador = new Processador2399();
        processador.processaRegistro(listaRetTrabalhadorSemVinculo, ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo).hasSize(2);

        assertThat(listaRetTrabalhadorSemVinculo.get(0).trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado1);
        assertThat(listaRetTrabalhadorSemVinculo.get(0).ocorrencias).contains(ocorrencia);

        assertThat(listaRetTrabalhadorSemVinculo.get(1).trabalhadorSemVinculo).usingRecursiveComparison().isEqualTo(esperado2);
        assertThat(listaRetTrabalhadorSemVinculo.get(1).ocorrencias).doesNotContain(ocorrencia);
    }

}