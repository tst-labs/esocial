# Atualiza lote por protcolo

Busca no eSocial-Gov o resultado do processamento para um lote com protocolo específico e registra os sucessos e erros no sistema local. Esta api só deve ser usada quando o processamento automático está desabilitado.

**URL** : `/esocial-jt-service/lote/acoes/atualizar-processamento/{protocolo}`

**Method** : `POST`

## Parâmetros

`protocolo`: Número de protocolo retornado pelo eSocial-Gov após o envio de um lote

## Success Response

**Code** : `200 OK`

## Exemplo

**Request**

```
POST: /esocial-jt-service/lote/acoes/atualizar-processamento/1.2.201711.0000000000000062303
```

**Response**

```json
[
  /*TODO*/
]
```
