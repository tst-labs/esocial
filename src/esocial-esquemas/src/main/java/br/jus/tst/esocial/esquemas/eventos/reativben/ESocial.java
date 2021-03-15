//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:21 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.reativben;

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
 *         &lt;element name="evtReativBen">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}T_ideEvento_trab_PJ"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}T_ideBeneficio"/>
 *                   &lt;element name="infoReativ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtEfetReativ" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtEfeito" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}TS_Id" />
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
    "evtReativBen",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtReativBen evtReativBen;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtReativBen.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtReativBen }
     *     
     */
    public ESocial.EvtReativBen getEvtReativBen() {
        return evtReativBen;
    }

    /**
     * Define o valor da propriedade evtReativBen.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtReativBen }
     *     
     */
    public void setEvtReativBen(ESocial.EvtReativBen value) {
        this.evtReativBen = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}T_ideEvento_trab_PJ"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}T_ideBeneficio"/>
     *         &lt;element name="infoReativ">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtEfetReativ" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtEfeito" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtReativBen/v_S_01_00_00}TS_Id" />
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
        "ideBeneficio",
        "infoReativ"
    })
    public static class EvtReativBen {

        @XmlElement(required = true)
        protected TIdeEventoTrabPJ ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected TIdeBeneficio ideBeneficio;
        @XmlElement(required = true)
        protected ESocial.EvtReativBen.InfoReativ infoReativ;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public TIdeEventoTrabPJ getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabPJ value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public TIdeEmpregadorCnpj getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregadorCnpj value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideBeneficio.
         * 
         * @return
         *     possible object is
         *     {@link TIdeBeneficio }
         *     
         */
        public TIdeBeneficio getIdeBeneficio() {
            return ideBeneficio;
        }

        /**
         * Define o valor da propriedade ideBeneficio.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeBeneficio }
         *     
         */
        public void setIdeBeneficio(TIdeBeneficio value) {
            this.ideBeneficio = value;
        }

        /**
         * Obtém o valor da propriedade infoReativ.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtReativBen.InfoReativ }
         *     
         */
        public ESocial.EvtReativBen.InfoReativ getInfoReativ() {
            return infoReativ;
        }

        /**
         * Define o valor da propriedade infoReativ.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtReativBen.InfoReativ }
         *     
         */
        public void setInfoReativ(ESocial.EvtReativBen.InfoReativ value) {
            this.infoReativ = value;
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
         *         &lt;element name="dtEfetReativ" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "dtEfetReativ",
            "dtEfeito"
        })
        public static class InfoReativ {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtEfetReativ;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtEfeito;

            /**
             * Obtém o valor da propriedade dtEfetReativ.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtEfetReativ() {
                return dtEfetReativ;
            }

            /**
             * Define o valor da propriedade dtEfetReativ.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtEfetReativ(XMLGregorianCalendar value) {
                this.dtEfetReativ = value;
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
