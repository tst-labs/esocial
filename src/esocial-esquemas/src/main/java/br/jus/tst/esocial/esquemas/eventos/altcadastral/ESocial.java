//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

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
 *         &lt;element name="evtAltCadastral">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="alteracao">
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
 *                             &lt;element name="dadosTrabalhador">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nisTrab" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="11"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nmTrab">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="2"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="sexo">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="1"/>
 *                                             &lt;pattern value="[F|M]"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="racaCor">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="estCiv" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="grauInstr">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nmSoc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="2"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nascimento">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dtNascto">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
 *                                                 &lt;element name="paisNascto">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="paisNac">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nmMae" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="2"/>
 *                                                       &lt;maxLength value="70"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nmPai" minOccurs="0">
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
 *                                       &lt;element name="documentos" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCtps" minOccurs="0"/>
 *                                                 &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRic" minOccurs="0"/>
 *                                                 &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRg" minOccurs="0"/>
 *                                                 &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRne" minOccurs="0"/>
 *                                                 &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TOc" minOccurs="0"/>
 *                                                 &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCnh" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="endereco">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoBrasil"/>
 *                                                   &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoExterior"/>
 *                                                 &lt;/choice>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TTrabEstrang" minOccurs="0"/>
 *                                       &lt;element name="infoDeficiencia" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="defFisica">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="defVisual">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="defAuditiva">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="defMental">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="defIntelectual">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="reabReadap">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoCota" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="observacao" minOccurs="0">
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
 *                                       &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="aposentadoria" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="trabAposent">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                       &lt;pattern value="[N|S]"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TContato" minOccurs="0"/>
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
    "evtAltCadastral",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAltCadastral evtAltCadastral;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAltCadastral.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAltCadastral }
     *     
     */
    public ESocial.EvtAltCadastral getEvtAltCadastral() {
        return evtAltCadastral;
    }

    /**
     * Define o valor da propriedade evtAltCadastral.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAltCadastral }
     *     
     */
    public void setEvtAltCadastral(ESocial.EvtAltCadastral value) {
        this.evtAltCadastral = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideTrabalhador">
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="alteracao">
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
     *                   &lt;element name="dadosTrabalhador">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nisTrab" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="11"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nmTrab">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="2"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="sexo">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="1"/>
     *                                   &lt;pattern value="[F|M]"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="racaCor">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="estCiv" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="grauInstr">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nmSoc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="2"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nascimento">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dtNascto">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
     *                                       &lt;element name="paisNascto">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="paisNac">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="3"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nmMae" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="2"/>
     *                                             &lt;maxLength value="70"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nmPai" minOccurs="0">
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
     *                             &lt;element name="documentos" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCtps" minOccurs="0"/>
     *                                       &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRic" minOccurs="0"/>
     *                                       &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRg" minOccurs="0"/>
     *                                       &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRne" minOccurs="0"/>
     *                                       &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TOc" minOccurs="0"/>
     *                                       &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCnh" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="endereco">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoBrasil"/>
     *                                         &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoExterior"/>
     *                                       &lt;/choice>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TTrabEstrang" minOccurs="0"/>
     *                             &lt;element name="infoDeficiencia" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="defFisica">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                             &lt;pattern value="[N|S]"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="defVisual">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                             &lt;pattern value="[N|S]"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="defAuditiva">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                             &lt;pattern value="[N|S]"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="defMental">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                             &lt;pattern value="[N|S]"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="defIntelectual">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                             &lt;pattern value="[N|S]"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="reabReadap">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                             &lt;pattern value="[N|S]"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoCota" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="[N|S]"/>
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
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="aposentadoria" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="trabAposent">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                             &lt;pattern value="[N|S]"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TContato" minOccurs="0"/>
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
        "ideTrabalhador",
        "alteracao"
    })
    public static class EvtAltCadastral {

        @XmlElement(required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAltCadastral.IdeTrabalhador ideTrabalhador;
        @XmlElement(required = true)
        protected ESocial.EvtAltCadastral.Alteracao alteracao;
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
         * Obtém o valor da propriedade ideTrabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAltCadastral.IdeTrabalhador }
         *     
         */
        public ESocial.EvtAltCadastral.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAltCadastral.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtAltCadastral.IdeTrabalhador value) {
            this.ideTrabalhador = value;
        }

        /**
         * Obtém o valor da propriedade alteracao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAltCadastral.Alteracao }
         *     
         */
        public ESocial.EvtAltCadastral.Alteracao getAlteracao() {
            return alteracao;
        }

        /**
         * Define o valor da propriedade alteracao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAltCadastral.Alteracao }
         *     
         */
        public void setAlteracao(ESocial.EvtAltCadastral.Alteracao value) {
            this.alteracao = value;
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
         *         &lt;element name="dadosTrabalhador">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nisTrab" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="11"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nmTrab">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="2"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="sexo">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="1"/>
         *                         &lt;pattern value="[F|M]"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="racaCor">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="estCiv" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="grauInstr">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nmSoc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="2"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nascimento">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dtNascto">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
         *                             &lt;element name="paisNascto">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="paisNac">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="3"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nmMae" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="2"/>
         *                                   &lt;maxLength value="70"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nmPai" minOccurs="0">
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
         *                   &lt;element name="documentos" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCtps" minOccurs="0"/>
         *                             &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRic" minOccurs="0"/>
         *                             &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRg" minOccurs="0"/>
         *                             &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRne" minOccurs="0"/>
         *                             &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TOc" minOccurs="0"/>
         *                             &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCnh" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="endereco">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoBrasil"/>
         *                               &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoExterior"/>
         *                             &lt;/choice>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TTrabEstrang" minOccurs="0"/>
         *                   &lt;element name="infoDeficiencia" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="defFisica">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                   &lt;pattern value="[N|S]"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="defVisual">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                   &lt;pattern value="[N|S]"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="defAuditiva">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                   &lt;pattern value="[N|S]"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="defMental">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                   &lt;pattern value="[N|S]"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="defIntelectual">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                   &lt;pattern value="[N|S]"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="reabReadap">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                   &lt;pattern value="[N|S]"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="infoCota" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="[N|S]"/>
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
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="aposentadoria" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="trabAposent">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                   &lt;pattern value="[N|S]"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TContato" minOccurs="0"/>
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
            "dadosTrabalhador"
        })
        public static class Alteracao {

            @XmlElement(required = true)
            protected XMLGregorianCalendar dtAlteracao;
            @XmlElement(required = true)
            protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador dadosTrabalhador;

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
             * Obtém o valor da propriedade dadosTrabalhador.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador }
             *     
             */
            public ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador getDadosTrabalhador() {
                return dadosTrabalhador;
            }

            /**
             * Define o valor da propriedade dadosTrabalhador.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador }
             *     
             */
            public void setDadosTrabalhador(ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador value) {
                this.dadosTrabalhador = value;
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
             *         &lt;element name="nisTrab" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="11"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nmTrab">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="sexo">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="1"/>
             *               &lt;pattern value="[F|M]"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="racaCor">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="estCiv" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="grauInstr">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{2}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nmSoc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nascimento">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dtNascto">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
             *                   &lt;element name="paisNascto">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="paisNac">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nmMae" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="2"/>
             *                         &lt;maxLength value="70"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nmPai" minOccurs="0">
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
             *         &lt;element name="documentos" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCtps" minOccurs="0"/>
             *                   &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRic" minOccurs="0"/>
             *                   &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRg" minOccurs="0"/>
             *                   &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRne" minOccurs="0"/>
             *                   &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TOc" minOccurs="0"/>
             *                   &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCnh" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="endereco">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoBrasil"/>
             *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoExterior"/>
             *                   &lt;/choice>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="trabEstrangeiro" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TTrabEstrang" minOccurs="0"/>
             *         &lt;element name="infoDeficiencia" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="defFisica">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                         &lt;pattern value="[N|S]"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="defVisual">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                         &lt;pattern value="[N|S]"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="defAuditiva">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                         &lt;pattern value="[N|S]"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="defMental">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                         &lt;pattern value="[N|S]"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="defIntelectual">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                         &lt;pattern value="[N|S]"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="reabReadap">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                         &lt;pattern value="[N|S]"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="infoCota" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="[N|S]"/>
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
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dependente" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TDependente" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="aposentadoria" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="trabAposent">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                         &lt;pattern value="[N|S]"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TContato" minOccurs="0"/>
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
                "nisTrab",
                "nmTrab",
                "sexo",
                "racaCor",
                "estCiv",
                "grauInstr",
                "nmSoc",
                "nascimento",
                "documentos",
                "endereco",
                "trabEstrangeiro",
                "infoDeficiencia",
                "dependente",
                "aposentadoria",
                "contato"
            })
            public static class DadosTrabalhador {

                protected String nisTrab;
                @XmlElement(required = true)
                protected String nmTrab;
                @XmlElement(required = true)
                protected String sexo;
                protected byte racaCor;
                protected Byte estCiv;
                @XmlElement(required = true)
                protected String grauInstr;
                protected String nmSoc;
                @XmlElement(required = true)
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Nascimento nascimento;
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Documentos documentos;
                @XmlElement(required = true)
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco endereco;
                protected TTrabEstrang trabEstrangeiro;
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia infoDeficiencia;
                protected List<TDependente> dependente;
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Aposentadoria aposentadoria;
                protected TContato contato;

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
                 * Obtém o valor da propriedade sexo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSexo() {
                    return sexo;
                }

                /**
                 * Define o valor da propriedade sexo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSexo(String value) {
                    this.sexo = value;
                }

                /**
                 * Obtém o valor da propriedade racaCor.
                 * 
                 */
                public byte getRacaCor() {
                    return racaCor;
                }

                /**
                 * Define o valor da propriedade racaCor.
                 * 
                 */
                public void setRacaCor(byte value) {
                    this.racaCor = value;
                }

                /**
                 * Obtém o valor da propriedade estCiv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getEstCiv() {
                    return estCiv;
                }

                /**
                 * Define o valor da propriedade estCiv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setEstCiv(Byte value) {
                    this.estCiv = value;
                }

                /**
                 * Obtém o valor da propriedade grauInstr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGrauInstr() {
                    return grauInstr;
                }

                /**
                 * Define o valor da propriedade grauInstr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGrauInstr(String value) {
                    this.grauInstr = value;
                }

                /**
                 * Obtém o valor da propriedade nmSoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNmSoc() {
                    return nmSoc;
                }

                /**
                 * Define o valor da propriedade nmSoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNmSoc(String value) {
                    this.nmSoc = value;
                }

                /**
                 * Obtém o valor da propriedade nascimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Nascimento }
                 *     
                 */
                public ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Nascimento getNascimento() {
                    return nascimento;
                }

                /**
                 * Define o valor da propriedade nascimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Nascimento }
                 *     
                 */
                public void setNascimento(ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Nascimento value) {
                    this.nascimento = value;
                }

                /**
                 * Obtém o valor da propriedade documentos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Documentos }
                 *     
                 */
                public ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Documentos getDocumentos() {
                    return documentos;
                }

                /**
                 * Define o valor da propriedade documentos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Documentos }
                 *     
                 */
                public void setDocumentos(ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Documentos value) {
                    this.documentos = value;
                }

                /**
                 * Obtém o valor da propriedade endereco.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco }
                 *     
                 */
                public ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco getEndereco() {
                    return endereco;
                }

                /**
                 * Define o valor da propriedade endereco.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco }
                 *     
                 */
                public void setEndereco(ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco value) {
                    this.endereco = value;
                }

                /**
                 * Obtém o valor da propriedade trabEstrangeiro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TTrabEstrang }
                 *     
                 */
                public TTrabEstrang getTrabEstrangeiro() {
                    return trabEstrangeiro;
                }

                /**
                 * Define o valor da propriedade trabEstrangeiro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TTrabEstrang }
                 *     
                 */
                public void setTrabEstrangeiro(TTrabEstrang value) {
                    this.trabEstrangeiro = value;
                }

                /**
                 * Obtém o valor da propriedade infoDeficiencia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia }
                 *     
                 */
                public ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia getInfoDeficiencia() {
                    return infoDeficiencia;
                }

                /**
                 * Define o valor da propriedade infoDeficiencia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia }
                 *     
                 */
                public void setInfoDeficiencia(ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia value) {
                    this.infoDeficiencia = value;
                }

                /**
                 * Gets the value of the dependente property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dependente property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDependente().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TDependente }
                 * 
                 * 
                 */
                public List<TDependente> getDependente() {
                    if (dependente == null) {
                        dependente = new ArrayList<TDependente>();
                    }
                    return this.dependente;
                }

                /**
                 * Obtém o valor da propriedade aposentadoria.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Aposentadoria }
                 *     
                 */
                public ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Aposentadoria getAposentadoria() {
                    return aposentadoria;
                }

                /**
                 * Define o valor da propriedade aposentadoria.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Aposentadoria }
                 *     
                 */
                public void setAposentadoria(ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Aposentadoria value) {
                    this.aposentadoria = value;
                }

                /**
                 * Obtém o valor da propriedade contato.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TContato }
                 *     
                 */
                public TContato getContato() {
                    return contato;
                }

                /**
                 * Define o valor da propriedade contato.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TContato }
                 *     
                 */
                public void setContato(TContato value) {
                    this.contato = value;
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
                 *         &lt;element name="trabAposent">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *               &lt;pattern value="[N|S]"/>
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
                    "trabAposent"
                })
                public static class Aposentadoria {

                    @XmlElement(required = true)
                    protected String trabAposent;

                    /**
                     * Obtém o valor da propriedade trabAposent.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrabAposent() {
                        return trabAposent;
                    }

                    /**
                     * Define o valor da propriedade trabAposent.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrabAposent(String value) {
                        this.trabAposent = value;
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
                 *         &lt;element name="CTPS" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCtps" minOccurs="0"/>
                 *         &lt;element name="RIC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRic" minOccurs="0"/>
                 *         &lt;element name="RG" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRg" minOccurs="0"/>
                 *         &lt;element name="RNE" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TRne" minOccurs="0"/>
                 *         &lt;element name="OC" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TOc" minOccurs="0"/>
                 *         &lt;element name="CNH" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TCnh" minOccurs="0"/>
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
                    "ctps",
                    "ric",
                    "rg",
                    "rne",
                    "oc",
                    "cnh"
                })
                public static class Documentos {

                    @XmlElement(name = "CTPS")
                    protected TCtps ctps;
                    @XmlElement(name = "RIC")
                    protected TRic ric;
                    @XmlElement(name = "RG")
                    protected TRg rg;
                    @XmlElement(name = "RNE")
                    protected TRne rne;
                    @XmlElement(name = "OC")
                    protected TOc oc;
                    @XmlElement(name = "CNH")
                    protected TCnh cnh;

                    /**
                     * Obtém o valor da propriedade ctps.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TCtps }
                     *     
                     */
                    public TCtps getCTPS() {
                        return ctps;
                    }

                    /**
                     * Define o valor da propriedade ctps.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TCtps }
                     *     
                     */
                    public void setCTPS(TCtps value) {
                        this.ctps = value;
                    }

                    /**
                     * Obtém o valor da propriedade ric.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TRic }
                     *     
                     */
                    public TRic getRIC() {
                        return ric;
                    }

                    /**
                     * Define o valor da propriedade ric.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TRic }
                     *     
                     */
                    public void setRIC(TRic value) {
                        this.ric = value;
                    }

                    /**
                     * Obtém o valor da propriedade rg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TRg }
                     *     
                     */
                    public TRg getRG() {
                        return rg;
                    }

                    /**
                     * Define o valor da propriedade rg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TRg }
                     *     
                     */
                    public void setRG(TRg value) {
                        this.rg = value;
                    }

                    /**
                     * Obtém o valor da propriedade rne.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TRne }
                     *     
                     */
                    public TRne getRNE() {
                        return rne;
                    }

                    /**
                     * Define o valor da propriedade rne.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TRne }
                     *     
                     */
                    public void setRNE(TRne value) {
                        this.rne = value;
                    }

                    /**
                     * Obtém o valor da propriedade oc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TOc }
                     *     
                     */
                    public TOc getOC() {
                        return oc;
                    }

                    /**
                     * Define o valor da propriedade oc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TOc }
                     *     
                     */
                    public void setOC(TOc value) {
                        this.oc = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnh.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TCnh }
                     *     
                     */
                    public TCnh getCNH() {
                        return cnh;
                    }

                    /**
                     * Define o valor da propriedade cnh.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TCnh }
                     *     
                     */
                    public void setCNH(TCnh value) {
                        this.cnh = value;
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
                 *         &lt;choice>
                 *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoBrasil"/>
                 *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_04_02}TEnderecoExterior"/>
                 *         &lt;/choice>
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
                    "brasil",
                    "exterior"
                })
                public static class Endereco {

                    protected TEnderecoBrasil brasil;
                    protected TEnderecoExterior exterior;

                    /**
                     * Obtém o valor da propriedade brasil.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TEnderecoBrasil }
                     *     
                     */
                    public TEnderecoBrasil getBrasil() {
                        return brasil;
                    }

                    /**
                     * Define o valor da propriedade brasil.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TEnderecoBrasil }
                     *     
                     */
                    public void setBrasil(TEnderecoBrasil value) {
                        this.brasil = value;
                    }

                    /**
                     * Obtém o valor da propriedade exterior.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TEnderecoExterior }
                     *     
                     */
                    public TEnderecoExterior getExterior() {
                        return exterior;
                    }

                    /**
                     * Define o valor da propriedade exterior.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TEnderecoExterior }
                     *     
                     */
                    public void setExterior(TEnderecoExterior value) {
                        this.exterior = value;
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
                 *         &lt;element name="defFisica">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *               &lt;pattern value="[N|S]"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="defVisual">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *               &lt;pattern value="[N|S]"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="defAuditiva">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *               &lt;pattern value="[N|S]"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="defMental">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *               &lt;pattern value="[N|S]"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="defIntelectual">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *               &lt;pattern value="[N|S]"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="reabReadap">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *               &lt;pattern value="[N|S]"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infoCota" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="[N|S]"/>
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
                    "defFisica",
                    "defVisual",
                    "defAuditiva",
                    "defMental",
                    "defIntelectual",
                    "reabReadap",
                    "infoCota",
                    "observacao"
                })
                public static class InfoDeficiencia {

                    @XmlElement(required = true)
                    protected String defFisica;
                    @XmlElement(required = true)
                    protected String defVisual;
                    @XmlElement(required = true)
                    protected String defAuditiva;
                    @XmlElement(required = true)
                    protected String defMental;
                    @XmlElement(required = true)
                    protected String defIntelectual;
                    @XmlElement(required = true)
                    protected String reabReadap;
                    protected String infoCota;
                    protected String observacao;

                    /**
                     * Obtém o valor da propriedade defFisica.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDefFisica() {
                        return defFisica;
                    }

                    /**
                     * Define o valor da propriedade defFisica.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDefFisica(String value) {
                        this.defFisica = value;
                    }

                    /**
                     * Obtém o valor da propriedade defVisual.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDefVisual() {
                        return defVisual;
                    }

                    /**
                     * Define o valor da propriedade defVisual.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDefVisual(String value) {
                        this.defVisual = value;
                    }

                    /**
                     * Obtém o valor da propriedade defAuditiva.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDefAuditiva() {
                        return defAuditiva;
                    }

                    /**
                     * Define o valor da propriedade defAuditiva.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDefAuditiva(String value) {
                        this.defAuditiva = value;
                    }

                    /**
                     * Obtém o valor da propriedade defMental.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDefMental() {
                        return defMental;
                    }

                    /**
                     * Define o valor da propriedade defMental.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDefMental(String value) {
                        this.defMental = value;
                    }

                    /**
                     * Obtém o valor da propriedade defIntelectual.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDefIntelectual() {
                        return defIntelectual;
                    }

                    /**
                     * Define o valor da propriedade defIntelectual.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDefIntelectual(String value) {
                        this.defIntelectual = value;
                    }

                    /**
                     * Obtém o valor da propriedade reabReadap.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReabReadap() {
                        return reabReadap;
                    }

                    /**
                     * Define o valor da propriedade reabReadap.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReabReadap(String value) {
                        this.reabReadap = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoCota.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInfoCota() {
                        return infoCota;
                    }

                    /**
                     * Define o valor da propriedade infoCota.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInfoCota(String value) {
                        this.infoCota = value;
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
                 *         &lt;element name="dtNascto">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
                 *         &lt;element name="paisNascto">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="paisNac">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nmMae" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="70"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nmPai" minOccurs="0">
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
                    "dtNascto",
                    "codMunic",
                    "uf",
                    "paisNascto",
                    "paisNac",
                    "nmMae",
                    "nmPai"
                })
                public static class Nascimento {

                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dtNascto;
                    protected BigInteger codMunic;
                    protected String uf;
                    @XmlElement(required = true)
                    protected String paisNascto;
                    @XmlElement(required = true)
                    protected String paisNac;
                    protected String nmMae;
                    protected String nmPai;

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

                    /**
                     * Obtém o valor da propriedade paisNascto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaisNascto() {
                        return paisNascto;
                    }

                    /**
                     * Define o valor da propriedade paisNascto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaisNascto(String value) {
                        this.paisNascto = value;
                    }

                    /**
                     * Obtém o valor da propriedade paisNac.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaisNac() {
                        return paisNac;
                    }

                    /**
                     * Define o valor da propriedade paisNac.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaisNac(String value) {
                        this.paisNac = value;
                    }

                    /**
                     * Obtém o valor da propriedade nmMae.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNmMae() {
                        return nmMae;
                    }

                    /**
                     * Define o valor da propriedade nmMae.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNmMae(String value) {
                        this.nmMae = value;
                    }

                    /**
                     * Obtém o valor da propriedade nmPai.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNmPai() {
                        return nmPai;
                    }

                    /**
                     * Define o valor da propriedade nmPai.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNmPai(String value) {
                        this.nmPai = value;
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
         *         &lt;element name="cpfTrab">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="11"/>
         *               &lt;pattern value="\d{11}"/>
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

    }

}
