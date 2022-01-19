# esocial-jt-frontend

O **esocial-jt-frontend** é o módulo de interface que representa o estado atual do sistema **esocial-jt-service**.

## Pré-requisitos

- Node.js
- Yarn

## Executando em desenvolvimento

```console
yarn install
yarn start
```

## Executando os testes

```console
yarn test
```

## Gerando a build

```console
yarn build
```

Os arquivos são gerados na pasta `build`. Esses arquivos devem ser usados em um servidor de produção.

## Verificando qualidade do código

```console
yarn lint
```

Corrige erros de `lint`, se possível

```console
yarn lint:fix
```

## Variáveis de ambiente

As variáveis de ambiente da aplicação estão descritas no arquivo [env.js](src/shared/env.js). Os valores default são sobrescritos pelo container (ver [.env.example](.env.example)).

### Sobrescrevendo variáveis de ambiente em desenvolvimento

Crie um arquivo de propriedades na pasta do projeto com seguinte nome: `.env`

Sobreescreva as variáveis de ambiente que desejar com o prefixo `FRONTEND_ENV_`. Pode-se usar o arquivo [.env.example](.env.example) como ponto de partida:

```
FRONTEND_ENV_PRIMARY_COLOR=#0067A0
FRONTEND_ENV_SECONDARY_COLOR=#19857b
FRONTEND_ENV_NOME_APP=eSocial
FRONTEND_ENV_HABILITA_CABECALHO=S
FRONTEND_ENV_PRODUCAO_RESTRITA=S
FRONTEND_ENV_ESOCIAL_JT_SERVICE_URL=http://localhost:8080/esocial-jt-service/
```
