//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:26 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tablotacao;

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
 *         &lt;element name="evtTabLotacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideEvento_evtTab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoLotacao">
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
 *                                         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
 *                                         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
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
 *                                         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
 *                                         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_Id" />
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
    "evtTabLotacao",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtTabLotacao evtTabLotacao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabLotacao.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabLotacao }
     *     
     */
    public ESocial.EvtTabLotacao getEvtTabLotacao() {
        return evtTabLotacao;
    }

    /**
     * Define o valor da propriedade evtTabLotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabLotacao }
     *     
     */
    public void setEvtTabLotacao(ESocial.EvtTabLotacao value) {
        this.evtTabLotacao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideEvento_evtTab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoLotacao">
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
     *                               &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
     *                               &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
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
     *                               &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
     *                               &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_Id" />
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
        "infoLotacao"
    })
    public static class EvtTabLotacao {

        @XmlElement(required = true)
        protected TIdeEventoEvtTab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtTabLotacao.InfoLotacao infoLotacao;
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
         * Obtém o valor da propriedade infoLotacao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabLotacao.InfoLotacao }
         *     
         */
        public ESocial.EvtTabLotacao.InfoLotacao getInfoLotacao() {
            return infoLotacao;
        }

        /**
         * Define o valor da propriedade infoLotacao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabLotacao.InfoLotacao }
         *     
         */
        public void setInfoLotacao(ESocial.EvtTabLotacao.InfoLotacao value) {
            this.infoLotacao = value;
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
         *                     &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
         *                     &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
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
         *                     &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
         *                     &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
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
        public static class InfoLotacao {

            protected ESocial.EvtTabLotacao.InfoLotacao.Inclusao inclusao;
            protected ESocial.EvtTabLotacao.InfoLotacao.Alteracao alteracao;
            protected ESocial.EvtTabLotacao.InfoLotacao.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Inclusao }
             *     
             */
            public ESocial.EvtTabLotacao.InfoLotacao.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabLotacao.InfoLotacao.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Alteracao }
             *     
             */
            public ESocial.EvtTabLotacao.InfoLotacao.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabLotacao.InfoLotacao.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Exclusao }
             *     
             */
            public ESocial.EvtTabLotacao.InfoLotacao.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabLotacao.InfoLotacao.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabLotacao.InfoLotacao.Exclusao value) {
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
             *         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
             *         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_novaValidade" minOccurs="0"/>
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
                "ideLotacao",
                "dadosLotacao",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(required = true)
                protected TIdeLotacao ideLotacao;
                @XmlElement(required = true)
                protected TDadosLotacao dadosLotacao;
                protected TNovaValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideLotacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public TIdeLotacao getIdeLotacao() {
                    return ideLotacao;
                }

                /**
                 * Define o valor da propriedade ideLotacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public void setIdeLotacao(TIdeLotacao value) {
                    this.ideLotacao = value;
                }

                /**
                 * Obtém o valor da propriedade dadosLotacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public TDadosLotacao getDadosLotacao() {
                    return dadosLotacao;
                }

                /**
                 * Define o valor da propriedade dadosLotacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public void setDadosLotacao(TDadosLotacao value) {
                    this.dadosLotacao = value;
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
             *         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
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
                "ideLotacao"
            })
            public static class Exclusao {

                @XmlElement(required = true)
                protected TIdeLotacao ideLotacao;

                /**
                 * Obtém o valor da propriedade ideLotacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public TIdeLotacao getIdeLotacao() {
                    return ideLotacao;
                }

                /**
                 * Define o valor da propriedade ideLotacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public void setIdeLotacao(TIdeLotacao value) {
                    this.ideLotacao = value;
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
             *         &lt;element name="ideLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_ideLotacao"/>
             *         &lt;element name="dadosLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}T_dadosLotacao"/>
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
                "ideLotacao",
                "dadosLotacao"
            })
            public static class Inclusao {

                @XmlElement(required = true)
                protected TIdeLotacao ideLotacao;
                @XmlElement(required = true)
                protected TDadosLotacao dadosLotacao;

                /**
                 * Obtém o valor da propriedade ideLotacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public TIdeLotacao getIdeLotacao() {
                    return ideLotacao;
                }

                /**
                 * Define o valor da propriedade ideLotacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeLotacao }
                 *     
                 */
                public void setIdeLotacao(TIdeLotacao value) {
                    this.ideLotacao = value;
                }

                /**
                 * Obtém o valor da propriedade dadosLotacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public TDadosLotacao getDadosLotacao() {
                    return dadosLotacao;
                }

                /**
                 * Define o valor da propriedade dadosLotacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosLotacao }
                 *     
                 */
                public void setDadosLotacao(TDadosLotacao value) {
                    this.dadosLotacao = value;
                }

            }

        }

    }

}
