//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:23 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.remun;

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
 *         &lt;element name="evtRemun">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_ideEvento_folha"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_cpfRemun"/>
 *                             &lt;element name="infoMV" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="indMV" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indMV"/>
 *                                       &lt;element name="remunOutrEmpr" maxOccurs="999">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCategOE"/>
 *                                                 &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_vlrRemunOE"/>
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
 *                             &lt;element name="infoComplem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nmTrab"/>
 *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtNascto"/>
 *                                       &lt;element name="sucessaoVinc" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                                                 &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
 *                                                 &lt;element name="dtAdm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtAdm"/>
 *                                                 &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
 *                             &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
 *                             &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoInterm" maxOccurs="31" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dmDev" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCateg"/>
 *                             &lt;element name="infoPerApur" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ideEstabLot" maxOccurs="500">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
 *                                                 &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
 *                                                 &lt;element name="qtdDiasAv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
 *                                                 &lt;element name="remunPerApur" maxOccurs="8">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                                           &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
 *                                                           &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
 *                                                           &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
 *                                                 &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpAcConv"/>
 *                                                 &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dsc"/>
 *                                                 &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_sim_nao"/>
 *                                                 &lt;element name="idePeriodo" maxOccurs="180">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_periodo_mensal"/>
 *                                                           &lt;element name="ideEstabLot" maxOccurs="500">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
 *                                                                     &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
 *                                                                     &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
 *                                                                     &lt;element name="remunPerAnt" maxOccurs="8">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                                                               &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
 *                                                                               &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
 *                                                                               &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoComplCont" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_cbo"/>
 *                                       &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
 *                                       &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_Id" />
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
    "evtRemun",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtRemun evtRemun;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtRemun.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtRemun }
     *     
     */
    public ESocial.EvtRemun getEvtRemun() {
        return evtRemun;
    }

    /**
     * Define o valor da propriedade evtRemun.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtRemun }
     *     
     */
    public void setEvtRemun(ESocial.EvtRemun value) {
        this.evtRemun = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_ideEvento_folha"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_cpfRemun"/>
     *                   &lt;element name="infoMV" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="indMV" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indMV"/>
     *                             &lt;element name="remunOutrEmpr" maxOccurs="999">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
     *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCategOE"/>
     *                                       &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_vlrRemunOE"/>
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
     *                   &lt;element name="infoComplem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nmTrab"/>
     *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtNascto"/>
     *                             &lt;element name="sucessaoVinc" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
     *                                       &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
     *                                       &lt;element name="dtAdm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtAdm"/>
     *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
     *                   &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
     *                   &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoInterm" maxOccurs="31" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dmDev" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCateg"/>
     *                   &lt;element name="infoPerApur" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ideEstabLot" maxOccurs="500">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
     *                                       &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
     *                                       &lt;element name="qtdDiasAv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
     *                                       &lt;element name="remunPerApur" maxOccurs="8">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                                                 &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
     *                                                 &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
     *                                                 &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
     *                                       &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpAcConv"/>
     *                                       &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dsc"/>
     *                                       &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_sim_nao"/>
     *                                       &lt;element name="idePeriodo" maxOccurs="180">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_periodo_mensal"/>
     *                                                 &lt;element name="ideEstabLot" maxOccurs="500">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
     *                                                           &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
     *                                                           &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
     *                                                           &lt;element name="remunPerAnt" maxOccurs="8">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                                                                     &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
     *                                                                     &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
     *                                                                     &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoComplCont" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_cbo"/>
     *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
     *                             &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_Id" />
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
        "ideTrabalhador",
        "dmDev"
    })
    public static class EvtRemun {

        @XmlElement(required = true)
        protected TIdeEventoFolha ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtRemun.IdeTrabalhador ideTrabalhador;
        @XmlElement(required = true)
        protected List<ESocial.EvtRemun.DmDev> dmDev;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolha }
         *     
         */
        public TIdeEventoFolha getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolha }
         *     
         */
        public void setIdeEvento(TIdeEventoFolha value) {
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
         * Obtém o valor da propriedade ideTrabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtRemun.IdeTrabalhador }
         *     
         */
        public ESocial.EvtRemun.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtRemun.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtRemun.IdeTrabalhador value) {
            this.ideTrabalhador = value;
        }

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
         * {@link ESocial.EvtRemun.DmDev }
         * 
         * 
         */
        public List<ESocial.EvtRemun.DmDev> getDmDev() {
            if (dmDev == null) {
                dmDev = new ArrayList<ESocial.EvtRemun.DmDev>();
            }
            return this.dmDev;
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
         *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCateg"/>
         *         &lt;element name="infoPerApur" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ideEstabLot" maxOccurs="500">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
         *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
         *                             &lt;element name="qtdDiasAv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
         *                             &lt;element name="remunPerApur" maxOccurs="8">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                                       &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
         *                                       &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
         *                                       &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
         *                             &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpAcConv"/>
         *                             &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dsc"/>
         *                             &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_sim_nao"/>
         *                             &lt;element name="idePeriodo" maxOccurs="180">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_periodo_mensal"/>
         *                                       &lt;element name="ideEstabLot" maxOccurs="500">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
         *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
         *                                                 &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
         *                                                 &lt;element name="remunPerAnt" maxOccurs="8">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                                                           &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
         *                                                           &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
         *                                                           &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoComplCont" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_cbo"/>
         *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
         *                   &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
            "codCateg",
            "infoPerApur",
            "infoPerAnt",
            "infoComplCont"
        })
        public static class DmDev {

            @XmlElement(required = true)
            protected String ideDmDev;
            @XmlElement(required = true)
            protected BigInteger codCateg;
            protected ESocial.EvtRemun.DmDev.InfoPerApur infoPerApur;
            protected ESocial.EvtRemun.DmDev.InfoPerAnt infoPerAnt;
            protected ESocial.EvtRemun.DmDev.InfoComplCont infoComplCont;

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
             * Obtém o valor da propriedade infoPerApur.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerApur }
             *     
             */
            public ESocial.EvtRemun.DmDev.InfoPerApur getInfoPerApur() {
                return infoPerApur;
            }

            /**
             * Define o valor da propriedade infoPerApur.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerApur }
             *     
             */
            public void setInfoPerApur(ESocial.EvtRemun.DmDev.InfoPerApur value) {
                this.infoPerApur = value;
            }

            /**
             * Obtém o valor da propriedade infoPerAnt.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerAnt }
             *     
             */
            public ESocial.EvtRemun.DmDev.InfoPerAnt getInfoPerAnt() {
                return infoPerAnt;
            }

            /**
             * Define o valor da propriedade infoPerAnt.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.DmDev.InfoPerAnt }
             *     
             */
            public void setInfoPerAnt(ESocial.EvtRemun.DmDev.InfoPerAnt value) {
                this.infoPerAnt = value;
            }

            /**
             * Obtém o valor da propriedade infoComplCont.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.DmDev.InfoComplCont }
             *     
             */
            public ESocial.EvtRemun.DmDev.InfoComplCont getInfoComplCont() {
                return infoComplCont;
            }

            /**
             * Define o valor da propriedade infoComplCont.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.DmDev.InfoComplCont }
             *     
             */
            public void setInfoComplCont(ESocial.EvtRemun.DmDev.InfoComplCont value) {
                this.infoComplCont = value;
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
             *         &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_cbo"/>
             *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
             *         &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
                "codCBO",
                "natAtividade",
                "qtdDiasTrab"
            })
            public static class InfoComplCont {

                @XmlElement(required = true)
                protected String codCBO;
                protected Byte natAtividade;
                protected Byte qtdDiasTrab;

                /**
                 * Obtém o valor da propriedade codCBO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodCBO() {
                    return codCBO;
                }

                /**
                 * Define o valor da propriedade codCBO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodCBO(String value) {
                    this.codCBO = value;
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
                 * Obtém o valor da propriedade qtdDiasTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getQtdDiasTrab() {
                    return qtdDiasTrab;
                }

                /**
                 * Define o valor da propriedade qtdDiasTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setQtdDiasTrab(Byte value) {
                    this.qtdDiasTrab = value;
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
             *                   &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpAcConv"/>
             *                   &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dsc"/>
             *                   &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_sim_nao"/>
             *                   &lt;element name="idePeriodo" maxOccurs="180">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_periodo_mensal"/>
             *                             &lt;element name="ideEstabLot" maxOccurs="500">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
             *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
             *                                       &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
             *                                       &lt;element name="remunPerAnt" maxOccurs="8">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *                                                 &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
             *                                                 &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
             *                                                 &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC> ideADC;

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
                 * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC }
                 * 
                 * 
                 */
                public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC> getIdeADC() {
                    if (ideADC == null) {
                        ideADC = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC>();
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
                 *         &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpAcConv"/>
                 *         &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dsc"/>
                 *         &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_sim_nao"/>
                 *         &lt;element name="idePeriodo" maxOccurs="180">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_periodo_mensal"/>
                 *                   &lt;element name="ideEstabLot" maxOccurs="500">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
                 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
                 *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
                 *                             &lt;element name="remunPerAnt" maxOccurs="8">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                 *                                       &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
                 *                                       &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
                 *                                       &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                    "dtAcConv",
                    "tpAcConv",
                    "dsc",
                    "remunSuc",
                    "idePeriodo"
                })
                public static class IdeADC {

                    protected XMLGregorianCalendar dtAcConv;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "string")
                    protected TSTpAcConv tpAcConv;
                    @XmlElement(required = true)
                    protected String dsc;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "string")
                    protected TSSimNao remunSuc;
                    @XmlElement(required = true)
                    protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo> idePeriodo;

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
                     *     {@link TSTpAcConv }
                     *     
                     */
                    public TSTpAcConv getTpAcConv() {
                        return tpAcConv;
                    }

                    /**
                     * Define o valor da propriedade tpAcConv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSTpAcConv }
                     *     
                     */
                    public void setTpAcConv(TSTpAcConv value) {
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
                     * Obtém o valor da propriedade remunSuc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getRemunSuc() {
                        return remunSuc;
                    }

                    /**
                     * Define o valor da propriedade remunSuc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setRemunSuc(TSSimNao value) {
                        this.remunSuc = value;
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
                     * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo }
                     * 
                     * 
                     */
                    public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo> getIdePeriodo() {
                        if (idePeriodo == null) {
                            idePeriodo = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo>();
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
                     *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_periodo_mensal"/>
                     *         &lt;element name="ideEstabLot" maxOccurs="500">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
                     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
                     *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
                     *                   &lt;element name="remunPerAnt" maxOccurs="8">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                     *                             &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
                     *                             &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
                     *                             &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                        "perRef",
                        "ideEstabLot"
                    })
                    public static class IdePeriodo {

                        @XmlElement(required = true)
                        protected String perRef;
                        @XmlElement(required = true)
                        protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> ideEstabLot;

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
                         * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot }
                         * 
                         * 
                         */
                        public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> getIdeEstabLot() {
                            if (ideEstabLot == null) {
                                ideEstabLot = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot>();
                            }
                            return this.ideEstabLot;
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
                         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
                         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
                         *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
                         *         &lt;element name="remunPerAnt" maxOccurs="8">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                         *                   &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
                         *                   &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
                         *                   &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                            "codLotacao",
                            "remunPerAnt"
                        })
                        public static class IdeEstabLot {

                            protected byte tpInsc;
                            @XmlElement(required = true)
                            protected String nrInsc;
                            @XmlElement(required = true)
                            protected String codLotacao;
                            @XmlElement(required = true)
                            protected List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt> remunPerAnt;

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
                             * Obtém o valor da propriedade codLotacao.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodLotacao() {
                                return codLotacao;
                            }

                            /**
                             * Define o valor da propriedade codLotacao.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodLotacao(String value) {
                                this.codLotacao = value;
                            }

                            /**
                             * Gets the value of the remunPerAnt property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the remunPerAnt property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getRemunPerAnt().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt }
                             * 
                             * 
                             */
                            public List<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt> getRemunPerAnt() {
                                if (remunPerAnt == null) {
                                    remunPerAnt = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt>();
                                }
                                return this.remunPerAnt;
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
                             *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                             *         &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
                             *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
                             *         &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                                "matricula",
                                "indSimples",
                                "itensRemun",
                                "infoAgNocivo"
                            })
                            public static class RemunPerAnt {

                                protected String matricula;
                                protected Byte indSimples;
                                @XmlElement(required = true)
                                protected List<TItensRemun> itensRemun;
                                protected TInfoAgNocivo infoAgNocivo;

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
                                 * Obtém o valor da propriedade indSimples.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Byte }
                                 *     
                                 */
                                public Byte getIndSimples() {
                                    return indSimples;
                                }

                                /**
                                 * Define o valor da propriedade indSimples.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Byte }
                                 *     
                                 */
                                public void setIndSimples(Byte value) {
                                    this.indSimples = value;
                                }

                                /**
                                 * Gets the value of the itensRemun property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the itensRemun property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getItensRemun().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link TItensRemun }
                                 * 
                                 * 
                                 */
                                public List<TItensRemun> getItensRemun() {
                                    if (itensRemun == null) {
                                        itensRemun = new ArrayList<TItensRemun>();
                                    }
                                    return this.itensRemun;
                                }

                                /**
                                 * Obtém o valor da propriedade infoAgNocivo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link TInfoAgNocivo }
                                 *     
                                 */
                                public TInfoAgNocivo getInfoAgNocivo() {
                                    return infoAgNocivo;
                                }

                                /**
                                 * Define o valor da propriedade infoAgNocivo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link TInfoAgNocivo }
                                 *     
                                 */
                                public void setInfoAgNocivo(TInfoAgNocivo value) {
                                    this.infoAgNocivo = value;
                                }

                            }

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
             *         &lt;element name="ideEstabLot" maxOccurs="500">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
             *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
             *                   &lt;element name="qtdDiasAv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
             *                   &lt;element name="remunPerApur" maxOccurs="8">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *                             &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
             *                             &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
             *                             &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                "ideEstabLot"
            })
            public static class InfoPerApur {

                @XmlElement(required = true)
                protected List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot> ideEstabLot;

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
                 * {@link ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot }
                 * 
                 * 
                 */
                public List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot> getIdeEstabLot() {
                    if (ideEstabLot == null) {
                        ideEstabLot = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot>();
                    }
                    return this.ideEstabLot;
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
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_EstabLot"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_EstabLot"/>
                 *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codLotacao"/>
                 *         &lt;element name="qtdDiasAv" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dia" minOccurs="0"/>
                 *         &lt;element name="remunPerApur" maxOccurs="8">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                 *                   &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
                 *                   &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
                 *                   &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                    "codLotacao",
                    "qtdDiasAv",
                    "remunPerApur"
                })
                public static class IdeEstabLot {

                    protected byte tpInsc;
                    @XmlElement(required = true)
                    protected String nrInsc;
                    @XmlElement(required = true)
                    protected String codLotacao;
                    protected Byte qtdDiasAv;
                    @XmlElement(required = true)
                    protected List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur> remunPerApur;

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
                     * Obtém o valor da propriedade codLotacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodLotacao() {
                        return codLotacao;
                    }

                    /**
                     * Define o valor da propriedade codLotacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodLotacao(String value) {
                        this.codLotacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade qtdDiasAv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getQtdDiasAv() {
                        return qtdDiasAv;
                    }

                    /**
                     * Define o valor da propriedade qtdDiasAv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setQtdDiasAv(Byte value) {
                        this.qtdDiasAv = value;
                    }

                    /**
                     * Gets the value of the remunPerApur property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remunPerApur property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemunPerApur().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur }
                     * 
                     * 
                     */
                    public List<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur> getRemunPerApur() {
                        if (remunPerApur == null) {
                            remunPerApur = new ArrayList<ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur>();
                        }
                        return this.remunPerApur;
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
                     *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                     *         &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
                     *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_itensRemun" maxOccurs="200"/>
                     *         &lt;element name="infoAgNocivo" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoAgNocivo" minOccurs="0"/>
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
                        "matricula",
                        "indSimples",
                        "itensRemun",
                        "infoAgNocivo"
                    })
                    public static class RemunPerApur {

                        protected String matricula;
                        protected Byte indSimples;
                        @XmlElement(required = true)
                        protected List<TItensRemun> itensRemun;
                        protected TInfoAgNocivo infoAgNocivo;

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
                         * Obtém o valor da propriedade indSimples.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getIndSimples() {
                            return indSimples;
                        }

                        /**
                         * Define o valor da propriedade indSimples.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setIndSimples(Byte value) {
                            this.indSimples = value;
                        }

                        /**
                         * Gets the value of the itensRemun property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the itensRemun property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getItensRemun().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TItensRemun }
                         * 
                         * 
                         */
                        public List<TItensRemun> getItensRemun() {
                            if (itensRemun == null) {
                                itensRemun = new ArrayList<TItensRemun>();
                            }
                            return this.itensRemun;
                        }

                        /**
                         * Obtém o valor da propriedade infoAgNocivo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TInfoAgNocivo }
                         *     
                         */
                        public TInfoAgNocivo getInfoAgNocivo() {
                            return infoAgNocivo;
                        }

                        /**
                         * Define o valor da propriedade infoAgNocivo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TInfoAgNocivo }
                         *     
                         */
                        public void setInfoAgNocivo(TInfoAgNocivo value) {
                            this.infoAgNocivo = value;
                        }

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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_cpfRemun"/>
         *         &lt;element name="infoMV" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="indMV" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indMV"/>
         *                   &lt;element name="remunOutrEmpr" maxOccurs="999">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
         *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCategOE"/>
         *                             &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_vlrRemunOE"/>
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
         *         &lt;element name="infoComplem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nmTrab"/>
         *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtNascto"/>
         *                   &lt;element name="sucessaoVinc" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
         *                             &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
         *                             &lt;element name="dtAdm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtAdm"/>
         *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
         *         &lt;element name="procJudTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_procJudTrab" maxOccurs="99" minOccurs="0"/>
         *         &lt;element name="infoInterm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}T_infoInterm" maxOccurs="31" minOccurs="0"/>
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
            "infoMV",
            "infoComplem",
            "procJudTrab",
            "infoInterm"
        })
        public static class IdeTrabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;
            protected ESocial.EvtRemun.IdeTrabalhador.InfoMV infoMV;
            protected ESocial.EvtRemun.IdeTrabalhador.InfoComplem infoComplem;
            protected List<TProcJudTrab> procJudTrab;
            protected List<TInfoInterm> infoInterm;

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
             * Obtém o valor da propriedade infoMV.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoMV }
             *     
             */
            public ESocial.EvtRemun.IdeTrabalhador.InfoMV getInfoMV() {
                return infoMV;
            }

            /**
             * Define o valor da propriedade infoMV.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoMV }
             *     
             */
            public void setInfoMV(ESocial.EvtRemun.IdeTrabalhador.InfoMV value) {
                this.infoMV = value;
            }

            /**
             * Obtém o valor da propriedade infoComplem.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem }
             *     
             */
            public ESocial.EvtRemun.IdeTrabalhador.InfoComplem getInfoComplem() {
                return infoComplem;
            }

            /**
             * Define o valor da propriedade infoComplem.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem }
             *     
             */
            public void setInfoComplem(ESocial.EvtRemun.IdeTrabalhador.InfoComplem value) {
                this.infoComplem = value;
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
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nmTrab"/>
             *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtNascto"/>
             *         &lt;element name="sucessaoVinc" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
             *                   &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
             *                   &lt;element name="dtAdm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtAdm"/>
             *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                "nmTrab",
                "dtNascto",
                "sucessaoVinc"
            })
            public static class InfoComplem {

                @XmlElement(required = true)
                protected String nmTrab;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtNascto;
                protected ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc sucessaoVinc;

                /**
                 * Obtém o valor da propriedade nmTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNmTrab() {
                    return nmTrab;
                }

                /**
                 * Define o valor da propriedade nmTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNmTrab(String value) {
                    this.nmTrab = value;
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

                /**
                 * Obtém o valor da propriedade sucessaoVinc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc }
                 *     
                 */
                public ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc getSucessaoVinc() {
                    return sucessaoVinc;
                }

                /**
                 * Define o valor da propriedade sucessaoVinc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc }
                 *     
                 */
                public void setSucessaoVinc(ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc value) {
                    this.sucessaoVinc = value;
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
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
                 *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
                 *         &lt;element name="dtAdm" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_dtAdm"/>
                 *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                    "matricAnt",
                    "dtAdm",
                    "observacao"
                })
                public static class SucessaoVinc {

                    protected byte tpInsc;
                    @XmlElement(required = true)
                    protected String nrInsc;
                    protected String matricAnt;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtAdm;
                    protected String observacao;

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
                     * Obtém o valor da propriedade matricAnt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMatricAnt() {
                        return matricAnt;
                    }

                    /**
                     * Define o valor da propriedade matricAnt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMatricAnt(String value) {
                        this.matricAnt = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtAdm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtAdm() {
                        return dtAdm;
                    }

                    /**
                     * Define o valor da propriedade dtAdm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtAdm(XMLGregorianCalendar value) {
                        this.dtAdm = value;
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
             *         &lt;element name="indMV" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_indMV"/>
             *         &lt;element name="remunOutrEmpr" maxOccurs="999">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
             *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCategOE"/>
             *                   &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_vlrRemunOE"/>
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
                "indMV",
                "remunOutrEmpr"
            })
            public static class InfoMV {

                protected byte indMV;
                @XmlElement(required = true)
                protected List<ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr> remunOutrEmpr;

                /**
                 * Obtém o valor da propriedade indMV.
                 * 
                 */
                public byte getIndMV() {
                    return indMV;
                }

                /**
                 * Define o valor da propriedade indMV.
                 * 
                 */
                public void setIndMV(byte value) {
                    this.indMV = value;
                }

                /**
                 * Gets the value of the remunOutrEmpr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remunOutrEmpr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemunOutrEmpr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr }
                 * 
                 * 
                 */
                public List<ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr> getRemunOutrEmpr() {
                    if (remunOutrEmpr == null) {
                        remunOutrEmpr = new ArrayList<ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr>();
                    }
                    return this.remunOutrEmpr;
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
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_tpInsc_1_2"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_nrInsc_11_14"/>
                 *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_codCategOE"/>
                 *         &lt;element name="vlrRemunOE" type="{http://www.esocial.gov.br/schema/evt/evtRemun/v_S_01_00_00}TS_vlrRemunOE"/>
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
                    "codCateg",
                    "vlrRemunOE"
                })
                public static class RemunOutrEmpr {

                    protected byte tpInsc;
                    @XmlElement(required = true)
                    protected String nrInsc;
                    @XmlElement(required = true)
                    protected BigInteger codCateg;
                    @XmlElement(required = true)
                    protected BigDecimal vlrRemunOE;

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
                     * Obtém o valor da propriedade vlrRemunOE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrRemunOE() {
                        return vlrRemunOE;
                    }

                    /**
                     * Define o valor da propriedade vlrRemunOE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrRemunOE(BigDecimal value) {
                        this.vlrRemunOE = value;
                    }

                }

            }

        }

    }

}
