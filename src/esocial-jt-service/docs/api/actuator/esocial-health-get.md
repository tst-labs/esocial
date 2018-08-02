# Status da aplicação

Consulta se há comunicação com o eSocial-Gov. Pode indicar problemas locais (como certificado digital inválido) ou problemas no próprio eSocial-Gov.

**URL** : `/esocial-jt-service/actuator/esocial-health`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Parâmetros

`status`: Indica se há comunicação com o eSocial-Gov. Valores válidos `[UP, DOWN]`

## Exemplo

**Request**

```
GET: /esocial-jt-service/actuator/esocial-health
```

**Response**

```json
{ "status": "UP" }
```
