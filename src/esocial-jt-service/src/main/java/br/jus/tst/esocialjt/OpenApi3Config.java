package br.jus.tst.esocialjt;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.Scopes;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class OpenApi3Config {
    private BuildProperties buildProperties;
    private String authServer;
    private String realm;
    private boolean keycloakEnabled;

    @Autowired
    public OpenApi3Config(BuildProperties buildProperties,
                          @Value("${keycloak.auth-server-url:}") String authServer,
                          @Value("${keycloak.realm:}") String realm,
                          @Value("${keycloak.enabled:false}") boolean keycloakEnabled) {
        this.buildProperties = buildProperties;
        this.authServer = authServer;
        this.realm = realm;
        this.keycloakEnabled = keycloakEnabled;
    }
    
    @Bean
    public OpenAPI openAPI() {
        OpenAPI openApi = new OpenAPI()
                .info(new Info()
                        .title("esocial-jt-service")
                        .contact(
                                new Contact()
                                        .url("https://github.com/tst-labs/esocial")
                                        .name("tst-labs/esocial")
                        )
                        .description("Serviço responsável pelo o ciclo de envio e consulta de processamento dos eventos enviados ao eSocial-Gov")
                        .version(this.buildProperties.getVersion()));

        if (keycloakEnabled) {
            String authUrl = String.format("%s/realms/%s/protocol/openid-connect", this.authServer, this.realm);
            openApi.components(new Components()
                            .addSecuritySchemes("spring_oauth", new SecurityScheme()
                                    .type(SecurityScheme.Type.OAUTH2)
                                    .description("Oauth2 flow")
                                    .flows(new OAuthFlows()
                                            .password(new OAuthFlow()
                                                    .authorizationUrl(authUrl + "/auth")
                                                    .refreshUrl(authUrl + "/token")
                                                    .tokenUrl(authUrl + "/token")
                                                    .scopes(new Scopes())
                                            ))))
                    .security(Arrays.asList(new SecurityRequirement().addList("spring_oauth")));
        }

        return openApi;
    }

}
