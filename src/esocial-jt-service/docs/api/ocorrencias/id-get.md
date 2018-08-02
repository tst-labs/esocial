# Consultar ocorrência por ID

Consulta uma ocorrência especificada pelo _id_, exibindo informações completas, tais como dados enviados, evento gerado, erros de processamento, etc.

**URL** : `/esocial-jt-service/ocorrencias/{id}`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Parâmetros

`id`: id da ocorrência recebida

## Exemplo

**Request**

```
GET: /esocial-jt-service/ocorrencias/1
```

**Response**

```json
{
  "id": 1,
  "tipoOcorrencia": "INFORMACOES_EMPREGADOR",
  "referencia": "00509968000148",
  "operacao": "INCLUSAO",
  "dataOcorrencia": 1522180917000,
  "dataRecebimento": 1531508884000,
  "dadosOcorrencia": {
    "tipo": ".InformacoesEmpregador",
    "ideEmpregador": { "tpInsc": 1, "nrInsc": "00509968000148" },
    "infoEmpregador": {
      "idePeriodo": { "iniValid": "2017-01", "fimValid": null },
      "novaValidade": null,
      "infoCadastro": {
        "nmRazao": "TRIBUNAL SUPERIOR DO TRABALHO",
        "classTrib": "85",
        "natJurid": "1074",
        "indCoop": 0,
        "indConstr": 0,
        "indDesFolha": 0,
        "indOptRegEletron": 1,
        "indEntEd": "N",
        "indEtt": "N",
        "nrRegEtt": null,
        "dadosIsencao": null,
        "contato": {
          "nmCtt": "OBI-WAN KENOBI",
          "cpfCtt": "73548085121",
          "foneFixo": "6130000001",
          "foneCel": "6190000001",
          "email": "obiwankenobi@email.com"
        },
        "infoOP": { "nrSiafi": "080001", "infoEFR": null, "infoEnte": null },
        "infoOrgInternacional": null,
        "softwareHouse": [
          {
            "cnpjSoftHouse": "00509968000148",
            "nmRazao": "TRIBUNAL SUPERIOR DO TRABALHO",
            "nmCont": "LUKE SKYWALKER",
            "telefone": "6130000001",
            "email": "lukeskywalker@email.com"
          }
        ],
        "infoComplementares": {
          "situacaoPJ": { "indSitPJ": 0 },
          "situacaoPF": null
        }
      }
    }
  },
  "evento": null
}
```
