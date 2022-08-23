package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.ret.empregado.Empregado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class Processador2200Test {

    @Test
    void deveProcessar2200Novo() {
        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2200/admissao.json");
        Empregado esperado = OcorrenciaUtil.lerEmpregado("ret/empregado/s2200/esperado.json");
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();

        Processador2200 processador = new Processador2200();

        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(1);

        assertThat(listaRetEmpregado.get(0).empregado).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(listaRetEmpregado.get(0).ocorrencias).contains(ocorrencia);
    }

    @Test
    void deveProcessar2200NovoMesmoComUmJaExistente() {
        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/empregado/s2200/admissao.json");
        Processador2200 processador = new Processador2200();
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();
        listaRetEmpregado.add(new RetEmpregado());

        processador.processaRegistro(listaRetEmpregado, ocorrencia);

        assertThat(listaRetEmpregado).hasSize(2);
    }
}
