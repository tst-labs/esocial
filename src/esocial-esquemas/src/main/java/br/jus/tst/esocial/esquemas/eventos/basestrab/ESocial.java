//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:57 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.basestrab;

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
 *         &lt;element name="evtBasesTrab">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_ideEvento_retorno_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cpfRetorno"/>
 *                             &lt;element name="infoCompl" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
 *                                       &lt;element name="infoInterm" maxOccurs="31" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dia" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoComplCont" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cbo"/>
 *                                                 &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
 *                                                 &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
 *                             &lt;element name="procJudTrab" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrProcJud"/>
 *                                       &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codSusp"/>
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
 *                   &lt;element name="infoCpCalc" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpCR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;enumeration value="108201"/>
 *                                   &lt;enumeration value="108202"/>
 *                                   &lt;enumeration value="108203"/>
 *                                   &lt;enumeration value="108204"/>
 *                                   &lt;enumeration value="108221"/>
 *                                   &lt;enumeration value="108222"/>
 *                                   &lt;enumeration value="108223"/>
 *                                   &lt;enumeration value="108224"/>
 *                                   &lt;enumeration value="109901"/>
 *                                   &lt;enumeration value="109902"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vrCpSeg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
 *                             &lt;element name="vrDescSeg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoCp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ideEstabLot" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrInsc_11_12_14"/>
 *                                       &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial"/>
 *                                       &lt;element name="infoCategIncid" maxOccurs="10">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codCateg"/>
 *                                                 &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
 *                                                 &lt;element name="infoBaseCS" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
 *                                                           &lt;element name="tpValor">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                 &lt;enumeration value="11"/>
 *                                                                 &lt;enumeration value="12"/>
 *                                                                 &lt;enumeration value="13"/>
 *                                                                 &lt;enumeration value="14"/>
 *                                                                 &lt;enumeration value="15"/>
 *                                                                 &lt;enumeration value="16"/>
 *                                                                 &lt;enumeration value="17"/>
 *                                                                 &lt;enumeration value="18"/>
 *                                                                 &lt;enumeration value="19"/>
 *                                                                 &lt;enumeration value="21"/>
 *                                                                 &lt;enumeration value="22"/>
 *                                                                 &lt;enumeration value="23"/>
 *                                                                 &lt;enumeration value="31"/>
 *                                                                 &lt;enumeration value="32"/>
 *                                                                 &lt;enumeration value="41"/>
 *                                                                 &lt;enumeration value="42"/>
 *                                                                 &lt;enumeration value="43"/>
 *                                                                 &lt;enumeration value="44"/>
 *                                                                 &lt;enumeration value="45"/>
 *                                                                 &lt;enumeration value="46"/>
 *                                                                 &lt;enumeration value="47"/>
 *                                                                 &lt;enumeration value="48"/>
 *                                                                 &lt;enumeration value="49"/>
 *                                                                 &lt;enumeration value="81"/>
 *                                                                 &lt;enumeration value="82"/>
 *                                                                 &lt;enumeration value="83"/>
 *                                                                 &lt;enumeration value="84"/>
 *                                                                 &lt;enumeration value="85"/>
 *                                                                 &lt;enumeration value="86"/>
 *                                                                 &lt;enumeration value="87"/>
 *                                                                 &lt;enumeration value="88"/>
 *                                                                 &lt;enumeration value="91"/>
 *                                                                 &lt;enumeration value="92"/>
 *                                                                 &lt;enumeration value="93"/>
 *                                                                 &lt;enumeration value="94"/>
 *                                                                 &lt;enumeration value="95"/>
 *                                                                 &lt;enumeration value="96"/>
 *                                                                 &lt;enumeration value="97"/>
 *                                                                 &lt;enumeration value="98"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="calcTerc" maxOccurs="2" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpCR">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                                 &lt;enumeration value="121802"/>
 *                                                                 &lt;enumeration value="122102"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vrCsSegTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
 *                                                           &lt;element name="vrDescTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoPerRef" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_perApur"/>
 *                                                           &lt;element name="ideADC" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="dtAcConv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpAcConv"/>
 *                                                                     &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dsc"/>
 *                                                                     &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="detInfoPerRef" maxOccurs="99">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
 *                                                                     &lt;element name="tpVrPerRef">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                           &lt;enumeration value="11"/>
 *                                                                           &lt;enumeration value="12"/>
 *                                                                           &lt;enumeration value="13"/>
 *                                                                           &lt;enumeration value="14"/>
 *                                                                           &lt;enumeration value="15"/>
 *                                                                           &lt;enumeration value="16"/>
 *                                                                           &lt;enumeration value="17"/>
 *                                                                           &lt;enumeration value="18"/>
 *                                                                           &lt;enumeration value="19"/>
 *                                                                           &lt;enumeration value="21"/>
 *                                                                           &lt;enumeration value="22"/>
 *                                                                           &lt;enumeration value="23"/>
 *                                                                           &lt;enumeration value="31"/>
 *                                                                           &lt;enumeration value="32"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="vrPerRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_Id_retorno" />
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
    "evtBasesTrab",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtBasesTrab evtBasesTrab;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtBasesTrab.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtBasesTrab }
     *     
     */
    public ESocial.EvtBasesTrab getEvtBasesTrab() {
        return evtBasesTrab;
    }

    /**
     * Define o valor da propriedade evtBasesTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtBasesTrab }
     *     
     */
    public void setEvtBasesTrab(ESocial.EvtBasesTrab value) {
        this.evtBasesTrab = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_ideEvento_retorno_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cpfRetorno"/>
     *                   &lt;element name="infoCompl" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
     *                             &lt;element name="infoInterm" maxOccurs="31" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dia" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoComplCont" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cbo"/>
     *                                       &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
     *                                       &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
     *                   &lt;element name="procJudTrab" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrProcJud"/>
     *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codSusp"/>
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
     *         &lt;element name="infoCpCalc" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpCR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;enumeration value="108201"/>
     *                         &lt;enumeration value="108202"/>
     *                         &lt;enumeration value="108203"/>
     *                         &lt;enumeration value="108204"/>
     *                         &lt;enumeration value="108221"/>
     *                         &lt;enumeration value="108222"/>
     *                         &lt;enumeration value="108223"/>
     *                         &lt;enumeration value="108224"/>
     *                         &lt;enumeration value="109901"/>
     *                         &lt;enumeration value="109902"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vrCpSeg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
     *                   &lt;element name="vrDescSeg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoCp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ideEstabLot" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrInsc_11_12_14"/>
     *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial"/>
     *                             &lt;element name="infoCategIncid" maxOccurs="10">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codCateg"/>
     *                                       &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
     *                                       &lt;element name="infoBaseCS" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
     *                                                 &lt;element name="tpValor">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                       &lt;enumeration value="11"/>
     *                                                       &lt;enumeration value="12"/>
     *                                                       &lt;enumeration value="13"/>
     *                                                       &lt;enumeration value="14"/>
     *                                                       &lt;enumeration value="15"/>
     *                                                       &lt;enumeration value="16"/>
     *                                                       &lt;enumeration value="17"/>
     *                                                       &lt;enumeration value="18"/>
     *                                                       &lt;enumeration value="19"/>
     *                                                       &lt;enumeration value="21"/>
     *                                                       &lt;enumeration value="22"/>
     *                                                       &lt;enumeration value="23"/>
     *                                                       &lt;enumeration value="31"/>
     *                                                       &lt;enumeration value="32"/>
     *                                                       &lt;enumeration value="41"/>
     *                                                       &lt;enumeration value="42"/>
     *                                                       &lt;enumeration value="43"/>
     *                                                       &lt;enumeration value="44"/>
     *                                                       &lt;enumeration value="45"/>
     *                                                       &lt;enumeration value="46"/>
     *                                                       &lt;enumeration value="47"/>
     *                                                       &lt;enumeration value="48"/>
     *                                                       &lt;enumeration value="49"/>
     *                                                       &lt;enumeration value="81"/>
     *                                                       &lt;enumeration value="82"/>
     *                                                       &lt;enumeration value="83"/>
     *                                                       &lt;enumeration value="84"/>
     *                                                       &lt;enumeration value="85"/>
     *                                                       &lt;enumeration value="86"/>
     *                                                       &lt;enumeration value="87"/>
     *                                                       &lt;enumeration value="88"/>
     *                                                       &lt;enumeration value="91"/>
     *                                                       &lt;enumeration value="92"/>
     *                                                       &lt;enumeration value="93"/>
     *                                                       &lt;enumeration value="94"/>
     *                                                       &lt;enumeration value="95"/>
     *                                                       &lt;enumeration value="96"/>
     *                                                       &lt;enumeration value="97"/>
     *                                                       &lt;enumeration value="98"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="calcTerc" maxOccurs="2" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpCR">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                                       &lt;enumeration value="121802"/>
     *                                                       &lt;enumeration value="122102"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vrCsSegTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
     *                                                 &lt;element name="vrDescTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoPerRef" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_perApur"/>
     *                                                 &lt;element name="ideADC" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="dtAcConv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpAcConv"/>
     *                                                           &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dsc"/>
     *                                                           &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="detInfoPerRef" maxOccurs="99">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
     *                                                           &lt;element name="tpVrPerRef">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                 &lt;enumeration value="11"/>
     *                                                                 &lt;enumeration value="12"/>
     *                                                                 &lt;enumeration value="13"/>
     *                                                                 &lt;enumeration value="14"/>
     *                                                                 &lt;enumeration value="15"/>
     *                                                                 &lt;enumeration value="16"/>
     *                                                                 &lt;enumeration value="17"/>
     *                                                                 &lt;enumeration value="18"/>
     *                                                                 &lt;enumeration value="19"/>
     *                                                                 &lt;enumeration value="21"/>
     *                                                                 &lt;enumeration value="22"/>
     *                                                                 &lt;enumeration value="23"/>
     *                                                                 &lt;enumeration value="31"/>
     *                                                                 &lt;enumeration value="32"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="vrPerRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_Id_retorno" />
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
        "infoCpCalc",
        "infoCp"
    })
    public static class EvtBasesTrab {

        @XmlElement(required = true)
        protected TIdeEventoRetornoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtBasesTrab.IdeTrabalhador ideTrabalhador;
        protected List<ESocial.EvtBasesTrab.InfoCpCalc> infoCpCalc;
        protected ESocial.EvtBasesTrab.InfoCp infoCp;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoRetornoTrab }
         *     
         */
        public TIdeEventoRetornoTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoRetornoTrab }
         *     
         */
        public void setIdeEvento(TIdeEventoRetornoTrab value) {
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
         *     {@link ESocial.EvtBasesTrab.IdeTrabalhador }
         *     
         */
        public ESocial.EvtBasesTrab.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtBasesTrab.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtBasesTrab.IdeTrabalhador value) {
            this.ideTrabalhador = value;
        }

        /**
         * Gets the value of the infoCpCalc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoCpCalc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoCpCalc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESocial.EvtBasesTrab.InfoCpCalc }
         * 
         * 
         */
        public List<ESocial.EvtBasesTrab.InfoCpCalc> getInfoCpCalc() {
            if (infoCpCalc == null) {
                infoCpCalc = new ArrayList<ESocial.EvtBasesTrab.InfoCpCalc>();
            }
            return this.infoCpCalc;
        }

        /**
         * Obtém o valor da propriedade infoCp.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtBasesTrab.InfoCp }
         *     
         */
        public ESocial.EvtBasesTrab.InfoCp getInfoCp() {
            return infoCp;
        }

        /**
         * Define o valor da propriedade infoCp.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtBasesTrab.InfoCp }
         *     
         */
        public void setInfoCp(ESocial.EvtBasesTrab.InfoCp value) {
            this.infoCp = value;
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cpfRetorno"/>
         *         &lt;element name="infoCompl" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
         *                   &lt;element name="infoInterm" maxOccurs="31" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dia" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoComplCont" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cbo"/>
         *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
         *                             &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
         *         &lt;element name="procJudTrab" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrProcJud"/>
         *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codSusp"/>
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
            "cpfTrab",
            "infoCompl",
            "procJudTrab"
        })
        public static class IdeTrabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;
            protected ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl infoCompl;
            protected List<ESocial.EvtBasesTrab.IdeTrabalhador.ProcJudTrab> procJudTrab;

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
             * Obtém o valor da propriedade infoCompl.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl }
             *     
             */
            public ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl getInfoCompl() {
                return infoCompl;
            }

            /**
             * Define o valor da propriedade infoCompl.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl }
             *     
             */
            public void setInfoCompl(ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl value) {
                this.infoCompl = value;
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
             * {@link ESocial.EvtBasesTrab.IdeTrabalhador.ProcJudTrab }
             * 
             * 
             */
            public List<ESocial.EvtBasesTrab.IdeTrabalhador.ProcJudTrab> getProcJudTrab() {
                if (procJudTrab == null) {
                    procJudTrab = new ArrayList<ESocial.EvtBasesTrab.IdeTrabalhador.ProcJudTrab>();
                }
                return this.procJudTrab;
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
             *         &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
             *         &lt;element name="infoInterm" maxOccurs="31" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dia" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoComplCont" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cbo"/>
             *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
             *                   &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
                "sucessaoVinc",
                "infoInterm",
                "infoComplCont"
            })
            public static class InfoCompl {

                protected TSucessaoVinc sucessaoVinc;
                protected List<ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoInterm> infoInterm;
                protected List<ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoComplCont> infoComplCont;

                /**
                 * Obtém o valor da propriedade sucessaoVinc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSucessaoVinc }
                 *     
                 */
                public TSucessaoVinc getSucessaoVinc() {
                    return sucessaoVinc;
                }

                /**
                 * Define o valor da propriedade sucessaoVinc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSucessaoVinc }
                 *     
                 */
                public void setSucessaoVinc(TSucessaoVinc value) {
                    this.sucessaoVinc = value;
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
                 * {@link ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoInterm }
                 * 
                 * 
                 */
                public List<ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoInterm> getInfoInterm() {
                    if (infoInterm == null) {
                        infoInterm = new ArrayList<ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoInterm>();
                    }
                    return this.infoInterm;
                }

                /**
                 * Gets the value of the infoComplCont property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoComplCont property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoComplCont().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoComplCont }
                 * 
                 * 
                 */
                public List<ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoComplCont> getInfoComplCont() {
                    if (infoComplCont == null) {
                        infoComplCont = new ArrayList<ESocial.EvtBasesTrab.IdeTrabalhador.InfoCompl.InfoComplCont>();
                    }
                    return this.infoComplCont;
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
                 *         &lt;element name="codCBO" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_cbo"/>
                 *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
                 *         &lt;element name="qtdDiasTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia" minOccurs="0"/>
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
                 *         &lt;element name="dia" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dia"/>
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
                    "dia"
                })
                public static class InfoInterm {

                    protected byte dia;

                    /**
                     * Obtém o valor da propriedade dia.
                     * 
                     */
                    public byte getDia() {
                        return dia;
                    }

                    /**
                     * Define o valor da propriedade dia.
                     * 
                     */
                    public void setDia(byte value) {
                        this.dia = value;
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
             *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrProcJud"/>
             *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codSusp"/>
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
                "nrProcJud",
                "codSusp"
            })
            public static class ProcJudTrab {

                @XmlElement(required = true)
                protected String nrProcJud;
                @XmlElement(required = true)
                protected BigInteger codSusp;

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
         *         &lt;element name="ideEstabLot" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrInsc_11_12_14"/>
         *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial"/>
         *                   &lt;element name="infoCategIncid" maxOccurs="10">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codCateg"/>
         *                             &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
         *                             &lt;element name="infoBaseCS" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
         *                                       &lt;element name="tpValor">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                             &lt;enumeration value="11"/>
         *                                             &lt;enumeration value="12"/>
         *                                             &lt;enumeration value="13"/>
         *                                             &lt;enumeration value="14"/>
         *                                             &lt;enumeration value="15"/>
         *                                             &lt;enumeration value="16"/>
         *                                             &lt;enumeration value="17"/>
         *                                             &lt;enumeration value="18"/>
         *                                             &lt;enumeration value="19"/>
         *                                             &lt;enumeration value="21"/>
         *                                             &lt;enumeration value="22"/>
         *                                             &lt;enumeration value="23"/>
         *                                             &lt;enumeration value="31"/>
         *                                             &lt;enumeration value="32"/>
         *                                             &lt;enumeration value="41"/>
         *                                             &lt;enumeration value="42"/>
         *                                             &lt;enumeration value="43"/>
         *                                             &lt;enumeration value="44"/>
         *                                             &lt;enumeration value="45"/>
         *                                             &lt;enumeration value="46"/>
         *                                             &lt;enumeration value="47"/>
         *                                             &lt;enumeration value="48"/>
         *                                             &lt;enumeration value="49"/>
         *                                             &lt;enumeration value="81"/>
         *                                             &lt;enumeration value="82"/>
         *                                             &lt;enumeration value="83"/>
         *                                             &lt;enumeration value="84"/>
         *                                             &lt;enumeration value="85"/>
         *                                             &lt;enumeration value="86"/>
         *                                             &lt;enumeration value="87"/>
         *                                             &lt;enumeration value="88"/>
         *                                             &lt;enumeration value="91"/>
         *                                             &lt;enumeration value="92"/>
         *                                             &lt;enumeration value="93"/>
         *                                             &lt;enumeration value="94"/>
         *                                             &lt;enumeration value="95"/>
         *                                             &lt;enumeration value="96"/>
         *                                             &lt;enumeration value="97"/>
         *                                             &lt;enumeration value="98"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="calcTerc" maxOccurs="2" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpCR">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                             &lt;enumeration value="121802"/>
         *                                             &lt;enumeration value="122102"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vrCsSegTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
         *                                       &lt;element name="vrDescTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="infoPerRef" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_perApur"/>
         *                                       &lt;element name="ideADC" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="dtAcConv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpAcConv"/>
         *                                                 &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dsc"/>
         *                                                 &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="detInfoPerRef" maxOccurs="99">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
         *                                                 &lt;element name="tpVrPerRef">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                       &lt;enumeration value="11"/>
         *                                                       &lt;enumeration value="12"/>
         *                                                       &lt;enumeration value="13"/>
         *                                                       &lt;enumeration value="14"/>
         *                                                       &lt;enumeration value="15"/>
         *                                                       &lt;enumeration value="16"/>
         *                                                       &lt;enumeration value="17"/>
         *                                                       &lt;enumeration value="18"/>
         *                                                       &lt;enumeration value="19"/>
         *                                                       &lt;enumeration value="21"/>
         *                                                       &lt;enumeration value="22"/>
         *                                                       &lt;enumeration value="23"/>
         *                                                       &lt;enumeration value="31"/>
         *                                                       &lt;enumeration value="32"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="vrPerRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
            "ideEstabLot"
        })
        public static class InfoCp {

            @XmlElement(required = true)
            protected List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot> ideEstabLot;

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
             * {@link ESocial.EvtBasesTrab.InfoCp.IdeEstabLot }
             * 
             * 
             */
            public List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot> getIdeEstabLot() {
                if (ideEstabLot == null) {
                    ideEstabLot = new ArrayList<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot>();
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
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_nrInsc_11_12_14"/>
             *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial"/>
             *         &lt;element name="infoCategIncid" maxOccurs="10">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codCateg"/>
             *                   &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
             *                   &lt;element name="infoBaseCS" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
             *                             &lt;element name="tpValor">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                   &lt;enumeration value="11"/>
             *                                   &lt;enumeration value="12"/>
             *                                   &lt;enumeration value="13"/>
             *                                   &lt;enumeration value="14"/>
             *                                   &lt;enumeration value="15"/>
             *                                   &lt;enumeration value="16"/>
             *                                   &lt;enumeration value="17"/>
             *                                   &lt;enumeration value="18"/>
             *                                   &lt;enumeration value="19"/>
             *                                   &lt;enumeration value="21"/>
             *                                   &lt;enumeration value="22"/>
             *                                   &lt;enumeration value="23"/>
             *                                   &lt;enumeration value="31"/>
             *                                   &lt;enumeration value="32"/>
             *                                   &lt;enumeration value="41"/>
             *                                   &lt;enumeration value="42"/>
             *                                   &lt;enumeration value="43"/>
             *                                   &lt;enumeration value="44"/>
             *                                   &lt;enumeration value="45"/>
             *                                   &lt;enumeration value="46"/>
             *                                   &lt;enumeration value="47"/>
             *                                   &lt;enumeration value="48"/>
             *                                   &lt;enumeration value="49"/>
             *                                   &lt;enumeration value="81"/>
             *                                   &lt;enumeration value="82"/>
             *                                   &lt;enumeration value="83"/>
             *                                   &lt;enumeration value="84"/>
             *                                   &lt;enumeration value="85"/>
             *                                   &lt;enumeration value="86"/>
             *                                   &lt;enumeration value="87"/>
             *                                   &lt;enumeration value="88"/>
             *                                   &lt;enumeration value="91"/>
             *                                   &lt;enumeration value="92"/>
             *                                   &lt;enumeration value="93"/>
             *                                   &lt;enumeration value="94"/>
             *                                   &lt;enumeration value="95"/>
             *                                   &lt;enumeration value="96"/>
             *                                   &lt;enumeration value="97"/>
             *                                   &lt;enumeration value="98"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="calcTerc" maxOccurs="2" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpCR">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                                   &lt;enumeration value="121802"/>
             *                                   &lt;enumeration value="122102"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vrCsSegTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
             *                             &lt;element name="vrDescTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infoPerRef" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_perApur"/>
             *                             &lt;element name="ideADC" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="dtAcConv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpAcConv"/>
             *                                       &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dsc"/>
             *                                       &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="detInfoPerRef" maxOccurs="99">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
             *                                       &lt;element name="tpVrPerRef">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                             &lt;enumeration value="11"/>
             *                                             &lt;enumeration value="12"/>
             *                                             &lt;enumeration value="13"/>
             *                                             &lt;enumeration value="14"/>
             *                                             &lt;enumeration value="15"/>
             *                                             &lt;enumeration value="16"/>
             *                                             &lt;enumeration value="17"/>
             *                                             &lt;enumeration value="18"/>
             *                                             &lt;enumeration value="19"/>
             *                                             &lt;enumeration value="21"/>
             *                                             &lt;enumeration value="22"/>
             *                                             &lt;enumeration value="23"/>
             *                                             &lt;enumeration value="31"/>
             *                                             &lt;enumeration value="32"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="vrPerRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
                "tpInsc",
                "nrInsc",
                "codLotacao",
                "infoCategIncid"
            })
            public static class IdeEstabLot {

                protected byte tpInsc;
                @XmlElement(required = true)
                protected String nrInsc;
                @XmlElement(required = true)
                protected String codLotacao;
                @XmlElement(required = true)
                protected List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid> infoCategIncid;

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
                 * Gets the value of the infoCategIncid property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoCategIncid property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoCategIncid().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid }
                 * 
                 * 
                 */
                public List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid> getInfoCategIncid() {
                    if (infoCategIncid == null) {
                        infoCategIncid = new ArrayList<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid>();
                    }
                    return this.infoCategIncid;
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
                 *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                 *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_codCateg"/>
                 *         &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_indSimples" minOccurs="0"/>
                 *         &lt;element name="infoBaseCS" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
                 *                   &lt;element name="tpValor">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;enumeration value="11"/>
                 *                         &lt;enumeration value="12"/>
                 *                         &lt;enumeration value="13"/>
                 *                         &lt;enumeration value="14"/>
                 *                         &lt;enumeration value="15"/>
                 *                         &lt;enumeration value="16"/>
                 *                         &lt;enumeration value="17"/>
                 *                         &lt;enumeration value="18"/>
                 *                         &lt;enumeration value="19"/>
                 *                         &lt;enumeration value="21"/>
                 *                         &lt;enumeration value="22"/>
                 *                         &lt;enumeration value="23"/>
                 *                         &lt;enumeration value="31"/>
                 *                         &lt;enumeration value="32"/>
                 *                         &lt;enumeration value="41"/>
                 *                         &lt;enumeration value="42"/>
                 *                         &lt;enumeration value="43"/>
                 *                         &lt;enumeration value="44"/>
                 *                         &lt;enumeration value="45"/>
                 *                         &lt;enumeration value="46"/>
                 *                         &lt;enumeration value="47"/>
                 *                         &lt;enumeration value="48"/>
                 *                         &lt;enumeration value="49"/>
                 *                         &lt;enumeration value="81"/>
                 *                         &lt;enumeration value="82"/>
                 *                         &lt;enumeration value="83"/>
                 *                         &lt;enumeration value="84"/>
                 *                         &lt;enumeration value="85"/>
                 *                         &lt;enumeration value="86"/>
                 *                         &lt;enumeration value="87"/>
                 *                         &lt;enumeration value="88"/>
                 *                         &lt;enumeration value="91"/>
                 *                         &lt;enumeration value="92"/>
                 *                         &lt;enumeration value="93"/>
                 *                         &lt;enumeration value="94"/>
                 *                         &lt;enumeration value="95"/>
                 *                         &lt;enumeration value="96"/>
                 *                         &lt;enumeration value="97"/>
                 *                         &lt;enumeration value="98"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="calcTerc" maxOccurs="2" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpCR">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *                         &lt;enumeration value="121802"/>
                 *                         &lt;enumeration value="122102"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vrCsSegTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
                 *                   &lt;element name="vrDescTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="infoPerRef" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_perApur"/>
                 *                   &lt;element name="ideADC" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="dtAcConv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpAcConv"/>
                 *                             &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dsc"/>
                 *                             &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="detInfoPerRef" maxOccurs="99">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
                 *                             &lt;element name="tpVrPerRef">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                   &lt;enumeration value="11"/>
                 *                                   &lt;enumeration value="12"/>
                 *                                   &lt;enumeration value="13"/>
                 *                                   &lt;enumeration value="14"/>
                 *                                   &lt;enumeration value="15"/>
                 *                                   &lt;enumeration value="16"/>
                 *                                   &lt;enumeration value="17"/>
                 *                                   &lt;enumeration value="18"/>
                 *                                   &lt;enumeration value="19"/>
                 *                                   &lt;enumeration value="21"/>
                 *                                   &lt;enumeration value="22"/>
                 *                                   &lt;enumeration value="23"/>
                 *                                   &lt;enumeration value="31"/>
                 *                                   &lt;enumeration value="32"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="vrPerRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
                    "matricula",
                    "codCateg",
                    "indSimples",
                    "infoBaseCS",
                    "calcTerc",
                    "infoPerRef"
                })
                public static class InfoCategIncid {

                    protected String matricula;
                    @XmlElement(required = true)
                    protected BigInteger codCateg;
                    protected Byte indSimples;
                    protected List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoBaseCS> infoBaseCS;
                    protected List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.CalcTerc> calcTerc;
                    @XmlElement(required = true)
                    protected List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef> infoPerRef;

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
                     * Gets the value of the infoBaseCS property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoBaseCS property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoBaseCS().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoBaseCS }
                     * 
                     * 
                     */
                    public List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoBaseCS> getInfoBaseCS() {
                        if (infoBaseCS == null) {
                            infoBaseCS = new ArrayList<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoBaseCS>();
                        }
                        return this.infoBaseCS;
                    }

                    /**
                     * Gets the value of the calcTerc property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the calcTerc property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCalcTerc().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.CalcTerc }
                     * 
                     * 
                     */
                    public List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.CalcTerc> getCalcTerc() {
                        if (calcTerc == null) {
                            calcTerc = new ArrayList<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.CalcTerc>();
                        }
                        return this.calcTerc;
                    }

                    /**
                     * Gets the value of the infoPerRef property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoPerRef property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoPerRef().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef }
                     * 
                     * 
                     */
                    public List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef> getInfoPerRef() {
                        if (infoPerRef == null) {
                            infoPerRef = new ArrayList<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef>();
                        }
                        return this.infoPerRef;
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
                     *         &lt;element name="tpCR">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                     *               &lt;enumeration value="121802"/>
                     *               &lt;enumeration value="122102"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vrCsSegTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
                     *         &lt;element name="vrDescTerc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
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
                        "tpCR",
                        "vrCsSegTerc",
                        "vrDescTerc"
                    })
                    public static class CalcTerc {

                        @XmlElement(required = true)
                        protected BigInteger tpCR;
                        @XmlElement(required = true)
                        protected BigDecimal vrCsSegTerc;
                        @XmlElement(required = true)
                        protected BigDecimal vrDescTerc;

                        /**
                         * Obtém o valor da propriedade tpCR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getTpCR() {
                            return tpCR;
                        }

                        /**
                         * Define o valor da propriedade tpCR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setTpCR(BigInteger value) {
                            this.tpCR = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrCsSegTerc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrCsSegTerc() {
                            return vrCsSegTerc;
                        }

                        /**
                         * Define o valor da propriedade vrCsSegTerc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrCsSegTerc(BigDecimal value) {
                            this.vrCsSegTerc = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrDescTerc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrDescTerc() {
                            return vrDescTerc;
                        }

                        /**
                         * Define o valor da propriedade vrDescTerc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrDescTerc(BigDecimal value) {
                            this.vrDescTerc = value;
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
                     *         &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
                     *         &lt;element name="tpValor">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;enumeration value="11"/>
                     *               &lt;enumeration value="12"/>
                     *               &lt;enumeration value="13"/>
                     *               &lt;enumeration value="14"/>
                     *               &lt;enumeration value="15"/>
                     *               &lt;enumeration value="16"/>
                     *               &lt;enumeration value="17"/>
                     *               &lt;enumeration value="18"/>
                     *               &lt;enumeration value="19"/>
                     *               &lt;enumeration value="21"/>
                     *               &lt;enumeration value="22"/>
                     *               &lt;enumeration value="23"/>
                     *               &lt;enumeration value="31"/>
                     *               &lt;enumeration value="32"/>
                     *               &lt;enumeration value="41"/>
                     *               &lt;enumeration value="42"/>
                     *               &lt;enumeration value="43"/>
                     *               &lt;enumeration value="44"/>
                     *               &lt;enumeration value="45"/>
                     *               &lt;enumeration value="46"/>
                     *               &lt;enumeration value="47"/>
                     *               &lt;enumeration value="48"/>
                     *               &lt;enumeration value="49"/>
                     *               &lt;enumeration value="81"/>
                     *               &lt;enumeration value="82"/>
                     *               &lt;enumeration value="83"/>
                     *               &lt;enumeration value="84"/>
                     *               &lt;enumeration value="85"/>
                     *               &lt;enumeration value="86"/>
                     *               &lt;enumeration value="87"/>
                     *               &lt;enumeration value="88"/>
                     *               &lt;enumeration value="91"/>
                     *               &lt;enumeration value="92"/>
                     *               &lt;enumeration value="93"/>
                     *               &lt;enumeration value="94"/>
                     *               &lt;enumeration value="95"/>
                     *               &lt;enumeration value="96"/>
                     *               &lt;enumeration value="97"/>
                     *               &lt;enumeration value="98"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
                        "ind13",
                        "tpValor",
                        "valor"
                    })
                    public static class InfoBaseCS {

                        protected byte ind13;
                        protected byte tpValor;
                        @XmlElement(required = true)
                        protected BigDecimal valor;

                        /**
                         * Obtém o valor da propriedade ind13.
                         * 
                         */
                        public byte getInd13() {
                            return ind13;
                        }

                        /**
                         * Define o valor da propriedade ind13.
                         * 
                         */
                        public void setInd13(byte value) {
                            this.ind13 = value;
                        }

                        /**
                         * Obtém o valor da propriedade tpValor.
                         * 
                         */
                        public byte getTpValor() {
                            return tpValor;
                        }

                        /**
                         * Define o valor da propriedade tpValor.
                         * 
                         */
                        public void setTpValor(byte value) {
                            this.tpValor = value;
                        }

                        /**
                         * Obtém o valor da propriedade valor.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getValor() {
                            return valor;
                        }

                        /**
                         * Define o valor da propriedade valor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setValor(BigDecimal value) {
                            this.valor = value;
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
                     *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_perApur"/>
                     *         &lt;element name="ideADC" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="dtAcConv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpAcConv"/>
                     *                   &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dsc"/>
                     *                   &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="detInfoPerRef" maxOccurs="99">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
                     *                   &lt;element name="tpVrPerRef">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                         &lt;enumeration value="11"/>
                     *                         &lt;enumeration value="12"/>
                     *                         &lt;enumeration value="13"/>
                     *                         &lt;enumeration value="14"/>
                     *                         &lt;enumeration value="15"/>
                     *                         &lt;enumeration value="16"/>
                     *                         &lt;enumeration value="17"/>
                     *                         &lt;enumeration value="18"/>
                     *                         &lt;enumeration value="19"/>
                     *                         &lt;enumeration value="21"/>
                     *                         &lt;enumeration value="22"/>
                     *                         &lt;enumeration value="23"/>
                     *                         &lt;enumeration value="31"/>
                     *                         &lt;enumeration value="32"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="vrPerRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
                        "ideADC",
                        "detInfoPerRef"
                    })
                    public static class InfoPerRef {

                        @XmlElement(required = true)
                        protected String perRef;
                        protected List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.IdeADC> ideADC;
                        @XmlElement(required = true)
                        protected List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.DetInfoPerRef> detInfoPerRef;

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
                         * {@link ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.IdeADC }
                         * 
                         * 
                         */
                        public List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.IdeADC> getIdeADC() {
                            if (ideADC == null) {
                                ideADC = new ArrayList<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.IdeADC>();
                            }
                            return this.ideADC;
                        }

                        /**
                         * Gets the value of the detInfoPerRef property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the detInfoPerRef property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDetInfoPerRef().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.DetInfoPerRef }
                         * 
                         * 
                         */
                        public List<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.DetInfoPerRef> getDetInfoPerRef() {
                            if (detInfoPerRef == null) {
                                detInfoPerRef = new ArrayList<ESocial.EvtBasesTrab.InfoCp.IdeEstabLot.InfoCategIncid.InfoPerRef.DetInfoPerRef>();
                            }
                            return this.detInfoPerRef;
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
                         *         &lt;element name="ind13" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_ind13"/>
                         *         &lt;element name="tpVrPerRef">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                         *               &lt;enumeration value="11"/>
                         *               &lt;enumeration value="12"/>
                         *               &lt;enumeration value="13"/>
                         *               &lt;enumeration value="14"/>
                         *               &lt;enumeration value="15"/>
                         *               &lt;enumeration value="16"/>
                         *               &lt;enumeration value="17"/>
                         *               &lt;enumeration value="18"/>
                         *               &lt;enumeration value="19"/>
                         *               &lt;enumeration value="21"/>
                         *               &lt;enumeration value="22"/>
                         *               &lt;enumeration value="23"/>
                         *               &lt;enumeration value="31"/>
                         *               &lt;enumeration value="32"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="vrPerRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario_positivo"/>
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
                            "ind13",
                            "tpVrPerRef",
                            "vrPerRef"
                        })
                        public static class DetInfoPerRef {

                            protected byte ind13;
                            protected byte tpVrPerRef;
                            @XmlElement(required = true)
                            protected BigDecimal vrPerRef;

                            /**
                             * Obtém o valor da propriedade ind13.
                             * 
                             */
                            public byte getInd13() {
                                return ind13;
                            }

                            /**
                             * Define o valor da propriedade ind13.
                             * 
                             */
                            public void setInd13(byte value) {
                                this.ind13 = value;
                            }

                            /**
                             * Obtém o valor da propriedade tpVrPerRef.
                             * 
                             */
                            public byte getTpVrPerRef() {
                                return tpVrPerRef;
                            }

                            /**
                             * Define o valor da propriedade tpVrPerRef.
                             * 
                             */
                            public void setTpVrPerRef(byte value) {
                                this.tpVrPerRef = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrPerRef.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrPerRef() {
                                return vrPerRef;
                            }

                            /**
                             * Define o valor da propriedade vrPerRef.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrPerRef(BigDecimal value) {
                                this.vrPerRef = value;
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
                         *         &lt;element name="dtAcConv" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_tpAcConv"/>
                         *         &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_dsc"/>
                         *         &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
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
                            "remunSuc"
                        })
                        public static class IdeADC {

                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar dtAcConv;
                            @XmlElement(required = true)
                            @XmlSchemaType(name = "string")
                            protected TSTpAcConv tpAcConv;
                            @XmlElement(required = true)
                            protected String dsc;
                            @XmlSchemaType(name = "string")
                            protected TSSimNao remunSuc;

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
         *         &lt;element name="tpCR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;enumeration value="108201"/>
         *               &lt;enumeration value="108202"/>
         *               &lt;enumeration value="108203"/>
         *               &lt;enumeration value="108204"/>
         *               &lt;enumeration value="108221"/>
         *               &lt;enumeration value="108222"/>
         *               &lt;enumeration value="108223"/>
         *               &lt;enumeration value="108224"/>
         *               &lt;enumeration value="109901"/>
         *               &lt;enumeration value="109902"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vrCpSeg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
         *         &lt;element name="vrDescSeg" type="{http://www.esocial.gov.br/schema/evt/evtBasesTrab/v_S_01_00_00}TS_valorMonetario"/>
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
            "tpCR",
            "vrCpSeg",
            "vrDescSeg"
        })
        public static class InfoCpCalc {

            @XmlElement(required = true)
            protected BigInteger tpCR;
            @XmlElement(required = true)
            protected BigDecimal vrCpSeg;
            @XmlElement(required = true)
            protected BigDecimal vrDescSeg;

            /**
             * Obtém o valor da propriedade tpCR.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTpCR() {
                return tpCR;
            }

            /**
             * Define o valor da propriedade tpCR.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTpCR(BigInteger value) {
                this.tpCR = value;
            }

            /**
             * Obtém o valor da propriedade vrCpSeg.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrCpSeg() {
                return vrCpSeg;
            }

            /**
             * Define o valor da propriedade vrCpSeg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrCpSeg(BigDecimal value) {
                this.vrCpSeg = value;
            }

            /**
             * Obtém o valor da propriedade vrDescSeg.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrDescSeg() {
                return vrDescSeg;
            }

            /**
             * Define o valor da propriedade vrDescSeg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrDescSeg(BigDecimal value) {
                this.vrDescSeg = value;
            }

        }

    }

}
