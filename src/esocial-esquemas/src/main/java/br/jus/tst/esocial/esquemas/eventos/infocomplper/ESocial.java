//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:15 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.infocomplper;

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
 *         &lt;element name="evtInfoComplPer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEvento_folha"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoSubstPatr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_indSubstPatr"/>
 *                             &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoSubstPatrOpPort" maxOccurs="9999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_codigo_esocial"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoAtivConcom" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
 *                             &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_Id" />
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
    "evtInfoComplPer",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtInfoComplPer evtInfoComplPer;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtInfoComplPer.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtInfoComplPer }
     *     
     */
    public ESocial.EvtInfoComplPer getEvtInfoComplPer() {
        return evtInfoComplPer;
    }

    /**
     * Define o valor da propriedade evtInfoComplPer.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtInfoComplPer }
     *     
     */
    public void setEvtInfoComplPer(ESocial.EvtInfoComplPer value) {
        this.evtInfoComplPer = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEvento_folha"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoSubstPatr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_indSubstPatr"/>
     *                   &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoSubstPatrOpPort" maxOccurs="9999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_codigo_esocial"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoAtivConcom" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
     *                   &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_Id" />
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
        "infoSubstPatr",
        "infoSubstPatrOpPort",
        "infoAtivConcom"
    })
    public static class EvtInfoComplPer {

        @XmlElement(required = true)
        protected TIdeEventoFolha ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        protected ESocial.EvtInfoComplPer.InfoSubstPatr infoSubstPatr;
        protected List<ESocial.EvtInfoComplPer.InfoSubstPatrOpPort> infoSubstPatrOpPort;
        protected ESocial.EvtInfoComplPer.InfoAtivConcom infoAtivConcom;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolha }
         *     
         */
        public TIdeEventoFolha getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolha }
         *     
         */
        public void setIdeEvento(TIdeEventoFolha value) {
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
         * Obtém o valor da propriedade infoSubstPatr.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoComplPer.InfoSubstPatr }
         *     
         */
        public ESocial.EvtInfoComplPer.InfoSubstPatr getInfoSubstPatr() {
            return infoSubstPatr;
        }

        /**
         * Define o valor da propriedade infoSubstPatr.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoComplPer.InfoSubstPatr }
         *     
         */
        public void setInfoSubstPatr(ESocial.EvtInfoComplPer.InfoSubstPatr value) {
            this.infoSubstPatr = value;
        }

        /**
         * Gets the value of the infoSubstPatrOpPort property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoSubstPatrOpPort property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoSubstPatrOpPort().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtInfoComplPer.InfoSubstPatrOpPort }
         * 
         * 
         */
        public List<ESocial.EvtInfoComplPer.InfoSubstPatrOpPort> getInfoSubstPatrOpPort() {
            if (infoSubstPatrOpPort == null) {
                infoSubstPatrOpPort = new ArrayList<ESocial.EvtInfoComplPer.InfoSubstPatrOpPort>();
            }
            return this.infoSubstPatrOpPort;
        }

        /**
         * Obtém o valor da propriedade infoAtivConcom.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoComplPer.InfoAtivConcom }
         *     
         */
        public ESocial.EvtInfoComplPer.InfoAtivConcom getInfoAtivConcom() {
            return infoAtivConcom;
        }

        /**
         * Define o valor da propriedade infoAtivConcom.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoComplPer.InfoAtivConcom }
         *     
         */
        public void setInfoAtivConcom(ESocial.EvtInfoComplPer.InfoAtivConcom value) {
            this.infoAtivConcom = value;
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
         *         &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
         *         &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
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
            "fatorMes",
            "fator13"
        })
        public static class InfoAtivConcom {

            @XmlElement(required = true)
            protected BigDecimal fatorMes;
            @XmlElement(required = true)
            protected BigDecimal fator13;

            /**
             * Obtém o valor da propriedade fatorMes.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFatorMes() {
                return fatorMes;
            }

            /**
             * Define o valor da propriedade fatorMes.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFatorMes(BigDecimal value) {
                this.fatorMes = value;
            }

            /**
             * Obtém o valor da propriedade fator13.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFator13() {
                return fator13;
            }

            /**
             * Define o valor da propriedade fator13.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFator13(BigDecimal value) {
                this.fator13 = value;
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
         *         &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_indSubstPatr"/>
         *         &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_percentual"/>
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
            "indSubstPatr",
            "percRedContrib"
        })
        public static class InfoSubstPatr {

            protected byte indSubstPatr;
            @XmlElement(required = true)
            protected BigDecimal percRedContrib;

            /**
             * Obtém o valor da propriedade indSubstPatr.
             * 
             */
            public byte getIndSubstPatr() {
                return indSubstPatr;
            }

            /**
             * Define o valor da propriedade indSubstPatr.
             * 
             */
            public void setIndSubstPatr(byte value) {
                this.indSubstPatr = value;
            }

            /**
             * Obtém o valor da propriedade percRedContrib.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercRedContrib() {
                return percRedContrib;
            }

            /**
             * Define o valor da propriedade percRedContrib.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercRedContrib(BigDecimal value) {
                this.percRedContrib = value;
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
         *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtInfoComplPer/v_S_01_00_00}TS_codigo_esocial"/>
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
            "codLotacao"
        })
        public static class InfoSubstPatrOpPort {

            @XmlElement(required = true)
            protected String codLotacao;

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

        }

    }

}
