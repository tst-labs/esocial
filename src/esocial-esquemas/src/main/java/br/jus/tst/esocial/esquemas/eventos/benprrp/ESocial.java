//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.03 at 06:57:24 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.benprrp;

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


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evtBenPrRP">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEvento_folha_opp"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideBenef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_cpf"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dmDev" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_codigo_esocial"/>
 *                             &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_nrBeneficio"/>
 *                             &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
 *                             &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
 *                             &lt;element name="infoPerApur" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perApur" maxOccurs="500"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoPerAnt" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="idePeriodo" maxOccurs="180">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_periodo_mensal"/>
 *                                                 &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perAnt" maxOccurs="500"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_Id" />
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
    "evtBenPrRP",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtBenPrRP evtBenPrRP;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtBenPrRP property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtBenPrRP }
     *     
     */
    public ESocial.EvtBenPrRP getEvtBenPrRP() {
        return evtBenPrRP;
    }

    /**
     * Sets the value of the evtBenPrRP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtBenPrRP }
     *     
     */
    public void setEvtBenPrRP(ESocial.EvtBenPrRP value) {
        this.evtBenPrRP = value;
    }

    /**
     * Gets the value of the signature property.
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
     * Sets the value of the signature property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEvento_folha_opp"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideBenef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_cpf"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dmDev" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_codigo_esocial"/>
     *                   &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_nrBeneficio"/>
     *                   &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
     *                   &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
     *                   &lt;element name="infoPerApur" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perApur" maxOccurs="500"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoPerAnt" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="idePeriodo" maxOccurs="180">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_periodo_mensal"/>
     *                                       &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perAnt" maxOccurs="500"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_Id" />
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
        "ideBenef",
        "dmDev"
    })
    public static class EvtBenPrRP {

        @XmlElement(required = true)
        protected TIdeEventoFolhaOpp ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtBenPrRP.IdeBenef ideBenef;
        @XmlElement(required = true)
        protected List<ESocial.EvtBenPrRP.DmDev> dmDev;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaOpp }
         *     
         */
        public TIdeEventoFolhaOpp getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaOpp }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaOpp value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
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
         * Sets the value of the ideEmpregador property.
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
         * Gets the value of the ideBenef property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtBenPrRP.IdeBenef }
         *     
         */
        public ESocial.EvtBenPrRP.IdeBenef getIdeBenef() {
            return ideBenef;
        }

        /**
         * Sets the value of the ideBenef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtBenPrRP.IdeBenef }
         *     
         */
        public void setIdeBenef(ESocial.EvtBenPrRP.IdeBenef value) {
            this.ideBenef = value;
        }

        /**
         * Gets the value of the dmDev property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dmDev property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDmDev().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtBenPrRP.DmDev }
         * 
         * 
         */
        public List<ESocial.EvtBenPrRP.DmDev> getDmDev() {
            if (dmDev == null) {
                dmDev = new ArrayList<ESocial.EvtBenPrRP.DmDev>();
            }
            return this.dmDev;
        }

        /**
         * Gets the value of the id property.
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
         * Sets the value of the id property.
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_codigo_esocial"/>
         *         &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_nrBeneficio"/>
         *         &lt;element name="indRRA" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_indRRA" minOccurs="0"/>
         *         &lt;element name="infoRRA" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_infoRRA" minOccurs="0"/>
         *         &lt;element name="infoPerApur" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perApur" maxOccurs="500"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoPerAnt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="idePeriodo" maxOccurs="180">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_periodo_mensal"/>
         *                             &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perAnt" maxOccurs="500"/>
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
            "ideDmDev",
            "nrBeneficio",
            "indRRA",
            "infoRRA",
            "infoPerApur",
            "infoPerAnt"
        })
        public static class DmDev {

            @XmlElement(required = true)
            protected String ideDmDev;
            @XmlElement(required = true)
            protected String nrBeneficio;
            @XmlSchemaType(name = "string")
            protected TSSim indRRA;
            protected TInfoRRA infoRRA;
            protected ESocial.EvtBenPrRP.DmDev.InfoPerApur infoPerApur;
            protected ESocial.EvtBenPrRP.DmDev.InfoPerAnt infoPerAnt;

            /**
             * Gets the value of the ideDmDev property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdeDmDev() {
                return ideDmDev;
            }

            /**
             * Sets the value of the ideDmDev property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdeDmDev(String value) {
                this.ideDmDev = value;
            }

            /**
             * Gets the value of the nrBeneficio property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrBeneficio() {
                return nrBeneficio;
            }

            /**
             * Sets the value of the nrBeneficio property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrBeneficio(String value) {
                this.nrBeneficio = value;
            }

            /**
             * Gets the value of the indRRA property.
             * 
             * @return
             *     possible object is
             *     {@link TSSim }
             *     
             */
            public TSSim getIndRRA() {
                return indRRA;
            }

            /**
             * Sets the value of the indRRA property.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSim }
             *     
             */
            public void setIndRRA(TSSim value) {
                this.indRRA = value;
            }

            /**
             * Gets the value of the infoRRA property.
             * 
             * @return
             *     possible object is
             *     {@link TInfoRRA }
             *     
             */
            public TInfoRRA getInfoRRA() {
                return infoRRA;
            }

            /**
             * Sets the value of the infoRRA property.
             * 
             * @param value
             *     allowed object is
             *     {@link TInfoRRA }
             *     
             */
            public void setInfoRRA(TInfoRRA value) {
                this.infoRRA = value;
            }

            /**
             * Gets the value of the infoPerApur property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtBenPrRP.DmDev.InfoPerApur }
             *     
             */
            public ESocial.EvtBenPrRP.DmDev.InfoPerApur getInfoPerApur() {
                return infoPerApur;
            }

            /**
             * Sets the value of the infoPerApur property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtBenPrRP.DmDev.InfoPerApur }
             *     
             */
            public void setInfoPerApur(ESocial.EvtBenPrRP.DmDev.InfoPerApur value) {
                this.infoPerApur = value;
            }

            /**
             * Gets the value of the infoPerAnt property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtBenPrRP.DmDev.InfoPerAnt }
             *     
             */
            public ESocial.EvtBenPrRP.DmDev.InfoPerAnt getInfoPerAnt() {
                return infoPerAnt;
            }

            /**
             * Sets the value of the infoPerAnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtBenPrRP.DmDev.InfoPerAnt }
             *     
             */
            public void setInfoPerAnt(ESocial.EvtBenPrRP.DmDev.InfoPerAnt value) {
                this.infoPerAnt = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="idePeriodo" maxOccurs="180">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_periodo_mensal"/>
             *                   &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perAnt" maxOccurs="500"/>
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
                "idePeriodo"
            })
            public static class InfoPerAnt {

                @XmlElement(required = true)
                protected List<ESocial.EvtBenPrRP.DmDev.InfoPerAnt.IdePeriodo> idePeriodo;

                /**
                 * Gets the value of the idePeriodo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the idePeriodo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIdePeriodo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtBenPrRP.DmDev.InfoPerAnt.IdePeriodo }
                 * 
                 * 
                 */
                public List<ESocial.EvtBenPrRP.DmDev.InfoPerAnt.IdePeriodo> getIdePeriodo() {
                    if (idePeriodo == null) {
                        idePeriodo = new ArrayList<ESocial.EvtBenPrRP.DmDev.InfoPerAnt.IdePeriodo>();
                    }
                    return this.idePeriodo;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_periodo_mensal"/>
                 *         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perAnt" maxOccurs="500"/>
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
                    "perRef",
                    "ideEstab"
                })
                public static class IdePeriodo {

                    @XmlElement(required = true)
                    protected String perRef;
                    @XmlElement(required = true)
                    protected List<TIdeEstabPerAnt> ideEstab;

                    /**
                     * Gets the value of the perRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPerRef() {
                        return perRef;
                    }

                    /**
                     * Sets the value of the perRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPerRef(String value) {
                        this.perRef = value;
                    }

                    /**
                     * Gets the value of the ideEstab property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ideEstab property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIdeEstab().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TIdeEstabPerAnt }
                     * 
                     * 
                     */
                    public List<TIdeEstabPerAnt> getIdeEstab() {
                        if (ideEstab == null) {
                            ideEstab = new ArrayList<TIdeEstabPerAnt>();
                        }
                        return this.ideEstab;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab_perApur" maxOccurs="500"/>
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
                "ideEstab"
            })
            public static class InfoPerApur {

                @XmlElement(required = true)
                protected List<TIdeEstabPerApur> ideEstab;

                /**
                 * Gets the value of the ideEstab property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ideEstab property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIdeEstab().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TIdeEstabPerApur }
                 * 
                 * 
                 */
                public List<TIdeEstabPerApur> getIdeEstab() {
                    if (ideEstab == null) {
                        ideEstab = new ArrayList<TIdeEstabPerApur>();
                    }
                    return this.ideEstab;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}TS_cpf"/>
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
            "cpfBenef"
        })
        public static class IdeBenef {

            @XmlElement(required = true)
            protected String cpfBenef;

            /**
             * Gets the value of the cpfBenef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfBenef() {
                return cpfBenef;
            }

            /**
             * Sets the value of the cpfBenef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfBenef(String value) {
                this.cpfBenef = value;
            }

        }

    }

}
