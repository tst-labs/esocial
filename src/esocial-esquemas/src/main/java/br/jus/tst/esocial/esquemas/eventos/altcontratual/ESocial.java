//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:53 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcontratual;

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
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_ideVinculo"/>
 *                   &lt;element name="altContratual">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtAlteracao"/>
 *                             &lt;element name="dtEf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="dscAlt" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="150"/>
 *                                   &lt;pattern value=".*[^\s].*"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vinculo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegPrev"/>
 *                                       &lt;element name="infoRegimeTrab">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="infoCeletista" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegJor"/>
 *                                                           &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_natAtividade"/>
 *                                                           &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
 *                                                           &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_cnpjSindCategProf"/>
 *                                                           &lt;element name="trabTemporario" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="justProrr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_999"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_aprend" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoEstatutario" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpPlanRP"/>
 *                                                           &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
 *                                                           &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
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
 *                                       &lt;element name="infoContrato">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                                 &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
 *                                                 &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                                 &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
 *                                                 &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_codCateg"/>
 *                                                 &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
 *                                                 &lt;element name="duracao" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpContr"/>
 *                                                           &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
 *                                                           &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_objDet" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="localTrabalho">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
 *                                                           &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_horContratual" minOccurs="0"/>
 *                                                 &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
 *                                                 &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_observacao"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_Id" />
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
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAltContratual evtAltContratual;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_ideVinculo"/>
     *         &lt;element name="altContratual">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtAlteracao"/>
     *                   &lt;element name="dtEf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="dscAlt" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="150"/>
     *                         &lt;pattern value=".*[^\s].*"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vinculo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegPrev"/>
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
     *                                                 &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegJor"/>
     *                                                 &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_natAtividade"/>
     *                                                 &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
     *                                                 &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_cnpjSindCategProf"/>
     *                                                 &lt;element name="trabTemporario" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="justProrr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_999"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_aprend" minOccurs="0"/>
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
     *                                                 &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpPlanRP"/>
     *                                                 &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
     *                                                 &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
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
     *                                       &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                                       &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
     *                                       &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                                       &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
     *                                       &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_codCateg"/>
     *                                       &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
     *                                       &lt;element name="duracao" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpContr"/>
     *                                                 &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
     *                                                 &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_objDet" minOccurs="0"/>
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
     *                                                 &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
     *                                                 &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_horContratual" minOccurs="0"/>
     *                                       &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
     *                                       &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_observacao"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_Id" />
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

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculo ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtAltContratual.AltContratual altContratual;
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
         *     {@link TIdeVinculo }
         *     
         */
        public TIdeVinculo getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVinculo }
         *     
         */
        public void setIdeVinculo(TIdeVinculo value) {
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
         *         &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtAlteracao"/>
         *         &lt;element name="dtEf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="dscAlt" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="150"/>
         *               &lt;pattern value=".*[^\s].*"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vinculo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegPrev"/>
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
         *                                       &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegJor"/>
         *                                       &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_natAtividade"/>
         *                                       &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
         *                                       &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_cnpjSindCategProf"/>
         *                                       &lt;element name="trabTemporario" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="justProrr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_999"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_aprend" minOccurs="0"/>
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
         *                                       &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpPlanRP"/>
         *                                       &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
         *                                       &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
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
         *                             &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                             &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
         *                             &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                             &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
         *                             &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_codCateg"/>
         *                             &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
         *                             &lt;element name="duracao" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpContr"/>
         *                                       &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
         *                                       &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_objDet" minOccurs="0"/>
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
         *                                       &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
         *                                       &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_horContratual" minOccurs="0"/>
         *                             &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
         *                             &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_observacao"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
            "vinculo"
        })
        public static class AltContratual {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAlteracao;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtEf;
            protected String dscAlt;
            @XmlElement(required = true)
            protected ESocial.EvtAltContratual.AltContratual.Vinculo vinculo;

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
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegPrev"/>
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
             *                             &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegJor"/>
             *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_natAtividade"/>
             *                             &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
             *                             &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_cnpjSindCategProf"/>
             *                             &lt;element name="trabTemporario" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="justProrr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_999"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_aprend" minOccurs="0"/>
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
             *                             &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpPlanRP"/>
             *                             &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
             *                             &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
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
             *                   &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *                   &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
             *                   &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *                   &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
             *                   &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_codCateg"/>
             *                   &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
             *                   &lt;element name="duracao" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpContr"/>
             *                             &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
             *                             &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_objDet" minOccurs="0"/>
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
             *                             &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
             *                             &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_horContratual" minOccurs="0"/>
             *                   &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
             *                   &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_observacao"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
                "tpRegPrev",
                "infoRegimeTrab",
                "infoContrato"
            })
            public static class Vinculo {

                protected byte tpRegPrev;
                @XmlElement(required = true)
                protected ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab infoRegimeTrab;
                @XmlElement(required = true)
                protected ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato infoContrato;

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

                /**
                 * Obtém o valor da propriedade infoRegimeTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab getInfoRegimeTrab() {
                    return infoRegimeTrab;
                }

                /**
                 * Define o valor da propriedade infoRegimeTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab }
                 *     
                 */
                public void setInfoRegimeTrab(ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab value) {
                    this.infoRegimeTrab = value;
                }

                /**
                 * Obtém o valor da propriedade infoContrato.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato }
                 *     
                 */
                public ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato getInfoContrato() {
                    return infoContrato;
                }

                /**
                 * Define o valor da propriedade infoContrato.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato }
                 *     
                 */
                public void setInfoContrato(ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato value) {
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
                 *         &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
                 *         &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
                 *         &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
                 *         &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
                 *         &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_codCateg"/>
                 *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
                 *         &lt;element name="duracao" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpContr"/>
                 *                   &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
                 *                   &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_objDet" minOccurs="0"/>
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
                 *                   &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
                 *                   &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_horContratual" minOccurs="0"/>
                 *         &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
                 *         &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_observacao"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
                    "cboFuncao",
                    "acumCargo",
                    "codCateg",
                    "remuneracao",
                    "duracao",
                    "localTrabalho",
                    "horContratual",
                    "alvaraJudicial",
                    "observacoes",
                    "treiCap"
                })
                public static class InfoContrato {

                    protected String nmCargo;
                    @XmlElement(name = "CBOCargo")
                    protected String cboCargo;
                    protected String nmFuncao;
                    @XmlElement(name = "CBOFuncao")
                    protected String cboFuncao;
                    @XmlSchemaType(name = "string")
                    protected TSSimNao acumCargo;
                    @XmlElement(required = true)
                    protected BigInteger codCateg;
                    protected TRemuneracao remuneracao;
                    protected ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Duracao duracao;
                    @XmlElement(required = true)
                    protected ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.LocalTrabalho localTrabalho;
                    protected THorContratual horContratual;
                    protected TAlvaraJudicial alvaraJudicial;
                    protected List<ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Observacoes> observacoes;
                    protected List<TTreiCap> treiCap;

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

                    /**
                     * Obtém o valor da propriedade acumCargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getAcumCargo() {
                        return acumCargo;
                    }

                    /**
                     * Define o valor da propriedade acumCargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setAcumCargo(TSSimNao value) {
                        this.acumCargo = value;
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
                     * Obtém o valor da propriedade duracao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Duracao }
                     *     
                     */
                    public ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Duracao getDuracao() {
                        return duracao;
                    }

                    /**
                     * Define o valor da propriedade duracao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Duracao }
                     *     
                     */
                    public void setDuracao(ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Duracao value) {
                        this.duracao = value;
                    }

                    /**
                     * Obtém o valor da propriedade localTrabalho.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.LocalTrabalho }
                     *     
                     */
                    public ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.LocalTrabalho getLocalTrabalho() {
                        return localTrabalho;
                    }

                    /**
                     * Define o valor da propriedade localTrabalho.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.LocalTrabalho }
                     *     
                     */
                    public void setLocalTrabalho(ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.LocalTrabalho value) {
                        this.localTrabalho = value;
                    }

                    /**
                     * Obtém o valor da propriedade horContratual.
                     * 
                     * @return
                     *     possible object is
                     *     {@link THorContratual }
                     *     
                     */
                    public THorContratual getHorContratual() {
                        return horContratual;
                    }

                    /**
                     * Define o valor da propriedade horContratual.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link THorContratual }
                     *     
                     */
                    public void setHorContratual(THorContratual value) {
                        this.horContratual = value;
                    }

                    /**
                     * Obtém o valor da propriedade alvaraJudicial.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TAlvaraJudicial }
                     *     
                     */
                    public TAlvaraJudicial getAlvaraJudicial() {
                        return alvaraJudicial;
                    }

                    /**
                     * Define o valor da propriedade alvaraJudicial.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TAlvaraJudicial }
                     *     
                     */
                    public void setAlvaraJudicial(TAlvaraJudicial value) {
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
                     * {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Observacoes }
                     * 
                     * 
                     */
                    public List<ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Observacoes> getObservacoes() {
                        if (observacoes == null) {
                            observacoes = new ArrayList<ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Observacoes>();
                        }
                        return this.observacoes;
                    }

                    /**
                     * Gets the value of the treiCap property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the treiCap property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTreiCap().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TTreiCap }
                     * 
                     * 
                     */
                    public List<TTreiCap> getTreiCap() {
                        if (treiCap == null) {
                            treiCap = new ArrayList<TTreiCap>();
                        }
                        return this.treiCap;
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
                     *         &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpContr"/>
                     *         &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
                     *         &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_objDet" minOccurs="0"/>
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
                        "dtTerm",
                        "objDet"
                    })
                    public static class Duracao {

                        protected byte tpContr;
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dtTerm;
                        protected String objDet;

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

                        /**
                         * Obtém o valor da propriedade objDet.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getObjDet() {
                            return objDet;
                        }

                        /**
                         * Define o valor da propriedade objDet.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setObjDet(String value) {
                            this.objDet = value;
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
                     *         &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
                     *         &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
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
                        "localTempDom"
                    })
                    public static class LocalTrabalho {

                        protected TLocalTrabGeral localTrabGeral;
                        protected TEnderecoBrasil localTempDom;

                        /**
                         * Obtém o valor da propriedade localTrabGeral.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TLocalTrabGeral }
                         *     
                         */
                        public TLocalTrabGeral getLocalTrabGeral() {
                            return localTrabGeral;
                        }

                        /**
                         * Define o valor da propriedade localTrabGeral.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TLocalTrabGeral }
                         *     
                         */
                        public void setLocalTrabGeral(TLocalTrabGeral value) {
                            this.localTrabGeral = value;
                        }

                        /**
                         * Obtém o valor da propriedade localTempDom.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TEnderecoBrasil }
                         *     
                         */
                        public TEnderecoBrasil getLocalTempDom() {
                            return localTempDom;
                        }

                        /**
                         * Define o valor da propriedade localTempDom.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TEnderecoBrasil }
                         *     
                         */
                        public void setLocalTempDom(TEnderecoBrasil value) {
                            this.localTempDom = value;
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
                     *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_observacao"/>
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

                        @XmlElement(required = true)
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
                 *                   &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegJor"/>
                 *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_natAtividade"/>
                 *                   &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
                 *                   &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_cnpjSindCategProf"/>
                 *                   &lt;element name="trabTemporario" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="justProrr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_999"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_aprend" minOccurs="0"/>
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
                 *                   &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpPlanRP"/>
                 *                   &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
                 *                   &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
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

                    protected ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista infoCeletista;
                    protected ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoEstatutario infoEstatutario;

                    /**
                     * Obtém o valor da propriedade infoCeletista.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista }
                     *     
                     */
                    public ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista getInfoCeletista() {
                        return infoCeletista;
                    }

                    /**
                     * Define o valor da propriedade infoCeletista.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista }
                     *     
                     */
                    public void setInfoCeletista(ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista value) {
                        this.infoCeletista = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoEstatutario.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoEstatutario }
                     *     
                     */
                    public ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoEstatutario getInfoEstatutario() {
                        return infoEstatutario;
                    }

                    /**
                     * Define o valor da propriedade infoEstatutario.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoEstatutario }
                     *     
                     */
                    public void setInfoEstatutario(ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoEstatutario value) {
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
                     *         &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpRegJor"/>
                     *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_natAtividade"/>
                     *         &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
                     *         &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_cnpjSindCategProf"/>
                     *         &lt;element name="trabTemporario" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="justProrr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_999"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}T_aprend" minOccurs="0"/>
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
                        "trabTemporario",
                        "aprend"
                    })
                    public static class InfoCeletista {

                        protected byte tpRegJor;
                        protected byte natAtividade;
                        protected Byte dtBase;
                        @XmlElement(required = true)
                        protected String cnpjSindCategProf;
                        protected ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario trabTemporario;
                        protected TAprend aprend;

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
                         * Obtém o valor da propriedade trabTemporario.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario }
                         *     
                         */
                        public ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario getTrabTemporario() {
                            return trabTemporario;
                        }

                        /**
                         * Define o valor da propriedade trabTemporario.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario }
                         *     
                         */
                        public void setTrabTemporario(ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario value) {
                            this.trabTemporario = value;
                        }

                        /**
                         * Obtém o valor da propriedade aprend.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TAprend }
                         *     
                         */
                        public TAprend getAprend() {
                            return aprend;
                        }

                        /**
                         * Define o valor da propriedade aprend.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TAprend }
                         *     
                         */
                        public void setAprend(TAprend value) {
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
                         *         &lt;element name="justProrr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_texto_999"/>
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
                        public static class TrabTemporario {

                            @XmlElement(required = true)
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
                     *         &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_tpPlanRP"/>
                     *         &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
                     *         &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_sim_nao"/>
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
                        "tpPlanRP",
                        "indTetoRGPS",
                        "indAbonoPerm"
                    })
                    public static class InfoEstatutario {

                        protected byte tpPlanRP;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao indTetoRGPS;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "string")
                        protected TSSimNao indAbonoPerm;

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
                         * Obtém o valor da propriedade indTetoRGPS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getIndTetoRGPS() {
                            return indTetoRGPS;
                        }

                        /**
                         * Define o valor da propriedade indTetoRGPS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setIndTetoRGPS(TSSimNao value) {
                            this.indTetoRGPS = value;
                        }

                        /**
                         * Obtém o valor da propriedade indAbonoPerm.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public TSSimNao getIndAbonoPerm() {
                            return indAbonoPerm;
                        }

                        /**
                         * Define o valor da propriedade indAbonoPerm.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TSSimNao }
                         *     
                         */
                        public void setIndAbonoPerm(TSSimNao value) {
                            this.indAbonoPerm = value;
                        }

                    }

                }

            }

        }

    }

}
