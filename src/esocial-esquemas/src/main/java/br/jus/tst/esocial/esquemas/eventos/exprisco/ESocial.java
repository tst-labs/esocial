//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.exprisco;

import java.math.BigDecimal;
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
 *         &lt;element name="evtExpRisco">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}T_ideVinculo_sst"/>
 *                   &lt;element name="infoExpRisco">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtIniCondicao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="infoAmb">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="localAmb">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscSetor" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_100"/>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_tpInsc_1_3_4"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_nrInsc_12_14"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoAtiv">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dscAtivDes" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="agNoc" maxOccurs="999">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codAgNoc">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="9"/>
 *                                             &lt;pattern value="\d{2}\.\d{2}\.\d{3}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscAgNoc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
 *                                       &lt;element name="tpAval">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="intConc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;totalDigits value="10"/>
 *                                             &lt;fractionDigits value="4"/>
 *                                             &lt;maxInclusive value="999999.9999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="limTol" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;totalDigits value="10"/>
 *                                             &lt;fractionDigits value="4"/>
 *                                             &lt;maxInclusive value="999999.9999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="unMed" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                             &lt;enumeration value="6"/>
 *                                             &lt;enumeration value="7"/>
 *                                             &lt;enumeration value="8"/>
 *                                             &lt;enumeration value="9"/>
 *                                             &lt;enumeration value="10"/>
 *                                             &lt;enumeration value="11"/>
 *                                             &lt;enumeration value="12"/>
 *                                             &lt;enumeration value="13"/>
 *                                             &lt;enumeration value="14"/>
 *                                             &lt;enumeration value="15"/>
 *                                             &lt;enumeration value="16"/>
 *                                             &lt;enumeration value="17"/>
 *                                             &lt;enumeration value="18"/>
 *                                             &lt;enumeration value="19"/>
 *                                             &lt;enumeration value="20"/>
 *                                             &lt;enumeration value="21"/>
 *                                             &lt;enumeration value="22"/>
 *                                             &lt;enumeration value="23"/>
 *                                             &lt;enumeration value="24"/>
 *                                             &lt;enumeration value="25"/>
 *                                             &lt;enumeration value="26"/>
 *                                             &lt;enumeration value="27"/>
 *                                             &lt;enumeration value="28"/>
 *                                             &lt;enumeration value="29"/>
 *                                             &lt;enumeration value="30"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="tecMedicao" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="40"/>
 *                                             &lt;pattern value=".*[^\s].*"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="epcEpi">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="utilizEPC">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="0"/>
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="eficEpc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                 &lt;element name="utilizEPI">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="0"/>
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="epi" maxOccurs="50" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="docAval" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
 *                                                           &lt;element name="dscEPI" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
 *                                                           &lt;element name="eficEpi" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="epiCompl" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="medProtecao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
 *                                                           &lt;element name="condFuncto" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
 *                                                           &lt;element name="usoInint" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
 *                                                           &lt;element name="przValid" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
 *                                                           &lt;element name="periodicTroca" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
 *                                                           &lt;element name="higienizacao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
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
 *                             &lt;element name="respReg" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_cpf"/>
 *                                       &lt;element name="ideOC">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="9"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscOC" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="20"/>
 *                                             &lt;pattern value=".*[^\s].*"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrOC">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="14"/>
 *                                             &lt;pattern value=".*[^\s].*"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_uf"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="obs" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="obsCompl" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_Id" />
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
    "evtExpRisco",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtExpRisco evtExpRisco;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtExpRisco.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtExpRisco }
     *     
     */
    public ESocial.EvtExpRisco getEvtExpRisco() {
        return evtExpRisco;
    }

    /**
     * Define o valor da propriedade evtExpRisco.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtExpRisco }
     *     
     */
    public void setEvtExpRisco(ESocial.EvtExpRisco value) {
        this.evtExpRisco = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}T_ideVinculo_sst"/>
     *         &lt;element name="infoExpRisco">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtIniCondicao" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="infoAmb">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="localAmb">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscSetor" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_100"/>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_tpInsc_1_3_4"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_nrInsc_12_14"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoAtiv">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dscAtivDes" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="agNoc" maxOccurs="999">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codAgNoc">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="9"/>
     *                                   &lt;pattern value="\d{2}\.\d{2}\.\d{3}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscAgNoc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
     *                             &lt;element name="tpAval">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="intConc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;totalDigits value="10"/>
     *                                   &lt;fractionDigits value="4"/>
     *                                   &lt;maxInclusive value="999999.9999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="limTol" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;totalDigits value="10"/>
     *                                   &lt;fractionDigits value="4"/>
     *                                   &lt;maxInclusive value="999999.9999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="unMed" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                   &lt;enumeration value="6"/>
     *                                   &lt;enumeration value="7"/>
     *                                   &lt;enumeration value="8"/>
     *                                   &lt;enumeration value="9"/>
     *                                   &lt;enumeration value="10"/>
     *                                   &lt;enumeration value="11"/>
     *                                   &lt;enumeration value="12"/>
     *                                   &lt;enumeration value="13"/>
     *                                   &lt;enumeration value="14"/>
     *                                   &lt;enumeration value="15"/>
     *                                   &lt;enumeration value="16"/>
     *                                   &lt;enumeration value="17"/>
     *                                   &lt;enumeration value="18"/>
     *                                   &lt;enumeration value="19"/>
     *                                   &lt;enumeration value="20"/>
     *                                   &lt;enumeration value="21"/>
     *                                   &lt;enumeration value="22"/>
     *                                   &lt;enumeration value="23"/>
     *                                   &lt;enumeration value="24"/>
     *                                   &lt;enumeration value="25"/>
     *                                   &lt;enumeration value="26"/>
     *                                   &lt;enumeration value="27"/>
     *                                   &lt;enumeration value="28"/>
     *                                   &lt;enumeration value="29"/>
     *                                   &lt;enumeration value="30"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="tecMedicao" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="40"/>
     *                                   &lt;pattern value=".*[^\s].*"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="epcEpi">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="utilizEPC">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;enumeration value="0"/>
     *                                             &lt;enumeration value="1"/>
     *                                             &lt;enumeration value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="eficEpc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                       &lt;element name="utilizEPI">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;enumeration value="0"/>
     *                                             &lt;enumeration value="1"/>
     *                                             &lt;enumeration value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="epi" maxOccurs="50" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="docAval" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
     *                                                 &lt;element name="dscEPI" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
     *                                                 &lt;element name="eficEpi" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="epiCompl" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="medProtecao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
     *                                                 &lt;element name="condFuncto" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
     *                                                 &lt;element name="usoInint" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
     *                                                 &lt;element name="przValid" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
     *                                                 &lt;element name="periodicTroca" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
     *                                                 &lt;element name="higienizacao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
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
     *                   &lt;element name="respReg" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_cpf"/>
     *                             &lt;element name="ideOC">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="9"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscOC" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="20"/>
     *                                   &lt;pattern value=".*[^\s].*"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrOC">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="14"/>
     *                                   &lt;pattern value=".*[^\s].*"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_uf"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="obs" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="obsCompl" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_Id" />
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
        "infoExpRisco"
    })
    public static class EvtExpRisco {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculoSst ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtExpRisco.InfoExpRisco infoExpRisco;
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
         * Obtém o valor da propriedade infoExpRisco.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtExpRisco.InfoExpRisco }
         *     
         */
        public ESocial.EvtExpRisco.InfoExpRisco getInfoExpRisco() {
            return infoExpRisco;
        }

        /**
         * Define o valor da propriedade infoExpRisco.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtExpRisco.InfoExpRisco }
         *     
         */
        public void setInfoExpRisco(ESocial.EvtExpRisco.InfoExpRisco value) {
            this.infoExpRisco = value;
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
         *         &lt;element name="dtIniCondicao" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="infoAmb">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="localAmb">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscSetor" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_100"/>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_tpInsc_1_3_4"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_nrInsc_12_14"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoAtiv">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dscAtivDes" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="agNoc" maxOccurs="999">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codAgNoc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="9"/>
         *                         &lt;pattern value="\d{2}\.\d{2}\.\d{3}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscAgNoc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
         *                   &lt;element name="tpAval">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="intConc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;totalDigits value="10"/>
         *                         &lt;fractionDigits value="4"/>
         *                         &lt;maxInclusive value="999999.9999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="limTol" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;totalDigits value="10"/>
         *                         &lt;fractionDigits value="4"/>
         *                         &lt;maxInclusive value="999999.9999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="unMed" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                         &lt;enumeration value="6"/>
         *                         &lt;enumeration value="7"/>
         *                         &lt;enumeration value="8"/>
         *                         &lt;enumeration value="9"/>
         *                         &lt;enumeration value="10"/>
         *                         &lt;enumeration value="11"/>
         *                         &lt;enumeration value="12"/>
         *                         &lt;enumeration value="13"/>
         *                         &lt;enumeration value="14"/>
         *                         &lt;enumeration value="15"/>
         *                         &lt;enumeration value="16"/>
         *                         &lt;enumeration value="17"/>
         *                         &lt;enumeration value="18"/>
         *                         &lt;enumeration value="19"/>
         *                         &lt;enumeration value="20"/>
         *                         &lt;enumeration value="21"/>
         *                         &lt;enumeration value="22"/>
         *                         &lt;enumeration value="23"/>
         *                         &lt;enumeration value="24"/>
         *                         &lt;enumeration value="25"/>
         *                         &lt;enumeration value="26"/>
         *                         &lt;enumeration value="27"/>
         *                         &lt;enumeration value="28"/>
         *                         &lt;enumeration value="29"/>
         *                         &lt;enumeration value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="tecMedicao" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="40"/>
         *                         &lt;pattern value=".*[^\s].*"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="epcEpi">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="utilizEPC">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;enumeration value="0"/>
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="eficEpc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                             &lt;element name="utilizEPI">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;enumeration value="0"/>
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="epi" maxOccurs="50" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="docAval" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
         *                                       &lt;element name="dscEPI" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
         *                                       &lt;element name="eficEpi" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="epiCompl" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="medProtecao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
         *                                       &lt;element name="condFuncto" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
         *                                       &lt;element name="usoInint" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
         *                                       &lt;element name="przValid" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
         *                                       &lt;element name="periodicTroca" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
         *                                       &lt;element name="higienizacao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
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
         *         &lt;element name="respReg" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_cpf"/>
         *                   &lt;element name="ideOC">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="9"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscOC" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="20"/>
         *                         &lt;pattern value=".*[^\s].*"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrOC">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="14"/>
         *                         &lt;pattern value=".*[^\s].*"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_uf"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="obs" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="obsCompl" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
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
            "dtIniCondicao",
            "infoAmb",
            "infoAtiv",
            "agNoc",
            "respReg",
            "obs"
        })
        public static class InfoExpRisco {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtIniCondicao;
            @XmlElement(required = true)
            protected ESocial.EvtExpRisco.InfoExpRisco.InfoAmb infoAmb;
            @XmlElement(required = true)
            protected ESocial.EvtExpRisco.InfoExpRisco.InfoAtiv infoAtiv;
            @XmlElement(required = true)
            protected List<ESocial.EvtExpRisco.InfoExpRisco.AgNoc> agNoc;
            @XmlElement(required = true)
            protected List<ESocial.EvtExpRisco.InfoExpRisco.RespReg> respReg;
            protected ESocial.EvtExpRisco.InfoExpRisco.Obs obs;

            /**
             * Obtém o valor da propriedade dtIniCondicao.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtIniCondicao() {
                return dtIniCondicao;
            }

            /**
             * Define o valor da propriedade dtIniCondicao.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtIniCondicao(XMLGregorianCalendar value) {
                this.dtIniCondicao = value;
            }

            /**
             * Obtém o valor da propriedade infoAmb.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.InfoAmb }
             *     
             */
            public ESocial.EvtExpRisco.InfoExpRisco.InfoAmb getInfoAmb() {
                return infoAmb;
            }

            /**
             * Define o valor da propriedade infoAmb.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.InfoAmb }
             *     
             */
            public void setInfoAmb(ESocial.EvtExpRisco.InfoExpRisco.InfoAmb value) {
                this.infoAmb = value;
            }

            /**
             * Obtém o valor da propriedade infoAtiv.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.InfoAtiv }
             *     
             */
            public ESocial.EvtExpRisco.InfoExpRisco.InfoAtiv getInfoAtiv() {
                return infoAtiv;
            }

            /**
             * Define o valor da propriedade infoAtiv.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.InfoAtiv }
             *     
             */
            public void setInfoAtiv(ESocial.EvtExpRisco.InfoExpRisco.InfoAtiv value) {
                this.infoAtiv = value;
            }

            /**
             * Gets the value of the agNoc property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the agNoc property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAgNoc().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtExpRisco.InfoExpRisco.AgNoc }
             * 
             * 
             */
            public List<ESocial.EvtExpRisco.InfoExpRisco.AgNoc> getAgNoc() {
                if (agNoc == null) {
                    agNoc = new ArrayList<ESocial.EvtExpRisco.InfoExpRisco.AgNoc>();
                }
                return this.agNoc;
            }

            /**
             * Gets the value of the respReg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the respReg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRespReg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtExpRisco.InfoExpRisco.RespReg }
             * 
             * 
             */
            public List<ESocial.EvtExpRisco.InfoExpRisco.RespReg> getRespReg() {
                if (respReg == null) {
                    respReg = new ArrayList<ESocial.EvtExpRisco.InfoExpRisco.RespReg>();
                }
                return this.respReg;
            }

            /**
             * Obtém o valor da propriedade obs.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.Obs }
             *     
             */
            public ESocial.EvtExpRisco.InfoExpRisco.Obs getObs() {
                return obs;
            }

            /**
             * Define o valor da propriedade obs.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtExpRisco.InfoExpRisco.Obs }
             *     
             */
            public void setObs(ESocial.EvtExpRisco.InfoExpRisco.Obs value) {
                this.obs = value;
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
             *         &lt;element name="codAgNoc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="9"/>
             *               &lt;pattern value="\d{2}\.\d{2}\.\d{3}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscAgNoc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
             *         &lt;element name="tpAval">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="intConc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;totalDigits value="10"/>
             *               &lt;fractionDigits value="4"/>
             *               &lt;maxInclusive value="999999.9999"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="limTol" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;totalDigits value="10"/>
             *               &lt;fractionDigits value="4"/>
             *               &lt;maxInclusive value="999999.9999"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="unMed" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *               &lt;enumeration value="6"/>
             *               &lt;enumeration value="7"/>
             *               &lt;enumeration value="8"/>
             *               &lt;enumeration value="9"/>
             *               &lt;enumeration value="10"/>
             *               &lt;enumeration value="11"/>
             *               &lt;enumeration value="12"/>
             *               &lt;enumeration value="13"/>
             *               &lt;enumeration value="14"/>
             *               &lt;enumeration value="15"/>
             *               &lt;enumeration value="16"/>
             *               &lt;enumeration value="17"/>
             *               &lt;enumeration value="18"/>
             *               &lt;enumeration value="19"/>
             *               &lt;enumeration value="20"/>
             *               &lt;enumeration value="21"/>
             *               &lt;enumeration value="22"/>
             *               &lt;enumeration value="23"/>
             *               &lt;enumeration value="24"/>
             *               &lt;enumeration value="25"/>
             *               &lt;enumeration value="26"/>
             *               &lt;enumeration value="27"/>
             *               &lt;enumeration value="28"/>
             *               &lt;enumeration value="29"/>
             *               &lt;enumeration value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="tecMedicao" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="40"/>
             *               &lt;pattern value=".*[^\s].*"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="epcEpi">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="utilizEPC">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;enumeration value="0"/>
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="eficEpc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                   &lt;element name="utilizEPI">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;enumeration value="0"/>
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="epi" maxOccurs="50" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="docAval" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
             *                             &lt;element name="dscEPI" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
             *                             &lt;element name="eficEpi" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="epiCompl" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="medProtecao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
             *                             &lt;element name="condFuncto" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
             *                             &lt;element name="usoInint" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
             *                             &lt;element name="przValid" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
             *                             &lt;element name="periodicTroca" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
             *                             &lt;element name="higienizacao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
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
                "codAgNoc",
                "dscAgNoc",
                "tpAval",
                "intConc",
                "limTol",
                "unMed",
                "tecMedicao",
                "epcEpi"
            })
            public static class AgNoc {

                @XmlElement(required = true)
                protected String codAgNoc;
                protected String dscAgNoc;
                protected byte tpAval;
                protected BigDecimal intConc;
                protected BigDecimal limTol;
                protected Byte unMed;
                protected String tecMedicao;
                @XmlElement(required = true)
                protected ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi epcEpi;

                /**
                 * Obtém o valor da propriedade codAgNoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodAgNoc() {
                    return codAgNoc;
                }

                /**
                 * Define o valor da propriedade codAgNoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodAgNoc(String value) {
                    this.codAgNoc = value;
                }

                /**
                 * Obtém o valor da propriedade dscAgNoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscAgNoc() {
                    return dscAgNoc;
                }

                /**
                 * Define o valor da propriedade dscAgNoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscAgNoc(String value) {
                    this.dscAgNoc = value;
                }

                /**
                 * Obtém o valor da propriedade tpAval.
                 * 
                 */
                public byte getTpAval() {
                    return tpAval;
                }

                /**
                 * Define o valor da propriedade tpAval.
                 * 
                 */
                public void setTpAval(byte value) {
                    this.tpAval = value;
                }

                /**
                 * Obtém o valor da propriedade intConc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getIntConc() {
                    return intConc;
                }

                /**
                 * Define o valor da propriedade intConc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setIntConc(BigDecimal value) {
                    this.intConc = value;
                }

                /**
                 * Obtém o valor da propriedade limTol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLimTol() {
                    return limTol;
                }

                /**
                 * Define o valor da propriedade limTol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLimTol(BigDecimal value) {
                    this.limTol = value;
                }

                /**
                 * Obtém o valor da propriedade unMed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getUnMed() {
                    return unMed;
                }

                /**
                 * Define o valor da propriedade unMed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setUnMed(Byte value) {
                    this.unMed = value;
                }

                /**
                 * Obtém o valor da propriedade tecMedicao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTecMedicao() {
                    return tecMedicao;
                }

                /**
                 * Define o valor da propriedade tecMedicao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTecMedicao(String value) {
                    this.tecMedicao = value;
                }

                /**
                 * Obtém o valor da propriedade epcEpi.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi }
                 *     
                 */
                public ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi getEpcEpi() {
                    return epcEpi;
                }

                /**
                 * Define o valor da propriedade epcEpi.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi }
                 *     
                 */
                public void setEpcEpi(ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi value) {
                    this.epcEpi = value;
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
                 *         &lt;element name="utilizEPC">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="0"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="eficEpc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *         &lt;element name="utilizEPI">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="0"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="epi" maxOccurs="50" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="docAval" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
                 *                   &lt;element name="dscEPI" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
                 *                   &lt;element name="eficEpi" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="epiCompl" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="medProtecao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                 *                   &lt;element name="condFuncto" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                 *                   &lt;element name="usoInint" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                 *                   &lt;element name="przValid" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                 *                   &lt;element name="periodicTroca" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                 *                   &lt;element name="higienizacao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
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
                    "utilizEPC",
                    "eficEpc",
                    "utilizEPI",
                    "epi",
                    "epiCompl"
                })
                public static class EpcEpi {

                    protected byte utilizEPC;
                    @XmlSchemaType(name = "string")
                    protected TSSimNao eficEpc;
                    protected byte utilizEPI;
                    protected List<ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.Epi> epi;
                    protected ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.EpiCompl epiCompl;

                    /**
                     * Obtém o valor da propriedade utilizEPC.
                     * 
                     */
                    public byte getUtilizEPC() {
                        return utilizEPC;
                    }

                    /**
                     * Define o valor da propriedade utilizEPC.
                     * 
                     */
                    public void setUtilizEPC(byte value) {
                        this.utilizEPC = value;
                    }

                    /**
                     * Obtém o valor da propriedade eficEpc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getEficEpc() {
                        return eficEpc;
                    }

                    /**
                     * Define o valor da propriedade eficEpc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setEficEpc(TSSimNao value) {
                        this.eficEpc = value;
                    }

                    /**
                     * Obtém o valor da propriedade utilizEPI.
                     * 
                     */
                    public byte getUtilizEPI() {
                        return utilizEPI;
                    }

                    /**
                     * Define o valor da propriedade utilizEPI.
                     * 
                     */
                    public void setUtilizEPI(byte value) {
                        this.utilizEPI = value;
                    }

                    /**
                     * Gets the value of the epi property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the epi property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getEpi().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.Epi }
                     * 
                     * 
                     */
                    public List<ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.Epi> getEpi() {
                        if (epi == null) {
                            epi = new ArrayList<ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.Epi>();
                        }
                        return this.epi;
                    }

                    /**
                     * Obtém o valor da propriedade epiCompl.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.EpiCompl }
                     *     
                     */
                    public ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.EpiCompl getEpiCompl() {
                        return epiCompl;
                    }

                    /**
                     * Define o valor da propriedade epiCompl.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.EpiCompl }
                     *     
                     */
                    public void setEpiCompl(ESocial.EvtExpRisco.InfoExpRisco.AgNoc.EpcEpi.EpiCompl value) {
                        this.epiCompl = value;
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
                     *         &lt;element name="docAval" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
                     *         &lt;element name="dscEPI" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
                     *         &lt;element name="eficEpi" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
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
                        "docAval",
                        "dscEPI",
                        "eficEpi"
                    })
                    public static class Epi {

                        protected String docAval;
                        protected String dscEPI;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao eficEpi;

                        /**
                         * Obtém o valor da propriedade docAval.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDocAval() {
                            return docAval;
                        }

                        /**
                         * Define o valor da propriedade docAval.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDocAval(String value) {
                            this.docAval = value;
                        }

                        /**
                         * Obtém o valor da propriedade dscEPI.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDscEPI() {
                            return dscEPI;
                        }

                        /**
                         * Define o valor da propriedade dscEPI.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDscEPI(String value) {
                            this.dscEPI = value;
                        }

                        /**
                         * Obtém o valor da propriedade eficEpi.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getEficEpi() {
                            return eficEpi;
                        }

                        /**
                         * Define o valor da propriedade eficEpi.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setEficEpi(TSSimNao value) {
                            this.eficEpi = value;
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
                     *         &lt;element name="medProtecao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                     *         &lt;element name="condFuncto" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                     *         &lt;element name="usoInint" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                     *         &lt;element name="przValid" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                     *         &lt;element name="periodicTroca" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
                     *         &lt;element name="higienizacao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao"/>
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
                        "medProtecao",
                        "condFuncto",
                        "usoInint",
                        "przValid",
                        "periodicTroca",
                        "higienizacao"
                    })
                    public static class EpiCompl {

                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao medProtecao;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao condFuncto;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao usoInint;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao przValid;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao periodicTroca;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao higienizacao;

                        /**
                         * Obtém o valor da propriedade medProtecao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getMedProtecao() {
                            return medProtecao;
                        }

                        /**
                         * Define o valor da propriedade medProtecao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setMedProtecao(TSSimNao value) {
                            this.medProtecao = value;
                        }

                        /**
                         * Obtém o valor da propriedade condFuncto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getCondFuncto() {
                            return condFuncto;
                        }

                        /**
                         * Define o valor da propriedade condFuncto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setCondFuncto(TSSimNao value) {
                            this.condFuncto = value;
                        }

                        /**
                         * Obtém o valor da propriedade usoInint.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getUsoInint() {
                            return usoInint;
                        }

                        /**
                         * Define o valor da propriedade usoInint.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setUsoInint(TSSimNao value) {
                            this.usoInint = value;
                        }

                        /**
                         * Obtém o valor da propriedade przValid.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getPrzValid() {
                            return przValid;
                        }

                        /**
                         * Define o valor da propriedade przValid.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setPrzValid(TSSimNao value) {
                            this.przValid = value;
                        }

                        /**
                         * Obtém o valor da propriedade periodicTroca.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getPeriodicTroca() {
                            return periodicTroca;
                        }

                        /**
                         * Define o valor da propriedade periodicTroca.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setPeriodicTroca(TSSimNao value) {
                            this.periodicTroca = value;
                        }

                        /**
                         * Obtém o valor da propriedade higienizacao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getHigienizacao() {
                            return higienizacao;
                        }

                        /**
                         * Define o valor da propriedade higienizacao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setHigienizacao(TSSimNao value) {
                            this.higienizacao = value;
                        }

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
             *         &lt;element name="localAmb">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscSetor" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_100"/>
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_tpInsc_1_3_4"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_nrInsc_12_14"/>
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
                "localAmb",
                "dscSetor",
                "tpInsc",
                "nrInsc"
            })
            public static class InfoAmb {

                protected byte localAmb;
                @XmlElement(required = true)
                protected String dscSetor;
                protected byte tpInsc;
                @XmlElement(required = true)
                protected String nrInsc;

                /**
                 * Obtém o valor da propriedade localAmb.
                 * 
                 */
                public byte getLocalAmb() {
                    return localAmb;
                }

                /**
                 * Define o valor da propriedade localAmb.
                 * 
                 */
                public void setLocalAmb(byte value) {
                    this.localAmb = value;
                }

                /**
                 * Obtém o valor da propriedade dscSetor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscSetor() {
                    return dscSetor;
                }

                /**
                 * Define o valor da propriedade dscSetor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscSetor(String value) {
                    this.dscSetor = value;
                }

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
             *         &lt;element name="dscAtivDes" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
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
                "dscAtivDes"
            })
            public static class InfoAtiv {

                @XmlElement(required = true)
                protected String dscAtivDes;

                /**
                 * Obtém o valor da propriedade dscAtivDes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscAtivDes() {
                    return dscAtivDes;
                }

                /**
                 * Define o valor da propriedade dscAtivDes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscAtivDes(String value) {
                    this.dscAtivDes = value;
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
             *         &lt;element name="obsCompl" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
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
                "obsCompl"
            })
            public static class Obs {

                @XmlElement(required = true)
                protected String obsCompl;

                /**
                 * Obtém o valor da propriedade obsCompl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObsCompl() {
                    return obsCompl;
                }

                /**
                 * Define o valor da propriedade obsCompl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObsCompl(String value) {
                    this.obsCompl = value;
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
             *         &lt;element name="cpfResp" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_cpf"/>
             *         &lt;element name="ideOC">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="9"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscOC" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *               &lt;pattern value=".*[^\s].*"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrOC">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="14"/>
             *               &lt;pattern value=".*[^\s].*"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_uf"/>
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
                "ideOC",
                "dscOC",
                "nrOC",
                "ufOC"
            })
            public static class RespReg {

                @XmlElement(required = true)
                protected String cpfResp;
                protected byte ideOC;
                protected String dscOC;
                @XmlElement(required = true)
                protected String nrOC;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSUf ufOC;

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
                 * Obtém o valor da propriedade ideOC.
                 * 
                 */
                public byte getIdeOC() {
                    return ideOC;
                }

                /**
                 * Define o valor da propriedade ideOC.
                 * 
                 */
                public void setIdeOC(byte value) {
                    this.ideOC = value;
                }

                /**
                 * Obtém o valor da propriedade dscOC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscOC() {
                    return dscOC;
                }

                /**
                 * Define o valor da propriedade dscOC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscOC(String value) {
                    this.dscOC = value;
                }

                /**
                 * Obtém o valor da propriedade nrOC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrOC() {
                    return nrOC;
                }

                /**
                 * Define o valor da propriedade nrOC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrOC(String value) {
                    this.nrOC = value;
                }

                /**
                 * Obtém o valor da propriedade ufOC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSUf }
                 *     
                 */
                public TSUf getUfOC() {
                    return ufOC;
                }

                /**
                 * Define o valor da propriedade ufOC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSUf }
                 *     
                 */
                public void setUfOC(TSUf value) {
                    this.ufOC = value;
                }

            }

        }

    }

}
