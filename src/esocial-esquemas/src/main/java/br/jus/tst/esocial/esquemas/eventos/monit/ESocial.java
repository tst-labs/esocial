//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:02 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.monit;

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
 *         &lt;element name="evtMonit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TIdeVinculoEstag"/>
 *                   &lt;element name="aso">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAso">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAso">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="resAso">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="exame" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtExm">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="procRealizado" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{1,8}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="obsProc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="200"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="interprExm">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ordExame">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtIniMonit">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtFimMonit" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="indResult" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="respMonit">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nisResp">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="11"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nrConsClasse">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="8"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ufConsClasse" minOccurs="0">
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
 *                             &lt;element name="ideServSaude">
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
 *                                       &lt;element name="frmCtt">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;minLength value="5"/>
 *                                             &lt;maxLength value="100"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="email" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="6"/>
 *                                             &lt;maxLength value="60"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="medico" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TMedico"/>
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
    "evtMonit",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
    protected ESocial.EvtMonit evtMonit;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtMonit.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtMonit }
     *     
     */
    public ESocial.EvtMonit getEvtMonit() {
        return evtMonit;
    }

    /**
     * Define o valor da propriedade evtMonit.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtMonit }
     *     
     */
    public void setEvtMonit(ESocial.EvtMonit value) {
        this.evtMonit = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TIdeVinculoEstag"/>
     *         &lt;element name="aso">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAso">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpAso">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="resAso">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="exame" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtExm">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="procRealizado" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{1,8}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="obsProc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="200"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="interprExm">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ordExame">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtIniMonit">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtFimMonit" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="indResult" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="respMonit">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nisResp">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="11"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nrConsClasse">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="8"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="ufConsClasse" minOccurs="0">
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
     *                   &lt;element name="ideServSaude">
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
     *                             &lt;element name="frmCtt">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;minLength value="5"/>
     *                                   &lt;maxLength value="100"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="email" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="6"/>
     *                                   &lt;maxLength value="60"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="medico" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TMedico"/>
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
        "aso"
    })
    public static class EvtMonit {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
        protected TIdeVinculoEstag ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
        protected ESocial.EvtMonit.Aso aso;
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
         *     {@link TIdeVinculoEstag }
         *     
         */
        public TIdeVinculoEstag getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVinculoEstag }
         *     
         */
        public void setIdeVinculo(TIdeVinculoEstag value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade aso.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtMonit.Aso }
         *     
         */
        public ESocial.EvtMonit.Aso getAso() {
            return aso;
        }

        /**
         * Define o valor da propriedade aso.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtMonit.Aso }
         *     
         */
        public void setAso(ESocial.EvtMonit.Aso value) {
            this.aso = value;
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
         *         &lt;element name="dtAso">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAso">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="resAso">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="exame" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtExm">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="procRealizado" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{1,8}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="obsProc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="200"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="interprExm">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ordExame">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtIniMonit">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtFimMonit" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="indResult" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="respMonit">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nisResp">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="11"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nrConsClasse">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="8"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="ufConsClasse" minOccurs="0">
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
         *         &lt;element name="ideServSaude">
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
         *                   &lt;element name="frmCtt">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="5"/>
         *                         &lt;maxLength value="100"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="email" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="6"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="medico" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TMedico"/>
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
            "dtAso",
            "tpAso",
            "resAso",
            "exame",
            "ideServSaude"
        })
        public static class Aso {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
            protected XMLGregorianCalendar dtAso;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
            protected byte tpAso;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
            protected byte resAso;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
            protected List<ESocial.EvtMonit.Aso.Exame> exame;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
            protected ESocial.EvtMonit.Aso.IdeServSaude ideServSaude;

            /**
             * Obtém o valor da propriedade dtAso.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAso() {
                return dtAso;
            }

            /**
             * Define o valor da propriedade dtAso.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAso(XMLGregorianCalendar value) {
                this.dtAso = value;
            }

            /**
             * Obtém o valor da propriedade tpAso.
             * 
             */
            public byte getTpAso() {
                return tpAso;
            }

            /**
             * Define o valor da propriedade tpAso.
             * 
             */
            public void setTpAso(byte value) {
                this.tpAso = value;
            }

            /**
             * Obtém o valor da propriedade resAso.
             * 
             */
            public byte getResAso() {
                return resAso;
            }

            /**
             * Define o valor da propriedade resAso.
             * 
             */
            public void setResAso(byte value) {
                this.resAso = value;
            }

            /**
             * Gets the value of the exame property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the exame property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExame().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtMonit.Aso.Exame }
             * 
             * 
             */
            public List<ESocial.EvtMonit.Aso.Exame> getExame() {
                if (exame == null) {
                    exame = new ArrayList<ESocial.EvtMonit.Aso.Exame>();
                }
                return this.exame;
            }

            /**
             * Obtém o valor da propriedade ideServSaude.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtMonit.Aso.IdeServSaude }
             *     
             */
            public ESocial.EvtMonit.Aso.IdeServSaude getIdeServSaude() {
                return ideServSaude;
            }

            /**
             * Define o valor da propriedade ideServSaude.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtMonit.Aso.IdeServSaude }
             *     
             */
            public void setIdeServSaude(ESocial.EvtMonit.Aso.IdeServSaude value) {
                this.ideServSaude = value;
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
             *         &lt;element name="dtExm">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="procRealizado" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{1,8}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="obsProc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="200"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="interprExm">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ordExame">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtIniMonit">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtFimMonit" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="indResult" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="respMonit">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nisResp">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="11"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nrConsClasse">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="8"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="ufConsClasse" minOccurs="0">
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
                "dtExm",
                "procRealizado",
                "obsProc",
                "interprExm",
                "ordExame",
                "dtIniMonit",
                "dtFimMonit",
                "indResult",
                "respMonit"
            })
            public static class Exame {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
                protected XMLGregorianCalendar dtExm;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected BigInteger procRealizado;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected String obsProc;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected byte interprExm;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected byte ordExame;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
                protected XMLGregorianCalendar dtIniMonit;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected XMLGregorianCalendar dtFimMonit;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected Byte indResult;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
                protected ESocial.EvtMonit.Aso.Exame.RespMonit respMonit;

                /**
                 * Obtém o valor da propriedade dtExm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtExm() {
                    return dtExm;
                }

                /**
                 * Define o valor da propriedade dtExm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtExm(XMLGregorianCalendar value) {
                    this.dtExm = value;
                }

                /**
                 * Obtém o valor da propriedade procRealizado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getProcRealizado() {
                    return procRealizado;
                }

                /**
                 * Define o valor da propriedade procRealizado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setProcRealizado(BigInteger value) {
                    this.procRealizado = value;
                }

                /**
                 * Obtém o valor da propriedade obsProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObsProc() {
                    return obsProc;
                }

                /**
                 * Define o valor da propriedade obsProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObsProc(String value) {
                    this.obsProc = value;
                }

                /**
                 * Obtém o valor da propriedade interprExm.
                 * 
                 */
                public byte getInterprExm() {
                    return interprExm;
                }

                /**
                 * Define o valor da propriedade interprExm.
                 * 
                 */
                public void setInterprExm(byte value) {
                    this.interprExm = value;
                }

                /**
                 * Obtém o valor da propriedade ordExame.
                 * 
                 */
                public byte getOrdExame() {
                    return ordExame;
                }

                /**
                 * Define o valor da propriedade ordExame.
                 * 
                 */
                public void setOrdExame(byte value) {
                    this.ordExame = value;
                }

                /**
                 * Obtém o valor da propriedade dtIniMonit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIniMonit() {
                    return dtIniMonit;
                }

                /**
                 * Define o valor da propriedade dtIniMonit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIniMonit(XMLGregorianCalendar value) {
                    this.dtIniMonit = value;
                }

                /**
                 * Obtém o valor da propriedade dtFimMonit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtFimMonit() {
                    return dtFimMonit;
                }

                /**
                 * Define o valor da propriedade dtFimMonit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtFimMonit(XMLGregorianCalendar value) {
                    this.dtFimMonit = value;
                }

                /**
                 * Obtém o valor da propriedade indResult.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getIndResult() {
                    return indResult;
                }

                /**
                 * Define o valor da propriedade indResult.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setIndResult(Byte value) {
                    this.indResult = value;
                }

                /**
                 * Obtém o valor da propriedade respMonit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtMonit.Aso.Exame.RespMonit }
                 *     
                 */
                public ESocial.EvtMonit.Aso.Exame.RespMonit getRespMonit() {
                    return respMonit;
                }

                /**
                 * Define o valor da propriedade respMonit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtMonit.Aso.Exame.RespMonit }
                 *     
                 */
                public void setRespMonit(ESocial.EvtMonit.Aso.Exame.RespMonit value) {
                    this.respMonit = value;
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
                 *         &lt;element name="nisResp">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="11"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nrConsClasse">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="8"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="ufConsClasse" minOccurs="0">
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
                    "nisResp",
                    "nrConsClasse",
                    "ufConsClasse"
                })
                public static class RespMonit {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
                    protected String nisResp;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
                    protected String nrConsClasse;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                    protected String ufConsClasse;

                    /**
                     * Obtém o valor da propriedade nisResp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNisResp() {
                        return nisResp;
                    }

                    /**
                     * Define o valor da propriedade nisResp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNisResp(String value) {
                        this.nisResp = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrConsClasse.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrConsClasse() {
                        return nrConsClasse;
                    }

                    /**
                     * Define o valor da propriedade nrConsClasse.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrConsClasse(String value) {
                        this.nrConsClasse = value;
                    }

                    /**
                     * Obtém o valor da propriedade ufConsClasse.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUfConsClasse() {
                        return ufConsClasse;
                    }

                    /**
                     * Define o valor da propriedade ufConsClasse.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUfConsClasse(String value) {
                        this.ufConsClasse = value;
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
             *         &lt;element name="codCNES" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="7"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="frmCtt">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="5"/>
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="email" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="6"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="medico" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TMedico"/>
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
                "frmCtt",
                "email",
                "medico"
            })
            public static class IdeServSaude {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected String codCNES;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
                protected String frmCtt;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02")
                protected String email;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", required = true)
                protected TMedico medico;

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
                 * Obtém o valor da propriedade frmCtt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrmCtt() {
                    return frmCtt;
                }

                /**
                 * Define o valor da propriedade frmCtt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrmCtt(String value) {
                    this.frmCtt = value;
                }

                /**
                 * Obtém o valor da propriedade email.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmail() {
                    return email;
                }

                /**
                 * Define o valor da propriedade email.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmail(String value) {
                    this.email = value;
                }

                /**
                 * Obtém o valor da propriedade medico.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TMedico }
                 *     
                 */
                public TMedico getMedico() {
                    return medico;
                }

                /**
                 * Define o valor da propriedade medico.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TMedico }
                 *     
                 */
                public void setMedico(TMedico value) {
                    this.medico = value;
                }

            }

        }

    }

}
