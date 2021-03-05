//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:54 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.baixa;

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
 *         &lt;element name="evtBaixa">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}T_ideEvento_trab_jud"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}T_ideVinculo"/>
 *                   &lt;element name="infoBaixa">
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
 *                             &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_nrProcJud"/>
 *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_Id" />
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
    "evtBaixa",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtBaixa evtBaixa;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtBaixa.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtBaixa }
     *     
     */
    public ESocial.EvtBaixa getEvtBaixa() {
        return evtBaixa;
    }

    /**
     * Define o valor da propriedade evtBaixa.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtBaixa }
     *     
     */
    public void setEvtBaixa(ESocial.EvtBaixa value) {
        this.evtBaixa = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}T_ideEvento_trab_jud"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}T_ideVinculo"/>
     *         &lt;element name="infoBaixa">
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
     *                   &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_nrProcJud"/>
     *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_observacao" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_Id" />
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
        "infoBaixa"
    })
    public static class EvtBaixa {

        @XmlElement(required = true)
        protected TIdeEventoTrabJud ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculo ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtBaixa.InfoBaixa infoBaixa;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabJud }
         *     
         */
        public TIdeEventoTrabJud getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabJud }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabJud value) {
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
         * Obtém o valor da propriedade infoBaixa.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtBaixa.InfoBaixa }
         *     
         */
        public ESocial.EvtBaixa.InfoBaixa getInfoBaixa() {
            return infoBaixa;
        }

        /**
         * Define o valor da propriedade infoBaixa.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtBaixa.InfoBaixa }
         *     
         */
        public void setInfoBaixa(ESocial.EvtBaixa.InfoBaixa value) {
            this.infoBaixa = value;
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
         *         &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_nrProcJud"/>
         *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtBaixa/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
            "dtProjFimAPI",
            "nrProcTrab",
            "observacao"
        })
        public static class InfoBaixa {

            @XmlElement(required = true)
            protected String mtvDeslig;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtDeslig;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtProjFimAPI;
            @XmlElement(required = true)
            protected String nrProcTrab;
            protected String observacao;

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
