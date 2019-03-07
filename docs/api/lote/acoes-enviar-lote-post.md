# Enviar lote para o eSocial-Gov

Fornece para outras aplicações o serviço de envio do xml contendo um lote do eSocial para o eSocial-Gov. Este serviço faz o encapsulamento do protocolo SOAP e envia o lote por uma conexão HTTPS usando o certificado digital da aplicação.

**URL** : `/esocial-jt-service/lote/acoes/enviar/`

**Method** : `POST`

## Success Response

**Code** : `200 OK`

## Exemplo

**Request**

```
POST: /esocial-jt-service/lote/acoes/enviar/
```

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<eSocial
  xmlns="http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1">
  <envioLoteEventos grupo="1">
    <ideEmpregador>
      <tpInsc>1</tpInsc>
      <nrInsc>00509968000148</nrInsc>
    </ideEmpregador>
    <ideTransmissor>
      <tpInsc>1</tpInsc>
      <nrInsc>00509968000148</nrInsc>
    </ideTransmissor>
    <eventos>
      <evento Id="ID1005099680001482019030616091400002">
        <eSocial
          xmlns="http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_05_00"
          xmlns:ns2="http://www.w3.org/2000/09/xmldsig#">
          <evtInfoEmpregador
            Id="ID1005099680001482019030616091400002">
            <ideEvento>
              <tpAmb>2</tpAmb>
              <procEmi>1</procEmi>
              <verProc>0.0.1-SNAPSHOT</verProc>
            </ideEvento>
            <ideEmpregador>
              <tpInsc>1</tpInsc>
              <nrInsc>00509968000148</nrInsc>
            </ideEmpregador>
            <infoEmpregador>
              <inclusao>
                <!-- Conteudo do evento -->
              </inclusao>
            </infoEmpregador>
          </evtInfoEmpregador>
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
                  <Transform
                    Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315" />
                </Transforms>
                <DigestMethod
                  Algorithm="http://www.w3.org/2001/04/xmlenc#sha256" />
                <DigestValue>Han3Awsk7CI+EoxMF7JiP20wFigwbN5csp/8E3mEJgQ=
                </DigestValue>
              </Reference>
            </SignedInfo>
            <SignatureValue>
              ***
            </SignatureValue>
            <KeyInfo>
              <X509Data>
                <X509Certificate>
                  ***
                </X509Certificate>
              </X509Data>
            </KeyInfo>
          </Signature>
        </eSocial>
      </evento>
    </eventos>
  </envioLoteEventos>
</eSocial>
```

**Response**

```xml
<eSocial
  xmlns="http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0"
  xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <retornoEnvioLoteEventos>
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
      <descResposta>Lote Recebido com Sucesso.</descResposta>
    </status>
    <dadosRecepcaoLote>
      <dhRecepcao>2017-11-28T16:22:17.8052247-02:00</dhRecepcao>
      <versaoAplicativoRecepcao>0.1.0-A0243</versaoAplicativoRecepcao>
      <protocoloEnvio>1.2.201711.0000000000000038158</protocoloEnvio>
    </dadosRecepcaoLote>
  </retornoEnvioLoteEventos>
</eSocial>
```
