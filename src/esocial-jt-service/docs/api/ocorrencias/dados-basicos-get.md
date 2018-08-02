# Consultar dados básicos das ocorrências

Consulta todas as ocorrências já recebidas pelo sistema, exibindo informações simplificadas. Esta consulta tende a ser mais rápida que a consulta de dados completos.

**URL** : `/esocial-jt-service/ocorrencias/dados-basicos`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Exemplo

Supondo que duas ocorrências foram enviadas para o `esocial-jt-service`, uma com _informações do empregador_ e outra com informações sobre _cargo_:

**Request**

```
GET: /esocial-jt-service/ocorrencias/dados-basicos
```

**Response**

```json
[
  {
    "id": 1,
    "tipo": "INFORMACOES_EMPREGADOR",
    "data": 1522180917000,
    "estadoEvento": null,
    "tipoEvento": null
  },
  {
    "id": 2,
    "tipo": "TABELA_CARGO",
    "data": 1522181304000,
    "estadoEvento": null,
    "tipoEvento": null
  }
]
```
