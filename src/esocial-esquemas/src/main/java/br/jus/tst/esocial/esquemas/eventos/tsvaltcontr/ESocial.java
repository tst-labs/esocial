//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvaltcontr;

import java.math.BigDecimal;
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
 *         &lt;element name="evtTSVAltContr">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideTrabSemVinculo">
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
 *                             &lt;element name="codCateg">
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
 *                   &lt;element name="infoTSVAlteracao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAlteracao">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="natAtividade" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *                                                 &lt;element name="codCargo">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="codFuncao" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TRemun" minOccurs="0"/>
 *                                       &lt;element name="infoEstagiario" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="natEstagio">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nivEstagio">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="areaAtuacao" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nrApol" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrBolsa" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;totalDigits value="14"/>
 *                                                       &lt;fractionDigits value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dtPrevTerm">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="instEnsino">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cnpjInstEnsino" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="14"/>
 *                                                                 &lt;pattern value="\d{8,14}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nmRazao">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="100"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="dscLograd" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="80"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrLograd" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="10"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="bairro" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="cep" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{8}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="codMunic" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="uf" minOccurs="0">
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
 *                                                 &lt;element name="ageIntegracao" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cnpjAgntInteg">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="14"/>
 *                                                                 &lt;pattern value="\d{8,14}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nmRazao">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="100"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="dscLograd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="80"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrLograd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="10"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="bairro" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="cep">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{8}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="codMunic" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="uf">
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
 *                                                 &lt;element name="supervisorEstagio" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cpfSupervisor">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="11"/>
 *                                                                 &lt;pattern value="\d{11}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nmSuperv">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="70"/>
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
    "evtTSVAltContr",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
    protected ESocial.EvtTSVAltContr evtTSVAltContr;
    @XmlElement(name = "Signature", required = true)
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideTrabSemVinculo">
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
     *                   &lt;element name="codCateg">
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
     *         &lt;element name="infoTSVAlteracao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAlteracao">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="natAtividade" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
     *                                       &lt;element name="codCargo">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="codFuncao" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TRemun" minOccurs="0"/>
     *                             &lt;element name="infoEstagiario" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="natEstagio">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nivEstagio">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="areaAtuacao" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;whiteSpace value="preserve"/>
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nrApol" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;whiteSpace value="preserve"/>
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="vlrBolsa" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;totalDigits value="14"/>
     *                                             &lt;fractionDigits value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dtPrevTerm">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="instEnsino">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cnpjInstEnsino" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;length value="14"/>
     *                                                       &lt;pattern value="\d{8,14}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nmRazao">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="100"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="dscLograd" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="80"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nrLograd" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="10"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="bairro" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="cep" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{8}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="codMunic" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="uf" minOccurs="0">
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
     *                                       &lt;element name="ageIntegracao" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cnpjAgntInteg">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;length value="14"/>
     *                                                       &lt;pattern value="\d{8,14}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nmRazao">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="100"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="dscLograd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="80"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nrLograd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="10"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="bairro" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="cep">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{8}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="codMunic" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="uf">
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
     *                                       &lt;element name="supervisorEstagio" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cpfSupervisor">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;length value="11"/>
     *                                                       &lt;pattern value="\d{11}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nmSuperv">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="70"/>
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
        "ideTrabSemVinculo",
        "infoTSVAlteracao"
    })
    public static class EvtTSVAltContr {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
        protected ESocial.EvtTSVAltContr.IdeTrabSemVinculo ideTrabSemVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
        protected ESocial.EvtTSVAltContr.InfoTSVAlteracao infoTSVAlteracao;
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
         * Obtém o valor da propriedade ideTrabSemVinculo.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTSVAltContr.IdeTrabSemVinculo }
         *     
         */
        public ESocial.EvtTSVAltContr.IdeTrabSemVinculo getIdeTrabSemVinculo() {
            return ideTrabSemVinculo;
        }

        /**
         * Define o valor da propriedade ideTrabSemVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTSVAltContr.IdeTrabSemVinculo }
         *     
         */
        public void setIdeTrabSemVinculo(ESocial.EvtTSVAltContr.IdeTrabSemVinculo value) {
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
         *         &lt;element name="codCateg">
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
            "codCateg"
        })
        public static class IdeTrabSemVinculo {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
            protected String cpfTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
            protected String nisTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
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
         *         &lt;element name="dtAlteracao">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="natAtividade" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
         *                             &lt;element name="codCargo">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="codFuncao" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TRemun" minOccurs="0"/>
         *                   &lt;element name="infoEstagiario" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="natEstagio">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nivEstagio">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="areaAtuacao" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nrApol" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="vlrBolsa" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;totalDigits value="14"/>
         *                                   &lt;fractionDigits value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dtPrevTerm">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="instEnsino">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cnpjInstEnsino" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;length value="14"/>
         *                                             &lt;pattern value="\d{8,14}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nmRazao">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="100"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="dscLograd" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="80"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nrLograd" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="10"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="bairro" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="cep" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{8}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="codMunic" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="uf" minOccurs="0">
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
         *                             &lt;element name="ageIntegracao" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cnpjAgntInteg">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;length value="14"/>
         *                                             &lt;pattern value="\d{8,14}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nmRazao">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="100"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="dscLograd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="80"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nrLograd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="10"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="bairro" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="cep">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{8}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="codMunic" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="uf">
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
         *                             &lt;element name="supervisorEstagio" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cpfSupervisor">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;length value="11"/>
         *                                             &lt;pattern value="\d{11}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nmSuperv">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="70"/>
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

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
            protected XMLGregorianCalendar dtAlteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
            protected Byte natAtividade;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
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
             *                   &lt;element name="codCargo">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="codFuncao" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02}TRemun" minOccurs="0"/>
             *         &lt;element name="infoEstagiario" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="natEstagio">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nivEstagio">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="areaAtuacao" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nrApol" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="vlrBolsa" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;totalDigits value="14"/>
             *                         &lt;fractionDigits value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dtPrevTerm">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="instEnsino">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cnpjInstEnsino" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;length value="14"/>
             *                                   &lt;pattern value="\d{8,14}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nmRazao">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="100"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="dscLograd" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="80"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nrLograd" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="10"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="bairro" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="cep" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{8}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="codMunic" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="uf" minOccurs="0">
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
             *                   &lt;element name="ageIntegracao" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cnpjAgntInteg">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;length value="14"/>
             *                                   &lt;pattern value="\d{8,14}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nmRazao">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="100"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="dscLograd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="80"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nrLograd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="10"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="bairro" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="cep">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{8}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="codMunic" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="uf">
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
             *                   &lt;element name="supervisorEstagio" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cpfSupervisor">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;length value="11"/>
             *                                   &lt;pattern value="\d{11}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nmSuperv">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="70"/>
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
                "infoEstagiario"
            })
            public static class InfoComplementares {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.CargoFuncao cargoFuncao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                protected TRemun remuneracao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario infoEstagiario;

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
                 *     {@link TRemun }
                 *     
                 */
                public TRemun getRemuneracao() {
                    return remuneracao;
                }

                /**
                 * Define o valor da propriedade remuneracao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRemun }
                 *     
                 */
                public void setRemuneracao(TRemun value) {
                    this.remuneracao = value;
                }

                /**
                 * Obtém o valor da propriedade infoEstagiario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario }
                 *     
                 */
                public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario getInfoEstagiario() {
                    return infoEstagiario;
                }

                /**
                 * Define o valor da propriedade infoEstagiario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario }
                 *     
                 */
                public void setInfoEstagiario(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario value) {
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
                 *         &lt;element name="codCargo">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="codFuncao" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
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
                    "codCargo",
                    "codFuncao"
                })
                public static class CargoFuncao {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                    protected String codCargo;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                    protected String codFuncao;

                    /**
                     * Obtém o valor da propriedade codCargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodCargo() {
                        return codCargo;
                    }

                    /**
                     * Define o valor da propriedade codCargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodCargo(String value) {
                        this.codCargo = value;
                    }

                    /**
                     * Obtém o valor da propriedade codFuncao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodFuncao() {
                        return codFuncao;
                    }

                    /**
                     * Define o valor da propriedade codFuncao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodFuncao(String value) {
                        this.codFuncao = value;
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
                 *         &lt;element name="natEstagio">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nivEstagio">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="areaAtuacao" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nrApol" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vlrBolsa" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;totalDigits value="14"/>
                 *               &lt;fractionDigits value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtPrevTerm">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="instEnsino">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cnpjInstEnsino" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;length value="14"/>
                 *                         &lt;pattern value="\d{8,14}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nmRazao">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="100"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="dscLograd" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="80"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nrLograd" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="10"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="bairro" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="cep" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{8}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="codMunic" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="uf" minOccurs="0">
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
                 *         &lt;element name="ageIntegracao" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cnpjAgntInteg">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;length value="14"/>
                 *                         &lt;pattern value="\d{8,14}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nmRazao">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="100"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="dscLograd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="80"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nrLograd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="10"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="bairro" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="cep">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{8}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="codMunic" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="uf">
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
                 *         &lt;element name="supervisorEstagio" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cpfSupervisor">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;length value="11"/>
                 *                         &lt;pattern value="\d{11}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nmSuperv">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="70"/>
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
                    "natEstagio",
                    "nivEstagio",
                    "areaAtuacao",
                    "nrApol",
                    "vlrBolsa",
                    "dtPrevTerm",
                    "instEnsino",
                    "ageIntegracao",
                    "supervisorEstagio"
                })
                public static class InfoEstagiario {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                    protected String natEstagio;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                    protected byte nivEstagio;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                    protected String areaAtuacao;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                    protected String nrApol;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                    protected BigDecimal vlrBolsa;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                    protected XMLGregorianCalendar dtPrevTerm;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                    protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.InstEnsino instEnsino;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                    protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.AgeIntegracao ageIntegracao;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                    protected ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.SupervisorEstagio supervisorEstagio;

                    /**
                     * Obtém o valor da propriedade natEstagio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNatEstagio() {
                        return natEstagio;
                    }

                    /**
                     * Define o valor da propriedade natEstagio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNatEstagio(String value) {
                        this.natEstagio = value;
                    }

                    /**
                     * Obtém o valor da propriedade nivEstagio.
                     * 
                     */
                    public byte getNivEstagio() {
                        return nivEstagio;
                    }

                    /**
                     * Define o valor da propriedade nivEstagio.
                     * 
                     */
                    public void setNivEstagio(byte value) {
                        this.nivEstagio = value;
                    }

                    /**
                     * Obtém o valor da propriedade areaAtuacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAreaAtuacao() {
                        return areaAtuacao;
                    }

                    /**
                     * Define o valor da propriedade areaAtuacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAreaAtuacao(String value) {
                        this.areaAtuacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrApol.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrApol() {
                        return nrApol;
                    }

                    /**
                     * Define o valor da propriedade nrApol.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrApol(String value) {
                        this.nrApol = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrBolsa.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrBolsa() {
                        return vlrBolsa;
                    }

                    /**
                     * Define o valor da propriedade vlrBolsa.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrBolsa(BigDecimal value) {
                        this.vlrBolsa = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtPrevTerm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtPrevTerm() {
                        return dtPrevTerm;
                    }

                    /**
                     * Define o valor da propriedade dtPrevTerm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtPrevTerm(XMLGregorianCalendar value) {
                        this.dtPrevTerm = value;
                    }

                    /**
                     * Obtém o valor da propriedade instEnsino.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.InstEnsino }
                     *     
                     */
                    public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.InstEnsino getInstEnsino() {
                        return instEnsino;
                    }

                    /**
                     * Define o valor da propriedade instEnsino.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.InstEnsino }
                     *     
                     */
                    public void setInstEnsino(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.InstEnsino value) {
                        this.instEnsino = value;
                    }

                    /**
                     * Obtém o valor da propriedade ageIntegracao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.AgeIntegracao }
                     *     
                     */
                    public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.AgeIntegracao getAgeIntegracao() {
                        return ageIntegracao;
                    }

                    /**
                     * Define o valor da propriedade ageIntegracao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.AgeIntegracao }
                     *     
                     */
                    public void setAgeIntegracao(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.AgeIntegracao value) {
                        this.ageIntegracao = value;
                    }

                    /**
                     * Obtém o valor da propriedade supervisorEstagio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.SupervisorEstagio }
                     *     
                     */
                    public ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.SupervisorEstagio getSupervisorEstagio() {
                        return supervisorEstagio;
                    }

                    /**
                     * Define o valor da propriedade supervisorEstagio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.SupervisorEstagio }
                     *     
                     */
                    public void setSupervisorEstagio(ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoEstagiario.SupervisorEstagio value) {
                        this.supervisorEstagio = value;
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
                     *         &lt;element name="cnpjAgntInteg">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;length value="14"/>
                     *               &lt;pattern value="\d{8,14}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nmRazao">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="100"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="dscLograd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="80"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nrLograd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="10"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="bairro" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="cep">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{8}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="codMunic" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="uf">
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
                        "cnpjAgntInteg",
                        "nmRazao",
                        "dscLograd",
                        "nrLograd",
                        "bairro",
                        "cep",
                        "codMunic",
                        "uf"
                    })
                    public static class AgeIntegracao {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String cnpjAgntInteg;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String nmRazao;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String dscLograd;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String nrLograd;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected String bairro;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String cep;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected BigInteger codMunic;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String uf;

                        /**
                         * Obtém o valor da propriedade cnpjAgntInteg.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnpjAgntInteg() {
                            return cnpjAgntInteg;
                        }

                        /**
                         * Define o valor da propriedade cnpjAgntInteg.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnpjAgntInteg(String value) {
                            this.cnpjAgntInteg = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmRazao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmRazao() {
                            return nmRazao;
                        }

                        /**
                         * Define o valor da propriedade nmRazao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmRazao(String value) {
                            this.nmRazao = value;
                        }

                        /**
                         * Obtém o valor da propriedade dscLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDscLograd() {
                            return dscLograd;
                        }

                        /**
                         * Define o valor da propriedade dscLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDscLograd(String value) {
                            this.dscLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrLograd() {
                            return nrLograd;
                        }

                        /**
                         * Define o valor da propriedade nrLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrLograd(String value) {
                            this.nrLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade bairro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBairro() {
                            return bairro;
                        }

                        /**
                         * Define o valor da propriedade bairro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBairro(String value) {
                            this.bairro = value;
                        }

                        /**
                         * Obtém o valor da propriedade cep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCep() {
                            return cep;
                        }

                        /**
                         * Define o valor da propriedade cep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCep(String value) {
                            this.cep = value;
                        }

                        /**
                         * Obtém o valor da propriedade codMunic.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCodMunic() {
                            return codMunic;
                        }

                        /**
                         * Define o valor da propriedade codMunic.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCodMunic(BigInteger value) {
                            this.codMunic = value;
                        }

                        /**
                         * Obtém o valor da propriedade uf.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUf() {
                            return uf;
                        }

                        /**
                         * Define o valor da propriedade uf.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUf(String value) {
                            this.uf = value;
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
                     *         &lt;element name="cnpjInstEnsino" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;length value="14"/>
                     *               &lt;pattern value="\d{8,14}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nmRazao">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="100"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="dscLograd" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="80"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nrLograd" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="10"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="bairro" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="cep" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{8}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="codMunic" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="uf" minOccurs="0">
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
                        "cnpjInstEnsino",
                        "nmRazao",
                        "dscLograd",
                        "nrLograd",
                        "bairro",
                        "cep",
                        "codMunic",
                        "uf"
                    })
                    public static class InstEnsino {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected String cnpjInstEnsino;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String nmRazao;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected String dscLograd;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected String nrLograd;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected String bairro;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected String cep;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected BigInteger codMunic;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02")
                        protected String uf;

                        /**
                         * Obtém o valor da propriedade cnpjInstEnsino.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnpjInstEnsino() {
                            return cnpjInstEnsino;
                        }

                        /**
                         * Define o valor da propriedade cnpjInstEnsino.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnpjInstEnsino(String value) {
                            this.cnpjInstEnsino = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmRazao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmRazao() {
                            return nmRazao;
                        }

                        /**
                         * Define o valor da propriedade nmRazao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmRazao(String value) {
                            this.nmRazao = value;
                        }

                        /**
                         * Obtém o valor da propriedade dscLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDscLograd() {
                            return dscLograd;
                        }

                        /**
                         * Define o valor da propriedade dscLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDscLograd(String value) {
                            this.dscLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrLograd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrLograd() {
                            return nrLograd;
                        }

                        /**
                         * Define o valor da propriedade nrLograd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrLograd(String value) {
                            this.nrLograd = value;
                        }

                        /**
                         * Obtém o valor da propriedade bairro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBairro() {
                            return bairro;
                        }

                        /**
                         * Define o valor da propriedade bairro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBairro(String value) {
                            this.bairro = value;
                        }

                        /**
                         * Obtém o valor da propriedade cep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCep() {
                            return cep;
                        }

                        /**
                         * Define o valor da propriedade cep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCep(String value) {
                            this.cep = value;
                        }

                        /**
                         * Obtém o valor da propriedade codMunic.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCodMunic() {
                            return codMunic;
                        }

                        /**
                         * Define o valor da propriedade codMunic.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCodMunic(BigInteger value) {
                            this.codMunic = value;
                        }

                        /**
                         * Obtém o valor da propriedade uf.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUf() {
                            return uf;
                        }

                        /**
                         * Define o valor da propriedade uf.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUf(String value) {
                            this.uf = value;
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
                     *         &lt;element name="cpfSupervisor">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;length value="11"/>
                     *               &lt;pattern value="\d{11}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nmSuperv">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="70"/>
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
                        "cpfSupervisor",
                        "nmSuperv"
                    })
                    public static class SupervisorEstagio {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String cpfSupervisor;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTSVAltContr/v02_04_02", required = true)
                        protected String nmSuperv;

                        /**
                         * Obtém o valor da propriedade cpfSupervisor.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCpfSupervisor() {
                            return cpfSupervisor;
                        }

                        /**
                         * Define o valor da propriedade cpfSupervisor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCpfSupervisor(String value) {
                            this.cpfSupervisor = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmSuperv.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmSuperv() {
                            return nmSuperv;
                        }

                        /**
                         * Define o valor da propriedade nmSuperv.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmSuperv(String value) {
                            this.nmSuperv = value;
                        }

                    }

                }

            }

        }

    }

}
