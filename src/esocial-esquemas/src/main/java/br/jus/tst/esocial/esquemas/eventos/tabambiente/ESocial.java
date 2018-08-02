//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:06 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabambiente;

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
 *         &lt;element name="evtTabAmbiente">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TEmpregador"/>
 *                   &lt;element name="infoAmbiente">
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
 *                                         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
 *                                         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
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
 *                                         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
 *                                         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
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
    "evtTabAmbiente",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
    protected ESocial.EvtTabAmbiente evtTabAmbiente;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabAmbiente.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabAmbiente }
     *     
     */
    public ESocial.EvtTabAmbiente getEvtTabAmbiente() {
        return evtTabAmbiente;
    }

    /**
     * Define o valor da propriedade evtTabAmbiente.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabAmbiente }
     *     
     */
    public void setEvtTabAmbiente(ESocial.EvtTabAmbiente value) {
        this.evtTabAmbiente = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TEmpregador"/>
     *         &lt;element name="infoAmbiente">
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
     *                               &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
     *                               &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
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
     *                               &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
     *                               &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
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
        "infoAmbiente"
    })
    public static class EvtTabAmbiente {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
        protected ESocial.EvtTabAmbiente.InfoAmbiente infoAmbiente;
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
         * Obtém o valor da propriedade infoAmbiente.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabAmbiente.InfoAmbiente }
         *     
         */
        public ESocial.EvtTabAmbiente.InfoAmbiente getInfoAmbiente() {
            return infoAmbiente;
        }

        /**
         * Define o valor da propriedade infoAmbiente.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabAmbiente.InfoAmbiente }
         *     
         */
        public void setInfoAmbiente(ESocial.EvtTabAmbiente.InfoAmbiente value) {
            this.infoAmbiente = value;
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
         *                     &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
         *                     &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
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
         *                     &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
         *                     &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
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
        public static class InfoAmbiente {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02")
            protected ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02")
            protected ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02")
            protected ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao }
             *     
             */
            public ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabAmbiente.InfoAmbiente.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao }
             *     
             */
            public ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabAmbiente.InfoAmbiente.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao }
             *     
             */
            public ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabAmbiente.InfoAmbiente.Exclusao value) {
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
             *         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
             *         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideAmbiente",
                "dadosAmbiente",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
                protected TIdeAmbiente ideAmbiente;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
                protected TDadosAmbiente dadosAmbiente;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideAmbiente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public TIdeAmbiente getIdeAmbiente() {
                    return ideAmbiente;
                }

                /**
                 * Define o valor da propriedade ideAmbiente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public void setIdeAmbiente(TIdeAmbiente value) {
                    this.ideAmbiente = value;
                }

                /**
                 * Obtém o valor da propriedade dadosAmbiente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public TDadosAmbiente getDadosAmbiente() {
                    return dadosAmbiente;
                }

                /**
                 * Define o valor da propriedade dadosAmbiente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public void setDadosAmbiente(TDadosAmbiente value) {
                    this.dadosAmbiente = value;
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
             *         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
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
                "ideAmbiente"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
                protected TIdeAmbiente ideAmbiente;

                /**
                 * Obtém o valor da propriedade ideAmbiente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public TIdeAmbiente getIdeAmbiente() {
                    return ideAmbiente;
                }

                /**
                 * Define o valor da propriedade ideAmbiente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public void setIdeAmbiente(TIdeAmbiente value) {
                    this.ideAmbiente = value;
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
             *         &lt;element name="ideAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TIdeAmbiente"/>
             *         &lt;element name="dadosAmbiente" type="{http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02}TDadosAmbiente"/>
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
                "ideAmbiente",
                "dadosAmbiente"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
                protected TIdeAmbiente ideAmbiente;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
                protected TDadosAmbiente dadosAmbiente;

                /**
                 * Obtém o valor da propriedade ideAmbiente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public TIdeAmbiente getIdeAmbiente() {
                    return ideAmbiente;
                }

                /**
                 * Define o valor da propriedade ideAmbiente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeAmbiente }
                 *     
                 */
                public void setIdeAmbiente(TIdeAmbiente value) {
                    this.ideAmbiente = value;
                }

                /**
                 * Obtém o valor da propriedade dadosAmbiente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public TDadosAmbiente getDadosAmbiente() {
                    return dadosAmbiente;
                }

                /**
                 * Define o valor da propriedade dadosAmbiente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosAmbiente }
                 *     
                 */
                public void setDadosAmbiente(TDadosAmbiente value) {
                    this.dadosAmbiente = value;
                }

            }

        }

    }

}
