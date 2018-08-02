//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:57 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.deslig;

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
 *         &lt;element name="evtDeslig">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TIdeVinculoNisObrig"/>
 *                   &lt;element name="infoDeslig">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mtvDeslig">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtDeslig">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indPagtoAPI">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="1"/>
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtProjFimAPI" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="pensAlim">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="percAliment" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="5"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vrAlim" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="14"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrCertObito" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{32}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrProcTrab" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="3"/>
 *                                   &lt;maxLength value="21"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indCumprParc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="qtdDiasInterm" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d{1,2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="observacao">
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
 *                             &lt;element name="sucessaoVinc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cnpjSucessora">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{8,14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="transfTit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfSubstituto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{11}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtNascto">
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
 *                             &lt;element name="verbasResc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dmDev" maxOccurs="50">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ideDmDev">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoPerApur" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ideEstabLot" maxOccurs="24">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="tpInsc">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                           &lt;pattern value="\d"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="nrInsc">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;pattern value="\d{8,15}"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="codLotacao">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="1"/>
 *                                                                           &lt;maxLength value="30"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="detVerbas" maxOccurs="200">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="codRubr">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;minLength value="1"/>
 *                                                                                     &lt;maxLength value="30"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="ideTabRubr">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;minLength value="1"/>
 *                                                                                     &lt;maxLength value="8"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="qtdRubr" minOccurs="0">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                     &lt;totalDigits value="6"/>
 *                                                                                     &lt;fractionDigits value="2"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="fatorRubr" minOccurs="0">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                     &lt;totalDigits value="5"/>
 *                                                                                     &lt;fractionDigits value="2"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vrUnit" minOccurs="0">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                     &lt;totalDigits value="14"/>
 *                                                                                     &lt;fractionDigits value="2"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vrRubr">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                     &lt;totalDigits value="14"/>
 *                                                                                     &lt;fractionDigits value="2"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TSaudeCol" minOccurs="0"/>
 *                                                                     &lt;element name="infoAgNocivo" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="grauExp">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                     &lt;pattern value="\d"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="infoSimples" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="indSimples">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                     &lt;pattern value="\d"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoPerAnt" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ideADC" maxOccurs="8">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="dtAcConv">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="tpAcConv">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;length value="1"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="compAcConv" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="dtEfAcConv">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="dsc">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;whiteSpace value="preserve"/>
 *                                                                           &lt;minLength value="3"/>
 *                                                                           &lt;maxLength value="255"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="idePeriodo" maxOccurs="180">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="perRef">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;minLength value="4"/>
 *                                                                                     &lt;maxLength value="7"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="ideEstabLot" maxOccurs="24">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="tpInsc">
 *                                                                                           &lt;simpleType>
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                               &lt;pattern value="\d"/>
 *                                                                                             &lt;/restriction>
 *                                                                                           &lt;/simpleType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="nrInsc">
 *                                                                                           &lt;simpleType>
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                               &lt;pattern value="\d{8,15}"/>
 *                                                                                             &lt;/restriction>
 *                                                                                           &lt;/simpleType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="codLotacao">
 *                                                                                           &lt;simpleType>
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                               &lt;minLength value="1"/>
 *                                                                                               &lt;maxLength value="30"/>
 *                                                                                             &lt;/restriction>
 *                                                                                           &lt;/simpleType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="detVerbas" maxOccurs="200">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="codRubr">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;minLength value="1"/>
 *                                                                                                         &lt;maxLength value="30"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="ideTabRubr">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                                         &lt;minLength value="1"/>
 *                                                                                                         &lt;maxLength value="8"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="qtdRubr" minOccurs="0">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                                         &lt;totalDigits value="6"/>
 *                                                                                                         &lt;fractionDigits value="2"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="fatorRubr" minOccurs="0">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                                         &lt;totalDigits value="5"/>
 *                                                                                                         &lt;fractionDigits value="2"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="vrUnit" minOccurs="0">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                                         &lt;totalDigits value="14"/>
 *                                                                                                         &lt;fractionDigits value="2"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                   &lt;element name="vrRubr">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                                                         &lt;totalDigits value="14"/>
 *                                                                                                         &lt;fractionDigits value="2"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="infoAgNocivo" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="grauExp">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                                         &lt;pattern value="\d"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="infoSimples" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="indSimples">
 *                                                                                                     &lt;simpleType>
 *                                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                                         &lt;pattern value="\d"/>
 *                                                                                                       &lt;/restriction>
 *                                                                                                     &lt;/simpleType>
 *                                                                                                   &lt;/element>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="codConv">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="30"/>
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
 *                                       &lt;element name="procJudTrab" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpTrib">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nrProcJud">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="21"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="codSusp" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;pattern value="\d{1,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoMV" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indMV">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="procCS" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nrProcJud">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="21"/>
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
 *                             &lt;element name="quarentena" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtFimQuar">
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
 *                             &lt;element name="consigFGTS" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="insConsig">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrContr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{1,15}"/>
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
    "evtDeslig",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
    protected ESocial.EvtDeslig evtDeslig;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtDeslig.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtDeslig }
     *     
     */
    public ESocial.EvtDeslig getEvtDeslig() {
        return evtDeslig;
    }

    /**
     * Define o valor da propriedade evtDeslig.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtDeslig }
     *     
     */
    public void setEvtDeslig(ESocial.EvtDeslig value) {
        this.evtDeslig = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TIdeVinculoNisObrig"/>
     *         &lt;element name="infoDeslig">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mtvDeslig">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtDeslig">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indPagtoAPI">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="1"/>
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtProjFimAPI" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="pensAlim">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="percAliment" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="5"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vrAlim" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="14"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrCertObito" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{32}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrProcTrab" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="3"/>
     *                         &lt;maxLength value="21"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indCumprParc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="qtdDiasInterm" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d{1,2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="observacao">
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
     *                   &lt;element name="sucessaoVinc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cnpjSucessora">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{8,14}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="transfTit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfSubstituto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{11}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtNascto">
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
     *                   &lt;element name="verbasResc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dmDev" maxOccurs="50">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ideDmDev">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoPerApur" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ideEstabLot" maxOccurs="24">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="tpInsc">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                 &lt;pattern value="\d"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="nrInsc">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;pattern value="\d{8,15}"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="codLotacao">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;minLength value="1"/>
     *                                                                 &lt;maxLength value="30"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="detVerbas" maxOccurs="200">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="codRubr">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;minLength value="1"/>
     *                                                                           &lt;maxLength value="30"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="ideTabRubr">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;minLength value="1"/>
     *                                                                           &lt;maxLength value="8"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="qtdRubr" minOccurs="0">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                           &lt;totalDigits value="6"/>
     *                                                                           &lt;fractionDigits value="2"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="fatorRubr" minOccurs="0">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                           &lt;totalDigits value="5"/>
     *                                                                           &lt;fractionDigits value="2"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vrUnit" minOccurs="0">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                           &lt;totalDigits value="14"/>
     *                                                                           &lt;fractionDigits value="2"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vrRubr">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                           &lt;totalDigits value="14"/>
     *                                                                           &lt;fractionDigits value="2"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TSaudeCol" minOccurs="0"/>
     *                                                           &lt;element name="infoAgNocivo" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="grauExp">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                           &lt;pattern value="\d"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="infoSimples" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="indSimples">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                           &lt;pattern value="\d"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
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
     *                                       &lt;element name="infoPerAnt" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ideADC" maxOccurs="8">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="dtAcConv">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="tpAcConv">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;length value="1"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="compAcConv" minOccurs="0">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="dtEfAcConv">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="dsc">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;whiteSpace value="preserve"/>
     *                                                                 &lt;minLength value="3"/>
     *                                                                 &lt;maxLength value="255"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="idePeriodo" maxOccurs="180">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="perRef">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;minLength value="4"/>
     *                                                                           &lt;maxLength value="7"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="ideEstabLot" maxOccurs="24">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="tpInsc">
     *                                                                                 &lt;simpleType>
     *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                                     &lt;pattern value="\d"/>
     *                                                                                   &lt;/restriction>
     *                                                                                 &lt;/simpleType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="nrInsc">
     *                                                                                 &lt;simpleType>
     *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                     &lt;pattern value="\d{8,15}"/>
     *                                                                                   &lt;/restriction>
     *                                                                                 &lt;/simpleType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="codLotacao">
     *                                                                                 &lt;simpleType>
     *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                     &lt;minLength value="1"/>
     *                                                                                     &lt;maxLength value="30"/>
     *                                                                                   &lt;/restriction>
     *                                                                                 &lt;/simpleType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="detVerbas" maxOccurs="200">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="codRubr">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                               &lt;minLength value="1"/>
     *                                                                                               &lt;maxLength value="30"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="ideTabRubr">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                               &lt;minLength value="1"/>
     *                                                                                               &lt;maxLength value="8"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="qtdRubr" minOccurs="0">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                                               &lt;totalDigits value="6"/>
     *                                                                                               &lt;fractionDigits value="2"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="fatorRubr" minOccurs="0">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                                               &lt;totalDigits value="5"/>
     *                                                                                               &lt;fractionDigits value="2"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="vrUnit" minOccurs="0">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                                               &lt;totalDigits value="14"/>
     *                                                                                               &lt;fractionDigits value="2"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="vrRubr">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                                                               &lt;totalDigits value="14"/>
     *                                                                                               &lt;fractionDigits value="2"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="infoAgNocivo" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="grauExp">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                                               &lt;pattern value="\d"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="infoSimples" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="indSimples">
     *                                                                                           &lt;simpleType>
     *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                                               &lt;pattern value="\d"/>
     *                                                                                             &lt;/restriction>
     *                                                                                           &lt;/simpleType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
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
     *                                       &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="codConv">
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
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="procJudTrab" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpTrib">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nrProcJud">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="3"/>
     *                                             &lt;maxLength value="21"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="codSusp" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;pattern value="\d{1,14}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoMV" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indMV">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="procCS" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nrProcJud">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="3"/>
     *                                             &lt;maxLength value="21"/>
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
     *                   &lt;element name="quarentena" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtFimQuar">
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
     *                   &lt;element name="consigFGTS" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="insConsig">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrContr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{1,15}"/>
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
        "ideVinculo",
        "infoDeslig"
    })
    public static class EvtDeslig {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
        protected TIdeVinculoNisObrig ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
        protected ESocial.EvtDeslig.InfoDeslig infoDeslig;
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
         * Obtém o valor da propriedade ideVinculo.
         * 
         * @return
         *     possible object is
         *     {@link TIdeVinculoNisObrig }
         *     
         */
        public TIdeVinculoNisObrig getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVinculoNisObrig }
         *     
         */
        public void setIdeVinculo(TIdeVinculoNisObrig value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoDeslig.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtDeslig.InfoDeslig }
         *     
         */
        public ESocial.EvtDeslig.InfoDeslig getInfoDeslig() {
            return infoDeslig;
        }

        /**
         * Define o valor da propriedade infoDeslig.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtDeslig.InfoDeslig }
         *     
         */
        public void setInfoDeslig(ESocial.EvtDeslig.InfoDeslig value) {
            this.infoDeslig = value;
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
         *         &lt;element name="mtvDeslig">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtDeslig">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indPagtoAPI">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="1"/>
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtProjFimAPI" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="pensAlim">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="percAliment" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="5"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vrAlim" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="14"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrCertObito" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{32}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrProcTrab" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="3"/>
         *               &lt;maxLength value="21"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indCumprParc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="qtdDiasInterm" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d{1,2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="observacao">
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
         *         &lt;element name="sucessaoVinc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cnpjSucessora">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{8,14}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="transfTit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfSubstituto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{11}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtNascto">
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
         *         &lt;element name="verbasResc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dmDev" maxOccurs="50">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ideDmDev">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="infoPerApur" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ideEstabLot" maxOccurs="24">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="tpInsc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                       &lt;pattern value="\d"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="nrInsc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;pattern value="\d{8,15}"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="codLotacao">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="30"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="detVerbas" maxOccurs="200">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="codRubr">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;minLength value="1"/>
         *                                                                 &lt;maxLength value="30"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="ideTabRubr">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;minLength value="1"/>
         *                                                                 &lt;maxLength value="8"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="qtdRubr" minOccurs="0">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                 &lt;totalDigits value="6"/>
         *                                                                 &lt;fractionDigits value="2"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="fatorRubr" minOccurs="0">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                 &lt;totalDigits value="5"/>
         *                                                                 &lt;fractionDigits value="2"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vrUnit" minOccurs="0">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                 &lt;totalDigits value="14"/>
         *                                                                 &lt;fractionDigits value="2"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vrRubr">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                 &lt;totalDigits value="14"/>
         *                                                                 &lt;fractionDigits value="2"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TSaudeCol" minOccurs="0"/>
         *                                                 &lt;element name="infoAgNocivo" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="grauExp">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                                 &lt;pattern value="\d"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="infoSimples" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="indSimples">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                                 &lt;pattern value="\d"/>
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
         *                             &lt;element name="infoPerAnt" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ideADC" maxOccurs="8">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="dtAcConv">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="tpAcConv">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;length value="1"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="compAcConv" minOccurs="0">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="dtEfAcConv">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="dsc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;whiteSpace value="preserve"/>
         *                                                       &lt;minLength value="3"/>
         *                                                       &lt;maxLength value="255"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="idePeriodo" maxOccurs="180">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="perRef">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;minLength value="4"/>
         *                                                                 &lt;maxLength value="7"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="ideEstabLot" maxOccurs="24">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="tpInsc">
         *                                                                       &lt;simpleType>
         *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                                           &lt;pattern value="\d"/>
         *                                                                         &lt;/restriction>
         *                                                                       &lt;/simpleType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="nrInsc">
         *                                                                       &lt;simpleType>
         *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                           &lt;pattern value="\d{8,15}"/>
         *                                                                         &lt;/restriction>
         *                                                                       &lt;/simpleType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="codLotacao">
         *                                                                       &lt;simpleType>
         *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                           &lt;minLength value="1"/>
         *                                                                           &lt;maxLength value="30"/>
         *                                                                         &lt;/restriction>
         *                                                                       &lt;/simpleType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="detVerbas" maxOccurs="200">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="codRubr">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                     &lt;minLength value="1"/>
         *                                                                                     &lt;maxLength value="30"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="ideTabRubr">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                                     &lt;minLength value="1"/>
         *                                                                                     &lt;maxLength value="8"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="qtdRubr" minOccurs="0">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                                     &lt;totalDigits value="6"/>
         *                                                                                     &lt;fractionDigits value="2"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="fatorRubr" minOccurs="0">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                                     &lt;totalDigits value="5"/>
         *                                                                                     &lt;fractionDigits value="2"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="vrUnit" minOccurs="0">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                                     &lt;totalDigits value="14"/>
         *                                                                                     &lt;fractionDigits value="2"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="vrRubr">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                                                                     &lt;totalDigits value="14"/>
         *                                                                                     &lt;fractionDigits value="2"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="infoAgNocivo" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="grauExp">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                                                     &lt;pattern value="\d"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                     &lt;element name="infoSimples" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="indSimples">
         *                                                                                 &lt;simpleType>
         *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                                                     &lt;pattern value="\d"/>
         *                                                                                   &lt;/restriction>
         *                                                                                 &lt;/simpleType>
         *                                                                               &lt;/element>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
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
         *                             &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="codConv">
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
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="procJudTrab" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpTrib">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nrProcJud">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="3"/>
         *                                   &lt;maxLength value="21"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="codSusp" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;pattern value="\d{1,14}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoMV" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indMV">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="procCS" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nrProcJud">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="3"/>
         *                                   &lt;maxLength value="21"/>
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
         *         &lt;element name="quarentena" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtFimQuar">
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
         *         &lt;element name="consigFGTS" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="insConsig">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrContr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{1,15}"/>
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
            "mtvDeslig",
            "dtDeslig",
            "indPagtoAPI",
            "dtProjFimAPI",
            "pensAlim",
            "percAliment",
            "vrAlim",
            "nrCertObito",
            "nrProcTrab",
            "indCumprParc",
            "qtdDiasInterm",
            "observacoes",
            "sucessaoVinc",
            "transfTit",
            "verbasResc",
            "quarentena",
            "consigFGTS"
        })
        public static class InfoDeslig {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
            protected String mtvDeslig;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
            protected XMLGregorianCalendar dtDeslig;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
            protected String indPagtoAPI;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected XMLGregorianCalendar dtProjFimAPI;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected byte pensAlim;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected BigDecimal percAliment;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected BigDecimal vrAlim;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected String nrCertObito;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected String nrProcTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected byte indCumprParc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected Byte qtdDiasInterm;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected List<ESocial.EvtDeslig.InfoDeslig.Observacoes> observacoes;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected ESocial.EvtDeslig.InfoDeslig.SucessaoVinc sucessaoVinc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected ESocial.EvtDeslig.InfoDeslig.TransfTit transfTit;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected ESocial.EvtDeslig.InfoDeslig.VerbasResc verbasResc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected ESocial.EvtDeslig.InfoDeslig.Quarentena quarentena;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
            protected List<ESocial.EvtDeslig.InfoDeslig.ConsigFGTS> consigFGTS;

            /**
             * Obtém o valor da propriedade mtvDeslig.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMtvDeslig() {
                return mtvDeslig;
            }

            /**
             * Define o valor da propriedade mtvDeslig.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMtvDeslig(String value) {
                this.mtvDeslig = value;
            }

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

            /**
             * Obtém o valor da propriedade indPagtoAPI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndPagtoAPI() {
                return indPagtoAPI;
            }

            /**
             * Define o valor da propriedade indPagtoAPI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndPagtoAPI(String value) {
                this.indPagtoAPI = value;
            }

            /**
             * Obtém o valor da propriedade dtProjFimAPI.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtProjFimAPI() {
                return dtProjFimAPI;
            }

            /**
             * Define o valor da propriedade dtProjFimAPI.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtProjFimAPI(XMLGregorianCalendar value) {
                this.dtProjFimAPI = value;
            }

            /**
             * Obtém o valor da propriedade pensAlim.
             * 
             */
            public byte getPensAlim() {
                return pensAlim;
            }

            /**
             * Define o valor da propriedade pensAlim.
             * 
             */
            public void setPensAlim(byte value) {
                this.pensAlim = value;
            }

            /**
             * Obtém o valor da propriedade percAliment.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercAliment() {
                return percAliment;
            }

            /**
             * Define o valor da propriedade percAliment.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercAliment(BigDecimal value) {
                this.percAliment = value;
            }

            /**
             * Obtém o valor da propriedade vrAlim.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrAlim() {
                return vrAlim;
            }

            /**
             * Define o valor da propriedade vrAlim.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrAlim(BigDecimal value) {
                this.vrAlim = value;
            }

            /**
             * Obtém o valor da propriedade nrCertObito.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrCertObito() {
                return nrCertObito;
            }

            /**
             * Define o valor da propriedade nrCertObito.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrCertObito(String value) {
                this.nrCertObito = value;
            }

            /**
             * Obtém o valor da propriedade nrProcTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProcTrab() {
                return nrProcTrab;
            }

            /**
             * Define o valor da propriedade nrProcTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProcTrab(String value) {
                this.nrProcTrab = value;
            }

            /**
             * Obtém o valor da propriedade indCumprParc.
             * 
             */
            public byte getIndCumprParc() {
                return indCumprParc;
            }

            /**
             * Define o valor da propriedade indCumprParc.
             * 
             */
            public void setIndCumprParc(byte value) {
                this.indCumprParc = value;
            }

            /**
             * Obtém o valor da propriedade qtdDiasInterm.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getQtdDiasInterm() {
                return qtdDiasInterm;
            }

            /**
             * Define o valor da propriedade qtdDiasInterm.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setQtdDiasInterm(Byte value) {
                this.qtdDiasInterm = value;
            }

            /**
             * Gets the value of the observacoes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the observacoes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObservacoes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtDeslig.InfoDeslig.Observacoes }
             * 
             * 
             */
            public List<ESocial.EvtDeslig.InfoDeslig.Observacoes> getObservacoes() {
                if (observacoes == null) {
                    observacoes = new ArrayList<ESocial.EvtDeslig.InfoDeslig.Observacoes>();
                }
                return this.observacoes;
            }

            /**
             * Obtém o valor da propriedade sucessaoVinc.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.SucessaoVinc }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.SucessaoVinc getSucessaoVinc() {
                return sucessaoVinc;
            }

            /**
             * Define o valor da propriedade sucessaoVinc.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.SucessaoVinc }
             *     
             */
            public void setSucessaoVinc(ESocial.EvtDeslig.InfoDeslig.SucessaoVinc value) {
                this.sucessaoVinc = value;
            }

            /**
             * Obtém o valor da propriedade transfTit.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.TransfTit }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.TransfTit getTransfTit() {
                return transfTit;
            }

            /**
             * Define o valor da propriedade transfTit.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.TransfTit }
             *     
             */
            public void setTransfTit(ESocial.EvtDeslig.InfoDeslig.TransfTit value) {
                this.transfTit = value;
            }

            /**
             * Obtém o valor da propriedade verbasResc.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.VerbasResc getVerbasResc() {
                return verbasResc;
            }

            /**
             * Define o valor da propriedade verbasResc.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc }
             *     
             */
            public void setVerbasResc(ESocial.EvtDeslig.InfoDeslig.VerbasResc value) {
                this.verbasResc = value;
            }

            /**
             * Obtém o valor da propriedade quarentena.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.Quarentena }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.Quarentena getQuarentena() {
                return quarentena;
            }

            /**
             * Define o valor da propriedade quarentena.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.Quarentena }
             *     
             */
            public void setQuarentena(ESocial.EvtDeslig.InfoDeslig.Quarentena value) {
                this.quarentena = value;
            }

            /**
             * Gets the value of the consigFGTS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the consigFGTS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConsigFGTS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtDeslig.InfoDeslig.ConsigFGTS }
             * 
             * 
             */
            public List<ESocial.EvtDeslig.InfoDeslig.ConsigFGTS> getConsigFGTS() {
                if (consigFGTS == null) {
                    consigFGTS = new ArrayList<ESocial.EvtDeslig.InfoDeslig.ConsigFGTS>();
                }
                return this.consigFGTS;
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
             *         &lt;element name="insConsig">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrContr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{1,15}"/>
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
                "insConsig",
                "nrContr"
            })
            public static class ConsigFGTS {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected String insConsig;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected String nrContr;

                /**
                 * Obtém o valor da propriedade insConsig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInsConsig() {
                    return insConsig;
                }

                /**
                 * Define o valor da propriedade insConsig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInsConsig(String value) {
                    this.insConsig = value;
                }

                /**
                 * Obtém o valor da propriedade nrContr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrContr() {
                    return nrContr;
                }

                /**
                 * Define o valor da propriedade nrContr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrContr(String value) {
                    this.nrContr = value;
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
             *         &lt;element name="observacao">
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
                "observacao"
            })
            public static class Observacoes {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected String observacao;

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
             *         &lt;element name="dtFimQuar">
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
                "dtFimQuar"
            })
            public static class Quarentena {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected XMLGregorianCalendar dtFimQuar;

                /**
                 * Obtém o valor da propriedade dtFimQuar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtFimQuar() {
                    return dtFimQuar;
                }

                /**
                 * Define o valor da propriedade dtFimQuar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtFimQuar(XMLGregorianCalendar value) {
                    this.dtFimQuar = value;
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
             *         &lt;element name="cnpjSucessora">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{8,14}"/>
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
                "cnpjSucessora"
            })
            public static class SucessaoVinc {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected String cnpjSucessora;

                /**
                 * Obtém o valor da propriedade cnpjSucessora.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCnpjSucessora() {
                    return cnpjSucessora;
                }

                /**
                 * Define o valor da propriedade cnpjSucessora.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCnpjSucessora(String value) {
                    this.cnpjSucessora = value;
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
             *         &lt;element name="cpfSubstituto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{11}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtNascto">
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
                "cpfSubstituto",
                "dtNascto"
            })
            public static class TransfTit {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected String cpfSubstituto;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected XMLGregorianCalendar dtNascto;

                /**
                 * Obtém o valor da propriedade cpfSubstituto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfSubstituto() {
                    return cpfSubstituto;
                }

                /**
                 * Define o valor da propriedade cpfSubstituto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfSubstituto(String value) {
                    this.cpfSubstituto = value;
                }

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
             *         &lt;element name="dmDev" maxOccurs="50">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ideDmDev">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="infoPerApur" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ideEstabLot" maxOccurs="24">
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
             *                                       &lt;element name="codLotacao">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="30"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="detVerbas" maxOccurs="200">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="codRubr">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;minLength value="1"/>
             *                                                       &lt;maxLength value="30"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="ideTabRubr">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;minLength value="1"/>
             *                                                       &lt;maxLength value="8"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="qtdRubr" minOccurs="0">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                       &lt;totalDigits value="6"/>
             *                                                       &lt;fractionDigits value="2"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="fatorRubr" minOccurs="0">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                       &lt;totalDigits value="5"/>
             *                                                       &lt;fractionDigits value="2"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vrUnit" minOccurs="0">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                       &lt;totalDigits value="14"/>
             *                                                       &lt;fractionDigits value="2"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vrRubr">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                       &lt;totalDigits value="14"/>
             *                                                       &lt;fractionDigits value="2"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TSaudeCol" minOccurs="0"/>
             *                                       &lt;element name="infoAgNocivo" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="grauExp">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                                       &lt;pattern value="\d"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="infoSimples" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="indSimples">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                                       &lt;pattern value="\d"/>
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
             *                   &lt;element name="infoPerAnt" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ideADC" maxOccurs="8">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="dtAcConv">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="tpAcConv">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;length value="1"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="compAcConv" minOccurs="0">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="dtEfAcConv">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="dsc">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;whiteSpace value="preserve"/>
             *                                             &lt;minLength value="3"/>
             *                                             &lt;maxLength value="255"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="idePeriodo" maxOccurs="180">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="perRef">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;minLength value="4"/>
             *                                                       &lt;maxLength value="7"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="ideEstabLot" maxOccurs="24">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="tpInsc">
             *                                                             &lt;simpleType>
             *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                                                 &lt;pattern value="\d"/>
             *                                                               &lt;/restriction>
             *                                                             &lt;/simpleType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="nrInsc">
             *                                                             &lt;simpleType>
             *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                 &lt;pattern value="\d{8,15}"/>
             *                                                               &lt;/restriction>
             *                                                             &lt;/simpleType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="codLotacao">
             *                                                             &lt;simpleType>
             *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                 &lt;minLength value="1"/>
             *                                                                 &lt;maxLength value="30"/>
             *                                                               &lt;/restriction>
             *                                                             &lt;/simpleType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="detVerbas" maxOccurs="200">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="codRubr">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                           &lt;minLength value="1"/>
             *                                                                           &lt;maxLength value="30"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="ideTabRubr">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                                           &lt;minLength value="1"/>
             *                                                                           &lt;maxLength value="8"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="qtdRubr" minOccurs="0">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                                           &lt;totalDigits value="6"/>
             *                                                                           &lt;fractionDigits value="2"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="fatorRubr" minOccurs="0">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                                           &lt;totalDigits value="5"/>
             *                                                                           &lt;fractionDigits value="2"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="vrUnit" minOccurs="0">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                                           &lt;totalDigits value="14"/>
             *                                                                           &lt;fractionDigits value="2"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="vrRubr">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                                                           &lt;totalDigits value="14"/>
             *                                                                           &lt;fractionDigits value="2"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="infoAgNocivo" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="grauExp">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                                                           &lt;pattern value="\d"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                           &lt;element name="infoSimples" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="indSimples">
             *                                                                       &lt;simpleType>
             *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                                                           &lt;pattern value="\d"/>
             *                                                                         &lt;/restriction>
             *                                                                       &lt;/simpleType>
             *                                                                     &lt;/element>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
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
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="codConv">
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
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="procJudTrab" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpTrib">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nrProcJud">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="3"/>
             *                         &lt;maxLength value="21"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="codSusp" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;pattern value="\d{1,14}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoMV" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indMV">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="procCS" minOccurs="0">
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
                "dmDev",
                "procJudTrab",
                "infoMV",
                "procCS"
            })
            public static class VerbasResc {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev> dmDev;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcJudTrab> procJudTrab;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.InfoMV infoMV;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS procCS;

                /**
                 * Gets the value of the dmDev property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dmDev property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDmDev().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev }
                 * 
                 * 
                 */
                public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev> getDmDev() {
                    if (dmDev == null) {
                        dmDev = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev>();
                    }
                    return this.dmDev;
                }

                /**
                 * Gets the value of the procJudTrab property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procJudTrab property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcJudTrab().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcJudTrab }
                 * 
                 * 
                 */
                public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcJudTrab> getProcJudTrab() {
                    if (procJudTrab == null) {
                        procJudTrab = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcJudTrab>();
                    }
                    return this.procJudTrab;
                }

                /**
                 * Obtém o valor da propriedade infoMV.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.InfoMV }
                 *     
                 */
                public ESocial.EvtDeslig.InfoDeslig.VerbasResc.InfoMV getInfoMV() {
                    return infoMV;
                }

                /**
                 * Define o valor da propriedade infoMV.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.InfoMV }
                 *     
                 */
                public void setInfoMV(ESocial.EvtDeslig.InfoDeslig.VerbasResc.InfoMV value) {
                    this.infoMV = value;
                }

                /**
                 * Obtém o valor da propriedade procCS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS }
                 *     
                 */
                public ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS getProcCS() {
                    return procCS;
                }

                /**
                 * Define o valor da propriedade procCS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS }
                 *     
                 */
                public void setProcCS(ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS value) {
                    this.procCS = value;
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
                 *         &lt;element name="ideDmDev">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infoPerApur" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ideEstabLot" maxOccurs="24">
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
                 *                             &lt;element name="codLotacao">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="30"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="detVerbas" maxOccurs="200">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="codRubr">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;minLength value="1"/>
                 *                                             &lt;maxLength value="30"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="ideTabRubr">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;minLength value="1"/>
                 *                                             &lt;maxLength value="8"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="qtdRubr" minOccurs="0">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                             &lt;totalDigits value="6"/>
                 *                                             &lt;fractionDigits value="2"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="fatorRubr" minOccurs="0">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                             &lt;totalDigits value="5"/>
                 *                                             &lt;fractionDigits value="2"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vrUnit" minOccurs="0">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                             &lt;totalDigits value="14"/>
                 *                                             &lt;fractionDigits value="2"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vrRubr">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                             &lt;totalDigits value="14"/>
                 *                                             &lt;fractionDigits value="2"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TSaudeCol" minOccurs="0"/>
                 *                             &lt;element name="infoAgNocivo" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="grauExp">
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
                 *                             &lt;element name="infoSimples" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="indSimples">
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
                 *         &lt;element name="infoPerAnt" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ideADC" maxOccurs="8">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="dtAcConv">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="tpAcConv">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;length value="1"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="compAcConv" minOccurs="0">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="dtEfAcConv">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="dsc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;whiteSpace value="preserve"/>
                 *                                   &lt;minLength value="3"/>
                 *                                   &lt;maxLength value="255"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="idePeriodo" maxOccurs="180">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="perRef">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;minLength value="4"/>
                 *                                             &lt;maxLength value="7"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="ideEstabLot" maxOccurs="24">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="tpInsc">
                 *                                                   &lt;simpleType>
                 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                                       &lt;pattern value="\d"/>
                 *                                                     &lt;/restriction>
                 *                                                   &lt;/simpleType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="nrInsc">
                 *                                                   &lt;simpleType>
                 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                       &lt;pattern value="\d{8,15}"/>
                 *                                                     &lt;/restriction>
                 *                                                   &lt;/simpleType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="codLotacao">
                 *                                                   &lt;simpleType>
                 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                       &lt;minLength value="1"/>
                 *                                                       &lt;maxLength value="30"/>
                 *                                                     &lt;/restriction>
                 *                                                   &lt;/simpleType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="detVerbas" maxOccurs="200">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="codRubr">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                                 &lt;minLength value="1"/>
                 *                                                                 &lt;maxLength value="30"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="ideTabRubr">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                                 &lt;minLength value="1"/>
                 *                                                                 &lt;maxLength value="8"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="qtdRubr" minOccurs="0">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                                                 &lt;totalDigits value="6"/>
                 *                                                                 &lt;fractionDigits value="2"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="fatorRubr" minOccurs="0">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                                                 &lt;totalDigits value="5"/>
                 *                                                                 &lt;fractionDigits value="2"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="vrUnit" minOccurs="0">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                                                 &lt;totalDigits value="14"/>
                 *                                                                 &lt;fractionDigits value="2"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="vrRubr">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                                                                 &lt;totalDigits value="14"/>
                 *                                                                 &lt;fractionDigits value="2"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="infoAgNocivo" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="grauExp">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                                                 &lt;pattern value="\d"/>
                 *                                                               &lt;/restriction>
                 *                                                             &lt;/simpleType>
                 *                                                           &lt;/element>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                                 &lt;element name="infoSimples" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="indSimples">
                 *                                                             &lt;simpleType>
                 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                                                 &lt;pattern value="\d"/>
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
                 *         &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="codConv">
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
                    "ideDmDev",
                    "infoPerApur",
                    "infoPerAnt",
                    "infoTrabInterm"
                })
                public static class DmDev {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                    protected String ideDmDev;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                    protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur infoPerApur;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                    protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt infoPerAnt;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                    protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoTrabInterm> infoTrabInterm;

                    /**
                     * Obtém o valor da propriedade ideDmDev.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdeDmDev() {
                        return ideDmDev;
                    }

                    /**
                     * Define o valor da propriedade ideDmDev.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdeDmDev(String value) {
                        this.ideDmDev = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoPerApur.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur }
                     *     
                     */
                    public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur getInfoPerApur() {
                        return infoPerApur;
                    }

                    /**
                     * Define o valor da propriedade infoPerApur.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur }
                     *     
                     */
                    public void setInfoPerApur(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur value) {
                        this.infoPerApur = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoPerAnt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt }
                     *     
                     */
                    public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt getInfoPerAnt() {
                        return infoPerAnt;
                    }

                    /**
                     * Define o valor da propriedade infoPerAnt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt }
                     *     
                     */
                    public void setInfoPerAnt(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt value) {
                        this.infoPerAnt = value;
                    }

                    /**
                     * Gets the value of the infoTrabInterm property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoTrabInterm property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoTrabInterm().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoTrabInterm }
                     * 
                     * 
                     */
                    public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoTrabInterm> getInfoTrabInterm() {
                        if (infoTrabInterm == null) {
                            infoTrabInterm = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoTrabInterm>();
                        }
                        return this.infoTrabInterm;
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
                     *         &lt;element name="ideADC" maxOccurs="8">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="dtAcConv">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="tpAcConv">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;length value="1"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="compAcConv" minOccurs="0">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="dtEfAcConv">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="dsc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;whiteSpace value="preserve"/>
                     *                         &lt;minLength value="3"/>
                     *                         &lt;maxLength value="255"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="idePeriodo" maxOccurs="180">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="perRef">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;minLength value="4"/>
                     *                                   &lt;maxLength value="7"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="ideEstabLot" maxOccurs="24">
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
                     *                                       &lt;element name="codLotacao">
                     *                                         &lt;simpleType>
                     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                             &lt;minLength value="1"/>
                     *                                             &lt;maxLength value="30"/>
                     *                                           &lt;/restriction>
                     *                                         &lt;/simpleType>
                     *                                       &lt;/element>
                     *                                       &lt;element name="detVerbas" maxOccurs="200">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="codRubr">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                       &lt;minLength value="1"/>
                     *                                                       &lt;maxLength value="30"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="ideTabRubr">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                                       &lt;minLength value="1"/>
                     *                                                       &lt;maxLength value="8"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="qtdRubr" minOccurs="0">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                                       &lt;totalDigits value="6"/>
                     *                                                       &lt;fractionDigits value="2"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="fatorRubr" minOccurs="0">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                                       &lt;totalDigits value="5"/>
                     *                                                       &lt;fractionDigits value="2"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="vrUnit" minOccurs="0">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                                       &lt;totalDigits value="14"/>
                     *                                                       &lt;fractionDigits value="2"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="vrRubr">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                                       &lt;totalDigits value="14"/>
                     *                                                       &lt;fractionDigits value="2"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                       &lt;element name="infoAgNocivo" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="grauExp">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                                                       &lt;pattern value="\d"/>
                     *                                                     &lt;/restriction>
                     *                                                   &lt;/simpleType>
                     *                                                 &lt;/element>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                       &lt;element name="infoSimples" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="indSimples">
                     *                                                   &lt;simpleType>
                     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                                                       &lt;pattern value="\d"/>
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
                        "ideADC"
                    })
                    public static class InfoPerAnt {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                        protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC> ideADC;

                        /**
                         * Gets the value of the ideADC property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ideADC property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdeADC().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC }
                         * 
                         * 
                         */
                        public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC> getIdeADC() {
                            if (ideADC == null) {
                                ideADC = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC>();
                            }
                            return this.ideADC;
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
                         *         &lt;element name="dtAcConv">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="tpAcConv">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;length value="1"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="compAcConv" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="dtEfAcConv">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="dsc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;whiteSpace value="preserve"/>
                         *               &lt;minLength value="3"/>
                         *               &lt;maxLength value="255"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="idePeriodo" maxOccurs="180">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="perRef">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;minLength value="4"/>
                         *                         &lt;maxLength value="7"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="ideEstabLot" maxOccurs="24">
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
                         *                             &lt;element name="codLotacao">
                         *                               &lt;simpleType>
                         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                   &lt;minLength value="1"/>
                         *                                   &lt;maxLength value="30"/>
                         *                                 &lt;/restriction>
                         *                               &lt;/simpleType>
                         *                             &lt;/element>
                         *                             &lt;element name="detVerbas" maxOccurs="200">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="codRubr">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                             &lt;minLength value="1"/>
                         *                                             &lt;maxLength value="30"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="ideTabRubr">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                                             &lt;minLength value="1"/>
                         *                                             &lt;maxLength value="8"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="qtdRubr" minOccurs="0">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                                             &lt;totalDigits value="6"/>
                         *                                             &lt;fractionDigits value="2"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="fatorRubr" minOccurs="0">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                                             &lt;totalDigits value="5"/>
                         *                                             &lt;fractionDigits value="2"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="vrUnit" minOccurs="0">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                                             &lt;totalDigits value="14"/>
                         *                                             &lt;fractionDigits value="2"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="vrRubr">
                         *                                         &lt;simpleType>
                         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                                             &lt;totalDigits value="14"/>
                         *                                             &lt;fractionDigits value="2"/>
                         *                                           &lt;/restriction>
                         *                                         &lt;/simpleType>
                         *                                       &lt;/element>
                         *                                     &lt;/sequence>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                             &lt;element name="infoAgNocivo" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="grauExp">
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
                         *                             &lt;element name="infoSimples" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="indSimples">
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
                            "dtAcConv",
                            "tpAcConv",
                            "compAcConv",
                            "dtEfAcConv",
                            "dsc",
                            "idePeriodo"
                        })
                        public static class IdeADC {

                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected XMLGregorianCalendar dtAcConv;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected String tpAcConv;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                            protected String compAcConv;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected XMLGregorianCalendar dtEfAcConv;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected String dsc;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo> idePeriodo;

                            /**
                             * Obtém o valor da propriedade dtAcConv.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public XMLGregorianCalendar getDtAcConv() {
                                return dtAcConv;
                            }

                            /**
                             * Define o valor da propriedade dtAcConv.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public void setDtAcConv(XMLGregorianCalendar value) {
                                this.dtAcConv = value;
                            }

                            /**
                             * Obtém o valor da propriedade tpAcConv.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTpAcConv() {
                                return tpAcConv;
                            }

                            /**
                             * Define o valor da propriedade tpAcConv.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTpAcConv(String value) {
                                this.tpAcConv = value;
                            }

                            /**
                             * Obtém o valor da propriedade compAcConv.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCompAcConv() {
                                return compAcConv;
                            }

                            /**
                             * Define o valor da propriedade compAcConv.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCompAcConv(String value) {
                                this.compAcConv = value;
                            }

                            /**
                             * Obtém o valor da propriedade dtEfAcConv.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public XMLGregorianCalendar getDtEfAcConv() {
                                return dtEfAcConv;
                            }

                            /**
                             * Define o valor da propriedade dtEfAcConv.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public void setDtEfAcConv(XMLGregorianCalendar value) {
                                this.dtEfAcConv = value;
                            }

                            /**
                             * Obtém o valor da propriedade dsc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDsc() {
                                return dsc;
                            }

                            /**
                             * Define o valor da propriedade dsc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDsc(String value) {
                                this.dsc = value;
                            }

                            /**
                             * Gets the value of the idePeriodo property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the idePeriodo property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getIdePeriodo().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo }
                             * 
                             * 
                             */
                            public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo> getIdePeriodo() {
                                if (idePeriodo == null) {
                                    idePeriodo = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo>();
                                }
                                return this.idePeriodo;
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
                             *         &lt;element name="perRef">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;minLength value="4"/>
                             *               &lt;maxLength value="7"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="ideEstabLot" maxOccurs="24">
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
                             *                   &lt;element name="codLotacao">
                             *                     &lt;simpleType>
                             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                         &lt;minLength value="1"/>
                             *                         &lt;maxLength value="30"/>
                             *                       &lt;/restriction>
                             *                     &lt;/simpleType>
                             *                   &lt;/element>
                             *                   &lt;element name="detVerbas" maxOccurs="200">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="codRubr">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                   &lt;minLength value="1"/>
                             *                                   &lt;maxLength value="30"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                             &lt;element name="ideTabRubr">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                                   &lt;minLength value="1"/>
                             *                                   &lt;maxLength value="8"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                             &lt;element name="qtdRubr" minOccurs="0">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *                                   &lt;totalDigits value="6"/>
                             *                                   &lt;fractionDigits value="2"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                             &lt;element name="fatorRubr" minOccurs="0">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *                                   &lt;totalDigits value="5"/>
                             *                                   &lt;fractionDigits value="2"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                             &lt;element name="vrUnit" minOccurs="0">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *                                   &lt;totalDigits value="14"/>
                             *                                   &lt;fractionDigits value="2"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                             &lt;element name="vrRubr">
                             *                               &lt;simpleType>
                             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *                                   &lt;totalDigits value="14"/>
                             *                                   &lt;fractionDigits value="2"/>
                             *                                 &lt;/restriction>
                             *                               &lt;/simpleType>
                             *                             &lt;/element>
                             *                           &lt;/sequence>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                   &lt;element name="infoAgNocivo" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="grauExp">
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
                             *                   &lt;element name="infoSimples" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="indSimples">
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
                                "perRef",
                                "ideEstabLot"
                            })
                            public static class IdePeriodo {

                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                protected String perRef;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> ideEstabLot;

                                /**
                                 * Obtém o valor da propriedade perRef.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getPerRef() {
                                    return perRef;
                                }

                                /**
                                 * Define o valor da propriedade perRef.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setPerRef(String value) {
                                    this.perRef = value;
                                }

                                /**
                                 * Gets the value of the ideEstabLot property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the ideEstabLot property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getIdeEstabLot().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot }
                                 * 
                                 * 
                                 */
                                public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> getIdeEstabLot() {
                                    if (ideEstabLot == null) {
                                        ideEstabLot = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot>();
                                    }
                                    return this.ideEstabLot;
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
                                 *         &lt;element name="codLotacao">
                                 *           &lt;simpleType>
                                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *               &lt;minLength value="1"/>
                                 *               &lt;maxLength value="30"/>
                                 *             &lt;/restriction>
                                 *           &lt;/simpleType>
                                 *         &lt;/element>
                                 *         &lt;element name="detVerbas" maxOccurs="200">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="codRubr">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                         &lt;minLength value="1"/>
                                 *                         &lt;maxLength value="30"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="ideTabRubr">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                 *                         &lt;minLength value="1"/>
                                 *                         &lt;maxLength value="8"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="qtdRubr" minOccurs="0">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                 *                         &lt;totalDigits value="6"/>
                                 *                         &lt;fractionDigits value="2"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="fatorRubr" minOccurs="0">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                 *                         &lt;totalDigits value="5"/>
                                 *                         &lt;fractionDigits value="2"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="vrUnit" minOccurs="0">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                 *                         &lt;totalDigits value="14"/>
                                 *                         &lt;fractionDigits value="2"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="vrRubr">
                                 *                     &lt;simpleType>
                                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                 *                         &lt;totalDigits value="14"/>
                                 *                         &lt;fractionDigits value="2"/>
                                 *                       &lt;/restriction>
                                 *                     &lt;/simpleType>
                                 *                   &lt;/element>
                                 *                 &lt;/sequence>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *         &lt;element name="infoAgNocivo" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="grauExp">
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
                                 *         &lt;element name="infoSimples" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="indSimples">
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
                                    "codLotacao",
                                    "detVerbas",
                                    "infoAgNocivo",
                                    "infoSimples"
                                })
                                public static class IdeEstabLot {

                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                    protected byte tpInsc;
                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                    protected String nrInsc;
                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                    protected String codLotacao;
                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                    protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.DetVerbas> detVerbas;
                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                    protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoAgNocivo infoAgNocivo;
                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                    protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoSimples infoSimples;

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
                                     * Obtém o valor da propriedade codLotacao.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getCodLotacao() {
                                        return codLotacao;
                                    }

                                    /**
                                     * Define o valor da propriedade codLotacao.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setCodLotacao(String value) {
                                        this.codLotacao = value;
                                    }

                                    /**
                                     * Gets the value of the detVerbas property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the detVerbas property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getDetVerbas().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.DetVerbas }
                                     * 
                                     * 
                                     */
                                    public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.DetVerbas> getDetVerbas() {
                                        if (detVerbas == null) {
                                            detVerbas = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.DetVerbas>();
                                        }
                                        return this.detVerbas;
                                    }

                                    /**
                                     * Obtém o valor da propriedade infoAgNocivo.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoAgNocivo }
                                     *     
                                     */
                                    public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoAgNocivo getInfoAgNocivo() {
                                        return infoAgNocivo;
                                    }

                                    /**
                                     * Define o valor da propriedade infoAgNocivo.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoAgNocivo }
                                     *     
                                     */
                                    public void setInfoAgNocivo(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoAgNocivo value) {
                                        this.infoAgNocivo = value;
                                    }

                                    /**
                                     * Obtém o valor da propriedade infoSimples.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoSimples }
                                     *     
                                     */
                                    public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoSimples getInfoSimples() {
                                        return infoSimples;
                                    }

                                    /**
                                     * Define o valor da propriedade infoSimples.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoSimples }
                                     *     
                                     */
                                    public void setInfoSimples(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.InfoSimples value) {
                                        this.infoSimples = value;
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
                                     *         &lt;element name="codRubr">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *               &lt;minLength value="1"/>
                                     *               &lt;maxLength value="30"/>
                                     *             &lt;/restriction>
                                     *           &lt;/simpleType>
                                     *         &lt;/element>
                                     *         &lt;element name="ideTabRubr">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                                     *               &lt;minLength value="1"/>
                                     *               &lt;maxLength value="8"/>
                                     *             &lt;/restriction>
                                     *           &lt;/simpleType>
                                     *         &lt;/element>
                                     *         &lt;element name="qtdRubr" minOccurs="0">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                     *               &lt;totalDigits value="6"/>
                                     *               &lt;fractionDigits value="2"/>
                                     *             &lt;/restriction>
                                     *           &lt;/simpleType>
                                     *         &lt;/element>
                                     *         &lt;element name="fatorRubr" minOccurs="0">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                     *               &lt;totalDigits value="5"/>
                                     *               &lt;fractionDigits value="2"/>
                                     *             &lt;/restriction>
                                     *           &lt;/simpleType>
                                     *         &lt;/element>
                                     *         &lt;element name="vrUnit" minOccurs="0">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                     *               &lt;totalDigits value="14"/>
                                     *               &lt;fractionDigits value="2"/>
                                     *             &lt;/restriction>
                                     *           &lt;/simpleType>
                                     *         &lt;/element>
                                     *         &lt;element name="vrRubr">
                                     *           &lt;simpleType>
                                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                                     *               &lt;totalDigits value="14"/>
                                     *               &lt;fractionDigits value="2"/>
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
                                        "codRubr",
                                        "ideTabRubr",
                                        "qtdRubr",
                                        "fatorRubr",
                                        "vrUnit",
                                        "vrRubr"
                                    })
                                    public static class DetVerbas {

                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                        protected String codRubr;
                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                        protected String ideTabRubr;
                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                        protected BigDecimal qtdRubr;
                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                        protected BigDecimal fatorRubr;
                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                        protected BigDecimal vrUnit;
                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                        protected BigDecimal vrRubr;

                                        /**
                                         * Obtém o valor da propriedade codRubr.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getCodRubr() {
                                            return codRubr;
                                        }

                                        /**
                                         * Define o valor da propriedade codRubr.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setCodRubr(String value) {
                                            this.codRubr = value;
                                        }

                                        /**
                                         * Obtém o valor da propriedade ideTabRubr.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getIdeTabRubr() {
                                            return ideTabRubr;
                                        }

                                        /**
                                         * Define o valor da propriedade ideTabRubr.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setIdeTabRubr(String value) {
                                            this.ideTabRubr = value;
                                        }

                                        /**
                                         * Obtém o valor da propriedade qtdRubr.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public BigDecimal getQtdRubr() {
                                            return qtdRubr;
                                        }

                                        /**
                                         * Define o valor da propriedade qtdRubr.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public void setQtdRubr(BigDecimal value) {
                                            this.qtdRubr = value;
                                        }

                                        /**
                                         * Obtém o valor da propriedade fatorRubr.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public BigDecimal getFatorRubr() {
                                            return fatorRubr;
                                        }

                                        /**
                                         * Define o valor da propriedade fatorRubr.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public void setFatorRubr(BigDecimal value) {
                                            this.fatorRubr = value;
                                        }

                                        /**
                                         * Obtém o valor da propriedade vrUnit.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public BigDecimal getVrUnit() {
                                            return vrUnit;
                                        }

                                        /**
                                         * Define o valor da propriedade vrUnit.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public void setVrUnit(BigDecimal value) {
                                            this.vrUnit = value;
                                        }

                                        /**
                                         * Obtém o valor da propriedade vrRubr.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public BigDecimal getVrRubr() {
                                            return vrRubr;
                                        }

                                        /**
                                         * Define o valor da propriedade vrRubr.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public void setVrRubr(BigDecimal value) {
                                            this.vrRubr = value;
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
                                     *         &lt;element name="grauExp">
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
                                        "grauExp"
                                    })
                                    public static class InfoAgNocivo {

                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                        protected byte grauExp;

                                        /**
                                         * Obtém o valor da propriedade grauExp.
                                         * 
                                         */
                                        public byte getGrauExp() {
                                            return grauExp;
                                        }

                                        /**
                                         * Define o valor da propriedade grauExp.
                                         * 
                                         */
                                        public void setGrauExp(byte value) {
                                            this.grauExp = value;
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
                                     *         &lt;element name="indSimples">
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
                                        "indSimples"
                                    })
                                    public static class InfoSimples {

                                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                        protected byte indSimples;

                                        /**
                                         * Obtém o valor da propriedade indSimples.
                                         * 
                                         */
                                        public byte getIndSimples() {
                                            return indSimples;
                                        }

                                        /**
                                         * Define o valor da propriedade indSimples.
                                         * 
                                         */
                                        public void setIndSimples(byte value) {
                                            this.indSimples = value;
                                        }

                                    }

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
                     *         &lt;element name="ideEstabLot" maxOccurs="24">
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
                     *                   &lt;element name="codLotacao">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="30"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="detVerbas" maxOccurs="200">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="codRubr">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;minLength value="1"/>
                     *                                   &lt;maxLength value="30"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="ideTabRubr">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;minLength value="1"/>
                     *                                   &lt;maxLength value="8"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="qtdRubr" minOccurs="0">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                   &lt;totalDigits value="6"/>
                     *                                   &lt;fractionDigits value="2"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="fatorRubr" minOccurs="0">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                   &lt;totalDigits value="5"/>
                     *                                   &lt;fractionDigits value="2"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vrUnit" minOccurs="0">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                   &lt;totalDigits value="14"/>
                     *                                   &lt;fractionDigits value="2"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vrRubr">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *                                   &lt;totalDigits value="14"/>
                     *                                   &lt;fractionDigits value="2"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TSaudeCol" minOccurs="0"/>
                     *                   &lt;element name="infoAgNocivo" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="grauExp">
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
                     *                   &lt;element name="infoSimples" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="indSimples">
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
                        "ideEstabLot"
                    })
                    public static class InfoPerApur {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                        protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot> ideEstabLot;

                        /**
                         * Gets the value of the ideEstabLot property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ideEstabLot property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdeEstabLot().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot }
                         * 
                         * 
                         */
                        public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot> getIdeEstabLot() {
                            if (ideEstabLot == null) {
                                ideEstabLot = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot>();
                            }
                            return this.ideEstabLot;
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
                         *         &lt;element name="codLotacao">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="30"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="detVerbas" maxOccurs="200">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="codRubr">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;minLength value="1"/>
                         *                         &lt;maxLength value="30"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="ideTabRubr">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;minLength value="1"/>
                         *                         &lt;maxLength value="8"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="qtdRubr" minOccurs="0">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                         &lt;totalDigits value="6"/>
                         *                         &lt;fractionDigits value="2"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="fatorRubr" minOccurs="0">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                         &lt;totalDigits value="5"/>
                         *                         &lt;fractionDigits value="2"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vrUnit" minOccurs="0">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                         &lt;totalDigits value="14"/>
                         *                         &lt;fractionDigits value="2"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vrRubr">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                         *                         &lt;totalDigits value="14"/>
                         *                         &lt;fractionDigits value="2"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TSaudeCol" minOccurs="0"/>
                         *         &lt;element name="infoAgNocivo" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="grauExp">
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
                         *         &lt;element name="infoSimples" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="indSimples">
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
                            "codLotacao",
                            "detVerbas",
                            "infoSaudeColet",
                            "infoAgNocivo",
                            "infoSimples"
                        })
                        public static class IdeEstabLot {

                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                            protected byte tpInsc;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected String nrInsc;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected String codLotacao;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                            protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.DetVerbas> detVerbas;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                            protected TSaudeCol infoSaudeColet;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                            protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoAgNocivo infoAgNocivo;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                            protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoSimples infoSimples;

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
                             * Obtém o valor da propriedade codLotacao.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodLotacao() {
                                return codLotacao;
                            }

                            /**
                             * Define o valor da propriedade codLotacao.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodLotacao(String value) {
                                this.codLotacao = value;
                            }

                            /**
                             * Gets the value of the detVerbas property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the detVerbas property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getDetVerbas().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.DetVerbas }
                             * 
                             * 
                             */
                            public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.DetVerbas> getDetVerbas() {
                                if (detVerbas == null) {
                                    detVerbas = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.DetVerbas>();
                                }
                                return this.detVerbas;
                            }

                            /**
                             * Obtém o valor da propriedade infoSaudeColet.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TSaudeCol }
                             *     
                             */
                            public TSaudeCol getInfoSaudeColet() {
                                return infoSaudeColet;
                            }

                            /**
                             * Define o valor da propriedade infoSaudeColet.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TSaudeCol }
                             *     
                             */
                            public void setInfoSaudeColet(TSaudeCol value) {
                                this.infoSaudeColet = value;
                            }

                            /**
                             * Obtém o valor da propriedade infoAgNocivo.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoAgNocivo }
                             *     
                             */
                            public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoAgNocivo getInfoAgNocivo() {
                                return infoAgNocivo;
                            }

                            /**
                             * Define o valor da propriedade infoAgNocivo.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoAgNocivo }
                             *     
                             */
                            public void setInfoAgNocivo(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoAgNocivo value) {
                                this.infoAgNocivo = value;
                            }

                            /**
                             * Obtém o valor da propriedade infoSimples.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoSimples }
                             *     
                             */
                            public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoSimples getInfoSimples() {
                                return infoSimples;
                            }

                            /**
                             * Define o valor da propriedade infoSimples.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoSimples }
                             *     
                             */
                            public void setInfoSimples(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur.IdeEstabLot.InfoSimples value) {
                                this.infoSimples = value;
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
                             *         &lt;element name="codRubr">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;minLength value="1"/>
                             *               &lt;maxLength value="30"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="ideTabRubr">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;minLength value="1"/>
                             *               &lt;maxLength value="8"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="qtdRubr" minOccurs="0">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *               &lt;totalDigits value="6"/>
                             *               &lt;fractionDigits value="2"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="fatorRubr" minOccurs="0">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *               &lt;totalDigits value="5"/>
                             *               &lt;fractionDigits value="2"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vrUnit" minOccurs="0">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *               &lt;totalDigits value="14"/>
                             *               &lt;fractionDigits value="2"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vrRubr">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                             *               &lt;totalDigits value="14"/>
                             *               &lt;fractionDigits value="2"/>
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
                                "codRubr",
                                "ideTabRubr",
                                "qtdRubr",
                                "fatorRubr",
                                "vrUnit",
                                "vrRubr"
                            })
                            public static class DetVerbas {

                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                protected String codRubr;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                protected String ideTabRubr;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                protected BigDecimal qtdRubr;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                protected BigDecimal fatorRubr;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                protected BigDecimal vrUnit;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                                protected BigDecimal vrRubr;

                                /**
                                 * Obtém o valor da propriedade codRubr.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodRubr() {
                                    return codRubr;
                                }

                                /**
                                 * Define o valor da propriedade codRubr.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodRubr(String value) {
                                    this.codRubr = value;
                                }

                                /**
                                 * Obtém o valor da propriedade ideTabRubr.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getIdeTabRubr() {
                                    return ideTabRubr;
                                }

                                /**
                                 * Define o valor da propriedade ideTabRubr.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setIdeTabRubr(String value) {
                                    this.ideTabRubr = value;
                                }

                                /**
                                 * Obtém o valor da propriedade qtdRubr.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getQtdRubr() {
                                    return qtdRubr;
                                }

                                /**
                                 * Define o valor da propriedade qtdRubr.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setQtdRubr(BigDecimal value) {
                                    this.qtdRubr = value;
                                }

                                /**
                                 * Obtém o valor da propriedade fatorRubr.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getFatorRubr() {
                                    return fatorRubr;
                                }

                                /**
                                 * Define o valor da propriedade fatorRubr.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setFatorRubr(BigDecimal value) {
                                    this.fatorRubr = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vrUnit.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVrUnit() {
                                    return vrUnit;
                                }

                                /**
                                 * Define o valor da propriedade vrUnit.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVrUnit(BigDecimal value) {
                                    this.vrUnit = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vrRubr.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVrRubr() {
                                    return vrRubr;
                                }

                                /**
                                 * Define o valor da propriedade vrRubr.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVrRubr(BigDecimal value) {
                                    this.vrRubr = value;
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
                             *         &lt;element name="grauExp">
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
                                "grauExp"
                            })
                            public static class InfoAgNocivo {

                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                protected byte grauExp;

                                /**
                                 * Obtém o valor da propriedade grauExp.
                                 * 
                                 */
                                public byte getGrauExp() {
                                    return grauExp;
                                }

                                /**
                                 * Define o valor da propriedade grauExp.
                                 * 
                                 */
                                public void setGrauExp(byte value) {
                                    this.grauExp = value;
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
                             *         &lt;element name="indSimples">
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
                                "indSimples"
                            })
                            public static class InfoSimples {

                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                                protected byte indSimples;

                                /**
                                 * Obtém o valor da propriedade indSimples.
                                 * 
                                 */
                                public byte getIndSimples() {
                                    return indSimples;
                                }

                                /**
                                 * Define o valor da propriedade indSimples.
                                 * 
                                 */
                                public void setIndSimples(byte value) {
                                    this.indSimples = value;
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
                     *         &lt;element name="codConv">
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
                        "codConv"
                    })
                    public static class InfoTrabInterm {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                        protected String codConv;

                        /**
                         * Obtém o valor da propriedade codConv.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodConv() {
                            return codConv;
                        }

                        /**
                         * Define o valor da propriedade codConv.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodConv(String value) {
                            this.codConv = value;
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
                 *         &lt;element name="indMV">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
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
                    "indMV",
                    "remunOutrEmpr"
                })
                public static class InfoMV {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                    protected byte indMV;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                    protected List<TRemunOutrasEmpresas> remunOutrEmpr;

                    /**
                     * Obtém o valor da propriedade indMV.
                     * 
                     */
                    public byte getIndMV() {
                        return indMV;
                    }

                    /**
                     * Define o valor da propriedade indMV.
                     * 
                     */
                    public void setIndMV(byte value) {
                        this.indMV = value;
                    }

                    /**
                     * Gets the value of the remunOutrEmpr property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remunOutrEmpr property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemunOutrEmpr().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TRemunOutrasEmpresas }
                     * 
                     * 
                     */
                    public List<TRemunOutrasEmpresas> getRemunOutrEmpr() {
                        if (remunOutrEmpr == null) {
                            remunOutrEmpr = new ArrayList<TRemunOutrasEmpresas>();
                        }
                        return this.remunOutrEmpr;
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
                public static class ProcCS {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
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
                 *         &lt;element name="tpTrib">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nrProcJud">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="3"/>
                 *               &lt;maxLength value="21"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="codSusp" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;pattern value="\d{1,14}"/>
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
                    "tpTrib",
                    "nrProcJud",
                    "codSusp"
                })
                public static class ProcJudTrab {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                    protected byte tpTrib;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02", required = true)
                    protected String nrProcJud;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtDeslig/v02_04_02")
                    protected BigInteger codSusp;

                    /**
                     * Obtém o valor da propriedade tpTrib.
                     * 
                     */
                    public byte getTpTrib() {
                        return tpTrib;
                    }

                    /**
                     * Define o valor da propriedade tpTrib.
                     * 
                     */
                    public void setTpTrib(byte value) {
                        this.tpTrib = value;
                    }

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

                    /**
                     * Obtém o valor da propriedade codSusp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCodSusp() {
                        return codSusp;
                    }

                    /**
                     * Define o valor da propriedade codSusp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCodSusp(BigInteger value) {
                        this.codSusp = value;
                    }

                }

            }

        }

    }

}
