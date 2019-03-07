# Status da aplicação

Consulta informações de build da aplicação.

**URL** : `/esocial-jt-service/actuator/info`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Exemplo

**Request**

```
GET: /esocial-jt-service/actuator/info
```

**Response**

```json
{
  "git": {
    "commit": { "time": 1530568834.0, "id": "ac7d04e" },
    "branch": "adequacao-oss"
  },
  "build": {
    "version": "0.0.1-SNAPSHOT",
    "artifact": "esocial-jt-service",
    "name": "esocial-jt-service",
    "group": "br.jus.tst",
    "time": 1531257668.399
  }
}
```
