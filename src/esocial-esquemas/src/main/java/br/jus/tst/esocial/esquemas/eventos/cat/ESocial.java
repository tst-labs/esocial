//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:59 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cat;

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
 *         &lt;element name="evtCAT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}T_ideVinculo_sst"/>
 *                   &lt;element name="cat">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAcid" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="tpAcid">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="hrAcid" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_hora" minOccurs="0"/>
 *                             &lt;element name="hrsTrabAntesAcid" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="\d{4}"/>
 *                                   &lt;pattern value="([0-9][0-9][0-5][0-9])"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpCat">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indCatObito" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="dtObito" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="indComunPolicia" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="codSitGeradora">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="\d{9}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="iniciatCAT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="obsCAT" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
 *                             &lt;element name="localAcidente">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpLocal">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                             &lt;enumeration value="6"/>
 *                                             &lt;enumeration value="9"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscLocal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
 *                                       &lt;element name="tpLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpLograd" minOccurs="0"/>
 *                                       &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_dscLograd"/>
 *                                       &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrLograd"/>
 *                                       &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_complemento" minOccurs="0"/>
 *                                       &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_bairro" minOccurs="0"/>
 *                                       &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_cep" minOccurs="0"/>
 *                                       &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codMunic" minOccurs="0"/>
 *                                       &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf" minOccurs="0"/>
 *                                       &lt;element name="pais" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codPostal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codPostal" minOccurs="0"/>
 *                                       &lt;element name="ideLocalAcid" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpInsc_1_3_4"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrInsc_12_14"/>
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
 *                             &lt;element name="parteAtingida">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codParteAting">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{9}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="lateralidade">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="0"/>
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="agenteCausador">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codAgntCausador">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{9}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="atestado" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtAtendimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="hrAtendimento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_hora"/>
 *                                       &lt;element name="indInternacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
 *                                       &lt;element name="durTrat">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{1,4}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="indAfast" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
 *                                       &lt;element name="dscLesao">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{9}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dscCompLesao" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="200"/>
 *                                             &lt;pattern value=".*[^\s].*"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="diagProvavel" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                       &lt;element name="codCID">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                                       &lt;element name="emitente">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="nmEmit" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nome"/>
 *                                                 &lt;element name="ideOC">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nrOC">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="14"/>
 *                                                       &lt;pattern value=".*[^\s].*"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf"/>
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
 *                             &lt;element name="catOrigem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nrRecCatOrig" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrRecibo"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_Id" />
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
    "evtCAT",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtCAT evtCAT;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCAT.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCAT }
     *     
     */
    public ESocial.EvtCAT getEvtCAT() {
        return evtCAT;
    }

    /**
     * Define o valor da propriedade evtCAT.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCAT }
     *     
     */
    public void setEvtCAT(ESocial.EvtCAT value) {
        this.evtCAT = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}T_ideVinculo_sst"/>
     *         &lt;element name="cat">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAcid" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="tpAcid">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="hrAcid" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_hora" minOccurs="0"/>
     *                   &lt;element name="hrsTrabAntesAcid" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="\d{4}"/>
     *                         &lt;pattern value="([0-9][0-9][0-5][0-9])"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpCat">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indCatObito" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="dtObito" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="indComunPolicia" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="codSitGeradora">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="\d{9}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="iniciatCAT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="obsCAT" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
     *                   &lt;element name="localAcidente">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpLocal">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                   &lt;enumeration value="6"/>
     *                                   &lt;enumeration value="9"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscLocal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
     *                             &lt;element name="tpLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpLograd" minOccurs="0"/>
     *                             &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_dscLograd"/>
     *                             &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrLograd"/>
     *                             &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_complemento" minOccurs="0"/>
     *                             &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_bairro" minOccurs="0"/>
     *                             &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_cep" minOccurs="0"/>
     *                             &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codMunic" minOccurs="0"/>
     *                             &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf" minOccurs="0"/>
     *                             &lt;element name="pais" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codPostal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codPostal" minOccurs="0"/>
     *                             &lt;element name="ideLocalAcid" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpInsc_1_3_4"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrInsc_12_14"/>
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
     *                   &lt;element name="parteAtingida">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codParteAting">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{9}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="lateralidade">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="0"/>
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="agenteCausador">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codAgntCausador">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{9}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="atestado" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtAtendimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="hrAtendimento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_hora"/>
     *                             &lt;element name="indInternacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
     *                             &lt;element name="durTrat">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{1,4}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="indAfast" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
     *                             &lt;element name="dscLesao">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{9}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dscCompLesao" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="200"/>
     *                                   &lt;pattern value=".*[^\s].*"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="diagProvavel" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                             &lt;element name="codCID">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_observacao" minOccurs="0"/>
     *                             &lt;element name="emitente">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="nmEmit" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nome"/>
     *                                       &lt;element name="ideOC">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;enumeration value="1"/>
     *                                             &lt;enumeration value="2"/>
     *                                             &lt;enumeration value="3"/>
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
     *                                       &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf"/>
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
     *                   &lt;element name="catOrigem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nrRecCatOrig" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrRecibo"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_Id" />
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
        "cat"
    })
    public static class EvtCAT {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeVinculoSst ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtCAT.Cat cat;
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
         * Obtém o valor da propriedade cat.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCAT.Cat }
         *     
         */
        public ESocial.EvtCAT.Cat getCat() {
            return cat;
        }

        /**
         * Define o valor da propriedade cat.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCAT.Cat }
         *     
         */
        public void setCat(ESocial.EvtCAT.Cat value) {
            this.cat = value;
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
         *         &lt;element name="dtAcid" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="tpAcid">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="hrAcid" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_hora" minOccurs="0"/>
         *         &lt;element name="hrsTrabAntesAcid" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;pattern value="\d{4}"/>
         *               &lt;pattern value="([0-9][0-9][0-5][0-9])"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpCat">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indCatObito" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="dtObito" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="indComunPolicia" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="codSitGeradora">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;pattern value="\d{9}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="iniciatCAT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="obsCAT" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
         *         &lt;element name="localAcidente">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpLocal">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                         &lt;enumeration value="6"/>
         *                         &lt;enumeration value="9"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscLocal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
         *                   &lt;element name="tpLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpLograd" minOccurs="0"/>
         *                   &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_dscLograd"/>
         *                   &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrLograd"/>
         *                   &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_complemento" minOccurs="0"/>
         *                   &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_bairro" minOccurs="0"/>
         *                   &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_cep" minOccurs="0"/>
         *                   &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codMunic" minOccurs="0"/>
         *                   &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf" minOccurs="0"/>
         *                   &lt;element name="pais" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="codPostal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codPostal" minOccurs="0"/>
         *                   &lt;element name="ideLocalAcid" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpInsc_1_3_4"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrInsc_12_14"/>
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
         *         &lt;element name="parteAtingida">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codParteAting">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{9}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="lateralidade">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="agenteCausador">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codAgntCausador">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{9}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="atestado" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtAtendimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="hrAtendimento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_hora"/>
         *                   &lt;element name="indInternacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
         *                   &lt;element name="durTrat">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{1,4}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="indAfast" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
         *                   &lt;element name="dscLesao">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{9}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dscCompLesao" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="200"/>
         *                         &lt;pattern value=".*[^\s].*"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="diagProvavel" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                   &lt;element name="codCID">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_observacao" minOccurs="0"/>
         *                   &lt;element name="emitente">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nmEmit" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nome"/>
         *                             &lt;element name="ideOC">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                   &lt;enumeration value="3"/>
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
         *                             &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf"/>
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
         *         &lt;element name="catOrigem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nrRecCatOrig" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrRecibo"/>
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
            "dtAcid",
            "tpAcid",
            "hrAcid",
            "hrsTrabAntesAcid",
            "tpCat",
            "indCatObito",
            "dtObito",
            "indComunPolicia",
            "codSitGeradora",
            "iniciatCAT",
            "obsCAT",
            "localAcidente",
            "parteAtingida",
            "agenteCausador",
            "atestado",
            "catOrigem"
        })
        public static class Cat {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAcid;
            protected byte tpAcid;
            protected BigInteger hrAcid;
            protected BigInteger hrsTrabAntesAcid;
            protected byte tpCat;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao indCatObito;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtObito;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao indComunPolicia;
            @XmlElement(required = true)
            protected BigInteger codSitGeradora;
            protected byte iniciatCAT;
            protected String obsCAT;
            @XmlElement(required = true)
            protected ESocial.EvtCAT.Cat.LocalAcidente localAcidente;
            @XmlElement(required = true)
            protected ESocial.EvtCAT.Cat.ParteAtingida parteAtingida;
            @XmlElement(required = true)
            protected ESocial.EvtCAT.Cat.AgenteCausador agenteCausador;
            protected ESocial.EvtCAT.Cat.Atestado atestado;
            protected ESocial.EvtCAT.Cat.CatOrigem catOrigem;

            /**
             * Obtém o valor da propriedade dtAcid.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAcid() {
                return dtAcid;
            }

            /**
             * Define o valor da propriedade dtAcid.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAcid(XMLGregorianCalendar value) {
                this.dtAcid = value;
            }

            /**
             * Obtém o valor da propriedade tpAcid.
             * 
             */
            public byte getTpAcid() {
                return tpAcid;
            }

            /**
             * Define o valor da propriedade tpAcid.
             * 
             */
            public void setTpAcid(byte value) {
                this.tpAcid = value;
            }

            /**
             * Obtém o valor da propriedade hrAcid.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getHrAcid() {
                return hrAcid;
            }

            /**
             * Define o valor da propriedade hrAcid.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setHrAcid(BigInteger value) {
                this.hrAcid = value;
            }

            /**
             * Obtém o valor da propriedade hrsTrabAntesAcid.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getHrsTrabAntesAcid() {
                return hrsTrabAntesAcid;
            }

            /**
             * Define o valor da propriedade hrsTrabAntesAcid.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setHrsTrabAntesAcid(BigInteger value) {
                this.hrsTrabAntesAcid = value;
            }

            /**
             * Obtém o valor da propriedade tpCat.
             * 
             */
            public byte getTpCat() {
                return tpCat;
            }

            /**
             * Define o valor da propriedade tpCat.
             * 
             */
            public void setTpCat(byte value) {
                this.tpCat = value;
            }

            /**
             * Obtém o valor da propriedade indCatObito.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getIndCatObito() {
                return indCatObito;
            }

            /**
             * Define o valor da propriedade indCatObito.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setIndCatObito(TSSimNao value) {
                this.indCatObito = value;
            }

            /**
             * Obtém o valor da propriedade dtObito.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtObito() {
                return dtObito;
            }

            /**
             * Define o valor da propriedade dtObito.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtObito(XMLGregorianCalendar value) {
                this.dtObito = value;
            }

            /**
             * Obtém o valor da propriedade indComunPolicia.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getIndComunPolicia() {
                return indComunPolicia;
            }

            /**
             * Define o valor da propriedade indComunPolicia.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setIndComunPolicia(TSSimNao value) {
                this.indComunPolicia = value;
            }

            /**
             * Obtém o valor da propriedade codSitGeradora.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodSitGeradora() {
                return codSitGeradora;
            }

            /**
             * Define o valor da propriedade codSitGeradora.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodSitGeradora(BigInteger value) {
                this.codSitGeradora = value;
            }

            /**
             * Obtém o valor da propriedade iniciatCAT.
             * 
             */
            public byte getIniciatCAT() {
                return iniciatCAT;
            }

            /**
             * Define o valor da propriedade iniciatCAT.
             * 
             */
            public void setIniciatCAT(byte value) {
                this.iniciatCAT = value;
            }

            /**
             * Obtém o valor da propriedade obsCAT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObsCAT() {
                return obsCAT;
            }

            /**
             * Define o valor da propriedade obsCAT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObsCAT(String value) {
                this.obsCAT = value;
            }

            /**
             * Obtém o valor da propriedade localAcidente.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.LocalAcidente }
             *     
             */
            public ESocial.EvtCAT.Cat.LocalAcidente getLocalAcidente() {
                return localAcidente;
            }

            /**
             * Define o valor da propriedade localAcidente.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.LocalAcidente }
             *     
             */
            public void setLocalAcidente(ESocial.EvtCAT.Cat.LocalAcidente value) {
                this.localAcidente = value;
            }

            /**
             * Obtém o valor da propriedade parteAtingida.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.ParteAtingida }
             *     
             */
            public ESocial.EvtCAT.Cat.ParteAtingida getParteAtingida() {
                return parteAtingida;
            }

            /**
             * Define o valor da propriedade parteAtingida.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.ParteAtingida }
             *     
             */
            public void setParteAtingida(ESocial.EvtCAT.Cat.ParteAtingida value) {
                this.parteAtingida = value;
            }

            /**
             * Obtém o valor da propriedade agenteCausador.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.AgenteCausador }
             *     
             */
            public ESocial.EvtCAT.Cat.AgenteCausador getAgenteCausador() {
                return agenteCausador;
            }

            /**
             * Define o valor da propriedade agenteCausador.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.AgenteCausador }
             *     
             */
            public void setAgenteCausador(ESocial.EvtCAT.Cat.AgenteCausador value) {
                this.agenteCausador = value;
            }

            /**
             * Obtém o valor da propriedade atestado.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.Atestado }
             *     
             */
            public ESocial.EvtCAT.Cat.Atestado getAtestado() {
                return atestado;
            }

            /**
             * Define o valor da propriedade atestado.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.Atestado }
             *     
             */
            public void setAtestado(ESocial.EvtCAT.Cat.Atestado value) {
                this.atestado = value;
            }

            /**
             * Obtém o valor da propriedade catOrigem.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCAT.Cat.CatOrigem }
             *     
             */
            public ESocial.EvtCAT.Cat.CatOrigem getCatOrigem() {
                return catOrigem;
            }

            /**
             * Define o valor da propriedade catOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCAT.Cat.CatOrigem }
             *     
             */
            public void setCatOrigem(ESocial.EvtCAT.Cat.CatOrigem value) {
                this.catOrigem = value;
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
             *         &lt;element name="codAgntCausador">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{9}"/>
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
                "codAgntCausador"
            })
            public static class AgenteCausador {

                @XmlElement(required = true)
                protected BigInteger codAgntCausador;

                /**
                 * Obtém o valor da propriedade codAgntCausador.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCodAgntCausador() {
                    return codAgntCausador;
                }

                /**
                 * Define o valor da propriedade codAgntCausador.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCodAgntCausador(BigInteger value) {
                    this.codAgntCausador = value;
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
             *         &lt;element name="dtAtendimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="hrAtendimento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_hora"/>
             *         &lt;element name="indInternacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
             *         &lt;element name="durTrat">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{1,4}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="indAfast" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_sim_nao"/>
             *         &lt;element name="dscLesao">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{9}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscCompLesao" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="200"/>
             *               &lt;pattern value=".*[^\s].*"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="diagProvavel" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *         &lt;element name="codCID">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_observacao" minOccurs="0"/>
             *         &lt;element name="emitente">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nmEmit" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nome"/>
             *                   &lt;element name="ideOC">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                         &lt;enumeration value="3"/>
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
             *                   &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf"/>
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
                "dtAtendimento",
                "hrAtendimento",
                "indInternacao",
                "durTrat",
                "indAfast",
                "dscLesao",
                "dscCompLesao",
                "diagProvavel",
                "codCID",
                "observacao",
                "emitente"
            })
            public static class Atestado {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtAtendimento;
                @XmlElement(required = true)
                protected BigInteger hrAtendimento;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao indInternacao;
                @XmlElement(required = true)
                protected BigInteger durTrat;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao indAfast;
                @XmlElement(required = true)
                protected BigInteger dscLesao;
                protected String dscCompLesao;
                protected String diagProvavel;
                @XmlElement(required = true)
                protected String codCID;
                protected String observacao;
                @XmlElement(required = true)
                protected ESocial.EvtCAT.Cat.Atestado.Emitente emitente;

                /**
                 * Obtém o valor da propriedade dtAtendimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAtendimento() {
                    return dtAtendimento;
                }

                /**
                 * Define o valor da propriedade dtAtendimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAtendimento(XMLGregorianCalendar value) {
                    this.dtAtendimento = value;
                }

                /**
                 * Obtém o valor da propriedade hrAtendimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getHrAtendimento() {
                    return hrAtendimento;
                }

                /**
                 * Define o valor da propriedade hrAtendimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setHrAtendimento(BigInteger value) {
                    this.hrAtendimento = value;
                }

                /**
                 * Obtém o valor da propriedade indInternacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndInternacao() {
                    return indInternacao;
                }

                /**
                 * Define o valor da propriedade indInternacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndInternacao(TSSimNao value) {
                    this.indInternacao = value;
                }

                /**
                 * Obtém o valor da propriedade durTrat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDurTrat() {
                    return durTrat;
                }

                /**
                 * Define o valor da propriedade durTrat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDurTrat(BigInteger value) {
                    this.durTrat = value;
                }

                /**
                 * Obtém o valor da propriedade indAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndAfast() {
                    return indAfast;
                }

                /**
                 * Define o valor da propriedade indAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndAfast(TSSimNao value) {
                    this.indAfast = value;
                }

                /**
                 * Obtém o valor da propriedade dscLesao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDscLesao() {
                    return dscLesao;
                }

                /**
                 * Define o valor da propriedade dscLesao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDscLesao(BigInteger value) {
                    this.dscLesao = value;
                }

                /**
                 * Obtém o valor da propriedade dscCompLesao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscCompLesao() {
                    return dscCompLesao;
                }

                /**
                 * Define o valor da propriedade dscCompLesao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscCompLesao(String value) {
                    this.dscCompLesao = value;
                }

                /**
                 * Obtém o valor da propriedade diagProvavel.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiagProvavel() {
                    return diagProvavel;
                }

                /**
                 * Define o valor da propriedade diagProvavel.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiagProvavel(String value) {
                    this.diagProvavel = value;
                }

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
                 * Obtém o valor da propriedade emitente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCAT.Cat.Atestado.Emitente }
                 *     
                 */
                public ESocial.EvtCAT.Cat.Atestado.Emitente getEmitente() {
                    return emitente;
                }

                /**
                 * Define o valor da propriedade emitente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCAT.Cat.Atestado.Emitente }
                 *     
                 */
                public void setEmitente(ESocial.EvtCAT.Cat.Atestado.Emitente value) {
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
                 *         &lt;element name="nmEmit" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nome"/>
                 *         &lt;element name="ideOC">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
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
                 *         &lt;element name="ufOC" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf"/>
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
                    "nrOC",
                    "ufOC"
                })
                public static class Emitente {

                    @XmlElement(required = true)
                    protected String nmEmit;
                    protected byte ideOC;
                    @XmlElement(required = true)
                    protected String nrOC;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "string")
                    protected TSUf ufOC;

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
             *         &lt;element name="nrRecCatOrig" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrRecibo"/>
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
                "nrRecCatOrig"
            })
            public static class CatOrigem {

                @XmlElement(required = true)
                protected String nrRecCatOrig;

                /**
                 * Obtém o valor da propriedade nrRecCatOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrRecCatOrig() {
                    return nrRecCatOrig;
                }

                /**
                 * Define o valor da propriedade nrRecCatOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrRecCatOrig(String value) {
                    this.nrRecCatOrig = value;
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
             *         &lt;element name="tpLocal">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *               &lt;enumeration value="6"/>
             *               &lt;enumeration value="9"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dscLocal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
             *         &lt;element name="tpLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpLograd" minOccurs="0"/>
             *         &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_dscLograd"/>
             *         &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrLograd"/>
             *         &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_complemento" minOccurs="0"/>
             *         &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_bairro" minOccurs="0"/>
             *         &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_cep" minOccurs="0"/>
             *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codMunic" minOccurs="0"/>
             *         &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_uf" minOccurs="0"/>
             *         &lt;element name="pais" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="codPostal" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_codPostal" minOccurs="0"/>
             *         &lt;element name="ideLocalAcid" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpInsc_1_3_4"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrInsc_12_14"/>
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
                "tpLocal",
                "dscLocal",
                "tpLograd",
                "dscLograd",
                "nrLograd",
                "complemento",
                "bairro",
                "cep",
                "codMunic",
                "uf",
                "pais",
                "codPostal",
                "ideLocalAcid"
            })
            public static class LocalAcidente {

                protected byte tpLocal;
                protected String dscLocal;
                protected String tpLograd;
                @XmlElement(required = true)
                protected String dscLograd;
                @XmlElement(required = true)
                protected String nrLograd;
                protected String complemento;
                protected String bairro;
                protected String cep;
                protected BigInteger codMunic;
                @XmlSchemaType(name = "string")
                protected TSUf uf;
                protected String pais;
                protected String codPostal;
                protected ESocial.EvtCAT.Cat.LocalAcidente.IdeLocalAcid ideLocalAcid;

                /**
                 * Obtém o valor da propriedade tpLocal.
                 * 
                 */
                public byte getTpLocal() {
                    return tpLocal;
                }

                /**
                 * Define o valor da propriedade tpLocal.
                 * 
                 */
                public void setTpLocal(byte value) {
                    this.tpLocal = value;
                }

                /**
                 * Obtém o valor da propriedade dscLocal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscLocal() {
                    return dscLocal;
                }

                /**
                 * Define o valor da propriedade dscLocal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscLocal(String value) {
                    this.dscLocal = value;
                }

                /**
                 * Obtém o valor da propriedade tpLograd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTpLograd() {
                    return tpLograd;
                }

                /**
                 * Define o valor da propriedade tpLograd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTpLograd(String value) {
                    this.tpLograd = value;
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
                 * Obtém o valor da propriedade complemento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComplemento() {
                    return complemento;
                }

                /**
                 * Define o valor da propriedade complemento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComplemento(String value) {
                    this.complemento = value;
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
                 *     {@link TSUf }
                 *     
                 */
                public TSUf getUf() {
                    return uf;
                }

                /**
                 * Define o valor da propriedade uf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSUf }
                 *     
                 */
                public void setUf(TSUf value) {
                    this.uf = value;
                }

                /**
                 * Obtém o valor da propriedade pais.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPais() {
                    return pais;
                }

                /**
                 * Define o valor da propriedade pais.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPais(String value) {
                    this.pais = value;
                }

                /**
                 * Obtém o valor da propriedade codPostal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodPostal() {
                    return codPostal;
                }

                /**
                 * Define o valor da propriedade codPostal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodPostal(String value) {
                    this.codPostal = value;
                }

                /**
                 * Obtém o valor da propriedade ideLocalAcid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCAT.Cat.LocalAcidente.IdeLocalAcid }
                 *     
                 */
                public ESocial.EvtCAT.Cat.LocalAcidente.IdeLocalAcid getIdeLocalAcid() {
                    return ideLocalAcid;
                }

                /**
                 * Define o valor da propriedade ideLocalAcid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCAT.Cat.LocalAcidente.IdeLocalAcid }
                 *     
                 */
                public void setIdeLocalAcid(ESocial.EvtCAT.Cat.LocalAcidente.IdeLocalAcid value) {
                    this.ideLocalAcid = value;
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
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_tpInsc_1_3_4"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCAT/v_S_01_00_00}TS_nrInsc_12_14"/>
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
                public static class IdeLocalAcid {

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
             *         &lt;element name="codParteAting">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *               &lt;pattern value="\d{9}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="lateralidade">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
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
                "codParteAting",
                "lateralidade"
            })
            public static class ParteAtingida {

                @XmlElement(required = true)
                protected BigInteger codParteAting;
                protected byte lateralidade;

                /**
                 * Obtém o valor da propriedade codParteAting.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCodParteAting() {
                    return codParteAting;
                }

                /**
                 * Define o valor da propriedade codParteAting.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCodParteAting(BigInteger value) {
                    this.codParteAting = value;
                }

                /**
                 * Obtém o valor da propriedade lateralidade.
                 * 
                 */
                public byte getLateralidade() {
                    return lateralidade;
                }

                /**
                 * Define o valor da propriedade lateralidade.
                 * 
                 */
                public void setLateralidade(byte value) {
                    this.lateralidade = value;
                }

            }

        }

    }

}
