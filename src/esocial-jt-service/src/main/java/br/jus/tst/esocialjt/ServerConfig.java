package br.jus.tst.esocialjt;


import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {

    @Bean
    public WebServerFactoryCustomizer<ConfigurableTomcatWebServerFactory>
    webServerFactoryCustomizer() {
        return factory ->
                factory.addConnectorCustomizers(
                        connector -> {
                            if (connector.getProtocolHandler() instanceof AbstractHttp11Protocol) {
                                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler())
                                        .setMaxHttpHeaderSize(400 * 1024); // 400KB
                            }
                        });
    }
}
