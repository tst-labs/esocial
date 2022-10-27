package br.jus.tst.esocialjt.ret.beneficiario;

import br.jus.tst.esocial.ret.beneficiario.Beneficiario;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.ret.empregado.Processador2200;
import br.jus.tst.esocialjt.ret.empregado.RetEmpregado;
import br.jus.tst.esocialjt.util.OcorrenciaUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class Processador2400Test {

    @Test
    void deveProcessar2400() {
        Ocorrencia ocorrencia = OcorrenciaUtil.lerOcorrencia("ret/beneficiario/s2400/cadastro.json");
        Beneficiario esperado = OcorrenciaUtil.lerBeneficiario("ret/beneficiario/s2400/esperado.json");
        ArrayList<RetBeneficiario> beneficiarios = new ArrayList<>();

        Processador2400 processador = new Processador2400();

        processador.processaRegistro(beneficiarios, ocorrencia);

        assertThat(beneficiarios).hasSize(1);

        assertThat(beneficiarios.get(0).getBeneficiario()).usingRecursiveComparison().isEqualTo(esperado);
        assertThat(beneficiarios.get(0).getOcorrencias()).contains(ocorrencia);
    }


}
