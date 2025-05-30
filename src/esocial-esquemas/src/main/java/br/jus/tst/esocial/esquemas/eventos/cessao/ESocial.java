//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.03 at 06:57:28 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cessao;

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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evtCessao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}T_ideEvento_trab_PJ"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}T_ideVinculo"/>
 *                   &lt;element name="infoCessao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="iniCessao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_cnpj"/>
 *                                         &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_sim_nao"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="fimCessao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="dtTermCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_Id" />
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
    "evtCessao",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtCessao evtCessao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtCessao property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCessao }
     *     
     */
    public ESocial.EvtCessao getEvtCessao() {
        return evtCessao;
    }

    /**
     * Sets the value of the evtCessao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCessao }
     *     
     */
    public void setEvtCessao(ESocial.EvtCessao value) {
        this.evtCessao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}T_ideEvento_trab_PJ"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}T_ideVinculo"/>
     *         &lt;element name="infoCessao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="iniCessao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_cnpj"/>
     *                               &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_sim_nao"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="fimCessao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="dtTermCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_Id" />
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
        "infoCessao"
    })
    public static class EvtCessao {

        @XmlElement(required = true)
        protected TIdeEventoTrabPJ ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculo ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtCessao.InfoCessao infoCessao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
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
         * Sets the value of the ideEvento property.
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
         * Gets the value of the ideVinculo property.
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
         * Sets the value of the ideVinculo property.
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
         * Gets the value of the infoCessao property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCessao.InfoCessao }
         *     
         */
        public ESocial.EvtCessao.InfoCessao getInfoCessao() {
            return infoCessao;
        }

        /**
         * Sets the value of the infoCessao property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCessao.InfoCessao }
         *     
         */
        public void setInfoCessao(ESocial.EvtCessao.InfoCessao value) {
            this.infoCessao = value;
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
         *         &lt;choice>
         *           &lt;element name="iniCessao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_cnpj"/>
         *                     &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_sim_nao"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="fimCessao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="dtTermCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "iniCessao",
            "fimCessao"
        })
        public static class InfoCessao {

            protected ESocial.EvtCessao.InfoCessao.IniCessao iniCessao;
            protected ESocial.EvtCessao.InfoCessao.FimCessao fimCessao;

            /**
             * Gets the value of the iniCessao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCessao.InfoCessao.IniCessao }
             *     
             */
            public ESocial.EvtCessao.InfoCessao.IniCessao getIniCessao() {
                return iniCessao;
            }

            /**
             * Sets the value of the iniCessao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCessao.InfoCessao.IniCessao }
             *     
             */
            public void setIniCessao(ESocial.EvtCessao.InfoCessao.IniCessao value) {
                this.iniCessao = value;
            }

            /**
             * Gets the value of the fimCessao property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCessao.InfoCessao.FimCessao }
             *     
             */
            public ESocial.EvtCessao.InfoCessao.FimCessao getFimCessao() {
                return fimCessao;
            }

            /**
             * Sets the value of the fimCessao property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCessao.InfoCessao.FimCessao }
             *     
             */
            public void setFimCessao(ESocial.EvtCessao.InfoCessao.FimCessao value) {
                this.fimCessao = value;
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
             *         &lt;element name="dtTermCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "dtTermCessao"
            })
            public static class FimCessao {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTermCessao;

                /**
                 * Gets the value of the dtTermCessao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTermCessao() {
                    return dtTermCessao;
                }

                /**
                 * Sets the value of the dtTermCessao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTermCessao(XMLGregorianCalendar value) {
                    this.dtTermCessao = value;
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
             *         &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_cnpj"/>
             *         &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_03_00}TS_sim_nao"/>
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
                "dtIniCessao",
                "cnpjCess",
                "respRemun"
            })
            public static class IniCessao {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtIniCessao;
                @XmlElement(required = true)
                protected String cnpjCess;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao respRemun;

                /**
                 * Gets the value of the dtIniCessao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIniCessao() {
                    return dtIniCessao;
                }

                /**
                 * Sets the value of the dtIniCessao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIniCessao(XMLGregorianCalendar value) {
                    this.dtIniCessao = value;
                }

                /**
                 * Gets the value of the cnpjCess property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCnpjCess() {
                    return cnpjCess;
                }

                /**
                 * Sets the value of the cnpjCess property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCnpjCess(String value) {
                    this.cnpjCess = value;
                }

                /**
                 * Gets the value of the respRemun property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getRespRemun() {
                    return respRemun;
                }

                /**
                 * Sets the value of the respRemun property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setRespRemun(TSSimNao value) {
                    this.respRemun = value;
                }

            }

        }

    }

}
