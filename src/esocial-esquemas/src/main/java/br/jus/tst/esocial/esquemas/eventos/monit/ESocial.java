//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:18 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.monit;

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
 *         &lt;element name="evtMonit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}T_ideVinculo_sst"/>
 *                   &lt;element name="exMedOcup">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpExameOcup">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="aso">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtAso" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="resAso" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="exame" maxOccurs="99">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dtExm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="procRealizado">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;pattern value="\d{4}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="obsProc" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
 *                                                 &lt;element name="ordExame">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="indResult" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="3"/>
 *                                                       &lt;enumeration value="4"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="medico">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
 *                                                 &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
 *                                                 &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
 *                             &lt;element name="respMonit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_cpf" minOccurs="0"/>
 *                                       &lt;element name="nmResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
 *                                       &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
 *                                       &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_Id" />
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
    "evtMonit",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtMonit evtMonit;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtMonit.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtMonit }
     *     
     */
    public ESocial.EvtMonit getEvtMonit() {
        return evtMonit;
    }

    /**
     * Define o valor da propriedade evtMonit.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtMonit }
     *     
     */
    public void setEvtMonit(ESocial.EvtMonit value) {
        this.evtMonit = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}T_ideVinculo_sst"/>
     *         &lt;element name="exMedOcup">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpExameOcup">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                         &lt;enumeration value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="aso">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtAso" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="resAso" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="exame" maxOccurs="99">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dtExm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="procRealizado">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;pattern value="\d{4}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="obsProc" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
     *                                       &lt;element name="ordExame">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;enumeration value="1"/>
     *                                             &lt;enumeration value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="indResult" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;enumeration value="1"/>
     *                                             &lt;enumeration value="2"/>
     *                                             &lt;enumeration value="3"/>
     *                                             &lt;enumeration value="4"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="medico">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
     *                                       &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
     *                                       &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
     *                   &lt;element name="respMonit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_cpf" minOccurs="0"/>
     *                             &lt;element name="nmResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
     *                             &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
     *                             &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_Id" />
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
        "ideVinculo",
        "exMedOcup"
    })
    public static class EvtMonit {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculoSst ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtMonit.ExMedOcup exMedOcup;
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
         * Obtém o valor da propriedade ideVinculo.
         * 
         * @return
         *     possible object is
         *     {@link TIdeVinculoSst }
         *     
         */
        public TIdeVinculoSst getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVinculoSst }
         *     
         */
        public void setIdeVinculo(TIdeVinculoSst value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade exMedOcup.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtMonit.ExMedOcup }
         *     
         */
        public ESocial.EvtMonit.ExMedOcup getExMedOcup() {
            return exMedOcup;
        }

        /**
         * Define o valor da propriedade exMedOcup.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtMonit.ExMedOcup }
         *     
         */
        public void setExMedOcup(ESocial.EvtMonit.ExMedOcup value) {
            this.exMedOcup = value;
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
         *         &lt;element name="tpExameOcup">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="aso">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtAso" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="resAso" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="exame" maxOccurs="99">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dtExm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="procRealizado">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;pattern value="\d{4}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="obsProc" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
         *                             &lt;element name="ordExame">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="indResult" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                   &lt;enumeration value="3"/>
         *                                   &lt;enumeration value="4"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="medico">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
         *                             &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
         *                             &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
         *         &lt;element name="respMonit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_cpf" minOccurs="0"/>
         *                   &lt;element name="nmResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
         *                   &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
         *                   &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
            "tpExameOcup",
            "aso",
            "respMonit"
        })
        public static class ExMedOcup {

            protected byte tpExameOcup;
            @XmlElement(required = true)
            protected ESocial.EvtMonit.ExMedOcup.Aso aso;
            protected ESocial.EvtMonit.ExMedOcup.RespMonit respMonit;

            /**
             * Obtém o valor da propriedade tpExameOcup.
             * 
             */
            public byte getTpExameOcup() {
                return tpExameOcup;
            }

            /**
             * Define o valor da propriedade tpExameOcup.
             * 
             */
            public void setTpExameOcup(byte value) {
                this.tpExameOcup = value;
            }

            /**
             * Obtém o valor da propriedade aso.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtMonit.ExMedOcup.Aso }
             *     
             */
            public ESocial.EvtMonit.ExMedOcup.Aso getAso() {
                return aso;
            }

            /**
             * Define o valor da propriedade aso.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtMonit.ExMedOcup.Aso }
             *     
             */
            public void setAso(ESocial.EvtMonit.ExMedOcup.Aso value) {
                this.aso = value;
            }

            /**
             * Obtém o valor da propriedade respMonit.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtMonit.ExMedOcup.RespMonit }
             *     
             */
            public ESocial.EvtMonit.ExMedOcup.RespMonit getRespMonit() {
                return respMonit;
            }

            /**
             * Define o valor da propriedade respMonit.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtMonit.ExMedOcup.RespMonit }
             *     
             */
            public void setRespMonit(ESocial.EvtMonit.ExMedOcup.RespMonit value) {
                this.respMonit = value;
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
             *         &lt;element name="dtAso" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="resAso" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="exame" maxOccurs="99">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dtExm" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="procRealizado">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;pattern value="\d{4}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="obsProc" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
             *                   &lt;element name="ordExame">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="indResult" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                         &lt;enumeration value="3"/>
             *                         &lt;enumeration value="4"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="medico">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
             *                   &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
             *                   &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
                "dtAso",
                "resAso",
                "exame",
                "medico"
            })
            public static class Aso {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtAso;
                protected Byte resAso;
                @XmlElement(required = true)
                protected List<ESocial.EvtMonit.ExMedOcup.Aso.Exame> exame;
                @XmlElement(required = true)
                protected ESocial.EvtMonit.ExMedOcup.Aso.Medico medico;

                /**
                 * Obtém o valor da propriedade dtAso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAso() {
                    return dtAso;
                }

                /**
                 * Define o valor da propriedade dtAso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAso(XMLGregorianCalendar value) {
                    this.dtAso = value;
                }

                /**
                 * Obtém o valor da propriedade resAso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getResAso() {
                    return resAso;
                }

                /**
                 * Define o valor da propriedade resAso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setResAso(Byte value) {
                    this.resAso = value;
                }

                /**
                 * Gets the value of the exame property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the exame property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getExame().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtMonit.ExMedOcup.Aso.Exame }
                 * 
                 * 
                 */
                public List<ESocial.EvtMonit.ExMedOcup.Aso.Exame> getExame() {
                    if (exame == null) {
                        exame = new ArrayList<ESocial.EvtMonit.ExMedOcup.Aso.Exame>();
                    }
                    return this.exame;
                }

                /**
                 * Obtém o valor da propriedade medico.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtMonit.ExMedOcup.Aso.Medico }
                 *     
                 */
                public ESocial.EvtMonit.ExMedOcup.Aso.Medico getMedico() {
                    return medico;
                }

                /**
                 * Define o valor da propriedade medico.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtMonit.ExMedOcup.Aso.Medico }
                 *     
                 */
                public void setMedico(ESocial.EvtMonit.ExMedOcup.Aso.Medico value) {
                    this.medico = value;
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
                 *         &lt;element name="dtExm" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="procRealizado">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;pattern value="\d{4}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="obsProc" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
                 *         &lt;element name="ordExame">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="indResult" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *               &lt;enumeration value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "dtExm",
                    "procRealizado",
                    "obsProc",
                    "ordExame",
                    "indResult"
                })
                public static class Exame {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtExm;
                    @XmlElement(required = true)
                    protected BigInteger procRealizado;
                    protected String obsProc;
                    protected byte ordExame;
                    protected Byte indResult;

                    /**
                     * Obtém o valor da propriedade dtExm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtExm() {
                        return dtExm;
                    }

                    /**
                     * Define o valor da propriedade dtExm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtExm(XMLGregorianCalendar value) {
                        this.dtExm = value;
                    }

                    /**
                     * Obtém o valor da propriedade procRealizado.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getProcRealizado() {
                        return procRealizado;
                    }

                    /**
                     * Define o valor da propriedade procRealizado.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setProcRealizado(BigInteger value) {
                        this.procRealizado = value;
                    }

                    /**
                     * Obtém o valor da propriedade obsProc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getObsProc() {
                        return obsProc;
                    }

                    /**
                     * Define o valor da propriedade obsProc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setObsProc(String value) {
                        this.obsProc = value;
                    }

                    /**
                     * Obtém o valor da propriedade ordExame.
                     * 
                     */
                    public byte getOrdExame() {
                        return ordExame;
                    }

                    /**
                     * Define o valor da propriedade ordExame.
                     * 
                     */
                    public void setOrdExame(byte value) {
                        this.ordExame = value;
                    }

                    /**
                     * Obtém o valor da propriedade indResult.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getIndResult() {
                        return indResult;
                    }

                    /**
                     * Define o valor da propriedade indResult.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setIndResult(Byte value) {
                        this.indResult = value;
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
                 *         &lt;element name="nmMed" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
                 *         &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
                 *         &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
                    "nmMed",
                    "nrCRM",
                    "ufCRM"
                })
                public static class Medico {

                    @XmlElement(required = true)
                    protected String nmMed;
                    @XmlElement(required = true)
                    protected String nrCRM;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "string")
                    protected TSUf ufCRM;

                    /**
                     * Obtém o valor da propriedade nmMed.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNmMed() {
                        return nmMed;
                    }

                    /**
                     * Define o valor da propriedade nmMed.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNmMed(String value) {
                        this.nmMed = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrCRM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrCRM() {
                        return nrCRM;
                    }

                    /**
                     * Define o valor da propriedade nrCRM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrCRM(String value) {
                        this.nrCRM = value;
                    }

                    /**
                     * Obtém o valor da propriedade ufCRM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSUf }
                     *     
                     */
                    public TSUf getUfCRM() {
                        return ufCRM;
                    }

                    /**
                     * Define o valor da propriedade ufCRM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSUf }
                     *     
                     */
                    public void setUfCRM(TSUf value) {
                        this.ufCRM = value;
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
             *         &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_cpf" minOccurs="0"/>
             *         &lt;element name="nmResp" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_nome"/>
             *         &lt;element name="nrCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_crm"/>
             *         &lt;element name="ufCRM" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_uf"/>
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
                "cpfResp",
                "nmResp",
                "nrCRM",
                "ufCRM"
            })
            public static class RespMonit {

                protected String cpfResp;
                @XmlElement(required = true)
                protected String nmResp;
                @XmlElement(required = true)
                protected String nrCRM;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSUf ufCRM;

                /**
                 * Obtém o valor da propriedade cpfResp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfResp() {
                    return cpfResp;
                }

                /**
                 * Define o valor da propriedade cpfResp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfResp(String value) {
                    this.cpfResp = value;
                }

                /**
                 * Obtém o valor da propriedade nmResp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNmResp() {
                    return nmResp;
                }

                /**
                 * Define o valor da propriedade nmResp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNmResp(String value) {
                    this.nmResp = value;
                }

                /**
                 * Obtém o valor da propriedade nrCRM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrCRM() {
                    return nrCRM;
                }

                /**
                 * Define o valor da propriedade nrCRM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrCRM(String value) {
                    this.nrCRM = value;
                }

                /**
                 * Obtém o valor da propriedade ufCRM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSUf }
                 *     
                 */
                public TSUf getUfCRM() {
                    return ufCRM;
                }

                /**
                 * Define o valor da propriedade ufCRM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSUf }
                 *     
                 */
                public void setUfCRM(TSUf value) {
                    this.ufCRM = value;
                }

            }

        }

    }

}
