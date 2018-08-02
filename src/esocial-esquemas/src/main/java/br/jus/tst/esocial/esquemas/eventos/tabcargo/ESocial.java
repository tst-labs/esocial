//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:07 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabcargo;

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
 *         &lt;element name="evtTabCargo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TEmpregador"/>
 *                   &lt;element name="infoCargo">
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
 *                                         &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
 *                                         &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
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
 *                                         &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
 *                                         &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
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
    "evtTabCargo",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
    protected ESocial.EvtTabCargo evtTabCargo;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabCargo.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabCargo }
     *     
     */
    public ESocial.EvtTabCargo getEvtTabCargo() {
        return evtTabCargo;
    }

    /**
     * Define o valor da propriedade evtTabCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabCargo }
     *     
     */
    public void setEvtTabCargo(ESocial.EvtTabCargo value) {
        this.evtTabCargo = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TEmpregador"/>
     *         &lt;element name="infoCargo">
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
     *                               &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
     *                               &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
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
     *                               &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
     *                               &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
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
        "infoCargo"
    })
    public static class EvtTabCargo {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
        protected ESocial.EvtTabCargo.InfoCargo infoCargo;
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
         * Obtém o valor da propriedade infoCargo.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabCargo.InfoCargo }
         *     
         */
        public ESocial.EvtTabCargo.InfoCargo getInfoCargo() {
            return infoCargo;
        }

        /**
         * Define o valor da propriedade infoCargo.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabCargo.InfoCargo }
         *     
         */
        public void setInfoCargo(ESocial.EvtTabCargo.InfoCargo value) {
            this.infoCargo = value;
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
         *                     &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
         *                     &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
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
         *                     &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
         *                     &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
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
        public static class InfoCargo {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
            protected ESocial.EvtTabCargo.InfoCargo.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
            protected ESocial.EvtTabCargo.InfoCargo.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
            protected ESocial.EvtTabCargo.InfoCargo.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabCargo.InfoCargo.Inclusao }
             *     
             */
            public ESocial.EvtTabCargo.InfoCargo.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabCargo.InfoCargo.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabCargo.InfoCargo.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabCargo.InfoCargo.Alteracao }
             *     
             */
            public ESocial.EvtTabCargo.InfoCargo.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabCargo.InfoCargo.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabCargo.InfoCargo.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabCargo.InfoCargo.Exclusao }
             *     
             */
            public ESocial.EvtTabCargo.InfoCargo.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabCargo.InfoCargo.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabCargo.InfoCargo.Exclusao value) {
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
             *         &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
             *         &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideCargo",
                "dadosCargo",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
                protected TideCargo ideCargo;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
                protected TDadosCargo dadosCargo;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TideCargo }
                 *     
                 */
                public TideCargo getIdeCargo() {
                    return ideCargo;
                }

                /**
                 * Define o valor da propriedade ideCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TideCargo }
                 *     
                 */
                public void setIdeCargo(TideCargo value) {
                    this.ideCargo = value;
                }

                /**
                 * Obtém o valor da propriedade dadosCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosCargo }
                 *     
                 */
                public TDadosCargo getDadosCargo() {
                    return dadosCargo;
                }

                /**
                 * Define o valor da propriedade dadosCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosCargo }
                 *     
                 */
                public void setDadosCargo(TDadosCargo value) {
                    this.dadosCargo = value;
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
             *         &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
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
                "ideCargo"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
                protected TideCargo ideCargo;

                /**
                 * Obtém o valor da propriedade ideCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TideCargo }
                 *     
                 */
                public TideCargo getIdeCargo() {
                    return ideCargo;
                }

                /**
                 * Define o valor da propriedade ideCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TideCargo }
                 *     
                 */
                public void setIdeCargo(TideCargo value) {
                    this.ideCargo = value;
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
             *         &lt;element name="ideCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TideCargo"/>
             *         &lt;element name="dadosCargo" type="{http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02}TDadosCargo"/>
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
                "ideCargo",
                "dadosCargo"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
                protected TideCargo ideCargo;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
                protected TDadosCargo dadosCargo;

                /**
                 * Obtém o valor da propriedade ideCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TideCargo }
                 *     
                 */
                public TideCargo getIdeCargo() {
                    return ideCargo;
                }

                /**
                 * Define o valor da propriedade ideCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TideCargo }
                 *     
                 */
                public void setIdeCargo(TideCargo value) {
                    this.ideCargo = value;
                }

                /**
                 * Obtém o valor da propriedade dadosCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosCargo }
                 *     
                 */
                public TDadosCargo getDadosCargo() {
                    return dadosCargo;
                }

                /**
                 * Define o valor da propriedade dadosCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosCargo }
                 *     
                 */
                public void setDadosCargo(TDadosCargo value) {
                    this.dadosCargo = value;
                }

            }

        }

    }

}
