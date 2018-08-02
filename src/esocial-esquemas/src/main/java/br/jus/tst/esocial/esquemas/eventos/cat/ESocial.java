//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:53 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cat;

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
 *         &lt;element name="evtCAT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideRegistrador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpRegistrador">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d{1,2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpInsc" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrInsc" minOccurs="0">
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
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="cat">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAcid">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAcid">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="hrAcid">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="hrsTrabAntesAcid">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpCat">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indCatObito">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="1"/>
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtObito" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indComunPolicia">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="1"/>
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="codSitGeradora" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="\d{3,9}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="iniciatCAT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
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
 *                             &lt;element name="localAcidente">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpLocal">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscLocal" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="80"/>
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
 *                                       &lt;element name="cnpjLocalAcid" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="14"/>
 *                                             &lt;pattern value="\d{8,14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="pais" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{3}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codPostal" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;minLength value="4"/>
 *                                             &lt;maxLength value="12"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="parteAtingida" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codParteAting">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{3,9}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="lateralidade">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="agenteCausador" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codAgntCausador">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{3,9}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="atestado" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codCNES" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="7"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtAtendimento">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="hrAtendimento">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="indInternacao">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="durTrat">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{1,4}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="indAfast">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscLesao" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscCompLesao" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="200"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="diagProvavel" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codCID">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\w{3,4}"/>
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
 *                                       &lt;element name="emitente">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nmEmit">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="2"/>
 *                                                       &lt;maxLength value="70"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ideOC">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nrOc">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="14"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ufOC" minOccurs="0">
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
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="catOrigem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtCatOrig">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrCatOrig" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="40"/>
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
    "evtCAT",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
    protected ESocial.EvtCAT evtCAT;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCAT.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCAT }
     *     
     */
    public ESocial.EvtCAT getEvtCAT() {
        return evtCAT;
    }

    /**
     * Define o valor da propriedade evtCAT.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCAT }
     *     
     */
    public void setEvtCAT(ESocial.EvtCAT value) {
        this.evtCAT = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideRegistrador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpRegistrador">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d{1,2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpInsc" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrInsc" minOccurs="0">
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
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideTrabalhador">
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="cat">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAcid">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpAcid">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="hrAcid">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="hrsTrabAntesAcid">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpCat">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indCatObito">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="1"/>
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtObito" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indComunPolicia">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="1"/>
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="codSitGeradora" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="\d{3,9}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="iniciatCAT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
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
     *                   &lt;element name="localAcidente">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpLocal">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscLocal" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="80"/>
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
     *                             &lt;element name="cnpjLocalAcid" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="14"/>
     *                                   &lt;pattern value="\d{8,14}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="pais" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{3}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codPostal" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;minLength value="4"/>
     *                                   &lt;maxLength value="12"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="parteAtingida" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codParteAting">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{3,9}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="lateralidade">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="agenteCausador" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codAgntCausador">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{3,9}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="atestado" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codCNES" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="7"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtAtendimento">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="hrAtendimento">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="indInternacao">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="durTrat">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{1,4}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="indAfast">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscLesao" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscCompLesao" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="200"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="diagProvavel" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codCID">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\w{3,4}"/>
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
     *                             &lt;element name="emitente">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nmEmit">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="2"/>
     *                                             &lt;maxLength value="70"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="ideOC">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nrOc">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;whiteSpace value="preserve"/>
     *                                             &lt;minLength value="3"/>
     *                                             &lt;maxLength value="14"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="ufOC" minOccurs="0">
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
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="catOrigem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtCatOrig">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrCatOrig" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="40"/>
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
        "ideRegistrador",
        "ideEmpregador",
        "ideTrabalhador",
        "cat"
    })
    public static class EvtCAT {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
        protected ESocial.EvtCAT.IdeRegistrador ideRegistrador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
        protected ESocial.EvtCAT.IdeTrabalhador ideTrabalhador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
        protected ESocial.EvtCAT.Cat cat;
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
         * Obtém o valor da propriedade ideRegistrador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCAT.IdeRegistrador }
         *     
         */
        public ESocial.EvtCAT.IdeRegistrador getIdeRegistrador() {
            return ideRegistrador;
        }

        /**
         * Define o valor da propriedade ideRegistrador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCAT.IdeRegistrador }
         *     
         */
        public void setIdeRegistrador(ESocial.EvtCAT.IdeRegistrador value) {
            this.ideRegistrador = value;
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
         * Obtém o valor da propriedade ideTrabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCAT.IdeTrabalhador }
         *     
         */
        public ESocial.EvtCAT.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCAT.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtCAT.IdeTrabalhador value) {
            this.ideTrabalhador = value;
        }

        /**
         * Obtém o valor da propriedade cat.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCAT.Cat }
         *     
         */
        public ESocial.EvtCAT.Cat getCat() {
            return cat;
        }

        /**
         * Define o valor da propriedade cat.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCAT.Cat }
         *     
         */
        public void setCat(ESocial.EvtCAT.Cat value) {
            this.cat = value;
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
         *         &lt;element name="dtAcid">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAcid">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="hrAcid">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="hrsTrabAntesAcid">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpCat">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indCatObito">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="1"/>
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtObito" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indComunPolicia">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="1"/>
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="codSitGeradora" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;pattern value="\d{3,9}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="iniciatCAT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
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
         *         &lt;element name="localAcidente">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpLocal">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscLocal" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="80"/>
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
         *                   &lt;element name="cnpjLocalAcid" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="14"/>
         *                         &lt;pattern value="\d{8,14}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="pais" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{3}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codPostal" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="4"/>
         *                         &lt;maxLength value="12"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="parteAtingida" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codParteAting">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{3,9}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="lateralidade">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="agenteCausador" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codAgntCausador">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{3,9}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="atestado" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codCNES" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="7"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtAtendimento">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="hrAtendimento">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="indInternacao">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="durTrat">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{1,4}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="indAfast">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscLesao" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscCompLesao" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="200"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="diagProvavel" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codCID">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\w{3,4}"/>
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
         *                   &lt;element name="emitente">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nmEmit">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="2"/>
         *                                   &lt;maxLength value="70"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="ideOC">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nrOc">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;minLength value="3"/>
         *                                   &lt;maxLength value="14"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="ufOC" minOccurs="0">
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
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="catOrigem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtCatOrig">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrCatOrig" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="40"/>
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
            "dtAcid",
            "tpAcid",
            "hrAcid",
            "hrsTrabAntesAcid",
            "tpCat",
            "indCatObito",
            "dtObito",
            "indComunPolicia",
            "codSitGeradora",
            "iniciatCAT",
            "observacao",
            "localAcidente",
            "parteAtingida",
            "agenteCausador",
            "atestado",
            "catOrigem"
        })
        public static class Cat {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected XMLGregorianCalendar dtAcid;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected String tpAcid;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected String hrAcid;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected String hrsTrabAntesAcid;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected byte tpCat;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected String indCatObito;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected XMLGregorianCalendar dtObito;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected String indComunPolicia;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected BigInteger codSitGeradora;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected byte iniciatCAT;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected String observacao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected ESocial.EvtCAT.Cat.LocalAcidente localAcidente;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected List<ESocial.EvtCAT.Cat.ParteAtingida> parteAtingida;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected List<ESocial.EvtCAT.Cat.AgenteCausador> agenteCausador;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected ESocial.EvtCAT.Cat.Atestado atestado;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected ESocial.EvtCAT.Cat.CatOrigem catOrigem;

            /**
             * Obtém o valor da propriedade dtAcid.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAcid() {
                return dtAcid;
            }

            /**
             * Define o valor da propriedade dtAcid.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAcid(XMLGregorianCalendar value) {
                this.dtAcid = value;
            }

            /**
             * Obtém o valor da propriedade tpAcid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpAcid() {
                return tpAcid;
            }

            /**
             * Define o valor da propriedade tpAcid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpAcid(String value) {
                this.tpAcid = value;
            }

            /**
             * Obtém o valor da propriedade hrAcid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHrAcid() {
                return hrAcid;
            }

            /**
             * Define o valor da propriedade hrAcid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHrAcid(String value) {
                this.hrAcid = value;
            }

            /**
             * Obtém o valor da propriedade hrsTrabAntesAcid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHrsTrabAntesAcid() {
                return hrsTrabAntesAcid;
            }

            /**
             * Define o valor da propriedade hrsTrabAntesAcid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHrsTrabAntesAcid(String value) {
                this.hrsTrabAntesAcid = value;
            }

            /**
             * Obtém o valor da propriedade tpCat.
             * 
             */
            public byte getTpCat() {
                return tpCat;
            }

            /**
             * Define o valor da propriedade tpCat.
             * 
             */
            public void setTpCat(byte value) {
                this.tpCat = value;
            }

            /**
             * Obtém o valor da propriedade indCatObito.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndCatObito() {
                return indCatObito;
            }

            /**
             * Define o valor da propriedade indCatObito.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndCatObito(String value) {
                this.indCatObito = value;
            }

            /**
             * Obtém o valor da propriedade dtObito.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtObito() {
                return dtObito;
            }

            /**
             * Define o valor da propriedade dtObito.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtObito(XMLGregorianCalendar value) {
                this.dtObito = value;
            }

            /**
             * Obtém o valor da propriedade indComunPolicia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndComunPolicia() {
                return indComunPolicia;
            }

            /**
             * Define o valor da propriedade indComunPolicia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndComunPolicia(String value) {
                this.indComunPolicia = value;
            }

            /**
             * Obtém o valor da propriedade codSitGeradora.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodSitGeradora() {
                return codSitGeradora;
            }

            /**
             * Define o valor da propriedade codSitGeradora.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodSitGeradora(BigInteger value) {
                this.codSitGeradora = value;
            }

            /**
             * Obtém o valor da propriedade iniciatCAT.
             * 
             */
            public byte getIniciatCAT() {
                return iniciatCAT;
            }

            /**
             * Define o valor da propriedade iniciatCAT.
             * 
             */
            public void setIniciatCAT(byte value) {
                this.iniciatCAT = value;
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

            /**
             * Obtém o valor da propriedade localAcidente.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.LocalAcidente }
             *     
             */
            public ESocial.EvtCAT.Cat.LocalAcidente getLocalAcidente() {
                return localAcidente;
            }

            /**
             * Define o valor da propriedade localAcidente.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.LocalAcidente }
             *     
             */
            public void setLocalAcidente(ESocial.EvtCAT.Cat.LocalAcidente value) {
                this.localAcidente = value;
            }

            /**
             * Gets the value of the parteAtingida property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parteAtingida property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParteAtingida().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtCAT.Cat.ParteAtingida }
             * 
             * 
             */
            public List<ESocial.EvtCAT.Cat.ParteAtingida> getParteAtingida() {
                if (parteAtingida == null) {
                    parteAtingida = new ArrayList<ESocial.EvtCAT.Cat.ParteAtingida>();
                }
                return this.parteAtingida;
            }

            /**
             * Gets the value of the agenteCausador property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the agenteCausador property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAgenteCausador().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtCAT.Cat.AgenteCausador }
             * 
             * 
             */
            public List<ESocial.EvtCAT.Cat.AgenteCausador> getAgenteCausador() {
                if (agenteCausador == null) {
                    agenteCausador = new ArrayList<ESocial.EvtCAT.Cat.AgenteCausador>();
                }
                return this.agenteCausador;
            }

            /**
             * Obtém o valor da propriedade atestado.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.Atestado }
             *     
             */
            public ESocial.EvtCAT.Cat.Atestado getAtestado() {
                return atestado;
            }

            /**
             * Define o valor da propriedade atestado.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.Atestado }
             *     
             */
            public void setAtestado(ESocial.EvtCAT.Cat.Atestado value) {
                this.atestado = value;
            }

            /**
             * Obtém o valor da propriedade catOrigem.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.CatOrigem }
             *     
             */
            public ESocial.EvtCAT.Cat.CatOrigem getCatOrigem() {
                return catOrigem;
            }

            /**
             * Define o valor da propriedade catOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.CatOrigem }
             *     
             */
            public void setCatOrigem(ESocial.EvtCAT.Cat.CatOrigem value) {
                this.catOrigem = value;
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
             *         &lt;element name="codAgntCausador">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{3,9}"/>
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
                "codAgntCausador"
            })
            public static class AgenteCausador {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected BigInteger codAgntCausador;

                /**
                 * Obtém o valor da propriedade codAgntCausador.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCodAgntCausador() {
                    return codAgntCausador;
                }

                /**
                 * Define o valor da propriedade codAgntCausador.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCodAgntCausador(BigInteger value) {
                    this.codAgntCausador = value;
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
             *         &lt;element name="codCNES" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="7"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtAtendimento">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="hrAtendimento">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="indInternacao">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="durTrat">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{1,4}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="indAfast">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscLesao" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscCompLesao" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="200"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="diagProvavel" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codCID">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\w{3,4}"/>
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
             *         &lt;element name="emitente">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nmEmit">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="2"/>
             *                         &lt;maxLength value="70"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="ideOC">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nrOc">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;minLength value="3"/>
             *                         &lt;maxLength value="14"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="ufOC" minOccurs="0">
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
                "codCNES",
                "dtAtendimento",
                "hrAtendimento",
                "indInternacao",
                "durTrat",
                "indAfast",
                "dscLesao",
                "dscCompLesao",
                "diagProvavel",
                "codCID",
                "observacao",
                "emitente"
            })
            public static class Atestado {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String codCNES;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected XMLGregorianCalendar dtAtendimento;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected String hrAtendimento;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected String indInternacao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected BigInteger durTrat;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected String indAfast;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected BigInteger dscLesao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String dscCompLesao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String diagProvavel;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected String codCID;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String observacao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected ESocial.EvtCAT.Cat.Atestado.Emitente emitente;

                /**
                 * Obtém o valor da propriedade codCNES.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodCNES() {
                    return codCNES;
                }

                /**
                 * Define o valor da propriedade codCNES.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodCNES(String value) {
                    this.codCNES = value;
                }

                /**
                 * Obtém o valor da propriedade dtAtendimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAtendimento() {
                    return dtAtendimento;
                }

                /**
                 * Define o valor da propriedade dtAtendimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAtendimento(XMLGregorianCalendar value) {
                    this.dtAtendimento = value;
                }

                /**
                 * Obtém o valor da propriedade hrAtendimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHrAtendimento() {
                    return hrAtendimento;
                }

                /**
                 * Define o valor da propriedade hrAtendimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHrAtendimento(String value) {
                    this.hrAtendimento = value;
                }

                /**
                 * Obtém o valor da propriedade indInternacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndInternacao() {
                    return indInternacao;
                }

                /**
                 * Define o valor da propriedade indInternacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndInternacao(String value) {
                    this.indInternacao = value;
                }

                /**
                 * Obtém o valor da propriedade durTrat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDurTrat() {
                    return durTrat;
                }

                /**
                 * Define o valor da propriedade durTrat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDurTrat(BigInteger value) {
                    this.durTrat = value;
                }

                /**
                 * Obtém o valor da propriedade indAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndAfast() {
                    return indAfast;
                }

                /**
                 * Define o valor da propriedade indAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndAfast(String value) {
                    this.indAfast = value;
                }

                /**
                 * Obtém o valor da propriedade dscLesao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDscLesao() {
                    return dscLesao;
                }

                /**
                 * Define o valor da propriedade dscLesao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDscLesao(BigInteger value) {
                    this.dscLesao = value;
                }

                /**
                 * Obtém o valor da propriedade dscCompLesao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscCompLesao() {
                    return dscCompLesao;
                }

                /**
                 * Define o valor da propriedade dscCompLesao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscCompLesao(String value) {
                    this.dscCompLesao = value;
                }

                /**
                 * Obtém o valor da propriedade diagProvavel.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiagProvavel() {
                    return diagProvavel;
                }

                /**
                 * Define o valor da propriedade diagProvavel.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiagProvavel(String value) {
                    this.diagProvavel = value;
                }

                /**
                 * Obtém o valor da propriedade codCID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodCID() {
                    return codCID;
                }

                /**
                 * Define o valor da propriedade codCID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodCID(String value) {
                    this.codCID = value;
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

                /**
                 * Obtém o valor da propriedade emitente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCAT.Cat.Atestado.Emitente }
                 *     
                 */
                public ESocial.EvtCAT.Cat.Atestado.Emitente getEmitente() {
                    return emitente;
                }

                /**
                 * Define o valor da propriedade emitente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCAT.Cat.Atestado.Emitente }
                 *     
                 */
                public void setEmitente(ESocial.EvtCAT.Cat.Atestado.Emitente value) {
                    this.emitente = value;
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
                 *         &lt;element name="nmEmit">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="70"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="ideOC">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nrOc">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="3"/>
                 *               &lt;maxLength value="14"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="ufOC" minOccurs="0">
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
                    "nmEmit",
                    "ideOC",
                    "nrOc",
                    "ufOC"
                })
                public static class Emitente {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                    protected String nmEmit;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                    protected byte ideOC;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                    protected String nrOc;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                    protected String ufOC;

                    /**
                     * Obtém o valor da propriedade nmEmit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNmEmit() {
                        return nmEmit;
                    }

                    /**
                     * Define o valor da propriedade nmEmit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNmEmit(String value) {
                        this.nmEmit = value;
                    }

                    /**
                     * Obtém o valor da propriedade ideOC.
                     * 
                     */
                    public byte getIdeOC() {
                        return ideOC;
                    }

                    /**
                     * Define o valor da propriedade ideOC.
                     * 
                     */
                    public void setIdeOC(byte value) {
                        this.ideOC = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrOc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrOc() {
                        return nrOc;
                    }

                    /**
                     * Define o valor da propriedade nrOc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrOc(String value) {
                        this.nrOc = value;
                    }

                    /**
                     * Obtém o valor da propriedade ufOC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUfOC() {
                        return ufOC;
                    }

                    /**
                     * Define o valor da propriedade ufOC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUfOC(String value) {
                        this.ufOC = value;
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
             *         &lt;element name="dtCatOrig">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrCatOrig" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="40"/>
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
                "dtCatOrig",
                "nrCatOrig"
            })
            public static class CatOrigem {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected XMLGregorianCalendar dtCatOrig;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String nrCatOrig;

                /**
                 * Obtém o valor da propriedade dtCatOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtCatOrig() {
                    return dtCatOrig;
                }

                /**
                 * Define o valor da propriedade dtCatOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtCatOrig(XMLGregorianCalendar value) {
                    this.dtCatOrig = value;
                }

                /**
                 * Obtém o valor da propriedade nrCatOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrCatOrig() {
                    return nrCatOrig;
                }

                /**
                 * Define o valor da propriedade nrCatOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrCatOrig(String value) {
                    this.nrCatOrig = value;
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
             *         &lt;element name="tpLocal">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscLocal" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="80"/>
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
             *         &lt;element name="cnpjLocalAcid" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="14"/>
             *               &lt;pattern value="\d{8,14}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="pais" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{3}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codPostal" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="4"/>
             *               &lt;maxLength value="12"/>
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
                "tpLocal",
                "dscLocal",
                "dscLograd",
                "nrLograd",
                "codMunic",
                "uf",
                "cnpjLocalAcid",
                "pais",
                "codPostal"
            })
            public static class LocalAcidente {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected byte tpLocal;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String dscLocal;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String dscLograd;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String nrLograd;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected BigInteger codMunic;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String uf;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String cnpjLocalAcid;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String pais;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected String codPostal;

                /**
                 * Obtém o valor da propriedade tpLocal.
                 * 
                 */
                public byte getTpLocal() {
                    return tpLocal;
                }

                /**
                 * Define o valor da propriedade tpLocal.
                 * 
                 */
                public void setTpLocal(byte value) {
                    this.tpLocal = value;
                }

                /**
                 * Obtém o valor da propriedade dscLocal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscLocal() {
                    return dscLocal;
                }

                /**
                 * Define o valor da propriedade dscLocal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscLocal(String value) {
                    this.dscLocal = value;
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
                 * Obtém o valor da propriedade cnpjLocalAcid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCnpjLocalAcid() {
                    return cnpjLocalAcid;
                }

                /**
                 * Define o valor da propriedade cnpjLocalAcid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCnpjLocalAcid(String value) {
                    this.cnpjLocalAcid = value;
                }

                /**
                 * Obtém o valor da propriedade pais.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPais() {
                    return pais;
                }

                /**
                 * Define o valor da propriedade pais.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPais(String value) {
                    this.pais = value;
                }

                /**
                 * Obtém o valor da propriedade codPostal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodPostal() {
                    return codPostal;
                }

                /**
                 * Define o valor da propriedade codPostal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodPostal(String value) {
                    this.codPostal = value;
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
             *         &lt;element name="codParteAting">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{3,9}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="lateralidade">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
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
                "codParteAting",
                "lateralidade"
            })
            public static class ParteAtingida {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
                protected BigInteger codParteAting;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
                protected byte lateralidade;

                /**
                 * Obtém o valor da propriedade codParteAting.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCodParteAting() {
                    return codParteAting;
                }

                /**
                 * Define o valor da propriedade codParteAting.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCodParteAting(BigInteger value) {
                    this.codParteAting = value;
                }

                /**
                 * Obtém o valor da propriedade lateralidade.
                 * 
                 */
                public byte getLateralidade() {
                    return lateralidade;
                }

                /**
                 * Define o valor da propriedade lateralidade.
                 * 
                 */
                public void setLateralidade(byte value) {
                    this.lateralidade = value;
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
         *         &lt;element name="tpRegistrador">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d{1,2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpInsc" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrInsc" minOccurs="0">
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
            "tpRegistrador",
            "tpInsc",
            "nrInsc"
        })
        public static class IdeRegistrador {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected byte tpRegistrador;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected Byte tpInsc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected String nrInsc;

            /**
             * Obtém o valor da propriedade tpRegistrador.
             * 
             */
            public byte getTpRegistrador() {
                return tpRegistrador;
            }

            /**
             * Define o valor da propriedade tpRegistrador.
             * 
             */
            public void setTpRegistrador(byte value) {
                this.tpRegistrador = value;
            }

            /**
             * Obtém o valor da propriedade tpInsc.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getTpInsc() {
                return tpInsc;
            }

            /**
             * Define o valor da propriedade tpInsc.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setTpInsc(Byte value) {
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
            "nisTrab"
        })
        public static class IdeTrabalhador {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02", required = true)
            protected String cpfTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCAT/v02_04_02")
            protected String nisTrab;

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

        }

    }

}
