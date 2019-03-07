# Consultar todas ocorrências

Consulta todas as ocorrências já recebidas pelo sistema, exibindo informações completas, tais como dados enviados, evento gerado, erros de processamento, etc.

**URL** : `/esocial-jt-service/ocorrencias`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Exemplo

Supondo que duas ocorrências foram enviadas para o `esocial-jt-service`, uma com _informações do empregador_ e outra com informações sobre _cargo_:

**Request**

```
GET: /esocial-jt-service/ocorrencias
```

**Response**

```json
[
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
  },
  {
    "id": 2,
    "tipoOcorrencia": "TABELA_CARGO",
    "referencia": "010100",
    "operacao": "INCLUSAO",
    "dataOcorrencia": 1522181304000,
    "dataRecebimento": 1531508906000,
    "dadosOcorrencia": {
      "tipo": ".TabelaCargo",
      "ideEmpregador": { "tpInsc": 1, "nrInsc": "00509968000148" },
      "infoCargo": {
        "ideCargo": {
          "codCargo": "010100",
          "iniValid": "2017-01",
          "fimValid": null
        },
        "dadosCargo": {
          "nmCargo": "ANALISTA",
          "codCBO": "241040",
          "cargoPublico": {
            "acumCargo": 1,
            "contagemEsp": 1,
            "dedicExcl": "N",
            "leiCargo": {
              "nrLei": "11.416/2006",
              "dtLei": 1166148000000,
              "sitCargo": 1
            }
          }
        },
        "novaValidade": null
      }
    },
    "evento": null
  }
]
```
