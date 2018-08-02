//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:05 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.remun;

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
 *         &lt;element name="evtRemun">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indRetif">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrRecibo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indApuracao">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="perApur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="4"/>
 *                                   &lt;maxLength value="7"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAmb">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="procEmi">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="verProc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TEmpregador"/>
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
 *                                       &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoComplem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nmTrab">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="2"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtNascto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="sucessaoVinc" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjEmpregAnt">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="\d{8,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="matricAnt" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dtAdm">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="observacao" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="255"/>
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
 *                             &lt;element name="infoInterm" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="qtdDiasInterm">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d{1,2}"/>
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
 *                   &lt;element name="dmDev" maxOccurs="99">
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
 *                             &lt;element name="codCateg">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="\d{3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoPerApur" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ideEstabLot" maxOccurs="500">
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
 *                                                 &lt;element name="qtdDiasAv" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d{1,2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="remunPerApur" maxOccurs="8">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="matricula" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="30"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="indSimples" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                 &lt;pattern value="\d"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
 *                                                           &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TSaudeCol" minOccurs="0"/>
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
 *                                                           &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="codConv">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="1"/>
 *                                                                           &lt;maxLength value="30"/>
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
 *                                                 &lt;element name="dtAcConv" minOccurs="0">
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
 *                                                 &lt;element name="dtEfAcConv" minOccurs="0">
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
 *                                                 &lt;element name="remunSuc">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="[N|S]"/>
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
 *                                                           &lt;element name="ideEstabLot" maxOccurs="500">
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
 *                                                                     &lt;element name="remunPerAnt" maxOccurs="8">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="matricula" minOccurs="0">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;minLength value="1"/>
 *                                                                                     &lt;maxLength value="30"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="indSimples" minOccurs="0">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                     &lt;pattern value="\d"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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
 *                                                                               &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="codConv">
 *                                                                                           &lt;simpleType>
 *                                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                               &lt;minLength value="1"/>
 *                                                                                               &lt;maxLength value="30"/>
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
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoComplCont" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codCBO">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{4,6}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="natAtividade" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="qtdDiasTrab" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d{1,2}"/>
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
    "evtRemun",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
    protected ESocial.EvtRemun evtRemun;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtRemun.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtRemun }
     *     
     */
    public ESocial.EvtRemun getEvtRemun() {
        return evtRemun;
    }

    /**
     * Define o valor da propriedade evtRemun.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtRemun }
     *     
     */
    public void setEvtRemun(ESocial.EvtRemun value) {
        this.evtRemun = value;
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
     *         &lt;element name="ideEvento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indRetif">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrRecibo" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indApuracao">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="perApur">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="4"/>
     *                         &lt;maxLength value="7"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpAmb">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="procEmi">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="verProc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TEmpregador"/>
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
     *                             &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoComplem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nmTrab">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="2"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtNascto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
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
     *                                       &lt;element name="dtAdm">
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
     *                   &lt;element name="infoInterm" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="qtdDiasInterm">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d{1,2}"/>
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
     *         &lt;element name="dmDev" maxOccurs="99">
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
     *                   &lt;element name="codCateg">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="\d{3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoPerApur" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ideEstabLot" maxOccurs="500">
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
     *                                       &lt;element name="qtdDiasAv" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d{1,2}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="remunPerApur" maxOccurs="8">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="matricula" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="30"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="indSimples" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                       &lt;pattern value="\d"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
     *                                                 &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TSaudeCol" minOccurs="0"/>
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
     *                                       &lt;element name="dtAcConv" minOccurs="0">
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
     *                                       &lt;element name="dtEfAcConv" minOccurs="0">
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
     *                                       &lt;element name="remunSuc">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="[N|S]"/>
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
     *                                                 &lt;element name="ideEstabLot" maxOccurs="500">
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
     *                                                           &lt;element name="remunPerAnt" maxOccurs="8">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="matricula" minOccurs="0">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;minLength value="1"/>
     *                                                                           &lt;maxLength value="30"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="indSimples" minOccurs="0">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                           &lt;pattern value="\d"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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
     *                                                                     &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="codConv">
     *                                                                                 &lt;simpleType>
     *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                                     &lt;minLength value="1"/>
     *                                                                                     &lt;maxLength value="30"/>
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
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoComplCont" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codCBO">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{4,6}"/>
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
     *                             &lt;element name="qtdDiasTrab" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d{1,2}"/>
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
        "ideTrabalhador",
        "dmDev"
    })
    public static class EvtRemun {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
        protected ESocial.EvtRemun.IdeEvento ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
        protected ESocial.EvtRemun.IdeTrabalhador ideTrabalhador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
        protected List<ESocial.EvtRemun.DmDev> dmDev;
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
         *     {@link ESocial.EvtRemun.IdeEvento }
         *     
         */
        public ESocial.EvtRemun.IdeEvento getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtRemun.IdeEvento }
         *     
         */
        public void setIdeEvento(ESocial.EvtRemun.IdeEvento value) {
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
         * Obtém o valor da propriedade ideTrabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtRemun.IdeTrabalhador }
         *     
         */
        public ESocial.EvtRemun.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtRemun.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtRemun.IdeTrabalhador value) {
            this.ideTrabalhador = value;
        }

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
         * {@link ESocial.EvtRemun.DmDev }
         * 
         * 
         */
        public List<ESocial.EvtRemun.DmDev> getDmDev() {
            if (dmDev == null) {
                dmDev = new ArrayList<ESocial.EvtRemun.DmDev>();
            }
            return this.dmDev;
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
         *         &lt;element name="ideDmDev">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
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
         *         &lt;element name="infoPerApur" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ideEstabLot" maxOccurs="500">
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
         *                             &lt;element name="qtdDiasAv" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d{1,2}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="remunPerApur" maxOccurs="8">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="matricula" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="30"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="indSimples" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                             &lt;pattern value="\d"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
         *                                       &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TSaudeCol" minOccurs="0"/>
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
         *                             &lt;element name="dtAcConv" minOccurs="0">
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
         *                             &lt;element name="dtEfAcConv" minOccurs="0">
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
         *                             &lt;element name="remunSuc">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="[N|S]"/>
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
         *                                       &lt;element name="ideEstabLot" maxOccurs="500">
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
         *                                                 &lt;element name="remunPerAnt" maxOccurs="8">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="matricula" minOccurs="0">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;minLength value="1"/>
         *                                                                 &lt;maxLength value="30"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="indSimples" minOccurs="0">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                                 &lt;pattern value="\d"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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
         *                                                           &lt;element name="infoTrabInterm" maxOccurs="99" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="codConv">
         *                                                                       &lt;simpleType>
         *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                           &lt;minLength value="1"/>
         *                                                                           &lt;maxLength value="30"/>
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
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoComplCont" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codCBO">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{4,6}"/>
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
         *                   &lt;element name="qtdDiasTrab" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d{1,2}"/>
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
            "codCateg",
            "infoPerApur",
            "infoPerAnt",
            "infoComplCont"
        })
        public static class DmDev {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
            protected String ideDmDev;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
            protected BigInteger codCateg;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected ESocial.EvtRemun.DmDev.InfoPerApur infoPerApur;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected ESocial.EvtRemun.DmDev.InfoPerAnt infoPerAnt;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected ESocial.EvtRemun.DmDev.InfoComplCont infoComplCont;

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
             * Obtém o valor da propriedade infoPerApur.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerApur }
             *     
             */
            public ESocial.EvtRemun.DmDev.InfoPerApur getInfoPerApur() {
                return infoPerApur;
            }

            /**
             * Define o valor da propriedade infoPerApur.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerApur }
             *     
             */
            public void setInfoPerApur(ESocial.EvtRemun.DmDev.InfoPerApur value) {
                this.infoPerApur = value;
            }

            /**
             * Obtém o valor da propriedade infoPerAnt.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerAnt }
             *     
             */
            public ESocial.EvtRemun.DmDev.InfoPerAnt getInfoPerAnt() {
                return infoPerAnt;
            }

            /**
             * Define o valor da propriedade infoPerAnt.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerAnt }
             *     
             */
            public void setInfoPerAnt(ESocial.EvtRemun.DmDev.InfoPerAnt value) {
                this.infoPerAnt = value;
            }

            /**
             * Obtém o valor da propriedade infoComplCont.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.DmDev.InfoComplCont }
             *     
             */
            public ESocial.EvtRemun.DmDev.InfoComplCont getInfoComplCont() {
                return infoComplCont;
            }

            /**
             * Define o valor da propriedade infoComplCont.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.DmDev.InfoComplCont }
             *     
             */
            public void setInfoComplCont(ESocial.EvtRemun.DmDev.InfoComplCont value) {
                this.infoComplCont = value;
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
             *         &lt;element name="codCBO">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{4,6}"/>
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
             *         &lt;element name="qtdDiasTrab" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d{1,2}"/>
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
                "codCBO",
                "natAtividade",
                "qtdDiasTrab"
            })
            public static class InfoComplCont {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                protected String codCBO;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                protected Byte natAtividade;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                protected Byte qtdDiasTrab;

                /**
                 * Obtém o valor da propriedade codCBO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodCBO() {
                    return codCBO;
                }

                /**
                 * Define o valor da propriedade codCBO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodCBO(String value) {
                    this.codCBO = value;
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
                 * Obtém o valor da propriedade qtdDiasTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getQtdDiasTrab() {
                    return qtdDiasTrab;
                }

                /**
                 * Define o valor da propriedade qtdDiasTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setQtdDiasTrab(Byte value) {
                    this.qtdDiasTrab = value;
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
             *         &lt;element name="ideADC" maxOccurs="8">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dtAcConv" minOccurs="0">
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
             *                   &lt;element name="dtEfAcConv" minOccurs="0">
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
             *                   &lt;element name="remunSuc">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="[N|S]"/>
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
             *                             &lt;element name="ideEstabLot" maxOccurs="500">
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
             *                                       &lt;element name="remunPerAnt" maxOccurs="8">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="matricula" minOccurs="0">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;minLength value="1"/>
             *                                                       &lt;maxLength value="30"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="indSimples" minOccurs="0">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                                       &lt;pattern value="\d"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC> ideADC;

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
                 * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC }
                 * 
                 * 
                 */
                public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC> getIdeADC() {
                    if (ideADC == null) {
                        ideADC = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC>();
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
                 *         &lt;element name="dtAcConv" minOccurs="0">
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
                 *         &lt;element name="dtEfAcConv" minOccurs="0">
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
                 *         &lt;element name="remunSuc">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="[N|S]"/>
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
                 *                   &lt;element name="ideEstabLot" maxOccurs="500">
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
                 *                             &lt;element name="remunPerAnt" maxOccurs="8">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="matricula" minOccurs="0">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;minLength value="1"/>
                 *                                             &lt;maxLength value="30"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="indSimples" minOccurs="0">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                             &lt;pattern value="\d"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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
                    "remunSuc",
                    "idePeriodo"
                })
                public static class IdeADC {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                    protected XMLGregorianCalendar dtAcConv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected String tpAcConv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                    protected String compAcConv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                    protected XMLGregorianCalendar dtEfAcConv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected String dsc;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected String remunSuc;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo> idePeriodo;

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
                     * Obtém o valor da propriedade remunSuc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRemunSuc() {
                        return remunSuc;
                    }

                    /**
                     * Define o valor da propriedade remunSuc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRemunSuc(String value) {
                        this.remunSuc = value;
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
                     * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo }
                     * 
                     * 
                     */
                    public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo> getIdePeriodo() {
                        if (idePeriodo == null) {
                            idePeriodo = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo>();
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
                     *         &lt;element name="ideEstabLot" maxOccurs="500">
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
                     *                   &lt;element name="remunPerAnt" maxOccurs="8">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="matricula" minOccurs="0">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;minLength value="1"/>
                     *                                   &lt;maxLength value="30"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="indSimples" minOccurs="0">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                                   &lt;pattern value="\d"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                        protected String perRef;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                        protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> ideEstabLot;

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
                         * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot }
                         * 
                         * 
                         */
                        public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> getIdeEstabLot() {
                            if (ideEstabLot == null) {
                                ideEstabLot = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot>();
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
                         *         &lt;element name="remunPerAnt" maxOccurs="8">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="matricula" minOccurs="0">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;minLength value="1"/>
                         *                         &lt;maxLength value="30"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="indSimples" minOccurs="0">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                         *                         &lt;pattern value="\d"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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
                            "remunPerAnt"
                        })
                        public static class IdeEstabLot {

                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                            protected byte tpInsc;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                            protected String nrInsc;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                            protected String codLotacao;
                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                            protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt> remunPerAnt;

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
                             * Gets the value of the remunPerAnt property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the remunPerAnt property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getRemunPerAnt().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt }
                             * 
                             * 
                             */
                            public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt> getRemunPerAnt() {
                                if (remunPerAnt == null) {
                                    remunPerAnt = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt>();
                                }
                                return this.remunPerAnt;
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
                             *         &lt;element name="matricula" minOccurs="0">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;minLength value="1"/>
                             *               &lt;maxLength value="30"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="indSimples" minOccurs="0">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                             *               &lt;pattern value="\d"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
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
                                "matricula",
                                "indSimples",
                                "itensRemun",
                                "infoAgNocivo",
                                "infoTrabInterm"
                            })
                            public static class RemunPerAnt {

                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                                protected String matricula;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                                protected Byte indSimples;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                                protected List<TItemRemuneracao> itensRemun;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                                protected ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoAgNocivo infoAgNocivo;
                                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                                protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoTrabInterm> infoTrabInterm;

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
                                 * Obtém o valor da propriedade indSimples.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Byte }
                                 *     
                                 */
                                public Byte getIndSimples() {
                                    return indSimples;
                                }

                                /**
                                 * Define o valor da propriedade indSimples.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Byte }
                                 *     
                                 */
                                public void setIndSimples(Byte value) {
                                    this.indSimples = value;
                                }

                                /**
                                 * Gets the value of the itensRemun property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the itensRemun property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getItensRemun().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link TItemRemuneracao }
                                 * 
                                 * 
                                 */
                                public List<TItemRemuneracao> getItensRemun() {
                                    if (itensRemun == null) {
                                        itensRemun = new ArrayList<TItemRemuneracao>();
                                    }
                                    return this.itensRemun;
                                }

                                /**
                                 * Obtém o valor da propriedade infoAgNocivo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoAgNocivo }
                                 *     
                                 */
                                public ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoAgNocivo getInfoAgNocivo() {
                                    return infoAgNocivo;
                                }

                                /**
                                 * Define o valor da propriedade infoAgNocivo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoAgNocivo }
                                 *     
                                 */
                                public void setInfoAgNocivo(ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoAgNocivo value) {
                                    this.infoAgNocivo = value;
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
                                 * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoTrabInterm }
                                 * 
                                 * 
                                 */
                                public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoTrabInterm> getInfoTrabInterm() {
                                    if (infoTrabInterm == null) {
                                        infoTrabInterm = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt.InfoTrabInterm>();
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

                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
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

                                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
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
             *         &lt;element name="ideEstabLot" maxOccurs="500">
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
             *                   &lt;element name="qtdDiasAv" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d{1,2}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="remunPerApur" maxOccurs="8">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="matricula" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="30"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="indSimples" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                   &lt;pattern value="\d"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
             *                             &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TSaudeCol" minOccurs="0"/>
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

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                protected List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot> ideEstabLot;

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
                 * {@link ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot }
                 * 
                 * 
                 */
                public List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot> getIdeEstabLot() {
                    if (ideEstabLot == null) {
                        ideEstabLot = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot>();
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
                 *         &lt;element name="qtdDiasAv" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d{1,2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="remunPerApur" maxOccurs="8">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="matricula" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="30"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="indSimples" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;pattern value="\d"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
                 *                   &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TSaudeCol" minOccurs="0"/>
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
                    "qtdDiasAv",
                    "remunPerApur"
                })
                public static class IdeEstabLot {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                    protected byte tpInsc;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected String nrInsc;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected String codLotacao;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                    protected Byte qtdDiasAv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur> remunPerApur;

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
                     * Obtém o valor da propriedade qtdDiasAv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getQtdDiasAv() {
                        return qtdDiasAv;
                    }

                    /**
                     * Define o valor da propriedade qtdDiasAv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setQtdDiasAv(Byte value) {
                        this.qtdDiasAv = value;
                    }

                    /**
                     * Gets the value of the remunPerApur property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remunPerApur property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemunPerApur().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur }
                     * 
                     * 
                     */
                    public List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur> getRemunPerApur() {
                        if (remunPerApur == null) {
                            remunPerApur = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur>();
                        }
                        return this.remunPerApur;
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
                     *         &lt;element name="matricula" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="30"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="indSimples" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;pattern value="\d"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TItemRemuneracao" maxOccurs="200"/>
                     *         &lt;element name="infoSaudeColet" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TSaudeCol" minOccurs="0"/>
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
                        "matricula",
                        "indSimples",
                        "itensRemun",
                        "infoSaudeColet",
                        "infoAgNocivo",
                        "infoTrabInterm"
                    })
                    public static class RemunPerApur {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                        protected String matricula;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                        protected Byte indSimples;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                        protected List<TItemRemuneracao> itensRemun;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                        protected TSaudeCol infoSaudeColet;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                        protected ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoAgNocivo infoAgNocivo;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                        protected List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoTrabInterm> infoTrabInterm;

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
                         * Obtém o valor da propriedade indSimples.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getIndSimples() {
                            return indSimples;
                        }

                        /**
                         * Define o valor da propriedade indSimples.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setIndSimples(Byte value) {
                            this.indSimples = value;
                        }

                        /**
                         * Gets the value of the itensRemun property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the itensRemun property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getItensRemun().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TItemRemuneracao }
                         * 
                         * 
                         */
                        public List<TItemRemuneracao> getItensRemun() {
                            if (itensRemun == null) {
                                itensRemun = new ArrayList<TItemRemuneracao>();
                            }
                            return this.itensRemun;
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
                         *     {@link ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoAgNocivo }
                         *     
                         */
                        public ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoAgNocivo getInfoAgNocivo() {
                            return infoAgNocivo;
                        }

                        /**
                         * Define o valor da propriedade infoAgNocivo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoAgNocivo }
                         *     
                         */
                        public void setInfoAgNocivo(ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoAgNocivo value) {
                            this.infoAgNocivo = value;
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
                         * {@link ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoTrabInterm }
                         * 
                         * 
                         */
                        public List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoTrabInterm> getInfoTrabInterm() {
                            if (infoTrabInterm == null) {
                                infoTrabInterm = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur.InfoTrabInterm>();
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

                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
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

                            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
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
         *         &lt;element name="indRetif">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrRecibo" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indApuracao">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="perApur">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="4"/>
         *               &lt;maxLength value="7"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAmb">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="procEmi">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="verProc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
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
            "indRetif",
            "nrRecibo",
            "indApuracao",
            "perApur",
            "tpAmb",
            "procEmi",
            "verProc"
        })
        public static class IdeEvento {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected byte indRetif;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected String nrRecibo;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected byte indApuracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
            protected String perApur;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected byte tpAmb;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected byte procEmi;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
            protected String verProc;

            /**
             * Obtém o valor da propriedade indRetif.
             * 
             */
            public byte getIndRetif() {
                return indRetif;
            }

            /**
             * Define o valor da propriedade indRetif.
             * 
             */
            public void setIndRetif(byte value) {
                this.indRetif = value;
            }

            /**
             * Obtém o valor da propriedade nrRecibo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecibo() {
                return nrRecibo;
            }

            /**
             * Define o valor da propriedade nrRecibo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecibo(String value) {
                this.nrRecibo = value;
            }

            /**
             * Obtém o valor da propriedade indApuracao.
             * 
             */
            public byte getIndApuracao() {
                return indApuracao;
            }

            /**
             * Define o valor da propriedade indApuracao.
             * 
             */
            public void setIndApuracao(byte value) {
                this.indApuracao = value;
            }

            /**
             * Obtém o valor da propriedade perApur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPerApur() {
                return perApur;
            }

            /**
             * Define o valor da propriedade perApur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPerApur(String value) {
                this.perApur = value;
            }

            /**
             * Obtém o valor da propriedade tpAmb.
             * 
             */
            public byte getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             * 
             */
            public void setTpAmb(byte value) {
                this.tpAmb = value;
            }

            /**
             * Obtém o valor da propriedade procEmi.
             * 
             */
            public byte getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             * 
             */
            public void setProcEmi(byte value) {
                this.procEmi = value;
            }

            /**
             * Obtém o valor da propriedade verProc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
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
         *                   &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoComplem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nmTrab">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="2"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtNascto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
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
         *                             &lt;element name="dtAdm">
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
         *         &lt;element name="infoInterm" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="qtdDiasInterm">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d{1,2}"/>
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
            "cpfTrab",
            "nisTrab",
            "infoMV",
            "infoComplem",
            "procJudTrab",
            "infoInterm"
        })
        public static class IdeTrabalhador {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
            protected String cpfTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected String nisTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected ESocial.EvtRemun.IdeTrabalhador.InfoMV infoMV;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected ESocial.EvtRemun.IdeTrabalhador.InfoComplem infoComplem;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected List<ESocial.EvtRemun.IdeTrabalhador.ProcJudTrab> procJudTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
            protected ESocial.EvtRemun.IdeTrabalhador.InfoInterm infoInterm;

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
             * Obtém o valor da propriedade infoMV.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoMV }
             *     
             */
            public ESocial.EvtRemun.IdeTrabalhador.InfoMV getInfoMV() {
                return infoMV;
            }

            /**
             * Define o valor da propriedade infoMV.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoMV }
             *     
             */
            public void setInfoMV(ESocial.EvtRemun.IdeTrabalhador.InfoMV value) {
                this.infoMV = value;
            }

            /**
             * Obtém o valor da propriedade infoComplem.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem }
             *     
             */
            public ESocial.EvtRemun.IdeTrabalhador.InfoComplem getInfoComplem() {
                return infoComplem;
            }

            /**
             * Define o valor da propriedade infoComplem.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem }
             *     
             */
            public void setInfoComplem(ESocial.EvtRemun.IdeTrabalhador.InfoComplem value) {
                this.infoComplem = value;
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
             * {@link ESocial.EvtRemun.IdeTrabalhador.ProcJudTrab }
             * 
             * 
             */
            public List<ESocial.EvtRemun.IdeTrabalhador.ProcJudTrab> getProcJudTrab() {
                if (procJudTrab == null) {
                    procJudTrab = new ArrayList<ESocial.EvtRemun.IdeTrabalhador.ProcJudTrab>();
                }
                return this.procJudTrab;
            }

            /**
             * Obtém o valor da propriedade infoInterm.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoInterm }
             *     
             */
            public ESocial.EvtRemun.IdeTrabalhador.InfoInterm getInfoInterm() {
                return infoInterm;
            }

            /**
             * Define o valor da propriedade infoInterm.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoInterm }
             *     
             */
            public void setInfoInterm(ESocial.EvtRemun.IdeTrabalhador.InfoInterm value) {
                this.infoInterm = value;
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
             *         &lt;element name="nmTrab">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtNascto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
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
             *                   &lt;element name="dtAdm">
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
                "nmTrab",
                "dtNascto",
                "sucessaoVinc"
            })
            public static class InfoComplem {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                protected String nmTrab;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                protected XMLGregorianCalendar dtNascto;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                protected ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc sucessaoVinc;

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
                 * Obtém o valor da propriedade sucessaoVinc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc }
                 *     
                 */
                public ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc getSucessaoVinc() {
                    return sucessaoVinc;
                }

                /**
                 * Define o valor da propriedade sucessaoVinc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc }
                 *     
                 */
                public void setSucessaoVinc(ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc value) {
                    this.sucessaoVinc = value;
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
                 *         &lt;element name="dtAdm">
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
                    "dtAdm",
                    "observacao"
                })
                public static class SucessaoVinc {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected String cnpjEmpregAnt;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                    protected String matricAnt;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                    protected XMLGregorianCalendar dtAdm;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
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
             *         &lt;element name="qtdDiasInterm">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d{1,2}"/>
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
                "qtdDiasInterm"
            })
            public static class InfoInterm {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                protected byte qtdDiasInterm;

                /**
                 * Obtém o valor da propriedade qtdDiasInterm.
                 * 
                 */
                public byte getQtdDiasInterm() {
                    return qtdDiasInterm;
                }

                /**
                 * Define o valor da propriedade qtdDiasInterm.
                 * 
                 */
                public void setQtdDiasInterm(byte value) {
                    this.qtdDiasInterm = value;
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
             *         &lt;element name="remunOutrEmpr" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02}TRemunOutrasEmpresas" maxOccurs="10"/>
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

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                protected byte indMV;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
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

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
                protected byte tpTrib;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02", required = true)
                protected String nrProcJud;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRemun/v02_04_02")
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
