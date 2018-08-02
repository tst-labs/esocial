//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvinicio;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evtTSVInicio">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEmpregador"/>
 *                   &lt;element name="trabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="11"/>
 *                                   &lt;pattern value="\d{11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nisTrab" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="11"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nmTrab">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="sexo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="1"/>
 *                                   &lt;pattern value="[F|M]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="racaCor">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="estCiv" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="grauInstr">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nmSoc" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nascimento">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtNascto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codMunic" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="uf" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="AC"/>
 *                                             &lt;enumeration value="AL"/>
 *                                             &lt;enumeration value="AP"/>
 *                                             &lt;enumeration value="AM"/>
 *                                             &lt;enumeration value="BA"/>
 *                                             &lt;enumeration value="CE"/>
 *                                             &lt;enumeration value="DF"/>
 *                                             &lt;enumeration value="ES"/>
 *                                             &lt;enumeration value="GO"/>
 *                                             &lt;enumeration value="MA"/>
 *                                             &lt;enumeration value="MT"/>
 *                                             &lt;enumeration value="MS"/>
 *                                             &lt;enumeration value="MG"/>
 *                                             &lt;enumeration value="PA"/>
 *                                             &lt;enumeration value="PB"/>
 *                                             &lt;enumeration value="PR"/>
 *                                             &lt;enumeration value="PE"/>
 *                                             &lt;enumeration value="PI"/>
 *                                             &lt;enumeration value="RJ"/>
 *                                             &lt;enumeration value="RN"/>
 *                                             &lt;enumeration value="RS"/>
 *                                             &lt;enumeration value="RO"/>
 *                                             &lt;enumeration value="RR"/>
 *                                             &lt;enumeration value="SC"/>
 *                                             &lt;enumeration value="SP"/>
 *                                             &lt;enumeration value="SE"/>
 *                                             &lt;enumeration value="TO"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="paisNascto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="paisNac">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nmMae" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="2"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nmPai" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="2"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="documentos" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCtps" minOccurs="0"/>
 *                                       &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRic" minOccurs="0"/>
 *                                       &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRg" minOccurs="0"/>
 *                                       &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRne" minOccurs="0"/>
 *                                       &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TOc" minOccurs="0"/>
 *                                       &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCnh" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="endereco">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoBrasil"/>
 *                                         &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoExterior"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TTrabEstrang" minOccurs="0"/>
 *                             &lt;element name="infoDeficiencia" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="defFisica">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="defVisual">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="defAuditiva">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="defMental">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="defIntelectual">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="reabReadap">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="observacao" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
 *                             &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TContato" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoTSVInicio">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cadIni">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="codCateg">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="\d{3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtInicio">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="natAtividade" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoComplementares" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cargoFuncao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codCargo">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="codFuncao" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRemun" minOccurs="0"/>
 *                                       &lt;element name="fgts" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="opcFGTS">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dtOpcFGTS" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoDirigenteSindical" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="categOrig">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;pattern value="\d{3}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="cnpjOrigem" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="\d{8,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dtAdmOrig" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="matricOrig" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoTrabCedido" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCessaoTrab" minOccurs="0"/>
 *                                       &lt;element name="infoEstagiario" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="natEstagio">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nivEstagio">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="areaAtuacao" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nrApol" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrBolsa" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;totalDigits value="14"/>
 *                                                       &lt;fractionDigits value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dtPrevTerm">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="instEnsino">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cnpjInstEnsino" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="14"/>
 *                                                                 &lt;pattern value="\d{8,14}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nmRazao">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="100"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="dscLograd" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="80"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrLograd" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="10"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="bairro" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="cep" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{8}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="codMunic" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="uf" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value="AC"/>
 *                                                                 &lt;enumeration value="AL"/>
 *                                                                 &lt;enumeration value="AP"/>
 *                                                                 &lt;enumeration value="AM"/>
 *                                                                 &lt;enumeration value="BA"/>
 *                                                                 &lt;enumeration value="CE"/>
 *                                                                 &lt;enumeration value="DF"/>
 *                                                                 &lt;enumeration value="ES"/>
 *                                                                 &lt;enumeration value="GO"/>
 *                                                                 &lt;enumeration value="MA"/>
 *                                                                 &lt;enumeration value="MT"/>
 *                                                                 &lt;enumeration value="MS"/>
 *                                                                 &lt;enumeration value="MG"/>
 *                                                                 &lt;enumeration value="PA"/>
 *                                                                 &lt;enumeration value="PB"/>
 *                                                                 &lt;enumeration value="PR"/>
 *                                                                 &lt;enumeration value="PE"/>
 *                                                                 &lt;enumeration value="PI"/>
 *                                                                 &lt;enumeration value="RJ"/>
 *                                                                 &lt;enumeration value="RN"/>
 *                                                                 &lt;enumeration value="RS"/>
 *                                                                 &lt;enumeration value="RO"/>
 *                                                                 &lt;enumeration value="RR"/>
 *                                                                 &lt;enumeration value="SC"/>
 *                                                                 &lt;enumeration value="SP"/>
 *                                                                 &lt;enumeration value="SE"/>
 *                                                                 &lt;enumeration value="TO"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ageIntegracao" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cnpjAgntInteg">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="14"/>
 *                                                                 &lt;pattern value="\d{8,14}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nmRazao">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="100"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="dscLograd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="80"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrLograd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="10"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="bairro" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="cep">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{8}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="codMunic" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="uf">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value="AC"/>
 *                                                                 &lt;enumeration value="AL"/>
 *                                                                 &lt;enumeration value="AP"/>
 *                                                                 &lt;enumeration value="AM"/>
 *                                                                 &lt;enumeration value="BA"/>
 *                                                                 &lt;enumeration value="CE"/>
 *                                                                 &lt;enumeration value="DF"/>
 *                                                                 &lt;enumeration value="ES"/>
 *                                                                 &lt;enumeration value="GO"/>
 *                                                                 &lt;enumeration value="MA"/>
 *                                                                 &lt;enumeration value="MT"/>
 *                                                                 &lt;enumeration value="MS"/>
 *                                                                 &lt;enumeration value="MG"/>
 *                                                                 &lt;enumeration value="PA"/>
 *                                                                 &lt;enumeration value="PB"/>
 *                                                                 &lt;enumeration value="PR"/>
 *                                                                 &lt;enumeration value="PE"/>
 *                                                                 &lt;enumeration value="PI"/>
 *                                                                 &lt;enumeration value="RJ"/>
 *                                                                 &lt;enumeration value="RN"/>
 *                                                                 &lt;enumeration value="RS"/>
 *                                                                 &lt;enumeration value="RO"/>
 *                                                                 &lt;enumeration value="RR"/>
 *                                                                 &lt;enumeration value="SC"/>
 *                                                                 &lt;enumeration value="SP"/>
 *                                                                 &lt;enumeration value="SE"/>
 *                                                                 &lt;enumeration value="TO"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="supervisorEstagio" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cpfSupervisor">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="11"/>
 *                                                                 &lt;pattern value="\d{11}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nmSuperv">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="70"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="afastamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIniAfast">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codMotAfast">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="2"/>
 *                                             &lt;pattern value="\d{2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="termino" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtTerm">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evtTSVInicio",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtTSVInicio evtTSVInicio;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTSVInicio.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTSVInicio }
     *     
     */
    public ESocial.EvtTSVInicio getEvtTSVInicio() {
        return evtTSVInicio;
    }

    /**
     * Define o valor da propriedade evtTSVInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTSVInicio }
     *     
     */
    public void setEvtTSVInicio(ESocial.EvtTSVInicio value) {
        this.evtTSVInicio = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEmpregador"/>
     *         &lt;element name="trabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="11"/>
     *                         &lt;pattern value="\d{11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nisTrab" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="11"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nmTrab">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="sexo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="1"/>
     *                         &lt;pattern value="[F|M]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="racaCor">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="estCiv" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="grauInstr">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nmSoc" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nascimento">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtNascto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codMunic" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="uf" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="AC"/>
     *                                   &lt;enumeration value="AL"/>
     *                                   &lt;enumeration value="AP"/>
     *                                   &lt;enumeration value="AM"/>
     *                                   &lt;enumeration value="BA"/>
     *                                   &lt;enumeration value="CE"/>
     *                                   &lt;enumeration value="DF"/>
     *                                   &lt;enumeration value="ES"/>
     *                                   &lt;enumeration value="GO"/>
     *                                   &lt;enumeration value="MA"/>
     *                                   &lt;enumeration value="MT"/>
     *                                   &lt;enumeration value="MS"/>
     *                                   &lt;enumeration value="MG"/>
     *                                   &lt;enumeration value="PA"/>
     *                                   &lt;enumeration value="PB"/>
     *                                   &lt;enumeration value="PR"/>
     *                                   &lt;enumeration value="PE"/>
     *                                   &lt;enumeration value="PI"/>
     *                                   &lt;enumeration value="RJ"/>
     *                                   &lt;enumeration value="RN"/>
     *                                   &lt;enumeration value="RS"/>
     *                                   &lt;enumeration value="RO"/>
     *                                   &lt;enumeration value="RR"/>
     *                                   &lt;enumeration value="SC"/>
     *                                   &lt;enumeration value="SP"/>
     *                                   &lt;enumeration value="SE"/>
     *                                   &lt;enumeration value="TO"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="paisNascto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="paisNac">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nmMae" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="2"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nmPai" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="2"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="documentos" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCtps" minOccurs="0"/>
     *                             &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRic" minOccurs="0"/>
     *                             &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRg" minOccurs="0"/>
     *                             &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRne" minOccurs="0"/>
     *                             &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TOc" minOccurs="0"/>
     *                             &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCnh" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="endereco">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoBrasil"/>
     *                               &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoExterior"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TTrabEstrang" minOccurs="0"/>
     *                   &lt;element name="infoDeficiencia" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="defFisica">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="defVisual">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="defAuditiva">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="defMental">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="defIntelectual">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="reabReadap">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="observacao" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
     *                   &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TContato" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoTSVInicio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cadIni">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="codCateg">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="\d{3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtInicio">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="natAtividade" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoComplementares" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cargoFuncao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codCargo">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="codFuncao" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRemun" minOccurs="0"/>
     *                             &lt;element name="fgts" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="opcFGTS">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dtOpcFGTS" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoDirigenteSindical" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="categOrig">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;pattern value="\d{3}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="cnpjOrigem" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="\d{8,14}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dtAdmOrig" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="matricOrig" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoTrabCedido" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCessaoTrab" minOccurs="0"/>
     *                             &lt;element name="infoEstagiario" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="natEstagio">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nivEstagio">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="areaAtuacao" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;whiteSpace value="preserve"/>
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nrApol" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;whiteSpace value="preserve"/>
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="vlrBolsa" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;totalDigits value="14"/>
     *                                             &lt;fractionDigits value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dtPrevTerm">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="instEnsino">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cnpjInstEnsino" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;length value="14"/>
     *                                                       &lt;pattern value="\d{8,14}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nmRazao">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="100"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="dscLograd" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="80"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nrLograd" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="10"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="bairro" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="cep" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{8}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="codMunic" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="uf" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;enumeration value="AC"/>
     *                                                       &lt;enumeration value="AL"/>
     *                                                       &lt;enumeration value="AP"/>
     *                                                       &lt;enumeration value="AM"/>
     *                                                       &lt;enumeration value="BA"/>
     *                                                       &lt;enumeration value="CE"/>
     *                                                       &lt;enumeration value="DF"/>
     *                                                       &lt;enumeration value="ES"/>
     *                                                       &lt;enumeration value="GO"/>
     *                                                       &lt;enumeration value="MA"/>
     *                                                       &lt;enumeration value="MT"/>
     *                                                       &lt;enumeration value="MS"/>
     *                                                       &lt;enumeration value="MG"/>
     *                                                       &lt;enumeration value="PA"/>
     *                                                       &lt;enumeration value="PB"/>
     *                                                       &lt;enumeration value="PR"/>
     *                                                       &lt;enumeration value="PE"/>
     *                                                       &lt;enumeration value="PI"/>
     *                                                       &lt;enumeration value="RJ"/>
     *                                                       &lt;enumeration value="RN"/>
     *                                                       &lt;enumeration value="RS"/>
     *                                                       &lt;enumeration value="RO"/>
     *                                                       &lt;enumeration value="RR"/>
     *                                                       &lt;enumeration value="SC"/>
     *                                                       &lt;enumeration value="SP"/>
     *                                                       &lt;enumeration value="SE"/>
     *                                                       &lt;enumeration value="TO"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ageIntegracao" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cnpjAgntInteg">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;length value="14"/>
     *                                                       &lt;pattern value="\d{8,14}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nmRazao">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="100"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="dscLograd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="80"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nrLograd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="10"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="bairro" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="cep">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{8}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="codMunic" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="uf">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;enumeration value="AC"/>
     *                                                       &lt;enumeration value="AL"/>
     *                                                       &lt;enumeration value="AP"/>
     *                                                       &lt;enumeration value="AM"/>
     *                                                       &lt;enumeration value="BA"/>
     *                                                       &lt;enumeration value="CE"/>
     *                                                       &lt;enumeration value="DF"/>
     *                                                       &lt;enumeration value="ES"/>
     *                                                       &lt;enumeration value="GO"/>
     *                                                       &lt;enumeration value="MA"/>
     *                                                       &lt;enumeration value="MT"/>
     *                                                       &lt;enumeration value="MS"/>
     *                                                       &lt;enumeration value="MG"/>
     *                                                       &lt;enumeration value="PA"/>
     *                                                       &lt;enumeration value="PB"/>
     *                                                       &lt;enumeration value="PR"/>
     *                                                       &lt;enumeration value="PE"/>
     *                                                       &lt;enumeration value="PI"/>
     *                                                       &lt;enumeration value="RJ"/>
     *                                                       &lt;enumeration value="RN"/>
     *                                                       &lt;enumeration value="RS"/>
     *                                                       &lt;enumeration value="RO"/>
     *                                                       &lt;enumeration value="RR"/>
     *                                                       &lt;enumeration value="SC"/>
     *                                                       &lt;enumeration value="SP"/>
     *                                                       &lt;enumeration value="SE"/>
     *                                                       &lt;enumeration value="TO"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="supervisorEstagio" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cpfSupervisor">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;length value="11"/>
     *                                                       &lt;pattern value="\d{11}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nmSuperv">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="70"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="afastamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIniAfast">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codMotAfast">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="2"/>
     *                                   &lt;pattern value="\d{2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="termino" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtTerm">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "trabalhador",
        "infoTSVInicio"
    })
    public static class EvtTSVInicio {

        @XmlElement(required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtTSVInicio.Trabalhador trabalhador;
        @XmlElement(required = true)
        protected ESocial.EvtTSVInicio.InfoTSVInicio infoTSVInicio;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEveTrab }
         *     
         */
        public TIdeEveTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEveTrab }
         *     
         */
        public void setIdeEvento(TIdeEveTrab value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TEmpregador }
         *     
         */
        public TEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TEmpregador }
         *     
         */
        public void setIdeEmpregador(TEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade trabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTSVInicio.Trabalhador }
         *     
         */
        public ESocial.EvtTSVInicio.Trabalhador getTrabalhador() {
            return trabalhador;
        }

        /**
         * Define o valor da propriedade trabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTSVInicio.Trabalhador }
         *     
         */
        public void setTrabalhador(ESocial.EvtTSVInicio.Trabalhador value) {
            this.trabalhador = value;
        }

        /**
         * Obtém o valor da propriedade infoTSVInicio.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTSVInicio.InfoTSVInicio }
         *     
         */
        public ESocial.EvtTSVInicio.InfoTSVInicio getInfoTSVInicio() {
            return infoTSVInicio;
        }

        /**
         * Define o valor da propriedade infoTSVInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTSVInicio.InfoTSVInicio }
         *     
         */
        public void setInfoTSVInicio(ESocial.EvtTSVInicio.InfoTSVInicio value) {
            this.infoTSVInicio = value;
        }

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cadIni">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="codCateg">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;pattern value="\d{3}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtInicio">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="natAtividade" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infoComplementares" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cargoFuncao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codCargo">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="codFuncao" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRemun" minOccurs="0"/>
         *                   &lt;element name="fgts" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="opcFGTS">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dtOpcFGTS" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoDirigenteSindical" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="categOrig">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;pattern value="\d{3}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="cnpjOrigem" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="\d{8,14}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dtAdmOrig" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="matricOrig" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoTrabCedido" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCessaoTrab" minOccurs="0"/>
         *                   &lt;element name="infoEstagiario" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="natEstagio">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nivEstagio">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="areaAtuacao" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nrApol" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="vlrBolsa" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;totalDigits value="14"/>
         *                                   &lt;fractionDigits value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dtPrevTerm">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="instEnsino">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cnpjInstEnsino" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;length value="14"/>
         *                                             &lt;pattern value="\d{8,14}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nmRazao">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="100"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="dscLograd" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="80"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nrLograd" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="10"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="bairro" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="cep" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{8}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="codMunic" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="uf" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;enumeration value="AC"/>
         *                                             &lt;enumeration value="AL"/>
         *                                             &lt;enumeration value="AP"/>
         *                                             &lt;enumeration value="AM"/>
         *                                             &lt;enumeration value="BA"/>
         *                                             &lt;enumeration value="CE"/>
         *                                             &lt;enumeration value="DF"/>
         *                                             &lt;enumeration value="ES"/>
         *                                             &lt;enumeration value="GO"/>
         *                                             &lt;enumeration value="MA"/>
         *                                             &lt;enumeration value="MT"/>
         *                                             &lt;enumeration value="MS"/>
         *                                             &lt;enumeration value="MG"/>
         *                                             &lt;enumeration value="PA"/>
         *                                             &lt;enumeration value="PB"/>
         *                                             &lt;enumeration value="PR"/>
         *                                             &lt;enumeration value="PE"/>
         *                                             &lt;enumeration value="PI"/>
         *                                             &lt;enumeration value="RJ"/>
         *                                             &lt;enumeration value="RN"/>
         *                                             &lt;enumeration value="RS"/>
         *                                             &lt;enumeration value="RO"/>
         *                                             &lt;enumeration value="RR"/>
         *                                             &lt;enumeration value="SC"/>
         *                                             &lt;enumeration value="SP"/>
         *                                             &lt;enumeration value="SE"/>
         *                                             &lt;enumeration value="TO"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ageIntegracao" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cnpjAgntInteg">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;length value="14"/>
         *                                             &lt;pattern value="\d{8,14}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nmRazao">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="100"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="dscLograd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="80"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nrLograd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="10"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="bairro" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="cep">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{8}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="codMunic" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="uf">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;enumeration value="AC"/>
         *                                             &lt;enumeration value="AL"/>
         *                                             &lt;enumeration value="AP"/>
         *                                             &lt;enumeration value="AM"/>
         *                                             &lt;enumeration value="BA"/>
         *                                             &lt;enumeration value="CE"/>
         *                                             &lt;enumeration value="DF"/>
         *                                             &lt;enumeration value="ES"/>
         *                                             &lt;enumeration value="GO"/>
         *                                             &lt;enumeration value="MA"/>
         *                                             &lt;enumeration value="MT"/>
         *                                             &lt;enumeration value="MS"/>
         *                                             &lt;enumeration value="MG"/>
         *                                             &lt;enumeration value="PA"/>
         *                                             &lt;enumeration value="PB"/>
         *                                             &lt;enumeration value="PR"/>
         *                                             &lt;enumeration value="PE"/>
         *                                             &lt;enumeration value="PI"/>
         *                                             &lt;enumeration value="RJ"/>
         *                                             &lt;enumeration value="RN"/>
         *                                             &lt;enumeration value="RS"/>
         *                                             &lt;enumeration value="RO"/>
         *                                             &lt;enumeration value="RR"/>
         *                                             &lt;enumeration value="SC"/>
         *                                             &lt;enumeration value="SP"/>
         *                                             &lt;enumeration value="SE"/>
         *                                             &lt;enumeration value="TO"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="supervisorEstagio" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cpfSupervisor">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;length value="11"/>
         *                                             &lt;pattern value="\d{11}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nmSuperv">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="70"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="afastamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIniAfast">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codMotAfast">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="2"/>
         *                         &lt;pattern value="\d{2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="termino" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtTerm">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cadIni",
            "codCateg",
            "dtInicio",
            "natAtividade",
            "infoComplementares",
            "afastamento",
            "termino"
        })
        public static class InfoTSVInicio {

            @XmlElement(required = true)
            protected String cadIni;
            @XmlElement(required = true)
            protected BigInteger codCateg;
            @XmlElement(required = true)
            protected XMLGregorianCalendar dtInicio;
            protected Byte natAtividade;
            protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares infoComplementares;
            protected ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento afastamento;
            protected ESocial.EvtTSVInicio.InfoTSVInicio.Termino termino;

            /**
             * Obtém o valor da propriedade cadIni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCadIni() {
                return cadIni;
            }

            /**
             * Define o valor da propriedade cadIni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCadIni(String value) {
                this.cadIni = value;
            }

            /**
             * Obtém o valor da propriedade codCateg.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodCateg() {
                return codCateg;
            }

            /**
             * Define o valor da propriedade codCateg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodCateg(BigInteger value) {
                this.codCateg = value;
            }

            /**
             * Obtém o valor da propriedade dtInicio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtInicio() {
                return dtInicio;
            }

            /**
             * Define o valor da propriedade dtInicio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtInicio(XMLGregorianCalendar value) {
                this.dtInicio = value;
            }

            /**
             * Obtém o valor da propriedade natAtividade.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getNatAtividade() {
                return natAtividade;
            }

            /**
             * Define o valor da propriedade natAtividade.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setNatAtividade(Byte value) {
                this.natAtividade = value;
            }

            /**
             * Obtém o valor da propriedade infoComplementares.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares }
             *     
             */
            public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares getInfoComplementares() {
                return infoComplementares;
            }

            /**
             * Define o valor da propriedade infoComplementares.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares }
             *     
             */
            public void setInfoComplementares(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares value) {
                this.infoComplementares = value;
            }

            /**
             * Obtém o valor da propriedade afastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento }
             *     
             */
            public ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento getAfastamento() {
                return afastamento;
            }

            /**
             * Define o valor da propriedade afastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento }
             *     
             */
            public void setAfastamento(ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento value) {
                this.afastamento = value;
            }

            /**
             * Obtém o valor da propriedade termino.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Termino }
             *     
             */
            public ESocial.EvtTSVInicio.InfoTSVInicio.Termino getTermino() {
                return termino;
            }

            /**
             * Define o valor da propriedade termino.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Termino }
             *     
             */
            public void setTermino(ESocial.EvtTSVInicio.InfoTSVInicio.Termino value) {
                this.termino = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="dtIniAfast">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codMotAfast">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="2"/>
             *               &lt;pattern value="\d{2}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dtIniAfast",
                "codMotAfast"
            })
            public static class Afastamento {

                @XmlElement(required = true)
                protected XMLGregorianCalendar dtIniAfast;
                @XmlElement(required = true)
                protected String codMotAfast;

                /**
                 * Obtém o valor da propriedade dtIniAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIniAfast() {
                    return dtIniAfast;
                }

                /**
                 * Define o valor da propriedade dtIniAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIniAfast(XMLGregorianCalendar value) {
                    this.dtIniAfast = value;
                }

                /**
                 * Obtém o valor da propriedade codMotAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodMotAfast() {
                    return codMotAfast;
                }

                /**
                 * Define o valor da propriedade codMotAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodMotAfast(String value) {
                    this.codMotAfast = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="cargoFuncao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codCargo">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="codFuncao" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRemun" minOccurs="0"/>
             *         &lt;element name="fgts" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="opcFGTS">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dtOpcFGTS" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoDirigenteSindical" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="categOrig">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;pattern value="\d{3}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="cnpjOrigem" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="\d{8,14}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dtAdmOrig" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="matricOrig" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoTrabCedido" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCessaoTrab" minOccurs="0"/>
             *         &lt;element name="infoEstagiario" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="natEstagio">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nivEstagio">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="areaAtuacao" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nrApol" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="vlrBolsa" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;totalDigits value="14"/>
             *                         &lt;fractionDigits value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dtPrevTerm">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="instEnsino">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cnpjInstEnsino" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;length value="14"/>
             *                                   &lt;pattern value="\d{8,14}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nmRazao">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="100"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="dscLograd" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="80"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nrLograd" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="10"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="bairro" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="cep" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{8}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="codMunic" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="uf" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;enumeration value="AC"/>
             *                                   &lt;enumeration value="AL"/>
             *                                   &lt;enumeration value="AP"/>
             *                                   &lt;enumeration value="AM"/>
             *                                   &lt;enumeration value="BA"/>
             *                                   &lt;enumeration value="CE"/>
             *                                   &lt;enumeration value="DF"/>
             *                                   &lt;enumeration value="ES"/>
             *                                   &lt;enumeration value="GO"/>
             *                                   &lt;enumeration value="MA"/>
             *                                   &lt;enumeration value="MT"/>
             *                                   &lt;enumeration value="MS"/>
             *                                   &lt;enumeration value="MG"/>
             *                                   &lt;enumeration value="PA"/>
             *                                   &lt;enumeration value="PB"/>
             *                                   &lt;enumeration value="PR"/>
             *                                   &lt;enumeration value="PE"/>
             *                                   &lt;enumeration value="PI"/>
             *                                   &lt;enumeration value="RJ"/>
             *                                   &lt;enumeration value="RN"/>
             *                                   &lt;enumeration value="RS"/>
             *                                   &lt;enumeration value="RO"/>
             *                                   &lt;enumeration value="RR"/>
             *                                   &lt;enumeration value="SC"/>
             *                                   &lt;enumeration value="SP"/>
             *                                   &lt;enumeration value="SE"/>
             *                                   &lt;enumeration value="TO"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ageIntegracao" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cnpjAgntInteg">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;length value="14"/>
             *                                   &lt;pattern value="\d{8,14}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nmRazao">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="100"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="dscLograd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="80"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nrLograd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="10"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="bairro" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="cep">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{8}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="codMunic" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="uf">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;enumeration value="AC"/>
             *                                   &lt;enumeration value="AL"/>
             *                                   &lt;enumeration value="AP"/>
             *                                   &lt;enumeration value="AM"/>
             *                                   &lt;enumeration value="BA"/>
             *                                   &lt;enumeration value="CE"/>
             *                                   &lt;enumeration value="DF"/>
             *                                   &lt;enumeration value="ES"/>
             *                                   &lt;enumeration value="GO"/>
             *                                   &lt;enumeration value="MA"/>
             *                                   &lt;enumeration value="MT"/>
             *                                   &lt;enumeration value="MS"/>
             *                                   &lt;enumeration value="MG"/>
             *                                   &lt;enumeration value="PA"/>
             *                                   &lt;enumeration value="PB"/>
             *                                   &lt;enumeration value="PR"/>
             *                                   &lt;enumeration value="PE"/>
             *                                   &lt;enumeration value="PI"/>
             *                                   &lt;enumeration value="RJ"/>
             *                                   &lt;enumeration value="RN"/>
             *                                   &lt;enumeration value="RS"/>
             *                                   &lt;enumeration value="RO"/>
             *                                   &lt;enumeration value="RR"/>
             *                                   &lt;enumeration value="SC"/>
             *                                   &lt;enumeration value="SP"/>
             *                                   &lt;enumeration value="SE"/>
             *                                   &lt;enumeration value="TO"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="supervisorEstagio" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cpfSupervisor">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;length value="11"/>
             *                                   &lt;pattern value="\d{11}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nmSuperv">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="70"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cargoFuncao",
                "remuneracao",
                "fgts",
                "infoDirigenteSindical",
                "infoTrabCedido",
                "infoEstagiario"
            })
            public static class InfoComplementares {

                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao cargoFuncao;
                protected TRemun remuneracao;
                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.Fgts fgts;
                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical infoDirigenteSindical;
                protected TCessaoTrab infoTrabCedido;
                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario infoEstagiario;

                /**
                 * Obtém o valor da propriedade cargoFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao getCargoFuncao() {
                    return cargoFuncao;
                }

                /**
                 * Define o valor da propriedade cargoFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao }
                 *     
                 */
                public void setCargoFuncao(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao value) {
                    this.cargoFuncao = value;
                }

                /**
                 * Obtém o valor da propriedade remuneracao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRemun }
                 *     
                 */
                public TRemun getRemuneracao() {
                    return remuneracao;
                }

                /**
                 * Define o valor da propriedade remuneracao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRemun }
                 *     
                 */
                public void setRemuneracao(TRemun value) {
                    this.remuneracao = value;
                }

                /**
                 * Obtém o valor da propriedade fgts.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.Fgts }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.Fgts getFgts() {
                    return fgts;
                }

                /**
                 * Define o valor da propriedade fgts.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.Fgts }
                 *     
                 */
                public void setFgts(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.Fgts value) {
                    this.fgts = value;
                }

                /**
                 * Obtém o valor da propriedade infoDirigenteSindical.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical getInfoDirigenteSindical() {
                    return infoDirigenteSindical;
                }

                /**
                 * Define o valor da propriedade infoDirigenteSindical.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical }
                 *     
                 */
                public void setInfoDirigenteSindical(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical value) {
                    this.infoDirigenteSindical = value;
                }

                /**
                 * Obtém o valor da propriedade infoTrabCedido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCessaoTrab }
                 *     
                 */
                public TCessaoTrab getInfoTrabCedido() {
                    return infoTrabCedido;
                }

                /**
                 * Define o valor da propriedade infoTrabCedido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCessaoTrab }
                 *     
                 */
                public void setInfoTrabCedido(TCessaoTrab value) {
                    this.infoTrabCedido = value;
                }

                /**
                 * Obtém o valor da propriedade infoEstagiario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario getInfoEstagiario() {
                    return infoEstagiario;
                }

                /**
                 * Define o valor da propriedade infoEstagiario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario }
                 *     
                 */
                public void setInfoEstagiario(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario value) {
                    this.infoEstagiario = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="codCargo">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="codFuncao" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codCargo",
                    "codFuncao"
                })
                public static class CargoFuncao {

                    @XmlElement(required = true)
                    protected String codCargo;
                    protected String codFuncao;

                    /**
                     * Obtém o valor da propriedade codCargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodCargo() {
                        return codCargo;
                    }

                    /**
                     * Define o valor da propriedade codCargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodCargo(String value) {
                        this.codCargo = value;
                    }

                    /**
                     * Obtém o valor da propriedade codFuncao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodFuncao() {
                        return codFuncao;
                    }

                    /**
                     * Define o valor da propriedade codFuncao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodFuncao(String value) {
                        this.codFuncao = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="opcFGTS">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtOpcFGTS" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "opcFGTS",
                    "dtOpcFGTS"
                })
                public static class Fgts {

                    @XmlElement(required = true)
                    protected BigInteger opcFGTS;
                    protected XMLGregorianCalendar dtOpcFGTS;

                    /**
                     * Obtém o valor da propriedade opcFGTS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOpcFGTS() {
                        return opcFGTS;
                    }

                    /**
                     * Define o valor da propriedade opcFGTS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOpcFGTS(BigInteger value) {
                        this.opcFGTS = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtOpcFGTS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtOpcFGTS() {
                        return dtOpcFGTS;
                    }

                    /**
                     * Define o valor da propriedade dtOpcFGTS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtOpcFGTS(XMLGregorianCalendar value) {
                        this.dtOpcFGTS = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="categOrig">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;pattern value="\d{3}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cnpjOrigem" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="\d{8,14}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtAdmOrig" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="matricOrig" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "categOrig",
                    "cnpjOrigem",
                    "dtAdmOrig",
                    "matricOrig"
                })
                public static class InfoDirigenteSindical {

                    @XmlElement(required = true)
                    protected BigInteger categOrig;
                    protected String cnpjOrigem;
                    protected XMLGregorianCalendar dtAdmOrig;
                    protected String matricOrig;

                    /**
                     * Obtém o valor da propriedade categOrig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCategOrig() {
                        return categOrig;
                    }

                    /**
                     * Define o valor da propriedade categOrig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCategOrig(BigInteger value) {
                        this.categOrig = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnpjOrigem.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjOrigem() {
                        return cnpjOrigem;
                    }

                    /**
                     * Define o valor da propriedade cnpjOrigem.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjOrigem(String value) {
                        this.cnpjOrigem = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtAdmOrig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtAdmOrig() {
                        return dtAdmOrig;
                    }

                    /**
                     * Define o valor da propriedade dtAdmOrig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtAdmOrig(XMLGregorianCalendar value) {
                        this.dtAdmOrig = value;
                    }

                    /**
                     * Obtém o valor da propriedade matricOrig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMatricOrig() {
                        return matricOrig;
                    }

                    /**
                     * Define o valor da propriedade matricOrig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMatricOrig(String value) {
                        this.matricOrig = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="natEstagio">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nivEstagio">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="areaAtuacao" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nrApol" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vlrBolsa" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;totalDigits value="14"/>
                 *               &lt;fractionDigits value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtPrevTerm">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="instEnsino">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cnpjInstEnsino" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;length value="14"/>
                 *                         &lt;pattern value="\d{8,14}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nmRazao">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="100"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="dscLograd" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="80"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nrLograd" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="10"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="bairro" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="cep" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{8}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="codMunic" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="uf" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;enumeration value="AC"/>
                 *                         &lt;enumeration value="AL"/>
                 *                         &lt;enumeration value="AP"/>
                 *                         &lt;enumeration value="AM"/>
                 *                         &lt;enumeration value="BA"/>
                 *                         &lt;enumeration value="CE"/>
                 *                         &lt;enumeration value="DF"/>
                 *                         &lt;enumeration value="ES"/>
                 *                         &lt;enumeration value="GO"/>
                 *                         &lt;enumeration value="MA"/>
                 *                         &lt;enumeration value="MT"/>
                 *                         &lt;enumeration value="MS"/>
                 *                         &lt;enumeration value="MG"/>
                 *                         &lt;enumeration value="PA"/>
                 *                         &lt;enumeration value="PB"/>
                 *                         &lt;enumeration value="PR"/>
                 *                         &lt;enumeration value="PE"/>
                 *                         &lt;enumeration value="PI"/>
                 *                         &lt;enumeration value="RJ"/>
                 *                         &lt;enumeration value="RN"/>
                 *                         &lt;enumeration value="RS"/>
                 *                         &lt;enumeration value="RO"/>
                 *                         &lt;enumeration value="RR"/>
                 *                         &lt;enumeration value="SC"/>
                 *                         &lt;enumeration value="SP"/>
                 *                         &lt;enumeration value="SE"/>
                 *                         &lt;enumeration value="TO"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ageIntegracao" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cnpjAgntInteg">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;length value="14"/>
                 *                         &lt;pattern value="\d{8,14}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nmRazao">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="100"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="dscLograd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="80"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nrLograd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="10"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="bairro" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="cep">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{8}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="codMunic" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="uf">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;enumeration value="AC"/>
                 *                         &lt;enumeration value="AL"/>
                 *                         &lt;enumeration value="AP"/>
                 *                         &lt;enumeration value="AM"/>
                 *                         &lt;enumeration value="BA"/>
                 *                         &lt;enumeration value="CE"/>
                 *                         &lt;enumeration value="DF"/>
                 *                         &lt;enumeration value="ES"/>
                 *                         &lt;enumeration value="GO"/>
                 *                         &lt;enumeration value="MA"/>
                 *                         &lt;enumeration value="MT"/>
                 *                         &lt;enumeration value="MS"/>
                 *                         &lt;enumeration value="MG"/>
                 *                         &lt;enumeration value="PA"/>
                 *                         &lt;enumeration value="PB"/>
                 *                         &lt;enumeration value="PR"/>
                 *                         &lt;enumeration value="PE"/>
                 *                         &lt;enumeration value="PI"/>
                 *                         &lt;enumeration value="RJ"/>
                 *                         &lt;enumeration value="RN"/>
                 *                         &lt;enumeration value="RS"/>
                 *                         &lt;enumeration value="RO"/>
                 *                         &lt;enumeration value="RR"/>
                 *                         &lt;enumeration value="SC"/>
                 *                         &lt;enumeration value="SP"/>
                 *                         &lt;enumeration value="SE"/>
                 *                         &lt;enumeration value="TO"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="supervisorEstagio" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cpfSupervisor">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;length value="11"/>
                 *                         &lt;pattern value="\d{11}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nmSuperv">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="70"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "natEstagio",
                    "nivEstagio",
                    "areaAtuacao",
                    "nrApol",
                    "vlrBolsa",
                    "dtPrevTerm",
                    "instEnsino",
                    "ageIntegracao",
                    "supervisorEstagio"
                })
                public static class InfoEstagiario {

                    @XmlElement(required = true)
                    protected String natEstagio;
                    protected byte nivEstagio;
                    protected String areaAtuacao;
                    protected String nrApol;
                    protected BigDecimal vlrBolsa;
                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dtPrevTerm;
                    @XmlElement(required = true)
                    protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.InstEnsino instEnsino;
                    protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.AgeIntegracao ageIntegracao;
                    protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.SupervisorEstagio supervisorEstagio;

                    /**
                     * Obtém o valor da propriedade natEstagio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNatEstagio() {
                        return natEstagio;
                    }

                    /**
                     * Define o valor da propriedade natEstagio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNatEstagio(String value) {
                        this.natEstagio = value;
                    }

                    /**
                     * Obtém o valor da propriedade nivEstagio.
                     * 
                     */
                    public byte getNivEstagio() {
                        return nivEstagio;
                    }

                    /**
                     * Define o valor da propriedade nivEstagio.
                     * 
                     */
                    public void setNivEstagio(byte value) {
                        this.nivEstagio = value;
                    }

                    /**
                     * Obtém o valor da propriedade areaAtuacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAreaAtuacao() {
                        return areaAtuacao;
                    }

                    /**
                     * Define o valor da propriedade areaAtuacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAreaAtuacao(String value) {
                        this.areaAtuacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrApol.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrApol() {
                        return nrApol;
                    }

                    /**
                     * Define o valor da propriedade nrApol.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrApol(String value) {
                        this.nrApol = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrBolsa.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrBolsa() {
                        return vlrBolsa;
                    }

                    /**
                     * Define o valor da propriedade vlrBolsa.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrBolsa(BigDecimal value) {
                        this.vlrBolsa = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtPrevTerm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtPrevTerm() {
                        return dtPrevTerm;
                    }

                    /**
                     * Define o valor da propriedade dtPrevTerm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtPrevTerm(XMLGregorianCalendar value) {
                        this.dtPrevTerm = value;
                    }

                    /**
                     * Obtém o valor da propriedade instEnsino.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.InstEnsino }
                     *     
                     */
                    public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.InstEnsino getInstEnsino() {
                        return instEnsino;
                    }

                    /**
                     * Define o valor da propriedade instEnsino.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.InstEnsino }
                     *     
                     */
                    public void setInstEnsino(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.InstEnsino value) {
                        this.instEnsino = value;
                    }

                    /**
                     * Obtém o valor da propriedade ageIntegracao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.AgeIntegracao }
                     *     
                     */
                    public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.AgeIntegracao getAgeIntegracao() {
                        return ageIntegracao;
                    }

                    /**
                     * Define o valor da propriedade ageIntegracao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.AgeIntegracao }
                     *     
                     */
                    public void setAgeIntegracao(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.AgeIntegracao value) {
                        this.ageIntegracao = value;
                    }

                    /**
                     * Obtém o valor da propriedade supervisorEstagio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.SupervisorEstagio }
                     *     
                     */
                    public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.SupervisorEstagio getSupervisorEstagio() {
                        return supervisorEstagio;
                    }

                    /**
                     * Define o valor da propriedade supervisorEstagio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.SupervisorEstagio }
                     *     
                     */
                    public void setSupervisorEstagio(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoEstagiario.SupervisorEstagio value) {
                        this.supervisorEstagio = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="cnpjAgntInteg">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;length value="14"/>
                     *               &lt;pattern value="\d{8,14}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nmRazao">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="100"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="dscLograd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="80"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nrLograd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="10"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="bairro" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="cep">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{8}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="codMunic" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="uf">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;enumeration value="AC"/>
                     *               &lt;enumeration value="AL"/>
                     *               &lt;enumeration value="AP"/>
                     *               &lt;enumeration value="AM"/>
                     *               &lt;enumeration value="BA"/>
                     *               &lt;enumeration value="CE"/>
                     *               &lt;enumeration value="DF"/>
                     *               &lt;enumeration value="ES"/>
                     *               &lt;enumeration value="GO"/>
                     *               &lt;enumeration value="MA"/>
                     *               &lt;enumeration value="MT"/>
                     *               &lt;enumeration value="MS"/>
                     *               &lt;enumeration value="MG"/>
                     *               &lt;enumeration value="PA"/>
                     *               &lt;enumeration value="PB"/>
                     *               &lt;enumeration value="PR"/>
                     *               &lt;enumeration value="PE"/>
                     *               &lt;enumeration value="PI"/>
                     *               &lt;enumeration value="RJ"/>
                     *               &lt;enumeration value="RN"/>
                     *               &lt;enumeration value="RS"/>
                     *               &lt;enumeration value="RO"/>
                     *               &lt;enumeration value="RR"/>
                     *               &lt;enumeration value="SC"/>
                     *               &lt;enumeration value="SP"/>
                     *               &lt;enumeration value="SE"/>
                     *               &lt;enumeration value="TO"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cnpjAgntInteg",
                        "nmRazao",
                        "dscLograd",
                        "nrLograd",
                        "bairro",
                        "cep",
                        "codMunic",
                        "uf"
                    })
                    public static class AgeIntegracao {

                        @XmlElement(required = true)
                        protected String cnpjAgntInteg;
                        @XmlElement(required = true)
                        protected String nmRazao;
                        @XmlElement(required = true)
                        protected String dscLograd;
                        @XmlElement(required = true)
                        protected String nrLograd;
                        protected String bairro;
                        @XmlElement(required = true)
                        protected String cep;
                        protected BigInteger codMunic;
                        @XmlElement(required = true)
                        protected String uf;

                        /**
                         * Obtém o valor da propriedade cnpjAgntInteg.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnpjAgntInteg() {
                            return cnpjAgntInteg;
                        }

                        /**
                         * Define o valor da propriedade cnpjAgntInteg.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnpjAgntInteg(String value) {
                            this.cnpjAgntInteg = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmRazao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmRazao() {
                            return nmRazao;
                        }

                        /**
                         * Define o valor da propriedade nmRazao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmRazao(String value) {
                            this.nmRazao = value;
                        }

                        /**
                         * Obtém o valor da propriedade dscLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDscLograd() {
                            return dscLograd;
                        }

                        /**
                         * Define o valor da propriedade dscLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDscLograd(String value) {
                            this.dscLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrLograd() {
                            return nrLograd;
                        }

                        /**
                         * Define o valor da propriedade nrLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrLograd(String value) {
                            this.nrLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade bairro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBairro() {
                            return bairro;
                        }

                        /**
                         * Define o valor da propriedade bairro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBairro(String value) {
                            this.bairro = value;
                        }

                        /**
                         * Obtém o valor da propriedade cep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCep() {
                            return cep;
                        }

                        /**
                         * Define o valor da propriedade cep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCep(String value) {
                            this.cep = value;
                        }

                        /**
                         * Obtém o valor da propriedade codMunic.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCodMunic() {
                            return codMunic;
                        }

                        /**
                         * Define o valor da propriedade codMunic.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCodMunic(BigInteger value) {
                            this.codMunic = value;
                        }

                        /**
                         * Obtém o valor da propriedade uf.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUf() {
                            return uf;
                        }

                        /**
                         * Define o valor da propriedade uf.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUf(String value) {
                            this.uf = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="cnpjInstEnsino" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;length value="14"/>
                     *               &lt;pattern value="\d{8,14}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nmRazao">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="100"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="dscLograd" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="80"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nrLograd" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="10"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="bairro" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="cep" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{8}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="codMunic" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="uf" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;enumeration value="AC"/>
                     *               &lt;enumeration value="AL"/>
                     *               &lt;enumeration value="AP"/>
                     *               &lt;enumeration value="AM"/>
                     *               &lt;enumeration value="BA"/>
                     *               &lt;enumeration value="CE"/>
                     *               &lt;enumeration value="DF"/>
                     *               &lt;enumeration value="ES"/>
                     *               &lt;enumeration value="GO"/>
                     *               &lt;enumeration value="MA"/>
                     *               &lt;enumeration value="MT"/>
                     *               &lt;enumeration value="MS"/>
                     *               &lt;enumeration value="MG"/>
                     *               &lt;enumeration value="PA"/>
                     *               &lt;enumeration value="PB"/>
                     *               &lt;enumeration value="PR"/>
                     *               &lt;enumeration value="PE"/>
                     *               &lt;enumeration value="PI"/>
                     *               &lt;enumeration value="RJ"/>
                     *               &lt;enumeration value="RN"/>
                     *               &lt;enumeration value="RS"/>
                     *               &lt;enumeration value="RO"/>
                     *               &lt;enumeration value="RR"/>
                     *               &lt;enumeration value="SC"/>
                     *               &lt;enumeration value="SP"/>
                     *               &lt;enumeration value="SE"/>
                     *               &lt;enumeration value="TO"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cnpjInstEnsino",
                        "nmRazao",
                        "dscLograd",
                        "nrLograd",
                        "bairro",
                        "cep",
                        "codMunic",
                        "uf"
                    })
                    public static class InstEnsino {

                        protected String cnpjInstEnsino;
                        @XmlElement(required = true)
                        protected String nmRazao;
                        protected String dscLograd;
                        protected String nrLograd;
                        protected String bairro;
                        protected String cep;
                        protected BigInteger codMunic;
                        protected String uf;

                        /**
                         * Obtém o valor da propriedade cnpjInstEnsino.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnpjInstEnsino() {
                            return cnpjInstEnsino;
                        }

                        /**
                         * Define o valor da propriedade cnpjInstEnsino.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnpjInstEnsino(String value) {
                            this.cnpjInstEnsino = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmRazao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmRazao() {
                            return nmRazao;
                        }

                        /**
                         * Define o valor da propriedade nmRazao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmRazao(String value) {
                            this.nmRazao = value;
                        }

                        /**
                         * Obtém o valor da propriedade dscLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDscLograd() {
                            return dscLograd;
                        }

                        /**
                         * Define o valor da propriedade dscLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDscLograd(String value) {
                            this.dscLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrLograd() {
                            return nrLograd;
                        }

                        /**
                         * Define o valor da propriedade nrLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrLograd(String value) {
                            this.nrLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade bairro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBairro() {
                            return bairro;
                        }

                        /**
                         * Define o valor da propriedade bairro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBairro(String value) {
                            this.bairro = value;
                        }

                        /**
                         * Obtém o valor da propriedade cep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCep() {
                            return cep;
                        }

                        /**
                         * Define o valor da propriedade cep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCep(String value) {
                            this.cep = value;
                        }

                        /**
                         * Obtém o valor da propriedade codMunic.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCodMunic() {
                            return codMunic;
                        }

                        /**
                         * Define o valor da propriedade codMunic.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCodMunic(BigInteger value) {
                            this.codMunic = value;
                        }

                        /**
                         * Obtém o valor da propriedade uf.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUf() {
                            return uf;
                        }

                        /**
                         * Define o valor da propriedade uf.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUf(String value) {
                            this.uf = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="cpfSupervisor">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;length value="11"/>
                     *               &lt;pattern value="\d{11}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nmSuperv">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="70"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cpfSupervisor",
                        "nmSuperv"
                    })
                    public static class SupervisorEstagio {

                        @XmlElement(required = true)
                        protected String cpfSupervisor;
                        @XmlElement(required = true)
                        protected String nmSuperv;

                        /**
                         * Obtém o valor da propriedade cpfSupervisor.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCpfSupervisor() {
                            return cpfSupervisor;
                        }

                        /**
                         * Define o valor da propriedade cpfSupervisor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCpfSupervisor(String value) {
                            this.cpfSupervisor = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmSuperv.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmSuperv() {
                            return nmSuperv;
                        }

                        /**
                         * Define o valor da propriedade nmSuperv.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmSuperv(String value) {
                            this.nmSuperv = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="dtTerm">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dtTerm"
            })
            public static class Termino {

                @XmlElement(required = true)
                protected XMLGregorianCalendar dtTerm;

                /**
                 * Obtém o valor da propriedade dtTerm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTerm() {
                    return dtTerm;
                }

                /**
                 * Define o valor da propriedade dtTerm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTerm(XMLGregorianCalendar value) {
                    this.dtTerm = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cpfTrab">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="11"/>
         *               &lt;pattern value="\d{11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nisTrab" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="11"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nmTrab">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="sexo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="1"/>
         *               &lt;pattern value="[F|M]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="racaCor">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="estCiv" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="grauInstr">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nmSoc" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nascimento">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtNascto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codMunic" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="uf" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="AC"/>
         *                         &lt;enumeration value="AL"/>
         *                         &lt;enumeration value="AP"/>
         *                         &lt;enumeration value="AM"/>
         *                         &lt;enumeration value="BA"/>
         *                         &lt;enumeration value="CE"/>
         *                         &lt;enumeration value="DF"/>
         *                         &lt;enumeration value="ES"/>
         *                         &lt;enumeration value="GO"/>
         *                         &lt;enumeration value="MA"/>
         *                         &lt;enumeration value="MT"/>
         *                         &lt;enumeration value="MS"/>
         *                         &lt;enumeration value="MG"/>
         *                         &lt;enumeration value="PA"/>
         *                         &lt;enumeration value="PB"/>
         *                         &lt;enumeration value="PR"/>
         *                         &lt;enumeration value="PE"/>
         *                         &lt;enumeration value="PI"/>
         *                         &lt;enumeration value="RJ"/>
         *                         &lt;enumeration value="RN"/>
         *                         &lt;enumeration value="RS"/>
         *                         &lt;enumeration value="RO"/>
         *                         &lt;enumeration value="RR"/>
         *                         &lt;enumeration value="SC"/>
         *                         &lt;enumeration value="SP"/>
         *                         &lt;enumeration value="SE"/>
         *                         &lt;enumeration value="TO"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="paisNascto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="paisNac">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nmMae" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="2"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nmPai" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="2"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="documentos" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCtps" minOccurs="0"/>
         *                   &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRic" minOccurs="0"/>
         *                   &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRg" minOccurs="0"/>
         *                   &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRne" minOccurs="0"/>
         *                   &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TOc" minOccurs="0"/>
         *                   &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCnh" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="endereco">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoBrasil"/>
         *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoExterior"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TTrabEstrang" minOccurs="0"/>
         *         &lt;element name="infoDeficiencia" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="defFisica">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="defVisual">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="defAuditiva">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="defMental">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="defIntelectual">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="reabReadap">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="observacao" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
         *         &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TContato" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cpfTrab",
            "nisTrab",
            "nmTrab",
            "sexo",
            "racaCor",
            "estCiv",
            "grauInstr",
            "nmSoc",
            "nascimento",
            "documentos",
            "endereco",
            "trabEstrangeiro",
            "infoDeficiencia",
            "dependente",
            "contato"
        })
        public static class Trabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;
            protected String nisTrab;
            @XmlElement(required = true)
            protected String nmTrab;
            @XmlElement(required = true)
            protected String sexo;
            protected byte racaCor;
            protected Byte estCiv;
            @XmlElement(required = true)
            protected String grauInstr;
            protected String nmSoc;
            @XmlElement(required = true)
            protected ESocial.EvtTSVInicio.Trabalhador.Nascimento nascimento;
            protected ESocial.EvtTSVInicio.Trabalhador.Documentos documentos;
            @XmlElement(required = true)
            protected ESocial.EvtTSVInicio.Trabalhador.Endereco endereco;
            protected TTrabEstrang trabEstrangeiro;
            protected ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia infoDeficiencia;
            protected List<TDependente> dependente;
            protected TContato contato;

            /**
             * Obtém o valor da propriedade cpfTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfTrab() {
                return cpfTrab;
            }

            /**
             * Define o valor da propriedade cpfTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfTrab(String value) {
                this.cpfTrab = value;
            }

            /**
             * Obtém o valor da propriedade nisTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNisTrab() {
                return nisTrab;
            }

            /**
             * Define o valor da propriedade nisTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNisTrab(String value) {
                this.nisTrab = value;
            }

            /**
             * Obtém o valor da propriedade nmTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmTrab() {
                return nmTrab;
            }

            /**
             * Define o valor da propriedade nmTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmTrab(String value) {
                this.nmTrab = value;
            }

            /**
             * Obtém o valor da propriedade sexo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSexo() {
                return sexo;
            }

            /**
             * Define o valor da propriedade sexo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSexo(String value) {
                this.sexo = value;
            }

            /**
             * Obtém o valor da propriedade racaCor.
             * 
             */
            public byte getRacaCor() {
                return racaCor;
            }

            /**
             * Define o valor da propriedade racaCor.
             * 
             */
            public void setRacaCor(byte value) {
                this.racaCor = value;
            }

            /**
             * Obtém o valor da propriedade estCiv.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getEstCiv() {
                return estCiv;
            }

            /**
             * Define o valor da propriedade estCiv.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setEstCiv(Byte value) {
                this.estCiv = value;
            }

            /**
             * Obtém o valor da propriedade grauInstr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGrauInstr() {
                return grauInstr;
            }

            /**
             * Define o valor da propriedade grauInstr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGrauInstr(String value) {
                this.grauInstr = value;
            }

            /**
             * Obtém o valor da propriedade nmSoc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmSoc() {
                return nmSoc;
            }

            /**
             * Define o valor da propriedade nmSoc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmSoc(String value) {
                this.nmSoc = value;
            }

            /**
             * Obtém o valor da propriedade nascimento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Nascimento }
             *     
             */
            public ESocial.EvtTSVInicio.Trabalhador.Nascimento getNascimento() {
                return nascimento;
            }

            /**
             * Define o valor da propriedade nascimento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Nascimento }
             *     
             */
            public void setNascimento(ESocial.EvtTSVInicio.Trabalhador.Nascimento value) {
                this.nascimento = value;
            }

            /**
             * Obtém o valor da propriedade documentos.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Documentos }
             *     
             */
            public ESocial.EvtTSVInicio.Trabalhador.Documentos getDocumentos() {
                return documentos;
            }

            /**
             * Define o valor da propriedade documentos.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Documentos }
             *     
             */
            public void setDocumentos(ESocial.EvtTSVInicio.Trabalhador.Documentos value) {
                this.documentos = value;
            }

            /**
             * Obtém o valor da propriedade endereco.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Endereco }
             *     
             */
            public ESocial.EvtTSVInicio.Trabalhador.Endereco getEndereco() {
                return endereco;
            }

            /**
             * Define o valor da propriedade endereco.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Endereco }
             *     
             */
            public void setEndereco(ESocial.EvtTSVInicio.Trabalhador.Endereco value) {
                this.endereco = value;
            }

            /**
             * Obtém o valor da propriedade trabEstrangeiro.
             * 
             * @return
             *     possible object is
             *     {@link TTrabEstrang }
             *     
             */
            public TTrabEstrang getTrabEstrangeiro() {
                return trabEstrangeiro;
            }

            /**
             * Define o valor da propriedade trabEstrangeiro.
             * 
             * @param value
             *     allowed object is
             *     {@link TTrabEstrang }
             *     
             */
            public void setTrabEstrangeiro(TTrabEstrang value) {
                this.trabEstrangeiro = value;
            }

            /**
             * Obtém o valor da propriedade infoDeficiencia.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia }
             *     
             */
            public ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia getInfoDeficiencia() {
                return infoDeficiencia;
            }

            /**
             * Define o valor da propriedade infoDeficiencia.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia }
             *     
             */
            public void setInfoDeficiencia(ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia value) {
                this.infoDeficiencia = value;
            }

            /**
             * Gets the value of the dependente property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dependente property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDependente().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TDependente }
             * 
             * 
             */
            public List<TDependente> getDependente() {
                if (dependente == null) {
                    dependente = new ArrayList<TDependente>();
                }
                return this.dependente;
            }

            /**
             * Obtém o valor da propriedade contato.
             * 
             * @return
             *     possible object is
             *     {@link TContato }
             *     
             */
            public TContato getContato() {
                return contato;
            }

            /**
             * Define o valor da propriedade contato.
             * 
             * @param value
             *     allowed object is
             *     {@link TContato }
             *     
             */
            public void setContato(TContato value) {
                this.contato = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCtps" minOccurs="0"/>
             *         &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRic" minOccurs="0"/>
             *         &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRg" minOccurs="0"/>
             *         &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TRne" minOccurs="0"/>
             *         &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TOc" minOccurs="0"/>
             *         &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TCnh" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ctps",
                "ric",
                "rg",
                "rne",
                "oc",
                "cnh"
            })
            public static class Documentos {

                @XmlElement(name = "CTPS")
                protected TCtps ctps;
                @XmlElement(name = "RIC")
                protected TRic ric;
                @XmlElement(name = "RG")
                protected TRg rg;
                @XmlElement(name = "RNE")
                protected TRne rne;
                @XmlElement(name = "OC")
                protected TOc oc;
                @XmlElement(name = "CNH")
                protected TCnh cnh;

                /**
                 * Obtém o valor da propriedade ctps.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCtps }
                 *     
                 */
                public TCtps getCTPS() {
                    return ctps;
                }

                /**
                 * Define o valor da propriedade ctps.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCtps }
                 *     
                 */
                public void setCTPS(TCtps value) {
                    this.ctps = value;
                }

                /**
                 * Obtém o valor da propriedade ric.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRic }
                 *     
                 */
                public TRic getRIC() {
                    return ric;
                }

                /**
                 * Define o valor da propriedade ric.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRic }
                 *     
                 */
                public void setRIC(TRic value) {
                    this.ric = value;
                }

                /**
                 * Obtém o valor da propriedade rg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRg }
                 *     
                 */
                public TRg getRG() {
                    return rg;
                }

                /**
                 * Define o valor da propriedade rg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRg }
                 *     
                 */
                public void setRG(TRg value) {
                    this.rg = value;
                }

                /**
                 * Obtém o valor da propriedade rne.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRne }
                 *     
                 */
                public TRne getRNE() {
                    return rne;
                }

                /**
                 * Define o valor da propriedade rne.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRne }
                 *     
                 */
                public void setRNE(TRne value) {
                    this.rne = value;
                }

                /**
                 * Obtém o valor da propriedade oc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TOc }
                 *     
                 */
                public TOc getOC() {
                    return oc;
                }

                /**
                 * Define o valor da propriedade oc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TOc }
                 *     
                 */
                public void setOC(TOc value) {
                    this.oc = value;
                }

                /**
                 * Obtém o valor da propriedade cnh.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCnh }
                 *     
                 */
                public TCnh getCNH() {
                    return cnh;
                }

                /**
                 * Define o valor da propriedade cnh.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCnh }
                 *     
                 */
                public void setCNH(TCnh value) {
                    this.cnh = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;choice>
             *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoBrasil"/>
             *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v02_04_02}TEnderecoExterior"/>
             *         &lt;/choice>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "brasil",
                "exterior"
            })
            public static class Endereco {

                protected TEnderecoBrasil brasil;
                protected TEnderecoExterior exterior;

                /**
                 * Obtém o valor da propriedade brasil.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TEnderecoBrasil }
                 *     
                 */
                public TEnderecoBrasil getBrasil() {
                    return brasil;
                }

                /**
                 * Define o valor da propriedade brasil.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TEnderecoBrasil }
                 *     
                 */
                public void setBrasil(TEnderecoBrasil value) {
                    this.brasil = value;
                }

                /**
                 * Obtém o valor da propriedade exterior.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TEnderecoExterior }
                 *     
                 */
                public TEnderecoExterior getExterior() {
                    return exterior;
                }

                /**
                 * Define o valor da propriedade exterior.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TEnderecoExterior }
                 *     
                 */
                public void setExterior(TEnderecoExterior value) {
                    this.exterior = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="defFisica">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="defVisual">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="defAuditiva">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="defMental">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="defIntelectual">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="reabReadap">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="observacao" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "defFisica",
                "defVisual",
                "defAuditiva",
                "defMental",
                "defIntelectual",
                "reabReadap",
                "observacao"
            })
            public static class InfoDeficiencia {

                @XmlElement(required = true)
                protected String defFisica;
                @XmlElement(required = true)
                protected String defVisual;
                @XmlElement(required = true)
                protected String defAuditiva;
                @XmlElement(required = true)
                protected String defMental;
                @XmlElement(required = true)
                protected String defIntelectual;
                @XmlElement(required = true)
                protected String reabReadap;
                protected String observacao;

                /**
                 * Obtém o valor da propriedade defFisica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefFisica() {
                    return defFisica;
                }

                /**
                 * Define o valor da propriedade defFisica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefFisica(String value) {
                    this.defFisica = value;
                }

                /**
                 * Obtém o valor da propriedade defVisual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefVisual() {
                    return defVisual;
                }

                /**
                 * Define o valor da propriedade defVisual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefVisual(String value) {
                    this.defVisual = value;
                }

                /**
                 * Obtém o valor da propriedade defAuditiva.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefAuditiva() {
                    return defAuditiva;
                }

                /**
                 * Define o valor da propriedade defAuditiva.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefAuditiva(String value) {
                    this.defAuditiva = value;
                }

                /**
                 * Obtém o valor da propriedade defMental.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefMental() {
                    return defMental;
                }

                /**
                 * Define o valor da propriedade defMental.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefMental(String value) {
                    this.defMental = value;
                }

                /**
                 * Obtém o valor da propriedade defIntelectual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefIntelectual() {
                    return defIntelectual;
                }

                /**
                 * Define o valor da propriedade defIntelectual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefIntelectual(String value) {
                    this.defIntelectual = value;
                }

                /**
                 * Obtém o valor da propriedade reabReadap.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReabReadap() {
                    return reabReadap;
                }

                /**
                 * Define o valor da propriedade reabReadap.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReabReadap(String value) {
                    this.reabReadap = value;
                }

                /**
                 * Obtém o valor da propriedade observacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObservacao() {
                    return observacao;
                }

                /**
                 * Define o valor da propriedade observacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObservacao(String value) {
                    this.observacao = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="dtNascto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codMunic" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="uf" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="AC"/>
             *               &lt;enumeration value="AL"/>
             *               &lt;enumeration value="AP"/>
             *               &lt;enumeration value="AM"/>
             *               &lt;enumeration value="BA"/>
             *               &lt;enumeration value="CE"/>
             *               &lt;enumeration value="DF"/>
             *               &lt;enumeration value="ES"/>
             *               &lt;enumeration value="GO"/>
             *               &lt;enumeration value="MA"/>
             *               &lt;enumeration value="MT"/>
             *               &lt;enumeration value="MS"/>
             *               &lt;enumeration value="MG"/>
             *               &lt;enumeration value="PA"/>
             *               &lt;enumeration value="PB"/>
             *               &lt;enumeration value="PR"/>
             *               &lt;enumeration value="PE"/>
             *               &lt;enumeration value="PI"/>
             *               &lt;enumeration value="RJ"/>
             *               &lt;enumeration value="RN"/>
             *               &lt;enumeration value="RS"/>
             *               &lt;enumeration value="RO"/>
             *               &lt;enumeration value="RR"/>
             *               &lt;enumeration value="SC"/>
             *               &lt;enumeration value="SP"/>
             *               &lt;enumeration value="SE"/>
             *               &lt;enumeration value="TO"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="paisNascto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="paisNac">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nmMae" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nmPai" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dtNascto",
                "codMunic",
                "uf",
                "paisNascto",
                "paisNac",
                "nmMae",
                "nmPai"
            })
            public static class Nascimento {

                @XmlElement(required = true)
                protected XMLGregorianCalendar dtNascto;
                protected BigInteger codMunic;
                protected String uf;
                @XmlElement(required = true)
                protected String paisNascto;
                @XmlElement(required = true)
                protected String paisNac;
                protected String nmMae;
                protected String nmPai;

                /**
                 * Obtém o valor da propriedade dtNascto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtNascto() {
                    return dtNascto;
                }

                /**
                 * Define o valor da propriedade dtNascto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtNascto(XMLGregorianCalendar value) {
                    this.dtNascto = value;
                }

                /**
                 * Obtém o valor da propriedade codMunic.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCodMunic() {
                    return codMunic;
                }

                /**
                 * Define o valor da propriedade codMunic.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCodMunic(BigInteger value) {
                    this.codMunic = value;
                }

                /**
                 * Obtém o valor da propriedade uf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUf() {
                    return uf;
                }

                /**
                 * Define o valor da propriedade uf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUf(String value) {
                    this.uf = value;
                }

                /**
                 * Obtém o valor da propriedade paisNascto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaisNascto() {
                    return paisNascto;
                }

                /**
                 * Define o valor da propriedade paisNascto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaisNascto(String value) {
                    this.paisNascto = value;
                }

                /**
                 * Obtém o valor da propriedade paisNac.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaisNac() {
                    return paisNac;
                }

                /**
                 * Define o valor da propriedade paisNac.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaisNac(String value) {
                    this.paisNac = value;
                }

                /**
                 * Obtém o valor da propriedade nmMae.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNmMae() {
                    return nmMae;
                }

                /**
                 * Define o valor da propriedade nmMae.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNmMae(String value) {
                    this.nmMae = value;
                }

                /**
                 * Obtém o valor da propriedade nmPai.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNmPai() {
                    return nmPai;
                }

                /**
                 * Define o valor da propriedade nmPai.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNmPai(String value) {
                    this.nmPai = value;
                }

            }

        }

    }

}
