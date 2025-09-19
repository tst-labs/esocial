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
FRONTEND_ENV_KEYCLOAK_URL=http://localhost:9090/auth
FRONTEND_ENV_KEYCLOAK_REALM=app-realm
FRONTEND_ENV_KEYCLOAK_CLIENT_ID=esocial-app
FRONTEND_ENV_KEYCLOAK_USER_ROLES=user
FRONTEND_ENV_KEYCLOAK_MANAGER_ROLES=manager
FRONTEND_ENV_KEYCLOAK_ADMIN_ROLES=admin
```

> Obs.: Se a variável **FRONTEND_ENV_KEYCLOAK_URL**, **FRONTEND_ENV_KEYCLOAK_URL** e **FRONTEND_ENV_KEYCLOAK_REALM** forem especificadas, as variáveis roles **FRONTEND_ENV_KEYCLOAK_USER_ROLES**, **FRONTEND_ENV_KEYCLOAK_MANAGER_ROLES** e **FRONTEND_ENV_KEYCLOAK_ADMIN_ROLES**, precisarão ser criadas na aba **Roles** dentro do client do Keycloak e vinculadas aos usuários necessários.

## Criar as roles no Keycloak:

Caso não sejam criados nenhuma role, siga essas instruções:

1) Acesse o endereço desejado do Keycloak;
2) Procure o client que foi criado para frontend;
3) Na aba "Roles", crie os seguintes roles:

| Role    | Descrição               | Utilizado?  |
|---------|-------------------------|-------------|
| user    | Role com usuário padrão | Sim         |
| admin   | Role com acesso admin   | Não         |
| manager | Role com acesso gestor  | Não         |

> Obs.: Por enquanto, role **User** foi usada em todos os endpoints, mas isso pode ser alterado, caso haja necessidade.

## Atribuir permissões

1) Acesse o endereço desejado do Keycloak;
2) Vá no menu **User** e informe a matricula desejada;
3) Dentro desse usuário, na aba **Role Mappings**, assina a role **User** dentro do client do frontend;
