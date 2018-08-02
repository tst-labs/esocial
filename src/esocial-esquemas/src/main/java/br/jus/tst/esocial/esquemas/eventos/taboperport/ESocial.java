//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:10 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.taboperport;

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
 *         &lt;element name="evtTabOperPort">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TEmpregador"/>
 *                   &lt;element name="infoOperPortuario">
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
 *                                         &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
 *                                         &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
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
 *                                         &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
 *                                         &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
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
    "evtTabOperPort",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
    protected ESocial.EvtTabOperPort evtTabOperPort;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabOperPort.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabOperPort }
     *     
     */
    public ESocial.EvtTabOperPort getEvtTabOperPort() {
        return evtTabOperPort;
    }

    /**
     * Define o valor da propriedade evtTabOperPort.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabOperPort }
     *     
     */
    public void setEvtTabOperPort(ESocial.EvtTabOperPort value) {
        this.evtTabOperPort = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TEmpregador"/>
     *         &lt;element name="infoOperPortuario">
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
     *                               &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
     *                               &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
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
     *                               &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
     *                               &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
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
        "infoOperPortuario"
    })
    public static class EvtTabOperPort {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
        protected ESocial.EvtTabOperPort.InfoOperPortuario infoOperPortuario;
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
         * Obtém o valor da propriedade infoOperPortuario.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabOperPort.InfoOperPortuario }
         *     
         */
        public ESocial.EvtTabOperPort.InfoOperPortuario getInfoOperPortuario() {
            return infoOperPortuario;
        }

        /**
         * Define o valor da propriedade infoOperPortuario.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabOperPort.InfoOperPortuario }
         *     
         */
        public void setInfoOperPortuario(ESocial.EvtTabOperPort.InfoOperPortuario value) {
            this.infoOperPortuario = value;
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
         *                     &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
         *                     &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
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
         *                     &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
         *                     &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
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
        public static class InfoOperPortuario {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02")
            protected ESocial.EvtTabOperPort.InfoOperPortuario.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02")
            protected ESocial.EvtTabOperPort.InfoOperPortuario.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02")
            protected ESocial.EvtTabOperPort.InfoOperPortuario.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabOperPort.InfoOperPortuario.Inclusao }
             *     
             */
            public ESocial.EvtTabOperPort.InfoOperPortuario.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabOperPort.InfoOperPortuario.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabOperPort.InfoOperPortuario.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabOperPort.InfoOperPortuario.Alteracao }
             *     
             */
            public ESocial.EvtTabOperPort.InfoOperPortuario.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabOperPort.InfoOperPortuario.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabOperPort.InfoOperPortuario.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabOperPort.InfoOperPortuario.Exclusao }
             *     
             */
            public ESocial.EvtTabOperPort.InfoOperPortuario.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabOperPort.InfoOperPortuario.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabOperPort.InfoOperPortuario.Exclusao value) {
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
             *         &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
             *         &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideOperPortuario",
                "dadosOperPortuario",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
                protected TIdeOperPortuario ideOperPortuario;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
                protected TDadosOperPortuario dadosOperPortuario;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideOperPortuario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeOperPortuario }
                 *     
                 */
                public TIdeOperPortuario getIdeOperPortuario() {
                    return ideOperPortuario;
                }

                /**
                 * Define o valor da propriedade ideOperPortuario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeOperPortuario }
                 *     
                 */
                public void setIdeOperPortuario(TIdeOperPortuario value) {
                    this.ideOperPortuario = value;
                }

                /**
                 * Obtém o valor da propriedade dadosOperPortuario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosOperPortuario }
                 *     
                 */
                public TDadosOperPortuario getDadosOperPortuario() {
                    return dadosOperPortuario;
                }

                /**
                 * Define o valor da propriedade dadosOperPortuario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosOperPortuario }
                 *     
                 */
                public void setDadosOperPortuario(TDadosOperPortuario value) {
                    this.dadosOperPortuario = value;
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
             *         &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
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
                "ideOperPortuario"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
                protected TIdeOperPortuario ideOperPortuario;

                /**
                 * Obtém o valor da propriedade ideOperPortuario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeOperPortuario }
                 *     
                 */
                public TIdeOperPortuario getIdeOperPortuario() {
                    return ideOperPortuario;
                }

                /**
                 * Define o valor da propriedade ideOperPortuario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeOperPortuario }
                 *     
                 */
                public void setIdeOperPortuario(TIdeOperPortuario value) {
                    this.ideOperPortuario = value;
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
             *         &lt;element name="ideOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TIdeOperPortuario"/>
             *         &lt;element name="dadosOperPortuario" type="{http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02}TDadosOperPortuario"/>
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
                "ideOperPortuario",
                "dadosOperPortuario"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
                protected TIdeOperPortuario ideOperPortuario;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", required = true)
                protected TDadosOperPortuario dadosOperPortuario;

                /**
                 * Obtém o valor da propriedade ideOperPortuario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeOperPortuario }
                 *     
                 */
                public TIdeOperPortuario getIdeOperPortuario() {
                    return ideOperPortuario;
                }

                /**
                 * Define o valor da propriedade ideOperPortuario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeOperPortuario }
                 *     
                 */
                public void setIdeOperPortuario(TIdeOperPortuario value) {
                    this.ideOperPortuario = value;
                }

                /**
                 * Obtém o valor da propriedade dadosOperPortuario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosOperPortuario }
                 *     
                 */
                public TDadosOperPortuario getDadosOperPortuario() {
                    return dadosOperPortuario;
                }

                /**
                 * Define o valor da propriedade dadosOperPortuario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosOperPortuario }
                 *     
                 */
                public void setDadosOperPortuario(TDadosOperPortuario value) {
                    this.dadosOperPortuario = value;
                }

            }

        }

    }

}
