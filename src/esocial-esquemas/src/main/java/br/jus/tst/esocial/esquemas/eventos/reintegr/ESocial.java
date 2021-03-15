//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:22 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.reintegr;

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
 *         &lt;element name="evtReintegr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}T_ideVinculo"/>
 *                   &lt;element name="infoReintegr">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpReint">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="5"/>
 *                                   &lt;enumeration value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
 *                             &lt;element name="nrLeiAnistia" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\w{5,13}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtEfetRetorno" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtEfeito" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}TS_Id" />
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
    "evtReintegr",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtReintegr evtReintegr;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtReintegr.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtReintegr }
     *     
     */
    public ESocial.EvtReintegr getEvtReintegr() {
        return evtReintegr;
    }

    /**
     * Define o valor da propriedade evtReintegr.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtReintegr }
     *     
     */
    public void setEvtReintegr(ESocial.EvtReintegr value) {
        this.evtReintegr = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}T_ideVinculo"/>
     *         &lt;element name="infoReintegr">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpReint">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                         &lt;enumeration value="5"/>
     *                         &lt;enumeration value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
     *                   &lt;element name="nrLeiAnistia" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\w{5,13}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtEfetRetorno" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtEfeito" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}TS_Id" />
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
        "infoReintegr"
    })
    public static class EvtReintegr {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculo ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtReintegr.InfoReintegr infoReintegr;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrab }
         *     
         */
        public TIdeEventoTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrab }
         *     
         */
        public void setIdeEvento(TIdeEventoTrab value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideVinculo.
         * 
         * @return
         *     possible object is
         *     {@link TIdeVinculo }
         *     
         */
        public TIdeVinculo getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVinculo }
         *     
         */
        public void setIdeVinculo(TIdeVinculo value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoReintegr.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtReintegr.InfoReintegr }
         *     
         */
        public ESocial.EvtReintegr.InfoReintegr getInfoReintegr() {
            return infoReintegr;
        }

        /**
         * Define o valor da propriedade infoReintegr.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtReintegr.InfoReintegr }
         *     
         */
        public void setInfoReintegr(ESocial.EvtReintegr.InfoReintegr value) {
            this.infoReintegr = value;
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
         *         &lt;element name="tpReint">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
         *               &lt;enumeration value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtReintegr/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
         *         &lt;element name="nrLeiAnistia" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\w{5,13}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtEfetRetorno" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtEfeito" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "tpReint",
            "nrProcJud",
            "nrLeiAnistia",
            "dtEfetRetorno",
            "dtEfeito"
        })
        public static class InfoReintegr {

            protected byte tpReint;
            protected String nrProcJud;
            protected String nrLeiAnistia;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtEfetRetorno;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtEfeito;

            /**
             * Obtém o valor da propriedade tpReint.
             * 
             */
            public byte getTpReint() {
                return tpReint;
            }

            /**
             * Define o valor da propriedade tpReint.
             * 
             */
            public void setTpReint(byte value) {
                this.tpReint = value;
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
             * Obtém o valor da propriedade nrLeiAnistia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrLeiAnistia() {
                return nrLeiAnistia;
            }

            /**
             * Define o valor da propriedade nrLeiAnistia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrLeiAnistia(String value) {
                this.nrLeiAnistia = value;
            }

            /**
             * Obtém o valor da propriedade dtEfetRetorno.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtEfetRetorno() {
                return dtEfetRetorno;
            }

            /**
             * Define o valor da propriedade dtEfetRetorno.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtEfetRetorno(XMLGregorianCalendar value) {
                this.dtEfetRetorno = value;
            }

            /**
             * Obtém o valor da propriedade dtEfeito.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtEfeito() {
                return dtEfeito;
            }

            /**
             * Define o valor da propriedade dtEfeito.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtEfeito(XMLGregorianCalendar value) {
                this.dtEfeito = value;
            }

        }

    }

}
