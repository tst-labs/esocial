//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:27 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabprocesso;

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
 *         &lt;element name="evtTabProcesso">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideEvento_evtTab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoProcesso">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="inclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
 *                                         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="alteracao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
 *                                         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="exclusao">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}TS_Id" />
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
    "evtTabProcesso",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtTabProcesso evtTabProcesso;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabProcesso.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabProcesso }
     *     
     */
    public ESocial.EvtTabProcesso getEvtTabProcesso() {
        return evtTabProcesso;
    }

    /**
     * Define o valor da propriedade evtTabProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabProcesso }
     *     
     */
    public void setEvtTabProcesso(ESocial.EvtTabProcesso value) {
        this.evtTabProcesso = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideEvento_evtTab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoProcesso">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="inclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
     *                               &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="alteracao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
     *                               &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="exclusao">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}TS_Id" />
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
        "infoProcesso"
    })
    public static class EvtTabProcesso {

        @XmlElement(required = true)
        protected TIdeEventoEvtTab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtTabProcesso.InfoProcesso infoProcesso;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoEvtTab }
         *     
         */
        public TIdeEventoEvtTab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoEvtTab }
         *     
         */
        public void setIdeEvento(TIdeEventoEvtTab value) {
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
         * Obtém o valor da propriedade infoProcesso.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabProcesso.InfoProcesso }
         *     
         */
        public ESocial.EvtTabProcesso.InfoProcesso getInfoProcesso() {
            return infoProcesso;
        }

        /**
         * Define o valor da propriedade infoProcesso.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabProcesso.InfoProcesso }
         *     
         */
        public void setInfoProcesso(ESocial.EvtTabProcesso.InfoProcesso value) {
            this.infoProcesso = value;
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
         *           &lt;element name="inclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
         *                     &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="alteracao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
         *                     &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="exclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
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
            "inclusao",
            "alteracao",
            "exclusao"
        })
        public static class InfoProcesso {

            protected ESocial.EvtTabProcesso.InfoProcesso.Inclusao inclusao;
            protected ESocial.EvtTabProcesso.InfoProcesso.Alteracao alteracao;
            protected ESocial.EvtTabProcesso.InfoProcesso.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Inclusao }
             *     
             */
            public ESocial.EvtTabProcesso.InfoProcesso.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabProcesso.InfoProcesso.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Alteracao }
             *     
             */
            public ESocial.EvtTabProcesso.InfoProcesso.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabProcesso.InfoProcesso.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Exclusao }
             *     
             */
            public ESocial.EvtTabProcesso.InfoProcesso.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabProcesso.InfoProcesso.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabProcesso.InfoProcesso.Exclusao value) {
                this.exclusao = value;
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
             *         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
             *         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
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
                "ideProcesso",
                "dadosProc",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(required = true)
                protected TIdeProcesso ideProcesso;
                @XmlElement(required = true)
                protected TDadosProc dadosProc;
                protected TNovaValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideProcesso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public TIdeProcesso getIdeProcesso() {
                    return ideProcesso;
                }

                /**
                 * Define o valor da propriedade ideProcesso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public void setIdeProcesso(TIdeProcesso value) {
                    this.ideProcesso = value;
                }

                /**
                 * Obtém o valor da propriedade dadosProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosProc }
                 *     
                 */
                public TDadosProc getDadosProc() {
                    return dadosProc;
                }

                /**
                 * Define o valor da propriedade dadosProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosProc }
                 *     
                 */
                public void setDadosProc(TDadosProc value) {
                    this.dadosProc = value;
                }

                /**
                 * Obtém o valor da propriedade novaValidade.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNovaValidade }
                 *     
                 */
                public TNovaValidade getNovaValidade() {
                    return novaValidade;
                }

                /**
                 * Define o valor da propriedade novaValidade.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNovaValidade }
                 *     
                 */
                public void setNovaValidade(TNovaValidade value) {
                    this.novaValidade = value;
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
             *         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
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
                "ideProcesso"
            })
            public static class Exclusao {

                @XmlElement(required = true)
                protected TIdeProcesso ideProcesso;

                /**
                 * Obtém o valor da propriedade ideProcesso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public TIdeProcesso getIdeProcesso() {
                    return ideProcesso;
                }

                /**
                 * Define o valor da propriedade ideProcesso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public void setIdeProcesso(TIdeProcesso value) {
                    this.ideProcesso = value;
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
             *         &lt;element name="ideProcesso" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_ideProcesso"/>
             *         &lt;element name="dadosProc" type="{http://www.esocial.gov.br/schema/evt/evtTabProcesso/v_S_01_00_00}T_dadosProc"/>
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
                "ideProcesso",
                "dadosProc"
            })
            public static class Inclusao {

                @XmlElement(required = true)
                protected TIdeProcesso ideProcesso;
                @XmlElement(required = true)
                protected TDadosProc dadosProc;

                /**
                 * Obtém o valor da propriedade ideProcesso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public TIdeProcesso getIdeProcesso() {
                    return ideProcesso;
                }

                /**
                 * Define o valor da propriedade ideProcesso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeProcesso }
                 *     
                 */
                public void setIdeProcesso(TIdeProcesso value) {
                    this.ideProcesso = value;
                }

                /**
                 * Obtém o valor da propriedade dadosProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosProc }
                 *     
                 */
                public TDadosProc getDadosProc() {
                    return dadosProc;
                }

                /**
                 * Define o valor da propriedade dadosProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosProc }
                 *     
                 */
                public void setDadosProc(TDadosProc value) {
                    this.dadosProc = value;
                }

            }

        }

    }

}
