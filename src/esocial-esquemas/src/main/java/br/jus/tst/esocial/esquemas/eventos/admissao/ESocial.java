//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:49 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admissao;

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
 *         &lt;element name="evtAdmissao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEmpregador"/>
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
 *                             &lt;element name="nisTrab">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
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
 *                             &lt;element name="indPriEmpr" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
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
 *                                       &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCtps" minOccurs="0"/>
 *                                       &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRic" minOccurs="0"/>
 *                                       &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRg" minOccurs="0"/>
 *                                       &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRne" minOccurs="0"/>
 *                                       &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TOc" minOccurs="0"/>
 *                                       &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCnh" minOccurs="0"/>
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
 *                                         &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoBrasil"/>
 *                                         &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoExterior"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TTrabEstrang" minOccurs="0"/>
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
 *                                       &lt;element name="infoCota">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
 *                             &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
 *                             &lt;element name="aposentadoria" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="trabAposent">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TContato" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vinculo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="matricula">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpRegTrab">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpRegPrev">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrRecInfPrelim" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cadIni">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoRegimeTrab">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="infoCeletista">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="dtAdm">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="tpAdmissao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indAdmissao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="tpRegJor">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="natAtividade">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dtBase" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d{1,2}"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="cnpjSindCategProf">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;length value="14"/>
 *                                                         &lt;pattern value="\d{8,14}"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="FGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TFgts"/>
 *                                                   &lt;element name="trabTemporario" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="hipLeg">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                   &lt;pattern value="\d"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="justContr">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="3"/>
 *                                                                   &lt;maxLength value="999"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="tpInclContr">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                   &lt;pattern value="\d"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="ideTomadorServ">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="tpInsc">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                             &lt;pattern value="\d"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="nrInsc">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="\d{8,15}"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="ideEstabVinc" minOccurs="0">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;sequence>
 *                                                                                 &lt;element name="tpInsc">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                       &lt;pattern value="\d"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="nrInsc">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="\d{8,15}"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                               &lt;/sequence>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="cpfTrabSubst">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;length value="11"/>
 *                                                                             &lt;pattern value="\d{11}"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="aprend" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="tpInsc">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                   &lt;pattern value="\d"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="nrInsc">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;pattern value="\d{8,15}"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="infoEstatutario">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="indProvim">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="tpProv">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d{1,2}"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dtNomeacao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dtPosse">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dtExercicio">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="tpPlanRP" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;pattern value="\d"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="infoDecJud" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="nrProcJud">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                   &lt;minLength value="3"/>
 *                                                                   &lt;maxLength value="21"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoContrato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TDadosContrato"/>
 *                             &lt;element name="sucessaoVinc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cnpjEmpregAnt">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{8,14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="matricAnt" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="30"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtTransf">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
 *                             &lt;element name="transfDom" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfSubstituido">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{11}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="matricAnt" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="30"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtTransf">
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
 *                             &lt;element name="desligamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtDeslig">
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
    "evtAdmissao",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAdmissao evtAdmissao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAdmissao.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAdmissao }
     *     
     */
    public ESocial.EvtAdmissao getEvtAdmissao() {
        return evtAdmissao;
    }

    /**
     * Define o valor da propriedade evtAdmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAdmissao }
     *     
     */
    public void setEvtAdmissao(ESocial.EvtAdmissao value) {
        this.evtAdmissao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEmpregador"/>
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
     *                   &lt;element name="nisTrab">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
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
     *                   &lt;element name="indPriEmpr" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
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
     *                             &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCtps" minOccurs="0"/>
     *                             &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRic" minOccurs="0"/>
     *                             &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRg" minOccurs="0"/>
     *                             &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRne" minOccurs="0"/>
     *                             &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TOc" minOccurs="0"/>
     *                             &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCnh" minOccurs="0"/>
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
     *                               &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoBrasil"/>
     *                               &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoExterior"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TTrabEstrang" minOccurs="0"/>
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
     *                             &lt;element name="infoCota">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
     *                   &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
     *                   &lt;element name="aposentadoria" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="trabAposent">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TContato" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vinculo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="matricula">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpRegTrab">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpRegPrev">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrRecInfPrelim" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cadIni">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoRegimeTrab">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="infoCeletista">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="dtAdm">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="tpAdmissao">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="indAdmissao">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="tpRegJor">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="natAtividade">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dtBase" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d{1,2}"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="cnpjSindCategProf">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;length value="14"/>
     *                                               &lt;pattern value="\d{8,14}"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="FGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TFgts"/>
     *                                         &lt;element name="trabTemporario" minOccurs="0">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;sequence>
     *                                                   &lt;element name="hipLeg">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                         &lt;pattern value="\d"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="justContr">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                         &lt;minLength value="3"/>
     *                                                         &lt;maxLength value="999"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="tpInclContr">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                         &lt;pattern value="\d"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="ideTomadorServ">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="tpInsc">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                   &lt;pattern value="\d"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="nrInsc">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="\d{8,15}"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="ideEstabVinc" minOccurs="0">
     *                                                               &lt;complexType>
     *                                                                 &lt;complexContent>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                     &lt;sequence>
     *                                                                       &lt;element name="tpInsc">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                             &lt;pattern value="\d"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="nrInsc">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="\d{8,15}"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                     &lt;/sequence>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/complexContent>
     *                                                               &lt;/complexType>
     *                                                             &lt;/element>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="cpfTrabSubst">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;length value="11"/>
     *                                                                   &lt;pattern value="\d{11}"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                 &lt;/sequence>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="aprend" minOccurs="0">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;sequence>
     *                                                   &lt;element name="tpInsc">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                         &lt;pattern value="\d"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="nrInsc">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                         &lt;pattern value="\d{8,15}"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                 &lt;/sequence>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="infoEstatutario">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="indProvim">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="tpProv">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d{1,2}"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dtNomeacao">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dtPosse">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dtExercicio">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="tpPlanRP" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;pattern value="\d"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="infoDecJud" minOccurs="0">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;sequence>
     *                                                   &lt;element name="nrProcJud">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                         &lt;minLength value="3"/>
     *                                                         &lt;maxLength value="21"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                 &lt;/sequence>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoContrato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TDadosContrato"/>
     *                   &lt;element name="sucessaoVinc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cnpjEmpregAnt">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{8,14}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="matricAnt" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="30"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtTransf">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
     *                   &lt;element name="transfDom" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfSubstituido">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{11}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="matricAnt" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="30"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtTransf">
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
     *                   &lt;element name="desligamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtDeslig">
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
        "vinculo"
    })
    public static class EvtAdmissao {

        @XmlElement(required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAdmissao.Trabalhador trabalhador;
        @XmlElement(required = true)
        protected ESocial.EvtAdmissao.Vinculo vinculo;
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
         *     {@link ESocial.EvtAdmissao.Trabalhador }
         *     
         */
        public ESocial.EvtAdmissao.Trabalhador getTrabalhador() {
            return trabalhador;
        }

        /**
         * Define o valor da propriedade trabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAdmissao.Trabalhador }
         *     
         */
        public void setTrabalhador(ESocial.EvtAdmissao.Trabalhador value) {
            this.trabalhador = value;
        }

        /**
         * Obtém o valor da propriedade vinculo.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAdmissao.Vinculo }
         *     
         */
        public ESocial.EvtAdmissao.Vinculo getVinculo() {
            return vinculo;
        }

        /**
         * Define o valor da propriedade vinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAdmissao.Vinculo }
         *     
         */
        public void setVinculo(ESocial.EvtAdmissao.Vinculo value) {
            this.vinculo = value;
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
         *         &lt;element name="cpfTrab">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="11"/>
         *               &lt;pattern value="\d{11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nisTrab">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
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
         *         &lt;element name="indPriEmpr" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
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
         *                   &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCtps" minOccurs="0"/>
         *                   &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRic" minOccurs="0"/>
         *                   &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRg" minOccurs="0"/>
         *                   &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRne" minOccurs="0"/>
         *                   &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TOc" minOccurs="0"/>
         *                   &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCnh" minOccurs="0"/>
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
         *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoBrasil"/>
         *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoExterior"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TTrabEstrang" minOccurs="0"/>
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
         *                   &lt;element name="infoCota">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
         *         &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
         *         &lt;element name="aposentadoria" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="trabAposent">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TContato" minOccurs="0"/>
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
            "indPriEmpr",
            "nmSoc",
            "nascimento",
            "documentos",
            "endereco",
            "trabEstrangeiro",
            "infoDeficiencia",
            "dependente",
            "aposentadoria",
            "contato"
        })
        public static class Trabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;
            @XmlElement(required = true)
            protected String nisTrab;
            @XmlElement(required = true)
            protected String nmTrab;
            @XmlElement(required = true)
            protected String sexo;
            protected byte racaCor;
            protected Byte estCiv;
            @XmlElement(required = true)
            protected String grauInstr;
            protected String indPriEmpr;
            protected String nmSoc;
            @XmlElement(required = true)
            protected ESocial.EvtAdmissao.Trabalhador.Nascimento nascimento;
            protected ESocial.EvtAdmissao.Trabalhador.Documentos documentos;
            @XmlElement(required = true)
            protected ESocial.EvtAdmissao.Trabalhador.Endereco endereco;
            protected TTrabEstrang trabEstrangeiro;
            protected ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia infoDeficiencia;
            protected List<TDependente> dependente;
            protected ESocial.EvtAdmissao.Trabalhador.Aposentadoria aposentadoria;
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
             * Obtém o valor da propriedade indPriEmpr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndPriEmpr() {
                return indPriEmpr;
            }

            /**
             * Define o valor da propriedade indPriEmpr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndPriEmpr(String value) {
                this.indPriEmpr = value;
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
             *     {@link ESocial.EvtAdmissao.Trabalhador.Nascimento }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.Nascimento getNascimento() {
                return nascimento;
            }

            /**
             * Define o valor da propriedade nascimento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Nascimento }
             *     
             */
            public void setNascimento(ESocial.EvtAdmissao.Trabalhador.Nascimento value) {
                this.nascimento = value;
            }

            /**
             * Obtém o valor da propriedade documentos.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Documentos }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.Documentos getDocumentos() {
                return documentos;
            }

            /**
             * Define o valor da propriedade documentos.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Documentos }
             *     
             */
            public void setDocumentos(ESocial.EvtAdmissao.Trabalhador.Documentos value) {
                this.documentos = value;
            }

            /**
             * Obtém o valor da propriedade endereco.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Endereco }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.Endereco getEndereco() {
                return endereco;
            }

            /**
             * Define o valor da propriedade endereco.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Endereco }
             *     
             */
            public void setEndereco(ESocial.EvtAdmissao.Trabalhador.Endereco value) {
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
             *     {@link ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia getInfoDeficiencia() {
                return infoDeficiencia;
            }

            /**
             * Define o valor da propriedade infoDeficiencia.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia }
             *     
             */
            public void setInfoDeficiencia(ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia value) {
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
             * Obtém o valor da propriedade aposentadoria.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Aposentadoria }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.Aposentadoria getAposentadoria() {
                return aposentadoria;
            }

            /**
             * Define o valor da propriedade aposentadoria.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Aposentadoria }
             *     
             */
            public void setAposentadoria(ESocial.EvtAdmissao.Trabalhador.Aposentadoria value) {
                this.aposentadoria = value;
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
             *         &lt;element name="trabAposent">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
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
                "trabAposent"
            })
            public static class Aposentadoria {

                @XmlElement(required = true)
                protected String trabAposent;

                /**
                 * Obtém o valor da propriedade trabAposent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrabAposent() {
                    return trabAposent;
                }

                /**
                 * Define o valor da propriedade trabAposent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrabAposent(String value) {
                    this.trabAposent = value;
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
             *         &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCtps" minOccurs="0"/>
             *         &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRic" minOccurs="0"/>
             *         &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRg" minOccurs="0"/>
             *         &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRne" minOccurs="0"/>
             *         &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TOc" minOccurs="0"/>
             *         &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TCnh" minOccurs="0"/>
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
             *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoBrasil"/>
             *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoExterior"/>
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
             *         &lt;element name="infoCota">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
                "infoCota",
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
                @XmlElement(required = true)
                protected String infoCota;
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
                 * Obtém o valor da propriedade infoCota.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInfoCota() {
                    return infoCota;
                }

                /**
                 * Define o valor da propriedade infoCota.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInfoCota(String value) {
                    this.infoCota = value;
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
         *         &lt;element name="matricula">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpRegTrab">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpRegPrev">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrRecInfPrelim" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cadIni">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infoRegimeTrab">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="infoCeletista">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="dtAdm">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="tpAdmissao">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="indAdmissao">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="tpRegJor">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="natAtividade">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dtBase" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d{1,2}"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="cnpjSindCategProf">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;length value="14"/>
         *                                     &lt;pattern value="\d{8,14}"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="FGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TFgts"/>
         *                               &lt;element name="trabTemporario" minOccurs="0">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;sequence>
         *                                         &lt;element name="hipLeg">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                               &lt;pattern value="\d"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="justContr">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                               &lt;minLength value="3"/>
         *                                               &lt;maxLength value="999"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="tpInclContr">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                               &lt;pattern value="\d"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="ideTomadorServ">
         *                                           &lt;complexType>
         *                                             &lt;complexContent>
         *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                 &lt;sequence>
         *                                                   &lt;element name="tpInsc">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                         &lt;pattern value="\d"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="nrInsc">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="\d{8,15}"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="ideEstabVinc" minOccurs="0">
         *                                                     &lt;complexType>
         *                                                       &lt;complexContent>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                           &lt;sequence>
         *                                                             &lt;element name="tpInsc">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                                   &lt;pattern value="\d"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="nrInsc">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="\d{8,15}"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                           &lt;/sequence>
         *                                                         &lt;/restriction>
         *                                                       &lt;/complexContent>
         *                                                     &lt;/complexType>
         *                                                   &lt;/element>
         *                                                 &lt;/sequence>
         *                                               &lt;/restriction>
         *                                             &lt;/complexContent>
         *                                           &lt;/complexType>
         *                                         &lt;/element>
         *                                         &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
         *                                           &lt;complexType>
         *                                             &lt;complexContent>
         *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                 &lt;sequence>
         *                                                   &lt;element name="cpfTrabSubst">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;length value="11"/>
         *                                                         &lt;pattern value="\d{11}"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                 &lt;/sequence>
         *                                               &lt;/restriction>
         *                                             &lt;/complexContent>
         *                                           &lt;/complexType>
         *                                         &lt;/element>
         *                                       &lt;/sequence>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="aprend" minOccurs="0">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;sequence>
         *                                         &lt;element name="tpInsc">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                               &lt;pattern value="\d"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="nrInsc">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                               &lt;pattern value="\d{8,15}"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                       &lt;/sequence>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="infoEstatutario">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="indProvim">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="tpProv">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d{1,2}"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dtNomeacao">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dtPosse">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dtExercicio">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="tpPlanRP" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;pattern value="\d"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="infoDecJud" minOccurs="0">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;sequence>
         *                                         &lt;element name="nrProcJud">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                               &lt;minLength value="3"/>
         *                                               &lt;maxLength value="21"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                       &lt;/sequence>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoContrato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TDadosContrato"/>
         *         &lt;element name="sucessaoVinc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cnpjEmpregAnt">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{8,14}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="matricAnt" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtTransf">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
         *         &lt;element name="transfDom" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfSubstituido">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{11}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="matricAnt" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtTransf">
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
         *         &lt;element name="desligamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtDeslig">
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
            "matricula",
            "tpRegTrab",
            "tpRegPrev",
            "nrRecInfPrelim",
            "cadIni",
            "infoRegimeTrab",
            "infoContrato",
            "sucessaoVinc",
            "transfDom",
            "afastamento",
            "desligamento"
        })
        public static class Vinculo {

            @XmlElement(required = true)
            protected String matricula;
            protected byte tpRegTrab;
            protected byte tpRegPrev;
            protected String nrRecInfPrelim;
            @XmlElement(required = true)
            protected String cadIni;
            @XmlElement(required = true)
            protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab infoRegimeTrab;
            @XmlElement(required = true)
            protected TDadosContrato infoContrato;
            protected ESocial.EvtAdmissao.Vinculo.SucessaoVinc sucessaoVinc;
            protected ESocial.EvtAdmissao.Vinculo.TransfDom transfDom;
            protected ESocial.EvtAdmissao.Vinculo.Afastamento afastamento;
            protected ESocial.EvtAdmissao.Vinculo.Desligamento desligamento;

            /**
             * Obtém o valor da propriedade matricula.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatricula() {
                return matricula;
            }

            /**
             * Define o valor da propriedade matricula.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatricula(String value) {
                this.matricula = value;
            }

            /**
             * Obtém o valor da propriedade tpRegTrab.
             * 
             */
            public byte getTpRegTrab() {
                return tpRegTrab;
            }

            /**
             * Define o valor da propriedade tpRegTrab.
             * 
             */
            public void setTpRegTrab(byte value) {
                this.tpRegTrab = value;
            }

            /**
             * Obtém o valor da propriedade tpRegPrev.
             * 
             */
            public byte getTpRegPrev() {
                return tpRegPrev;
            }

            /**
             * Define o valor da propriedade tpRegPrev.
             * 
             */
            public void setTpRegPrev(byte value) {
                this.tpRegPrev = value;
            }

            /**
             * Obtém o valor da propriedade nrRecInfPrelim.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecInfPrelim() {
                return nrRecInfPrelim;
            }

            /**
             * Define o valor da propriedade nrRecInfPrelim.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecInfPrelim(String value) {
                this.nrRecInfPrelim = value;
            }

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
             * Obtém o valor da propriedade infoRegimeTrab.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab getInfoRegimeTrab() {
                return infoRegimeTrab;
            }

            /**
             * Define o valor da propriedade infoRegimeTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab }
             *     
             */
            public void setInfoRegimeTrab(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab value) {
                this.infoRegimeTrab = value;
            }

            /**
             * Obtém o valor da propriedade infoContrato.
             * 
             * @return
             *     possible object is
             *     {@link TDadosContrato }
             *     
             */
            public TDadosContrato getInfoContrato() {
                return infoContrato;
            }

            /**
             * Define o valor da propriedade infoContrato.
             * 
             * @param value
             *     allowed object is
             *     {@link TDadosContrato }
             *     
             */
            public void setInfoContrato(TDadosContrato value) {
                this.infoContrato = value;
            }

            /**
             * Obtém o valor da propriedade sucessaoVinc.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.SucessaoVinc }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.SucessaoVinc getSucessaoVinc() {
                return sucessaoVinc;
            }

            /**
             * Define o valor da propriedade sucessaoVinc.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.SucessaoVinc }
             *     
             */
            public void setSucessaoVinc(ESocial.EvtAdmissao.Vinculo.SucessaoVinc value) {
                this.sucessaoVinc = value;
            }

            /**
             * Obtém o valor da propriedade transfDom.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.TransfDom }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.TransfDom getTransfDom() {
                return transfDom;
            }

            /**
             * Define o valor da propriedade transfDom.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.TransfDom }
             *     
             */
            public void setTransfDom(ESocial.EvtAdmissao.Vinculo.TransfDom value) {
                this.transfDom = value;
            }

            /**
             * Obtém o valor da propriedade afastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Afastamento }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.Afastamento getAfastamento() {
                return afastamento;
            }

            /**
             * Define o valor da propriedade afastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Afastamento }
             *     
             */
            public void setAfastamento(ESocial.EvtAdmissao.Vinculo.Afastamento value) {
                this.afastamento = value;
            }

            /**
             * Obtém o valor da propriedade desligamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Desligamento }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.Desligamento getDesligamento() {
                return desligamento;
            }

            /**
             * Define o valor da propriedade desligamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Desligamento }
             *     
             */
            public void setDesligamento(ESocial.EvtAdmissao.Vinculo.Desligamento value) {
                this.desligamento = value;
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
             *         &lt;element name="dtDeslig">
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
                "dtDeslig"
            })
            public static class Desligamento {

                @XmlElement(required = true)
                protected XMLGregorianCalendar dtDeslig;

                /**
                 * Obtém o valor da propriedade dtDeslig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtDeslig() {
                    return dtDeslig;
                }

                /**
                 * Define o valor da propriedade dtDeslig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtDeslig(XMLGregorianCalendar value) {
                    this.dtDeslig = value;
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
             *           &lt;element name="infoCeletista">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="dtAdm">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpAdmissao">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="indAdmissao">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpRegJor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="natAtividade">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dtBase" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d{1,2}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="cnpjSindCategProf">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;length value="14"/>
             *                           &lt;pattern value="\d{8,14}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="FGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TFgts"/>
             *                     &lt;element name="trabTemporario" minOccurs="0">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="hipLeg">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                     &lt;pattern value="\d"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="justContr">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;minLength value="3"/>
             *                                     &lt;maxLength value="999"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="tpInclContr">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                     &lt;pattern value="\d"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="ideTomadorServ">
             *                                 &lt;complexType>
             *                                   &lt;complexContent>
             *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                       &lt;sequence>
             *                                         &lt;element name="tpInsc">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                               &lt;pattern value="\d"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="nrInsc">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="\d{8,15}"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="ideEstabVinc" minOccurs="0">
             *                                           &lt;complexType>
             *                                             &lt;complexContent>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                 &lt;sequence>
             *                                                   &lt;element name="tpInsc">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                                         &lt;pattern value="\d"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="nrInsc">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="\d{8,15}"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                 &lt;/sequence>
             *                                               &lt;/restriction>
             *                                             &lt;/complexContent>
             *                                           &lt;/complexType>
             *                                         &lt;/element>
             *                                       &lt;/sequence>
             *                                     &lt;/restriction>
             *                                   &lt;/complexContent>
             *                                 &lt;/complexType>
             *                               &lt;/element>
             *                               &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
             *                                 &lt;complexType>
             *                                   &lt;complexContent>
             *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                       &lt;sequence>
             *                                         &lt;element name="cpfTrabSubst">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;length value="11"/>
             *                                               &lt;pattern value="\d{11}"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                       &lt;/sequence>
             *                                     &lt;/restriction>
             *                                   &lt;/complexContent>
             *                                 &lt;/complexType>
             *                               &lt;/element>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="aprend" minOccurs="0">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="tpInsc">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                     &lt;pattern value="\d"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="nrInsc">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;pattern value="\d{8,15}"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="infoEstatutario">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="indProvim">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpProv">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d{1,2}"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dtNomeacao">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dtPosse">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dtExercicio">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="tpPlanRP" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;pattern value="\d"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="infoDecJud" minOccurs="0">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="nrProcJud">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;minLength value="3"/>
             *                                     &lt;maxLength value="21"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
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
                "infoCeletista",
                "infoEstatutario"
            })
            public static class InfoRegimeTrab {

                protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista infoCeletista;
                protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario infoEstatutario;

                /**
                 * Obtém o valor da propriedade infoCeletista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista }
                 *     
                 */
                public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista getInfoCeletista() {
                    return infoCeletista;
                }

                /**
                 * Define o valor da propriedade infoCeletista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista }
                 *     
                 */
                public void setInfoCeletista(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista value) {
                    this.infoCeletista = value;
                }

                /**
                 * Obtém o valor da propriedade infoEstatutario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario }
                 *     
                 */
                public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario getInfoEstatutario() {
                    return infoEstatutario;
                }

                /**
                 * Define o valor da propriedade infoEstatutario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario }
                 *     
                 */
                public void setInfoEstatutario(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario value) {
                    this.infoEstatutario = value;
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
                 *         &lt;element name="dtAdm">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpAdmissao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="indAdmissao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpRegJor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="natAtividade">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtBase" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d{1,2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cnpjSindCategProf">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="14"/>
                 *               &lt;pattern value="\d{8,14}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="FGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TFgts"/>
                 *         &lt;element name="trabTemporario" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="hipLeg">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;pattern value="\d"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="justContr">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="3"/>
                 *                         &lt;maxLength value="999"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="tpInclContr">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;pattern value="\d"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="ideTomadorServ">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpInsc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                   &lt;pattern value="\d"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="nrInsc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;pattern value="\d{8,15}"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="ideEstabVinc" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="tpInsc">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                             &lt;pattern value="\d"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="nrInsc">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="\d{8,15}"/>
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
                 *                   &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="cpfTrabSubst">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;length value="11"/>
                 *                                   &lt;pattern value="\d{11}"/>
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
                 *         &lt;element name="aprend" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpInsc">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;pattern value="\d"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nrInsc">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{8,15}"/>
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
                    "dtAdm",
                    "tpAdmissao",
                    "indAdmissao",
                    "tpRegJor",
                    "natAtividade",
                    "dtBase",
                    "cnpjSindCategProf",
                    "fgts",
                    "trabTemporario",
                    "aprend"
                })
                public static class InfoCeletista {

                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dtAdm;
                    protected byte tpAdmissao;
                    protected byte indAdmissao;
                    protected byte tpRegJor;
                    protected byte natAtividade;
                    protected Byte dtBase;
                    @XmlElement(required = true)
                    protected String cnpjSindCategProf;
                    @XmlElement(name = "FGTS", required = true)
                    protected TFgts fgts;
                    protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario trabTemporario;
                    protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.Aprend aprend;

                    /**
                     * Obtém o valor da propriedade dtAdm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtAdm() {
                        return dtAdm;
                    }

                    /**
                     * Define o valor da propriedade dtAdm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtAdm(XMLGregorianCalendar value) {
                        this.dtAdm = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpAdmissao.
                     * 
                     */
                    public byte getTpAdmissao() {
                        return tpAdmissao;
                    }

                    /**
                     * Define o valor da propriedade tpAdmissao.
                     * 
                     */
                    public void setTpAdmissao(byte value) {
                        this.tpAdmissao = value;
                    }

                    /**
                     * Obtém o valor da propriedade indAdmissao.
                     * 
                     */
                    public byte getIndAdmissao() {
                        return indAdmissao;
                    }

                    /**
                     * Define o valor da propriedade indAdmissao.
                     * 
                     */
                    public void setIndAdmissao(byte value) {
                        this.indAdmissao = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpRegJor.
                     * 
                     */
                    public byte getTpRegJor() {
                        return tpRegJor;
                    }

                    /**
                     * Define o valor da propriedade tpRegJor.
                     * 
                     */
                    public void setTpRegJor(byte value) {
                        this.tpRegJor = value;
                    }

                    /**
                     * Obtém o valor da propriedade natAtividade.
                     * 
                     */
                    public byte getNatAtividade() {
                        return natAtividade;
                    }

                    /**
                     * Define o valor da propriedade natAtividade.
                     * 
                     */
                    public void setNatAtividade(byte value) {
                        this.natAtividade = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getDtBase() {
                        return dtBase;
                    }

                    /**
                     * Define o valor da propriedade dtBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setDtBase(Byte value) {
                        this.dtBase = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnpjSindCategProf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjSindCategProf() {
                        return cnpjSindCategProf;
                    }

                    /**
                     * Define o valor da propriedade cnpjSindCategProf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjSindCategProf(String value) {
                        this.cnpjSindCategProf = value;
                    }

                    /**
                     * Obtém o valor da propriedade fgts.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TFgts }
                     *     
                     */
                    public TFgts getFGTS() {
                        return fgts;
                    }

                    /**
                     * Define o valor da propriedade fgts.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TFgts }
                     *     
                     */
                    public void setFGTS(TFgts value) {
                        this.fgts = value;
                    }

                    /**
                     * Obtém o valor da propriedade trabTemporario.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario }
                     *     
                     */
                    public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario getTrabTemporario() {
                        return trabTemporario;
                    }

                    /**
                     * Define o valor da propriedade trabTemporario.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario }
                     *     
                     */
                    public void setTrabTemporario(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario value) {
                        this.trabTemporario = value;
                    }

                    /**
                     * Obtém o valor da propriedade aprend.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.Aprend }
                     *     
                     */
                    public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.Aprend getAprend() {
                        return aprend;
                    }

                    /**
                     * Define o valor da propriedade aprend.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.Aprend }
                     *     
                     */
                    public void setAprend(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.Aprend value) {
                        this.aprend = value;
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
                     *         &lt;element name="tpInsc">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;pattern value="\d"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nrInsc">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{8,15}"/>
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
                        "tpInsc",
                        "nrInsc"
                    })
                    public static class Aprend {

                        protected byte tpInsc;
                        @XmlElement(required = true)
                        protected String nrInsc;

                        /**
                         * Obtém o valor da propriedade tpInsc.
                         * 
                         */
                        public byte getTpInsc() {
                            return tpInsc;
                        }

                        /**
                         * Define o valor da propriedade tpInsc.
                         * 
                         */
                        public void setTpInsc(byte value) {
                            this.tpInsc = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrInsc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrInsc() {
                            return nrInsc;
                        }

                        /**
                         * Define o valor da propriedade nrInsc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrInsc(String value) {
                            this.nrInsc = value;
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
                     *         &lt;element name="hipLeg">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;pattern value="\d"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="justContr">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="3"/>
                     *               &lt;maxLength value="999"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="tpInclContr">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;pattern value="\d"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="ideTomadorServ">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpInsc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                         &lt;pattern value="\d"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="nrInsc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;pattern value="\d{8,15}"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="ideEstabVinc" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="tpInsc">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                                   &lt;pattern value="\d"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="nrInsc">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="\d{8,15}"/>
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
                     *         &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="cpfTrabSubst">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;length value="11"/>
                     *                         &lt;pattern value="\d{11}"/>
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
                        "hipLeg",
                        "justContr",
                        "tpInclContr",
                        "ideTomadorServ",
                        "ideTrabSubstituido"
                    })
                    public static class TrabTemporario {

                        protected byte hipLeg;
                        @XmlElement(required = true)
                        protected String justContr;
                        protected byte tpInclContr;
                        @XmlElement(required = true)
                        protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ ideTomadorServ;
                        protected List<ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido> ideTrabSubstituido;

                        /**
                         * Obtém o valor da propriedade hipLeg.
                         * 
                         */
                        public byte getHipLeg() {
                            return hipLeg;
                        }

                        /**
                         * Define o valor da propriedade hipLeg.
                         * 
                         */
                        public void setHipLeg(byte value) {
                            this.hipLeg = value;
                        }

                        /**
                         * Obtém o valor da propriedade justContr.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getJustContr() {
                            return justContr;
                        }

                        /**
                         * Define o valor da propriedade justContr.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setJustContr(String value) {
                            this.justContr = value;
                        }

                        /**
                         * Obtém o valor da propriedade tpInclContr.
                         * 
                         */
                        public byte getTpInclContr() {
                            return tpInclContr;
                        }

                        /**
                         * Define o valor da propriedade tpInclContr.
                         * 
                         */
                        public void setTpInclContr(byte value) {
                            this.tpInclContr = value;
                        }

                        /**
                         * Obtém o valor da propriedade ideTomadorServ.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ }
                         *     
                         */
                        public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ getIdeTomadorServ() {
                            return ideTomadorServ;
                        }

                        /**
                         * Define o valor da propriedade ideTomadorServ.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ }
                         *     
                         */
                        public void setIdeTomadorServ(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ value) {
                            this.ideTomadorServ = value;
                        }

                        /**
                         * Gets the value of the ideTrabSubstituido property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ideTrabSubstituido property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdeTrabSubstituido().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido }
                         * 
                         * 
                         */
                        public List<ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido> getIdeTrabSubstituido() {
                            if (ideTrabSubstituido == null) {
                                ideTrabSubstituido = new ArrayList<ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido>();
                            }
                            return this.ideTrabSubstituido;
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
                         *         &lt;element name="tpInsc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                         *               &lt;pattern value="\d"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="nrInsc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="\d{8,15}"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="ideEstabVinc" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="tpInsc">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                         *                         &lt;pattern value="\d"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="nrInsc">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="\d{8,15}"/>
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
                            "tpInsc",
                            "nrInsc",
                            "ideEstabVinc"
                        })
                        public static class IdeTomadorServ {

                            protected byte tpInsc;
                            @XmlElement(required = true)
                            protected String nrInsc;
                            protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ.IdeEstabVinc ideEstabVinc;

                            /**
                             * Obtém o valor da propriedade tpInsc.
                             * 
                             */
                            public byte getTpInsc() {
                                return tpInsc;
                            }

                            /**
                             * Define o valor da propriedade tpInsc.
                             * 
                             */
                            public void setTpInsc(byte value) {
                                this.tpInsc = value;
                            }

                            /**
                             * Obtém o valor da propriedade nrInsc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getNrInsc() {
                                return nrInsc;
                            }

                            /**
                             * Define o valor da propriedade nrInsc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setNrInsc(String value) {
                                this.nrInsc = value;
                            }

                            /**
                             * Obtém o valor da propriedade ideEstabVinc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ.IdeEstabVinc }
                             *     
                             */
                            public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ.IdeEstabVinc getIdeEstabVinc() {
                                return ideEstabVinc;
                            }

                            /**
                             * Define o valor da propriedade ideEstabVinc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ.IdeEstabVinc }
                             *     
                             */
                            public void setIdeEstabVinc(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTomadorServ.IdeEstabVinc value) {
                                this.ideEstabVinc = value;
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
                             *         &lt;element name="tpInsc">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                             *               &lt;pattern value="\d"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="nrInsc">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="\d{8,15}"/>
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
                                "tpInsc",
                                "nrInsc"
                            })
                            public static class IdeEstabVinc {

                                protected byte tpInsc;
                                @XmlElement(required = true)
                                protected String nrInsc;

                                /**
                                 * Obtém o valor da propriedade tpInsc.
                                 * 
                                 */
                                public byte getTpInsc() {
                                    return tpInsc;
                                }

                                /**
                                 * Define o valor da propriedade tpInsc.
                                 * 
                                 */
                                public void setTpInsc(byte value) {
                                    this.tpInsc = value;
                                }

                                /**
                                 * Obtém o valor da propriedade nrInsc.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getNrInsc() {
                                    return nrInsc;
                                }

                                /**
                                 * Define o valor da propriedade nrInsc.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setNrInsc(String value) {
                                    this.nrInsc = value;
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
                         *         &lt;element name="cpfTrabSubst">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;length value="11"/>
                         *               &lt;pattern value="\d{11}"/>
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
                            "cpfTrabSubst"
                        })
                        public static class IdeTrabSubstituido {

                            @XmlElement(required = true)
                            protected String cpfTrabSubst;

                            /**
                             * Obtém o valor da propriedade cpfTrabSubst.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCpfTrabSubst() {
                                return cpfTrabSubst;
                            }

                            /**
                             * Define o valor da propriedade cpfTrabSubst.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCpfTrabSubst(String value) {
                                this.cpfTrabSubst = value;
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
                 *         &lt;element name="indProvim">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpProv">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d{1,2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtNomeacao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtPosse">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtExercicio">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpPlanRP" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infoDecJud" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nrProcJud">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="3"/>
                 *                         &lt;maxLength value="21"/>
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
                    "indProvim",
                    "tpProv",
                    "dtNomeacao",
                    "dtPosse",
                    "dtExercicio",
                    "tpPlanRP",
                    "infoDecJud"
                })
                public static class InfoEstatutario {

                    protected byte indProvim;
                    protected byte tpProv;
                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dtNomeacao;
                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dtPosse;
                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dtExercicio;
                    protected Byte tpPlanRP;
                    protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario.InfoDecJud infoDecJud;

                    /**
                     * Obtém o valor da propriedade indProvim.
                     * 
                     */
                    public byte getIndProvim() {
                        return indProvim;
                    }

                    /**
                     * Define o valor da propriedade indProvim.
                     * 
                     */
                    public void setIndProvim(byte value) {
                        this.indProvim = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpProv.
                     * 
                     */
                    public byte getTpProv() {
                        return tpProv;
                    }

                    /**
                     * Define o valor da propriedade tpProv.
                     * 
                     */
                    public void setTpProv(byte value) {
                        this.tpProv = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtNomeacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtNomeacao() {
                        return dtNomeacao;
                    }

                    /**
                     * Define o valor da propriedade dtNomeacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtNomeacao(XMLGregorianCalendar value) {
                        this.dtNomeacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtPosse.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtPosse() {
                        return dtPosse;
                    }

                    /**
                     * Define o valor da propriedade dtPosse.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtPosse(XMLGregorianCalendar value) {
                        this.dtPosse = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtExercicio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtExercicio() {
                        return dtExercicio;
                    }

                    /**
                     * Define o valor da propriedade dtExercicio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtExercicio(XMLGregorianCalendar value) {
                        this.dtExercicio = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpPlanRP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getTpPlanRP() {
                        return tpPlanRP;
                    }

                    /**
                     * Define o valor da propriedade tpPlanRP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setTpPlanRP(Byte value) {
                        this.tpPlanRP = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoDecJud.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario.InfoDecJud }
                     *     
                     */
                    public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario.InfoDecJud getInfoDecJud() {
                        return infoDecJud;
                    }

                    /**
                     * Define o valor da propriedade infoDecJud.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario.InfoDecJud }
                     *     
                     */
                    public void setInfoDecJud(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario.InfoDecJud value) {
                        this.infoDecJud = value;
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
                     *         &lt;element name="nrProcJud">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="3"/>
                     *               &lt;maxLength value="21"/>
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
                        "nrProcJud"
                    })
                    public static class InfoDecJud {

                        @XmlElement(required = true)
                        protected String nrProcJud;

                        /**
                         * Obtém o valor da propriedade nrProcJud.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrProcJud() {
                            return nrProcJud;
                        }

                        /**
                         * Define o valor da propriedade nrProcJud.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrProcJud(String value) {
                            this.nrProcJud = value;
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
             *         &lt;element name="cnpjEmpregAnt">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{8,14}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="matricAnt" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtTransf">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
                "cnpjEmpregAnt",
                "matricAnt",
                "dtTransf",
                "observacao"
            })
            public static class SucessaoVinc {

                @XmlElement(required = true)
                protected String cnpjEmpregAnt;
                protected String matricAnt;
                @XmlElement(required = true)
                protected XMLGregorianCalendar dtTransf;
                protected String observacao;

                /**
                 * Obtém o valor da propriedade cnpjEmpregAnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCnpjEmpregAnt() {
                    return cnpjEmpregAnt;
                }

                /**
                 * Define o valor da propriedade cnpjEmpregAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCnpjEmpregAnt(String value) {
                    this.cnpjEmpregAnt = value;
                }

                /**
                 * Obtém o valor da propriedade matricAnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatricAnt() {
                    return matricAnt;
                }

                /**
                 * Define o valor da propriedade matricAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatricAnt(String value) {
                    this.matricAnt = value;
                }

                /**
                 * Obtém o valor da propriedade dtTransf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTransf() {
                    return dtTransf;
                }

                /**
                 * Define o valor da propriedade dtTransf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTransf(XMLGregorianCalendar value) {
                    this.dtTransf = value;
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
             *         &lt;element name="cpfSubstituido">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{11}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="matricAnt" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtTransf">
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
                "cpfSubstituido",
                "matricAnt",
                "dtTransf"
            })
            public static class TransfDom {

                @XmlElement(required = true)
                protected String cpfSubstituido;
                protected String matricAnt;
                @XmlElement(required = true)
                protected XMLGregorianCalendar dtTransf;

                /**
                 * Obtém o valor da propriedade cpfSubstituido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfSubstituido() {
                    return cpfSubstituido;
                }

                /**
                 * Define o valor da propriedade cpfSubstituido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfSubstituido(String value) {
                    this.cpfSubstituido = value;
                }

                /**
                 * Obtém o valor da propriedade matricAnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatricAnt() {
                    return matricAnt;
                }

                /**
                 * Define o valor da propriedade matricAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatricAnt(String value) {
                    this.matricAnt = value;
                }

                /**
                 * Obtém o valor da propriedade dtTransf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTransf() {
                    return dtTransf;
                }

                /**
                 * Define o valor da propriedade dtTransf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTransf(XMLGregorianCalendar value) {
                    this.dtTransf = value;
                }

            }

        }

    }

}
