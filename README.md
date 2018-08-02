# eSocial

[https://tst-labs.github.io/esocial/](https://tst-labs.github.io/esocial/)

## Módulos do projeto

- esocial-comunicacao: Pacote de mapeamento dos serviços do WSDL.
- esocial-esquemas: Schemas WSDL do eSocial-GOV. [[mais informações...](src/esocial-esquemas/README.md)]
- esocial-jt-dominio: Modelos básicos do esocial-jt.
- esocial-jt-service: API RESTful para comunicação com eSocial-GOV. [[mais informações...](src/esocial-jt-service/README.md)]

## Executando o projeto

### Clone e faça a build do projeto

```bash
$ git clone https://github.com/tst-labs/esocial.git
$ cd esocial/src
$ mvn clean package
```

### Execute o projeto

```bash
java -jar src/esocial-jt-service/target/esocial-jt-service-0.0.1-SNAPSHOT.jar
```

## Visão Geral

O Tribunal Superior do Trabalho está em uma fase avançada de desenvolvimento de uma solução para transmitir os dados
da vida funcional dos seus servidores para sistema eSocial do Governo Federal, atendendo às necessidades legais do
<a href="http://www.planalto.gov.br/ccivil_03/_ato2011-2014/2014/decreto/d8373.htm">Decreto N° 8.373, de 11 de Dezembro de 2014</a>.

Essa iniciativa converge na publicação desse trabalho como projeto Open Source (OSS), uma vez que entendemos que essa solução
pode ser reusada, trazendo economia de esforços em quaisquer entidades públicas ou privadas.

## Escopo

### O que esse software **faz**?

Esse pedaço da solução compreende:

- Recepção de ocorrências provenientes dos sistemas de origem, via API RESTful;
- Conversão dessas ocorrências em eventos do eSocial, no formato XML;
- Orquestração do envio dos eventos ao eSocial-GOV;
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

### Status por evento

#### 0.1.0

| Fase          | Evento | Nome Evento                         | Versão | Envio Inicial |
| ------------- | ------ | ----------------------------------- | -----: | ------------: |
| Envio inicial | S-1000 | Empregador/Contribuinte             | 2.4.02 |         Feito |
| Envio inicial | S-1005 | Estabelecimentos                    | 2.4.02 |         Feito |
| Envio inicial | S-1010 | Rubricas                            | 2.4.02 |   **Fazendo** |
| Envio inicial | S-1020 | Lotações Tributárias                | 2.4.02 |         Feito |
| Envio inicial | S-1030 | Cargos/Empregos Públicos            | 2.4.02 |         Feito |
| Envio inicial | S-1035 | Carreiras Públicas                  | 2.4.02 |         Feito |
| Envio inicial | S-1040 | Funções/Cargos em Comissão          | 2.4.02 |         Feito |
| Envio inicial | S-1050 | Horários/Turnos de Trabalho         |     NA |            NA |
| Envio inicial | S-1070 | Processos Administrativos/Judiciais | 2.4.02 |         Feito |
| Envio inicial | S-1080 | Operadores Portuários               |     NA |            NA |
| Inclusão      | S-1005 | Estabelecimentos                    | 2.4.02 |         Feito |
| Inclusão      | S-1010 | Rubricas                            | 2.4.02 |   **Fazendo** |
| Inclusão      | S-1020 | Lotações Tributárias                | 2.4.02 |         Feito |
| Inclusão      | S-1030 | Cargos/Empregos Públicos            | 2.4.02 |         Feito |
| Inclusão      | S-1035 | Carreiras Públicas                  | 2.4.02 |         Feito |
| Inclusão      | S-1040 | Funções/Cargos em Comissão          | 2.4.02 |         Feito |
| Inclusão      | S-1050 | Horários/Turnos de Trabalho         |     NA |            NA |
| Inclusão      | S-1070 | Processos Administrativos/Judiciais | 2.4.02 |   **Fazendo** |
| Alteração     | S-1000 | Empregador/Contribuinte             | 2.4.02 |         Feito |
| Alteração     | S-1005 | Estabelecimentos                    | 2.4.02 |         Feito |
| Alteração     | S-1010 | Rubricas                            | 2.4.02 |   **Fazendo** |
| Alteração     | S-1020 | Lotações Tributárias                | 2.4.02 |         Feito |
| Alteração     | S-1030 | Cargos/Empregos Públicos            | 2.4.02 |         Feito |
| Alteração     | S-1035 | Carreiras Públicas                  | 2.4.02 |         Feito |
| Alteração     | S-1040 | Funções/Cargos em Comissão          | 2.4.02 |         Feito |
| Alteração     | S-1050 | Horários/Turnos de Trabalho         |     NA |            NA |
| Alteração     | S-1070 | Processos Administrativos/Judiciais | 2.4.02 |   **Fazendo** |
| Exclusão      | S-1005 | Estabelecimentos                    | 2.4.02 |         Feito |
| Exclusão      | S-1010 | Rubricas                            | 2.4.02 |   **Fazendo** |
| Exclusão      | S-1020 | Lotações Tributárias                | 2.4.02 |         Feito |
| Exclusão      | S-1030 | Cargos/Empregos Públicos            | 2.4.02 |         Feito |
| Exclusão      | S-1035 | Carreiras Públicas                  | 2.4.02 |         Feito |
| Exclusão      | S-1040 | Funções/Cargos em Comissão          | 2.4.02 |         Feito |
| Exclusão      | S-1050 | Horários/Turnos de Trabalho         |     NA |            NA |
| Exclusão      | S-1070 | Processos Administrativos/Judiciais | 2.4.02 |   **Fazendo** |

**Próximos eventos serão analisados após conclusão da primeira fase.**

### Commo contribuir?

Leia nosso [guia de contribuição em andamento](CONTRIBUTING.md).
