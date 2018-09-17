# eSocial

[![Build Status](https://travis-ci.org/tst-labs/esocial.svg?branch=master)](https://travis-ci.org/tst-labs/esocial)

**[PROJETO EM DESENVOLVIMENTO] Atenção!** API ainda em desenvolvimento e portanto instável.

## Guia rápido

### Pré-requisitos

- Git (https://git-scm.com/)
- Docker (https://www.docker.com/)
- Docker Compose (https://docs.docker.com/compose/)

### Download e construção

1. Clone o projeto

```shellscript
$ git clone https://github.com/tst-labs/esocial.git
$ cd esocial
```

2. Crie um arquivo `src/docker/maven/settings.xml` caso tenha alguma configuração específica do maven (essa configuração será copiada para o docker conseguir fazer a build)

3. Construa as imagens docker

```shellscript
$ docker-compose build
```

### Configuração

1. Copie sua chave para a pasta `./config`

```shellscript
$ cp local/da/chave/esocial.pfx ./config/esocial.pfx
```

2. Edite o arquivo de configuração `application.properties` para ficar de acordo com seu ambiente

```shellscript
$ cp ./config/application.properties.example ./config/application.properties
```

### Execução

```shellscript
docker-compose up
```
> Obs: O docker-compose sobe um banco postgres e a aplicação Java

Verifique se a aplicação está no ar acessando a url

```
http://localhost:8080/esocial-jt-service/actuator/health
```

## Características

O projeto é dividido nos seguintes módulos:

- esocial-comunicacao: Pacote de mapeamento dos serviços do WSDL.
- esocial-esquemas: Schemas WSDL do eSocial-GOV. [[mais informações...](src/esocial-esquemas/README.md)]
- esocial-jt-dominio: Modelos básicos do esocial-jt.
- esocial-jt-service: API RESTful para comunicação com eSocial-GOV. [[mais informações...](src/esocial-jt-service/README.md)]

O **esocial-jt-service** é o módulo principal do sistema eSocial na Justiça do Trabalho, que recebe dados de ocorrências da vida funcional dos trabalhadores/servidores e os comunica ao sistema eSocial governamental central [eSocial-Gov](https://portal.esocial.gov.br/).

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

Atualmente, o **esocial-jt-service** é testado com **PostgreSQL** mas em teoria é compatível com outros bancos. Os parâmetros de conexão devem ser passados no arquivo de configuração, como explicado mais adiante.

#### Criação/Atualização do banco de dados

Os scripts de criação do banco ficam localizados em [src/esocial-jt-service/src/main/resources/db/migration/](src/esocial-jt-service/src/main/resources/db/migration/). Os scripts podem ser executados de forma manual, porém utilizamos o [flyway](https://flywaydb.org/) para automatizar esse processo.

Execute o seguinte comando preenchendo os valores com a URL de conexão do banco, usuário e senha para criar / atualizar as tabelas no seu banco de dados.

```shellscript
$ cd src/esocial-jt-service
$ mvn flyway:migrate -Dflyway.url=... -Dflyway.user=... -Dflyway.password=...
# i.e: mvn flyway:migrate -Dflyway.url=jdbc:postgresql://localhost:5432/postgres -Dflyway.user=postgres -Dflyway.password=esocial
```

### Download da aplicação

```bash
git clone https://github.com/tst-labs/esocial.git
```

### Configuração

Os seguintes parâmetros de configuração (caminho do arquivo do certificado digital e conexão com o banco de dados) devem ser passados editando o arquivo `config/application.properties`.

```properties
esocialjt.cnpj-empregador=
esocialjt.arquivoCertificado=
esocialjt.senhaCertificado=

spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=
spring.jpa.database-platform=
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
java -jar src/esocial-jt-service/target/esocial-jt-service*.jar
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

## Visão Geral

O Tribunal Superior do Trabalho está em uma fase avançada de desenvolvimento de uma solução para transmitir os dados
da vida funcional dos seus servidores para o sistema eSocial do Governo Federal, atendendo às necessidades legais do
<a href="http://www.planalto.gov.br/ccivil_03/_ato2011-2014/2014/decreto/d8373.htm">Decreto N° 8.373, de 11 de Dezembro de 2014</a>.

Essa iniciativa converge na publicação desse trabalho como projeto Open Source (OSS), uma vez que entendemos que essa solução
pode ser reusada, trazendo economia de esforços em quaisquer entidades públicas ou privadas.

## Escopo

### O que esse software **faz**?

Esse pedaço da solução compreende:

- Recepção de ocorrências provenientes dos sistemas de origem, via API RESTful;
- Conversão dessas ocorrências em eventos do eSocial, no formato XML;
- Consulta do resultado do processamento dos eventos enviados; e
- Gerência dos detalhes de conexão com o eSocial-GOV (assinatura dos eventos, conexão com certificado, etc.).

### O que esse software **não faz**?

Não tratamos nesse projeto de:

- Extração e/ou transformação de dados dos sistemas finalísticos das organizações usuárias;
- Manipulação de qualquer forma que seja dos dados recebidos; e
- Validação semântica dos dados recebidos.

## Estado atual

Atualmente, o sistema já é capaz de receber dados de eventos de tabela, transmitir de forma automática
para o eSocial-GOV e exibir o resultado do processamento (sucesso ou mensagens de erro).

A priorização dos eventos a serem transmitidos foi feita com base na necessidade atual do TST e
demais órgãos da Justiça do Trabalho. No entanto, o projeto pode ser estendido para quaisquer tipos
de eventos especificados pelo eSocial-GOV.

## Status por evento

### 0.1.0

#### Eventos de Tabelas

| Evento | Nome Evento                         | Versão | Situação |
| ------ | ----------------------------------- | ----- | ------|
| S-1000 | Empregador/Contribuinte             | 2.4.02 | Feito |
| S-1005 | Estabelecimentos                    | 2.4.02 | Feito |
| S-1010 | Rubricas                            | 2.4.02 | Feito |
| S-1020 | Lotações Tributárias                | 2.4.02 | Feito |
| S-1030 | Cargos/Empregos Públicos            | 2.4.02 | Feito |
| S-1035 | Carreiras Públicas                  | 2.4.02 | Feito |
| S-1040 | Funções/Cargos em Comissão          | 2.4.02 | Feito |
| S-1050 | Horários/Turnos de Trabalho         | 2.4.02 | Feito |
| S-1060 | Ambientes de Trabalho               | 2.4.02 | Feito |
| S-1070 | Processos Administrativos/Judiciais | 2.4.02 | Feito |
| S-1080 | Operadores Portuários               |     NA |    NA |

#### Eventos periódicos

    . A fazer

#### Eventos não periódicos
| Evento | Nome Evento                         | Versão | Situação |
| -------| ----------------------------------- | ------ | -------- |
| S-2200 | Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador | 2.4.02 | Feito |
| S-2205 | Alteração de Dados Cadastrais do Trabalhador | 2.4.02 | Feito |
| S-2206 | Alteração de Contrato de Trabalho | 2.4.02 | Feito |
| S-2230 | Afastamento Temporário | 2.4.02 | Feito |
| S-2298 | Reintegração | 2.4.02 | Feito |
| S-2299 | Desligamento | 2.4.02 | Feito |
| S-2300 | Trabalhador Sem Vínculo de Emprego/Estatutário - Início | 2.4.02 | Feito |
| S-2306 | Trabalhador Sem Vínculo de Emprego/Estatutário - Alteração Contratual | 2.4.02 | **Fazendo** |
| S-2399 | Trabalhador Sem Vínculo de Emprego/Estatutário - Término | 2.4.02 | **Fazendo** |
| S-1200 | Remuneração de trabalhador vinculado ao Regime Geral de Previdência Social | 2.4.02 | na fila |
| S-1202 | Remuneração de servidor vinculado a Regime Próprio de Previdência Social – RPPS | 2.4.02 | na fila |
| S-1210 | Pagamentos de Rendimentos do Trabalho | 2.4.02 | na fila |

### Como contribuir?

Leia nosso [guia de contribuição em andamento](CONTRIBUTING.md).
