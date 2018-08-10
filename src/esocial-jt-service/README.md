O **esocial-jt-service** é o módulo principal do sistema eSocial na Justiça do Trabalho, que recebe dados de ocorrências da vida funcional dos trabalhadores/servidores e os comunica ao sistema eSocial governametal central [eSocial-Gov](https://portal.esocial.gov.br/).

## Características

O **esocial-jt-service** foi construído em [Java 8](http://www.oracle.com/technetwork/pt/java/javaee/overview/index.html) utilizando o framework [Spring Boot](https://spring.io/projects/spring-boot). É uma aplicação primordialmente de _backend_ que fornece API RESTful trafegando dados no formato _JSON_.

Em poucas palavras, este módulo recebe um _JSON_ com os dados de uma **ocorrência\*** dos sistemas de origem, tranforma em um **evento** do eSocial, cria e assina o arquivo XML, transmite para o eSocial-Gov e posteriormente consulta o resultado de processamento com eventuais erros. Além disso, fornece API para consulta do estado interno da aplicação.

> Obs. 1: para não confundir os conceitos, os dados recebidos pelo esocial-jt-service são chamados de "ocorrencia" enquanto que os XMLs que são enviados para o eSocial-Gov são chamados de "eventos".

> Obs. 2: Cada instituição deve alterar seus sitemas de origem (RH, Folha, etc) ou criar um conector para extrair os dados e enviar no formato JSON para o esocial-jt-service.

## Instalação

### Pré-requisitos

- [Java EE 8](http://www.oracle.com/technetwork/pt/java/javaee/overview/index.html);
- [Maven 3.3.9](https://maven.apache.org/index.html) (ou superior);
- [Git 2.15.0](https://git-scm.com/) (ou superior);
- [Certificado Digital ICP-Brasil A1 válido](https://portal.esocial.gov.br/institucional/ambiente-de-producao-restrita/perguntas-frequentes-producao-restrita#02---certificado-digital) (obrigatório mesmo para testes).

### Banco de dados

Atualmente, o **esocial-jt-service** é testado principalmente com **PostgreSQL**. Os parâmetros de conexão devem ser passados no arquivo de configuração, como explicado mais adiante.

### Criação/Atualização do banco de dados

Os scripts de preparação de banco encontram-se em: [src/esocial-jt-service/src/main/resources/db/migration](src/esocial-jt-service/src/main/resources/db/migration).

> TODO: Descrver o uso básico do flyway

### Download da aplicação

```bash
git clone https://github.com/tst-labs/esocial.git
```

### Configuração

Os seguintes parâmetros de configuração (camiho do arquivo do certificado digital e conexão com o banco de dados) devem ser passado editando o arquivo `config/application.properties`.

```properties
esocialjt.cnpj-empregador=

esocialjt.arquivoCertificado=
esocialjt.senhaCertificado=

spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=
spring.jpa.database-platform=

esocialjt.proxyServer=
esocialjt.proxyPort=
esocialjt.proxyUser=
esocialjt.proxyPassword=
```

> Obs.: Como qualquer aplicação Spring Boot, existem outras maneiras de [sobreescrever os parâmetros de configuração](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html).

### Build e execução

Para fazer build do projeto, execute:

```bash
cd src
mvn clean package
```

E para iniciar:

```bash
java -jar src/esocial-jt-service/target/esocial-jt-service-0.0.1-SNAPSHOT.jar
```

Verifique se a aplicação está no ar acessando a url

```
http://localhost:8080/esocial-jt-service/actuator/health
```

### Testando o primeiro envio

O **esocial-jt-service** foi projetado para receber dados de ocorrência via JSON a partir dos sistemas de origem ou de um conector. Porém, para um primeiro teste, no ambiente de [Produção Restrita](http://portal.esocial.gov.br/institucional/ambiente-de-producao-restrita), é possível enviar manualmente dados para o **esocial-jt-service**. Para isso, faça uma cópia do arquivo [/src/main/resources/exemplos/informacoes_empregador.json](./src/main/resources/exemplos/informacoes_empregador.json), edite com as informações referentes à instituição (o CNPJ deve ser o mesmo do proprietário do Certificado Digital) e envia usando o método **POST** (via linha de comando ou [Postman](https://www.getpostman.com/)) para o _endpoint_:

```
http://localhost:8080/esocial-jt-service/ocorrencias
```

O log da aplicação irá exibir o status da transmissão para o eSocial-Gov, e também será possível consultar pelo método **GET** em alguns instantes:

```
http://localhost:8080/esocial-jt-service/ocorrencias
```

### Limpando o ambiente de Produção Restrita

É possível apagar os dados enviados para o ambiente de produção restrita por comando via **POST**

```
/esocial-jt-service/producao-restrita/acoes/limpar
```

## API Rest

### Ocorrências

Relacionado ao recebimento ou consulta de **ocorrências**

- [Receber ocorrência](./docs/api/ocorrencias/post.md): `POST` `/esocial-jt-service/ocorrencias`
- [Consultar todas ocorrências](./docs/api/ocorrencias/get.md): `GET` `/esocial-jt-service/ocorrencias`
- [Consultar ocorrência por ID](./docs/api/ocorrencias/id-get.md): `GET` `/esocial-jt-service/ocorrencias/{id}`
- [Consultar dados básicos das ocorrências](./docs/api/ocorrencias/dados-basicos-get.md): `GET` `/esocial-jt-service/ocorrencias/dados-basicos`
- [Consultar exemplos de JSON de ocorrências](./docs/api/ocorrencias/exemplos-get.md): `GET` `/esocial-jt-service/ocorrencias/exemplos`
- [Consultar exemplo de JSON de um tipo](./docs/api/ocorrencias/exemplos-tipo-get.md): `GET` `/esocial-jt-service/ocorrencias/exemplos/{tipo}`

### Eventos

Serve para forçar um reenvio de um **evento** para o eSocial-Gov

- [Enviar evento](./docs/api/eventos/acoes-enviar-post.md): `POST` `/esocial-jt-service/eventos/acoes/enviar`

### Lote

Controle manual da consulta do processamento no eSocial-Gov. Não precisa ser executado se a atualização automática está ativada.

- [Consulta protocolo](./docs/api/lote/consulta-protocolo-get.md); `GET` `/esocial-jt-service/lote/consulta/{protocolo}`
- [Atualiza todos lotes pendentes](./docs/api/lote/acoes-atualizar-processamento-post.md); `POST` `/esocial-jt-service/lote/acoes/atualizar-processamento`
- [Atualiza lote por protcolo](./docs/api/lote/acoes-atualizar-processamento-protocolo-post.md); `POST` `/esocial-jt-service/lote/acoes/atualizar-processamento/{protocolo}`

### Produção restrita

Comandos exclusivos para o ambiente de produção restrita

- [Limpar produção restrita](./docs/api/producao-restrita/acoes-limpar-post.md): `POST` `/esocial-jt-service/producao-restrita/acoes/limpar`

### Automação

Controla, em tempo de execução, se a aplicação deve ou não executar tarefas automaticamente (envio para o eSocial-Gov, consulta do processamento, etc) . Também pode ser configurado no arquivo `application.properties`.

- [Consultar status](./docs/api/automacao/get.md): `GET` `/esocial-jt-service/automacao`
- [Configurar automação](./docs/api/automacao/post.md): `POST` `/esocial-jt-service/automacao`

### Status

Verifica o status da aplicação

- [Status da aplicação](./docs/api/actuator/health-get.md): `GET` `/esocial-jt-service/actuator/health`
- [Informações sobre a aplicação](./docs/api/actuator/esocial-health-get.md): `GET` `/esocial-jt-service/actuator/info`
- [Status da comunicação com eSocial-Gov](./docs/api/actuator/info-get.md): `GET` `/esocial-jt-service/actuator/esocial-health`
