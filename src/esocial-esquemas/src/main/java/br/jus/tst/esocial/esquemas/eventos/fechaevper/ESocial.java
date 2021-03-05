//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:13 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.fechaevper;

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
 *         &lt;element name="evtFechaEvPer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}T_ideEvento_folha_sem_retificacao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoFech">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="evtRemun" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="evtComProd" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="evtContratAvNP" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="evtInfoComplPer" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="indExcApur1250" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="S"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_Id" />
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
    "evtFechaEvPer",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtFechaEvPer evtFechaEvPer;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtFechaEvPer.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtFechaEvPer }
     *     
     */
    public ESocial.EvtFechaEvPer getEvtFechaEvPer() {
        return evtFechaEvPer;
    }

    /**
     * Define o valor da propriedade evtFechaEvPer.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtFechaEvPer }
     *     
     */
    public void setEvtFechaEvPer(ESocial.EvtFechaEvPer value) {
        this.evtFechaEvPer = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}T_ideEvento_folha_sem_retificacao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoFech">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="evtRemun" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="evtComProd" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="evtContratAvNP" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="evtInfoComplPer" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="indExcApur1250" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="S"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_Id" />
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
        "infoFech"
    })
    public static class EvtFechaEvPer {

        @XmlElement(required = true)
        protected TIdeEventoFolhaSemRetificacao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtFechaEvPer.InfoFech infoFech;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaSemRetificacao }
         *     
         */
        public TIdeEventoFolhaSemRetificacao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaSemRetificacao }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaSemRetificacao value) {
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
         * Obtém o valor da propriedade infoFech.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFechaEvPer.InfoFech }
         *     
         */
        public ESocial.EvtFechaEvPer.InfoFech getInfoFech() {
            return infoFech;
        }

        /**
         * Define o valor da propriedade infoFech.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFechaEvPer.InfoFech }
         *     
         */
        public void setInfoFech(ESocial.EvtFechaEvPer.InfoFech value) {
            this.infoFech = value;
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
         *         &lt;element name="evtRemun" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="evtComProd" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="evtContratAvNP" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="evtInfoComplPer" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="indExcApur1250" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="S"/>
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
            "evtRemun",
            "evtComProd",
            "evtContratAvNP",
            "evtInfoComplPer",
            "indExcApur1250"
        })
        public static class InfoFech {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtRemun;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtComProd;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtContratAvNP;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao evtInfoComplPer;
            protected String indExcApur1250;

            /**
             * Obtém o valor da propriedade evtRemun.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtRemun() {
                return evtRemun;
            }

            /**
             * Define o valor da propriedade evtRemun.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtRemun(TSSimNao value) {
                this.evtRemun = value;
            }

            /**
             * Obtém o valor da propriedade evtComProd.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtComProd() {
                return evtComProd;
            }

            /**
             * Define o valor da propriedade evtComProd.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtComProd(TSSimNao value) {
                this.evtComProd = value;
            }

            /**
             * Obtém o valor da propriedade evtContratAvNP.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtContratAvNP() {
                return evtContratAvNP;
            }

            /**
             * Define o valor da propriedade evtContratAvNP.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtContratAvNP(TSSimNao value) {
                this.evtContratAvNP = value;
            }

            /**
             * Obtém o valor da propriedade evtInfoComplPer.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getEvtInfoComplPer() {
                return evtInfoComplPer;
            }

            /**
             * Define o valor da propriedade evtInfoComplPer.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setEvtInfoComplPer(TSSimNao value) {
                this.evtInfoComplPer = value;
            }

            /**
             * Obtém o valor da propriedade indExcApur1250.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndExcApur1250() {
                return indExcApur1250;
            }

            /**
             * Define o valor da propriedade indExcApur1250.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndExcApur1250(String value) {
                this.indExcApur1250 = value;
            }

        }

    }

}
