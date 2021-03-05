//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:00 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenalt;

import java.math.BigInteger;
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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="evtCdBenAlt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}T_ideEvento_trab_PJ"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}T_ideBeneficio"/>
 *                   &lt;element name="infoBenAlteracao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAltBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dadosBeneficio">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpBeneficio"/>
 *                                       &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPlanRP"/>
 *                                       &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
 *                                       &lt;element name="indSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_sim_nao"/>
 *                                       &lt;element name="infoPenMorte" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPenMorte"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="suspensao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="mtvSuspensao">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="01"/>
 *                                                       &lt;enumeration value="99"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dscSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_Id" />
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
    "evtCdBenAlt",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtCdBenAlt evtCdBenAlt;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCdBenAlt.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCdBenAlt }
     *     
     */
    public ESocial.EvtCdBenAlt getEvtCdBenAlt() {
        return evtCdBenAlt;
    }

    /**
     * Define o valor da propriedade evtCdBenAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCdBenAlt }
     *     
     */
    public void setEvtCdBenAlt(ESocial.EvtCdBenAlt value) {
        this.evtCdBenAlt = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}T_ideEvento_trab_PJ"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}T_ideBeneficio"/>
     *         &lt;element name="infoBenAlteracao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAltBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dadosBeneficio">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpBeneficio"/>
     *                             &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPlanRP"/>
     *                             &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
     *                             &lt;element name="indSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_sim_nao"/>
     *                             &lt;element name="infoPenMorte" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPenMorte"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="suspensao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="mtvSuspensao">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="01"/>
     *                                             &lt;enumeration value="99"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dscSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
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
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_Id" />
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
        "ideBeneficio",
        "infoBenAlteracao"
    })
    public static class EvtCdBenAlt {

        @XmlElement(required = true)
        protected TIdeEventoTrabPJ ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected TIdeBeneficio ideBeneficio;
        @XmlElement(required = true)
        protected ESocial.EvtCdBenAlt.InfoBenAlteracao infoBenAlteracao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public TIdeEventoTrabPJ getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabPJ value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public TIdeEmpregadorCnpj getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregadorCnpj value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideBeneficio.
         * 
         * @return
         *     possible object is
         *     {@link TIdeBeneficio }
         *     
         */
        public TIdeBeneficio getIdeBeneficio() {
            return ideBeneficio;
        }

        /**
         * Define o valor da propriedade ideBeneficio.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeBeneficio }
         *     
         */
        public void setIdeBeneficio(TIdeBeneficio value) {
            this.ideBeneficio = value;
        }

        /**
         * Obtém o valor da propriedade infoBenAlteracao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao }
         *     
         */
        public ESocial.EvtCdBenAlt.InfoBenAlteracao getInfoBenAlteracao() {
            return infoBenAlteracao;
        }

        /**
         * Define o valor da propriedade infoBenAlteracao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao }
         *     
         */
        public void setInfoBenAlteracao(ESocial.EvtCdBenAlt.InfoBenAlteracao value) {
            this.infoBenAlteracao = value;
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
         *         &lt;element name="dtAltBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dadosBeneficio">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpBeneficio"/>
         *                   &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPlanRP"/>
         *                   &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
         *                   &lt;element name="indSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_sim_nao"/>
         *                   &lt;element name="infoPenMorte" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPenMorte"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="suspensao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="mtvSuspensao">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="01"/>
         *                                   &lt;enumeration value="99"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dscSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dtAltBeneficio",
            "dadosBeneficio"
        })
        public static class InfoBenAlteracao {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAltBeneficio;
            @XmlElement(required = true)
            protected ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio dadosBeneficio;

            /**
             * Obtém o valor da propriedade dtAltBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAltBeneficio() {
                return dtAltBeneficio;
            }

            /**
             * Define o valor da propriedade dtAltBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAltBeneficio(XMLGregorianCalendar value) {
                this.dtAltBeneficio = value;
            }

            /**
             * Obtém o valor da propriedade dadosBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio }
             *     
             */
            public ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio getDadosBeneficio() {
                return dadosBeneficio;
            }

            /**
             * Define o valor da propriedade dadosBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio }
             *     
             */
            public void setDadosBeneficio(ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio value) {
                this.dadosBeneficio = value;
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
             *         &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpBeneficio"/>
             *         &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPlanRP"/>
             *         &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
             *         &lt;element name="indSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_sim_nao"/>
             *         &lt;element name="infoPenMorte" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPenMorte"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="suspensao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="mtvSuspensao">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="01"/>
             *                         &lt;enumeration value="99"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dscSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
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
                "tpBeneficio",
                "tpPlanRP",
                "dsc",
                "indSuspensao",
                "infoPenMorte",
                "suspensao"
            })
            public static class DadosBeneficio {

                @XmlElement(required = true)
                protected BigInteger tpBeneficio;
                protected byte tpPlanRP;
                protected String dsc;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao indSuspensao;
                protected ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.InfoPenMorte infoPenMorte;
                protected ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.Suspensao suspensao;

                /**
                 * Obtém o valor da propriedade tpBeneficio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTpBeneficio() {
                    return tpBeneficio;
                }

                /**
                 * Define o valor da propriedade tpBeneficio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTpBeneficio(BigInteger value) {
                    this.tpBeneficio = value;
                }

                /**
                 * Obtém o valor da propriedade tpPlanRP.
                 * 
                 */
                public byte getTpPlanRP() {
                    return tpPlanRP;
                }

                /**
                 * Define o valor da propriedade tpPlanRP.
                 * 
                 */
                public void setTpPlanRP(byte value) {
                    this.tpPlanRP = value;
                }

                /**
                 * Obtém o valor da propriedade dsc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDsc() {
                    return dsc;
                }

                /**
                 * Define o valor da propriedade dsc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDsc(String value) {
                    this.dsc = value;
                }

                /**
                 * Obtém o valor da propriedade indSuspensao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndSuspensao() {
                    return indSuspensao;
                }

                /**
                 * Define o valor da propriedade indSuspensao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndSuspensao(TSSimNao value) {
                    this.indSuspensao = value;
                }

                /**
                 * Obtém o valor da propriedade infoPenMorte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.InfoPenMorte }
                 *     
                 */
                public ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.InfoPenMorte getInfoPenMorte() {
                    return infoPenMorte;
                }

                /**
                 * Define o valor da propriedade infoPenMorte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.InfoPenMorte }
                 *     
                 */
                public void setInfoPenMorte(ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.InfoPenMorte value) {
                    this.infoPenMorte = value;
                }

                /**
                 * Obtém o valor da propriedade suspensao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.Suspensao }
                 *     
                 */
                public ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.Suspensao getSuspensao() {
                    return suspensao;
                }

                /**
                 * Define o valor da propriedade suspensao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.Suspensao }
                 *     
                 */
                public void setSuspensao(ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.Suspensao value) {
                    this.suspensao = value;
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
                 *         &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_tpPenMorte"/>
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
                    "tpPenMorte"
                })
                public static class InfoPenMorte {

                    protected byte tpPenMorte;

                    /**
                     * Obtém o valor da propriedade tpPenMorte.
                     * 
                     */
                    public byte getTpPenMorte() {
                        return tpPenMorte;
                    }

                    /**
                     * Define o valor da propriedade tpPenMorte.
                     * 
                     */
                    public void setTpPenMorte(byte value) {
                        this.tpPenMorte = value;
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
                 *         &lt;element name="mtvSuspensao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="01"/>
                 *               &lt;enumeration value="99"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dscSuspensao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
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
                    "mtvSuspensao",
                    "dscSuspensao"
                })
                public static class Suspensao {

                    @XmlElement(required = true)
                    protected String mtvSuspensao;
                    protected String dscSuspensao;

                    /**
                     * Obtém o valor da propriedade mtvSuspensao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMtvSuspensao() {
                        return mtvSuspensao;
                    }

                    /**
                     * Define o valor da propriedade mtvSuspensao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMtvSuspensao(String value) {
                        this.mtvSuspensao = value;
                    }

                    /**
                     * Obtém o valor da propriedade dscSuspensao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDscSuspensao() {
                        return dscSuspensao;
                    }

                    /**
                     * Define o valor da propriedade dscSuspensao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDscSuspensao(String value) {
                        this.dscSuspensao = value;
                    }

                }

            }

        }

    }

}
