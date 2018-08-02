//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:08 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabfuncao;

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
 *         &lt;element name="evtTabFuncao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TEmpregador"/>
 *                   &lt;element name="infoFuncao">
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
 *                                         &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
 *                                         &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
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
 *                                         &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
 *                                         &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
    "evtTabFuncao",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
    protected ESocial.EvtTabFuncao evtTabFuncao;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabFuncao.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabFuncao }
     *     
     */
    public ESocial.EvtTabFuncao getEvtTabFuncao() {
        return evtTabFuncao;
    }

    /**
     * Define o valor da propriedade evtTabFuncao.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabFuncao }
     *     
     */
    public void setEvtTabFuncao(ESocial.EvtTabFuncao value) {
        this.evtTabFuncao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TEmpregador"/>
     *         &lt;element name="infoFuncao">
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
     *                               &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
     *                               &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
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
     *                               &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
     *                               &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
        "infoFuncao"
    })
    public static class EvtTabFuncao {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
        protected ESocial.EvtTabFuncao.InfoFuncao infoFuncao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeCadastro }
         *     
         */
        public TIdeCadastro getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeCadastro }
         *     
         */
        public void setIdeEvento(TIdeCadastro value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TEmpregador }
         *     
         */
        public TEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TEmpregador }
         *     
         */
        public void setIdeEmpregador(TEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoFuncao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabFuncao.InfoFuncao }
         *     
         */
        public ESocial.EvtTabFuncao.InfoFuncao getInfoFuncao() {
            return infoFuncao;
        }

        /**
         * Define o valor da propriedade infoFuncao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabFuncao.InfoFuncao }
         *     
         */
        public void setInfoFuncao(ESocial.EvtTabFuncao.InfoFuncao value) {
            this.infoFuncao = value;
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
         *                     &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
         *                     &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
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
         *                     &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
         *                     &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
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
        public static class InfoFuncao {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02")
            protected ESocial.EvtTabFuncao.InfoFuncao.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02")
            protected ESocial.EvtTabFuncao.InfoFuncao.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02")
            protected ESocial.EvtTabFuncao.InfoFuncao.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabFuncao.InfoFuncao.Inclusao }
             *     
             */
            public ESocial.EvtTabFuncao.InfoFuncao.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabFuncao.InfoFuncao.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabFuncao.InfoFuncao.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabFuncao.InfoFuncao.Alteracao }
             *     
             */
            public ESocial.EvtTabFuncao.InfoFuncao.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabFuncao.InfoFuncao.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabFuncao.InfoFuncao.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabFuncao.InfoFuncao.Exclusao }
             *     
             */
            public ESocial.EvtTabFuncao.InfoFuncao.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabFuncao.InfoFuncao.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabFuncao.InfoFuncao.Exclusao value) {
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
             *         &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
             *         &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideFuncao",
                "dadosFuncao",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
                protected TIdeFuncao ideFuncao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
                protected TDadosFuncao dadosFuncao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeFuncao }
                 *     
                 */
                public TIdeFuncao getIdeFuncao() {
                    return ideFuncao;
                }

                /**
                 * Define o valor da propriedade ideFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeFuncao }
                 *     
                 */
                public void setIdeFuncao(TIdeFuncao value) {
                    this.ideFuncao = value;
                }

                /**
                 * Obtém o valor da propriedade dadosFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosFuncao }
                 *     
                 */
                public TDadosFuncao getDadosFuncao() {
                    return dadosFuncao;
                }

                /**
                 * Define o valor da propriedade dadosFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosFuncao }
                 *     
                 */
                public void setDadosFuncao(TDadosFuncao value) {
                    this.dadosFuncao = value;
                }

                /**
                 * Obtém o valor da propriedade novaValidade.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPeriodoValidade }
                 *     
                 */
                public TPeriodoValidade getNovaValidade() {
                    return novaValidade;
                }

                /**
                 * Define o valor da propriedade novaValidade.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPeriodoValidade }
                 *     
                 */
                public void setNovaValidade(TPeriodoValidade value) {
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
             *         &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
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
                "ideFuncao"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
                protected TIdeFuncao ideFuncao;

                /**
                 * Obtém o valor da propriedade ideFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeFuncao }
                 *     
                 */
                public TIdeFuncao getIdeFuncao() {
                    return ideFuncao;
                }

                /**
                 * Define o valor da propriedade ideFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeFuncao }
                 *     
                 */
                public void setIdeFuncao(TIdeFuncao value) {
                    this.ideFuncao = value;
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
             *         &lt;element name="ideFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TIdeFuncao"/>
             *         &lt;element name="dadosFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02}TDadosFuncao"/>
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
                "ideFuncao",
                "dadosFuncao"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
                protected TIdeFuncao ideFuncao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", required = true)
                protected TDadosFuncao dadosFuncao;

                /**
                 * Obtém o valor da propriedade ideFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeFuncao }
                 *     
                 */
                public TIdeFuncao getIdeFuncao() {
                    return ideFuncao;
                }

                /**
                 * Define o valor da propriedade ideFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeFuncao }
                 *     
                 */
                public void setIdeFuncao(TIdeFuncao value) {
                    this.ideFuncao = value;
                }

                /**
                 * Obtém o valor da propriedade dadosFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosFuncao }
                 *     
                 */
                public TDadosFuncao getDadosFuncao() {
                    return dadosFuncao;
                }

                /**
                 * Define o valor da propriedade dadosFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosFuncao }
                 *     
                 */
                public void setDadosFuncao(TDadosFuncao value) {
                    this.dadosFuncao = value;
                }

            }

        }

    }

}
