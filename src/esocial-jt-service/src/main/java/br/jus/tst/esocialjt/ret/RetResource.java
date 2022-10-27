package br.jus.tst.esocialjt.ret;

import br.jus.tst.esocialjt.ret.empregado.EmpregadoServico;
import br.jus.tst.esocialjt.ret.empregado.RetEmpregado;
import br.jus.tst.esocialjt.ret.semvinculo.RetTrabalhadorSemVinculo;
import br.jus.tst.esocialjt.ret.semvinculo.TrabalhadorSemVinculoServico;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RetResource {
    
    @Autowired
    EmpregadoServico empregadoServico;
    
    @Autowired
    TrabalhadorSemVinculoServico trabalhadorSemVinculoServico;
    

    @GetMapping("ret/empregado/{cpf}")
    @Operation(summary = "Obtém os dados enviados para um empregado a partir do seu CPF. Pode corresponder a vários vínculos")
    public List<RetEmpregado> obterRetEmpregado(@PathVariable String cpf){
        return empregadoServico.obterRetEmpregado(cpf);
    }
    
    @GetMapping("ret/trabalhadorsemvinculo/{cpf}")
    @Operation(summary = "Obtém os dados enviados para um trabalhador sem vínculo a partir do seu CPF.")
    public List<RetTrabalhadorSemVinculo> obterRetTrabalhadorSemVinculoEmpregado(@PathVariable String cpf){
        return trabalhadorSemVinculoServico.obterRetTrabalhadorSemVinculo(cpf);
    }
}
