# Consulta protocolo

Consulta o xml de resposta de processamento diretamente eSocial-Gov. Esta consulta não causa nenhuma alteração no sistema local.

**URL** : `/esocial-jt-service/lote/consulta/{protocolo}`

**Method** : `GET`

## Success Response

**Code** : `200 OK`

## Parâmetros

`protocolo`: Número de protocolo retornado pelo eSocial-Gov após o envio de um lote

## Exemplo

**Request**

```
GET: /esocial-jt-service/lote/consulta/1.2.201711.0000000000000062303
```

**Response**

```xml
<eSocial
	xmlns="http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<retornoProcessamentoLoteEventos>
		<ideEmpregador>
			<tpInsc>1</tpInsc>
			<nrInsc>00509968000148</nrInsc>
		</ideEmpregador>
		<ideTransmissor>
			<tpInsc>1</tpInsc>
			<nrInsc>00509968000148</nrInsc>
		</ideTransmissor>
		<status>
			<cdResposta>201</cdResposta>
			<descResposta>Lote processado com sucesso.</descResposta>
		</status>
		<dadosRecepcaoLote>
			<dhRecepcao>2017-11-29T14:13:23.68</dhRecepcao>
			<versaoAplicativoRecepcao>0.1.0-A0243</versaoAplicativoRecepcao>
			<protocoloEnvio>1.2.201711.0000000000000062303</protocoloEnvio>
		</dadosRecepcaoLote>
		<dadosProcessamentoLote>
			<versaoAplicativoProcessamentoLote>1.0.0.0
			</versaoAplicativoProcessamentoLote>
		</dadosProcessamentoLote>
		<retornoEventos>
			<evento Id="ID1005099680001482017112914063400001">
				<retornoEvento>
					<eSocial
						xmlns="http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0">
						<retornoEvento Id="ID1005099680001482017112914063400001">
							<ideEmpregador>
								<tpInsc>1</tpInsc>
								<nrInsc>00509968000148</nrInsc>
							</ideEmpregador>
							<recepcao>
								<tpAmb>2</tpAmb>
								<dhRecepcao>2017-11-29T14:13:23.68</dhRecepcao>
								<versaoAppRecepcao>0.1.0-A0243</versaoAppRecepcao>
								<protocoloEnvioLote>1.2.201711.0000000000000062303
								</protocoloEnvioLote>
							</recepcao>
							<processamento>
								<cdResposta>201</cdResposta>
								<descResposta>Sucesso.</descResposta>
								<versaoAppProcessamento>6.0.0-A2431</versaoAppProcessamento>
								<dhProcessamento>2017-11-29T14:13:24.61</dhProcessamento>
							</processamento>
							<recibo>
								<nrRecibo>1.2.0000000000007498277</nrRecibo>
								<hash>Fhjn62yfp7hu4g+DhnDzTAeV+FohE8PUtbFiCv3vszE=</hash>
							</recibo>
						</retornoEvento>
						<Signature xmlns="http://www.w3.org/2000/09/xmldsig#">
							<SignedInfo>
								<CanonicalizationMethod
									Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315" />
								<SignatureMethod
									Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256" />
								<Reference URI="">
									<Transforms>
										<Transform
											Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature" />
										<Transform Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315" />
									</Transforms>
									<DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256" />
									<DigestValue>LV0SvnMzECUBTN0xaC0gEHZ6vNM/Y2blN3HkiJbK9cQ=</DigestValue>
								</Reference>
							</SignedInfo>
							<SignatureValue></SignatureValue>
							<KeyInfo>
								<X509Data>
									<X509Certificate></X509Certificate>
								</X509Data>
							</KeyInfo>
						</Signature>
					</eSocial>
				</retornoEvento>
			</evento>
		</retornoEventos>
	</retornoProcessamentoLoteEventos>
</eSocial>
```
