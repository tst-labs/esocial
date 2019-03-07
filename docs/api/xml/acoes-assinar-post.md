# Assinar xml

Fornece para outras aplicações o serviço recebe um xml de evento do eSocial e assina usando o certificado digital da aplicação.

**URL** : `/esocial-jt-service/xml/acoes/assinar/`

**Method** : `POST`

## Success Response

**Code** : `200 OK`

## Exemplo

**Request**

```
POST: /esocial-jt-service/xml/acoes/assinar/
```

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<eSocial
  xmlns="http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_05_00">
  <evtInfoEmpregador
    Id="ID1005099680001482019022112065500002">
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
        <idePeriodo>
          <iniValid>2017-01</iniValid>
        </idePeriodo>
        <infoCadastro>
          <nmRazao>TRIBUNAL SUPERIOR DO TRABALHO</nmRazao>
          <classTrib>85</classTrib>
          <natJurid>1074</natJurid>
          <indCoop>0</indCoop>
          <indConstr>0</indConstr>
          <indDesFolha>0</indDesFolha>
          <indOptRegEletron>1</indOptRegEletron>
          <indEntEd>N</indEntEd>
          <indEtt>N</indEtt>
          <contato>
            <nmCtt>OBI-WAN KENOBI</nmCtt>
            <cpfCtt>73548085121</cpfCtt>
            <foneFixo>6130000001</foneFixo>
            <foneCel>6190000001</foneCel>
            <email>obiwankenobi@email.com</email>
          </contato>
          <infoOP>
            <nrSiafi>080001</nrSiafi>
          </infoOP>
          <softwareHouse>
            <cnpjSoftHouse>00509968000148</cnpjSoftHouse>
            <nmRazao>TRIBUNAL SUPERIOR DO TRABALHO</nmRazao>
            <nmCont>LUKE SKYWALKER</nmCont>
            <telefone>6130000001</telefone>
            <email>lukeskywalker@email.com</email>
          </softwareHouse>
          <infoComplementares>
            <situacaoPJ>
              <indSitPJ>0</indSitPJ>
            </situacaoPJ>
          </infoComplementares>
        </infoCadastro>
      </inclusao>
    </infoEmpregador>
  </evtInfoEmpregador>
</eSocial>
```

**Response**

```xml
<eSocial
  xmlns="http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_05_00"
  xmlns:ns2="http://www.w3.org/2000/09/xmldsig#">
  <evtInfoEmpregador
    Id="ID1005099680001482019022112065500002">
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
        <idePeriodo>
          <iniValid>2017-01</iniValid>
        </idePeriodo>
        <infoCadastro>
          <nmRazao>TRIBUNAL SUPERIOR DO TRABALHO</nmRazao>
          <classTrib>85</classTrib>
          <natJurid>1074</natJurid>
          <indCoop>0</indCoop>
          <indConstr>0</indConstr>
          <indDesFolha>0</indDesFolha>
          <indOptRegEletron>1</indOptRegEletron>
          <indEntEd>N</indEntEd>
          <indEtt>N</indEtt>
          <contato>
            <nmCtt>OBI-WAN KENOBI</nmCtt>
            <cpfCtt>73548085121</cpfCtt>
            <foneFixo>6130000001</foneFixo>
            <foneCel>6190000001</foneCel>
            <email>obiwankenobi@email.com</email>
          </contato>
          <infoOP>
            <nrSiafi>080001</nrSiafi>
          </infoOP>
          <softwareHouse>
            <cnpjSoftHouse>00509968000148</cnpjSoftHouse>
            <nmRazao>TRIBUNAL SUPERIOR DO TRABALHO</nmRazao>
            <nmCont>LUKE SKYWALKER</nmCont>
            <telefone>6130000001</telefone>
            <email>lukeskywalker@email.com</email>
          </softwareHouse>
          <infoComplementares>
            <situacaoPJ>
              <indSitPJ>0</indSitPJ>
            </situacaoPJ>
          </infoComplementares>
        </infoCadastro>
      </inclusao>
    </infoEmpregador>
  </evtInfoEmpregador>
  <Signature xmlns="http://www.w3.org/2000/09/xmldsig#">
    <SignedInfo>
      <CanonicalizationMethod
        Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"></CanonicalizationMethod>
      <SignatureMethod
        Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"></SignatureMethod>
      <Reference URI="">
        <Transforms>
          <Transform
            Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"></Transform>
          <Transform
            Algorithm="http://www.w3.org/TR/2001/REC-xml-c14n-20010315"></Transform>
        </Transforms>
        <DigestMethod
          Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"></DigestMethod>
        <DigestValue>uljgDdxiU1LH3bQ0wfrRxee5sS1UMTVvJgiWVzw0QJ4=</DigestValue>
      </Reference>
    </SignedInfo>
    <SignatureValue>
      Q38XTLXX+2QD4YNulBi9jGHrwMRliRpZPHH6fw==
    </SignatureValue>
    <KeyInfo>
      <X509Data>
        <X509Certificate>
          gvjFmDAwPx0j8CMmH+7UMsUpI5ozwA==
        </X509Certificate>
      </X509Data>
    </KeyInfo>
  </Signature>
</eSocial>
```
