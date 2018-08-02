//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.afasttemp;

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
 *         &lt;element name="evtAfastTemp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="11"/>
 *                                   &lt;pattern value="\d{11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nisTrab" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="11"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="matricula" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="codCateg" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="\d{3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoAfastamento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="iniAfastamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIniAfast">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codMotAfast">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="2"/>
 *                                             &lt;pattern value="\d{2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoMesmoMtv" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="[N|S]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="tpAcidTransito" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="observacao" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoAtestado" maxOccurs="9" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codCID" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="\w{3,4}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="qtdDiasAfast">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;pattern value="\d{1,3}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="emitente" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="nmEmit">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="70"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="ideOC">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                 &lt;pattern value="\d"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrOc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;whiteSpace value="preserve"/>
 *                                                                 &lt;minLength value="3"/>
 *                                                                 &lt;maxLength value="14"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="ufOC" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value="AC"/>
 *                                                                 &lt;enumeration value="AL"/>
 *                                                                 &lt;enumeration value="AP"/>
 *                                                                 &lt;enumeration value="AM"/>
 *                                                                 &lt;enumeration value="BA"/>
 *                                                                 &lt;enumeration value="CE"/>
 *                                                                 &lt;enumeration value="DF"/>
 *                                                                 &lt;enumeration value="ES"/>
 *                                                                 &lt;enumeration value="GO"/>
 *                                                                 &lt;enumeration value="MA"/>
 *                                                                 &lt;enumeration value="MT"/>
 *                                                                 &lt;enumeration value="MS"/>
 *                                                                 &lt;enumeration value="MG"/>
 *                                                                 &lt;enumeration value="PA"/>
 *                                                                 &lt;enumeration value="PB"/>
 *                                                                 &lt;enumeration value="PR"/>
 *                                                                 &lt;enumeration value="PE"/>
 *                                                                 &lt;enumeration value="PI"/>
 *                                                                 &lt;enumeration value="RJ"/>
 *                                                                 &lt;enumeration value="RN"/>
 *                                                                 &lt;enumeration value="RS"/>
 *                                                                 &lt;enumeration value="RO"/>
 *                                                                 &lt;enumeration value="RR"/>
 *                                                                 &lt;enumeration value="SC"/>
 *                                                                 &lt;enumeration value="SP"/>
 *                                                                 &lt;enumeration value="SE"/>
 *                                                                 &lt;enumeration value="TO"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
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
 *                                       &lt;element name="infoCessao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjCess">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="14"/>
 *                                                       &lt;pattern value="\d{8,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infOnus">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoMandSind" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjSind">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="14"/>
 *                                                       &lt;pattern value="\d{8,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infOnusRemun">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
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
 *                             &lt;element name="infoRetif" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="origRetif">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="tpProc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrProc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="21"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fimAfastamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtTermAfast">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
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
    "evtAfastTemp",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
    protected ESocial.EvtAfastTemp evtAfastTemp;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAfastTemp.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAfastTemp }
     *     
     */
    public ESocial.EvtAfastTemp getEvtAfastTemp() {
        return evtAfastTemp;
    }

    /**
     * Define o valor da propriedade evtAfastTemp.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAfastTemp }
     *     
     */
    public void setEvtAfastTemp(ESocial.EvtAfastTemp value) {
        this.evtAfastTemp = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="11"/>
     *                         &lt;pattern value="\d{11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nisTrab" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="11"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="matricula" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="codCateg" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="\d{3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoAfastamento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="iniAfastamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIniAfast">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codMotAfast">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="2"/>
     *                                   &lt;pattern value="\d{2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="infoMesmoMtv" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="[N|S]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="tpAcidTransito" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="observacao" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="255"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="infoAtestado" maxOccurs="9" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codCID" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="\w{3,4}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="qtdDiasAfast">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;pattern value="\d{1,3}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="emitente" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="nmEmit">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="70"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="ideOC">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                       &lt;pattern value="\d"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nrOc">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;whiteSpace value="preserve"/>
     *                                                       &lt;minLength value="3"/>
     *                                                       &lt;maxLength value="14"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="ufOC" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;enumeration value="AC"/>
     *                                                       &lt;enumeration value="AL"/>
     *                                                       &lt;enumeration value="AP"/>
     *                                                       &lt;enumeration value="AM"/>
     *                                                       &lt;enumeration value="BA"/>
     *                                                       &lt;enumeration value="CE"/>
     *                                                       &lt;enumeration value="DF"/>
     *                                                       &lt;enumeration value="ES"/>
     *                                                       &lt;enumeration value="GO"/>
     *                                                       &lt;enumeration value="MA"/>
     *                                                       &lt;enumeration value="MT"/>
     *                                                       &lt;enumeration value="MS"/>
     *                                                       &lt;enumeration value="MG"/>
     *                                                       &lt;enumeration value="PA"/>
     *                                                       &lt;enumeration value="PB"/>
     *                                                       &lt;enumeration value="PR"/>
     *                                                       &lt;enumeration value="PE"/>
     *                                                       &lt;enumeration value="PI"/>
     *                                                       &lt;enumeration value="RJ"/>
     *                                                       &lt;enumeration value="RN"/>
     *                                                       &lt;enumeration value="RS"/>
     *                                                       &lt;enumeration value="RO"/>
     *                                                       &lt;enumeration value="RR"/>
     *                                                       &lt;enumeration value="SC"/>
     *                                                       &lt;enumeration value="SP"/>
     *                                                       &lt;enumeration value="SE"/>
     *                                                       &lt;enumeration value="TO"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
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
     *                             &lt;element name="infoCessao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjCess">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="14"/>
     *                                             &lt;pattern value="\d{8,14}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="infOnus">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoMandSind" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjSind">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="14"/>
     *                                             &lt;pattern value="\d{8,14}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="infOnusRemun">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
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
     *                   &lt;element name="infoRetif" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="origRetif">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="tpProc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrProc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="21"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fimAfastamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtTermAfast">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
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
        "ideVinculo",
        "infoAfastamento"
    })
    public static class EvtAfastTemp {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
        protected ESocial.EvtAfastTemp.IdeVinculo ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
        protected ESocial.EvtAfastTemp.InfoAfastamento infoAfastamento;
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
         *     {@link TIdeEveTrab }
         *     
         */
        public TIdeEveTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEveTrab }
         *     
         */
        public void setIdeEvento(TIdeEveTrab value) {
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
         * Obtém o valor da propriedade ideVinculo.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAfastTemp.IdeVinculo }
         *     
         */
        public ESocial.EvtAfastTemp.IdeVinculo getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAfastTemp.IdeVinculo }
         *     
         */
        public void setIdeVinculo(ESocial.EvtAfastTemp.IdeVinculo value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoAfastamento.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAfastTemp.InfoAfastamento }
         *     
         */
        public ESocial.EvtAfastTemp.InfoAfastamento getInfoAfastamento() {
            return infoAfastamento;
        }

        /**
         * Define o valor da propriedade infoAfastamento.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAfastTemp.InfoAfastamento }
         *     
         */
        public void setInfoAfastamento(ESocial.EvtAfastTemp.InfoAfastamento value) {
            this.infoAfastamento = value;
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
         *         &lt;element name="cpfTrab">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="11"/>
         *               &lt;pattern value="\d{11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nisTrab" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="11"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="matricula" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="codCateg" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;pattern value="\d{3}"/>
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
            "cpfTrab",
            "nisTrab",
            "matricula",
            "codCateg"
        })
        public static class IdeVinculo {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
            protected String cpfTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
            protected String nisTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
            protected String matricula;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
            protected BigInteger codCateg;

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

            /**
             * Obtém o valor da propriedade nisTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNisTrab() {
                return nisTrab;
            }

            /**
             * Define o valor da propriedade nisTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNisTrab(String value) {
                this.nisTrab = value;
            }

            /**
             * Obtém o valor da propriedade matricula.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatricula() {
                return matricula;
            }

            /**
             * Define o valor da propriedade matricula.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatricula(String value) {
                this.matricula = value;
            }

            /**
             * Obtém o valor da propriedade codCateg.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodCateg() {
                return codCateg;
            }

            /**
             * Define o valor da propriedade codCateg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodCateg(BigInteger value) {
                this.codCateg = value;
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
         *         &lt;element name="iniAfastamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIniAfast">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codMotAfast">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="2"/>
         *                         &lt;pattern value="\d{2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infoMesmoMtv" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="[N|S]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="tpAcidTransito" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="observacao" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="255"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infoAtestado" maxOccurs="9" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codCID" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="\w{3,4}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="qtdDiasAfast">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;pattern value="\d{1,3}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="emitente" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="nmEmit">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="70"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="ideOC">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                             &lt;pattern value="\d"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nrOc">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;whiteSpace value="preserve"/>
         *                                             &lt;minLength value="3"/>
         *                                             &lt;maxLength value="14"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="ufOC" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;enumeration value="AC"/>
         *                                             &lt;enumeration value="AL"/>
         *                                             &lt;enumeration value="AP"/>
         *                                             &lt;enumeration value="AM"/>
         *                                             &lt;enumeration value="BA"/>
         *                                             &lt;enumeration value="CE"/>
         *                                             &lt;enumeration value="DF"/>
         *                                             &lt;enumeration value="ES"/>
         *                                             &lt;enumeration value="GO"/>
         *                                             &lt;enumeration value="MA"/>
         *                                             &lt;enumeration value="MT"/>
         *                                             &lt;enumeration value="MS"/>
         *                                             &lt;enumeration value="MG"/>
         *                                             &lt;enumeration value="PA"/>
         *                                             &lt;enumeration value="PB"/>
         *                                             &lt;enumeration value="PR"/>
         *                                             &lt;enumeration value="PE"/>
         *                                             &lt;enumeration value="PI"/>
         *                                             &lt;enumeration value="RJ"/>
         *                                             &lt;enumeration value="RN"/>
         *                                             &lt;enumeration value="RS"/>
         *                                             &lt;enumeration value="RO"/>
         *                                             &lt;enumeration value="RR"/>
         *                                             &lt;enumeration value="SC"/>
         *                                             &lt;enumeration value="SP"/>
         *                                             &lt;enumeration value="SE"/>
         *                                             &lt;enumeration value="TO"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
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
         *                   &lt;element name="infoCessao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjCess">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="14"/>
         *                                   &lt;pattern value="\d{8,14}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="infOnus">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoMandSind" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjSind">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="14"/>
         *                                   &lt;pattern value="\d{8,14}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="infOnusRemun">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
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
         *         &lt;element name="infoRetif" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="origRetif">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="tpProc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrProc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="21"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fimAfastamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtTermAfast">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
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
            "iniAfastamento",
            "infoRetif",
            "fimAfastamento"
        })
        public static class InfoAfastamento {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
            protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento iniAfastamento;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
            protected ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif infoRetif;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
            protected ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento fimAfastamento;

            /**
             * Obtém o valor da propriedade iniAfastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento }
             *     
             */
            public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento getIniAfastamento() {
                return iniAfastamento;
            }

            /**
             * Define o valor da propriedade iniAfastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento }
             *     
             */
            public void setIniAfastamento(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento value) {
                this.iniAfastamento = value;
            }

            /**
             * Obtém o valor da propriedade infoRetif.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif }
             *     
             */
            public ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif getInfoRetif() {
                return infoRetif;
            }

            /**
             * Define o valor da propriedade infoRetif.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif }
             *     
             */
            public void setInfoRetif(ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif value) {
                this.infoRetif = value;
            }

            /**
             * Obtém o valor da propriedade fimAfastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento }
             *     
             */
            public ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento getFimAfastamento() {
                return fimAfastamento;
            }

            /**
             * Define o valor da propriedade fimAfastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento }
             *     
             */
            public void setFimAfastamento(ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento value) {
                this.fimAfastamento = value;
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
             *         &lt;element name="dtTermAfast">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
                "dtTermAfast"
            })
            public static class FimAfastamento {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                protected XMLGregorianCalendar dtTermAfast;

                /**
                 * Obtém o valor da propriedade dtTermAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTermAfast() {
                    return dtTermAfast;
                }

                /**
                 * Define o valor da propriedade dtTermAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTermAfast(XMLGregorianCalendar value) {
                    this.dtTermAfast = value;
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
             *         &lt;element name="origRetif">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="tpProc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrProc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="21"/>
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
                "origRetif",
                "tpProc",
                "nrProc"
            })
            public static class InfoRetif {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected byte origRetif;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected Byte tpProc;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected String nrProc;

                /**
                 * Obtém o valor da propriedade origRetif.
                 * 
                 */
                public byte getOrigRetif() {
                    return origRetif;
                }

                /**
                 * Define o valor da propriedade origRetif.
                 * 
                 */
                public void setOrigRetif(byte value) {
                    this.origRetif = value;
                }

                /**
                 * Obtém o valor da propriedade tpProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTpProc() {
                    return tpProc;
                }

                /**
                 * Define o valor da propriedade tpProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTpProc(Byte value) {
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
             *         &lt;element name="dtIniAfast">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codMotAfast">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="2"/>
             *               &lt;pattern value="\d{2}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infoMesmoMtv" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="[N|S]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="tpAcidTransito" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="observacao" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="255"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infoAtestado" maxOccurs="9" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codCID" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="\w{3,4}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="qtdDiasAfast">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;pattern value="\d{1,3}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="emitente" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="nmEmit">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="70"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="ideOC">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                   &lt;pattern value="\d"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nrOc">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;whiteSpace value="preserve"/>
             *                                   &lt;minLength value="3"/>
             *                                   &lt;maxLength value="14"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="ufOC" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;enumeration value="AC"/>
             *                                   &lt;enumeration value="AL"/>
             *                                   &lt;enumeration value="AP"/>
             *                                   &lt;enumeration value="AM"/>
             *                                   &lt;enumeration value="BA"/>
             *                                   &lt;enumeration value="CE"/>
             *                                   &lt;enumeration value="DF"/>
             *                                   &lt;enumeration value="ES"/>
             *                                   &lt;enumeration value="GO"/>
             *                                   &lt;enumeration value="MA"/>
             *                                   &lt;enumeration value="MT"/>
             *                                   &lt;enumeration value="MS"/>
             *                                   &lt;enumeration value="MG"/>
             *                                   &lt;enumeration value="PA"/>
             *                                   &lt;enumeration value="PB"/>
             *                                   &lt;enumeration value="PR"/>
             *                                   &lt;enumeration value="PE"/>
             *                                   &lt;enumeration value="PI"/>
             *                                   &lt;enumeration value="RJ"/>
             *                                   &lt;enumeration value="RN"/>
             *                                   &lt;enumeration value="RS"/>
             *                                   &lt;enumeration value="RO"/>
             *                                   &lt;enumeration value="RR"/>
             *                                   &lt;enumeration value="SC"/>
             *                                   &lt;enumeration value="SP"/>
             *                                   &lt;enumeration value="SE"/>
             *                                   &lt;enumeration value="TO"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
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
             *         &lt;element name="infoCessao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjCess">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="14"/>
             *                         &lt;pattern value="\d{8,14}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="infOnus">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoMandSind" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjSind">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="14"/>
             *                         &lt;pattern value="\d{8,14}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="infOnusRemun">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
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
                "dtIniAfast",
                "codMotAfast",
                "infoMesmoMtv",
                "tpAcidTransito",
                "observacao",
                "infoAtestado",
                "infoCessao",
                "infoMandSind"
            })
            public static class IniAfastamento {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                protected XMLGregorianCalendar dtIniAfast;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                protected String codMotAfast;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected String infoMesmoMtv;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected Byte tpAcidTransito;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected String observacao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected List<ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado> infoAtestado;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao infoCessao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind infoMandSind;

                /**
                 * Obtém o valor da propriedade dtIniAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIniAfast() {
                    return dtIniAfast;
                }

                /**
                 * Define o valor da propriedade dtIniAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIniAfast(XMLGregorianCalendar value) {
                    this.dtIniAfast = value;
                }

                /**
                 * Obtém o valor da propriedade codMotAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodMotAfast() {
                    return codMotAfast;
                }

                /**
                 * Define o valor da propriedade codMotAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodMotAfast(String value) {
                    this.codMotAfast = value;
                }

                /**
                 * Obtém o valor da propriedade infoMesmoMtv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInfoMesmoMtv() {
                    return infoMesmoMtv;
                }

                /**
                 * Define o valor da propriedade infoMesmoMtv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInfoMesmoMtv(String value) {
                    this.infoMesmoMtv = value;
                }

                /**
                 * Obtém o valor da propriedade tpAcidTransito.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTpAcidTransito() {
                    return tpAcidTransito;
                }

                /**
                 * Define o valor da propriedade tpAcidTransito.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTpAcidTransito(Byte value) {
                    this.tpAcidTransito = value;
                }

                /**
                 * Obtém o valor da propriedade observacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObservacao() {
                    return observacao;
                }

                /**
                 * Define o valor da propriedade observacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObservacao(String value) {
                    this.observacao = value;
                }

                /**
                 * Gets the value of the infoAtestado property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoAtestado property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoAtestado().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado }
                 * 
                 * 
                 */
                public List<ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado> getInfoAtestado() {
                    if (infoAtestado == null) {
                        infoAtestado = new ArrayList<ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado>();
                    }
                    return this.infoAtestado;
                }

                /**
                 * Obtém o valor da propriedade infoCessao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao }
                 *     
                 */
                public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao getInfoCessao() {
                    return infoCessao;
                }

                /**
                 * Define o valor da propriedade infoCessao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao }
                 *     
                 */
                public void setInfoCessao(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao value) {
                    this.infoCessao = value;
                }

                /**
                 * Obtém o valor da propriedade infoMandSind.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind }
                 *     
                 */
                public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind getInfoMandSind() {
                    return infoMandSind;
                }

                /**
                 * Define o valor da propriedade infoMandSind.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind }
                 *     
                 */
                public void setInfoMandSind(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind value) {
                    this.infoMandSind = value;
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
                 *         &lt;element name="codCID" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="\w{3,4}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="qtdDiasAfast">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;pattern value="\d{1,3}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="emitente" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nmEmit">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="70"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="ideOC">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;pattern value="\d"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nrOc">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;minLength value="3"/>
                 *                         &lt;maxLength value="14"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="ufOC" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;enumeration value="AC"/>
                 *                         &lt;enumeration value="AL"/>
                 *                         &lt;enumeration value="AP"/>
                 *                         &lt;enumeration value="AM"/>
                 *                         &lt;enumeration value="BA"/>
                 *                         &lt;enumeration value="CE"/>
                 *                         &lt;enumeration value="DF"/>
                 *                         &lt;enumeration value="ES"/>
                 *                         &lt;enumeration value="GO"/>
                 *                         &lt;enumeration value="MA"/>
                 *                         &lt;enumeration value="MT"/>
                 *                         &lt;enumeration value="MS"/>
                 *                         &lt;enumeration value="MG"/>
                 *                         &lt;enumeration value="PA"/>
                 *                         &lt;enumeration value="PB"/>
                 *                         &lt;enumeration value="PR"/>
                 *                         &lt;enumeration value="PE"/>
                 *                         &lt;enumeration value="PI"/>
                 *                         &lt;enumeration value="RJ"/>
                 *                         &lt;enumeration value="RN"/>
                 *                         &lt;enumeration value="RS"/>
                 *                         &lt;enumeration value="RO"/>
                 *                         &lt;enumeration value="RR"/>
                 *                         &lt;enumeration value="SC"/>
                 *                         &lt;enumeration value="SP"/>
                 *                         &lt;enumeration value="SE"/>
                 *                         &lt;enumeration value="TO"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
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
                    "codCID",
                    "qtdDiasAfast",
                    "emitente"
                })
                public static class InfoAtestado {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                    protected String codCID;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                    protected BigInteger qtdDiasAfast;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                    protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado.Emitente emitente;

                    /**
                     * Obtém o valor da propriedade codCID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodCID() {
                        return codCID;
                    }

                    /**
                     * Define o valor da propriedade codCID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodCID(String value) {
                        this.codCID = value;
                    }

                    /**
                     * Obtém o valor da propriedade qtdDiasAfast.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQtdDiasAfast() {
                        return qtdDiasAfast;
                    }

                    /**
                     * Define o valor da propriedade qtdDiasAfast.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQtdDiasAfast(BigInteger value) {
                        this.qtdDiasAfast = value;
                    }

                    /**
                     * Obtém o valor da propriedade emitente.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado.Emitente }
                     *     
                     */
                    public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado.Emitente getEmitente() {
                        return emitente;
                    }

                    /**
                     * Define o valor da propriedade emitente.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado.Emitente }
                     *     
                     */
                    public void setEmitente(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoAtestado.Emitente value) {
                        this.emitente = value;
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
                     *         &lt;element name="nmEmit">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="70"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="ideOC">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;pattern value="\d"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nrOc">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;minLength value="3"/>
                     *               &lt;maxLength value="14"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="ufOC" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;enumeration value="AC"/>
                     *               &lt;enumeration value="AL"/>
                     *               &lt;enumeration value="AP"/>
                     *               &lt;enumeration value="AM"/>
                     *               &lt;enumeration value="BA"/>
                     *               &lt;enumeration value="CE"/>
                     *               &lt;enumeration value="DF"/>
                     *               &lt;enumeration value="ES"/>
                     *               &lt;enumeration value="GO"/>
                     *               &lt;enumeration value="MA"/>
                     *               &lt;enumeration value="MT"/>
                     *               &lt;enumeration value="MS"/>
                     *               &lt;enumeration value="MG"/>
                     *               &lt;enumeration value="PA"/>
                     *               &lt;enumeration value="PB"/>
                     *               &lt;enumeration value="PR"/>
                     *               &lt;enumeration value="PE"/>
                     *               &lt;enumeration value="PI"/>
                     *               &lt;enumeration value="RJ"/>
                     *               &lt;enumeration value="RN"/>
                     *               &lt;enumeration value="RS"/>
                     *               &lt;enumeration value="RO"/>
                     *               &lt;enumeration value="RR"/>
                     *               &lt;enumeration value="SC"/>
                     *               &lt;enumeration value="SP"/>
                     *               &lt;enumeration value="SE"/>
                     *               &lt;enumeration value="TO"/>
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
                        "nmEmit",
                        "ideOC",
                        "nrOc",
                        "ufOC"
                    })
                    public static class Emitente {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                        protected String nmEmit;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                        protected byte ideOC;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                        protected String nrOc;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                        protected String ufOC;

                        /**
                         * Obtém o valor da propriedade nmEmit.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmEmit() {
                            return nmEmit;
                        }

                        /**
                         * Define o valor da propriedade nmEmit.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmEmit(String value) {
                            this.nmEmit = value;
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
                         * Obtém o valor da propriedade nrOc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrOc() {
                            return nrOc;
                        }

                        /**
                         * Define o valor da propriedade nrOc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrOc(String value) {
                            this.nrOc = value;
                        }

                        /**
                         * Obtém o valor da propriedade ufOC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUfOC() {
                            return ufOC;
                        }

                        /**
                         * Define o valor da propriedade ufOC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUfOC(String value) {
                            this.ufOC = value;
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
                 *         &lt;element name="cnpjCess">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="14"/>
                 *               &lt;pattern value="\d{8,14}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infOnus">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
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
                    "cnpjCess",
                    "infOnus"
                })
                public static class InfoCessao {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                    protected String cnpjCess;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                    protected byte infOnus;

                    /**
                     * Obtém o valor da propriedade cnpjCess.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjCess() {
                        return cnpjCess;
                    }

                    /**
                     * Define o valor da propriedade cnpjCess.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjCess(String value) {
                        this.cnpjCess = value;
                    }

                    /**
                     * Obtém o valor da propriedade infOnus.
                     * 
                     */
                    public byte getInfOnus() {
                        return infOnus;
                    }

                    /**
                     * Define o valor da propriedade infOnus.
                     * 
                     */
                    public void setInfOnus(byte value) {
                        this.infOnus = value;
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
                 *         &lt;element name="cnpjSind">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="14"/>
                 *               &lt;pattern value="\d{8,14}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infOnusRemun">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
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
                    "cnpjSind",
                    "infOnusRemun"
                })
                public static class InfoMandSind {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02", required = true)
                    protected String cnpjSind;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAfastTemp/v02_04_02")
                    protected byte infOnusRemun;

                    /**
                     * Obtém o valor da propriedade cnpjSind.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjSind() {
                        return cnpjSind;
                    }

                    /**
                     * Define o valor da propriedade cnpjSind.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjSind(String value) {
                        this.cnpjSind = value;
                    }

                    /**
                     * Obtém o valor da propriedade infOnusRemun.
                     * 
                     */
                    public byte getInfOnusRemun() {
                        return infOnusRemun;
                    }

                    /**
                     * Define o valor da propriedade infOnusRemun.
                     * 
                     */
                    public void setInfOnusRemun(byte value) {
                        this.infOnusRemun = value;
                    }

                }

            }

        }

    }

}
