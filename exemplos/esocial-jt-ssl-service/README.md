Este projeto é um exemplo de serviço que oferece api REST para assinatura de xml de eventos e envio de lotes para o eSocial-Gov usando um certificado digital A1.

Pode ser instalado em um ambiente separado e os serviços **esocial-jt-service** podem ser configurados para utilizar esta api.

## Configuração

```properties
server.port=8899

esocialjt.ambiente=PRODUCAO_RESTRITA
esocialjt.arquivoCertificado=
esocialjt.senhaCertificado=
esocialjt.arquivoCacerts=
esocialjt.senhaCacerts=changeit
```

### Build e execução

Para fazer build do projeto, execute:

```bash
cd src
mvn clean package
```

E para iniciar:

```bash
java -jar target/esocial-jt-ssl-service*.jar
```
