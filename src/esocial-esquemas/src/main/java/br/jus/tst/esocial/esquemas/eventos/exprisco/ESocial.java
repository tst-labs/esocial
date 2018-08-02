//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:57 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.exprisco;

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
 *         &lt;element name="evtExpRisco">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TIdeVincEstagCoop"/>
 *                   &lt;element name="infoExpRisco">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="iniExpRisco" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIniCondicao">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="altExpRisco" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtAltCondicao">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fimExpRisco" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtFimCondicao">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoAmb" maxOccurs="99">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codAmb">
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
 *                             &lt;element name="respReg" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIni">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtFim" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nisResp">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="11"/>
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
    "evtExpRisco",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
    protected ESocial.EvtExpRisco evtExpRisco;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtExpRisco.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtExpRisco }
     *     
     */
    public ESocial.EvtExpRisco getEvtExpRisco() {
        return evtExpRisco;
    }

    /**
     * Define o valor da propriedade evtExpRisco.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtExpRisco }
     *     
     */
    public void setEvtExpRisco(ESocial.EvtExpRisco value) {
        this.evtExpRisco = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TIdeVincEstagCoop"/>
     *         &lt;element name="infoExpRisco">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="iniExpRisco" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIniCondicao">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="altExpRisco" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtAltCondicao">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fimExpRisco" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtFimCondicao">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="infoAmb" maxOccurs="99">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codAmb">
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
     *                   &lt;element name="respReg" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIni">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtFim" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nisResp">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="11"/>
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
        "infoExpRisco"
    })
    public static class EvtExpRisco {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
        protected TIdeVincEstagCoop ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
        protected ESocial.EvtExpRisco.InfoExpRisco infoExpRisco;
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
         *     {@link TIdeVincEstagCoop }
         *     
         */
        public TIdeVincEstagCoop getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVincEstagCoop }
         *     
         */
        public void setIdeVinculo(TIdeVincEstagCoop value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoExpRisco.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtExpRisco.InfoExpRisco }
         *     
         */
        public ESocial.EvtExpRisco.InfoExpRisco getInfoExpRisco() {
            return infoExpRisco;
        }

        /**
         * Define o valor da propriedade infoExpRisco.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtExpRisco.InfoExpRisco }
         *     
         */
        public void setInfoExpRisco(ESocial.EvtExpRisco.InfoExpRisco value) {
            this.infoExpRisco = value;
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
         *         &lt;element name="iniExpRisco" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIniCondicao">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="altExpRisco" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtAltCondicao">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fimExpRisco" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtFimCondicao">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infoAmb" maxOccurs="99">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codAmb">
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
         *         &lt;element name="respReg" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIni">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtFim" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nisResp">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="11"/>
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
            "iniExpRisco",
            "altExpRisco",
            "fimExpRisco",
            "respReg"
        })
        public static class InfoExpRisco {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02")
            protected ESocial.EvtExpRisco.InfoExpRisco.IniExpRisco iniExpRisco;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02")
            protected ESocial.EvtExpRisco.InfoExpRisco.AltExpRisco altExpRisco;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02")
            protected ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco fimExpRisco;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
            protected List<ESocial.EvtExpRisco.InfoExpRisco.RespReg> respReg;

            /**
             * Obtém o valor da propriedade iniExpRisco.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.IniExpRisco }
             *     
             */
            public ESocial.EvtExpRisco.InfoExpRisco.IniExpRisco getIniExpRisco() {
                return iniExpRisco;
            }

            /**
             * Define o valor da propriedade iniExpRisco.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.IniExpRisco }
             *     
             */
            public void setIniExpRisco(ESocial.EvtExpRisco.InfoExpRisco.IniExpRisco value) {
                this.iniExpRisco = value;
            }

            /**
             * Obtém o valor da propriedade altExpRisco.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.AltExpRisco }
             *     
             */
            public ESocial.EvtExpRisco.InfoExpRisco.AltExpRisco getAltExpRisco() {
                return altExpRisco;
            }

            /**
             * Define o valor da propriedade altExpRisco.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.AltExpRisco }
             *     
             */
            public void setAltExpRisco(ESocial.EvtExpRisco.InfoExpRisco.AltExpRisco value) {
                this.altExpRisco = value;
            }

            /**
             * Obtém o valor da propriedade fimExpRisco.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco }
             *     
             */
            public ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco getFimExpRisco() {
                return fimExpRisco;
            }

            /**
             * Define o valor da propriedade fimExpRisco.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco }
             *     
             */
            public void setFimExpRisco(ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco value) {
                this.fimExpRisco = value;
            }

            /**
             * Gets the value of the respReg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the respReg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRespReg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtExpRisco.InfoExpRisco.RespReg }
             * 
             * 
             */
            public List<ESocial.EvtExpRisco.InfoExpRisco.RespReg> getRespReg() {
                if (respReg == null) {
                    respReg = new ArrayList<ESocial.EvtExpRisco.InfoExpRisco.RespReg>();
                }
                return this.respReg;
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
             *         &lt;element name="dtAltCondicao">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
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
                "dtAltCondicao",
                "infoAmb"
            })
            public static class AltExpRisco {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected XMLGregorianCalendar dtAltCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected List<TinfoAmb> infoAmb;

                /**
                 * Obtém o valor da propriedade dtAltCondicao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAltCondicao() {
                    return dtAltCondicao;
                }

                /**
                 * Define o valor da propriedade dtAltCondicao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAltCondicao(XMLGregorianCalendar value) {
                    this.dtAltCondicao = value;
                }

                /**
                 * Gets the value of the infoAmb property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoAmb property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoAmb().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TinfoAmb }
                 * 
                 * 
                 */
                public List<TinfoAmb> getInfoAmb() {
                    if (infoAmb == null) {
                        infoAmb = new ArrayList<TinfoAmb>();
                    }
                    return this.infoAmb;
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
             *         &lt;element name="dtFimCondicao">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infoAmb" maxOccurs="99">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codAmb">
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
                "dtFimCondicao",
                "infoAmb"
            })
            public static class FimExpRisco {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected XMLGregorianCalendar dtFimCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected List<ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco.InfoAmb> infoAmb;

                /**
                 * Obtém o valor da propriedade dtFimCondicao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtFimCondicao() {
                    return dtFimCondicao;
                }

                /**
                 * Define o valor da propriedade dtFimCondicao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtFimCondicao(XMLGregorianCalendar value) {
                    this.dtFimCondicao = value;
                }

                /**
                 * Gets the value of the infoAmb property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoAmb property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoAmb().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco.InfoAmb }
                 * 
                 * 
                 */
                public List<ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco.InfoAmb> getInfoAmb() {
                    if (infoAmb == null) {
                        infoAmb = new ArrayList<ESocial.EvtExpRisco.InfoExpRisco.FimExpRisco.InfoAmb>();
                    }
                    return this.infoAmb;
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
                 *         &lt;element name="codAmb">
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
                    "codAmb"
                })
                public static class InfoAmb {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                    protected String codAmb;

                    /**
                     * Obtém o valor da propriedade codAmb.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodAmb() {
                        return codAmb;
                    }

                    /**
                     * Define o valor da propriedade codAmb.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodAmb(String value) {
                        this.codAmb = value;
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
             *         &lt;element name="dtIniCondicao">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02}TinfoAmb" maxOccurs="99"/>
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
                "dtIniCondicao",
                "infoAmb"
            })
            public static class IniExpRisco {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected XMLGregorianCalendar dtIniCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected List<TinfoAmb> infoAmb;

                /**
                 * Obtém o valor da propriedade dtIniCondicao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIniCondicao() {
                    return dtIniCondicao;
                }

                /**
                 * Define o valor da propriedade dtIniCondicao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIniCondicao(XMLGregorianCalendar value) {
                    this.dtIniCondicao = value;
                }

                /**
                 * Gets the value of the infoAmb property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoAmb property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoAmb().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TinfoAmb }
                 * 
                 * 
                 */
                public List<TinfoAmb> getInfoAmb() {
                    if (infoAmb == null) {
                        infoAmb = new ArrayList<TinfoAmb>();
                    }
                    return this.infoAmb;
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
             *         &lt;element name="dtIni">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtFim" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nisResp">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="11"/>
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
                "dtIni",
                "dtFim",
                "nisResp",
                "nrOc",
                "ufOC"
            })
            public static class RespReg {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected XMLGregorianCalendar dtIni;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02")
                protected XMLGregorianCalendar dtFim;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected String nisResp;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02", required = true)
                protected String nrOc;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtExpRisco/v02_04_02")
                protected String ufOC;

                /**
                 * Obtém o valor da propriedade dtIni.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIni() {
                    return dtIni;
                }

                /**
                 * Define o valor da propriedade dtIni.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIni(XMLGregorianCalendar value) {
                    this.dtIni = value;
                }

                /**
                 * Obtém o valor da propriedade dtFim.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtFim() {
                    return dtFim;
                }

                /**
                 * Define o valor da propriedade dtFim.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtFim(XMLGregorianCalendar value) {
                    this.dtFim = value;
                }

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

    }

}
