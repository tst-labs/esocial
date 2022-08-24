package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ret.empregado.Empregado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class Processador2299Test {

    @Test
    public void deveProcessar2299SobreEmpregadoExistente(){
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        Empregado inicial = OcorrenciaUtil.lerEmpregado("ret/empregado/s2299/inicial.json");
        RetEmpregado retEmpregado = new RetEmpregado();
        retEmpregado.empregado = inicial;
        listaRetEmpregado.add(retEmpregado);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2299/desligamento.json");
        Empregado esperado = OcorrenciaUtil.lerEmpregado("ret/empregado/s2299/esperado.json");

        Processador2299 processador = new Processador2299();
        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(1);

        assertThat(listaRetEmpregado.get(0).empregado).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetEmpregado.get(0).ocorrencias).contains(ocorrencia);
    }

    @Test
    public void deveProcessar2299SomenteMatriculaIgual() {
        Empregado inicial1 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2299/inicial.json");
        RetEmpregado retEmpregado1 = new RetEmpregado();
        retEmpregado1.empregado = inicial1;

        Empregado inicial2 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2299/inicial.json");
        inicial2.dadosContratuais.matricula = "88888";
        RetEmpregado retEmpregado2 = new RetEmpregado();
        retEmpregado2.empregado = inicial2;
        retEmpregado2.addOcorrencia(new Ocorrencia() );

        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        listaRetEmpregado.add(retEmpregado1);
        listaRetEmpregado.add(retEmpregado2);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2299/desligamento.json");
        Empregado esperado1 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2299/esperado.json");
        Empregado esperado2 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2299/inicial.json");
        esperado2.dadosContratuais.matricula = "88888";

        Processador2299 processador = new Processador2299();
        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(2);

        assertThat(listaRetEmpregado.get(0).empregado).usingRecursiveComparison().isEqualTo(esperado1);
        assertThat(listaRetEmpregado.get(0).ocorrencias).contains(ocorrencia);

        assertThat(listaRetEmpregado.get(1).empregado).usingRecursiveComparison().isEqualTo(esperado2);
        assertThat(listaRetEmpregado.get(1).ocorrencias).doesNotContain(ocorrencia);
    }
}