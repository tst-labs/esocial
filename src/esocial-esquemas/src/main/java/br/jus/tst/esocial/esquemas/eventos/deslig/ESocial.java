//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:09 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.deslig;

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
 *         &lt;element name="evtDeslig">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEvento_trab_indGuia"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideVinculo"/>
 *                   &lt;element name="infoDeslig">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mtvDeslig">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtAvPrv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="indPagtoAPI" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_pensAlim" minOccurs="0"/>
 *                             &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_percAliment" minOccurs="0"/>
 *                             &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_vrAlim" minOccurs="0"/>
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
 *                             &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoInterm" maxOccurs="31" minOccurs="0"/>
 *                             &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_observacao"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sucessaoVinc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="transfTit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfSubstituto" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
 *                                       &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mudancaCPF" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="verbasResc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dmDev" maxOccurs="50">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
 *                                                 &lt;element name="infoPerApur" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoPerAnt" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ideADC" maxOccurs="8">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="dtAcConv" minOccurs="0">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                                           &lt;minInclusive value="1890-01-01"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="tpAcConv">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;enumeration value="A"/>
 *                                                                           &lt;enumeration value="B"/>
 *                                                                           &lt;enumeration value="C"/>
 *                                                                           &lt;enumeration value="D"/>
 *                                                                           &lt;enumeration value="E"/>
 *                                                                           &lt;enumeration value="G"/>
 *                                                                           &lt;enumeration value="H"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_dsc"/>
 *                                                                     &lt;element name="idePeriodo" maxOccurs="180">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
 *                                                                               &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
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
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoMV" minOccurs="0"/>
 *                                       &lt;element name="procCS" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud_1_7"/>
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
 *                             &lt;element name="quarentena" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtFimQuar" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="consigFGTS" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="insConsig">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrContr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{1,40}"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_Id" />
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
    "evtDeslig",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtDeslig evtDeslig;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtDeslig.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtDeslig }
     *     
     */
    public ESocial.EvtDeslig getEvtDeslig() {
        return evtDeslig;
    }

    /**
     * Define o valor da propriedade evtDeslig.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtDeslig }
     *     
     */
    public void setEvtDeslig(ESocial.EvtDeslig value) {
        this.evtDeslig = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEvento_trab_indGuia"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideVinculo"/>
     *         &lt;element name="infoDeslig">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mtvDeslig">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtAvPrv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="indPagtoAPI" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_pensAlim" minOccurs="0"/>
     *                   &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_percAliment" minOccurs="0"/>
     *                   &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_vrAlim" minOccurs="0"/>
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
     *                   &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoInterm" maxOccurs="31" minOccurs="0"/>
     *                   &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_observacao"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sucessaoVinc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrInsc_11_14"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="transfTit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfSubstituto" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
     *                             &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mudancaCPF" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="verbasResc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dmDev" maxOccurs="50">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
     *                                       &lt;element name="infoPerApur" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoPerAnt" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ideADC" maxOccurs="8">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="dtAcConv" minOccurs="0">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                                                 &lt;minInclusive value="1890-01-01"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="tpAcConv">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;enumeration value="A"/>
     *                                                                 &lt;enumeration value="B"/>
     *                                                                 &lt;enumeration value="C"/>
     *                                                                 &lt;enumeration value="D"/>
     *                                                                 &lt;enumeration value="E"/>
     *                                                                 &lt;enumeration value="G"/>
     *                                                                 &lt;enumeration value="H"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_dsc"/>
     *                                                           &lt;element name="idePeriodo" maxOccurs="180">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
     *                                                                     &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
     *                             &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoMV" minOccurs="0"/>
     *                             &lt;element name="procCS" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud_1_7"/>
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
     *                   &lt;element name="quarentena" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtFimQuar" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="consigFGTS" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="insConsig">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrContr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{1,40}"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_Id" />
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
        "infoDeslig"
    })
    public static class EvtDeslig {

        @XmlElement(required = true)
        protected TIdeEventoTrabIndGuia ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculo ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtDeslig.InfoDeslig infoDeslig;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabIndGuia }
         *     
         */
        public TIdeEventoTrabIndGuia getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabIndGuia }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabIndGuia value) {
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
         * Obtém o valor da propriedade infoDeslig.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtDeslig.InfoDeslig }
         *     
         */
        public ESocial.EvtDeslig.InfoDeslig getInfoDeslig() {
            return infoDeslig;
        }

        /**
         * Define o valor da propriedade infoDeslig.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtDeslig.InfoDeslig }
         *     
         */
        public void setInfoDeslig(ESocial.EvtDeslig.InfoDeslig value) {
            this.infoDeslig = value;
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
         *         &lt;element name="mtvDeslig">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtAvPrv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="indPagtoAPI" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="dtProjFimAPI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="pensAlim" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_pensAlim" minOccurs="0"/>
         *         &lt;element name="percAliment" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_percAliment" minOccurs="0"/>
         *         &lt;element name="vrAlim" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_vrAlim" minOccurs="0"/>
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
         *         &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoInterm" maxOccurs="31" minOccurs="0"/>
         *         &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_observacao"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sucessaoVinc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_tpInsc_1_2"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrInsc_11_14"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="transfTit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfSubstituto" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
         *                   &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mudancaCPF" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="verbasResc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dmDev" maxOccurs="50">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
         *                             &lt;element name="infoPerApur" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="infoPerAnt" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ideADC" maxOccurs="8">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="dtAcConv" minOccurs="0">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                                       &lt;minInclusive value="1890-01-01"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="tpAcConv">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;enumeration value="A"/>
         *                                                       &lt;enumeration value="B"/>
         *                                                       &lt;enumeration value="C"/>
         *                                                       &lt;enumeration value="D"/>
         *                                                       &lt;enumeration value="E"/>
         *                                                       &lt;enumeration value="G"/>
         *                                                       &lt;enumeration value="H"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_dsc"/>
         *                                                 &lt;element name="idePeriodo" maxOccurs="180">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
         *                                                           &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
         *                   &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoMV" minOccurs="0"/>
         *                   &lt;element name="procCS" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud_1_7"/>
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
         *         &lt;element name="quarentena" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtFimQuar" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="consigFGTS" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="insConsig">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrContr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{1,40}"/>
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
            "mtvDeslig",
            "dtDeslig",
            "dtAvPrv",
            "indPagtoAPI",
            "dtProjFimAPI",
            "pensAlim",
            "percAliment",
            "vrAlim",
            "nrProcTrab",
            "infoInterm",
            "observacoes",
            "sucessaoVinc",
            "transfTit",
            "mudancaCPF",
            "verbasResc",
            "quarentena",
            "consigFGTS"
        })
        public static class InfoDeslig {

            @XmlElement(required = true)
            protected String mtvDeslig;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtDeslig;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAvPrv;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao indPagtoAPI;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtProjFimAPI;
            protected Byte pensAlim;
            protected BigDecimal percAliment;
            protected BigDecimal vrAlim;
            protected String nrProcTrab;
            protected List<TInfoInterm> infoInterm;
            protected List<ESocial.EvtDeslig.InfoDeslig.Observacoes> observacoes;
            protected ESocial.EvtDeslig.InfoDeslig.SucessaoVinc sucessaoVinc;
            protected ESocial.EvtDeslig.InfoDeslig.TransfTit transfTit;
            protected ESocial.EvtDeslig.InfoDeslig.MudancaCPF mudancaCPF;
            protected ESocial.EvtDeslig.InfoDeslig.VerbasResc verbasResc;
            protected ESocial.EvtDeslig.InfoDeslig.Quarentena quarentena;
            protected List<ESocial.EvtDeslig.InfoDeslig.ConsigFGTS> consigFGTS;

            /**
             * Obtém o valor da propriedade mtvDeslig.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMtvDeslig() {
                return mtvDeslig;
            }

            /**
             * Define o valor da propriedade mtvDeslig.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMtvDeslig(String value) {
                this.mtvDeslig = value;
            }

            /**
             * Obtém o valor da propriedade dtDeslig.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtDeslig() {
                return dtDeslig;
            }

            /**
             * Define o valor da propriedade dtDeslig.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtDeslig(XMLGregorianCalendar value) {
                this.dtDeslig = value;
            }

            /**
             * Obtém o valor da propriedade dtAvPrv.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAvPrv() {
                return dtAvPrv;
            }

            /**
             * Define o valor da propriedade dtAvPrv.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAvPrv(XMLGregorianCalendar value) {
                this.dtAvPrv = value;
            }

            /**
             * Obtém o valor da propriedade indPagtoAPI.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getIndPagtoAPI() {
                return indPagtoAPI;
            }

            /**
             * Define o valor da propriedade indPagtoAPI.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setIndPagtoAPI(TSSimNao value) {
                this.indPagtoAPI = value;
            }

            /**
             * Obtém o valor da propriedade dtProjFimAPI.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtProjFimAPI() {
                return dtProjFimAPI;
            }

            /**
             * Define o valor da propriedade dtProjFimAPI.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtProjFimAPI(XMLGregorianCalendar value) {
                this.dtProjFimAPI = value;
            }

            /**
             * Obtém o valor da propriedade pensAlim.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getPensAlim() {
                return pensAlim;
            }

            /**
             * Define o valor da propriedade pensAlim.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setPensAlim(Byte value) {
                this.pensAlim = value;
            }

            /**
             * Obtém o valor da propriedade percAliment.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercAliment() {
                return percAliment;
            }

            /**
             * Define o valor da propriedade percAliment.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercAliment(BigDecimal value) {
                this.percAliment = value;
            }

            /**
             * Obtém o valor da propriedade vrAlim.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrAlim() {
                return vrAlim;
            }

            /**
             * Define o valor da propriedade vrAlim.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrAlim(BigDecimal value) {
                this.vrAlim = value;
            }

            /**
             * Obtém o valor da propriedade nrProcTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProcTrab() {
                return nrProcTrab;
            }

            /**
             * Define o valor da propriedade nrProcTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProcTrab(String value) {
                this.nrProcTrab = value;
            }

            /**
             * Gets the value of the infoInterm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoInterm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoInterm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TInfoInterm }
             * 
             * 
             */
            public List<TInfoInterm> getInfoInterm() {
                if (infoInterm == null) {
                    infoInterm = new ArrayList<TInfoInterm>();
                }
                return this.infoInterm;
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
             * {@link ESocial.EvtDeslig.InfoDeslig.Observacoes }
             * 
             * 
             */
            public List<ESocial.EvtDeslig.InfoDeslig.Observacoes> getObservacoes() {
                if (observacoes == null) {
                    observacoes = new ArrayList<ESocial.EvtDeslig.InfoDeslig.Observacoes>();
                }
                return this.observacoes;
            }

            /**
             * Obtém o valor da propriedade sucessaoVinc.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.SucessaoVinc }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.SucessaoVinc getSucessaoVinc() {
                return sucessaoVinc;
            }

            /**
             * Define o valor da propriedade sucessaoVinc.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.SucessaoVinc }
             *     
             */
            public void setSucessaoVinc(ESocial.EvtDeslig.InfoDeslig.SucessaoVinc value) {
                this.sucessaoVinc = value;
            }

            /**
             * Obtém o valor da propriedade transfTit.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.TransfTit }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.TransfTit getTransfTit() {
                return transfTit;
            }

            /**
             * Define o valor da propriedade transfTit.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.TransfTit }
             *     
             */
            public void setTransfTit(ESocial.EvtDeslig.InfoDeslig.TransfTit value) {
                this.transfTit = value;
            }

            /**
             * Obtém o valor da propriedade mudancaCPF.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.MudancaCPF }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.MudancaCPF getMudancaCPF() {
                return mudancaCPF;
            }

            /**
             * Define o valor da propriedade mudancaCPF.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.MudancaCPF }
             *     
             */
            public void setMudancaCPF(ESocial.EvtDeslig.InfoDeslig.MudancaCPF value) {
                this.mudancaCPF = value;
            }

            /**
             * Obtém o valor da propriedade verbasResc.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.VerbasResc getVerbasResc() {
                return verbasResc;
            }

            /**
             * Define o valor da propriedade verbasResc.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc }
             *     
             */
            public void setVerbasResc(ESocial.EvtDeslig.InfoDeslig.VerbasResc value) {
                this.verbasResc = value;
            }

            /**
             * Obtém o valor da propriedade quarentena.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.Quarentena }
             *     
             */
            public ESocial.EvtDeslig.InfoDeslig.Quarentena getQuarentena() {
                return quarentena;
            }

            /**
             * Define o valor da propriedade quarentena.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtDeslig.InfoDeslig.Quarentena }
             *     
             */
            public void setQuarentena(ESocial.EvtDeslig.InfoDeslig.Quarentena value) {
                this.quarentena = value;
            }

            /**
             * Gets the value of the consigFGTS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the consigFGTS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConsigFGTS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtDeslig.InfoDeslig.ConsigFGTS }
             * 
             * 
             */
            public List<ESocial.EvtDeslig.InfoDeslig.ConsigFGTS> getConsigFGTS() {
                if (consigFGTS == null) {
                    consigFGTS = new ArrayList<ESocial.EvtDeslig.InfoDeslig.ConsigFGTS>();
                }
                return this.consigFGTS;
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
             *         &lt;element name="insConsig">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrContr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{1,40}"/>
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
                "insConsig",
                "nrContr"
            })
            public static class ConsigFGTS {

                @XmlElement(required = true)
                protected String insConsig;
                @XmlElement(required = true)
                protected String nrContr;

                /**
                 * Obtém o valor da propriedade insConsig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInsConsig() {
                    return insConsig;
                }

                /**
                 * Define o valor da propriedade insConsig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInsConsig(String value) {
                    this.insConsig = value;
                }

                /**
                 * Obtém o valor da propriedade nrContr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrContr() {
                    return nrContr;
                }

                /**
                 * Define o valor da propriedade nrContr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrContr(String value) {
                    this.nrContr = value;
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
             *         &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
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
                "novoCPF"
            })
            public static class MudancaCPF {

                @XmlElement(required = true)
                protected String novoCPF;

                /**
                 * Obtém o valor da propriedade novoCPF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNovoCPF() {
                    return novoCPF;
                }

                /**
                 * Define o valor da propriedade novoCPF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNovoCPF(String value) {
                    this.novoCPF = value;
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
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_observacao"/>
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
             *         &lt;element name="dtFimQuar" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "dtFimQuar"
            })
            public static class Quarentena {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtFimQuar;

                /**
                 * Obtém o valor da propriedade dtFimQuar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtFimQuar() {
                    return dtFimQuar;
                }

                /**
                 * Define o valor da propriedade dtFimQuar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtFimQuar(XMLGregorianCalendar value) {
                    this.dtFimQuar = value;
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
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_tpInsc_1_2"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrInsc_11_14"/>
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
            public static class SucessaoVinc {

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
             *         &lt;element name="cpfSubstituto" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_cpf"/>
             *         &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "cpfSubstituto",
                "dtNascto"
            })
            public static class TransfTit {

                @XmlElement(required = true)
                protected String cpfSubstituto;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtNascto;

                /**
                 * Obtém o valor da propriedade cpfSubstituto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfSubstituto() {
                    return cpfSubstituto;
                }

                /**
                 * Define o valor da propriedade cpfSubstituto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfSubstituto(String value) {
                    this.cpfSubstituto = value;
                }

                /**
                 * Obtém o valor da propriedade dtNascto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtNascto() {
                    return dtNascto;
                }

                /**
                 * Define o valor da propriedade dtNascto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtNascto(XMLGregorianCalendar value) {
                    this.dtNascto = value;
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
             *         &lt;element name="dmDev" maxOccurs="50">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
             *                   &lt;element name="infoPerApur" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infoPerAnt" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ideADC" maxOccurs="8">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="dtAcConv" minOccurs="0">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                                             &lt;minInclusive value="1890-01-01"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="tpAcConv">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;enumeration value="A"/>
             *                                             &lt;enumeration value="B"/>
             *                                             &lt;enumeration value="C"/>
             *                                             &lt;enumeration value="D"/>
             *                                             &lt;enumeration value="E"/>
             *                                             &lt;enumeration value="G"/>
             *                                             &lt;enumeration value="H"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_dsc"/>
             *                                       &lt;element name="idePeriodo" maxOccurs="180">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
             *                                                 &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
             *         &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="infoMV" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoMV" minOccurs="0"/>
             *         &lt;element name="procCS" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud_1_7"/>
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
                "dmDev",
                "procJudTrab",
                "infoMV",
                "procCS"
            })
            public static class VerbasResc {

                @XmlElement(required = true)
                protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev> dmDev;
                protected List<TProcJudTrab> procJudTrab;
                protected TInfoMV infoMV;
                protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS procCS;

                /**
                 * Gets the value of the dmDev property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dmDev property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDmDev().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev }
                 * 
                 * 
                 */
                public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev> getDmDev() {
                    if (dmDev == null) {
                        dmDev = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev>();
                    }
                    return this.dmDev;
                }

                /**
                 * Gets the value of the procJudTrab property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procJudTrab property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcJudTrab().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TProcJudTrab }
                 * 
                 * 
                 */
                public List<TProcJudTrab> getProcJudTrab() {
                    if (procJudTrab == null) {
                        procJudTrab = new ArrayList<TProcJudTrab>();
                    }
                    return this.procJudTrab;
                }

                /**
                 * Obtém o valor da propriedade infoMV.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoMV }
                 *     
                 */
                public TInfoMV getInfoMV() {
                    return infoMV;
                }

                /**
                 * Define o valor da propriedade infoMV.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoMV }
                 *     
                 */
                public void setInfoMV(TInfoMV value) {
                    this.infoMV = value;
                }

                /**
                 * Obtém o valor da propriedade procCS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS }
                 *     
                 */
                public ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS getProcCS() {
                    return procCS;
                }

                /**
                 * Define o valor da propriedade procCS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS }
                 *     
                 */
                public void setProcCS(ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS value) {
                    this.procCS = value;
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
                 *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
                 *         &lt;element name="infoPerApur" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="infoPerAnt" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ideADC" maxOccurs="8">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="dtAcConv" minOccurs="0">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *                                   &lt;minInclusive value="1890-01-01"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="tpAcConv">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;enumeration value="A"/>
                 *                                   &lt;enumeration value="B"/>
                 *                                   &lt;enumeration value="C"/>
                 *                                   &lt;enumeration value="D"/>
                 *                                   &lt;enumeration value="E"/>
                 *                                   &lt;enumeration value="G"/>
                 *                                   &lt;enumeration value="H"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_dsc"/>
                 *                             &lt;element name="idePeriodo" maxOccurs="180">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
                 *                                       &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
                    "ideDmDev",
                    "infoPerApur",
                    "infoPerAnt"
                })
                public static class DmDev {

                    @XmlElement(required = true)
                    protected String ideDmDev;
                    protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur infoPerApur;
                    protected ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt infoPerAnt;

                    /**
                     * Obtém o valor da propriedade ideDmDev.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdeDmDev() {
                        return ideDmDev;
                    }

                    /**
                     * Define o valor da propriedade ideDmDev.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdeDmDev(String value) {
                        this.ideDmDev = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoPerApur.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur }
                     *     
                     */
                    public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur getInfoPerApur() {
                        return infoPerApur;
                    }

                    /**
                     * Define o valor da propriedade infoPerApur.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur }
                     *     
                     */
                    public void setInfoPerApur(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur value) {
                        this.infoPerApur = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoPerAnt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt }
                     *     
                     */
                    public ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt getInfoPerAnt() {
                        return infoPerAnt;
                    }

                    /**
                     * Define o valor da propriedade infoPerAnt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt }
                     *     
                     */
                    public void setInfoPerAnt(ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt value) {
                        this.infoPerAnt = value;
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
                     *         &lt;element name="ideADC" maxOccurs="8">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="dtAcConv" minOccurs="0">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                     *                         &lt;minInclusive value="1890-01-01"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="tpAcConv">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;enumeration value="A"/>
                     *                         &lt;enumeration value="B"/>
                     *                         &lt;enumeration value="C"/>
                     *                         &lt;enumeration value="D"/>
                     *                         &lt;enumeration value="E"/>
                     *                         &lt;enumeration value="G"/>
                     *                         &lt;enumeration value="H"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_dsc"/>
                     *                   &lt;element name="idePeriodo" maxOccurs="180">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
                     *                             &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
                        "ideADC"
                    })
                    public static class InfoPerAnt {

                        @XmlElement(required = true)
                        protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC> ideADC;

                        /**
                         * Gets the value of the ideADC property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ideADC property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdeADC().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC }
                         * 
                         * 
                         */
                        public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC> getIdeADC() {
                            if (ideADC == null) {
                                ideADC = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC>();
                            }
                            return this.ideADC;
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
                         *         &lt;element name="dtAcConv" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                         *               &lt;minInclusive value="1890-01-01"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="tpAcConv">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;enumeration value="A"/>
                         *               &lt;enumeration value="B"/>
                         *               &lt;enumeration value="C"/>
                         *               &lt;enumeration value="D"/>
                         *               &lt;enumeration value="E"/>
                         *               &lt;enumeration value="G"/>
                         *               &lt;enumeration value="H"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_dsc"/>
                         *         &lt;element name="idePeriodo" maxOccurs="180">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
                         *                   &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
                            "dtAcConv",
                            "tpAcConv",
                            "dsc",
                            "idePeriodo"
                        })
                        public static class IdeADC {

                            protected XMLGregorianCalendar dtAcConv;
                            @XmlElement(required = true)
                            protected String tpAcConv;
                            @XmlElement(required = true)
                            protected String dsc;
                            @XmlElement(required = true)
                            protected List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo> idePeriodo;

                            /**
                             * Obtém o valor da propriedade dtAcConv.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public XMLGregorianCalendar getDtAcConv() {
                                return dtAcConv;
                            }

                            /**
                             * Define o valor da propriedade dtAcConv.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XMLGregorianCalendar }
                             *     
                             */
                            public void setDtAcConv(XMLGregorianCalendar value) {
                                this.dtAcConv = value;
                            }

                            /**
                             * Obtém o valor da propriedade tpAcConv.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTpAcConv() {
                                return tpAcConv;
                            }

                            /**
                             * Define o valor da propriedade tpAcConv.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTpAcConv(String value) {
                                this.tpAcConv = value;
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
                             * Gets the value of the idePeriodo property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the idePeriodo property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getIdePeriodo().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo }
                             * 
                             * 
                             */
                            public List<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo> getIdePeriodo() {
                                if (idePeriodo == null) {
                                    idePeriodo = new ArrayList<ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo>();
                                }
                                return this.idePeriodo;
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
                             *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_periodo_mensal"/>
                             *         &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
                                "perRef",
                                "ideEstabLot"
                            })
                            public static class IdePeriodo {

                                @XmlElement(required = true)
                                protected String perRef;
                                @XmlElement(required = true)
                                protected List<TIdeEstabLot> ideEstabLot;

                                /**
                                 * Obtém o valor da propriedade perRef.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getPerRef() {
                                    return perRef;
                                }

                                /**
                                 * Define o valor da propriedade perRef.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setPerRef(String value) {
                                    this.perRef = value;
                                }

                                /**
                                 * Gets the value of the ideEstabLot property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the ideEstabLot property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getIdeEstabLot().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link TIdeEstabLot }
                                 * 
                                 * 
                                 */
                                public List<TIdeEstabLot> getIdeEstabLot() {
                                    if (ideEstabLot == null) {
                                        ideEstabLot = new ArrayList<TIdeEstabLot>();
                                    }
                                    return this.ideEstabLot;
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
                     *         &lt;element name="ideEstabLot" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_ideEstabLot" maxOccurs="24"/>
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
                        "ideEstabLot"
                    })
                    public static class InfoPerApur {

                        @XmlElement(required = true)
                        protected List<TIdeEstabLot> ideEstabLot;

                        /**
                         * Gets the value of the ideEstabLot property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ideEstabLot property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdeEstabLot().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TIdeEstabLot }
                         * 
                         * 
                         */
                        public List<TIdeEstabLot> getIdeEstabLot() {
                            if (ideEstabLot == null) {
                                ideEstabLot = new ArrayList<TIdeEstabLot>();
                            }
                            return this.ideEstabLot;
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
                 *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrProcJud_1_7"/>
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
                public static class ProcCS {

                    @XmlElement(required = true)
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

            }

        }

    }

}
