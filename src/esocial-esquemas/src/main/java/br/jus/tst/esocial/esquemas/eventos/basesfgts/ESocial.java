//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:55 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.basesfgts;

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
 *         &lt;element name="evtBasesFGTS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_ideEvento_retorno_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_cpfRetorno"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoFGTS">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtVenc" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="ideEstab" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4" minOccurs="0"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
 *                                       &lt;element name="ideLotacao" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                                 &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpLotacao" minOccurs="0"/>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
 *                                                 &lt;element name="infoTrabFGTS" maxOccurs="99">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                                           &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg"/>
 *                                                           &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
 *                                                           &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
 *                                                           &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                           &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;element name="mtvDeslig" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{2}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;element name="mtvDesligTSV" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{2}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
 *                                                           &lt;element name="infoBaseFGTS" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="tpValor">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                                     &lt;enumeration value="11"/>
 *                                                                                     &lt;enumeration value="12"/>
 *                                                                                     &lt;enumeration value="13"/>
 *                                                                                     &lt;enumeration value="14"/>
 *                                                                                     &lt;enumeration value="15"/>
 *                                                                                     &lt;enumeration value="16"/>
 *                                                                                     &lt;enumeration value="17"/>
 *                                                                                     &lt;enumeration value="18"/>
 *                                                                                     &lt;enumeration value="21"/>
 *                                                                                     &lt;enumeration value="22"/>
 *                                                                                     &lt;enumeration value="23"/>
 *                                                                                     &lt;enumeration value="24"/>
 *                                                                                     &lt;enumeration value="25"/>
 *                                                                                     &lt;enumeration value="26"/>
 *                                                                                     &lt;enumeration value="27"/>
 *                                                                                     &lt;enumeration value="28"/>
 *                                                                                     &lt;enumeration value="29"/>
 *                                                                                     &lt;enumeration value="30"/>
 *                                                                                     &lt;enumeration value="31"/>
 *                                                                                     &lt;enumeration value="32"/>
 *                                                                                     &lt;enumeration value="41"/>
 *                                                                                     &lt;enumeration value="42"/>
 *                                                                                     &lt;enumeration value="43"/>
 *                                                                                     &lt;enumeration value="44"/>
 *                                                                                     &lt;enumeration value="45"/>
 *                                                                                     &lt;enumeration value="46"/>
 *                                                                                     &lt;enumeration value="47"/>
 *                                                                                     &lt;enumeration value="48"/>
 *                                                                                     &lt;enumeration value="49"/>
 *                                                                                     &lt;enumeration value="50"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
 *                                                                               &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                                               &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                               &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
 *                                                                               &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
 *                                                                               &lt;element name="basePerAntE" maxOccurs="99">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
 *                                                                                         &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
 *                                                                                         &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                                                         &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                                         &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
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
 *                                                           &lt;element name="procCS" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_Id_retorno" />
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
    "evtBasesFGTS",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtBasesFGTS evtBasesFGTS;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtBasesFGTS.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtBasesFGTS }
     *     
     */
    public ESocial.EvtBasesFGTS getEvtBasesFGTS() {
        return evtBasesFGTS;
    }

    /**
     * Define o valor da propriedade evtBasesFGTS.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtBasesFGTS }
     *     
     */
    public void setEvtBasesFGTS(ESocial.EvtBasesFGTS value) {
        this.evtBasesFGTS = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_ideEvento_retorno_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_cpfRetorno"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoFGTS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtVenc" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="ideEstab" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4" minOccurs="0"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
     *                             &lt;element name="ideLotacao" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                                       &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpLotacao" minOccurs="0"/>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
     *                                       &lt;element name="infoTrabFGTS" maxOccurs="99">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg"/>
     *                                                 &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
     *                                                 &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
     *                                                 &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                                 &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;element name="mtvDeslig" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{2}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;element name="mtvDesligTSV" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{2}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
     *                                                 &lt;element name="infoBaseFGTS" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="tpValor">
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
     *                                                                           &lt;enumeration value="21"/>
     *                                                                           &lt;enumeration value="22"/>
     *                                                                           &lt;enumeration value="23"/>
     *                                                                           &lt;enumeration value="24"/>
     *                                                                           &lt;enumeration value="25"/>
     *                                                                           &lt;enumeration value="26"/>
     *                                                                           &lt;enumeration value="27"/>
     *                                                                           &lt;enumeration value="28"/>
     *                                                                           &lt;enumeration value="29"/>
     *                                                                           &lt;enumeration value="30"/>
     *                                                                           &lt;enumeration value="31"/>
     *                                                                           &lt;enumeration value="32"/>
     *                                                                           &lt;enumeration value="41"/>
     *                                                                           &lt;enumeration value="42"/>
     *                                                                           &lt;enumeration value="43"/>
     *                                                                           &lt;enumeration value="44"/>
     *                                                                           &lt;enumeration value="45"/>
     *                                                                           &lt;enumeration value="46"/>
     *                                                                           &lt;enumeration value="47"/>
     *                                                                           &lt;enumeration value="48"/>
     *                                                                           &lt;enumeration value="49"/>
     *                                                                           &lt;enumeration value="50"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
     *                                                                     &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                                                     &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                     &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
     *                                                                     &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
     *                                                                     &lt;element name="basePerAntE" maxOccurs="99">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
     *                                                                               &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
     *                                                                               &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                                                               &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                               &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
     *                                                 &lt;element name="procCS" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_Id_retorno" />
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
        "infoFGTS"
    })
    public static class EvtBasesFGTS {

        @XmlElement(required = true)
        protected TIdeEventoRetornoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtBasesFGTS.IdeTrabalhador ideTrabalhador;
        @XmlElement(required = true)
        protected ESocial.EvtBasesFGTS.InfoFGTS infoFGTS;
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
         *     {@link ESocial.EvtBasesFGTS.IdeTrabalhador }
         *     
         */
        public ESocial.EvtBasesFGTS.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtBasesFGTS.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtBasesFGTS.IdeTrabalhador value) {
            this.ideTrabalhador = value;
        }

        /**
         * Obtém o valor da propriedade infoFGTS.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtBasesFGTS.InfoFGTS }
         *     
         */
        public ESocial.EvtBasesFGTS.InfoFGTS getInfoFGTS() {
            return infoFGTS;
        }

        /**
         * Define o valor da propriedade infoFGTS.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtBasesFGTS.InfoFGTS }
         *     
         */
        public void setInfoFGTS(ESocial.EvtBasesFGTS.InfoFGTS value) {
            this.infoFGTS = value;
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_cpfRetorno"/>
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
            "cpfTrab"
        })
        public static class IdeTrabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;

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
         *         &lt;element name="dtVenc" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="ideEstab" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4" minOccurs="0"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
         *                   &lt;element name="ideLotacao" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                             &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpLotacao" minOccurs="0"/>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
         *                             &lt;element name="infoTrabFGTS" maxOccurs="99">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg"/>
         *                                       &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
         *                                       &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
         *                                       &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                                       &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;element name="mtvDeslig" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{2}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;element name="mtvDesligTSV" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{2}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
         *                                       &lt;element name="infoBaseFGTS" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
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
         *                                                                 &lt;enumeration value="21"/>
         *                                                                 &lt;enumeration value="22"/>
         *                                                                 &lt;enumeration value="23"/>
         *                                                                 &lt;enumeration value="24"/>
         *                                                                 &lt;enumeration value="25"/>
         *                                                                 &lt;enumeration value="26"/>
         *                                                                 &lt;enumeration value="27"/>
         *                                                                 &lt;enumeration value="28"/>
         *                                                                 &lt;enumeration value="29"/>
         *                                                                 &lt;enumeration value="30"/>
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
         *                                                                 &lt;enumeration value="50"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
         *                                                           &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                                                           &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                           &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
         *                                                           &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
         *                                                           &lt;element name="basePerAntE" maxOccurs="99">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
         *                                                                     &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
         *                                                                     &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                                                                     &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                                     &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
         *                                       &lt;element name="procCS" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
            "dtVenc",
            "ideEstab"
        })
        public static class InfoFGTS {

            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtVenc;
            @XmlElement(required = true)
            protected List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab> ideEstab;

            /**
             * Obtém o valor da propriedade dtVenc.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtVenc() {
                return dtVenc;
            }

            /**
             * Define o valor da propriedade dtVenc.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtVenc(XMLGregorianCalendar value) {
                this.dtVenc = value;
            }

            /**
             * Gets the value of the ideEstab property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ideEstab property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIdeEstab().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab }
             * 
             * 
             */
            public List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab> getIdeEstab() {
                if (ideEstab == null) {
                    ideEstab = new ArrayList<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab>();
                }
                return this.ideEstab;
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
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4" minOccurs="0"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
             *         &lt;element name="ideLotacao" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *                   &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpLotacao" minOccurs="0"/>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
             *                   &lt;element name="infoTrabFGTS" maxOccurs="99">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg"/>
             *                             &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
             *                             &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
             *                             &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                             &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;element name="mtvDeslig" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{2}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;element name="mtvDesligTSV" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{2}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
             *                             &lt;element name="infoBaseFGTS" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
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
             *                                                       &lt;enumeration value="21"/>
             *                                                       &lt;enumeration value="22"/>
             *                                                       &lt;enumeration value="23"/>
             *                                                       &lt;enumeration value="24"/>
             *                                                       &lt;enumeration value="25"/>
             *                                                       &lt;enumeration value="26"/>
             *                                                       &lt;enumeration value="27"/>
             *                                                       &lt;enumeration value="28"/>
             *                                                       &lt;enumeration value="29"/>
             *                                                       &lt;enumeration value="30"/>
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
             *                                                       &lt;enumeration value="50"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
             *                                                 &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                                                 &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                                 &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
             *                                                 &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
             *                                                 &lt;element name="basePerAntE" maxOccurs="99">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
             *                                                           &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
             *                                                           &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                                                           &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                                           &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
             *                             &lt;element name="procCS" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
                "ideLotacao"
            })
            public static class IdeEstab {

                protected Byte tpInsc;
                protected String nrInsc;
                @XmlElement(required = true)
                protected List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao> ideLotacao;

                /**
                 * Obtém o valor da propriedade tpInsc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTpInsc() {
                    return tpInsc;
                }

                /**
                 * Define o valor da propriedade tpInsc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTpInsc(Byte value) {
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
                 * Gets the value of the ideLotacao property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ideLotacao property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIdeLotacao().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao }
                 * 
                 * 
                 */
                public List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao> getIdeLotacao() {
                    if (ideLotacao == null) {
                        ideLotacao = new ArrayList<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao>();
                    }
                    return this.ideLotacao;
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
                 *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                 *         &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpLotacao" minOccurs="0"/>
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
                 *         &lt;element name="infoTrabFGTS" maxOccurs="99">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                 *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg"/>
                 *                   &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
                 *                   &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
                 *                   &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *                   &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;element name="mtvDeslig" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{2}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;element name="mtvDesligTSV" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{2}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
                 *                   &lt;element name="infoBaseFGTS" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
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
                 *                                             &lt;enumeration value="50"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                 *                                       &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *                                       &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                                       &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
                 *                                       &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
                 *                                       &lt;element name="basePerAntE" maxOccurs="99">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
                 *                                                 &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                 *                                                 &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *                                                 &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                                                 &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
                 *                   &lt;element name="procCS" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
                    "codLotacao",
                    "tpLotacao",
                    "tpInsc",
                    "nrInsc",
                    "infoTrabFGTS"
                })
                public static class IdeLotacao {

                    protected String codLotacao;
                    protected String tpLotacao;
                    protected Byte tpInsc;
                    protected String nrInsc;
                    @XmlElement(required = true)
                    protected List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS> infoTrabFGTS;

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
                     * Obtém o valor da propriedade tpLotacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpLotacao() {
                        return tpLotacao;
                    }

                    /**
                     * Define o valor da propriedade tpLotacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpLotacao(String value) {
                        this.tpLotacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpInsc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getTpInsc() {
                        return tpInsc;
                    }

                    /**
                     * Define o valor da propriedade tpInsc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setTpInsc(Byte value) {
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
                     * Gets the value of the infoTrabFGTS property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoTrabFGTS property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoTrabFGTS().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS }
                     * 
                     * 
                     */
                    public List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS> getInfoTrabFGTS() {
                        if (infoTrabFGTS == null) {
                            infoTrabFGTS = new ArrayList<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS>();
                        }
                        return this.infoTrabFGTS;
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
                     *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                     *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg"/>
                     *         &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
                     *         &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
                     *         &lt;element name="remunSuc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                     *         &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="mtvDeslig" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{2}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="mtvDesligTSV" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{2}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="sucessaoVinc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_sucessaoVinc" minOccurs="0"/>
                     *         &lt;element name="infoBaseFGTS" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
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
                     *                                   &lt;enumeration value="50"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                     *                             &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                     *                             &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                             &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
                     *                             &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
                     *                             &lt;element name="basePerAntE" maxOccurs="99">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
                     *                                       &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                     *                                       &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                     *                                       &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                                       &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
                     *         &lt;element name="procCS" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
                        "categOrig",
                        "tpRegTrab",
                        "remunSuc",
                        "dtDeslig",
                        "mtvDeslig",
                        "dtTerm",
                        "mtvDesligTSV",
                        "sucessaoVinc",
                        "infoBaseFGTS",
                        "procCS"
                    })
                    public static class InfoTrabFGTS {

                        protected String matricula;
                        @XmlElement(required = true)
                        protected BigInteger codCateg;
                        protected BigInteger categOrig;
                        protected Byte tpRegTrab;
                        @XmlSchemaType(name = "string")
                        protected TSSimNao remunSuc;
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dtDeslig;
                        protected String mtvDeslig;
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dtTerm;
                        protected String mtvDesligTSV;
                        protected TSucessaoVinc sucessaoVinc;
                        protected ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS infoBaseFGTS;
                        protected ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.ProcCS procCS;

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
                         * Obtém o valor da propriedade categOrig.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCategOrig() {
                            return categOrig;
                        }

                        /**
                         * Define o valor da propriedade categOrig.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCategOrig(BigInteger value) {
                            this.categOrig = value;
                        }

                        /**
                         * Obtém o valor da propriedade tpRegTrab.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getTpRegTrab() {
                            return tpRegTrab;
                        }

                        /**
                         * Define o valor da propriedade tpRegTrab.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setTpRegTrab(Byte value) {
                            this.tpRegTrab = value;
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
                         * Obtém o valor da propriedade mtvDesligTSV.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMtvDesligTSV() {
                            return mtvDesligTSV;
                        }

                        /**
                         * Define o valor da propriedade mtvDesligTSV.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMtvDesligTSV(String value) {
                            this.mtvDesligTSV = value;
                        }

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
                         * Obtém o valor da propriedade infoBaseFGTS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS }
                         *     
                         */
                        public ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS getInfoBaseFGTS() {
                            return infoBaseFGTS;
                        }

                        /**
                         * Define o valor da propriedade infoBaseFGTS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS }
                         *     
                         */
                        public void setInfoBaseFGTS(ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS value) {
                            this.infoBaseFGTS = value;
                        }

                        /**
                         * Obtém o valor da propriedade procCS.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.ProcCS }
                         *     
                         */
                        public ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.ProcCS getProcCS() {
                            return procCS;
                        }

                        /**
                         * Define o valor da propriedade procCS.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.ProcCS }
                         *     
                         */
                        public void setProcCS(ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.ProcCS value) {
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
                         *         &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
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
                         *                         &lt;enumeration value="50"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                         *                   &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                         *                   &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                         *                   &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
                         *                   &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
                         *                   &lt;element name="basePerAntE" maxOccurs="99">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
                         *                             &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                         *                             &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                         *                             &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                         *                             &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
                            "basePerApur",
                            "infoBasePerAntE"
                        })
                        public static class InfoBaseFGTS {

                            protected List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.BasePerApur> basePerApur;
                            protected List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE> infoBasePerAntE;

                            /**
                             * Gets the value of the basePerApur property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the basePerApur property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getBasePerApur().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.BasePerApur }
                             * 
                             * 
                             */
                            public List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.BasePerApur> getBasePerApur() {
                                if (basePerApur == null) {
                                    basePerApur = new ArrayList<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.BasePerApur>();
                                }
                                return this.basePerApur;
                            }

                            /**
                             * Gets the value of the infoBasePerAntE property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the infoBasePerAntE property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getInfoBasePerAntE().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE }
                             * 
                             * 
                             */
                            public List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE> getInfoBasePerAntE() {
                                if (infoBasePerAntE == null) {
                                    infoBasePerAntE = new ArrayList<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE>();
                                }
                                return this.infoBasePerAntE;
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
                             *               &lt;enumeration value="50"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                             *         &lt;element name="remFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                             *         &lt;element name="dpsFGTS" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                             *         &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
                                "tpValor",
                                "indIncid",
                                "remFGTS",
                                "dpsFGTS",
                                "detRubrSusp"
                            })
                            public static class BasePerApur {

                                protected byte tpValor;
                                protected byte indIncid;
                                @XmlElement(required = true)
                                protected BigDecimal remFGTS;
                                protected BigDecimal dpsFGTS;
                                protected List<TDetRubrSusp> detRubrSusp;

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
                                 * Obtém o valor da propriedade indIncid.
                                 * 
                                 */
                                public byte getIndIncid() {
                                    return indIncid;
                                }

                                /**
                                 * Define o valor da propriedade indIncid.
                                 * 
                                 */
                                public void setIndIncid(byte value) {
                                    this.indIncid = value;
                                }

                                /**
                                 * Obtém o valor da propriedade remFGTS.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getRemFGTS() {
                                    return remFGTS;
                                }

                                /**
                                 * Define o valor da propriedade remFGTS.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setRemFGTS(BigDecimal value) {
                                    this.remFGTS = value;
                                }

                                /**
                                 * Obtém o valor da propriedade dpsFGTS.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getDpsFGTS() {
                                    return dpsFGTS;
                                }

                                /**
                                 * Define o valor da propriedade dpsFGTS.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setDpsFGTS(BigDecimal value) {
                                    this.dpsFGTS = value;
                                }

                                /**
                                 * Gets the value of the detRubrSusp property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the detRubrSusp property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getDetRubrSusp().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link TDetRubrSusp }
                                 * 
                                 * 
                                 */
                                public List<TDetRubrSusp> getDetRubrSusp() {
                                    if (detRubrSusp == null) {
                                        detRubrSusp = new ArrayList<TDetRubrSusp>();
                                    }
                                    return this.detRubrSusp;
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
                             *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_periodo_mensal"/>
                             *         &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
                             *         &lt;element name="basePerAntE" maxOccurs="99">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
                             *                   &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                             *                   &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                             *                   &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                             *                   &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
                                "tpAcConv",
                                "basePerAntE"
                            })
                            public static class InfoBasePerAntE {

                                @XmlElement(required = true)
                                protected String perRef;
                                @XmlElement(required = true)
                                @XmlSchemaType(name = "string")
                                protected TSTpAcConvFGTS tpAcConv;
                                @XmlElement(required = true)
                                protected List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE> basePerAntE;

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
                                 * Obtém o valor da propriedade tpAcConv.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link TSTpAcConvFGTS }
                                 *     
                                 */
                                public TSTpAcConvFGTS getTpAcConv() {
                                    return tpAcConv;
                                }

                                /**
                                 * Define o valor da propriedade tpAcConv.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link TSTpAcConvFGTS }
                                 *     
                                 */
                                public void setTpAcConv(TSTpAcConvFGTS value) {
                                    this.tpAcConv = value;
                                }

                                /**
                                 * Gets the value of the basePerAntE property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the basePerAntE property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getBasePerAntE().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE }
                                 * 
                                 * 
                                 */
                                public List<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE> getBasePerAntE() {
                                    if (basePerAntE == null) {
                                        basePerAntE = new ArrayList<ESocial.EvtBasesFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoTrabFGTS.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE>();
                                    }
                                    return this.basePerAntE;
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
                                 *         &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_tpValorE"/>
                                 *         &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_indIncid"/>
                                 *         &lt;element name="remFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                                 *         &lt;element name="dpsFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                                 *         &lt;element name="detRubrSusp" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}T_detRubrSusp" maxOccurs="unbounded" minOccurs="0"/>
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
                                    "tpValorE",
                                    "indIncidE",
                                    "remFGTSE",
                                    "dpsFGTSE",
                                    "detRubrSusp"
                                })
                                public static class BasePerAntE {

                                    protected byte tpValorE;
                                    protected byte indIncidE;
                                    @XmlElement(required = true)
                                    protected BigDecimal remFGTSE;
                                    protected BigDecimal dpsFGTSE;
                                    protected List<TDetRubrSusp> detRubrSusp;

                                    /**
                                     * Obtém o valor da propriedade tpValorE.
                                     * 
                                     */
                                    public byte getTpValorE() {
                                        return tpValorE;
                                    }

                                    /**
                                     * Define o valor da propriedade tpValorE.
                                     * 
                                     */
                                    public void setTpValorE(byte value) {
                                        this.tpValorE = value;
                                    }

                                    /**
                                     * Obtém o valor da propriedade indIncidE.
                                     * 
                                     */
                                    public byte getIndIncidE() {
                                        return indIncidE;
                                    }

                                    /**
                                     * Define o valor da propriedade indIncidE.
                                     * 
                                     */
                                    public void setIndIncidE(byte value) {
                                        this.indIncidE = value;
                                    }

                                    /**
                                     * Obtém o valor da propriedade remFGTSE.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getRemFGTSE() {
                                        return remFGTSE;
                                    }

                                    /**
                                     * Define o valor da propriedade remFGTSE.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setRemFGTSE(BigDecimal value) {
                                        this.remFGTSE = value;
                                    }

                                    /**
                                     * Obtém o valor da propriedade dpsFGTSE.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getDpsFGTSE() {
                                        return dpsFGTSE;
                                    }

                                    /**
                                     * Define o valor da propriedade dpsFGTSE.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setDpsFGTSE(BigDecimal value) {
                                        this.dpsFGTSE = value;
                                    }

                                    /**
                                     * Gets the value of the detRubrSusp property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the detRubrSusp property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getDetRubrSusp().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link TDetRubrSusp }
                                     * 
                                     * 
                                     */
                                    public List<TDetRubrSusp> getDetRubrSusp() {
                                        if (detRubrSusp == null) {
                                            detRubrSusp = new ArrayList<TDetRubrSusp>();
                                        }
                                        return this.detRubrSusp;
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
                         *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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

    }

}
