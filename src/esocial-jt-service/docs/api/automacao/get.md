# Consultar status

Consulta o status do processamento automático da aplicação.

**URL** : `/esocial-jt-service/automacao`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Parâmetros

`descrição`: Nome do executor do processamento automático

`habilitado`: Indica se a execução está habilitada. Valores válidos `[true, false]`

`periodoMilis`: Período em milisegundos entre cada ciclo de execução

## Exemplo

**Request**

```
GET: /esocial-jt-service/automacao
```

**Response**

```json
{
  "descricao": "Execucao automatica eSocial-JT",
  "habilitado": false,
  "periodoMilis": 0
}
```
