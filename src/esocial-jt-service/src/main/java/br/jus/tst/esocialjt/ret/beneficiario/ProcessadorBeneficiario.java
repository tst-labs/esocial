package br.jus.tst.esocialjt.ret.beneficiario;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

import java.util.ArrayList;

public interface ProcessadorBeneficiario {
    void processaRegistro(ArrayList<RetBeneficiario> beneficiarios, Ocorrencia ocorrencia);
}
