//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:07 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabcarreira;

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
 *         &lt;element name="evtTabCarreira">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TEmprPJ"/>
 *                   &lt;element name="infoCarreira">
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
 *                                         &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
 *                                         &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
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
 *                                         &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
 *                                         &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
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
    "evtTabCarreira",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
    protected ESocial.EvtTabCarreira evtTabCarreira;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabCarreira.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabCarreira }
     *     
     */
    public ESocial.EvtTabCarreira getEvtTabCarreira() {
        return evtTabCarreira;
    }

    /**
     * Define o valor da propriedade evtTabCarreira.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabCarreira }
     *     
     */
    public void setEvtTabCarreira(ESocial.EvtTabCarreira value) {
        this.evtTabCarreira = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TEmprPJ"/>
     *         &lt;element name="infoCarreira">
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
     *                               &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
     *                               &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
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
     *                               &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
     *                               &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
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
        "infoCarreira"
    })
    public static class EvtTabCarreira {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
        protected TEmprPJ ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
        protected ESocial.EvtTabCarreira.InfoCarreira infoCarreira;
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
         *     {@link TEmprPJ }
         *     
         */
        public TEmprPJ getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TEmprPJ }
         *     
         */
        public void setIdeEmpregador(TEmprPJ value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoCarreira.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabCarreira.InfoCarreira }
         *     
         */
        public ESocial.EvtTabCarreira.InfoCarreira getInfoCarreira() {
            return infoCarreira;
        }

        /**
         * Define o valor da propriedade infoCarreira.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabCarreira.InfoCarreira }
         *     
         */
        public void setInfoCarreira(ESocial.EvtTabCarreira.InfoCarreira value) {
            this.infoCarreira = value;
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
         *                     &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
         *                     &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
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
         *                     &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
         *                     &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
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
        public static class InfoCarreira {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02")
            protected ESocial.EvtTabCarreira.InfoCarreira.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02")
            protected ESocial.EvtTabCarreira.InfoCarreira.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02")
            protected ESocial.EvtTabCarreira.InfoCarreira.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabCarreira.InfoCarreira.Inclusao }
             *     
             */
            public ESocial.EvtTabCarreira.InfoCarreira.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabCarreira.InfoCarreira.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabCarreira.InfoCarreira.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabCarreira.InfoCarreira.Alteracao }
             *     
             */
            public ESocial.EvtTabCarreira.InfoCarreira.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabCarreira.InfoCarreira.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabCarreira.InfoCarreira.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabCarreira.InfoCarreira.Exclusao }
             *     
             */
            public ESocial.EvtTabCarreira.InfoCarreira.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabCarreira.InfoCarreira.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabCarreira.InfoCarreira.Exclusao value) {
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
             *         &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
             *         &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideCarreira",
                "dadosCarreira",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
                protected TIdeCarreira ideCarreira;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
                protected TDadosCarreira dadosCarreira;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideCarreira.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeCarreira }
                 *     
                 */
                public TIdeCarreira getIdeCarreira() {
                    return ideCarreira;
                }

                /**
                 * Define o valor da propriedade ideCarreira.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeCarreira }
                 *     
                 */
                public void setIdeCarreira(TIdeCarreira value) {
                    this.ideCarreira = value;
                }

                /**
                 * Obtém o valor da propriedade dadosCarreira.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosCarreira }
                 *     
                 */
                public TDadosCarreira getDadosCarreira() {
                    return dadosCarreira;
                }

                /**
                 * Define o valor da propriedade dadosCarreira.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosCarreira }
                 *     
                 */
                public void setDadosCarreira(TDadosCarreira value) {
                    this.dadosCarreira = value;
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
             *         &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
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
                "ideCarreira"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
                protected TIdeCarreira ideCarreira;

                /**
                 * Obtém o valor da propriedade ideCarreira.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeCarreira }
                 *     
                 */
                public TIdeCarreira getIdeCarreira() {
                    return ideCarreira;
                }

                /**
                 * Define o valor da propriedade ideCarreira.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeCarreira }
                 *     
                 */
                public void setIdeCarreira(TIdeCarreira value) {
                    this.ideCarreira = value;
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
             *         &lt;element name="ideCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TIdeCarreira"/>
             *         &lt;element name="dadosCarreira" type="{http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02}TDadosCarreira"/>
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
                "ideCarreira",
                "dadosCarreira"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
                protected TIdeCarreira ideCarreira;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", required = true)
                protected TDadosCarreira dadosCarreira;

                /**
                 * Obtém o valor da propriedade ideCarreira.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeCarreira }
                 *     
                 */
                public TIdeCarreira getIdeCarreira() {
                    return ideCarreira;
                }

                /**
                 * Define o valor da propriedade ideCarreira.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeCarreira }
                 *     
                 */
                public void setIdeCarreira(TIdeCarreira value) {
                    this.ideCarreira = value;
                }

                /**
                 * Obtém o valor da propriedade dadosCarreira.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosCarreira }
                 *     
                 */
                public TDadosCarreira getDadosCarreira() {
                    return dadosCarreira;
                }

                /**
                 * Define o valor da propriedade dadosCarreira.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosCarreira }
                 *     
                 */
                public void setDadosCarreira(TDadosCarreira value) {
                    this.dadosCarreira = value;
                }

            }

        }

    }

}
