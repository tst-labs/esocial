package br.jus.tst.esocialjt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApi3Config {
	private BuildProperties buildProperties;

    @Autowired
    public OpenApi3Config(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }
    
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("esocial-jt-service")
                        .contact(
                        		new Contact()
                        			.url("https://github.com/tst-labs/esocial")
                        			.name("tst-labs/esocial")
                        )
                        .description("Serviço responsável pelo o ciclo de envio e consulta de processamento dos eventos enviados ao eSocial-Gov")
                        .version(this.buildProperties.getVersion()));
    }

}
