//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:07 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.contratavnp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="evtContratAvNP">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEvento_folha_mensal"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="remunAvNP" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_tpInsc_1_3_4"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_nrInsc_12_14"/>
 *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_codigo_esocial"/>
 *                             &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrBcFgts" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_Id" />
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
    "evtContratAvNP",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtContratAvNP evtContratAvNP;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtContratAvNP.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtContratAvNP }
     *     
     */
    public ESocial.EvtContratAvNP getEvtContratAvNP() {
        return evtContratAvNP;
    }

    /**
     * Define o valor da propriedade evtContratAvNP.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtContratAvNP }
     *     
     */
    public void setEvtContratAvNP(ESocial.EvtContratAvNP value) {
        this.evtContratAvNP = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEvento_folha_mensal"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="remunAvNP" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_tpInsc_1_3_4"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_nrInsc_12_14"/>
     *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_codigo_esocial"/>
     *                   &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrBcFgts" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_Id" />
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
        "remunAvNP"
    })
    public static class EvtContratAvNP {

        @XmlElement(required = true)
        protected TIdeEventoFolhaMensal ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected List<ESocial.EvtContratAvNP.RemunAvNP> remunAvNP;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public TIdeEventoFolhaMensal getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaMensal value) {
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
         * Gets the value of the remunAvNP property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remunAvNP property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemunAvNP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtContratAvNP.RemunAvNP }
         * 
         * 
         */
        public List<ESocial.EvtContratAvNP.RemunAvNP> getRemunAvNP() {
            if (remunAvNP == null) {
                remunAvNP = new ArrayList<ESocial.EvtContratAvNP.RemunAvNP>();
            }
            return this.remunAvNP;
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
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_tpInsc_1_3_4"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_nrInsc_12_14"/>
         *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_codigo_esocial"/>
         *         &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrBcFgts" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_00_00}TS_valorMonetario"/>
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
            "vrBcCp00",
            "vrBcCp15",
            "vrBcCp20",
            "vrBcCp25",
            "vrBcCp13",
            "vrBcFgts",
            "vrDescCP"
        })
        public static class RemunAvNP {

            protected byte tpInsc;
            @XmlElement(required = true)
            protected String nrInsc;
            @XmlElement(required = true)
            protected String codLotacao;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp00;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp15;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp20;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp25;
            @XmlElement(required = true)
            protected BigDecimal vrBcCp13;
            @XmlElement(required = true)
            protected BigDecimal vrBcFgts;
            @XmlElement(required = true)
            protected BigDecimal vrDescCP;

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
             * Obtém o valor da propriedade vrBcCp00.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp00() {
                return vrBcCp00;
            }

            /**
             * Define o valor da propriedade vrBcCp00.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp00(BigDecimal value) {
                this.vrBcCp00 = value;
            }

            /**
             * Obtém o valor da propriedade vrBcCp15.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp15() {
                return vrBcCp15;
            }

            /**
             * Define o valor da propriedade vrBcCp15.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp15(BigDecimal value) {
                this.vrBcCp15 = value;
            }

            /**
             * Obtém o valor da propriedade vrBcCp20.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp20() {
                return vrBcCp20;
            }

            /**
             * Define o valor da propriedade vrBcCp20.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp20(BigDecimal value) {
                this.vrBcCp20 = value;
            }

            /**
             * Obtém o valor da propriedade vrBcCp25.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp25() {
                return vrBcCp25;
            }

            /**
             * Define o valor da propriedade vrBcCp25.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp25(BigDecimal value) {
                this.vrBcCp25 = value;
            }

            /**
             * Obtém o valor da propriedade vrBcCp13.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcCp13() {
                return vrBcCp13;
            }

            /**
             * Define o valor da propriedade vrBcCp13.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcCp13(BigDecimal value) {
                this.vrBcCp13 = value;
            }

            /**
             * Obtém o valor da propriedade vrBcFgts.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrBcFgts() {
                return vrBcFgts;
            }

            /**
             * Define o valor da propriedade vrBcFgts.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrBcFgts(BigDecimal value) {
                this.vrBcFgts = value;
            }

            /**
             * Obtém o valor da propriedade vrDescCP.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrDescCP() {
                return vrDescCP;
            }

            /**
             * Define o valor da propriedade vrDescCP.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrDescCP(BigDecimal value) {
                this.vrDescCP = value;
            }

        }

    }

}
