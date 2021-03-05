//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:58 PM BRT 
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
 *         &lt;element name="evtBenPrRP">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEvento_folha_opp"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideBenef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_cpf"/>
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
 *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_codigo_esocial"/>
 *                             &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_nrBeneficio"/>
 *                             &lt;element name="infoPerApur" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
 *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_periodo_mensal"/>
 *                                                 &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_Id" />
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
     * Obtém o valor da propriedade evtBenPrRP.
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
     * Define o valor da propriedade evtBenPrRP.
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEvento_folha_opp"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideBenef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_cpf"/>
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
     *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_codigo_esocial"/>
     *                   &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_nrBeneficio"/>
     *                   &lt;element name="infoPerApur" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
     *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_periodo_mensal"/>
     *                                       &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_Id" />
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
         * Obtém o valor da propriedade ideEvento.
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
         * Define o valor da propriedade ideEvento.
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
         * Obtém o valor da propriedade ideBenef.
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
         * Define o valor da propriedade ideBenef.
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
         *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_codigo_esocial"/>
         *         &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_nrBeneficio"/>
         *         &lt;element name="infoPerApur" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
         *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_periodo_mensal"/>
         *                             &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
            "infoPerApur",
            "infoPerAnt"
        })
        public static class DmDev {

            @XmlElement(required = true)
            protected String ideDmDev;
            @XmlElement(required = true)
            protected String nrBeneficio;
            protected ESocial.EvtBenPrRP.DmDev.InfoPerApur infoPerApur;
            protected ESocial.EvtBenPrRP.DmDev.InfoPerAnt infoPerAnt;

            /**
             * Obtém o valor da propriedade ideDmDev.
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
             * Define o valor da propriedade ideDmDev.
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
             * Obtém o valor da propriedade nrBeneficio.
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
             * Define o valor da propriedade nrBeneficio.
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
             * Obtém o valor da propriedade infoPerApur.
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
             * Define o valor da propriedade infoPerApur.
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
             * Obtém o valor da propriedade infoPerAnt.
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
             * Define o valor da propriedade infoPerAnt.
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
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
             *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_periodo_mensal"/>
             *                   &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_periodo_mensal"/>
                 *         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
                    protected List<TIdeEstab> ideEstab;

                    /**
                     * Obtém o valor da propriedade perRef.
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
                     * Define o valor da propriedade perRef.
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
                     * {@link TIdeEstab }
                     * 
                     * 
                     */
                    public List<TIdeEstab> getIdeEstab() {
                        if (ideEstab == null) {
                            ideEstab = new ArrayList<TIdeEstab>();
                        }
                        return this.ideEstab;
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
             *         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_ideEstab" maxOccurs="500"/>
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
                protected List<TIdeEstab> ideEstab;

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
                 * {@link TIdeEstab }
                 * 
                 * 
                 */
                public List<TIdeEstab> getIdeEstab() {
                    if (ideEstab == null) {
                        ideEstab = new ArrayList<TIdeEstab>();
                    }
                    return this.ideEstab;
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
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_cpf"/>
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
             * Obtém o valor da propriedade cpfBenef.
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
             * Define o valor da propriedade cpfBenef.
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
