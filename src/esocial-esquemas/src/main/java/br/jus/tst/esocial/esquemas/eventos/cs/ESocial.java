//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:08 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cs;

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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="evtCS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}T_ideEvento_retorno_contrib"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoCS">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrRecArqBase"/>
 *                             &lt;element name="indExistInfo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoCPSeg" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                       &lt;element name="vrCpSeg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoContrib">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="classTrib">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoPJ" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indCoop" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indCoop" minOccurs="0"/>
 *                                                 &lt;element name="indConstr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indConstr"/>
 *                                                 &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatr" minOccurs="0"/>
 *                                                 &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual" minOccurs="0"/>
 *                                                 &lt;element name="infoAtConc" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
 *                                                           &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
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
 *                             &lt;element name="ideEstab" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
 *                                       &lt;element name="infoEstab" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnaePrep" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnae"/>
 *                                                 &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
 *                                                 &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
 *                                                 &lt;element name="aliqRatAjust">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;totalDigits value="5"/>
 *                                                       &lt;fractionDigits value="4"/>
 *                                                       &lt;minInclusive value="0.5"/>
 *                                                       &lt;maxInclusive value="6"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoComplObra" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatrObra"/>
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
 *                                       &lt;element name="ideLotacao" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codigo_esocial"/>
 *                                                 &lt;element name="fpas" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fpas"/>
 *                                                 &lt;element name="codTercs" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
 *                                                 &lt;element name="codTercsSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs" minOccurs="0"/>
 *                                                 &lt;element name="infoTercSusp" maxOccurs="15" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoEmprParcial" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                                                           &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                                                           &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                                                           &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                                                           &lt;element name="cnoObra">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="\d{12}"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dadosOpPort" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
 *                                                           &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
 *                                                           &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
 *                                                           &lt;element name="aliqRatAjust">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                 &lt;totalDigits value="5"/>
 *                                                                 &lt;fractionDigits value="4"/>
 *                                                                 &lt;minInclusive value="0.5"/>
 *                                                                 &lt;maxInclusive value="6"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="basesRemun" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="indIncid">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                 &lt;enumeration value="1"/>
 *                                                                 &lt;enumeration value="2"/>
 *                                                                 &lt;enumeration value="9"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codCateg"/>
 *                                                           &lt;element name="basesCp">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrSuspBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrSuspBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrSuspBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrSuspBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrSuspBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrSuspBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrSuspBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrSuspBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                                     &lt;element name="vrDescSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrCalcSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrDescSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrCalcSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrSalFam" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                                     &lt;element name="vrSalMat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
 *                                                 &lt;element name="basesAvNPort" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                           &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                           &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                           &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                           &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                           &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infoSubstPatrOpPort" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
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
 *                                       &lt;element name="basesAquis" maxOccurs="6" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indAquis">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="3"/>
 *                                                       &lt;enumeration value="4"/>
 *                                                       &lt;enumeration value="5"/>
 *                                                       &lt;enumeration value="6"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vlrAquis" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrCPNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrRatNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrSenarNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrCPCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrRatCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrSenarCalc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="basesComerc" maxOccurs="5" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indComerc"/>
 *                                                 &lt;element name="vrBcComPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
 *                                                 &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                 &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                                 &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoCREstab" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpCR">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;pattern value="\d{6}"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                 &lt;element name="vrSuspCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
 *                             &lt;element name="infoCRContrib" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpCR">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{6}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                       &lt;element name="vrCRSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_Id_retorno" />
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
    "evtCS",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtCS evtCS;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCS.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCS }
     *     
     */
    public ESocial.EvtCS getEvtCS() {
        return evtCS;
    }

    /**
     * Define o valor da propriedade evtCS.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCS }
     *     
     */
    public void setEvtCS(ESocial.EvtCS value) {
        this.evtCS = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}T_ideEvento_retorno_contrib"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoCS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrRecArqBase"/>
     *                   &lt;element name="indExistInfo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoCPSeg" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                             &lt;element name="vrCpSeg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoContrib">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="classTrib">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="infoPJ" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indCoop" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indCoop" minOccurs="0"/>
     *                                       &lt;element name="indConstr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indConstr"/>
     *                                       &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatr" minOccurs="0"/>
     *                                       &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual" minOccurs="0"/>
     *                                       &lt;element name="infoAtConc" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
     *                                                 &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
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
     *                   &lt;element name="ideEstab" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
     *                             &lt;element name="infoEstab" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnaePrep" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnae"/>
     *                                       &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
     *                                       &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
     *                                       &lt;element name="aliqRatAjust">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;totalDigits value="5"/>
     *                                             &lt;fractionDigits value="4"/>
     *                                             &lt;minInclusive value="0.5"/>
     *                                             &lt;maxInclusive value="6"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoComplObra" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatrObra"/>
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
     *                             &lt;element name="ideLotacao" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codigo_esocial"/>
     *                                       &lt;element name="fpas" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fpas"/>
     *                                       &lt;element name="codTercs" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
     *                                       &lt;element name="codTercsSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs" minOccurs="0"/>
     *                                       &lt;element name="infoTercSusp" maxOccurs="15" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoEmprParcial" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                                                 &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
     *                                                 &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                                                 &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
     *                                                 &lt;element name="cnoObra">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="\d{12}"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="dadosOpPort" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
     *                                                 &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
     *                                                 &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
     *                                                 &lt;element name="aliqRatAjust">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                       &lt;totalDigits value="5"/>
     *                                                       &lt;fractionDigits value="4"/>
     *                                                       &lt;minInclusive value="0.5"/>
     *                                                       &lt;maxInclusive value="6"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="basesRemun" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="indIncid">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                       &lt;enumeration value="1"/>
     *                                                       &lt;enumeration value="2"/>
     *                                                       &lt;enumeration value="9"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codCateg"/>
     *                                                 &lt;element name="basesCp">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrSuspBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrSuspBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrSuspBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrSuspBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrSuspBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrSuspBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrSuspBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrSuspBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                                           &lt;element name="vrDescSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrCalcSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrDescSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrCalcSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrSalFam" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                           &lt;element name="vrSalMat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
     *                                       &lt;element name="basesAvNPort" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                 &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                 &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                 &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                 &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                                 &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infoSubstPatrOpPort" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
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
     *                             &lt;element name="basesAquis" maxOccurs="6" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indAquis">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                             &lt;enumeration value="1"/>
     *                                             &lt;enumeration value="2"/>
     *                                             &lt;enumeration value="3"/>
     *                                             &lt;enumeration value="4"/>
     *                                             &lt;enumeration value="5"/>
     *                                             &lt;enumeration value="6"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="vlrAquis" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrCPNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrRatNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrSenarNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrCPCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrRatCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrSenarCalc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="basesComerc" maxOccurs="5" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indComerc"/>
     *                                       &lt;element name="vrBcComPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
     *                                       &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                       &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                       &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoCREstab" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpCR">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;pattern value="\d{6}"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                       &lt;element name="vrSuspCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
     *                   &lt;element name="infoCRContrib" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpCR">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{6}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                             &lt;element name="vrCRSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_Id_retorno" />
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
        "infoCS"
    })
    public static class EvtCS {

        @XmlElement(required = true)
        protected TIdeEventoRetornoContrib ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtCS.InfoCS infoCS;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoRetornoContrib }
         *     
         */
        public TIdeEventoRetornoContrib getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoRetornoContrib }
         *     
         */
        public void setIdeEvento(TIdeEventoRetornoContrib value) {
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
         * Obtém o valor da propriedade infoCS.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCS.InfoCS }
         *     
         */
        public ESocial.EvtCS.InfoCS getInfoCS() {
            return infoCS;
        }

        /**
         * Define o valor da propriedade infoCS.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCS.InfoCS }
         *     
         */
        public void setInfoCS(ESocial.EvtCS.InfoCS value) {
            this.infoCS = value;
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
         *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrRecArqBase"/>
         *         &lt;element name="indExistInfo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infoCPSeg" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                   &lt;element name="vrCpSeg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoContrib">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="classTrib">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infoPJ" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indCoop" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indCoop" minOccurs="0"/>
         *                             &lt;element name="indConstr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indConstr"/>
         *                             &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatr" minOccurs="0"/>
         *                             &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual" minOccurs="0"/>
         *                             &lt;element name="infoAtConc" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
         *                                       &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
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
         *         &lt;element name="ideEstab" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
         *                   &lt;element name="infoEstab" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnaePrep" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnae"/>
         *                             &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
         *                             &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
         *                             &lt;element name="aliqRatAjust">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;totalDigits value="5"/>
         *                                   &lt;fractionDigits value="4"/>
         *                                   &lt;minInclusive value="0.5"/>
         *                                   &lt;maxInclusive value="6"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="infoComplObra" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatrObra"/>
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
         *                   &lt;element name="ideLotacao" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codigo_esocial"/>
         *                             &lt;element name="fpas" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fpas"/>
         *                             &lt;element name="codTercs" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
         *                             &lt;element name="codTercsSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs" minOccurs="0"/>
         *                             &lt;element name="infoTercSusp" maxOccurs="15" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="infoEmprParcial" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
         *                                       &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
         *                                       &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
         *                                       &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
         *                                       &lt;element name="cnoObra">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="\d{12}"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="dadosOpPort" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
         *                                       &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
         *                                       &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
         *                                       &lt;element name="aliqRatAjust">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                             &lt;totalDigits value="5"/>
         *                                             &lt;fractionDigits value="4"/>
         *                                             &lt;minInclusive value="0.5"/>
         *                                             &lt;maxInclusive value="6"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="basesRemun" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="indIncid">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                             &lt;enumeration value="1"/>
         *                                             &lt;enumeration value="2"/>
         *                                             &lt;enumeration value="9"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codCateg"/>
         *                                       &lt;element name="basesCp">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrSuspBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrSuspBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrSuspBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrSuspBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrSuspBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrSuspBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrSuspBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrSuspBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                                                 &lt;element name="vrDescSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrCalcSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrDescSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrCalcSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrSalFam" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                                 &lt;element name="vrSalMat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
         *                             &lt;element name="basesAvNPort" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                       &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                       &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                       &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                       &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                       &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="infoSubstPatrOpPort" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
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
         *                   &lt;element name="basesAquis" maxOccurs="6" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indAquis">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                   &lt;enumeration value="1"/>
         *                                   &lt;enumeration value="2"/>
         *                                   &lt;enumeration value="3"/>
         *                                   &lt;enumeration value="4"/>
         *                                   &lt;enumeration value="5"/>
         *                                   &lt;enumeration value="6"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="vlrAquis" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrCPNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrRatNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrSenarNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrCPCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrRatCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrSenarCalc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="basesComerc" maxOccurs="5" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indComerc"/>
         *                             &lt;element name="vrBcComPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
         *                             &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                             &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                             &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoCREstab" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpCR">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;pattern value="\d{6}"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                             &lt;element name="vrSuspCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
         *         &lt;element name="infoCRContrib" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpCR">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                         &lt;pattern value="\d{6}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                   &lt;element name="vrCRSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
            "nrRecArqBase",
            "indExistInfo",
            "infoCPSeg",
            "infoContrib",
            "ideEstab",
            "infoCRContrib"
        })
        public static class InfoCS {

            @XmlElement(required = true)
            protected String nrRecArqBase;
            protected byte indExistInfo;
            protected ESocial.EvtCS.InfoCS.InfoCPSeg infoCPSeg;
            @XmlElement(required = true)
            protected ESocial.EvtCS.InfoCS.InfoContrib infoContrib;
            protected List<ESocial.EvtCS.InfoCS.IdeEstab> ideEstab;
            protected List<ESocial.EvtCS.InfoCS.InfoCRContrib> infoCRContrib;

            /**
             * Obtém o valor da propriedade nrRecArqBase.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecArqBase() {
                return nrRecArqBase;
            }

            /**
             * Define o valor da propriedade nrRecArqBase.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecArqBase(String value) {
                this.nrRecArqBase = value;
            }

            /**
             * Obtém o valor da propriedade indExistInfo.
             * 
             */
            public byte getIndExistInfo() {
                return indExistInfo;
            }

            /**
             * Define o valor da propriedade indExistInfo.
             * 
             */
            public void setIndExistInfo(byte value) {
                this.indExistInfo = value;
            }

            /**
             * Obtém o valor da propriedade infoCPSeg.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCS.InfoCS.InfoCPSeg }
             *     
             */
            public ESocial.EvtCS.InfoCS.InfoCPSeg getInfoCPSeg() {
                return infoCPSeg;
            }

            /**
             * Define o valor da propriedade infoCPSeg.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCS.InfoCS.InfoCPSeg }
             *     
             */
            public void setInfoCPSeg(ESocial.EvtCS.InfoCS.InfoCPSeg value) {
                this.infoCPSeg = value;
            }

            /**
             * Obtém o valor da propriedade infoContrib.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCS.InfoCS.InfoContrib }
             *     
             */
            public ESocial.EvtCS.InfoCS.InfoContrib getInfoContrib() {
                return infoContrib;
            }

            /**
             * Define o valor da propriedade infoContrib.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCS.InfoCS.InfoContrib }
             *     
             */
            public void setInfoContrib(ESocial.EvtCS.InfoCS.InfoContrib value) {
                this.infoContrib = value;
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
             * {@link ESocial.EvtCS.InfoCS.IdeEstab }
             * 
             * 
             */
            public List<ESocial.EvtCS.InfoCS.IdeEstab> getIdeEstab() {
                if (ideEstab == null) {
                    ideEstab = new ArrayList<ESocial.EvtCS.InfoCS.IdeEstab>();
                }
                return this.ideEstab;
            }

            /**
             * Gets the value of the infoCRContrib property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoCRContrib property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoCRContrib().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtCS.InfoCS.InfoCRContrib }
             * 
             * 
             */
            public List<ESocial.EvtCS.InfoCS.InfoCRContrib> getInfoCRContrib() {
                if (infoCRContrib == null) {
                    infoCRContrib = new ArrayList<ESocial.EvtCS.InfoCS.InfoCRContrib>();
                }
                return this.infoCRContrib;
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
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
             *         &lt;element name="infoEstab" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnaePrep" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnae"/>
             *                   &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
             *                   &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
             *                   &lt;element name="aliqRatAjust">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;totalDigits value="5"/>
             *                         &lt;fractionDigits value="4"/>
             *                         &lt;minInclusive value="0.5"/>
             *                         &lt;maxInclusive value="6"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="infoComplObra" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatrObra"/>
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
             *         &lt;element name="ideLotacao" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codigo_esocial"/>
             *                   &lt;element name="fpas" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fpas"/>
             *                   &lt;element name="codTercs" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
             *                   &lt;element name="codTercsSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs" minOccurs="0"/>
             *                   &lt;element name="infoTercSusp" maxOccurs="15" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infoEmprParcial" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
             *                             &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
             *                             &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
             *                             &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
             *                             &lt;element name="cnoObra">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="\d{12}"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="dadosOpPort" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
             *                             &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
             *                             &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
             *                             &lt;element name="aliqRatAjust">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                   &lt;totalDigits value="5"/>
             *                                   &lt;fractionDigits value="4"/>
             *                                   &lt;minInclusive value="0.5"/>
             *                                   &lt;maxInclusive value="6"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="basesRemun" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="indIncid">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                   &lt;enumeration value="1"/>
             *                                   &lt;enumeration value="2"/>
             *                                   &lt;enumeration value="9"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codCateg"/>
             *                             &lt;element name="basesCp">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrSuspBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrSuspBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrSuspBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrSuspBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrSuspBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrSuspBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrSuspBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrSuspBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                                       &lt;element name="vrDescSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrCalcSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrDescSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrCalcSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrSalFam" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                                       &lt;element name="vrSalMat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
             *                   &lt;element name="basesAvNPort" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                             &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                             &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                             &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                             &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                             &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infoSubstPatrOpPort" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
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
             *         &lt;element name="basesAquis" maxOccurs="6" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indAquis">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                         &lt;enumeration value="1"/>
             *                         &lt;enumeration value="2"/>
             *                         &lt;enumeration value="3"/>
             *                         &lt;enumeration value="4"/>
             *                         &lt;enumeration value="5"/>
             *                         &lt;enumeration value="6"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="vlrAquis" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrCPNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrRatNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrSenarNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrCPCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrRatCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrSenarCalc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="basesComerc" maxOccurs="5" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indComerc"/>
             *                   &lt;element name="vrBcComPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *                   &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                   &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                   &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoCREstab" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpCR">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;pattern value="\d{6}"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                   &lt;element name="vrSuspCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
                "infoEstab",
                "ideLotacao",
                "basesAquis",
                "basesComerc",
                "infoCREstab"
            })
            public static class IdeEstab {

                protected byte tpInsc;
                @XmlElement(required = true)
                protected String nrInsc;
                protected ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab infoEstab;
                protected List<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao> ideLotacao;
                protected List<ESocial.EvtCS.InfoCS.IdeEstab.BasesAquis> basesAquis;
                protected List<ESocial.EvtCS.InfoCS.IdeEstab.BasesComerc> basesComerc;
                protected List<ESocial.EvtCS.InfoCS.IdeEstab.InfoCREstab> infoCREstab;

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
                 * Obtém o valor da propriedade infoEstab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab }
                 *     
                 */
                public ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab getInfoEstab() {
                    return infoEstab;
                }

                /**
                 * Define o valor da propriedade infoEstab.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab }
                 *     
                 */
                public void setInfoEstab(ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab value) {
                    this.infoEstab = value;
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
                 * {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao }
                 * 
                 * 
                 */
                public List<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao> getIdeLotacao() {
                    if (ideLotacao == null) {
                        ideLotacao = new ArrayList<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao>();
                    }
                    return this.ideLotacao;
                }

                /**
                 * Gets the value of the basesAquis property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the basesAquis property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBasesAquis().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtCS.InfoCS.IdeEstab.BasesAquis }
                 * 
                 * 
                 */
                public List<ESocial.EvtCS.InfoCS.IdeEstab.BasesAquis> getBasesAquis() {
                    if (basesAquis == null) {
                        basesAquis = new ArrayList<ESocial.EvtCS.InfoCS.IdeEstab.BasesAquis>();
                    }
                    return this.basesAquis;
                }

                /**
                 * Gets the value of the basesComerc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the basesComerc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBasesComerc().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtCS.InfoCS.IdeEstab.BasesComerc }
                 * 
                 * 
                 */
                public List<ESocial.EvtCS.InfoCS.IdeEstab.BasesComerc> getBasesComerc() {
                    if (basesComerc == null) {
                        basesComerc = new ArrayList<ESocial.EvtCS.InfoCS.IdeEstab.BasesComerc>();
                    }
                    return this.basesComerc;
                }

                /**
                 * Gets the value of the infoCREstab property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoCREstab property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoCREstab().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtCS.InfoCS.IdeEstab.InfoCREstab }
                 * 
                 * 
                 */
                public List<ESocial.EvtCS.InfoCS.IdeEstab.InfoCREstab> getInfoCREstab() {
                    if (infoCREstab == null) {
                        infoCREstab = new ArrayList<ESocial.EvtCS.InfoCS.IdeEstab.InfoCREstab>();
                    }
                    return this.infoCREstab;
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
                 *         &lt;element name="indAquis">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *               &lt;enumeration value="4"/>
                 *               &lt;enumeration value="5"/>
                 *               &lt;enumeration value="6"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vlrAquis" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrCPDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrCPNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrRatNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrSenarNRet" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrCPCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrRatDescPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrRatCalcPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrSenarDesc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrSenarCalc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
                    "indAquis",
                    "vlrAquis",
                    "vrCPDescPR",
                    "vrCPNRet",
                    "vrRatNRet",
                    "vrSenarNRet",
                    "vrCPCalcPR",
                    "vrRatDescPR",
                    "vrRatCalcPR",
                    "vrSenarDesc",
                    "vrSenarCalc"
                })
                public static class BasesAquis {

                    protected byte indAquis;
                    @XmlElement(required = true)
                    protected BigDecimal vlrAquis;
                    @XmlElement(required = true)
                    protected BigDecimal vrCPDescPR;
                    @XmlElement(required = true)
                    protected BigDecimal vrCPNRet;
                    @XmlElement(required = true)
                    protected BigDecimal vrRatNRet;
                    @XmlElement(required = true)
                    protected BigDecimal vrSenarNRet;
                    @XmlElement(required = true)
                    protected BigDecimal vrCPCalcPR;
                    @XmlElement(required = true)
                    protected BigDecimal vrRatDescPR;
                    @XmlElement(required = true)
                    protected BigDecimal vrRatCalcPR;
                    @XmlElement(required = true)
                    protected BigDecimal vrSenarDesc;
                    @XmlElement(required = true)
                    protected BigDecimal vrSenarCalc;

                    /**
                     * Obtém o valor da propriedade indAquis.
                     * 
                     */
                    public byte getIndAquis() {
                        return indAquis;
                    }

                    /**
                     * Define o valor da propriedade indAquis.
                     * 
                     */
                    public void setIndAquis(byte value) {
                        this.indAquis = value;
                    }

                    /**
                     * Obtém o valor da propriedade vlrAquis.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVlrAquis() {
                        return vlrAquis;
                    }

                    /**
                     * Define o valor da propriedade vlrAquis.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVlrAquis(BigDecimal value) {
                        this.vlrAquis = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrCPDescPR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrCPDescPR() {
                        return vrCPDescPR;
                    }

                    /**
                     * Define o valor da propriedade vrCPDescPR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrCPDescPR(BigDecimal value) {
                        this.vrCPDescPR = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrCPNRet.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrCPNRet() {
                        return vrCPNRet;
                    }

                    /**
                     * Define o valor da propriedade vrCPNRet.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrCPNRet(BigDecimal value) {
                        this.vrCPNRet = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRatNRet.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRatNRet() {
                        return vrRatNRet;
                    }

                    /**
                     * Define o valor da propriedade vrRatNRet.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRatNRet(BigDecimal value) {
                        this.vrRatNRet = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrSenarNRet.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrSenarNRet() {
                        return vrSenarNRet;
                    }

                    /**
                     * Define o valor da propriedade vrSenarNRet.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrSenarNRet(BigDecimal value) {
                        this.vrSenarNRet = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrCPCalcPR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrCPCalcPR() {
                        return vrCPCalcPR;
                    }

                    /**
                     * Define o valor da propriedade vrCPCalcPR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrCPCalcPR(BigDecimal value) {
                        this.vrCPCalcPR = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRatDescPR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRatDescPR() {
                        return vrRatDescPR;
                    }

                    /**
                     * Define o valor da propriedade vrRatDescPR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRatDescPR(BigDecimal value) {
                        this.vrRatDescPR = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRatCalcPR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRatCalcPR() {
                        return vrRatCalcPR;
                    }

                    /**
                     * Define o valor da propriedade vrRatCalcPR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRatCalcPR(BigDecimal value) {
                        this.vrRatCalcPR = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrSenarDesc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrSenarDesc() {
                        return vrSenarDesc;
                    }

                    /**
                     * Define o valor da propriedade vrSenarDesc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrSenarDesc(BigDecimal value) {
                        this.vrSenarDesc = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrSenarCalc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrSenarCalc() {
                        return vrSenarCalc;
                    }

                    /**
                     * Define o valor da propriedade vrSenarCalc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrSenarCalc(BigDecimal value) {
                        this.vrSenarCalc = value;
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
                 *         &lt;element name="indComerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indComerc"/>
                 *         &lt;element name="vrBcComPR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *         &lt;element name="vrCPSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *         &lt;element name="vrRatSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *         &lt;element name="vrSenarSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
                    "indComerc",
                    "vrBcComPR",
                    "vrCPSusp",
                    "vrRatSusp",
                    "vrSenarSusp"
                })
                public static class BasesComerc {

                    protected byte indComerc;
                    @XmlElement(required = true)
                    protected BigDecimal vrBcComPR;
                    protected BigDecimal vrCPSusp;
                    protected BigDecimal vrRatSusp;
                    protected BigDecimal vrSenarSusp;

                    /**
                     * Obtém o valor da propriedade indComerc.
                     * 
                     */
                    public byte getIndComerc() {
                        return indComerc;
                    }

                    /**
                     * Define o valor da propriedade indComerc.
                     * 
                     */
                    public void setIndComerc(byte value) {
                        this.indComerc = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrBcComPR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrBcComPR() {
                        return vrBcComPR;
                    }

                    /**
                     * Define o valor da propriedade vrBcComPR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrBcComPR(BigDecimal value) {
                        this.vrBcComPR = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrCPSusp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrCPSusp() {
                        return vrCPSusp;
                    }

                    /**
                     * Define o valor da propriedade vrCPSusp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrCPSusp(BigDecimal value) {
                        this.vrCPSusp = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrRatSusp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrRatSusp() {
                        return vrRatSusp;
                    }

                    /**
                     * Define o valor da propriedade vrRatSusp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrRatSusp(BigDecimal value) {
                        this.vrRatSusp = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrSenarSusp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrSenarSusp() {
                        return vrSenarSusp;
                    }

                    /**
                     * Define o valor da propriedade vrSenarSusp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrSenarSusp(BigDecimal value) {
                        this.vrSenarSusp = value;
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
                 *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codigo_esocial"/>
                 *         &lt;element name="fpas" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fpas"/>
                 *         &lt;element name="codTercs" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
                 *         &lt;element name="codTercsSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs" minOccurs="0"/>
                 *         &lt;element name="infoTercSusp" maxOccurs="15" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="infoEmprParcial" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
                 *                   &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
                 *                   &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
                 *                   &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
                 *                   &lt;element name="cnoObra">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="\d{12}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="dadosOpPort" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
                 *                   &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
                 *                   &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
                 *                   &lt;element name="aliqRatAjust">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                         &lt;totalDigits value="5"/>
                 *                         &lt;fractionDigits value="4"/>
                 *                         &lt;minInclusive value="0.5"/>
                 *                         &lt;maxInclusive value="6"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="basesRemun" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="indIncid">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;enumeration value="1"/>
                 *                         &lt;enumeration value="2"/>
                 *                         &lt;enumeration value="9"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codCateg"/>
                 *                   &lt;element name="basesCp">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrSuspBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrSuspBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrSuspBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrSuspBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrSuspBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrSuspBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrSuspBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrSuspBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                 *                             &lt;element name="vrDescSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrCalcSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrDescSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrCalcSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrSalFam" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                             &lt;element name="vrSalMat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
                 *         &lt;element name="basesAvNPort" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                   &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                   &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                   &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                   &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                   &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="infoSubstPatrOpPort" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
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
                    "fpas",
                    "codTercs",
                    "codTercsSusp",
                    "infoTercSusp",
                    "infoEmprParcial",
                    "dadosOpPort",
                    "basesRemun",
                    "basesAvNPort",
                    "infoSubstPatrOpPort"
                })
                public static class IdeLotacao {

                    @XmlElement(required = true)
                    protected String codLotacao;
                    @XmlElement(required = true)
                    protected BigInteger fpas;
                    @XmlElement(required = true)
                    protected String codTercs;
                    protected String codTercsSusp;
                    protected List<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoTercSusp> infoTercSusp;
                    protected ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoEmprParcial infoEmprParcial;
                    protected ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.DadosOpPort dadosOpPort;
                    protected List<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun> basesRemun;
                    protected ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesAvNPort basesAvNPort;
                    protected ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoSubstPatrOpPort infoSubstPatrOpPort;

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
                     * Obtém o valor da propriedade fpas.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getFpas() {
                        return fpas;
                    }

                    /**
                     * Define o valor da propriedade fpas.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setFpas(BigInteger value) {
                        this.fpas = value;
                    }

                    /**
                     * Obtém o valor da propriedade codTercs.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodTercs() {
                        return codTercs;
                    }

                    /**
                     * Define o valor da propriedade codTercs.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodTercs(String value) {
                        this.codTercs = value;
                    }

                    /**
                     * Obtém o valor da propriedade codTercsSusp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodTercsSusp() {
                        return codTercsSusp;
                    }

                    /**
                     * Define o valor da propriedade codTercsSusp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodTercsSusp(String value) {
                        this.codTercsSusp = value;
                    }

                    /**
                     * Gets the value of the infoTercSusp property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the infoTercSusp property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getInfoTercSusp().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoTercSusp }
                     * 
                     * 
                     */
                    public List<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoTercSusp> getInfoTercSusp() {
                        if (infoTercSusp == null) {
                            infoTercSusp = new ArrayList<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoTercSusp>();
                        }
                        return this.infoTercSusp;
                    }

                    /**
                     * Obtém o valor da propriedade infoEmprParcial.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoEmprParcial }
                     *     
                     */
                    public ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoEmprParcial getInfoEmprParcial() {
                        return infoEmprParcial;
                    }

                    /**
                     * Define o valor da propriedade infoEmprParcial.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoEmprParcial }
                     *     
                     */
                    public void setInfoEmprParcial(ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoEmprParcial value) {
                        this.infoEmprParcial = value;
                    }

                    /**
                     * Obtém o valor da propriedade dadosOpPort.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.DadosOpPort }
                     *     
                     */
                    public ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.DadosOpPort getDadosOpPort() {
                        return dadosOpPort;
                    }

                    /**
                     * Define o valor da propriedade dadosOpPort.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.DadosOpPort }
                     *     
                     */
                    public void setDadosOpPort(ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.DadosOpPort value) {
                        this.dadosOpPort = value;
                    }

                    /**
                     * Gets the value of the basesRemun property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the basesRemun property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBasesRemun().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun }
                     * 
                     * 
                     */
                    public List<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun> getBasesRemun() {
                        if (basesRemun == null) {
                            basesRemun = new ArrayList<ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun>();
                        }
                        return this.basesRemun;
                    }

                    /**
                     * Obtém o valor da propriedade basesAvNPort.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesAvNPort }
                     *     
                     */
                    public ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesAvNPort getBasesAvNPort() {
                        return basesAvNPort;
                    }

                    /**
                     * Define o valor da propriedade basesAvNPort.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesAvNPort }
                     *     
                     */
                    public void setBasesAvNPort(ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesAvNPort value) {
                        this.basesAvNPort = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoSubstPatrOpPort.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoSubstPatrOpPort }
                     *     
                     */
                    public ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoSubstPatrOpPort getInfoSubstPatrOpPort() {
                        return infoSubstPatrOpPort;
                    }

                    /**
                     * Define o valor da propriedade infoSubstPatrOpPort.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoSubstPatrOpPort }
                     *     
                     */
                    public void setInfoSubstPatrOpPort(ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.InfoSubstPatrOpPort value) {
                        this.infoSubstPatrOpPort = value;
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
                     *         &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *         &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *         &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *         &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *         &lt;element name="vrBcCp13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *         &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
                        "vrBcCp00",
                        "vrBcCp15",
                        "vrBcCp20",
                        "vrBcCp25",
                        "vrBcCp13",
                        "vrDescCP"
                    })
                    public static class BasesAvNPort {

                        @XmlElement(required = true)
                        protected BigDecimal vrBcCp00;
                        @XmlElement(required = true)
                        protected BigDecimal vrBcCp15;
                        @XmlElement(required = true)
                        protected BigDecimal vrBcCp20;
                        @XmlElement(required = true)
                        protected BigDecimal vrBcCp25;
                        @XmlElement(required = true)
                        protected BigDecimal vrBcCp13;
                        @XmlElement(required = true)
                        protected BigDecimal vrDescCP;

                        /**
                         * Obtém o valor da propriedade vrBcCp00.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrBcCp00() {
                            return vrBcCp00;
                        }

                        /**
                         * Define o valor da propriedade vrBcCp00.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrBcCp00(BigDecimal value) {
                            this.vrBcCp00 = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrBcCp15.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrBcCp15() {
                            return vrBcCp15;
                        }

                        /**
                         * Define o valor da propriedade vrBcCp15.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrBcCp15(BigDecimal value) {
                            this.vrBcCp15 = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrBcCp20.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrBcCp20() {
                            return vrBcCp20;
                        }

                        /**
                         * Define o valor da propriedade vrBcCp20.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrBcCp20(BigDecimal value) {
                            this.vrBcCp20 = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrBcCp25.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrBcCp25() {
                            return vrBcCp25;
                        }

                        /**
                         * Define o valor da propriedade vrBcCp25.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrBcCp25(BigDecimal value) {
                            this.vrBcCp25 = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrBcCp13.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrBcCp13() {
                            return vrBcCp13;
                        }

                        /**
                         * Define o valor da propriedade vrBcCp13.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrBcCp13(BigDecimal value) {
                            this.vrBcCp13 = value;
                        }

                        /**
                         * Obtém o valor da propriedade vrDescCP.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getVrDescCP() {
                            return vrDescCP;
                        }

                        /**
                         * Define o valor da propriedade vrDescCP.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setVrDescCP(BigDecimal value) {
                            this.vrDescCP = value;
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
                     *         &lt;element name="indIncid">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *               &lt;enumeration value="9"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codCateg"/>
                     *         &lt;element name="basesCp">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrSuspBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrSuspBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrSuspBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrSuspBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrSuspBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrSuspBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrSuspBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrSuspBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                     *                   &lt;element name="vrDescSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrCalcSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrDescSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrCalcSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrSalFam" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                     *                   &lt;element name="vrSalMat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
                        "indIncid",
                        "codCateg",
                        "basesCp"
                    })
                    public static class BasesRemun {

                        protected byte indIncid;
                        @XmlElement(required = true)
                        protected BigInteger codCateg;
                        @XmlElement(required = true)
                        protected ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun.BasesCp basesCp;

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
                         * Obtém o valor da propriedade basesCp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun.BasesCp }
                         *     
                         */
                        public ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun.BasesCp getBasesCp() {
                            return basesCp;
                        }

                        /**
                         * Define o valor da propriedade basesCp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun.BasesCp }
                         *     
                         */
                        public void setBasesCp(ESocial.EvtCS.InfoCS.IdeEstab.IdeLotacao.BasesRemun.BasesCp value) {
                            this.basesCp = value;
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
                         *         &lt;element name="vrBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrSuspBcCp00" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrSuspBcCp15" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrSuspBcCp20" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrSuspBcCp25" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrSuspBcCp00VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrSuspBcCp15VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrSuspBcCp20VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrSuspBcCp25VA" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
                         *         &lt;element name="vrDescSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrCalcSest" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrDescSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrCalcSenat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrSalFam" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
                         *         &lt;element name="vrSalMat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
                            "vrBcCp00",
                            "vrBcCp15",
                            "vrBcCp20",
                            "vrBcCp25",
                            "vrSuspBcCp00",
                            "vrSuspBcCp15",
                            "vrSuspBcCp20",
                            "vrSuspBcCp25",
                            "vrBcCp00VA",
                            "vrBcCp15VA",
                            "vrBcCp20VA",
                            "vrBcCp25VA",
                            "vrSuspBcCp00VA",
                            "vrSuspBcCp15VA",
                            "vrSuspBcCp20VA",
                            "vrSuspBcCp25VA",
                            "vrDescSest",
                            "vrCalcSest",
                            "vrDescSenat",
                            "vrCalcSenat",
                            "vrSalFam",
                            "vrSalMat"
                        })
                        public static class BasesCp {

                            @XmlElement(required = true)
                            protected BigDecimal vrBcCp00;
                            @XmlElement(required = true)
                            protected BigDecimal vrBcCp15;
                            @XmlElement(required = true)
                            protected BigDecimal vrBcCp20;
                            @XmlElement(required = true)
                            protected BigDecimal vrBcCp25;
                            @XmlElement(required = true)
                            protected BigDecimal vrSuspBcCp00;
                            @XmlElement(required = true)
                            protected BigDecimal vrSuspBcCp15;
                            @XmlElement(required = true)
                            protected BigDecimal vrSuspBcCp20;
                            @XmlElement(required = true)
                            protected BigDecimal vrSuspBcCp25;
                            protected BigDecimal vrBcCp00VA;
                            protected BigDecimal vrBcCp15VA;
                            protected BigDecimal vrBcCp20VA;
                            protected BigDecimal vrBcCp25VA;
                            protected BigDecimal vrSuspBcCp00VA;
                            protected BigDecimal vrSuspBcCp15VA;
                            protected BigDecimal vrSuspBcCp20VA;
                            protected BigDecimal vrSuspBcCp25VA;
                            @XmlElement(required = true)
                            protected BigDecimal vrDescSest;
                            @XmlElement(required = true)
                            protected BigDecimal vrCalcSest;
                            @XmlElement(required = true)
                            protected BigDecimal vrDescSenat;
                            @XmlElement(required = true)
                            protected BigDecimal vrCalcSenat;
                            @XmlElement(required = true)
                            protected BigDecimal vrSalFam;
                            @XmlElement(required = true)
                            protected BigDecimal vrSalMat;

                            /**
                             * Obtém o valor da propriedade vrBcCp00.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp00() {
                                return vrBcCp00;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp00.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp00(BigDecimal value) {
                                this.vrBcCp00 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrBcCp15.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp15() {
                                return vrBcCp15;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp15.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp15(BigDecimal value) {
                                this.vrBcCp15 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrBcCp20.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp20() {
                                return vrBcCp20;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp20.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp20(BigDecimal value) {
                                this.vrBcCp20 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrBcCp25.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp25() {
                                return vrBcCp25;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp25.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp25(BigDecimal value) {
                                this.vrBcCp25 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp00.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp00() {
                                return vrSuspBcCp00;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp00.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp00(BigDecimal value) {
                                this.vrSuspBcCp00 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp15.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp15() {
                                return vrSuspBcCp15;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp15.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp15(BigDecimal value) {
                                this.vrSuspBcCp15 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp20.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp20() {
                                return vrSuspBcCp20;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp20.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp20(BigDecimal value) {
                                this.vrSuspBcCp20 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp25.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp25() {
                                return vrSuspBcCp25;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp25.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp25(BigDecimal value) {
                                this.vrSuspBcCp25 = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrBcCp00VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp00VA() {
                                return vrBcCp00VA;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp00VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp00VA(BigDecimal value) {
                                this.vrBcCp00VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrBcCp15VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp15VA() {
                                return vrBcCp15VA;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp15VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp15VA(BigDecimal value) {
                                this.vrBcCp15VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrBcCp20VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp20VA() {
                                return vrBcCp20VA;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp20VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp20VA(BigDecimal value) {
                                this.vrBcCp20VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrBcCp25VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrBcCp25VA() {
                                return vrBcCp25VA;
                            }

                            /**
                             * Define o valor da propriedade vrBcCp25VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrBcCp25VA(BigDecimal value) {
                                this.vrBcCp25VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp00VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp00VA() {
                                return vrSuspBcCp00VA;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp00VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp00VA(BigDecimal value) {
                                this.vrSuspBcCp00VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp15VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp15VA() {
                                return vrSuspBcCp15VA;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp15VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp15VA(BigDecimal value) {
                                this.vrSuspBcCp15VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp20VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp20VA() {
                                return vrSuspBcCp20VA;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp20VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp20VA(BigDecimal value) {
                                this.vrSuspBcCp20VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSuspBcCp25VA.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSuspBcCp25VA() {
                                return vrSuspBcCp25VA;
                            }

                            /**
                             * Define o valor da propriedade vrSuspBcCp25VA.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSuspBcCp25VA(BigDecimal value) {
                                this.vrSuspBcCp25VA = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrDescSest.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrDescSest() {
                                return vrDescSest;
                            }

                            /**
                             * Define o valor da propriedade vrDescSest.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrDescSest(BigDecimal value) {
                                this.vrDescSest = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrCalcSest.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrCalcSest() {
                                return vrCalcSest;
                            }

                            /**
                             * Define o valor da propriedade vrCalcSest.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrCalcSest(BigDecimal value) {
                                this.vrCalcSest = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrDescSenat.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrDescSenat() {
                                return vrDescSenat;
                            }

                            /**
                             * Define o valor da propriedade vrDescSenat.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrDescSenat(BigDecimal value) {
                                this.vrDescSenat = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrCalcSenat.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrCalcSenat() {
                                return vrCalcSenat;
                            }

                            /**
                             * Define o valor da propriedade vrCalcSenat.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrCalcSenat(BigDecimal value) {
                                this.vrCalcSenat = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSalFam.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSalFam() {
                                return vrSalFam;
                            }

                            /**
                             * Define o valor da propriedade vrSalFam.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSalFam(BigDecimal value) {
                                this.vrSalFam = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrSalMat.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrSalMat() {
                                return vrSalMat;
                            }

                            /**
                             * Define o valor da propriedade vrSalMat.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrSalMat(BigDecimal value) {
                                this.vrSalMat = value;
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
                     *         &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
                     *         &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
                     *         &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
                     *         &lt;element name="aliqRatAjust">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *               &lt;totalDigits value="5"/>
                     *               &lt;fractionDigits value="4"/>
                     *               &lt;minInclusive value="0.5"/>
                     *               &lt;maxInclusive value="6"/>
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
                        "cnpjOpPortuario",
                        "aliqRat",
                        "fap",
                        "aliqRatAjust"
                    })
                    public static class DadosOpPort {

                        @XmlElement(required = true)
                        protected String cnpjOpPortuario;
                        protected byte aliqRat;
                        @XmlElement(required = true)
                        protected BigDecimal fap;
                        @XmlElement(required = true)
                        protected BigDecimal aliqRatAjust;

                        /**
                         * Obtém o valor da propriedade cnpjOpPortuario.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnpjOpPortuario() {
                            return cnpjOpPortuario;
                        }

                        /**
                         * Define o valor da propriedade cnpjOpPortuario.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnpjOpPortuario(String value) {
                            this.cnpjOpPortuario = value;
                        }

                        /**
                         * Obtém o valor da propriedade aliqRat.
                         * 
                         */
                        public byte getAliqRat() {
                            return aliqRat;
                        }

                        /**
                         * Define o valor da propriedade aliqRat.
                         * 
                         */
                        public void setAliqRat(byte value) {
                            this.aliqRat = value;
                        }

                        /**
                         * Obtém o valor da propriedade fap.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getFap() {
                            return fap;
                        }

                        /**
                         * Define o valor da propriedade fap.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setFap(BigDecimal value) {
                            this.fap = value;
                        }

                        /**
                         * Obtém o valor da propriedade aliqRatAjust.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getAliqRatAjust() {
                            return aliqRatAjust;
                        }

                        /**
                         * Define o valor da propriedade aliqRatAjust.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setAliqRatAjust(BigDecimal value) {
                            this.aliqRatAjust = value;
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
                     *         &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
                     *         &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
                     *         &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
                     *         &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
                     *         &lt;element name="cnoObra">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="\d{12}"/>
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
                        "tpInscContrat",
                        "nrInscContrat",
                        "tpInscProp",
                        "nrInscProp",
                        "cnoObra"
                    })
                    public static class InfoEmprParcial {

                        protected byte tpInscContrat;
                        @XmlElement(required = true)
                        protected String nrInscContrat;
                        protected byte tpInscProp;
                        @XmlElement(required = true)
                        protected String nrInscProp;
                        @XmlElement(required = true)
                        protected String cnoObra;

                        /**
                         * Obtém o valor da propriedade tpInscContrat.
                         * 
                         */
                        public byte getTpInscContrat() {
                            return tpInscContrat;
                        }

                        /**
                         * Define o valor da propriedade tpInscContrat.
                         * 
                         */
                        public void setTpInscContrat(byte value) {
                            this.tpInscContrat = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrInscContrat.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrInscContrat() {
                            return nrInscContrat;
                        }

                        /**
                         * Define o valor da propriedade nrInscContrat.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrInscContrat(String value) {
                            this.nrInscContrat = value;
                        }

                        /**
                         * Obtém o valor da propriedade tpInscProp.
                         * 
                         */
                        public byte getTpInscProp() {
                            return tpInscProp;
                        }

                        /**
                         * Define o valor da propriedade tpInscProp.
                         * 
                         */
                        public void setTpInscProp(byte value) {
                            this.tpInscProp = value;
                        }

                        /**
                         * Obtém o valor da propriedade nrInscProp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNrInscProp() {
                            return nrInscProp;
                        }

                        /**
                         * Define o valor da propriedade nrInscProp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNrInscProp(String value) {
                            this.nrInscProp = value;
                        }

                        /**
                         * Obtém o valor da propriedade cnoObra.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnoObra() {
                            return cnoObra;
                        }

                        /**
                         * Define o valor da propriedade cnoObra.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnoObra(String value) {
                            this.cnoObra = value;
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
                     *         &lt;element name="cnpjOpPortuario" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnpj"/>
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
                        "cnpjOpPortuario"
                    })
                    public static class InfoSubstPatrOpPort {

                        @XmlElement(required = true)
                        protected String cnpjOpPortuario;

                        /**
                         * Obtém o valor da propriedade cnpjOpPortuario.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCnpjOpPortuario() {
                            return cnpjOpPortuario;
                        }

                        /**
                         * Define o valor da propriedade cnpjOpPortuario.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCnpjOpPortuario(String value) {
                            this.cnpjOpPortuario = value;
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
                     *         &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codTercs"/>
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
                        "codTerc"
                    })
                    public static class InfoTercSusp {

                        @XmlElement(required = true)
                        protected String codTerc;

                        /**
                         * Obtém o valor da propriedade codTerc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodTerc() {
                            return codTerc;
                        }

                        /**
                         * Define o valor da propriedade codTerc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodTerc(String value) {
                            this.codTerc = value;
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
                 *               &lt;pattern value="\d{6}"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *         &lt;element name="vrSuspCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
                    "vrCR",
                    "vrSuspCR"
                })
                public static class InfoCREstab {

                    @XmlElement(required = true)
                    protected BigInteger tpCR;
                    @XmlElement(required = true)
                    protected BigDecimal vrCR;
                    protected BigDecimal vrSuspCR;

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
                     * Obtém o valor da propriedade vrCR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrCR() {
                        return vrCR;
                    }

                    /**
                     * Define o valor da propriedade vrCR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrCR(BigDecimal value) {
                        this.vrCR = value;
                    }

                    /**
                     * Obtém o valor da propriedade vrSuspCR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVrSuspCR() {
                        return vrSuspCR;
                    }

                    /**
                     * Define o valor da propriedade vrSuspCR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVrSuspCR(BigDecimal value) {
                        this.vrSuspCR = value;
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
                 *         &lt;element name="cnaePrep" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_cnae"/>
                 *         &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_aliqRat"/>
                 *         &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_fap"/>
                 *         &lt;element name="aliqRatAjust">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;totalDigits value="5"/>
                 *               &lt;fractionDigits value="4"/>
                 *               &lt;minInclusive value="0.5"/>
                 *               &lt;maxInclusive value="6"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="infoComplObra" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatrObra"/>
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
                    "cnaePrep",
                    "aliqRat",
                    "fap",
                    "aliqRatAjust",
                    "infoComplObra"
                })
                public static class InfoEstab {

                    @XmlElement(required = true)
                    protected BigInteger cnaePrep;
                    protected byte aliqRat;
                    @XmlElement(required = true)
                    protected BigDecimal fap;
                    @XmlElement(required = true)
                    protected BigDecimal aliqRatAjust;
                    protected ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab.InfoComplObra infoComplObra;

                    /**
                     * Obtém o valor da propriedade cnaePrep.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCnaePrep() {
                        return cnaePrep;
                    }

                    /**
                     * Define o valor da propriedade cnaePrep.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCnaePrep(BigInteger value) {
                        this.cnaePrep = value;
                    }

                    /**
                     * Obtém o valor da propriedade aliqRat.
                     * 
                     */
                    public byte getAliqRat() {
                        return aliqRat;
                    }

                    /**
                     * Define o valor da propriedade aliqRat.
                     * 
                     */
                    public void setAliqRat(byte value) {
                        this.aliqRat = value;
                    }

                    /**
                     * Obtém o valor da propriedade fap.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getFap() {
                        return fap;
                    }

                    /**
                     * Define o valor da propriedade fap.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setFap(BigDecimal value) {
                        this.fap = value;
                    }

                    /**
                     * Obtém o valor da propriedade aliqRatAjust.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAliqRatAjust() {
                        return aliqRatAjust;
                    }

                    /**
                     * Define o valor da propriedade aliqRatAjust.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAliqRatAjust(BigDecimal value) {
                        this.aliqRatAjust = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoComplObra.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab.InfoComplObra }
                     *     
                     */
                    public ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab.InfoComplObra getInfoComplObra() {
                        return infoComplObra;
                    }

                    /**
                     * Define o valor da propriedade infoComplObra.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab.InfoComplObra }
                     *     
                     */
                    public void setInfoComplObra(ESocial.EvtCS.InfoCS.IdeEstab.InfoEstab.InfoComplObra value) {
                        this.infoComplObra = value;
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
                     *         &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatrObra"/>
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
                        "indSubstPatrObra"
                    })
                    public static class InfoComplObra {

                        protected byte indSubstPatrObra;

                        /**
                         * Obtém o valor da propriedade indSubstPatrObra.
                         * 
                         */
                        public byte getIndSubstPatrObra() {
                            return indSubstPatrObra;
                        }

                        /**
                         * Define o valor da propriedade indSubstPatrObra.
                         * 
                         */
                        public void setIndSubstPatrObra(byte value) {
                            this.indSubstPatrObra = value;
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
             *         &lt;element name="classTrib">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{2}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infoPJ" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="indCoop" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indCoop" minOccurs="0"/>
             *                   &lt;element name="indConstr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indConstr"/>
             *                   &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatr" minOccurs="0"/>
             *                   &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual" minOccurs="0"/>
             *                   &lt;element name="infoAtConc" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
             *                             &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
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
                "classTrib",
                "infoPJ"
            })
            public static class InfoContrib {

                @XmlElement(required = true)
                protected String classTrib;
                protected ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ infoPJ;

                /**
                 * Obtém o valor da propriedade classTrib.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClassTrib() {
                    return classTrib;
                }

                /**
                 * Define o valor da propriedade classTrib.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClassTrib(String value) {
                    this.classTrib = value;
                }

                /**
                 * Obtém o valor da propriedade infoPJ.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ }
                 *     
                 */
                public ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ getInfoPJ() {
                    return infoPJ;
                }

                /**
                 * Define o valor da propriedade infoPJ.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ }
                 *     
                 */
                public void setInfoPJ(ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ value) {
                    this.infoPJ = value;
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
                 *         &lt;element name="indCoop" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indCoop" minOccurs="0"/>
                 *         &lt;element name="indConstr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indConstr"/>
                 *         &lt;element name="indSubstPatr" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_indSubstPatr" minOccurs="0"/>
                 *         &lt;element name="percRedContrib" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual" minOccurs="0"/>
                 *         &lt;element name="infoAtConc" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
                 *                   &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
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
                    "indCoop",
                    "indConstr",
                    "indSubstPatr",
                    "percRedContrib",
                    "infoAtConc"
                })
                public static class InfoPJ {

                    protected Byte indCoop;
                    protected byte indConstr;
                    protected Byte indSubstPatr;
                    protected BigDecimal percRedContrib;
                    protected ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ.InfoAtConc infoAtConc;

                    /**
                     * Obtém o valor da propriedade indCoop.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getIndCoop() {
                        return indCoop;
                    }

                    /**
                     * Define o valor da propriedade indCoop.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setIndCoop(Byte value) {
                        this.indCoop = value;
                    }

                    /**
                     * Obtém o valor da propriedade indConstr.
                     * 
                     */
                    public byte getIndConstr() {
                        return indConstr;
                    }

                    /**
                     * Define o valor da propriedade indConstr.
                     * 
                     */
                    public void setIndConstr(byte value) {
                        this.indConstr = value;
                    }

                    /**
                     * Obtém o valor da propriedade indSubstPatr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getIndSubstPatr() {
                        return indSubstPatr;
                    }

                    /**
                     * Define o valor da propriedade indSubstPatr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setIndSubstPatr(Byte value) {
                        this.indSubstPatr = value;
                    }

                    /**
                     * Obtém o valor da propriedade percRedContrib.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPercRedContrib() {
                        return percRedContrib;
                    }

                    /**
                     * Define o valor da propriedade percRedContrib.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPercRedContrib(BigDecimal value) {
                        this.percRedContrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoAtConc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ.InfoAtConc }
                     *     
                     */
                    public ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ.InfoAtConc getInfoAtConc() {
                        return infoAtConc;
                    }

                    /**
                     * Define o valor da propriedade infoAtConc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ.InfoAtConc }
                     *     
                     */
                    public void setInfoAtConc(ESocial.EvtCS.InfoCS.InfoContrib.InfoPJ.InfoAtConc value) {
                        this.infoAtConc = value;
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
                     *         &lt;element name="fatorMes" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
                     *         &lt;element name="fator13" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_percentual"/>
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
                        "fatorMes",
                        "fator13"
                    })
                    public static class InfoAtConc {

                        @XmlElement(required = true)
                        protected BigDecimal fatorMes;
                        @XmlElement(required = true)
                        protected BigDecimal fator13;

                        /**
                         * Obtém o valor da propriedade fatorMes.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getFatorMes() {
                            return fatorMes;
                        }

                        /**
                         * Define o valor da propriedade fatorMes.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setFatorMes(BigDecimal value) {
                            this.fatorMes = value;
                        }

                        /**
                         * Obtém o valor da propriedade fator13.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getFator13() {
                            return fator13;
                        }

                        /**
                         * Define o valor da propriedade fator13.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setFator13(BigDecimal value) {
                            this.fator13 = value;
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
             *         &lt;element name="vrDescCP" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
             *         &lt;element name="vrCpSeg" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario"/>
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
                "vrDescCP",
                "vrCpSeg"
            })
            public static class InfoCPSeg {

                @XmlElement(required = true)
                protected BigDecimal vrDescCP;
                @XmlElement(required = true)
                protected BigDecimal vrCpSeg;

                /**
                 * Obtém o valor da propriedade vrDescCP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrDescCP() {
                    return vrDescCP;
                }

                /**
                 * Define o valor da propriedade vrDescCP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrDescCP(BigDecimal value) {
                    this.vrDescCP = value;
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
             *               &lt;pattern value="\d{6}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vrCR" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *         &lt;element name="vrCRSusp" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_valorMonetario" minOccurs="0"/>
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
                "vrCR",
                "vrCRSusp"
            })
            public static class InfoCRContrib {

                @XmlElement(required = true)
                protected BigInteger tpCR;
                @XmlElement(required = true)
                protected BigDecimal vrCR;
                protected BigDecimal vrCRSusp;

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
                 * Obtém o valor da propriedade vrCR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCR() {
                    return vrCR;
                }

                /**
                 * Define o valor da propriedade vrCR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCR(BigDecimal value) {
                    this.vrCR = value;
                }

                /**
                 * Obtém o valor da propriedade vrCRSusp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrCRSusp() {
                    return vrCRSusp;
                }

                /**
                 * Define o valor da propriedade vrCRSusp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrCRSusp(BigDecimal value) {
                    this.vrCRSusp = value;
                }

            }

        }

    }

}
