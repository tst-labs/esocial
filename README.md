# eSocial-JT

![build workflow](https://github.com/tst-labs/esocial/actions/workflows/build.yml/badge.svg)

**[PROJETO EM DESENVOLVIMENTO] Atenção!** API ainda em desenvolvimento e portanto instável.

- [eSocial-JT](#esocial-jt)
  - [Introdução](#introdução)
  - [Guia rápido](#guia-rápido)
    - [Pré-requisitos](#pré-requisitos)
    - [Download](#download)
    - [Configuração](#configuração)
    - [Execução](#execução)
    - [Testando o primeiro envio](#testando-o-primeiro-envio)
    - [Próximos passos](#próximos-passos)
  - [Visão geral da arquitetura da solução](#visão-geral-da-arquitetura-da-solução)
  - [Características](#características)
    - [Funcionamento](#funcionamento)
  - [Configuração](#configuração-1)
    - [Configurações padrão](#configurações-padrão)
    - [Configurações obrigatórias](#configurações-obrigatórias)
    - [Configurações opcionais](#configurações-opcionais)
    - [Configurações avançadas](#configurações-avançadas)
  - [Instalação](#instalação)
    - [Banco de dados](#banco-de-dados)
      - [Criação/Atualização automática dos esquemas de banco de dados](#criaçãoatualização-automática-dos-esquemas-de-banco-de-dados)
      - [Criação/Atualização manual dos esquemas de banco de dados](#criaçãoatualização-manual-dos-esquemas-de-banco-de-dados)
    - [Instalação via Docker](#instalação-via-docker)
      - [Pré-requisitos](#pré-requisitos-1)
      - [Execução](#execução-1)
    - [Instalação como aplicação Java](#instalação-como-aplicação-java)
      - [Pré-requisitos](#pré-requisitos-2)
      - [Execução](#execução-2)
    - [Instalação em servidor de aplicação](#instalação-em-servidor-de-aplicação)
      - [Pré-requisitos](#pré-requisitos-3)
      - [Execução](#execução-3)
  - [Configuração de serviços que usam certificado digital (assinatura de xml e envio para eSocial-Gov)](#configuração-de-serviços-que-usam-certificado-digital-assinatura-de-xml-e-envio-para-esocial-gov)
    - [1. Instalação do <strong>esocial-jt-service</strong> e certificado no mesmo servidor](#1-instalação-do-esocial-jt-service-e-certificado-no-mesmo-servidor)
    - [2. Instalação do <strong>esocial-jt-service</strong> sem certificado e usar serviços de outra instância do <strong>esocial-jt-service</strong> que possui um certificado](#2-instalação-do-esocial-jt-service-sem-certificado-e-usar-serviços-de-outra-instância-do-esocial-jt-service-que-possui-um-certificado)
    - [3. Instalação do <strong>esocial-jt-service</strong> sem certificado e usar serviços de outra aplicação que forneça api REST para assinatura e envio de lotes](#3-instalação-do-esocial-jt-service-sem-certificado-e-usar-serviços-de-outra-aplicação-que-forneça-api-rest-para-assinatura-e-envio-de-lotes)
  - [API Rest](#api-rest)
  - [Sobre o projeto](#sobre-o-projeto)
    - [Escopo](#escopo)
      - [O que esse software <strong>faz</strong>?](#o-que-esse-software-faz)
      - [O que esse software <strong>não faz</strong>?](#o-que-esse-software-não-faz)
    - [Estado atual](#estado-atual)
    - [Status por evento](#status-por-evento)
      - [Versões do eSocial-GOV](#versões-do-esocial-gov)
      - [Eventos de Tabelas](#eventos-de-tabelas)
      - [Eventos periódicos](#eventos-periódicos)
      - [Eventos não periódicos](#eventos-não-periódicos)
  - [Dúvidas e contato](#dúvidas-e-contato)
  - [Como contribuir](#como-contribuir)
  - [Licença](#licença)

## Introdução

O **eSocial-JT** é o projeto que reúne as iniciativas do [TST](http://www.tst.jus.br/) para atender às necessidades do sistema [eSocial](https://portal.esocial.gov.br/) do Governo Federal. A solução foi desenvolvida em módulos auto contidos e independentes, que podem ser adaptados e utilizados em ambientes de qualquer organização, tanto pública quanto privada.

Em poucas palavras, o **esocial-jt-service**, módulo principal da solução, recebe um _JSON_ com os dados de uma **ocorrência** dos sistemas de origem, tranforma em um **evento** do eSocial, cria e assina o arquivo XML, transmite para o eSocial-Gov e posteriormente consulta o resultado de processamento com eventuais erros.

## Guia rápido

Use este guia para obter rapidamente uma instância do **esocial-jt-service** em execução e enviar seu primeiro evento para o ambiente de [Produção Restrita](http://portal.esocial.gov.br/institucional/ambiente-de-producao-restrita) do eSocial-Gov.

### Pré-requisitos

- [Git](https://git-scm.com/)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Certificado Digital ICP-Brasil A1 válido](https://portal.esocial.gov.br/institucional/ambiente-de-producao-restrita/perguntas-frequentes-producao-restrita#02---certificado-digital) (obrigatório mesmo para testes)
- [Postman](https://www.getpostman.com/) (opcional)

### Download

1. Clone o projeto

```shellscript
$ git clone https://github.com/tst-labs/esocial.git
$ cd esocial
```

### Configuração

1. Copie sua chave para a pasta `./config` com nome `esocial.pfx`

```shellscript
$ cp local/da/chave/esocial.pfx ./config/esocial.pfx
```

2. Copie o arquivo `./config/application.properties.example` para `./config/application.properties`

```shellscript
$ cp ./config/application.properties.example ./config/application.properties
```

3. Edite o arquivo de configuração `./config/application.properties` para ficar de acordo com seu ambiente

```properties
esocialjt.cnpj-empregador=
esocialjt.ambiente=PRODUCAO_RESTRITA
esocialjt.arquivoCertificado=/config/esocial.pfx
esocialjt.senhaCertificado=

esocialjt.proxyServer=
esocialjt.proxyPort=
esocialjt.proxyUser=
esocialjt.proxyPassword=
```

> Obs.: Deixe em branco as configurações de `proxy`, caso não se aplique

### Execução

1. Inicialize a aplicação com `docker-compose`

```shellscript
docker-compose up
```

> Obs.: O docker-compose sobe um banco postgres e a aplicação Java

2. Verifique o log da aplicação se foi possível estabelecer comunicação com o eSocial-Gov

```
br.jus.tst.esocialjt.OnStartup           : Testando conexão com eSocial...
br.jus.tst.esocialjt.OnStartup           : Conexão com eSocial OK
```

3. Verifique se a aplicação está no ar e se há comunicação com o eSocial-Gov acessando as urls

```
http://localhost:8080/esocial-jt-service/actuator/health
http://localhost:8080/esocial-jt-service/actuator/esocialhealth
```

4. Acesse a interface gráfica para verificar o status do serviço pela url

```
http://localhost
```

### Testando o primeiro envio

1. Crie uma cópia do arquivo [./src/esocial-jt-service/src/main/resources/exemplos/informacoes_empregador.json](./src/esocial-jt-service/src/main/resources/exemplos/informacoes_empregador.json)

2. Edite com as informações referentes à instituição (o CNPJ deve ser o mesmo do proprietário do Certificado Digital)

3. Envie usando o método **POST** (via linha de comando ou [Postman](https://www.getpostman.com/)) para o _endpoint_:

```
http://localhost:8080/esocial-jt-service/ocorrencias
```

4. Após alguns segundos, verifique o log da aplicação se o evento foi processado pelo eSocial-Gov

```
j.t.e.a.t.TarefaAtualizacaoProcessamento : Eventos processados: {PROCESSADO COM SUCESSO=1}
```

5. Também é possível consultar o status fazendo uma requisição **GET** para o _endpoint_

```
http://localhost:8080/esocial-jt-service/ocorrencias
```

6. Acesse a interface gráfica para verificar resultado do processamento

```
http://localhost
```

### Próximos passos

As demais seções deste documento fornecem mais detalhes sobre o funcionamento geral da solução, opções de instalação e configuração, API rest e guia de contribuição.

## Visão geral da arquitetura da solução

A figura abaixo ilustra uma visão geral arquitetura desta solução

![Visao geral da arquitetura](./docs/imagens/visao-geral.png?raw=true "Visão geral da arquitetura")

- **Sistemas de origem**: São os sistemas de RH, Folha de Pagamentos e etc da instituição
- **Conector**: É o responsável por buscar os dados dos sistemas de origem, criar os arquivos _json_ e enviar para o **eSocial-JT**. Cada instituição é responsável por criar seu conector da forma que lhe for mais conveniente, por exemplo, alterando os sistemas de origem para geração dos arquivos necessários ou utilizando [ferramentas de ETL](./exemplos/pentaho)
- **eSocial-JT**: é o produto oferecido por este projeto e é o responsável por todo o ciclo de envio e consulta de processamento dos eventos enviados ao **eSocial-Gov**
- **eSocial-Gov**: aplicação do Governo Federal que recebe e processa os eventos do eSocial

Sendo assim, cada instituição deve:

1. Instalar e configurar **eSocial-JT** (esocial-jt-service) em seu ambiente
2. Criar seu **Conector** responsável por ler os dados de origem e enviar para o **eSocial-JT** em formato _json_

## Características

O projeto é dividido nos seguintes módulos:

- esocial-comunicacao: Pacote de mapeamento dos serviços do WSDL.
- esocial-esquemas: Schemas XSD do eSocial-GOV.
- esocial-jt-dominio: Modelos básicos do esocial-jt.
- esocial-jt-service: API RESTful para comunicação com eSocial-GOV. [[mais informações...](src/esocial-jt-service/README.md)]

O **esocial-jt-service**, módulo principal **eSocial-JT**, foi construído em [Java 8](http://www.oracle.com/technetwork/pt/java/javaee/overview/index.html) utilizando o framework [Spring Boot](https://spring.io/projects/spring-boot). É uma aplicação primordialmente de _backend_ que fornece API RESTful trafegando dados no formato _JSON_.

### Funcionamento

Quando está em execução, o **esocial-jt-service**

- Recebe dados de uma **ocorrência\*** no _endpoint_ `POST` `/esocial-jt-service/ocorrencias`
- A cada **10 segundos** verifica as **ocorrências** recebidas, gera os **eventos** e envia ao eSocial-Gov
- No próximo ciclo de **10 segundos** consulta o resultado do processamento dos eventos enviados
- Além disso, fornece API para consulta do estado interno da aplicação.

> Obs. 1: para não confundir os conceitos, os dados recebidos pelo esocial-jt-service são chamados de "ocorrencia" enquanto que os XMLs que são enviados para o eSocial-Gov são chamados de "eventos".

> Obs. 2: Cada instituição deve alterar seus sitemas de origem (RH, Folha, etc) ou criar um conector para extrair os dados e enviar no formato JSON para o esocial-jt-service.

> Obs. 3: O intervalo de **10 segundos** pode ser alterado ou mesmo desabilitado via configuração

> Obs. 4: Modelos dos arquivos _json_ podem ser encontrados na pasta do projeto [./src/esocial-jt-service/src/main/resources/exemplos](./src/esocial-jt-service/src/main/resources/exemplos) ou no _endpoint_ `GET` `/esocial-jt-service/ocorrencias/exemplos`

## Configuração

O **esocial-jt-service** é uma aplicação [Spring Boot](https://spring.io/projects/spring-boot), portanto, é possível [sobreescrever os parâmetros de configuração](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html) por qualquer método disponibiliado pelo framework. As formas mais recomendadas para este projeto são:

- Criação de arquivo `application.properties` no subdiretório `/config` relativo ao diretório de execução
- Criação de arquivo `application.properties` no diretório de execução
- Variáveis de ambiente do Sistema Operacional ou Container
- Argumentos de linha de comando
- Alterando o `src/main/resources/application.properties` do projeto `./src/esocial-jt-service` (requer recompilação)

> Obs. 1: Os métodos de configuração podem ser combinados entre si, observando-se a ordem de precedência

> Obs. 2: A instalação em container utiliza uma adaptação da primeira abordagem

### Configurações padrão

As configurações padrão estão disponíveis no arquivo `src/main/resources/application.properties` do projeto `./src/esocial-jt-service`.

> Obs.: Use esse arquivo como referência em caso de dúvidas sobre a configuração.

### Configurações obrigatórias

```properties
esocialjt.cnpj-empregador=
esocialjt.arquivoCertificado=
esocialjt.senhaCertificado=
```

> Obs.: é possível configurar serviços externos de assinatura e envio, fazendo que não seja necessário o uso de um certificado local (ver seções mais adiante)

### Configurações opcionais

```properties
#Define o ambiente para envio ao eSocial-Gov entre PRODUCAO e PRODUCAO_RESTRITA
esocialjt.ambiente=PRODUCAO_RESTRITA

#Periodo, em milissegundos, entre cada envio/consulta ao eSocial-Gov. 0 (zero) para desabilitar
esocialjt.periodoAutoMilis=10000

#Quantidade maxima de eventos por lote, entre 1 e 50
esocialjt.limite-eventos-por-lote=50

#Preencha caso queira usar servicos externos, assim nao ha necessidade de ter um certificado local
#Uma instalacao padrao fornece os servicos nos endpoints abaixo (aponte, por exemplo, para uma instalacao em homologacao)
esocialjt.urlServicoConsultaProcessamento=http://localhost:8080/esocial-jt-service/lote/consulta/
esocialjt.urlServicoEnvioLote=http://localhost:8080/esocial-jt-service/lote/acoes/enviar/
esocialjt.urlServicoAssinatura=http://localhost:8080/esocial-jt-service/xml/acoes/assinar/

#Preencha caso o certificado do transmisssor seja diferente do empregador a ser cadastrado no evento S1000.
#Ou seja, sera usado um certificado de uma Pessoa Fisica para envio dos eventos.
esocialjt.tpInscIdeTransmissor=2
esocialjt.nrInscIdeTransmissor= cpf do transmisssor

#Database - configuracao de banco de dados
spring.datasource.url=jdbc:postgresql://esocial-db/postgres
spring.datasource.username=postgres
spring.datasource.password=esocial

#Flyway - habilita ou desabilita a criacao automatica dos esquemas de banco de dados
spring.flyway.enabled=true

```

### Configurações avançadas

Documentação oficial do [spring-boot](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)

## Instalação

A forma mais direta de instalação é via `docker-compose` (ver Guia rápido). Abaixo são listadas outras opções de instalação.

### Banco de dados

Atualmente, o **esocial-jt-service** é testado com **PostgreSQL** mas em teoria é compatível com outros bancos. Os parâmetros de conexão devem ser passados no arquivo de configuração.

```properties
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
```

#### Criação/Atualização automática dos esquemas de banco de dados

Execute a aplicação com a configuração abaixo habilitada:

```properties
spring.flyway.enabled=true
```

> Obs.: É necessário que o usuário de banco de dados da aplicação tenha permissão para criação e alteração do esquema

#### Criação/Atualização manual dos esquemas de banco de dados

1. Desabilite o flyway

```properties
spring.flyway.enabled=false
```

2. Execute os scripts de criação do banco, localizados em [src/esocial-jt-service/src/main/resources/db/migration/](src/esocial-jt-service/src/main/resources/db/migration/).

### Instalação via Docker

#### Pré-requisitos

- [Docker](https://www.docker.com/)

#### Execução

1. Crie uma pasta contendo os arquivos `application.properties` e `esocial.pfx`
2. Execute o docker mapeando a pasta criada para a pasta `/config` do container

```shellscript
docker run -p "8080:8080" -v "/pasta/de/configuracao:/config" tstlabs/esocial-jt-service:latest
```

### Instalação como aplicação Java

#### Pré-requisitos

- [JDK 8](https://www.oracle.com/technetwork/pt/java/javase/downloads/index.html);
- [Maven 3.3.9](https://maven.apache.org/index.html) (ou superior);
- [Git 2.15.0](https://git-scm.com/) (ou superior);

#### Execução

1. Clone o projeto

```shellscript
git clone https://github.com/tst-labs/esocial.git
```

2. Faça build da aplicação Java utilizando o Maven

```shellscript
cd esocial/src
mvn clean install
```

3. Crie o arquivo `application.properties` com as devidas configurações na pasta `src/esocial-jt-service/target`. Não esquecer de indicar o caminho para o arquivo `.pfx` do certificado digital.

4. Execute a aplicação

```shellscript
java -jar ./src/esocial-jt-service/target/esocial-jt-service*.jar
```

### Instalação em servidor de aplicação

#### Pré-requisitos

- [JDK 8](https://www.oracle.com/technetwork/pt/java/javase/downloads/index.html);
- [Maven 3.3.9](https://maven.apache.org/index.html) (ou superior);
- [Git 2.15.0](https://git-scm.com/) (ou superior);
- Servidor de aplicação

#### Execução

1. Clone o projeto

```shellscript
git clone https://github.com/tst-labs/esocial.git
```

2. Faça build da aplicação Java utilizando o Maven com o perfil `war`

```shellscript
cd esocial/src
mvn clean install -Pwar
```

3. Configurar o servidor de aplicação e implantar o `war`.

## Configuração de serviços que usam certificado digital (assinatura de xml e envio para eSocial-Gov)

Para comunicação com o eSocial-Gov, é necessário um certificado digital válido, mesmo para o ambiente de Produção Restrita. Para flexibilizar o uso do certificado, o **esocial-jt-service** permite três configurações para essa funcionalidade:

1. Instalação do **esocial-jt-service** e certificado no mesmo servidor
2. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra instância do **esocial-jt-service** que possui um certificado
3. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra aplicação que forneça api REST para assinatura e envio de lotes

### 1. Instalação do **esocial-jt-service** e certificado no mesmo servidor

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

### 2. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra instância do **esocial-jt-service** que possui um certificado

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

### 3. Instalação do **esocial-jt-service** sem certificado e usar serviços de outra aplicação que forneça api REST para assinatura e envio de lotes

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

## API Rest

Um modelo da API Rest completa do projeto pode ser encontrada <a href="https://tst-labs.github.io/esocial/open-api/">neste link</a>. Além disso, esse mesmo modelo pode ser executado em localhost com o projeto no ar, por meio do endereço `http://localhost:8080/esocial-jt-service/swagger-ui.html`

## Sobre o projeto

O Tribunal Superior do Trabalho está em uma fase avançada de desenvolvimento de uma solução para transmitir os dados
da vida funcional dos seus servidores para o sistema eSocial do Governo Federal, atendendo às necessidades legais do
<a href="http://www.planalto.gov.br/ccivil_03/_ato2011-2014/2014/decreto/d8373.htm">Decreto N° 8.373, de 11 de Dezembro de 2014</a>.

Essa iniciativa converge na publicação desse trabalho como projeto Open Source (OSS), uma vez que entendemos que essa solução
pode ser reusada, trazendo economia de esforços em quaisquer entidades públicas ou privadas.

### Escopo

#### O que esse software **faz**?

Esse pedaço da solução compreende:

- Recepção de ocorrências provenientes dos sistemas de origem, via API RESTful;
- Conversão dessas ocorrências em eventos do eSocial, no formato XML;
- Consulta do resultado do processamento dos eventos enviados; e
- Gerência dos detalhes de conexão com o eSocial-GOV (assinatura dos eventos, conexão com certificado, etc.).

#### O que esse software **não faz**?

Não tratamos nesse projeto de:

- Extração e/ou transformação de dados dos sistemas finalísticos das organizações usuárias;
- Manipulação de qualquer forma que seja dos dados recebidos; e
- Validação semântica dos dados recebidos; e
- Compatibilidade com certificado do tipo A3. (Apesar do eSocial-GOV aceitar certificado dos tipos A1 e A3, este software lida apenas com
  certificados do tipo A1).

### Estado atual

Atualmente, o sistema já é capaz de receber dados de grande parte dos eventos, transmitir de forma automática
para o eSocial-GOV e exibir o resultado do processamento (sucesso ou mensagens de erro).

A priorização dos eventos a serem transmitidos foi feita com base na necessidade atual do TST e
demais órgãos da Justiça do Trabalho. No entanto, o projeto pode ser estendido para quaisquer tipos
de eventos especificados pelo eSocial-GOV.

### Status por evento

#### Versões do eSocial-GOV

Pacote de esquemas : S-1.1

Pacote de comunicação : 1.5

#### Eventos de Tabelas

| Evento | Nome Evento                         | Versão | Situação | Resultado do envio para a produção restrita |
|--------|-------------------------------------|--------|----------|---------------------------------------------|
| S-1000 | Empregador/Contribuinte             | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1005 | Estabelecimentos                    | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1010 | Rubricas                            | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1020 | Lotações Tributárias                | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1030 | Cargos/Empregos Públicos            | NA     | Removido | Removido                                    |
| S-1035 | Carreiras Públicas                  | NA     | Removido | Removido                                    |
| S-1040 | Funções/Cargos em Comissão          | NA     | Removido | Removido                                    |
| S-1050 | Horários/Turnos de Trabalho         | NA     | Removido | Removido                                    |
| S-1060 | Ambientes de Trabalho               | NA     | Removido | Removido                                    |
| S-1070 | Processos Administrativos/Judiciais | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1080 | Operadores Portuários               | NA     | NA       | NA                                          |

#### Eventos periódicos

| Evento | Nome Evento                                               | Versão | Situação | Resultado do envio para a produção restrita |
|--------|-----------------------------------------------------------|--------|----------|---------------------------------------------|
| S-1200 | Remuneração de trabalhador vinculado ao RGPS              | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1202 | Remuneração de servidor vinculado a RPPS                  | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1207 | Benefícios previdenciários - RPPS                         | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1210 | Pagamentos de Rendimentos do Trabalho                     | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1250 | Aquisição de Produção Rural                               | S-1.1  | NA       | NA                                          |
| S-1260 | Comercialização da Produção Rural Pessoa Física           | S-1.1  | NA       | NA                                          |
| S-1270 | Contratação de Trabalhadores Avulsos Não Portuários       | S-1.1  | NA       | NA                                          |
| S-1280 | Informações Complementares aos Eventos Periódicos         | S-1.1  | NA       | NA                                          |
| S-1295 | Solicitação de Totalização para Pagamento em Contingência | NA     | Removido | Removido                                    |
| S-1298 | Reabertura dos Eventos Periódicos                         | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1299 | Fechamento dos Eventos Periódicos                         | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-1300 | Contribuição Sindical Patronal                            | NA     | NA       | NA                                          |

#### Eventos não periódicos

| Evento | Nome Evento                                                              | Versão | Situação | Resultado do envio para a produção restrita |
|--------|--------------------------------------------------------------------------|--------|----------|---------------------------------------------|
| S-2190 | Admissão de Trabalhador - Registro Preliminar                            | S-1.1  | NA       | NA                                          |
| S-2200 | Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador      | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2205 | Alteração de Dados Cadastrais do Trabalhador                             | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2206 | Alteração de Contrato de Trabalho                                        | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2210 | Comunicação de Acidente de Trabalho                                      | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2220 | Monitoramento da Saúde do Trabalhador                                    | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2230 | Afastamento Temporário                                                   | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2231 | Cessão/Exercício em Outro Órgão                                          | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2240 | Condições Ambientais do Trabalho - Fatores de Risco                      | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2241 | Insalubridade, Periculosidade e Aposentadoria Especial                   | S-1.1  | Removido | Removido                                    |
| S-2250 | Aviso Prévio                                                             | NA     | NA       | NA                                          |
| S-2260 | Convocação para Trabalho Intermitente                                    | NA     | NA       | NA                                          |
| S-2298 | Reintegração                                                             | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2299 | Desligamento                                                             | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2300 | Trabalhador Sem Vínculo de Emprego/Estatutário - Início                  | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2306 | Trabalhador Sem Vínculo de Emprego/Estatutário - Alteração Contratual    | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2399 | Trabalhador Sem Vínculo de Emprego/Estatutário - Término                 | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2400 | Cadastro de Beneficiário - Entes Públicos - Início                       | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2405 | Cadastro de Beneficiário – Entes Públicos – Alteração                    | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2410 | Cadastro de Benefício – Entes Públicos – Início                          | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2416 | Cadastro de Benefício – Entes Públicos – Alteração                       | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2418 | Reativação de Benefício – Entes Públicos                                 | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2420 | Cadastro de Benefício – Entes Públicos – Término                         | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-2500 | Processo Trabalhista                                                     | S-1.1  | NA       | NA                                          |
| S-2501 | Informações de Tributos Decorrentes de Processo Trabalhista              | S-1.1  | NA       | NA                                          |
| S-3000 | Exclusão de eventos                                                      | S-1.1  | Feito    | PROCESSADO COM SUCESSO                      |
| S-3500 | Exclusão de Eventos - Processo Trabalhista                               | S-1.1  | NA       | NA                                          |
| S-5001 | Informações das contribuições sociais por trabalhador                    | S-1.1  | Feito    | Evento totalizador gravado no formato XML   |
| S-5002 | Imposto de Renda Retido na Fonte                                         | S-1.1  | Feito    | Evento totalizador gravado no formato XML   |
| S-5011 | Informações das contribuições sociais consolidadas por contribuinte      | S-1.1  | Feito    | Evento totalizador gravado no formato XML   |
| S-5012 | Informações do IRRF consolidadas por contribuinte                        | S-1.1  | Feito    | Evento totalizador gravado no formato XML   |
| S-5501 | Informações Consolidadas de Tributos Decorrentes de Processo Trabalhista | S-1.1  | NA       | NA                                          |

## Dúvidas e contato

Em caso de dúvidas, crie uma [issue](https://github.com/tst-labs/esocial/issues) neste projeto para que se inicie uma discussão com os membros da equipe e demais usuários da aplicação.

## Como contribuir

Leia nosso [guia de contribuição em andamento](CONTRIBUTING.md).

## Licença

Verifique o arquivo [LICENSE.md](LICENSE.md).
