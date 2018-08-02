//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:09 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabhortur;

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
 *         &lt;element name="evtTabHorTur">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TEmpregador"/>
 *                   &lt;element name="infoHorContratual">
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
 *                                         &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
 *                                         &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
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
 *                                         &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
 *                                         &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
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
    "evtTabHorTur",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
    protected ESocial.EvtTabHorTur evtTabHorTur;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabHorTur.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabHorTur }
     *     
     */
    public ESocial.EvtTabHorTur getEvtTabHorTur() {
        return evtTabHorTur;
    }

    /**
     * Define o valor da propriedade evtTabHorTur.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabHorTur }
     *     
     */
    public void setEvtTabHorTur(ESocial.EvtTabHorTur value) {
        this.evtTabHorTur = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TEmpregador"/>
     *         &lt;element name="infoHorContratual">
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
     *                               &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
     *                               &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
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
     *                               &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
     *                               &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
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
        "infoHorContratual"
    })
    public static class EvtTabHorTur {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
        protected ESocial.EvtTabHorTur.InfoHorContratual infoHorContratual;
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
         * Obtém o valor da propriedade infoHorContratual.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabHorTur.InfoHorContratual }
         *     
         */
        public ESocial.EvtTabHorTur.InfoHorContratual getInfoHorContratual() {
            return infoHorContratual;
        }

        /**
         * Define o valor da propriedade infoHorContratual.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabHorTur.InfoHorContratual }
         *     
         */
        public void setInfoHorContratual(ESocial.EvtTabHorTur.InfoHorContratual value) {
            this.infoHorContratual = value;
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
         *                     &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
         *                     &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
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
         *                     &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
         *                     &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
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
        public static class InfoHorContratual {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
            protected ESocial.EvtTabHorTur.InfoHorContratual.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
            protected ESocial.EvtTabHorTur.InfoHorContratual.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
            protected ESocial.EvtTabHorTur.InfoHorContratual.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabHorTur.InfoHorContratual.Inclusao }
             *     
             */
            public ESocial.EvtTabHorTur.InfoHorContratual.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabHorTur.InfoHorContratual.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabHorTur.InfoHorContratual.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabHorTur.InfoHorContratual.Alteracao }
             *     
             */
            public ESocial.EvtTabHorTur.InfoHorContratual.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabHorTur.InfoHorContratual.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabHorTur.InfoHorContratual.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabHorTur.InfoHorContratual.Exclusao }
             *     
             */
            public ESocial.EvtTabHorTur.InfoHorContratual.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabHorTur.InfoHorContratual.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabHorTur.InfoHorContratual.Exclusao value) {
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
             *         &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
             *         &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideHorContratual",
                "dadosHorContratual",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
                protected TIdeHorContratual ideHorContratual;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
                protected TDadosHorContratual dadosHorContratual;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideHorContratual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeHorContratual }
                 *     
                 */
                public TIdeHorContratual getIdeHorContratual() {
                    return ideHorContratual;
                }

                /**
                 * Define o valor da propriedade ideHorContratual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeHorContratual }
                 *     
                 */
                public void setIdeHorContratual(TIdeHorContratual value) {
                    this.ideHorContratual = value;
                }

                /**
                 * Obtém o valor da propriedade dadosHorContratual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosHorContratual }
                 *     
                 */
                public TDadosHorContratual getDadosHorContratual() {
                    return dadosHorContratual;
                }

                /**
                 * Define o valor da propriedade dadosHorContratual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosHorContratual }
                 *     
                 */
                public void setDadosHorContratual(TDadosHorContratual value) {
                    this.dadosHorContratual = value;
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
             *         &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
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
                "ideHorContratual"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
                protected TIdeHorContratual ideHorContratual;

                /**
                 * Obtém o valor da propriedade ideHorContratual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeHorContratual }
                 *     
                 */
                public TIdeHorContratual getIdeHorContratual() {
                    return ideHorContratual;
                }

                /**
                 * Define o valor da propriedade ideHorContratual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeHorContratual }
                 *     
                 */
                public void setIdeHorContratual(TIdeHorContratual value) {
                    this.ideHorContratual = value;
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
             *         &lt;element name="ideHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TIdeHorContratual"/>
             *         &lt;element name="dadosHorContratual" type="{http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02}TDadosHorContratual"/>
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
                "ideHorContratual",
                "dadosHorContratual"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
                protected TIdeHorContratual ideHorContratual;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
                protected TDadosHorContratual dadosHorContratual;

                /**
                 * Obtém o valor da propriedade ideHorContratual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeHorContratual }
                 *     
                 */
                public TIdeHorContratual getIdeHorContratual() {
                    return ideHorContratual;
                }

                /**
                 * Define o valor da propriedade ideHorContratual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeHorContratual }
                 *     
                 */
                public void setIdeHorContratual(TIdeHorContratual value) {
                    this.ideHorContratual = value;
                }

                /**
                 * Obtém o valor da propriedade dadosHorContratual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosHorContratual }
                 *     
                 */
                public TDadosHorContratual getDadosHorContratual() {
                    return dadosHorContratual;
                }

                /**
                 * Define o valor da propriedade dadosHorContratual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosHorContratual }
                 *     
                 */
                public void setDadosHorContratual(TDadosHorContratual value) {
                    this.dadosHorContratual = value;
                }

            }

        }

    }

}
