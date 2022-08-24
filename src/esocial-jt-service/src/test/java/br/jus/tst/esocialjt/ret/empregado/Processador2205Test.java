package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ret.empregado.Empregado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class Processador2205Test {

    @Test
    public void deveProcessar2205SobreEmpregadoExistente() {
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        Empregado inicial = OcorrenciaUtil.lerEmpregado("ret/empregado/s2205/inicial.json");
        RetEmpregado retEmpregado = new RetEmpregado();
        retEmpregado.empregado = inicial;
        listaRetEmpregado.add(retEmpregado);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2205/alteracao_cadastral.json");
        Empregado esperado = OcorrenciaUtil.lerEmpregado("ret/empregado/s2205/esperado.json");

        Processador2205 processador = new Processador2205();
        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(1);

        assertThat(listaRetEmpregado.get(0).empregado).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetEmpregado.get(0).ocorrencias).contains(ocorrencia);
    }

    @Test
    public void deveProcessar2205SobreMaisDeUmEmpregadoExistente() {
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        Empregado inicial1 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2205/inicial.json");
        Empregado inicial2 = OcorrenciaUtil.lerEmpregado("ret/empregado/s2205/inicial.json");

        RetEmpregado retEmpregado1 = new RetEmpregado();
        retEmpregado1.empregado = inicial1;
        listaRetEmpregado.add(retEmpregado1);

        RetEmpregado retEmpregado2 = new RetEmpregado();
        retEmpregado2.empregado = inicial2;
        listaRetEmpregado.add(retEmpregado2);

        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2205/alteracao_cadastral.json");
        Empregado esperado = OcorrenciaUtil.lerEmpregado("ret/empregado/s2205/esperado.json");

        Processador2205 processador = new Processador2205();
        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(2);

        listaRetEmpregado.forEach(re -> {
            assertThat(re.empregado).usingRecursiveComparison().isEqualTo(esperado);
            assertThat(re.ocorrencias).contains(ocorrencia);
        });

    }

}