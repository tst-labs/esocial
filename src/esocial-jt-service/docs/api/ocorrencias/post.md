# Receber ocorrência

Url única para o recebimento de ocorrências. O tipo da ocorrência é passado no próprio _json_ dos dados e **deve** obedecer ao formato respectivo àquele tipo. Para obter um exemplo do formato do _json_ para cada tipo de ocorrência, deve-se consultar a url `/esocial-jt-service/ocorrencias/exemplos`.

**URL** : `/esocial-jt-service/ocorrencias`

**Method** : `POST`

## Success Response

**Code** : `200 OK`

## Exemplo

**Request**

```
POST: /esocial-jt-service/ocorrencias
```

```json
{
	"tipoOcorrencia": "INFORMACOES_EMPREGADOR",
	"referencia": "00509968000148",
	"operacao": "INCLUSAO",
	"dataOcorrencia": 1522180917526,
	"dadosOcorrencia": {
		"tipo": ".InformacoesEmpregador",
		"ideEmpregador": {
			"tpInsc": 1,
			"nrInsc": "00509968000148"
		},
		"infoEmpregador": ...
	}
}
```

**Response**

```json
{
  "id": 1,
  "tipoOcorrencia": "INFORMACOES_EMPREGADOR",
  "referencia": "00509968000148",
  "operacao": "INCLUSAO",
  "dataOcorrencia": 1522180917526,
  "dataRecebimento": 1531511083744,
  "dadosOcorrencia": {
    "tipo": ".InformacoesEmpregador",
    "ideEmpregador": {
      "tpInsc": 1,
      "nrInsc": "00509968000148"
    },
    "infoEmpregador": ...
  },
  "evento": null
}
```

## Parâmetros

`tipoOcorrencia`: especifica qual tipo da ocorrência enviada. Valores possíveis `[INFORMACOES_EMPREGADOR, TABELA_ESTABELECIMENTO, TABELA_RUBRICA, TABELA_LOTACAO, TABELA_CARGO, TABELA_CARREIRA, TABELA_FUNCAO, TABELA_PROCESSO, TABELA_HORARIO, ADMISSAO_TRABALHADOR]`

`referencia`: código que identifica a quem se refere os dados. Por exemplo, para **Empregador**, o seu _CNPJ_ é a referência em uma ocorrência de **INFORMACOES_EMPREGADOR**. Para um trabalhador, a _matrícula_ é usada como referência na **ADMISSAO_TRABALHADOR** e em outras ocorrências que se referem àquele mesmo trabalhador.

`operacao`: indica qual o tipo da operação. Valores possíveis `[INCLUSAO, ALTERACAO, EXCLUSAO]`

`dataOcorrencia`: timestamp da data que a ocorrência foi gerada na origem (por exemplo, uma alteração no sistema de RH)

`dadosOcorrencia`: Para cada tipo de ocorrência, existe um formato específico para o envio dos dados. Consultar `/esocial-jt-service/ocorrencias/exemplos`.
