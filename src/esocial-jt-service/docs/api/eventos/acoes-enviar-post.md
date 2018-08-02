# Enviar evento

Envia (ou reenvia) manualmente um evento para o eSocial-Gov.

**URL** : `/esocial-jt-service/eventos/acoes/enviar`

**Method** : `POST`

## Success Response

**Code** : `200 OK`

## Query params

`id`: Id do evento (não confundir com a id da ocorrência)

`tipo`: Tipo do evento. Valores possíveis `[1000, 1005, 1010, 1020, 1030, 1035, 1040, 1050, 1060, 1070, 2200]`

`estado`: Estado atual do evento. Valores possíveis `[1 (EM_FILA), 2 (PROCESSAMENTO), 3 (PROCESSADO_COM_SUCESSO), 4 (PROCESSADO_COM_ERRO), 5 (ERRO)]`

`grupo`: Grupo do evento. Valores possíveis `[1 (TABELA), 2 (NAO_PERIODICO), 3 (PERIODICO)]`

## Exemplo

**Request**

```
POST: /esocial-jt-service/eventos/acoes/enviar?tipo=1020&estado=1
```

**Response**

```json
[
  /*TODO*/
]
```
