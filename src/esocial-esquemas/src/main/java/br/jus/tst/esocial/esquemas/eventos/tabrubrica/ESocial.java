//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:11 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabrubrica;

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
 *         &lt;element name="evtTabRubrica">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeCadastro"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TEmpregador"/>
 *                   &lt;element name="infoRubrica">
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
 *                                         &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
 *                                         &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
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
 *                                         &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
 *                                         &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
 *                                         &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
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
    "evtTabRubrica",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
    protected ESocial.EvtTabRubrica evtTabRubrica;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTabRubrica.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTabRubrica }
     *     
     */
    public ESocial.EvtTabRubrica getEvtTabRubrica() {
        return evtTabRubrica;
    }

    /**
     * Define o valor da propriedade evtTabRubrica.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTabRubrica }
     *     
     */
    public void setEvtTabRubrica(ESocial.EvtTabRubrica value) {
        this.evtTabRubrica = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeCadastro"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TEmpregador"/>
     *         &lt;element name="infoRubrica">
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
     *                               &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
     *                               &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
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
     *                               &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
     *                               &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
     *                               &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
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
        "infoRubrica"
    })
    public static class EvtTabRubrica {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
        protected TIdeCadastro ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
        protected ESocial.EvtTabRubrica.InfoRubrica infoRubrica;
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
         * Obtém o valor da propriedade infoRubrica.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTabRubrica.InfoRubrica }
         *     
         */
        public ESocial.EvtTabRubrica.InfoRubrica getInfoRubrica() {
            return infoRubrica;
        }

        /**
         * Define o valor da propriedade infoRubrica.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTabRubrica.InfoRubrica }
         *     
         */
        public void setInfoRubrica(ESocial.EvtTabRubrica.InfoRubrica value) {
            this.infoRubrica = value;
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
         *                     &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
         *                     &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
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
         *                     &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
         *                     &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
         *                     &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
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
        public static class InfoRubrica {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02")
            protected ESocial.EvtTabRubrica.InfoRubrica.Inclusao inclusao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02")
            protected ESocial.EvtTabRubrica.InfoRubrica.Alteracao alteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02")
            protected ESocial.EvtTabRubrica.InfoRubrica.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabRubrica.InfoRubrica.Inclusao }
             *     
             */
            public ESocial.EvtTabRubrica.InfoRubrica.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabRubrica.InfoRubrica.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtTabRubrica.InfoRubrica.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabRubrica.InfoRubrica.Alteracao }
             *     
             */
            public ESocial.EvtTabRubrica.InfoRubrica.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabRubrica.InfoRubrica.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtTabRubrica.InfoRubrica.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTabRubrica.InfoRubrica.Exclusao }
             *     
             */
            public ESocial.EvtTabRubrica.InfoRubrica.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTabRubrica.InfoRubrica.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtTabRubrica.InfoRubrica.Exclusao value) {
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
             *         &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
             *         &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TPeriodoValidade" minOccurs="0"/>
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
                "ideRubrica",
                "dadosRubrica",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
                protected TIdeRubrica ideRubrica;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
                protected TDadosRubrica dadosRubrica;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02")
                protected TPeriodoValidade novaValidade;

                /**
                 * Obtém o valor da propriedade ideRubrica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeRubrica }
                 *     
                 */
                public TIdeRubrica getIdeRubrica() {
                    return ideRubrica;
                }

                /**
                 * Define o valor da propriedade ideRubrica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeRubrica }
                 *     
                 */
                public void setIdeRubrica(TIdeRubrica value) {
                    this.ideRubrica = value;
                }

                /**
                 * Obtém o valor da propriedade dadosRubrica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosRubrica }
                 *     
                 */
                public TDadosRubrica getDadosRubrica() {
                    return dadosRubrica;
                }

                /**
                 * Define o valor da propriedade dadosRubrica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosRubrica }
                 *     
                 */
                public void setDadosRubrica(TDadosRubrica value) {
                    this.dadosRubrica = value;
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
             *         &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
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
                "ideRubrica"
            })
            public static class Exclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
                protected TIdeRubrica ideRubrica;

                /**
                 * Obtém o valor da propriedade ideRubrica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeRubrica }
                 *     
                 */
                public TIdeRubrica getIdeRubrica() {
                    return ideRubrica;
                }

                /**
                 * Define o valor da propriedade ideRubrica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeRubrica }
                 *     
                 */
                public void setIdeRubrica(TIdeRubrica value) {
                    this.ideRubrica = value;
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
             *         &lt;element name="ideRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TIdeRubrica"/>
             *         &lt;element name="dadosRubrica" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02}TDadosRubrica"/>
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
                "ideRubrica",
                "dadosRubrica"
            })
            public static class Inclusao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
                protected TIdeRubrica ideRubrica;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
                protected TDadosRubrica dadosRubrica;

                /**
                 * Obtém o valor da propriedade ideRubrica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdeRubrica }
                 *     
                 */
                public TIdeRubrica getIdeRubrica() {
                    return ideRubrica;
                }

                /**
                 * Define o valor da propriedade ideRubrica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdeRubrica }
                 *     
                 */
                public void setIdeRubrica(TIdeRubrica value) {
                    this.ideRubrica = value;
                }

                /**
                 * Obtém o valor da propriedade dadosRubrica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TDadosRubrica }
                 *     
                 */
                public TDadosRubrica getDadosRubrica() {
                    return dadosRubrica;
                }

                /**
                 * Define o valor da propriedade dadosRubrica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TDadosRubrica }
                 *     
                 */
                public void setDadosRubrica(TDadosRubrica value) {
                    this.dadosRubrica = value;
                }

            }

        }

    }

}
