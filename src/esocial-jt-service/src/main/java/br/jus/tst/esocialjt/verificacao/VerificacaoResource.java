package br.jus.tst.esocialjt.verificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verificacao")
public class VerificacaoResource {

    @Autowired
    VerificacaoServico verificacaoServico;

    @PostMapping
    public void verificar() {
        verificacaoServico.iniciarEnvioEventosExemplo();
    }
}
