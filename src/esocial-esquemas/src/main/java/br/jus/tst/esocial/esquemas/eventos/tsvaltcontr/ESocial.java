//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:29 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvaltcontr;

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
 *         &lt;element name="evtTSVAltContr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabSemVinculo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_ideTrabSemVinculo"/>
 *                   &lt;element name="infoTSVAlteracao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_dtAlteracao"/>
 *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
 *                             &lt;element name="infoComplementares" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cargoFuncao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                                 &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
 *                                                 &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                                 &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
 *                                       &lt;element name="infoDirigenteSindical" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoTrabCedido" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoMandElet" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
 *                                                 &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_Id" />
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
    "evtTSVAltContr",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtTSVAltContr evtTSVAltContr;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTSVAltContr.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTSVAltContr }
     *     
     */
    public ESocial.EvtTSVAltContr getEvtTSVAltContr() {
        return evtTSVAltContr;
    }

    /**
     * Define o valor da propriedade evtTSVAltContr.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTSVAltContr }
     *     
     */
    public void setEvtTSVAltContr(ESocial.EvtTSVAltContr value) {
        this.evtTSVAltContr = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabSemVinculo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_ideTrabSemVinculo"/>
     *         &lt;element name="infoTSVAlteracao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_dtAlteracao"/>
     *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
     *                   &lt;element name="infoComplementares" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cargoFuncao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                                       &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
     *                                       &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                                       &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
     *                             &lt;element name="infoDirigenteSindical" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoTrabCedido" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoMandElet" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
     *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_Id" />
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
        "ideTrabSemVinculo",
        "infoTSVAlteracao"
    })
    public static class EvtTSVAltContr {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeTrabSemVinculo ideTrabSemVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtTSVAltContr.InfoTSVAlteracao infoTSVAlteracao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrab }
         *     
         */
        public TIdeEventoTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrab }
         *     
         */
        public void setIdeEvento(TIdeEventoTrab value) {
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
         * Obtém o valor da propriedade ideTrabSemVinculo.
         * 
         * @return
         *     possible object is
         *     {@link TIdeTrabSemVinculo }
         *     
         */
        public TIdeTrabSemVinculo getIdeTrabSemVinculo() {
            return ideTrabSemVinculo;
        }

        /**
         * Define o valor da propriedade ideTrabSemVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeTrabSemVinculo }
         *     
         */
        public void setIdeTrabSemVinculo(TIdeTrabSemVinculo value) {
            this.ideTrabSemVinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoTSVAlteracao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao }
         *     
         */
        public ESocial.EvtTSVAltContr.InfoTSVAlteracao getInfoTSVAlteracao() {
            return infoTSVAlteracao;
        }

        /**
         * Define o valor da propriedade infoTSVAlteracao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao }
         *     
         */
        public void setInfoTSVAlteracao(ESocial.EvtTSVAltContr.InfoTSVAlteracao value) {
            this.infoTSVAlteracao = value;
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
         *         &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_dtAlteracao"/>
         *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
         *         &lt;element name="infoComplementares" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cargoFuncao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                             &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
         *                             &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                             &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
         *                   &lt;element name="infoDirigenteSindical" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoTrabCedido" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoMandElet" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
         *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
            "dtAlteracao",
            "natAtividade",
            "infoComplementares"
        })
        public static class InfoTSVAlteracao {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAlteracao;
            protected Byte natAtividade;
            protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares infoComplementares;

            /**
             * Obtém o valor da propriedade dtAlteracao.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAlteracao() {
                return dtAlteracao;
            }

            /**
             * Define o valor da propriedade dtAlteracao.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAlteracao(XMLGregorianCalendar value) {
                this.dtAlteracao = value;
            }

            /**
             * Obtém o valor da propriedade natAtividade.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getNatAtividade() {
                return natAtividade;
            }

            /**
             * Define o valor da propriedade natAtividade.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setNatAtividade(Byte value) {
                this.natAtividade = value;
            }

            /**
             * Obtém o valor da propriedade infoComplementares.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares }
             *     
             */
            public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares getInfoComplementares() {
                return infoComplementares;
            }

            /**
             * Define o valor da propriedade infoComplementares.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares }
             *     
             */
            public void setInfoComplementares(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares value) {
                this.infoComplementares = value;
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
             *         &lt;element name="cargoFuncao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *                   &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
             *                   &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *                   &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
             *         &lt;element name="infoDirigenteSindical" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoTrabCedido" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoMandElet" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
             *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
                "cargoFuncao",
                "remuneracao",
                "infoDirigenteSindical",
                "infoTrabCedido",
                "infoMandElet",
                "infoEstagiario"
            })
            public static class InfoComplementares {

                protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.CargoFuncao cargoFuncao;
                protected TRemuneracao remuneracao;
                protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoDirigenteSindical infoDirigenteSindical;
                protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoTrabCedido infoTrabCedido;
                protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoMandElet infoMandElet;
                protected TInfoEstagiario infoEstagiario;

                /**
                 * Obtém o valor da propriedade cargoFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.CargoFuncao }
                 *     
                 */
                public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.CargoFuncao getCargoFuncao() {
                    return cargoFuncao;
                }

                /**
                 * Define o valor da propriedade cargoFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.CargoFuncao }
                 *     
                 */
                public void setCargoFuncao(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.CargoFuncao value) {
                    this.cargoFuncao = value;
                }

                /**
                 * Obtém o valor da propriedade remuneracao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRemuneracao }
                 *     
                 */
                public TRemuneracao getRemuneracao() {
                    return remuneracao;
                }

                /**
                 * Define o valor da propriedade remuneracao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRemuneracao }
                 *     
                 */
                public void setRemuneracao(TRemuneracao value) {
                    this.remuneracao = value;
                }

                /**
                 * Obtém o valor da propriedade infoDirigenteSindical.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoDirigenteSindical }
                 *     
                 */
                public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoDirigenteSindical getInfoDirigenteSindical() {
                    return infoDirigenteSindical;
                }

                /**
                 * Define o valor da propriedade infoDirigenteSindical.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoDirigenteSindical }
                 *     
                 */
                public void setInfoDirigenteSindical(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoDirigenteSindical value) {
                    this.infoDirigenteSindical = value;
                }

                /**
                 * Obtém o valor da propriedade infoTrabCedido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoTrabCedido }
                 *     
                 */
                public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoTrabCedido getInfoTrabCedido() {
                    return infoTrabCedido;
                }

                /**
                 * Define o valor da propriedade infoTrabCedido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoTrabCedido }
                 *     
                 */
                public void setInfoTrabCedido(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoTrabCedido value) {
                    this.infoTrabCedido = value;
                }

                /**
                 * Obtém o valor da propriedade infoMandElet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoMandElet }
                 *     
                 */
                public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoMandElet getInfoMandElet() {
                    return infoMandElet;
                }

                /**
                 * Define o valor da propriedade infoMandElet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoMandElet }
                 *     
                 */
                public void setInfoMandElet(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoMandElet value) {
                    this.infoMandElet = value;
                }

                /**
                 * Obtém o valor da propriedade infoEstagiario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoEstagiario }
                 *     
                 */
                public TInfoEstagiario getInfoEstagiario() {
                    return infoEstagiario;
                }

                /**
                 * Define o valor da propriedade infoEstagiario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoEstagiario }
                 *     
                 */
                public void setInfoEstagiario(TInfoEstagiario value) {
                    this.infoEstagiario = value;
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
                 *         &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
                 *         &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
                 *         &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
                 *         &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
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
                    "nmCargo",
                    "cboCargo",
                    "nmFuncao",
                    "cboFuncao"
                })
                public static class CargoFuncao {

                    protected String nmCargo;
                    @XmlElement(name = "CBOCargo")
                    protected String cboCargo;
                    protected String nmFuncao;
                    @XmlElement(name = "CBOFuncao")
                    protected String cboFuncao;

                    /**
                     * Obtém o valor da propriedade nmCargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNmCargo() {
                        return nmCargo;
                    }

                    /**
                     * Define o valor da propriedade nmCargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNmCargo(String value) {
                        this.nmCargo = value;
                    }

                    /**
                     * Obtém o valor da propriedade cboCargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCBOCargo() {
                        return cboCargo;
                    }

                    /**
                     * Define o valor da propriedade cboCargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCBOCargo(String value) {
                        this.cboCargo = value;
                    }

                    /**
                     * Obtém o valor da propriedade nmFuncao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNmFuncao() {
                        return nmFuncao;
                    }

                    /**
                     * Define o valor da propriedade nmFuncao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNmFuncao(String value) {
                        this.nmFuncao = value;
                    }

                    /**
                     * Obtém o valor da propriedade cboFuncao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCBOFuncao() {
                        return cboFuncao;
                    }

                    /**
                     * Define o valor da propriedade cboFuncao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCBOFuncao(String value) {
                        this.cboFuncao = value;
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
                 *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
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
                    "tpRegPrev"
                })
                public static class InfoDirigenteSindical {

                    protected byte tpRegPrev;

                    /**
                     * Obtém o valor da propriedade tpRegPrev.
                     * 
                     */
                    public byte getTpRegPrev() {
                        return tpRegPrev;
                    }

                    /**
                     * Define o valor da propriedade tpRegPrev.
                     * 
                     */
                    public void setTpRegPrev(byte value) {
                        this.tpRegPrev = value;
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
                 *         &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
                 *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
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
                    "indRemunCargo",
                    "tpRegPrev"
                })
                public static class InfoMandElet {

                    @XmlSchemaType(name = "string")
                    protected TSSimNao indRemunCargo;
                    protected byte tpRegPrev;

                    /**
                     * Obtém o valor da propriedade indRemunCargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getIndRemunCargo() {
                        return indRemunCargo;
                    }

                    /**
                     * Define o valor da propriedade indRemunCargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setIndRemunCargo(TSSimNao value) {
                        this.indRemunCargo = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpRegPrev.
                     * 
                     */
                    public byte getTpRegPrev() {
                        return tpRegPrev;
                    }

                    /**
                     * Define o valor da propriedade tpRegPrev.
                     * 
                     */
                    public void setTpRegPrev(byte value) {
                        this.tpRegPrev = value;
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
                 *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v_S_01_00_00}TS_tpRegPrev"/>
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
                    "tpRegPrev"
                })
                public static class InfoTrabCedido {

                    protected byte tpRegPrev;

                    /**
                     * Obtém o valor da propriedade tpRegPrev.
                     * 
                     */
                    public byte getTpRegPrev() {
                        return tpRegPrev;
                    }

                    /**
                     * Define o valor da propriedade tpRegPrev.
                     * 
                     */
                    public void setTpRegPrev(byte value) {
                        this.tpRegPrev = value;
                    }

                }

            }

        }

    }

}
