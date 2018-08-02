//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:59 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.insapo;

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
 *         &lt;element name="evtInsApo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TIdeVincEstagCoop"/>
 *                   &lt;element name="insalPeric" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="iniInsalPeric" minOccurs="0">
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
 *                                       &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="altInsalPeric" minOccurs="0">
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
 *                                       &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fimInsalPeric" minOccurs="0">
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="aposentEsp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="iniAposentEsp" minOccurs="0">
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
 *                                       &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="altAposentEsp" minOccurs="0">
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
 *                                       &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fimAposentEsp" minOccurs="0">
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
    "evtInsApo",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
    protected ESocial.EvtInsApo evtInsApo;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtInsApo.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtInsApo }
     *     
     */
    public ESocial.EvtInsApo getEvtInsApo() {
        return evtInsApo;
    }

    /**
     * Define o valor da propriedade evtInsApo.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtInsApo }
     *     
     */
    public void setEvtInsApo(ESocial.EvtInsApo value) {
        this.evtInsApo = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TIdeVincEstagCoop"/>
     *         &lt;element name="insalPeric" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="iniInsalPeric" minOccurs="0">
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
     *                             &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="altInsalPeric" minOccurs="0">
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
     *                             &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fimInsalPeric" minOccurs="0">
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="aposentEsp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="iniAposentEsp" minOccurs="0">
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
     *                             &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="altAposentEsp" minOccurs="0">
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
     *                             &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fimAposentEsp" minOccurs="0">
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
        "insalPeric",
        "aposentEsp"
    })
    public static class EvtInsApo {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
        protected TIdeVincEstagCoop ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
        protected ESocial.EvtInsApo.InsalPeric insalPeric;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
        protected ESocial.EvtInsApo.AposentEsp aposentEsp;
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
         * Obtém o valor da propriedade insalPeric.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInsApo.InsalPeric }
         *     
         */
        public ESocial.EvtInsApo.InsalPeric getInsalPeric() {
            return insalPeric;
        }

        /**
         * Define o valor da propriedade insalPeric.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInsApo.InsalPeric }
         *     
         */
        public void setInsalPeric(ESocial.EvtInsApo.InsalPeric value) {
            this.insalPeric = value;
        }

        /**
         * Obtém o valor da propriedade aposentEsp.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInsApo.AposentEsp }
         *     
         */
        public ESocial.EvtInsApo.AposentEsp getAposentEsp() {
            return aposentEsp;
        }

        /**
         * Define o valor da propriedade aposentEsp.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInsApo.AposentEsp }
         *     
         */
        public void setAposentEsp(ESocial.EvtInsApo.AposentEsp value) {
            this.aposentEsp = value;
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
         *         &lt;element name="iniAposentEsp" minOccurs="0">
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
         *                   &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="altAposentEsp" minOccurs="0">
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
         *                   &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fimAposentEsp" minOccurs="0">
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
            "iniAposentEsp",
            "altAposentEsp",
            "fimAposentEsp"
        })
        public static class AposentEsp {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
            protected ESocial.EvtInsApo.AposentEsp.IniAposentEsp iniAposentEsp;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
            protected ESocial.EvtInsApo.AposentEsp.AltAposentEsp altAposentEsp;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
            protected ESocial.EvtInsApo.AposentEsp.FimAposentEsp fimAposentEsp;

            /**
             * Obtém o valor da propriedade iniAposentEsp.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInsApo.AposentEsp.IniAposentEsp }
             *     
             */
            public ESocial.EvtInsApo.AposentEsp.IniAposentEsp getIniAposentEsp() {
                return iniAposentEsp;
            }

            /**
             * Define o valor da propriedade iniAposentEsp.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInsApo.AposentEsp.IniAposentEsp }
             *     
             */
            public void setIniAposentEsp(ESocial.EvtInsApo.AposentEsp.IniAposentEsp value) {
                this.iniAposentEsp = value;
            }

            /**
             * Obtém o valor da propriedade altAposentEsp.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInsApo.AposentEsp.AltAposentEsp }
             *     
             */
            public ESocial.EvtInsApo.AposentEsp.AltAposentEsp getAltAposentEsp() {
                return altAposentEsp;
            }

            /**
             * Define o valor da propriedade altAposentEsp.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInsApo.AposentEsp.AltAposentEsp }
             *     
             */
            public void setAltAposentEsp(ESocial.EvtInsApo.AposentEsp.AltAposentEsp value) {
                this.altAposentEsp = value;
            }

            /**
             * Obtém o valor da propriedade fimAposentEsp.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInsApo.AposentEsp.FimAposentEsp }
             *     
             */
            public ESocial.EvtInsApo.AposentEsp.FimAposentEsp getFimAposentEsp() {
                return fimAposentEsp;
            }

            /**
             * Define o valor da propriedade fimAposentEsp.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInsApo.AposentEsp.FimAposentEsp }
             *     
             */
            public void setFimAposentEsp(ESocial.EvtInsApo.AposentEsp.FimAposentEsp value) {
                this.fimAposentEsp = value;
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
             *         &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
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
                "infoamb"
            })
            public static class AltAposentEsp {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected XMLGregorianCalendar dtAltCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected List<TinfoAmbiente> infoamb;

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
                 * Gets the value of the infoamb property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoamb property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoamb().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TinfoAmbiente }
                 * 
                 * 
                 */
                public List<TinfoAmbiente> getInfoamb() {
                    if (infoamb == null) {
                        infoamb = new ArrayList<TinfoAmbiente>();
                    }
                    return this.infoamb;
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
            public static class FimAposentEsp {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected XMLGregorianCalendar dtFimCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected List<ESocial.EvtInsApo.AposentEsp.FimAposentEsp.InfoAmb> infoAmb;

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
                 * {@link ESocial.EvtInsApo.AposentEsp.FimAposentEsp.InfoAmb }
                 * 
                 * 
                 */
                public List<ESocial.EvtInsApo.AposentEsp.FimAposentEsp.InfoAmb> getInfoAmb() {
                    if (infoAmb == null) {
                        infoAmb = new ArrayList<ESocial.EvtInsApo.AposentEsp.FimAposentEsp.InfoAmb>();
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

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
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
             *         &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
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
            public static class IniAposentEsp {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected XMLGregorianCalendar dtIniCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected List<TinfoAmbiente> infoAmb;

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
                 * {@link TinfoAmbiente }
                 * 
                 * 
                 */
                public List<TinfoAmbiente> getInfoAmb() {
                    if (infoAmb == null) {
                        infoAmb = new ArrayList<TinfoAmbiente>();
                    }
                    return this.infoAmb;
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
         *         &lt;element name="iniInsalPeric" minOccurs="0">
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
         *                   &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="altInsalPeric" minOccurs="0">
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
         *                   &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fimInsalPeric" minOccurs="0">
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
            "iniInsalPeric",
            "altInsalPeric",
            "fimInsalPeric"
        })
        public static class InsalPeric {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
            protected ESocial.EvtInsApo.InsalPeric.IniInsalPeric iniInsalPeric;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
            protected ESocial.EvtInsApo.InsalPeric.AltInsalPeric altInsalPeric;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02")
            protected ESocial.EvtInsApo.InsalPeric.FimInsalPeric fimInsalPeric;

            /**
             * Obtém o valor da propriedade iniInsalPeric.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInsApo.InsalPeric.IniInsalPeric }
             *     
             */
            public ESocial.EvtInsApo.InsalPeric.IniInsalPeric getIniInsalPeric() {
                return iniInsalPeric;
            }

            /**
             * Define o valor da propriedade iniInsalPeric.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInsApo.InsalPeric.IniInsalPeric }
             *     
             */
            public void setIniInsalPeric(ESocial.EvtInsApo.InsalPeric.IniInsalPeric value) {
                this.iniInsalPeric = value;
            }

            /**
             * Obtém o valor da propriedade altInsalPeric.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInsApo.InsalPeric.AltInsalPeric }
             *     
             */
            public ESocial.EvtInsApo.InsalPeric.AltInsalPeric getAltInsalPeric() {
                return altInsalPeric;
            }

            /**
             * Define o valor da propriedade altInsalPeric.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInsApo.InsalPeric.AltInsalPeric }
             *     
             */
            public void setAltInsalPeric(ESocial.EvtInsApo.InsalPeric.AltInsalPeric value) {
                this.altInsalPeric = value;
            }

            /**
             * Obtém o valor da propriedade fimInsalPeric.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInsApo.InsalPeric.FimInsalPeric }
             *     
             */
            public ESocial.EvtInsApo.InsalPeric.FimInsalPeric getFimInsalPeric() {
                return fimInsalPeric;
            }

            /**
             * Define o valor da propriedade fimInsalPeric.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInsApo.InsalPeric.FimInsalPeric }
             *     
             */
            public void setFimInsalPeric(ESocial.EvtInsApo.InsalPeric.FimInsalPeric value) {
                this.fimInsalPeric = value;
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
             *         &lt;element name="infoamb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
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
                "infoamb"
            })
            public static class AltInsalPeric {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected XMLGregorianCalendar dtAltCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected List<TinfoAmbiente> infoamb;

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
                 * Gets the value of the infoamb property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoamb property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoamb().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TinfoAmbiente }
                 * 
                 * 
                 */
                public List<TinfoAmbiente> getInfoamb() {
                    if (infoamb == null) {
                        infoamb = new ArrayList<TinfoAmbiente>();
                    }
                    return this.infoamb;
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
            public static class FimInsalPeric {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected XMLGregorianCalendar dtFimCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected List<ESocial.EvtInsApo.InsalPeric.FimInsalPeric.InfoAmb> infoAmb;

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
                 * {@link ESocial.EvtInsApo.InsalPeric.FimInsalPeric.InfoAmb }
                 * 
                 * 
                 */
                public List<ESocial.EvtInsApo.InsalPeric.FimInsalPeric.InfoAmb> getInfoAmb() {
                    if (infoAmb == null) {
                        infoAmb = new ArrayList<ESocial.EvtInsApo.InsalPeric.FimInsalPeric.InfoAmb>();
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

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
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
             *         &lt;element name="infoAmb" type="{http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02}TinfoAmbiente" maxOccurs="99"/>
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
            public static class IniInsalPeric {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected XMLGregorianCalendar dtIniCondicao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
                protected List<TinfoAmbiente> infoAmb;

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
                 * {@link TinfoAmbiente }
                 * 
                 * 
                 */
                public List<TinfoAmbiente> getInfoAmb() {
                    if (infoAmb == null) {
                        infoAmb = new ArrayList<TinfoAmbiente>();
                    }
                    return this.infoAmb;
                }

            }

        }

    }

}
