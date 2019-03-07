# Status da aplicação

Consulta o status da aplicação.

**URL** : `/esocial-jt-service/actuator/health`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Parâmetros

`status`: Indica se a aplicação está no ar, sem nenhum problema. Valores válidos `[UP, DOWN]`

## Exemplo

**Request**

```
GET: /esocial-jt-service/actuator/health
```

**Response**

```json
{ "status": "UP" }
```
