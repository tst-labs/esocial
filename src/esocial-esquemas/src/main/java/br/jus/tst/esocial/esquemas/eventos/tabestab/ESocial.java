//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:08 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabestab;

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
 *         &lt;element name="evtTabEstab">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TEmpregador"/>
 *                   &lt;element name="infoEstab">
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
 *                                         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
 *                                         &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
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
 *                                         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
 *                                         &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
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
    "evtTabEstab",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
    protected ESocial.EvtTabEstab evtTabEstab;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabEstab.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabEstab }
     *     
     */
    public ESocial.EvtTabEstab getEvtTabEstab() {
        return evtTabEstab;
    }

    /**
     * Define o valor da propriedade evtTabEstab.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabEstab }
     *     
     */
    public void setEvtTabEstab(ESocial.EvtTabEstab value) {
        this.evtTabEstab = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TEmpregador"/>
     *         &lt;element name="infoEstab">
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
     *                               &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
     *                               &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
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
     *                               &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
     *                               &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
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
        "infoEstab"
    })
    public static class EvtTabEstab {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
        protected ESocial.EvtTabEstab.InfoEstab infoEstab;
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
         * Obtém o valor da propriedade infoEstab.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabEstab.InfoEstab }
         *     
         */
        public ESocial.EvtTabEstab.InfoEstab getInfoEstab() {
            return infoEstab;
        }

        /**
         * Define o valor da propriedade infoEstab.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabEstab.InfoEstab }
         *     
         */
        public void setInfoEstab(ESocial.EvtTabEstab.InfoEstab value) {
            this.infoEstab = value;
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
         *                     &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
         *                     &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
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
         *                     &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
         *                     &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
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
        public static class InfoEstab {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02")
            protected ESocial.EvtTabEstab.InfoEstab.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02")
            protected ESocial.EvtTabEstab.InfoEstab.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02")
            protected ESocial.EvtTabEstab.InfoEstab.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabEstab.InfoEstab.Inclusao }
             *     
             */
            public ESocial.EvtTabEstab.InfoEstab.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabEstab.InfoEstab.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabEstab.InfoEstab.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabEstab.InfoEstab.Alteracao }
             *     
             */
            public ESocial.EvtTabEstab.InfoEstab.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabEstab.InfoEstab.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabEstab.InfoEstab.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabEstab.InfoEstab.Exclusao }
             *     
             */
            public ESocial.EvtTabEstab.InfoEstab.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabEstab.InfoEstab.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabEstab.InfoEstab.Exclusao value) {
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
             *         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
             *         &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideEstab",
                "dadosEstab",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
                protected TIdeEstab ideEstab;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
                protected TDadosEstab dadosEstab;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeEstab }
                 *     
                 */
                public TIdeEstab getIdeEstab() {
                    return ideEstab;
                }

                /**
                 * Define o valor da propriedade ideEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeEstab }
                 *     
                 */
                public void setIdeEstab(TIdeEstab value) {
                    this.ideEstab = value;
                }

                /**
                 * Obtém o valor da propriedade dadosEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosEstab }
                 *     
                 */
                public TDadosEstab getDadosEstab() {
                    return dadosEstab;
                }

                /**
                 * Define o valor da propriedade dadosEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosEstab }
                 *     
                 */
                public void setDadosEstab(TDadosEstab value) {
                    this.dadosEstab = value;
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
             *         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
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
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
                protected TIdeEstab ideEstab;

                /**
                 * Obtém o valor da propriedade ideEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeEstab }
                 *     
                 */
                public TIdeEstab getIdeEstab() {
                    return ideEstab;
                }

                /**
                 * Define o valor da propriedade ideEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeEstab }
                 *     
                 */
                public void setIdeEstab(TIdeEstab value) {
                    this.ideEstab = value;
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
             *         &lt;element name="ideEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TIdeEstab"/>
             *         &lt;element name="dadosEstab" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02}TDadosEstab"/>
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
                "ideEstab",
                "dadosEstab"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
                protected TIdeEstab ideEstab;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabEstab/v02_04_02", required = true)
                protected TDadosEstab dadosEstab;

                /**
                 * Obtém o valor da propriedade ideEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeEstab }
                 *     
                 */
                public TIdeEstab getIdeEstab() {
                    return ideEstab;
                }

                /**
                 * Define o valor da propriedade ideEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeEstab }
                 *     
                 */
                public void setIdeEstab(TIdeEstab value) {
                    this.ideEstab = value;
                }

                /**
                 * Obtém o valor da propriedade dadosEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosEstab }
                 *     
                 */
                public TDadosEstab getDadosEstab() {
                    return dadosEstab;
                }

                /**
                 * Define o valor da propriedade dadosEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosEstab }
                 *     
                 */
                public void setDadosEstab(TDadosEstab value) {
                    this.dadosEstab = value;
                }

            }

        }

    }

}
