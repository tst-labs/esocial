//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:05 PM BRT 
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
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}T_ideEvento_trab_PJ"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}T_ideVinculo"/>
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
 *                                         &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_cnpj"/>
 *                                         &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_sim_nao"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_Id" />
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
     * Obtém o valor da propriedade evtCessao.
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
     * Define o valor da propriedade evtCessao.
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}T_ideEvento_trab_PJ"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}T_ideVinculo"/>
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
     *                               &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_cnpj"/>
     *                               &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_sim_nao"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_Id" />
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
         * Obtém o valor da propriedade infoCessao.
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
         * Define o valor da propriedade infoCessao.
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
         *           &lt;element name="iniCessao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_cnpj"/>
         *                     &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_sim_nao"/>
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
             * Obtém o valor da propriedade iniCessao.
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
             * Define o valor da propriedade iniCessao.
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
             * Obtém o valor da propriedade fimCessao.
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
             * Define o valor da propriedade fimCessao.
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
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
                 * Obtém o valor da propriedade dtTermCessao.
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
                 * Define o valor da propriedade dtTermCessao.
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
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_cnpj"/>
             *         &lt;element name="respRemun" type="{http://www.esocial.gov.br/schema/evt/evtCessao/v_S_01_00_00}TS_sim_nao"/>
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
                 * Obtém o valor da propriedade dtIniCessao.
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
                 * Define o valor da propriedade dtIniCessao.
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
                 * Obtém o valor da propriedade cnpjCess.
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
                 * Define o valor da propriedade cnpjCess.
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
                 * Obtém o valor da propriedade respRemun.
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
                 * Define o valor da propriedade respRemun.
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
