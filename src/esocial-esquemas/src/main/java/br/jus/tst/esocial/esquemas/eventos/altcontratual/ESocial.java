//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:51 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcontratual;

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
 *         &lt;element name="evtAltContratual">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TIdeVinculoNisObrig"/>
 *                   &lt;element name="altContratual">
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
 *                             &lt;element name="dtEf" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dscAlt" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;minLength value="3"/>
 *                                   &lt;maxLength value="150"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vinculo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpRegPrev">
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
 *                             &lt;element name="infoRegimeTrab">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="infoCeletista" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpRegJor">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="natAtividade">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dtBase" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d{1,2}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="cnpjSindCategProf">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="14"/>
 *                                                       &lt;pattern value="\d{8,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="trabTemp" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="justProrr">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="3"/>
 *                                                                 &lt;maxLength value="999"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="aprend" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpInsc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                 &lt;pattern value="\d"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nrInsc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{8,15}"/>
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
 *                                       &lt;element name="infoEstatutario" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpPlanRP">
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
 *                             &lt;element name="infoContrato">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codCargo" minOccurs="0">
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
 *                                       &lt;element name="codCateg">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{3}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codCarreira" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\w{1,30}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtIngrCarr" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TRemun"/>
 *                                       &lt;element name="duracao">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpContr">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dtTerm" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="localTrabalho">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TLocalTrab" minOccurs="0"/>
 *                                                 &lt;element name="localTrabDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TEnderecoBrasil" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="horContratual" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="qtdHrsSem" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;totalDigits value="4"/>
 *                                                       &lt;fractionDigits value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tpJornada">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dscTpJorn" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="100"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tmpParc">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;pattern value="\d"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="horario" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}THorario" maxOccurs="99" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="filiacaoSindical" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjSindTrab">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="14"/>
 *                                                       &lt;pattern value="\d{8,14}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="alvaraJudicial" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nrProcJud">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="21"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="observacao">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;whiteSpace value="preserve"/>
 *                                                       &lt;minLength value="3"/>
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="servPubl" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="mtvAlter">
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
    "evtAltContratual",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
    protected ESocial.EvtAltContratual evtAltContratual;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAltContratual.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAltContratual }
     *     
     */
    public ESocial.EvtAltContratual getEvtAltContratual() {
        return evtAltContratual;
    }

    /**
     * Define o valor da propriedade evtAltContratual.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAltContratual }
     *     
     */
    public void setEvtAltContratual(ESocial.EvtAltContratual value) {
        this.evtAltContratual = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TIdeVinculoNisObrig"/>
     *         &lt;element name="altContratual">
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
     *                   &lt;element name="dtEf" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dscAlt" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;minLength value="3"/>
     *                         &lt;maxLength value="150"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vinculo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpRegPrev">
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
     *                   &lt;element name="infoRegimeTrab">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="infoCeletista" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpRegJor">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="natAtividade">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dtBase" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d{1,2}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="cnpjSindCategProf">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="14"/>
     *                                             &lt;pattern value="\d{8,14}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="trabTemp" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="justProrr">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="3"/>
     *                                                       &lt;maxLength value="999"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="aprend" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpInsc">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                       &lt;pattern value="\d"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nrInsc">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{8,15}"/>
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
     *                             &lt;element name="infoEstatutario" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpPlanRP">
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
     *                   &lt;element name="infoContrato">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codCargo" minOccurs="0">
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
     *                             &lt;element name="codCateg">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{3}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codCarreira" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\w{1,30}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtIngrCarr" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TRemun"/>
     *                             &lt;element name="duracao">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpContr">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dtTerm" minOccurs="0">
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
     *                             &lt;element name="localTrabalho">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TLocalTrab" minOccurs="0"/>
     *                                       &lt;element name="localTrabDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TEnderecoBrasil" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="horContratual" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="qtdHrsSem" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;totalDigits value="4"/>
     *                                             &lt;fractionDigits value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="tpJornada">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dscTpJorn" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;whiteSpace value="preserve"/>
     *                                             &lt;minLength value="3"/>
     *                                             &lt;maxLength value="100"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="tmpParc">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;pattern value="\d"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="horario" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}THorario" maxOccurs="99" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="filiacaoSindical" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjSindTrab">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="14"/>
     *                                             &lt;pattern value="\d{8,14}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="alvaraJudicial" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nrProcJud">
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
     *                             &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="observacao">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;whiteSpace value="preserve"/>
     *                                             &lt;minLength value="3"/>
     *                                             &lt;maxLength value="255"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="servPubl" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="mtvAlter">
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
        "altContratual"
    })
    public static class EvtAltContratual {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
        protected TIdeVinculoNisObrig ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
        protected ESocial.EvtAltContratual.AltContratual altContratual;
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
         *     {@link TIdeVinculoNisObrig }
         *     
         */
        public TIdeVinculoNisObrig getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVinculoNisObrig }
         *     
         */
        public void setIdeVinculo(TIdeVinculoNisObrig value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade altContratual.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAltContratual.AltContratual }
         *     
         */
        public ESocial.EvtAltContratual.AltContratual getAltContratual() {
            return altContratual;
        }

        /**
         * Define o valor da propriedade altContratual.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAltContratual.AltContratual }
         *     
         */
        public void setAltContratual(ESocial.EvtAltContratual.AltContratual value) {
            this.altContratual = value;
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
         *         &lt;element name="dtAlteracao">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtEf" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dscAlt" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;minLength value="3"/>
         *               &lt;maxLength value="150"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vinculo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpRegPrev">
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
         *         &lt;element name="infoRegimeTrab">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="infoCeletista" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpRegJor">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="natAtividade">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dtBase" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d{1,2}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="cnpjSindCategProf">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="14"/>
         *                                   &lt;pattern value="\d{8,14}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="trabTemp" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="justProrr">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="3"/>
         *                                             &lt;maxLength value="999"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="aprend" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpInsc">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                             &lt;pattern value="\d"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nrInsc">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{8,15}"/>
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
         *                   &lt;element name="infoEstatutario" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpPlanRP">
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
         *         &lt;element name="infoContrato">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codCargo" minOccurs="0">
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
         *                   &lt;element name="codCateg">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{3}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codCarreira" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\w{1,30}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtIngrCarr" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TRemun"/>
         *                   &lt;element name="duracao">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpContr">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dtTerm" minOccurs="0">
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
         *                   &lt;element name="localTrabalho">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TLocalTrab" minOccurs="0"/>
         *                             &lt;element name="localTrabDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TEnderecoBrasil" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="horContratual" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="qtdHrsSem" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;totalDigits value="4"/>
         *                                   &lt;fractionDigits value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tpJornada">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dscTpJorn" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;minLength value="3"/>
         *                                   &lt;maxLength value="100"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tmpParc">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;pattern value="\d"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="horario" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}THorario" maxOccurs="99" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="filiacaoSindical" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjSindTrab">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="14"/>
         *                                   &lt;pattern value="\d{8,14}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="alvaraJudicial" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nrProcJud">
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
         *                   &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="observacao">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;minLength value="3"/>
         *                                   &lt;maxLength value="255"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="servPubl" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="mtvAlter">
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
            "dtEf",
            "dscAlt",
            "vinculo",
            "infoRegimeTrab",
            "infoContrato"
        })
        public static class AltContratual {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
            protected XMLGregorianCalendar dtAlteracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
            protected XMLGregorianCalendar dtEf;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
            protected String dscAlt;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
            protected ESocial.EvtAltContratual.AltContratual.Vinculo vinculo;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
            protected ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab infoRegimeTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
            protected ESocial.EvtAltContratual.AltContratual.InfoContrato infoContrato;

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
             * Obtém o valor da propriedade dtEf.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtEf() {
                return dtEf;
            }

            /**
             * Define o valor da propriedade dtEf.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtEf(XMLGregorianCalendar value) {
                this.dtEf = value;
            }

            /**
             * Obtém o valor da propriedade dscAlt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDscAlt() {
                return dscAlt;
            }

            /**
             * Define o valor da propriedade dscAlt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDscAlt(String value) {
                this.dscAlt = value;
            }

            /**
             * Obtém o valor da propriedade vinculo.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo }
             *     
             */
            public ESocial.EvtAltContratual.AltContratual.Vinculo getVinculo() {
                return vinculo;
            }

            /**
             * Define o valor da propriedade vinculo.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo }
             *     
             */
            public void setVinculo(ESocial.EvtAltContratual.AltContratual.Vinculo value) {
                this.vinculo = value;
            }

            /**
             * Obtém o valor da propriedade infoRegimeTrab.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab }
             *     
             */
            public ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab getInfoRegimeTrab() {
                return infoRegimeTrab;
            }

            /**
             * Define o valor da propriedade infoRegimeTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab }
             *     
             */
            public void setInfoRegimeTrab(ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab value) {
                this.infoRegimeTrab = value;
            }

            /**
             * Obtém o valor da propriedade infoContrato.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato }
             *     
             */
            public ESocial.EvtAltContratual.AltContratual.InfoContrato getInfoContrato() {
                return infoContrato;
            }

            /**
             * Define o valor da propriedade infoContrato.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato }
             *     
             */
            public void setInfoContrato(ESocial.EvtAltContratual.AltContratual.InfoContrato value) {
                this.infoContrato = value;
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
             *         &lt;element name="codCargo" minOccurs="0">
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
             *         &lt;element name="codCateg">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{3}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codCarreira" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\w{1,30}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtIngrCarr" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TRemun"/>
             *         &lt;element name="duracao">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpContr">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dtTerm" minOccurs="0">
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
             *         &lt;element name="localTrabalho">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TLocalTrab" minOccurs="0"/>
             *                   &lt;element name="localTrabDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TEnderecoBrasil" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="horContratual" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="qtdHrsSem" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;totalDigits value="4"/>
             *                         &lt;fractionDigits value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="tpJornada">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dscTpJorn" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;minLength value="3"/>
             *                         &lt;maxLength value="100"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="tmpParc">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="horario" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}THorario" maxOccurs="99" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="filiacaoSindical" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjSindTrab">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="14"/>
             *                         &lt;pattern value="\d{8,14}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="alvaraJudicial" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nrProcJud">
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
             *         &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="observacao">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;whiteSpace value="preserve"/>
             *                         &lt;minLength value="3"/>
             *                         &lt;maxLength value="255"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="servPubl" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="mtvAlter">
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
                "codCargo",
                "codFuncao",
                "codCateg",
                "codCarreira",
                "dtIngrCarr",
                "remuneracao",
                "duracao",
                "localTrabalho",
                "horContratual",
                "filiacaoSindical",
                "alvaraJudicial",
                "observacoes",
                "servPubl"
            })
            public static class InfoContrato {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected String codCargo;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected String codFuncao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                protected BigInteger codCateg;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected String codCarreira;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected XMLGregorianCalendar dtIngrCarr;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                protected TRemun remuneracao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                protected ESocial.EvtAltContratual.AltContratual.InfoContrato.Duracao duracao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                protected ESocial.EvtAltContratual.AltContratual.InfoContrato.LocalTrabalho localTrabalho;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected ESocial.EvtAltContratual.AltContratual.InfoContrato.HorContratual horContratual;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected List<ESocial.EvtAltContratual.AltContratual.InfoContrato.FiliacaoSindical> filiacaoSindical;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected ESocial.EvtAltContratual.AltContratual.InfoContrato.AlvaraJudicial alvaraJudicial;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected List<ESocial.EvtAltContratual.AltContratual.InfoContrato.Observacoes> observacoes;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected ESocial.EvtAltContratual.AltContratual.InfoContrato.ServPubl servPubl;

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

                /**
                 * Obtém o valor da propriedade codCarreira.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodCarreira() {
                    return codCarreira;
                }

                /**
                 * Define o valor da propriedade codCarreira.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodCarreira(String value) {
                    this.codCarreira = value;
                }

                /**
                 * Obtém o valor da propriedade dtIngrCarr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIngrCarr() {
                    return dtIngrCarr;
                }

                /**
                 * Define o valor da propriedade dtIngrCarr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIngrCarr(XMLGregorianCalendar value) {
                    this.dtIngrCarr = value;
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
                 * Obtém o valor da propriedade duracao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.Duracao }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.InfoContrato.Duracao getDuracao() {
                    return duracao;
                }

                /**
                 * Define o valor da propriedade duracao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.Duracao }
                 *     
                 */
                public void setDuracao(ESocial.EvtAltContratual.AltContratual.InfoContrato.Duracao value) {
                    this.duracao = value;
                }

                /**
                 * Obtém o valor da propriedade localTrabalho.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.LocalTrabalho }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.InfoContrato.LocalTrabalho getLocalTrabalho() {
                    return localTrabalho;
                }

                /**
                 * Define o valor da propriedade localTrabalho.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.LocalTrabalho }
                 *     
                 */
                public void setLocalTrabalho(ESocial.EvtAltContratual.AltContratual.InfoContrato.LocalTrabalho value) {
                    this.localTrabalho = value;
                }

                /**
                 * Obtém o valor da propriedade horContratual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.HorContratual }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.InfoContrato.HorContratual getHorContratual() {
                    return horContratual;
                }

                /**
                 * Define o valor da propriedade horContratual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.HorContratual }
                 *     
                 */
                public void setHorContratual(ESocial.EvtAltContratual.AltContratual.InfoContrato.HorContratual value) {
                    this.horContratual = value;
                }

                /**
                 * Gets the value of the filiacaoSindical property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the filiacaoSindical property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFiliacaoSindical().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.FiliacaoSindical }
                 * 
                 * 
                 */
                public List<ESocial.EvtAltContratual.AltContratual.InfoContrato.FiliacaoSindical> getFiliacaoSindical() {
                    if (filiacaoSindical == null) {
                        filiacaoSindical = new ArrayList<ESocial.EvtAltContratual.AltContratual.InfoContrato.FiliacaoSindical>();
                    }
                    return this.filiacaoSindical;
                }

                /**
                 * Obtém o valor da propriedade alvaraJudicial.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.AlvaraJudicial }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.InfoContrato.AlvaraJudicial getAlvaraJudicial() {
                    return alvaraJudicial;
                }

                /**
                 * Define o valor da propriedade alvaraJudicial.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.AlvaraJudicial }
                 *     
                 */
                public void setAlvaraJudicial(ESocial.EvtAltContratual.AltContratual.InfoContrato.AlvaraJudicial value) {
                    this.alvaraJudicial = value;
                }

                /**
                 * Gets the value of the observacoes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the observacoes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getObservacoes().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.Observacoes }
                 * 
                 * 
                 */
                public List<ESocial.EvtAltContratual.AltContratual.InfoContrato.Observacoes> getObservacoes() {
                    if (observacoes == null) {
                        observacoes = new ArrayList<ESocial.EvtAltContratual.AltContratual.InfoContrato.Observacoes>();
                    }
                    return this.observacoes;
                }

                /**
                 * Obtém o valor da propriedade servPubl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.ServPubl }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.InfoContrato.ServPubl getServPubl() {
                    return servPubl;
                }

                /**
                 * Define o valor da propriedade servPubl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoContrato.ServPubl }
                 *     
                 */
                public void setServPubl(ESocial.EvtAltContratual.AltContratual.InfoContrato.ServPubl value) {
                    this.servPubl = value;
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
                 *         &lt;element name="nrProcJud">
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
                    "nrProcJud"
                })
                public static class AlvaraJudicial {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                    protected String nrProcJud;

                    /**
                     * Obtém o valor da propriedade nrProcJud.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrProcJud() {
                        return nrProcJud;
                    }

                    /**
                     * Define o valor da propriedade nrProcJud.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrProcJud(String value) {
                        this.nrProcJud = value;
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
                 *         &lt;element name="tpContr">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtTerm" minOccurs="0">
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
                    "tpContr",
                    "dtTerm"
                })
                public static class Duracao {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected byte tpContr;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected XMLGregorianCalendar dtTerm;

                    /**
                     * Obtém o valor da propriedade tpContr.
                     * 
                     */
                    public byte getTpContr() {
                        return tpContr;
                    }

                    /**
                     * Define o valor da propriedade tpContr.
                     * 
                     */
                    public void setTpContr(byte value) {
                        this.tpContr = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtTerm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtTerm() {
                        return dtTerm;
                    }

                    /**
                     * Define o valor da propriedade dtTerm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtTerm(XMLGregorianCalendar value) {
                        this.dtTerm = value;
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
                 *         &lt;element name="cnpjSindTrab">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="14"/>
                 *               &lt;pattern value="\d{8,14}"/>
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
                    "cnpjSindTrab"
                })
                public static class FiliacaoSindical {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                    protected String cnpjSindTrab;

                    /**
                     * Obtém o valor da propriedade cnpjSindTrab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjSindTrab() {
                        return cnpjSindTrab;
                    }

                    /**
                     * Define o valor da propriedade cnpjSindTrab.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjSindTrab(String value) {
                        this.cnpjSindTrab = value;
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
                 *         &lt;element name="qtdHrsSem" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;totalDigits value="4"/>
                 *               &lt;fractionDigits value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpJornada">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dscTpJorn" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="3"/>
                 *               &lt;maxLength value="100"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tmpParc">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="horario" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}THorario" maxOccurs="99" minOccurs="0"/>
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
                    "qtdHrsSem",
                    "tpJornada",
                    "dscTpJorn",
                    "tmpParc",
                    "horario"
                })
                public static class HorContratual {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected BigDecimal qtdHrsSem;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected byte tpJornada;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected String dscTpJorn;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected byte tmpParc;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected List<THorario> horario;

                    /**
                     * Obtém o valor da propriedade qtdHrsSem.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getQtdHrsSem() {
                        return qtdHrsSem;
                    }

                    /**
                     * Define o valor da propriedade qtdHrsSem.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setQtdHrsSem(BigDecimal value) {
                        this.qtdHrsSem = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpJornada.
                     * 
                     */
                    public byte getTpJornada() {
                        return tpJornada;
                    }

                    /**
                     * Define o valor da propriedade tpJornada.
                     * 
                     */
                    public void setTpJornada(byte value) {
                        this.tpJornada = value;
                    }

                    /**
                     * Obtém o valor da propriedade dscTpJorn.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDscTpJorn() {
                        return dscTpJorn;
                    }

                    /**
                     * Define o valor da propriedade dscTpJorn.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDscTpJorn(String value) {
                        this.dscTpJorn = value;
                    }

                    /**
                     * Obtém o valor da propriedade tmpParc.
                     * 
                     */
                    public byte getTmpParc() {
                        return tmpParc;
                    }

                    /**
                     * Define o valor da propriedade tmpParc.
                     * 
                     */
                    public void setTmpParc(byte value) {
                        this.tmpParc = value;
                    }

                    /**
                     * Gets the value of the horario property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the horario property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHorario().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link THorario }
                     * 
                     * 
                     */
                    public List<THorario> getHorario() {
                        if (horario == null) {
                            horario = new ArrayList<THorario>();
                        }
                        return this.horario;
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
                 *         &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TLocalTrab" minOccurs="0"/>
                 *         &lt;element name="localTrabDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02}TEnderecoBrasil" minOccurs="0"/>
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
                    "localTrabGeral",
                    "localTrabDom"
                })
                public static class LocalTrabalho {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected TLocalTrab localTrabGeral;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected TEnderecoBrasil localTrabDom;

                    /**
                     * Obtém o valor da propriedade localTrabGeral.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TLocalTrab }
                     *     
                     */
                    public TLocalTrab getLocalTrabGeral() {
                        return localTrabGeral;
                    }

                    /**
                     * Define o valor da propriedade localTrabGeral.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TLocalTrab }
                     *     
                     */
                    public void setLocalTrabGeral(TLocalTrab value) {
                        this.localTrabGeral = value;
                    }

                    /**
                     * Obtém o valor da propriedade localTrabDom.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TEnderecoBrasil }
                     *     
                     */
                    public TEnderecoBrasil getLocalTrabDom() {
                        return localTrabDom;
                    }

                    /**
                     * Define o valor da propriedade localTrabDom.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TEnderecoBrasil }
                     *     
                     */
                    public void setLocalTrabDom(TEnderecoBrasil value) {
                        this.localTrabDom = value;
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
                 *         &lt;element name="observacao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;minLength value="3"/>
                 *               &lt;maxLength value="255"/>
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
                    "observacao"
                })
                public static class Observacoes {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                    protected String observacao;

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
                 *         &lt;element name="mtvAlter">
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
                    "mtvAlter"
                })
                public static class ServPubl {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected byte mtvAlter;

                    /**
                     * Obtém o valor da propriedade mtvAlter.
                     * 
                     */
                    public byte getMtvAlter() {
                        return mtvAlter;
                    }

                    /**
                     * Define o valor da propriedade mtvAlter.
                     * 
                     */
                    public void setMtvAlter(byte value) {
                        this.mtvAlter = value;
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
             *         &lt;element name="infoCeletista" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpRegJor">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="natAtividade">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dtBase" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;pattern value="\d{1,2}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="cnpjSindCategProf">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="14"/>
             *                         &lt;pattern value="\d{8,14}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="trabTemp" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="justProrr">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="3"/>
             *                                   &lt;maxLength value="999"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="aprend" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpInsc">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                   &lt;pattern value="\d"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nrInsc">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{8,15}"/>
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
             *         &lt;element name="infoEstatutario" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpPlanRP">
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
                "infoCeletista",
                "infoEstatutario"
            })
            public static class InfoRegimeTrab {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista infoCeletista;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                protected ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoEstatutario infoEstatutario;

                /**
                 * Obtém o valor da propriedade infoCeletista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista getInfoCeletista() {
                    return infoCeletista;
                }

                /**
                 * Define o valor da propriedade infoCeletista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista }
                 *     
                 */
                public void setInfoCeletista(ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista value) {
                    this.infoCeletista = value;
                }

                /**
                 * Obtém o valor da propriedade infoEstatutario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoEstatutario }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoEstatutario getInfoEstatutario() {
                    return infoEstatutario;
                }

                /**
                 * Define o valor da propriedade infoEstatutario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoEstatutario }
                 *     
                 */
                public void setInfoEstatutario(ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoEstatutario value) {
                    this.infoEstatutario = value;
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
                 *         &lt;element name="tpRegJor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="natAtividade">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtBase" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;pattern value="\d{1,2}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cnpjSindCategProf">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="14"/>
                 *               &lt;pattern value="\d{8,14}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="trabTemp" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="justProrr">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="3"/>
                 *                         &lt;maxLength value="999"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="aprend" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpInsc">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;pattern value="\d"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nrInsc">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{8,15}"/>
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
                    "tpRegJor",
                    "natAtividade",
                    "dtBase",
                    "cnpjSindCategProf",
                    "trabTemp",
                    "aprend"
                })
                public static class InfoCeletista {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected byte tpRegJor;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected byte natAtividade;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected Byte dtBase;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                    protected String cnpjSindCategProf;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.TrabTemp trabTemp;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.Aprend aprend;

                    /**
                     * Obtém o valor da propriedade tpRegJor.
                     * 
                     */
                    public byte getTpRegJor() {
                        return tpRegJor;
                    }

                    /**
                     * Define o valor da propriedade tpRegJor.
                     * 
                     */
                    public void setTpRegJor(byte value) {
                        this.tpRegJor = value;
                    }

                    /**
                     * Obtém o valor da propriedade natAtividade.
                     * 
                     */
                    public byte getNatAtividade() {
                        return natAtividade;
                    }

                    /**
                     * Define o valor da propriedade natAtividade.
                     * 
                     */
                    public void setNatAtividade(byte value) {
                        this.natAtividade = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtBase.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getDtBase() {
                        return dtBase;
                    }

                    /**
                     * Define o valor da propriedade dtBase.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setDtBase(Byte value) {
                        this.dtBase = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnpjSindCategProf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjSindCategProf() {
                        return cnpjSindCategProf;
                    }

                    /**
                     * Define o valor da propriedade cnpjSindCategProf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjSindCategProf(String value) {
                        this.cnpjSindCategProf = value;
                    }

                    /**
                     * Obtém o valor da propriedade trabTemp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.TrabTemp }
                     *     
                     */
                    public ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.TrabTemp getTrabTemp() {
                        return trabTemp;
                    }

                    /**
                     * Define o valor da propriedade trabTemp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.TrabTemp }
                     *     
                     */
                    public void setTrabTemp(ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.TrabTemp value) {
                        this.trabTemp = value;
                    }

                    /**
                     * Obtém o valor da propriedade aprend.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.Aprend }
                     *     
                     */
                    public ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.Aprend getAprend() {
                        return aprend;
                    }

                    /**
                     * Define o valor da propriedade aprend.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.Aprend }
                     *     
                     */
                    public void setAprend(ESocial.EvtAltContratual.AltContratual.InfoRegimeTrab.InfoCeletista.Aprend value) {
                        this.aprend = value;
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
                     *         &lt;element name="tpInsc">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;pattern value="\d"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nrInsc">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{8,15}"/>
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
                        "tpInsc",
                        "nrInsc"
                    })
                    public static class Aprend {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                        protected byte tpInsc;
                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
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
                     *         &lt;element name="justProrr">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="3"/>
                     *               &lt;maxLength value="999"/>
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
                        "justProrr"
                    })
                    public static class TrabTemp {

                        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02", required = true)
                        protected String justProrr;

                        /**
                         * Obtém o valor da propriedade justProrr.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getJustProrr() {
                            return justProrr;
                        }

                        /**
                         * Define o valor da propriedade justProrr.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setJustProrr(String value) {
                            this.justProrr = value;
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
                 *         &lt;element name="tpPlanRP">
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
                    "tpPlanRP"
                })
                public static class InfoEstatutario {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
                    protected byte tpPlanRP;

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
             *         &lt;element name="tpRegPrev">
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
                "tpRegPrev"
            })
            public static class Vinculo {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtAltContratual/v02_04_02")
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
