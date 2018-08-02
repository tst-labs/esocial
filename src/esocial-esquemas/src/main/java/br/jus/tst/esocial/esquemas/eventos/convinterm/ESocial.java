//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:56 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.convinterm;

import java.math.BigInteger;
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
 *         &lt;element name="evtConvInterm">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02}TIdeVinculoNisObrig"/>
 *                   &lt;element name="infoConvInterm">
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
 *                             &lt;element name="dtInicio">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtFim">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtPrevPgto">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="jornada">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codHorContrat" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="30"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscJornada" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="localTrab">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="indLocal">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="localTrabInterm" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpLograd">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="4"/>
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
 *                                                 &lt;element name="complem" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
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
 *                                                 &lt;element name="codMunic">
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
    "evtConvInterm",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
    protected ESocial.EvtConvInterm evtConvInterm;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtConvInterm.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtConvInterm }
     *     
     */
    public ESocial.EvtConvInterm getEvtConvInterm() {
        return evtConvInterm;
    }

    /**
     * Define o valor da propriedade evtConvInterm.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtConvInterm }
     *     
     */
    public void setEvtConvInterm(ESocial.EvtConvInterm value) {
        this.evtConvInterm = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02}TIdeVinculoNisObrig"/>
     *         &lt;element name="infoConvInterm">
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
     *                   &lt;element name="dtInicio">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtFim">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtPrevPgto">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="jornada">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codHorContrat" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="30"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscJornada" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="localTrab">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="indLocal">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="localTrabInterm" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpLograd">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="4"/>
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
     *                                       &lt;element name="complem" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
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
     *                                       &lt;element name="codMunic">
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
        "infoConvInterm"
    })
    public static class EvtConvInterm {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
        protected TIdeVinculoNisObrig ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
        protected ESocial.EvtConvInterm.InfoConvInterm infoConvInterm;
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
         * Obtém o valor da propriedade infoConvInterm.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtConvInterm.InfoConvInterm }
         *     
         */
        public ESocial.EvtConvInterm.InfoConvInterm getInfoConvInterm() {
            return infoConvInterm;
        }

        /**
         * Define o valor da propriedade infoConvInterm.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtConvInterm.InfoConvInterm }
         *     
         */
        public void setInfoConvInterm(ESocial.EvtConvInterm.InfoConvInterm value) {
            this.infoConvInterm = value;
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
         *         &lt;element name="codConv">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtInicio">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtFim">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtPrevPgto">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="jornada">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codHorContrat" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscJornada" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="localTrab">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="indLocal">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="localTrabInterm" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpLograd">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="4"/>
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
         *                             &lt;element name="complem" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
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
         *                             &lt;element name="codMunic">
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
            "codConv",
            "dtInicio",
            "dtFim",
            "dtPrevPgto",
            "jornada",
            "localTrab"
        })
        public static class InfoConvInterm {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
            protected String codConv;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
            protected XMLGregorianCalendar dtInicio;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
            protected XMLGregorianCalendar dtFim;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
            protected XMLGregorianCalendar dtPrevPgto;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
            protected ESocial.EvtConvInterm.InfoConvInterm.Jornada jornada;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
            protected ESocial.EvtConvInterm.InfoConvInterm.LocalTrab localTrab;

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
             * Obtém o valor da propriedade dtPrevPgto.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtPrevPgto() {
                return dtPrevPgto;
            }

            /**
             * Define o valor da propriedade dtPrevPgto.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtPrevPgto(XMLGregorianCalendar value) {
                this.dtPrevPgto = value;
            }

            /**
             * Obtém o valor da propriedade jornada.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtConvInterm.InfoConvInterm.Jornada }
             *     
             */
            public ESocial.EvtConvInterm.InfoConvInterm.Jornada getJornada() {
                return jornada;
            }

            /**
             * Define o valor da propriedade jornada.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtConvInterm.InfoConvInterm.Jornada }
             *     
             */
            public void setJornada(ESocial.EvtConvInterm.InfoConvInterm.Jornada value) {
                this.jornada = value;
            }

            /**
             * Obtém o valor da propriedade localTrab.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtConvInterm.InfoConvInterm.LocalTrab }
             *     
             */
            public ESocial.EvtConvInterm.InfoConvInterm.LocalTrab getLocalTrab() {
                return localTrab;
            }

            /**
             * Define o valor da propriedade localTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtConvInterm.InfoConvInterm.LocalTrab }
             *     
             */
            public void setLocalTrab(ESocial.EvtConvInterm.InfoConvInterm.LocalTrab value) {
                this.localTrab = value;
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
             *         &lt;element name="codHorContrat" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscJornada" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="999"/>
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
                "codHorContrat",
                "dscJornada"
            })
            public static class Jornada {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02")
                protected String codHorContrat;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02")
                protected String dscJornada;

                /**
                 * Obtém o valor da propriedade codHorContrat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodHorContrat() {
                    return codHorContrat;
                }

                /**
                 * Define o valor da propriedade codHorContrat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodHorContrat(String value) {
                    this.codHorContrat = value;
                }

                /**
                 * Obtém o valor da propriedade dscJornada.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscJornada() {
                    return dscJornada;
                }

                /**
                 * Define o valor da propriedade dscJornada.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscJornada(String value) {
                    this.dscJornada = value;
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
             *         &lt;element name="indLocal">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="localTrabInterm" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpLograd">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="4"/>
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
             *                   &lt;element name="complem" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
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
             *                   &lt;element name="codMunic">
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
                "indLocal",
                "localTrabInterm"
            })
            public static class LocalTrab {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02")
                protected byte indLocal;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02")
                protected ESocial.EvtConvInterm.InfoConvInterm.LocalTrab.LocalTrabInterm localTrabInterm;

                /**
                 * Obtém o valor da propriedade indLocal.
                 * 
                 */
                public byte getIndLocal() {
                    return indLocal;
                }

                /**
                 * Define o valor da propriedade indLocal.
                 * 
                 */
                public void setIndLocal(byte value) {
                    this.indLocal = value;
                }

                /**
                 * Obtém o valor da propriedade localTrabInterm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtConvInterm.InfoConvInterm.LocalTrab.LocalTrabInterm }
                 *     
                 */
                public ESocial.EvtConvInterm.InfoConvInterm.LocalTrab.LocalTrabInterm getLocalTrabInterm() {
                    return localTrabInterm;
                }

                /**
                 * Define o valor da propriedade localTrabInterm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtConvInterm.InfoConvInterm.LocalTrab.LocalTrabInterm }
                 *     
                 */
                public void setLocalTrabInterm(ESocial.EvtConvInterm.InfoConvInterm.LocalTrab.LocalTrabInterm value) {
                    this.localTrabInterm = value;
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
                 *         &lt;element name="tpLograd">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="4"/>
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
                 *         &lt;element name="complem" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
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
                 *         &lt;element name="codMunic">
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
                    "tpLograd",
                    "dscLograd",
                    "nrLograd",
                    "complem",
                    "bairro",
                    "cep",
                    "codMunic",
                    "uf"
                })
                public static class LocalTrabInterm {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
                    protected String tpLograd;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
                    protected String dscLograd;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
                    protected String nrLograd;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02")
                    protected String complem;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02")
                    protected String bairro;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
                    protected String cep;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
                    protected BigInteger codMunic;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtConvInterm/v02_04_02", required = true)
                    protected String uf;

                    /**
                     * Obtém o valor da propriedade tpLograd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpLograd() {
                        return tpLograd;
                    }

                    /**
                     * Define o valor da propriedade tpLograd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpLograd(String value) {
                        this.tpLograd = value;
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
                     * Obtém o valor da propriedade complem.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getComplem() {
                        return complem;
                    }

                    /**
                     * Define o valor da propriedade complem.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setComplem(String value) {
                        this.complem = value;
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

            }

        }

    }

}
