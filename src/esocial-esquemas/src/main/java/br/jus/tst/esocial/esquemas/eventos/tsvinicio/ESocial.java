//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:30 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvinicio;

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
 *         &lt;element name="evtTSVInicio">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="trabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpfTrab"/>
 *                             &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmTrab"/>
 *                             &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_sexoTrab"/>
 *                             &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_racaCorTrab"/>
 *                             &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
 *                             &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_grauInstr"/>
 *                             &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
 *                             &lt;element name="nascimento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_nascimento"/>
 *                             &lt;element name="endereco">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_brasil"/>
 *                                         &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_exterior"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="trabImig" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
 *                                       &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_condIng"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoDeficiencia" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defFisica"/>
 *                                       &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defVisual"/>
 *                                       &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defAuditiva"/>
 *                                       &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defMental"/>
 *                                       &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defIntelectual"/>
 *                                       &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_reabReadap"/>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dependente" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpDep"/>
 *                                       &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmDep"/>
 *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtNascto"/>
 *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
 *                                       &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depIRRF"/>
 *                                       &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depSF"/>
 *                                       &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_incTrab"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_contato" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoTSVInicio">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cadIni">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="S"/>
 *                                   &lt;enumeration value="N"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
 *                             &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
 *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
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
 *                                                 &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                                 &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
 *                                                 &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                                 &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
 *                                       &lt;element name="FGTS" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtOpcFGTS"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoDirigenteSindical" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpInsc_1_2" minOccurs="0"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrInsc_11_14" minOccurs="0"/>
 *                                                 &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="matricOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                                 &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
 *                                                 &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoTrabCedido" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
 *                                                 &lt;element name="cnpjCednt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cnpj"/>
 *                                                 &lt;element name="matricCed" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial"/>
 *                                                 &lt;element name="dtAdmCed">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                                       &lt;minInclusive value="1890-01-01"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
 *                                                 &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoMandElet" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
 *                                                 &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
 *                                                 &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
 *                                       &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpf"/>
 *                                       &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                       &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="afastamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codMotAfast"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="termino" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_Id" />
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
    "evtTSVInicio",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtTSVInicio evtTSVInicio;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtTSVInicio.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtTSVInicio }
     *     
     */
    public ESocial.EvtTSVInicio getEvtTSVInicio() {
        return evtTSVInicio;
    }

    /**
     * Define o valor da propriedade evtTSVInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtTSVInicio }
     *     
     */
    public void setEvtTSVInicio(ESocial.EvtTSVInicio value) {
        this.evtTSVInicio = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="trabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpfTrab"/>
     *                   &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmTrab"/>
     *                   &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_sexoTrab"/>
     *                   &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_racaCorTrab"/>
     *                   &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
     *                   &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_grauInstr"/>
     *                   &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
     *                   &lt;element name="nascimento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_nascimento"/>
     *                   &lt;element name="endereco">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_brasil"/>
     *                               &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_exterior"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="trabImig" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
     *                             &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_condIng"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoDeficiencia" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defFisica"/>
     *                             &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defVisual"/>
     *                             &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defAuditiva"/>
     *                             &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defMental"/>
     *                             &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defIntelectual"/>
     *                             &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_reabReadap"/>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dependente" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpDep"/>
     *                             &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmDep"/>
     *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtNascto"/>
     *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
     *                             &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depIRRF"/>
     *                             &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depSF"/>
     *                             &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_incTrab"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_contato" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoTSVInicio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cadIni">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="S"/>
     *                         &lt;enumeration value="N"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
     *                   &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
     *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
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
     *                                       &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                                       &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
     *                                       &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                                       &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
     *                             &lt;element name="FGTS" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtOpcFGTS"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoDirigenteSindical" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpInsc_1_2" minOccurs="0"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrInsc_11_14" minOccurs="0"/>
     *                                       &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="matricOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                                       &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
     *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoTrabCedido" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
     *                                       &lt;element name="cnpjCednt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cnpj"/>
     *                                       &lt;element name="matricCed" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial"/>
     *                                       &lt;element name="dtAdmCed">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                             &lt;minInclusive value="1890-01-01"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
     *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoMandElet" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
     *                                       &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
     *                                       &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
     *                             &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpf"/>
     *                             &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                             &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="afastamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codMotAfast"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="termino" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_Id" />
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
        "trabalhador",
        "infoTSVInicio"
    })
    public static class EvtTSVInicio {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtTSVInicio.Trabalhador trabalhador;
        @XmlElement(required = true)
        protected ESocial.EvtTSVInicio.InfoTSVInicio infoTSVInicio;
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
         * Obtém o valor da propriedade trabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTSVInicio.Trabalhador }
         *     
         */
        public ESocial.EvtTSVInicio.Trabalhador getTrabalhador() {
            return trabalhador;
        }

        /**
         * Define o valor da propriedade trabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTSVInicio.Trabalhador }
         *     
         */
        public void setTrabalhador(ESocial.EvtTSVInicio.Trabalhador value) {
            this.trabalhador = value;
        }

        /**
         * Obtém o valor da propriedade infoTSVInicio.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtTSVInicio.InfoTSVInicio }
         *     
         */
        public ESocial.EvtTSVInicio.InfoTSVInicio getInfoTSVInicio() {
            return infoTSVInicio;
        }

        /**
         * Define o valor da propriedade infoTSVInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtTSVInicio.InfoTSVInicio }
         *     
         */
        public void setInfoTSVInicio(ESocial.EvtTSVInicio.InfoTSVInicio value) {
            this.infoTSVInicio = value;
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
         *         &lt;element name="cadIni">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="S"/>
         *               &lt;enumeration value="N"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
         *         &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
         *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
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
         *                             &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                             &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
         *                             &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                             &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
         *                   &lt;element name="FGTS" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtOpcFGTS"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoDirigenteSindical" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpInsc_1_2" minOccurs="0"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrInsc_11_14" minOccurs="0"/>
         *                             &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="matricOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                             &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
         *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoTrabCedido" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
         *                             &lt;element name="cnpjCednt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cnpj"/>
         *                             &lt;element name="matricCed" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial"/>
         *                             &lt;element name="dtAdmCed">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                                   &lt;minInclusive value="1890-01-01"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
         *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoMandElet" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
         *                             &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
         *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
         *                   &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpf"/>
         *                   &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                   &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="afastamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codMotAfast"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="termino" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "cadIni",
            "matricula",
            "codCateg",
            "dtInicio",
            "nrProcTrab",
            "natAtividade",
            "infoComplementares",
            "mudancaCPF",
            "afastamento",
            "termino"
        })
        public static class InfoTSVInicio {

            @XmlElement(required = true)
            protected String cadIni;
            protected String matricula;
            @XmlElement(required = true)
            protected BigInteger codCateg;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtInicio;
            protected String nrProcTrab;
            protected Byte natAtividade;
            protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares infoComplementares;
            protected ESocial.EvtTSVInicio.InfoTSVInicio.MudancaCPF mudancaCPF;
            protected ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento afastamento;
            protected ESocial.EvtTSVInicio.InfoTSVInicio.Termino termino;

            /**
             * Obtém o valor da propriedade cadIni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCadIni() {
                return cadIni;
            }

            /**
             * Define o valor da propriedade cadIni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCadIni(String value) {
                this.cadIni = value;
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

            /**
             * Obtém o valor da propriedade dtInicio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtInicio() {
                return dtInicio;
            }

            /**
             * Define o valor da propriedade dtInicio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtInicio(XMLGregorianCalendar value) {
                this.dtInicio = value;
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
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares }
             *     
             */
            public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares getInfoComplementares() {
                return infoComplementares;
            }

            /**
             * Define o valor da propriedade infoComplementares.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares }
             *     
             */
            public void setInfoComplementares(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares value) {
                this.infoComplementares = value;
            }

            /**
             * Obtém o valor da propriedade mudancaCPF.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.MudancaCPF }
             *     
             */
            public ESocial.EvtTSVInicio.InfoTSVInicio.MudancaCPF getMudancaCPF() {
                return mudancaCPF;
            }

            /**
             * Define o valor da propriedade mudancaCPF.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.MudancaCPF }
             *     
             */
            public void setMudancaCPF(ESocial.EvtTSVInicio.InfoTSVInicio.MudancaCPF value) {
                this.mudancaCPF = value;
            }

            /**
             * Obtém o valor da propriedade afastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento }
             *     
             */
            public ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento getAfastamento() {
                return afastamento;
            }

            /**
             * Define o valor da propriedade afastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento }
             *     
             */
            public void setAfastamento(ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento value) {
                this.afastamento = value;
            }

            /**
             * Obtém o valor da propriedade termino.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Termino }
             *     
             */
            public ESocial.EvtTSVInicio.InfoTSVInicio.Termino getTermino() {
                return termino;
            }

            /**
             * Define o valor da propriedade termino.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.Termino }
             *     
             */
            public void setTermino(ESocial.EvtTSVInicio.InfoTSVInicio.Termino value) {
                this.termino = value;
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
             *         &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codMotAfast"/>
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
                "codMotAfast"
            })
            public static class Afastamento {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtIniAfast;
                @XmlElement(required = true)
                protected String codMotAfast;

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
             *                   &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *                   &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
             *                   &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *                   &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
             *         &lt;element name="FGTS" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtOpcFGTS"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoDirigenteSindical" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpInsc_1_2" minOccurs="0"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrInsc_11_14" minOccurs="0"/>
             *                   &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="matricOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *                   &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
             *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoTrabCedido" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
             *                   &lt;element name="cnpjCednt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cnpj"/>
             *                   &lt;element name="matricCed" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial"/>
             *                   &lt;element name="dtAdmCed">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *                         &lt;minInclusive value="1890-01-01"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
             *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoMandElet" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
             *                   &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
             *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoEstagiario" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_infoEstagiario" minOccurs="0"/>
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
                "fgts",
                "infoDirigenteSindical",
                "infoTrabCedido",
                "infoMandElet",
                "infoEstagiario"
            })
            public static class InfoComplementares {

                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao cargoFuncao;
                protected TRemuneracao remuneracao;
                @XmlElement(name = "FGTS")
                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.FGTS fgts;
                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical infoDirigenteSindical;
                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoTrabCedido infoTrabCedido;
                protected ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoMandElet infoMandElet;
                protected TInfoEstagiario infoEstagiario;

                /**
                 * Obtém o valor da propriedade cargoFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao getCargoFuncao() {
                    return cargoFuncao;
                }

                /**
                 * Define o valor da propriedade cargoFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao }
                 *     
                 */
                public void setCargoFuncao(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao value) {
                    this.cargoFuncao = value;
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
                 * Obtém o valor da propriedade fgts.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.FGTS }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.FGTS getFGTS() {
                    return fgts;
                }

                /**
                 * Define o valor da propriedade fgts.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.FGTS }
                 *     
                 */
                public void setFGTS(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.FGTS value) {
                    this.fgts = value;
                }

                /**
                 * Obtém o valor da propriedade infoDirigenteSindical.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical getInfoDirigenteSindical() {
                    return infoDirigenteSindical;
                }

                /**
                 * Define o valor da propriedade infoDirigenteSindical.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical }
                 *     
                 */
                public void setInfoDirigenteSindical(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical value) {
                    this.infoDirigenteSindical = value;
                }

                /**
                 * Obtém o valor da propriedade infoTrabCedido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoTrabCedido }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoTrabCedido getInfoTrabCedido() {
                    return infoTrabCedido;
                }

                /**
                 * Define o valor da propriedade infoTrabCedido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoTrabCedido }
                 *     
                 */
                public void setInfoTrabCedido(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoTrabCedido value) {
                    this.infoTrabCedido = value;
                }

                /**
                 * Obtém o valor da propriedade infoMandElet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoMandElet }
                 *     
                 */
                public ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoMandElet getInfoMandElet() {
                    return infoMandElet;
                }

                /**
                 * Define o valor da propriedade infoMandElet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoMandElet }
                 *     
                 */
                public void setInfoMandElet(ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoMandElet value) {
                    this.infoMandElet = value;
                }

                /**
                 * Obtém o valor da propriedade infoEstagiario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TInfoEstagiario }
                 *     
                 */
                public TInfoEstagiario getInfoEstagiario() {
                    return infoEstagiario;
                }

                /**
                 * Define o valor da propriedade infoEstagiario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TInfoEstagiario }
                 *     
                 */
                public void setInfoEstagiario(TInfoEstagiario value) {
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
                 *         &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
                 *         &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
                 *         &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
                 *         &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
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
                    "cboFuncao"
                })
                public static class CargoFuncao {

                    protected String nmCargo;
                    @XmlElement(name = "CBOCargo")
                    protected String cboCargo;
                    protected String nmFuncao;
                    @XmlElement(name = "CBOFuncao")
                    protected String cboFuncao;

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
                 *         &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtOpcFGTS"/>
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
                    "dtOpcFGTS"
                })
                public static class FGTS {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtOpcFGTS;

                    /**
                     * Obtém o valor da propriedade dtOpcFGTS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtOpcFGTS() {
                        return dtOpcFGTS;
                    }

                    /**
                     * Define o valor da propriedade dtOpcFGTS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtOpcFGTS(XMLGregorianCalendar value) {
                        this.dtOpcFGTS = value;
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
                 *         &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpInsc_1_2" minOccurs="0"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nrInsc_11_14" minOccurs="0"/>
                 *         &lt;element name="dtAdmOrig" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="matricOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
                 *         &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab" minOccurs="0"/>
                 *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
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
                    "categOrig",
                    "tpInsc",
                    "nrInsc",
                    "dtAdmOrig",
                    "matricOrig",
                    "tpRegTrab",
                    "tpRegPrev"
                })
                public static class InfoDirigenteSindical {

                    @XmlElement(required = true)
                    protected BigInteger categOrig;
                    protected Byte tpInsc;
                    protected String nrInsc;
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtAdmOrig;
                    protected String matricOrig;
                    protected Byte tpRegTrab;
                    protected byte tpRegPrev;

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
                     * Obtém o valor da propriedade dtAdmOrig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtAdmOrig() {
                        return dtAdmOrig;
                    }

                    /**
                     * Define o valor da propriedade dtAdmOrig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtAdmOrig(XMLGregorianCalendar value) {
                        this.dtAdmOrig = value;
                    }

                    /**
                     * Obtém o valor da propriedade matricOrig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMatricOrig() {
                        return matricOrig;
                    }

                    /**
                     * Define o valor da propriedade matricOrig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMatricOrig(String value) {
                        this.matricOrig = value;
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
                 *         &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_indRemunCargo" minOccurs="0"/>
                 *         &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
                 *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
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
                    "indRemunCargo",
                    "tpRegTrab",
                    "tpRegPrev"
                })
                public static class InfoMandElet {

                    @XmlSchemaType(name = "string")
                    protected TSSimNao indRemunCargo;
                    protected byte tpRegTrab;
                    protected byte tpRegPrev;

                    /**
                     * Obtém o valor da propriedade indRemunCargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getIndRemunCargo() {
                        return indRemunCargo;
                    }

                    /**
                     * Define o valor da propriedade indRemunCargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setIndRemunCargo(TSSimNao value) {
                        this.indRemunCargo = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpRegTrab.
                     * 
                     */
                    public byte getTpRegTrab() {
                        return tpRegTrab;
                    }

                    /**
                     * Define o valor da propriedade tpRegTrab.
                     * 
                     */
                    public void setTpRegTrab(byte value) {
                        this.tpRegTrab = value;
                    }

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
                 *         &lt;element name="categOrig" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codCateg"/>
                 *         &lt;element name="cnpjCednt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cnpj"/>
                 *         &lt;element name="matricCed" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial"/>
                 *         &lt;element name="dtAdmCed">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
                 *               &lt;minInclusive value="1890-01-01"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegTrab"/>
                 *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpRegPrev"/>
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
                    "categOrig",
                    "cnpjCednt",
                    "matricCed",
                    "dtAdmCed",
                    "tpRegTrab",
                    "tpRegPrev"
                })
                public static class InfoTrabCedido {

                    @XmlElement(required = true)
                    protected BigInteger categOrig;
                    @XmlElement(required = true)
                    protected String cnpjCednt;
                    @XmlElement(required = true)
                    protected String matricCed;
                    @XmlElement(required = true)
                    protected XMLGregorianCalendar dtAdmCed;
                    protected byte tpRegTrab;
                    protected byte tpRegPrev;

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
                     * Obtém o valor da propriedade cnpjCednt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjCednt() {
                        return cnpjCednt;
                    }

                    /**
                     * Define o valor da propriedade cnpjCednt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjCednt(String value) {
                        this.cnpjCednt = value;
                    }

                    /**
                     * Obtém o valor da propriedade matricCed.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMatricCed() {
                        return matricCed;
                    }

                    /**
                     * Define o valor da propriedade matricCed.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMatricCed(String value) {
                        this.matricCed = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtAdmCed.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtAdmCed() {
                        return dtAdmCed;
                    }

                    /**
                     * Define o valor da propriedade dtAdmCed.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtAdmCed(XMLGregorianCalendar value) {
                        this.dtAdmCed = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpRegTrab.
                     * 
                     */
                    public byte getTpRegTrab() {
                        return tpRegTrab;
                    }

                    /**
                     * Define o valor da propriedade tpRegTrab.
                     * 
                     */
                    public void setTpRegTrab(byte value) {
                        this.tpRegTrab = value;
                    }

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
             *         &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpf"/>
             *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *         &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                "cpfAnt",
                "matricAnt",
                "dtAltCPF",
                "observacao"
            })
            public static class MudancaCPF {

                @XmlElement(required = true)
                protected String cpfAnt;
                protected String matricAnt;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtAltCPF;
                protected String observacao;

                /**
                 * Obtém o valor da propriedade cpfAnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfAnt() {
                    return cpfAnt;
                }

                /**
                 * Define o valor da propriedade cpfAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfAnt(String value) {
                    this.cpfAnt = value;
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
                 * Obtém o valor da propriedade dtAltCPF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtAltCPF() {
                    return dtAltCPF;
                }

                /**
                 * Define o valor da propriedade dtAltCPF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtAltCPF(XMLGregorianCalendar value) {
                    this.dtAltCPF = value;
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
             *         &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "dtTerm"
            })
            public static class Termino {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTerm;

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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpfTrab"/>
         *         &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmTrab"/>
         *         &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_sexoTrab"/>
         *         &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_racaCorTrab"/>
         *         &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
         *         &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_grauInstr"/>
         *         &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
         *         &lt;element name="nascimento" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_nascimento"/>
         *         &lt;element name="endereco">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_brasil"/>
         *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_exterior"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="trabImig" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
         *                   &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_condIng"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoDeficiencia" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defFisica"/>
         *                   &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defVisual"/>
         *                   &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defAuditiva"/>
         *                   &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defMental"/>
         *                   &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defIntelectual"/>
         *                   &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_reabReadap"/>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dependente" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpDep"/>
         *                   &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmDep"/>
         *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtNascto"/>
         *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
         *                   &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depIRRF"/>
         *                   &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depSF"/>
         *                   &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_incTrab"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_contato" minOccurs="0"/>
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
            "nmTrab",
            "sexo",
            "racaCor",
            "estCiv",
            "grauInstr",
            "nmSoc",
            "nascimento",
            "endereco",
            "trabImig",
            "infoDeficiencia",
            "dependente",
            "contato"
        })
        public static class Trabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;
            @XmlElement(required = true)
            protected String nmTrab;
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSexo sexo;
            protected byte racaCor;
            protected Byte estCiv;
            @XmlElement(required = true)
            protected String grauInstr;
            protected String nmSoc;
            @XmlElement(required = true)
            protected TNascimento nascimento;
            @XmlElement(required = true)
            protected ESocial.EvtTSVInicio.Trabalhador.Endereco endereco;
            protected ESocial.EvtTSVInicio.Trabalhador.TrabImig trabImig;
            protected ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia infoDeficiencia;
            protected List<ESocial.EvtTSVInicio.Trabalhador.Dependente> dependente;
            protected TContato contato;

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
             *     {@link TSSexo }
             *     
             */
            public TSSexo getSexo() {
                return sexo;
            }

            /**
             * Define o valor da propriedade sexo.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSexo }
             *     
             */
            public void setSexo(TSSexo value) {
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
             *     {@link TNascimento }
             *     
             */
            public TNascimento getNascimento() {
                return nascimento;
            }

            /**
             * Define o valor da propriedade nascimento.
             * 
             * @param value
             *     allowed object is
             *     {@link TNascimento }
             *     
             */
            public void setNascimento(TNascimento value) {
                this.nascimento = value;
            }

            /**
             * Obtém o valor da propriedade endereco.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Endereco }
             *     
             */
            public ESocial.EvtTSVInicio.Trabalhador.Endereco getEndereco() {
                return endereco;
            }

            /**
             * Define o valor da propriedade endereco.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.Endereco }
             *     
             */
            public void setEndereco(ESocial.EvtTSVInicio.Trabalhador.Endereco value) {
                this.endereco = value;
            }

            /**
             * Obtém o valor da propriedade trabImig.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.TrabImig }
             *     
             */
            public ESocial.EvtTSVInicio.Trabalhador.TrabImig getTrabImig() {
                return trabImig;
            }

            /**
             * Define o valor da propriedade trabImig.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.TrabImig }
             *     
             */
            public void setTrabImig(ESocial.EvtTSVInicio.Trabalhador.TrabImig value) {
                this.trabImig = value;
            }

            /**
             * Obtém o valor da propriedade infoDeficiencia.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia }
             *     
             */
            public ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia getInfoDeficiencia() {
                return infoDeficiencia;
            }

            /**
             * Define o valor da propriedade infoDeficiencia.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia }
             *     
             */
            public void setInfoDeficiencia(ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia value) {
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
             * {@link ESocial.EvtTSVInicio.Trabalhador.Dependente }
             * 
             * 
             */
            public List<ESocial.EvtTSVInicio.Trabalhador.Dependente> getDependente() {
                if (dependente == null) {
                    dependente = new ArrayList<ESocial.EvtTSVInicio.Trabalhador.Dependente>();
                }
                return this.dependente;
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
             *         &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tpDep"/>
             *         &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_nmDep"/>
             *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_dtNascto"/>
             *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
             *         &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depIRRF"/>
             *         &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_depSF"/>
             *         &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_incTrab"/>
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
                "tpDep",
                "nmDep",
                "dtNascto",
                "cpfDep",
                "depIRRF",
                "depSF",
                "incTrab"
            })
            public static class Dependente {

                @XmlElement(required = true)
                protected String tpDep;
                @XmlElement(required = true)
                protected String nmDep;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtNascto;
                protected String cpfDep;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao depIRRF;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao depSF;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao incTrab;

                /**
                 * Obtém o valor da propriedade tpDep.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTpDep() {
                    return tpDep;
                }

                /**
                 * Define o valor da propriedade tpDep.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTpDep(String value) {
                    this.tpDep = value;
                }

                /**
                 * Obtém o valor da propriedade nmDep.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNmDep() {
                    return nmDep;
                }

                /**
                 * Define o valor da propriedade nmDep.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNmDep(String value) {
                    this.nmDep = value;
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
                 * Obtém o valor da propriedade cpfDep.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfDep() {
                    return cpfDep;
                }

                /**
                 * Define o valor da propriedade cpfDep.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfDep(String value) {
                    this.cpfDep = value;
                }

                /**
                 * Obtém o valor da propriedade depIRRF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getDepIRRF() {
                    return depIRRF;
                }

                /**
                 * Define o valor da propriedade depIRRF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setDepIRRF(TSSimNao value) {
                    this.depIRRF = value;
                }

                /**
                 * Obtém o valor da propriedade depSF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getDepSF() {
                    return depSF;
                }

                /**
                 * Define o valor da propriedade depSF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setDepSF(TSSimNao value) {
                    this.depSF = value;
                }

                /**
                 * Obtém o valor da propriedade incTrab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIncTrab() {
                    return incTrab;
                }

                /**
                 * Define o valor da propriedade incTrab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIncTrab(TSSimNao value) {
                    this.incTrab = value;
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
             *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_brasil"/>
             *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}T_endereco_exterior"/>
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
             *         &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defFisica"/>
             *         &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defVisual"/>
             *         &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defAuditiva"/>
             *         &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defMental"/>
             *         &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_defIntelectual"/>
             *         &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_reabReadap"/>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                "observacao"
            })
            public static class InfoDeficiencia {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao defFisica;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao defVisual;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao defAuditiva;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao defMental;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao defIntelectual;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao reabReadap;
                protected String observacao;

                /**
                 * Obtém o valor da propriedade defFisica.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getDefFisica() {
                    return defFisica;
                }

                /**
                 * Define o valor da propriedade defFisica.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setDefFisica(TSSimNao value) {
                    this.defFisica = value;
                }

                /**
                 * Obtém o valor da propriedade defVisual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getDefVisual() {
                    return defVisual;
                }

                /**
                 * Define o valor da propriedade defVisual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setDefVisual(TSSimNao value) {
                    this.defVisual = value;
                }

                /**
                 * Obtém o valor da propriedade defAuditiva.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getDefAuditiva() {
                    return defAuditiva;
                }

                /**
                 * Define o valor da propriedade defAuditiva.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setDefAuditiva(TSSimNao value) {
                    this.defAuditiva = value;
                }

                /**
                 * Obtém o valor da propriedade defMental.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getDefMental() {
                    return defMental;
                }

                /**
                 * Define o valor da propriedade defMental.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setDefMental(TSSimNao value) {
                    this.defMental = value;
                }

                /**
                 * Obtém o valor da propriedade defIntelectual.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getDefIntelectual() {
                    return defIntelectual;
                }

                /**
                 * Define o valor da propriedade defIntelectual.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setDefIntelectual(TSSimNao value) {
                    this.defIntelectual = value;
                }

                /**
                 * Obtém o valor da propriedade reabReadap.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getReabReadap() {
                    return reabReadap;
                }

                /**
                 * Define o valor da propriedade reabReadap.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setReabReadap(TSSimNao value) {
                    this.reabReadap = value;
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
             *         &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
             *         &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtTSVInicio/v_S_01_00_00}TS_condIng"/>
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
                "tmpResid",
                "condIng"
            })
            public static class TrabImig {

                protected Byte tmpResid;
                protected byte condIng;

                /**
                 * Obtém o valor da propriedade tmpResid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTmpResid() {
                    return tmpResid;
                }

                /**
                 * Define o valor da propriedade tmpResid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTmpResid(Byte value) {
                    this.tmpResid = value;
                }

                /**
                 * Obtém o valor da propriedade condIng.
                 * 
                 */
                public byte getCondIng() {
                    return condIng;
                }

                /**
                 * Define o valor da propriedade condIng.
                 * 
                 */
                public void setCondIng(byte value) {
                    this.condIng = value;
                }

            }

        }

    }

}
