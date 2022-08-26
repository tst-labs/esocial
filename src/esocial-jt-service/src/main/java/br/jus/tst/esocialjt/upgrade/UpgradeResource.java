package br.jus.tst.esocialjt.upgrade;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/upgrade")
public class UpgradeResource {

    @Autowired
    UpgradeServico upgradeServico;

    @PostMapping("/cpf-matricula")
    @Operation(summary = "Atualização de valores de CPF e Matricula na entidade Ocorrencia")
    public void realizaUpgradeCpfMatricula(){
        upgradeServico.realizaUpgradeCpfMatricula();
    }
}
