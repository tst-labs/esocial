//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:52 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.avprevio;

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
 *         &lt;element name="evtAvPrevio">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02}TIdeVinculoNisObrig"/>
 *                   &lt;element name="infoAvPrevio">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="detAvPrevio">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="dtAvPrv">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="dtPrevDeslig">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="tpAvPrevio">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                               &lt;pattern value="\d"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="observacao" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;minLength value="3"/>
 *                                               &lt;maxLength value="255"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="cancAvPrevio">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="dtCancAvPrv">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="observacao" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;minLength value="3"/>
 *                                               &lt;maxLength value="255"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="mtvCancAvPrevio">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                               &lt;pattern value="\d"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
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
    "evtAvPrevio",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
    protected ESocial.EvtAvPrevio evtAvPrevio;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAvPrevio.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAvPrevio }
     *     
     */
    public ESocial.EvtAvPrevio getEvtAvPrevio() {
        return evtAvPrevio;
    }

    /**
     * Define o valor da propriedade evtAvPrevio.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAvPrevio }
     *     
     */
    public void setEvtAvPrevio(ESocial.EvtAvPrevio value) {
        this.evtAvPrevio = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02}TIdeVinculoNisObrig"/>
     *         &lt;element name="infoAvPrevio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="detAvPrevio">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="dtAvPrv">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="dtPrevDeslig">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="tpAvPrevio">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                     &lt;pattern value="\d"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="observacao" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;minLength value="3"/>
     *                                     &lt;maxLength value="255"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="cancAvPrevio">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="dtCancAvPrv">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="observacao" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;minLength value="3"/>
     *                                     &lt;maxLength value="255"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="mtvCancAvPrevio">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                     &lt;pattern value="\d"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
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
        "infoAvPrevio"
    })
    public static class EvtAvPrevio {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
        protected TIdeVinculoNisObrig ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
        protected ESocial.EvtAvPrevio.InfoAvPrevio infoAvPrevio;
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
         * Obtém o valor da propriedade infoAvPrevio.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAvPrevio.InfoAvPrevio }
         *     
         */
        public ESocial.EvtAvPrevio.InfoAvPrevio getInfoAvPrevio() {
            return infoAvPrevio;
        }

        /**
         * Define o valor da propriedade infoAvPrevio.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAvPrevio.InfoAvPrevio }
         *     
         */
        public void setInfoAvPrevio(ESocial.EvtAvPrevio.InfoAvPrevio value) {
            this.infoAvPrevio = value;
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
         *         &lt;choice>
         *           &lt;element name="detAvPrevio">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="dtAvPrv">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="dtPrevDeslig">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="tpAvPrevio">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                           &lt;pattern value="\d"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="observacao" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;minLength value="3"/>
         *                           &lt;maxLength value="255"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="cancAvPrevio">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="dtCancAvPrv">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="observacao" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;minLength value="3"/>
         *                           &lt;maxLength value="255"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="mtvCancAvPrevio">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                           &lt;pattern value="\d"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
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
            "detAvPrevio",
            "cancAvPrevio"
        })
        public static class InfoAvPrevio {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02")
            protected ESocial.EvtAvPrevio.InfoAvPrevio.DetAvPrevio detAvPrevio;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02")
            protected ESocial.EvtAvPrevio.InfoAvPrevio.CancAvPrevio cancAvPrevio;

            /**
             * Obtém o valor da propriedade detAvPrevio.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAvPrevio.InfoAvPrevio.DetAvPrevio }
             *     
             */
            public ESocial.EvtAvPrevio.InfoAvPrevio.DetAvPrevio getDetAvPrevio() {
                return detAvPrevio;
            }

            /**
             * Define o valor da propriedade detAvPrevio.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAvPrevio.InfoAvPrevio.DetAvPrevio }
             *     
             */
            public void setDetAvPrevio(ESocial.EvtAvPrevio.InfoAvPrevio.DetAvPrevio value) {
                this.detAvPrevio = value;
            }

            /**
             * Obtém o valor da propriedade cancAvPrevio.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAvPrevio.InfoAvPrevio.CancAvPrevio }
             *     
             */
            public ESocial.EvtAvPrevio.InfoAvPrevio.CancAvPrevio getCancAvPrevio() {
                return cancAvPrevio;
            }

            /**
             * Define o valor da propriedade cancAvPrevio.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAvPrevio.InfoAvPrevio.CancAvPrevio }
             *     
             */
            public void setCancAvPrevio(ESocial.EvtAvPrevio.InfoAvPrevio.CancAvPrevio value) {
                this.cancAvPrevio = value;
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
             *         &lt;element name="dtCancAvPrv">
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
             *         &lt;element name="mtvCancAvPrevio">
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
                "dtCancAvPrv",
                "observacao",
                "mtvCancAvPrevio"
            })
            public static class CancAvPrevio {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
                protected XMLGregorianCalendar dtCancAvPrv;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02")
                protected String observacao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02")
                protected byte mtvCancAvPrevio;

                /**
                 * Obtém o valor da propriedade dtCancAvPrv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtCancAvPrv() {
                    return dtCancAvPrv;
                }

                /**
                 * Define o valor da propriedade dtCancAvPrv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtCancAvPrv(XMLGregorianCalendar value) {
                    this.dtCancAvPrv = value;
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
                 * Obtém o valor da propriedade mtvCancAvPrevio.
                 * 
                 */
                public byte getMtvCancAvPrevio() {
                    return mtvCancAvPrevio;
                }

                /**
                 * Define o valor da propriedade mtvCancAvPrevio.
                 * 
                 */
                public void setMtvCancAvPrevio(byte value) {
                    this.mtvCancAvPrevio = value;
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
             *         &lt;element name="dtAvPrv">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtPrevDeslig">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="tpAvPrevio">
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
                "dtAvPrv",
                "dtPrevDeslig",
                "tpAvPrevio",
                "observacao"
            })
            public static class DetAvPrevio {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
                protected XMLGregorianCalendar dtAvPrv;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02", required = true)
                protected XMLGregorianCalendar dtPrevDeslig;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02")
                protected byte tpAvPrevio;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAvPrevio/v02_04_02")
                protected String observacao;

                /**
                 * Obtém o valor da propriedade dtAvPrv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAvPrv() {
                    return dtAvPrv;
                }

                /**
                 * Define o valor da propriedade dtAvPrv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAvPrv(XMLGregorianCalendar value) {
                    this.dtAvPrv = value;
                }

                /**
                 * Obtém o valor da propriedade dtPrevDeslig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtPrevDeslig() {
                    return dtPrevDeslig;
                }

                /**
                 * Define o valor da propriedade dtPrevDeslig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtPrevDeslig(XMLGregorianCalendar value) {
                    this.dtPrevDeslig = value;
                }

                /**
                 * Obtém o valor da propriedade tpAvPrevio.
                 * 
                 */
                public byte getTpAvPrevio() {
                    return tpAvPrevio;
                }

                /**
                 * Define o valor da propriedade tpAvPrevio.
                 * 
                 */
                public void setTpAvPrevio(byte value) {
                    this.tpAvPrevio = value;
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

    }

}
