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

### Configuração de serviços que usam certificado digital (assinatura de xml e envio para eSocial-Gov)

Para comunicação com o eSocial-Gov, é necessário um certificado digital válido, mesmo para o ambiente de Produção Restrita. Para flexibilizar o uso do certificado, o **esocial-jt-service** permite três configurações para essa funcionalidade:

1. Instalação do **esocial-jt-service** e certificado no mesmo servidor
2. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra instância do **esocial-jt-service** que possui um certificado
3. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra aplicação que forneça api REST para assinatura e envio de lotes

#### 1. Instalação do **esocial-jt-service** e certificado no mesmo servidor

Nesta configuração, o arquivo do certificado A1 deverá ficar disponível no sistema de arquivos da máquina que executa o **esocial-jt-service**. O caminho para o arquivo e a senha de acesso são passados no arquivo de configuração.

**Exemplo de uso**:

- Instalação em ambiente de homologação ou produção
- Instalação na máquina do desenvolvedor, desde que este tenha acesso ao arquivo do certificado digital e à senha.

**Configuração**:

```properties
esocialjt.arquivoCertificado=/path/to/certificado.pfx
esocialjt.senhaCertificado=senh@
```

Obs.: as propriedades `esocialjt.urlServicoEnvioLote`, `esocialjt.urlServicoConsultaProcessamento` e `esocialjt.urlServicoAssinatura` não devem ser preenchidas neste caso.

#### 2. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra instância do **esocial-jt-service** que possui um certificado

Nesta configuração, uma instalação do **esocial-jt-service** manterá o arquivo e senha do certificado digital utilizando a configuração anterior. Outras instalações do **esocial-jt-service** poderão usar a api REST da primeira para fazer uso de serviços que necessitam de certificado digital.

**Exemplo de uso**:

- Uma instalação do **esocial-jt-service**, com certificado digital e senha, ficará disponível em ambiente controlado pela equipe de infraestrutura enquanto desenvolvedores configuram instalações locais para utilizar esse ambiente. O desenvolvedor não precisará ter acesso ao arquivo do certificado digital e à senha.

**Configuração**:

Supondo que a instalação do **esocial-jt-service** com certificado digital esteja disponível em `10.0.0.100` na porta `8080`, as demais instalações devem fazer a seguinte configuração:

```properties
esocialjt.urlServicoConsultaProcessamento=http://10.0.0.100:8080/esocial-jt-service/lote/consulta/
esocialjt.urlServicoEnvioLote=http://10.0.0.100:8080/esocial-jt-service/lote/acoes/enviar/
esocialjt.urlServicoAssinatura=http://10.0.0.100:8080/esocial-jt-service/xml/acoes/assinar/
```

#### 3. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra aplicação que forneça api REST para assinatura e envio de lotes

Dado que o **esocial-jt-service** usa os serviços da configuração anterior por meio de uma api REST, é possível criar um serviço independente para as mesmas funcionalidades, desde que atenda aos critérios estabelecido pelo eSocial-Gov. **Tal serviço independente não é parte desta solução, cabendo a cada instiuição elaborar da forma que achar mais conveniente**.

**Exemplo de uso**:

- A instituição cria uma aplicação (em Java, Javascript, PHP, etc) que disponibiliza uma api REST que assina um arquivo XML de evento usando seu certificado digital. Esta aplicação também recebe um XML de um lote e envia ao eSocial-Gov usando o protocolo HTTPS. Da mesma forma, a aplicação permite a consulta do resultado do processamento a partir de um número de protocolo. Assim, todas instalações do **esocial-jt-service** usarão esse serviço.

**Configuração**:
Supondo que a aplicação esteja disponível em `10.0.0.100` na porta `8080`, as instalações do **esocial-jt-service** devem fazer a seguinte configuração:

```properties
esocialjt.urlServicoConsultaProcessamento=http://10.0.0.100:8080/consulta/
esocialjt.urlServicoEnvioLote=http://10.0.0.100:8080/enviar/
esocialjt.urlServicoAssinatura=http://10.0.0.100:8080/assinar/
```

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

