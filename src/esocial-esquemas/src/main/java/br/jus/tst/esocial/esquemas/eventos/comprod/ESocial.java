//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:06 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.comprod;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="evtComProd">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}T_ideEvento_folha_mensal_PF"/>
 *                   &lt;element name="ideEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_2"/>
 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_cpf"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoComProd">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ideEstabel">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nrInscEstabRural">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="tpComerc" maxOccurs="5">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_indComerc"/>
 *                                                 &lt;element name="vrTotCom" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                 &lt;element name="ideAdquir" maxOccurs="9999" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                                                           &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                                                           &lt;element name="vrComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                           &lt;element name="nfs" maxOccurs="999" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="serie" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="1"/>
 *                                                                           &lt;maxLength value="5"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="nrDocto">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="1"/>
 *                                                                           &lt;maxLength value="20"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="dtEmisNF" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                                     &lt;element name="vlrBruto" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoProcJud" maxOccurs="10" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpProc_1_2"/>
 *                                                           &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrProc_17_20_21"/>
 *                                                           &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_codSusp"/>
 *                                                           &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                           &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_Id" />
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
    "evtComProd",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtComProd evtComProd;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtComProd.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtComProd }
     *     
     */
    public ESocial.EvtComProd getEvtComProd() {
        return evtComProd;
    }

    /**
     * Define o valor da propriedade evtComProd.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtComProd }
     *     
     */
    public void setEvtComProd(ESocial.EvtComProd value) {
        this.evtComProd = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}T_ideEvento_folha_mensal_PF"/>
     *         &lt;element name="ideEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_2"/>
     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_cpf"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoComProd">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ideEstabel">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nrInscEstabRural">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{14}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="tpComerc" maxOccurs="5">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_indComerc"/>
     *                                       &lt;element name="vrTotCom" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                       &lt;element name="ideAdquir" maxOccurs="9999" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrInsc_11_14"/>
     *                                                 &lt;element name="vrComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                                 &lt;element name="nfs" maxOccurs="999" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="serie" minOccurs="0">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;minLength value="1"/>
     *                                                                 &lt;maxLength value="5"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="nrDocto">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;minLength value="1"/>
     *                                                                 &lt;maxLength value="20"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="dtEmisNF" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                           &lt;element name="vlrBruto" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoProcJud" maxOccurs="10" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpProc_1_2"/>
     *                                                 &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrProc_17_20_21"/>
     *                                                 &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_codSusp"/>
     *                                                 &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                 &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_Id" />
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
        "infoComProd"
    })
    public static class EvtComProd {

        @XmlElement(required = true)
        protected TIdeEventoFolhaMensalPF ideEvento;
        @XmlElement(required = true)
        protected ESocial.EvtComProd.IdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtComProd.InfoComProd infoComProd;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaMensalPF }
         *     
         */
        public TIdeEventoFolhaMensalPF getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaMensalPF }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaMensalPF value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtComProd.IdeEmpregador }
         *     
         */
        public ESocial.EvtComProd.IdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtComProd.IdeEmpregador }
         *     
         */
        public void setIdeEmpregador(ESocial.EvtComProd.IdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoComProd.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtComProd.InfoComProd }
         *     
         */
        public ESocial.EvtComProd.InfoComProd getInfoComProd() {
            return infoComProd;
        }

        /**
         * Define o valor da propriedade infoComProd.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtComProd.InfoComProd }
         *     
         */
        public void setInfoComProd(ESocial.EvtComProd.InfoComProd value) {
            this.infoComProd = value;
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
         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_2"/>
         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_cpf"/>
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
         *         &lt;element name="ideEstabel">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nrInscEstabRural">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{14}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="tpComerc" maxOccurs="5">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_indComerc"/>
         *                             &lt;element name="vrTotCom" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                             &lt;element name="ideAdquir" maxOccurs="9999" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_1_2"/>
         *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrInsc_11_14"/>
         *                                       &lt;element name="vrComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                                       &lt;element name="nfs" maxOccurs="999" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="serie" minOccurs="0">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="5"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="nrDocto">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="20"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="dtEmisNF" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                                 &lt;element name="vlrBruto" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
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
         *                             &lt;element name="infoProcJud" maxOccurs="10" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpProc_1_2"/>
         *                                       &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrProc_17_20_21"/>
         *                                       &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_codSusp"/>
         *                                       &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                       &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ideEstabel"
        })
        public static class InfoComProd {

            @XmlElement(required = true)
            protected ESocial.EvtComProd.InfoComProd.IdeEstabel ideEstabel;

            /**
             * Obtém o valor da propriedade ideEstabel.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtComProd.InfoComProd.IdeEstabel }
             *     
             */
            public ESocial.EvtComProd.InfoComProd.IdeEstabel getIdeEstabel() {
                return ideEstabel;
            }

            /**
             * Define o valor da propriedade ideEstabel.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtComProd.InfoComProd.IdeEstabel }
             *     
             */
            public void setIdeEstabel(ESocial.EvtComProd.InfoComProd.IdeEstabel value) {
                this.ideEstabel = value;
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
             *         &lt;element name="nrInscEstabRural">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{14}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="tpComerc" maxOccurs="5">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_indComerc"/>
             *                   &lt;element name="vrTotCom" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                   &lt;element name="ideAdquir" maxOccurs="9999" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_1_2"/>
             *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrInsc_11_14"/>
             *                             &lt;element name="vrComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                             &lt;element name="nfs" maxOccurs="999" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="serie" minOccurs="0">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="5"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="nrDocto">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="20"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="dtEmisNF" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                                       &lt;element name="vlrBruto" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
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
             *                   &lt;element name="infoProcJud" maxOccurs="10" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpProc_1_2"/>
             *                             &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrProc_17_20_21"/>
             *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_codSusp"/>
             *                             &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                             &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                "nrInscEstabRural",
                "tpComerc"
            })
            public static class IdeEstabel {

                @XmlElement(required = true)
                protected String nrInscEstabRural;
                @XmlElement(required = true)
                protected List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc> tpComerc;

                /**
                 * Obtém o valor da propriedade nrInscEstabRural.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrInscEstabRural() {
                    return nrInscEstabRural;
                }

                /**
                 * Define o valor da propriedade nrInscEstabRural.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrInscEstabRural(String value) {
                    this.nrInscEstabRural = value;
                }

                /**
                 * Gets the value of the tpComerc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tpComerc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTpComerc().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc }
                 * 
                 * 
                 */
                public List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc> getTpComerc() {
                    if (tpComerc == null) {
                        tpComerc = new ArrayList<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc>();
                    }
                    return this.tpComerc;
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
                 *         &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_indComerc"/>
                 *         &lt;element name="vrTotCom" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *         &lt;element name="ideAdquir" maxOccurs="9999" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_1_2"/>
                 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrInsc_11_14"/>
                 *                   &lt;element name="vrComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *                   &lt;element name="nfs" maxOccurs="999" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="serie" minOccurs="0">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="5"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="nrDocto">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="20"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="dtEmisNF" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                             &lt;element name="vlrBruto" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
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
                 *         &lt;element name="infoProcJud" maxOccurs="10" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpProc_1_2"/>
                 *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrProc_17_20_21"/>
                 *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_codSusp"/>
                 *                   &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                   &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                    "indComerc",
                    "vrTotCom",
                    "ideAdquir",
                    "infoProcJud"
                })
                public static class TpComerc {

                    protected byte indComerc;
                    @XmlElement(required = true)
                    protected BigDecimal vrTotCom;
                    protected List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir> ideAdquir;
                    protected List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.InfoProcJud> infoProcJud;

                    /**
                     * Obtém o valor da propriedade indComerc.
                     * 
                     */
                    public byte getIndComerc() {
                        return indComerc;
                    }

                    /**
                     * Define o valor da propriedade indComerc.
                     * 
                     */
                    public void setIndComerc(byte value) {
                        this.indComerc = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrTotCom.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrTotCom() {
                        return vrTotCom;
                    }

                    /**
                     * Define o valor da propriedade vrTotCom.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrTotCom(BigDecimal value) {
                        this.vrTotCom = value;
                    }

                    /**
                     * Gets the value of the ideAdquir property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the ideAdquir property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIdeAdquir().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir }
                     * 
                     * 
                     */
                    public List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir> getIdeAdquir() {
                        if (ideAdquir == null) {
                            ideAdquir = new ArrayList<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir>();
                        }
                        return this.ideAdquir;
                    }

                    /**
                     * Gets the value of the infoProcJud property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoProcJud property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoProcJud().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.InfoProcJud }
                     * 
                     * 
                     */
                    public List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.InfoProcJud> getInfoProcJud() {
                        if (infoProcJud == null) {
                            infoProcJud = new ArrayList<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.InfoProcJud>();
                        }
                        return this.infoProcJud;
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
                     *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpInsc_1_2"/>
                     *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrInsc_11_14"/>
                     *         &lt;element name="vrComerc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo"/>
                     *         &lt;element name="nfs" maxOccurs="999" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="serie" minOccurs="0">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="5"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="nrDocto">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="20"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="dtEmisNF" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *                   &lt;element name="vlrBruto" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
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
                        "tpInsc",
                        "nrInsc",
                        "vrComerc",
                        "nfs"
                    })
                    public static class IdeAdquir {

                        protected byte tpInsc;
                        @XmlElement(required = true)
                        protected String nrInsc;
                        @XmlElement(required = true)
                        protected BigDecimal vrComerc;
                        protected List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir.Nfs> nfs;

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

                        /**
                         * Obtém o valor da propriedade vrComerc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrComerc() {
                            return vrComerc;
                        }

                        /**
                         * Define o valor da propriedade vrComerc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrComerc(BigDecimal value) {
                            this.vrComerc = value;
                        }

                        /**
                         * Gets the value of the nfs property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the nfs property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getNfs().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir.Nfs }
                         * 
                         * 
                         */
                        public List<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir.Nfs> getNfs() {
                            if (nfs == null) {
                                nfs = new ArrayList<ESocial.EvtComProd.InfoComProd.IdeEstabel.TpComerc.IdeAdquir.Nfs>();
                            }
                            return this.nfs;
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
                         *         &lt;element name="serie" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="5"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="nrDocto">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="20"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="dtEmisNF" type="{http://www.w3.org/2001/XMLSchema}date"/>
                         *         &lt;element name="vlrBruto" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario"/>
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
                            "serie",
                            "nrDocto",
                            "dtEmisNF",
                            "vlrBruto",
                            "vrCPDescPR",
                            "vrRatDescPR",
                            "vrSenarDesc"
                        })
                        public static class Nfs {

                            protected String serie;
                            @XmlElement(required = true)
                            protected String nrDocto;
                            @XmlElement(required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar dtEmisNF;
                            @XmlElement(required = true)
                            protected BigDecimal vlrBruto;
                            @XmlElement(required = true)
                            protected BigDecimal vrCPDescPR;
                            @XmlElement(required = true)
                            protected BigDecimal vrRatDescPR;
                            @XmlElement(required = true)
                            protected BigDecimal vrSenarDesc;

                            /**
                             * Obtém o valor da propriedade serie.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSerie() {
                                return serie;
                            }

                            /**
                             * Define o valor da propriedade serie.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSerie(String value) {
                                this.serie = value;
                            }

                            /**
                             * Obtém o valor da propriedade nrDocto.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getNrDocto() {
                                return nrDocto;
                            }

                            /**
                             * Define o valor da propriedade nrDocto.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setNrDocto(String value) {
                                this.nrDocto = value;
                            }

                            /**
                             * Obtém o valor da propriedade dtEmisNF.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public XMLGregorianCalendar getDtEmisNF() {
                                return dtEmisNF;
                            }

                            /**
                             * Define o valor da propriedade dtEmisNF.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public void setDtEmisNF(XMLGregorianCalendar value) {
                                this.dtEmisNF = value;
                            }

                            /**
                             * Obtém o valor da propriedade vlrBruto.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVlrBruto() {
                                return vlrBruto;
                            }

                            /**
                             * Define o valor da propriedade vlrBruto.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVlrBruto(BigDecimal value) {
                                this.vlrBruto = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrCPDescPR.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrCPDescPR() {
                                return vrCPDescPR;
                            }

                            /**
                             * Define o valor da propriedade vrCPDescPR.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrCPDescPR(BigDecimal value) {
                                this.vrCPDescPR = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrRatDescPR.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrRatDescPR() {
                                return vrRatDescPR;
                            }

                            /**
                             * Define o valor da propriedade vrRatDescPR.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrRatDescPR(BigDecimal value) {
                                this.vrRatDescPR = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSenarDesc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSenarDesc() {
                                return vrSenarDesc;
                            }

                            /**
                             * Define o valor da propriedade vrSenarDesc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSenarDesc(BigDecimal value) {
                                this.vrSenarDesc = value;
                            }

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
                     *         &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_tpProc_1_2"/>
                     *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_nrProc_17_20_21"/>
                     *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_codSusp"/>
                     *         &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *         &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtComProd/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                        "tpProc",
                        "nrProc",
                        "codSusp",
                        "vrCPSusp",
                        "vrRatSusp",
                        "vrSenarSusp"
                    })
                    public static class InfoProcJud {

                        protected byte tpProc;
                        @XmlElement(required = true)
                        protected String nrProc;
                        @XmlElement(required = true)
                        protected BigInteger codSusp;
                        protected BigDecimal vrCPSusp;
                        protected BigDecimal vrRatSusp;
                        protected BigDecimal vrSenarSusp;

                        /**
                         * Obtém o valor da propriedade tpProc.
                         * 
                         */
                        public byte getTpProc() {
                            return tpProc;
                        }

                        /**
                         * Define o valor da propriedade tpProc.
                         * 
                         */
                        public void setTpProc(byte value) {
                            this.tpProc = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrProc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrProc() {
                            return nrProc;
                        }

                        /**
                         * Define o valor da propriedade nrProc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrProc(String value) {
                            this.nrProc = value;
                        }

                        /**
                         * Obtém o valor da propriedade codSusp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCodSusp() {
                            return codSusp;
                        }

                        /**
                         * Define o valor da propriedade codSusp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCodSusp(BigInteger value) {
                            this.codSusp = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrCPSusp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrCPSusp() {
                            return vrCPSusp;
                        }

                        /**
                         * Define o valor da propriedade vrCPSusp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrCPSusp(BigDecimal value) {
                            this.vrCPSusp = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrRatSusp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrRatSusp() {
                            return vrRatSusp;
                        }

                        /**
                         * Define o valor da propriedade vrRatSusp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrRatSusp(BigDecimal value) {
                            this.vrRatSusp = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrSenarSusp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrSenarSusp() {
                            return vrSenarSusp;
                        }

                        /**
                         * Define o valor da propriedade vrSenarSusp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrSenarSusp(BigDecimal value) {
                            this.vrSenarSusp = value;
                        }

                    }

                }

            }

        }

    }

}
