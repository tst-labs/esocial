# Configurar automação

Configura o processamento automático da aplicação.

**URL** : `/esocial-jt-service/automacao`

**Method** : `POST`

## Success Response

**Code** : `200 OK`

## Query params

`habilitado`: **Obrigatório**. Habilita ou desabilita a execução automática. Valores válidos `[true, false]`

`periodo`: Período em milisegundos entre cada ciclo de execução

## Parâmetros

`descrição`: Nome do executor do processamento automático

`habilitado`: Indica se a execução está habilitada. Valores válidos `[true, false]`

`periodoMilis`: Período em milisegundos entre cada ciclo de execução

## Exemplo

**Request**

```
POST: /esocial-jt-service/automacao?habilitado=true&periodo=10000
```

**Response**

```json
{
  "descricao": "Execucao automatica eSocial-JT",
  "habilitado": true,
  "periodoMilis": 10000
}
```