O **esocial-jt-service** foi projetado para receber dados de ocorrência via JSON a partir dos sistemas de origem ou de um conector. Porém, para um primeiro teste, no ambiente de [Produção Restrita](http://portal.esocial.gov.br/institucional/ambiente-de-producao-restrita), é possível enviar manualmente dados para o **esocial-jt-service**. Para isso, faça uma cópia do arquivo [src/esocial-jt-service/src/main/resources/exemplos/informacoes_empregador.json](.src/esocial-jt-service/src/main/resources/exemplos/informacoes_empregador.json), edite com as informações referentes à instituição (o CNPJ deve ser o mesmo do proprietário do Certificado Digital) e envia usando o método **POST** (via linha de comando ou [Postman](https://www.getpostman.com/)) para o _endpoint_:

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

- [Consulta protocolo](./docs/api/lote/consulta-protocolo-get.md): `GET` `/esocial-jt-service/lote/consulta/{protocolo}`
- [Atualiza todos lotes pendentes](./docs/api/lote/acoes-atualizar-processamento-post.md): `POST` `/esocial-jt-service/lote/acoes/atualizar-processamento`
- [Atualiza lote por protcolo](./docs/api/lote/acoes-atualizar-processamento-protocolo-post.md): `POST` `/esocial-jt-service/lote/acoes/atualizar-processamento/{protocolo}`
- [Enviar lote para o eSocial-Gov](./docs/api/lote/acoes-enviar-lote-post.md): `POST` `/esocial-jt-service/lote/acoes/enviar/`

### XML

Disponibiliza o serviço de assinatura de xml para uso por outra aplicação.

- [Assinar xml](./docs/api/xml/acoes-assinar-post.md): `POST` `/esocial-jt-service/xml/acoes/assinar/`

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

Atualmente, o sistema já é capaz de receber dados de grande parte dos eventos, transmitir de forma automática
para o eSocial-GOV e exibir o resultado do processamento (sucesso ou mensagens de erro).

A priorização dos eventos a serem transmitidos foi feita com base na necessidade atual do TST e
demais órgãos da Justiça do Trabalho. No entanto, o projeto pode ser estendido para quaisquer tipos
de eventos especificados pelo eSocial-GOV.

## Status por evento

### 0.2.0

#### Versões do eSocial-GOV

Pacote de esquemas : 2.5

Pacote de comunicação : 1.5

#### Eventos de Tabelas

| Evento | Nome Evento                         | Versão | Situação | Resultado do envio para a produção restrita |
| ------ | ----------------------------------- | ------ | -------- | ------------------------------------------- |
| S-1000 | Empregador/Contribuinte             | 2.5    | Feito    | Processado com sucesso                      |
| S-1005 | Estabelecimentos                    | 2.5    | Feito    | Processado com sucesso                      |
| S-1010 | Rubricas                            | 2.5    | Feito    | Processado com sucesso                      |
| S-1020 | Lotações Tributárias                | 2.5    | Feito    | Processado com sucesso                      |
| S-1030 | Cargos/Empregos Públicos            | 2.5    | Feito    | Processado com sucesso                      |
| S-1035 | Carreiras Públicas                  | 2.5    | Feito    | Processado com sucesso                      |
| S-1040 | Funções/Cargos em Comissão          | 2.5    | Feito    | Processado com sucesso                      |
| S-1050 | Horários/Turnos de Trabalho         | 2.5    | Feito    | Processado com sucesso                      |
| S-1060 | Ambientes de Trabalho               | 2.5    | Feito    | Processado com sucesso                      |
| S-1070 | Processos Administrativos/Judiciais | 2.5    | Feito    | Processado com sucesso                      |
| S-1080 | Operadores Portuários               | 2.5    | NA       | NA                                          |

#### Eventos periódicos

| Evento | Nome Evento                                                                     | Versão | Situação | Resultado do envio para a produção restrita |
| ------ | ------------------------------------------------------------------------------- | ------ | -------- | ------------------------------------------- |
| S-1200 | Remuneração de trabalhador vinculado ao Regime Geral de Previdência Social      | 2.5    | Feito    | Processado com sucesso                      |
| S-1202 | Remuneração de servidor vinculado a Regime Próprio de Previdência Social – RPPS | 2.5    | Feito    | Evento não reconhecido pelo eSocial-GOV     |
| S-1207 | Benefícios previdenciários - RPPS                                               | 2.5    | Feito    | Evento não reconhecido pelo eSocial-GOV     |
| S-1210 | Pagamentos de Rendimentos do Trabalho                                           | 2.5    | Feito    | Processado com sucesso                      |
| S-1250 | Aquisição de Produção Rural                                                     | 2.5    | NA       | NA                                          |
| S-1260 | Comercialização da Produção Rural Pessoa Física                                 | 2.5    | NA       | NA                                          |
| S-1270 | Contratação de Trabalhadores Avulsos Não Portuários                             | 2.5    | NA       | NA                                          |
| S-1280 | Informações Complementares aos Eventos Periódicos                               | 2.5    | NA       | NA                                          |
| S-1295 | Solicitação de Totalização para Pagamento em Contingência                       | 2.5    | Feito    | Processado com sucesso                      |
| S-1298 | Reabertura dos Eventos Periódicos                                               | 2.5    | Feito    | Processado com sucesso                      |
| S-1299 | Fechamento dos Eventos Periódicos                                               | 2.5    | Feito    | Processado com sucesso                      |
| S-1300 | Contribuição Sindical Patronal                                                  | 2.5    | NA       | NA                                          |

#### Eventos não periódicos

| Evento | Nome Evento                                                           | Versão | Situação     | Resultado do envio para a produção restrita |
| ------ | --------------------------------------------------------------------- | ------ | ------------ | ------------------------------------------- |
| S-2190 | Admissão de Trabalhador - Registro Preliminar                         | 2.5    | NA           | NA                                          |
| S-2200 | Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador   | 2.5    | Feito        | Processado com sucesso                      |
| S-2205 | Alteração de Dados Cadastrais do Trabalhador                          | 2.5    | Feito        | Processado com sucesso                      |
| S-2206 | Alteração de Contrato de Trabalho                                     | 2.5    | Feito        | Processado com sucesso                      |
| S-2210 | Comunicação de Acidente de Trabalho                                   | 2.5    | Impl. futura |                                             |
| S-2220 | Monitoramento da Saúde do Trabalhador                                 | 2.5    | Impl. futura |                                             |
| S-2230 | Afastamento Temporário                                                | 2.5    | Feito        | Processado com sucesso                      |
| S-2240 | Condições Ambientais do Trabalho - Fatores de Risco                   | 2.5    | Impl. futura |                                             |
| S-2241 | Insalubridade, Periculosidade e Aposentadoria Especial                | 2.5    | Impl. futura |                                             |
| S-2250 | Aviso Prévio                                                          | 2.5    | NA           | NA                                          |
| S-2260 | Convocação para Trabalho Intermitente                                 | 2.5    | NA           | NA                                          |
| S-2298 | Reintegração                                                          | 2.5    | Feito        | Processado com sucesso                      |
| S-2299 | Desligamento                                                          | 2.5    | Feito        | Processado com sucesso                      |
| S-2300 | Trabalhador Sem Vínculo de Emprego/Estatutário - Início               | 2.5    | Feito        | Processado com sucesso                      |
| S-2306 | Trabalhador Sem Vínculo de Emprego/Estatutário - Alteração Contratual | 2.5    | Feito        | Processado com sucesso                      |
| S-2399 | Trabalhador Sem Vínculo de Emprego/Estatutário - Término              | 2.5    | Feito        | Processado com sucesso                      |
| S-2400 | Cadastro de Benefícios Previdenciários - RPPS                         | 2.5    | Feito        | Evento não reconhecido pelo eSocial-GOV     |
| S-3000 | Exclusão de eventos                                                   | 2.5    | Feito        | Processado com sucesso                      |
| S-5001 | Informações das contribuições sociais por trabalhador                 | 2.5    | Feito        | Evento totalizador gravado no formato XML   |
| S-5002 | Imposto de Renda Retido na Fonte                                      | 2.5    | Feito        | Evento totalizador gravado no formato XML   |
| S-5011 | Informações das contribuições sociais consolidadas por contribuinte   | 2.5    | Feito        | Evento totalizador gravado no formato XML   |
| S-5012 | Informações do IRRF consolidadas por contribuinte                     | 2.5    | Feito        | Evento totalizador gravado no formato XML   |

#### Como contribuir?

Leia nosso [guia de contribuição em andamento](CONTRIBUTING.md).
