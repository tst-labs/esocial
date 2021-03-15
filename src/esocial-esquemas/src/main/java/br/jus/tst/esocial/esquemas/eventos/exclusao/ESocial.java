//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:10 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.exclusao;

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
 *         &lt;element name="evtExclusao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEvento_exclusao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoExclusao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpEvento">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrRecibo"/>
 *                             &lt;element name="ideTrabalhador" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ideFolhaPagto" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
 *                                       &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_Id" />
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
    "evtExclusao",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtExclusao evtExclusao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtExclusao.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtExclusao }
     *     
     */
    public ESocial.EvtExclusao getEvtExclusao() {
        return evtExclusao;
    }

    /**
     * Define o valor da propriedade evtExclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtExclusao }
     *     
     */
    public void setEvtExclusao(ESocial.EvtExclusao value) {
        this.evtExclusao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEvento_exclusao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoExclusao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpEvento">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrRecibo"/>
     *                   &lt;element name="ideTrabalhador" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ideFolhaPagto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
     *                             &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_Id" />
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
        "infoExclusao"
    })
    public static class EvtExclusao {

        @XmlElement(required = true)
        protected TIdeEventoExclusao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtExclusao.InfoExclusao infoExclusao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoExclusao }
         *     
         */
        public TIdeEventoExclusao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoExclusao }
         *     
         */
        public void setIdeEvento(TIdeEventoExclusao value) {
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
         * Obtém o valor da propriedade infoExclusao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtExclusao.InfoExclusao }
         *     
         */
        public ESocial.EvtExclusao.InfoExclusao getInfoExclusao() {
            return infoExclusao;
        }

        /**
         * Define o valor da propriedade infoExclusao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtExclusao.InfoExclusao }
         *     
         */
        public void setInfoExclusao(ESocial.EvtExclusao.InfoExclusao value) {
            this.infoExclusao = value;
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
         *         &lt;element name="tpEvento">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrRecEvt" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_nrRecibo"/>
         *         &lt;element name="ideTrabalhador" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ideFolhaPagto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
         *                   &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "tpEvento",
            "nrRecEvt",
            "ideTrabalhador",
            "ideFolhaPagto"
        })
        public static class InfoExclusao {

            @XmlElement(required = true)
            protected String tpEvento;
            @XmlElement(required = true)
            protected String nrRecEvt;
            protected ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador ideTrabalhador;
            protected ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto ideFolhaPagto;

            /**
             * Obtém o valor da propriedade tpEvento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpEvento() {
                return tpEvento;
            }

            /**
             * Define o valor da propriedade tpEvento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpEvento(String value) {
                this.tpEvento = value;
            }

            /**
             * Obtém o valor da propriedade nrRecEvt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecEvt() {
                return nrRecEvt;
            }

            /**
             * Define o valor da propriedade nrRecEvt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecEvt(String value) {
                this.nrRecEvt = value;
            }

            /**
             * Obtém o valor da propriedade ideTrabalhador.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador }
             *     
             */
            public ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador getIdeTrabalhador() {
                return ideTrabalhador;
            }

            /**
             * Define o valor da propriedade ideTrabalhador.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador }
             *     
             */
            public void setIdeTrabalhador(ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador value) {
                this.ideTrabalhador = value;
            }

            /**
             * Obtém o valor da propriedade ideFolhaPagto.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto }
             *     
             */
            public ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto getIdeFolhaPagto() {
                return ideFolhaPagto;
            }

            /**
             * Define o valor da propriedade ideFolhaPagto.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto }
             *     
             */
            public void setIdeFolhaPagto(ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto value) {
                this.ideFolhaPagto = value;
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
             *         &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_indApuracao" minOccurs="0"/>
             *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_perApur"/>
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
                "indApuracao",
                "perApur"
            })
            public static class IdeFolhaPagto {

                protected Byte indApuracao;
                @XmlElement(required = true)
                protected String perApur;

                /**
                 * Obtém o valor da propriedade indApuracao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getIndApuracao() {
                    return indApuracao;
                }

                /**
                 * Define o valor da propriedade indApuracao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setIndApuracao(Byte value) {
                    this.indApuracao = value;
                }

                /**
                 * Obtém o valor da propriedade perApur.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPerApur() {
                    return perApur;
                }

                /**
                 * Define o valor da propriedade perApur.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPerApur(String value) {
                    this.perApur = value;
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
             *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtExclusao/v_S_01_00_00}TS_cpf"/>
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
                "cpfTrab"
            })
            public static class IdeTrabalhador {

                @XmlElement(required = true)
                protected String cpfTrab;

                /**
                 * Obtém o valor da propriedade cpfTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfTrab() {
                    return cpfTrab;
                }

                /**
                 * Define o valor da propriedade cpfTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfTrab(String value) {
                    this.cpfTrab = value;
                }

            }

        }

    }

}
