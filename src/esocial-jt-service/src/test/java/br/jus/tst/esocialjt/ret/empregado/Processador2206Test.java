package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ret.empregado.Empregado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class Processador2206Test {
    @Test
    public void deveProcessar2206SobreEmpregadoEstatutarioExistente() {
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        Empregado inicial = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/estatutario/inicial.json");
        RetEmpregado retEmpregado = new RetEmpregado();
        retEmpregado.empregado = inicial;
        listaRetEmpregado.add(retEmpregado);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2206/estatutario/alteracao_contratual.json");
        Empregado esperado = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/estatutario/esperado.json");

        Processador2206 processador = new Processador2206();
        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(1);

        assertThat(listaRetEmpregado.get(0).empregado).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetEmpregado.get(0).ocorrencias).contains(ocorrencia);
    }

    @Test
    public void deveProcessar2206SobreEmpregadoCeletistaExistente() {
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        Empregado inicial = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/celetista/inicial.json");
        RetEmpregado retEmpregado = new RetEmpregado();
        retEmpregado.empregado = inicial;
        listaRetEmpregado.add(retEmpregado);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2206/celetista/alteracao_contratual.json");
        Empregado esperado = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/celetista/esperado.json");

        Processador2206 processador = new Processador2206();
        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(1);

        assertThat(listaRetEmpregado.get(0).empregado).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetEmpregado.get(0).ocorrencias).contains(ocorrencia);
    }

    @Test
    public void deveProcessar2206SomenteMatriculaIgual() {
        Empregado inicial1 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/estatutario/inicial.json");
        RetEmpregado retEmpregado1 = new RetEmpregado();
        retEmpregado1.empregado = inicial1;

        Empregado inicial2 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/estatutario/inicial.json");
        inicial2.dadosContratuais.matricula = "88888";
        RetEmpregado retEmpregado2 = new RetEmpregado();
        retEmpregado2.empregado = inicial2;
        retEmpregado2.addOcorrencia(new Ocorrencia() );

        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        listaRetEmpregado.add(retEmpregado1);
        listaRetEmpregado.add(retEmpregado2);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2206/estatutario/alteracao_contratual.json");
        Empregado esperado1 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/estatutario/esperado.json");
        Empregado esperado2 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2206/estatutario/inicial.json");
        esperado2.dadosContratuais.matricula = "88888";

        Processador2206 processador = new Processador2206();
        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(2);

        assertThat(listaRetEmpregado.get(0).empregado).usingRecursiveComparison().isEqualTo(esperado1);
        assertThat(listaRetEmpregado.get(0).ocorrencias).contains(ocorrencia);

        assertThat(listaRetEmpregado.get(1).empregado).usingRecursiveComparison().isEqualTo(esperado2);
        assertThat(listaRetEmpregado.get(1).ocorrencias).doesNotContain(ocorrencia);
    }
}