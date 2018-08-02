package br.jus.tst.esocialjt.infraestrutura;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// FIXME: Remover essa classe após configurar o banco corretamente
@Component
class DockerDebug {
    @Value("${spring.datasource.url}")
    private String dbUri;

    @PostConstruct
    public void init() {
        Logger.getAnonymousLogger().log(Level.INFO, "DB: " + dbUri);
    }
}