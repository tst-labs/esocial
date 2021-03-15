//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:16 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.infoempregador;

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
 *         &lt;element name="evtInfoEmpregador">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_ideEvento_evtTab_inicial"/>
 *                   &lt;element name="ideEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_nrInsc_8_11_14"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoEmpregador">
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
 *                                         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
 *                                         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
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
 *                                         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
 *                                         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
 *                                         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
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
 *                                         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_Id" />
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
    "evtInfoEmpregador",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtInfoEmpregador evtInfoEmpregador;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtInfoEmpregador.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtInfoEmpregador }
     *     
     */
    public ESocial.EvtInfoEmpregador getEvtInfoEmpregador() {
        return evtInfoEmpregador;
    }

    /**
     * Define o valor da propriedade evtInfoEmpregador.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtInfoEmpregador }
     *     
     */
    public void setEvtInfoEmpregador(ESocial.EvtInfoEmpregador value) {
        this.evtInfoEmpregador = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_ideEvento_evtTab_inicial"/>
     *         &lt;element name="ideEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_nrInsc_8_11_14"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoEmpregador">
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
     *                               &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
     *                               &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
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
     *                               &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
     *                               &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
     *                               &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
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
     *                               &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_Id" />
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
        "infoEmpregador"
    })
    public static class EvtInfoEmpregador {

        @XmlElement(required = true)
        protected TIdeEventoEvtTabInicial ideEvento;
        @XmlElement(required = true)
        protected ESocial.EvtInfoEmpregador.IdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtInfoEmpregador.InfoEmpregador infoEmpregador;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoEvtTabInicial }
         *     
         */
        public TIdeEventoEvtTabInicial getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoEvtTabInicial }
         *     
         */
        public void setIdeEvento(TIdeEventoEvtTabInicial value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoEmpregador.IdeEmpregador }
         *     
         */
        public ESocial.EvtInfoEmpregador.IdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoEmpregador.IdeEmpregador }
         *     
         */
        public void setIdeEmpregador(ESocial.EvtInfoEmpregador.IdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador }
         *     
         */
        public ESocial.EvtInfoEmpregador.InfoEmpregador getInfoEmpregador() {
            return infoEmpregador;
        }

        /**
         * Define o valor da propriedade infoEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador }
         *     
         */
        public void setInfoEmpregador(ESocial.EvtInfoEmpregador.InfoEmpregador value) {
            this.infoEmpregador = value;
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
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_tpInsc_1_2"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_nrInsc_8_11_14"/>
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
            "tpInsc",
            "nrInsc"
        })
        public static class IdeEmpregador {

            protected byte tpInsc;
            @XmlElement(required = true)
            protected String nrInsc;

            /**
             * Obtém o valor da propriedade tpInsc.
             * 
             */
            public byte getTpInsc() {
                return tpInsc;
            }

            /**
             * Define o valor da propriedade tpInsc.
             * 
             */
            public void setTpInsc(byte value) {
                this.tpInsc = value;
            }

            /**
             * Obtém o valor da propriedade nrInsc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrInsc() {
                return nrInsc;
            }

            /**
             * Define o valor da propriedade nrInsc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrInsc(String value) {
                this.nrInsc = value;
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
         *         &lt;choice>
         *           &lt;element name="inclusao">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
         *                     &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
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
         *                     &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
         *                     &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
         *                     &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
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
         *                     &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
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
        public static class InfoEmpregador {

            protected ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao inclusao;
            protected ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao alteracao;
            protected ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao exclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao }
             *     
             */
            public ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao }
             *     
             */
            public void setInclusao(ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao value) {
                this.inclusao = value;
            }

            /**
             * Obtém o valor da propriedade alteracao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao }
             *     
             */
            public ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao getAlteracao() {
                return alteracao;
            }

            /**
             * Define o valor da propriedade alteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao }
             *     
             */
            public void setAlteracao(ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao value) {
                this.alteracao = value;
            }

            /**
             * Obtém o valor da propriedade exclusao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao }
             *     
             */
            public ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao getExclusao() {
                return exclusao;
            }

            /**
             * Define o valor da propriedade exclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao }
             *     
             */
            public void setExclusao(ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao value) {
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
             *         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
             *         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
             *         &lt;element name="novaValidade" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo" minOccurs="0"/>
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
                "idePeriodo",
                "infoCadastro",
                "novaValidade"
            })
            public static class Alteracao {

                @XmlElement(required = true)
                protected TIdePeriodo idePeriodo;
                @XmlElement(required = true)
                protected TInfoCadastro infoCadastro;
                protected TIdePeriodo novaValidade;

                /**
                 * Obtém o valor da propriedade idePeriodo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getIdePeriodo() {
                    return idePeriodo;
                }

                /**
                 * Define o valor da propriedade idePeriodo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setIdePeriodo(TIdePeriodo value) {
                    this.idePeriodo = value;
                }

                /**
                 * Obtém o valor da propriedade infoCadastro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public TInfoCadastro getInfoCadastro() {
                    return infoCadastro;
                }

                /**
                 * Define o valor da propriedade infoCadastro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public void setInfoCadastro(TInfoCadastro value) {
                    this.infoCadastro = value;
                }

                /**
                 * Obtém o valor da propriedade novaValidade.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getNovaValidade() {
                    return novaValidade;
                }

                /**
                 * Define o valor da propriedade novaValidade.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setNovaValidade(TIdePeriodo value) {
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
             *         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
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
                "idePeriodo"
            })
            public static class Exclusao {

                @XmlElement(required = true)
                protected TIdePeriodo idePeriodo;

                /**
                 * Obtém o valor da propriedade idePeriodo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getIdePeriodo() {
                    return idePeriodo;
                }

                /**
                 * Define o valor da propriedade idePeriodo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setIdePeriodo(TIdePeriodo value) {
                    this.idePeriodo = value;
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
             *         &lt;element name="idePeriodo" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_idePeriodo"/>
             *         &lt;element name="infoCadastro" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}T_infoCadastro"/>
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
                "idePeriodo",
                "infoCadastro"
            })
            public static class Inclusao {

                @XmlElement(required = true)
                protected TIdePeriodo idePeriodo;
                @XmlElement(required = true)
                protected TInfoCadastro infoCadastro;

                /**
                 * Obtém o valor da propriedade idePeriodo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public TIdePeriodo getIdePeriodo() {
                    return idePeriodo;
                }

                /**
                 * Define o valor da propriedade idePeriodo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TIdePeriodo }
                 *     
                 */
                public void setIdePeriodo(TIdePeriodo value) {
                    this.idePeriodo = value;
                }

                /**
                 * Obtém o valor da propriedade infoCadastro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public TInfoCadastro getInfoCadastro() {
                    return infoCadastro;
                }

                /**
                 * Define o valor da propriedade infoCadastro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoCadastro }
                 *     
                 */
                public void setInfoCadastro(TInfoCadastro value) {
                    this.infoCadastro = value;
                }

            }

        }

    }

}
