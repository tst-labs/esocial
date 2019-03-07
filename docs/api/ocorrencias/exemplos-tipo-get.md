# Consultar exemplo de JSON de um tipo

Retorna o modelo de _JSON_ para cada tipo de ocorrência que deve ser enviada para o `/esocial-jt-service/ocorrencias`.

**URL** : `/esocial-jt-service/ocorrencias/exemplos/{tipo}`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Parâmetros

`tipo`: Tipo de ocorrência. Valores possíveis `[INFORMACOES_EMPREGADOR, TABELA_ESTABELECIMENTO, TABELA_RUBRICA, TABELA_LOTACAO, TABELA_CARGO, TABELA_CARREIRA, TABELA_FUNCAO, TABELA_PROCESSO, TABELA_HORARIO, ADMISSAO_TRABALHADOR]`

## Exemplo

**Request**

```
GET: /esocial-jt-service/ocorrencias/exemplos/INFORMACOES_EMPREGADOR
```

**Response**

```json
{
  "tipoOcorrencia": "INFORMACOES_EMPREGADOR",
  "referencia": "00509968000148",
  "operacao": "INCLUSAO",
  "dataOcorrencia": 1522180917526,
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
  }
}
```
