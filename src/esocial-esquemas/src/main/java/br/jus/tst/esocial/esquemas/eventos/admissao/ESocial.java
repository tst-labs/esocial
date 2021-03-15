//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:48 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admissao;

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
 *         &lt;element name="evtAdmissao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_ideEvento_trab_admissao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="trabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpfTrab"/>
 *                             &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmTrab"/>
 *                             &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sexoTrab"/>
 *                             &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_racaCorTrab"/>
 *                             &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
 *                             &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_grauInstr"/>
 *                             &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
 *                             &lt;element name="nascimento" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_nascimento"/>
 *                             &lt;element name="endereco" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil"/>
 *                                         &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_exterior"/>
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
 *                                       &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
 *                                       &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_condIng"/>
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
 *                                       &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defFisica"/>
 *                                       &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defVisual"/>
 *                                       &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defAuditiva"/>
 *                                       &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defMental"/>
 *                                       &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defIntelectual"/>
 *                                       &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_reabReadap"/>
 *                                       &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
 *                                       &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpDep"/>
 *                                       &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmDep"/>
 *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtNascto"/>
 *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
 *                                       &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sexo" minOccurs="0"/>
 *                                       &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depIRRF"/>
 *                                       &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depSF"/>
 *                                       &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_incTrab"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_contato" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vinculo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial"/>
 *                             &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegTrab"/>
 *                             &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegPrev"/>
 *                             &lt;element name="cadIni">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="S"/>
 *                                   &lt;enumeration value="N"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="infoRegimeTrab">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="infoCeletista">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                   &lt;element name="tpAdmissao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                         &lt;enumeration value="4"/>
 *                                                         &lt;enumeration value="5"/>
 *                                                         &lt;enumeration value="6"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="indAdmissao">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
 *                                                   &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegJor"/>
 *                                                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_natAtividade"/>
 *                                                   &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
 *                                                   &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cnpjSindCategProf"/>
 *                                                   &lt;element name="FGTS" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtOpcFGTS"/>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="trabTemporario" minOccurs="0">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;sequence>
 *                                                             &lt;element name="hipLeg">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                   &lt;enumeration value="1"/>
 *                                                                   &lt;enumeration value="2"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="justContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_999"/>
 *                                                             &lt;element name="ideEstabVinc">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                                                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="cpfTrabSubst" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/sequence>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_aprend" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="infoEstatutario">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpProv">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                         &lt;enumeration value="5"/>
 *                                                         &lt;enumeration value="6"/>
 *                                                         &lt;enumeration value="7"/>
 *                                                         &lt;enumeration value="8"/>
 *                                                         &lt;enumeration value="9"/>
 *                                                         &lt;enumeration value="10"/>
 *                                                         &lt;enumeration value="99"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                   &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpPlanRP" minOccurs="0"/>
 *                                                   &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                   &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                   &lt;element name="dtIniAbono" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
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
 *                                       &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                       &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
 *                                       &lt;element name="dtIngrCargo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
 *                                       &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
 *                                       &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codCateg"/>
 *                                       &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
 *                                       &lt;element name="duracao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpContr"/>
 *                                                 &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
 *                                                 &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                 &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_objDet" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="localTrabalho" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
 *                                                 &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_horContratual" minOccurs="0"/>
 *                                       &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
 *                                       &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
 *                                       &lt;element name="tpInsc">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="5"/>
 *                                             &lt;enumeration value="6"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrInsc">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{8,14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                       &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="transfDom" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cpfSubstituido" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
 *                                       &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                                       &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                                       &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
 *                                       &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial"/>
 *                                       &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
 *                                       &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codMotAfast"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="desligamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="cessao" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_Id" />
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
    "evtAdmissao",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAdmissao evtAdmissao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAdmissao.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAdmissao }
     *     
     */
    public ESocial.EvtAdmissao getEvtAdmissao() {
        return evtAdmissao;
    }

    /**
     * Define o valor da propriedade evtAdmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAdmissao }
     *     
     */
    public void setEvtAdmissao(ESocial.EvtAdmissao value) {
        this.evtAdmissao = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_ideEvento_trab_admissao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="trabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpfTrab"/>
     *                   &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmTrab"/>
     *                   &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sexoTrab"/>
     *                   &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_racaCorTrab"/>
     *                   &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
     *                   &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_grauInstr"/>
     *                   &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
     *                   &lt;element name="nascimento" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_nascimento"/>
     *                   &lt;element name="endereco" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil"/>
     *                               &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_exterior"/>
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
     *                             &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
     *                             &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_condIng"/>
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
     *                             &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defFisica"/>
     *                             &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defVisual"/>
     *                             &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defAuditiva"/>
     *                             &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defMental"/>
     *                             &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defIntelectual"/>
     *                             &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_reabReadap"/>
     *                             &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
     *                             &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpDep"/>
     *                             &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmDep"/>
     *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtNascto"/>
     *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
     *                             &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sexo" minOccurs="0"/>
     *                             &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depIRRF"/>
     *                             &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depSF"/>
     *                             &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_incTrab"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_contato" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vinculo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial"/>
     *                   &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegTrab"/>
     *                   &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegPrev"/>
     *                   &lt;element name="cadIni">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="S"/>
     *                         &lt;enumeration value="N"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="infoRegimeTrab">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="infoCeletista">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                         &lt;element name="tpAdmissao">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                               &lt;enumeration value="4"/>
     *                                               &lt;enumeration value="5"/>
     *                                               &lt;enumeration value="6"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="indAdmissao">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
     *                                         &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegJor"/>
     *                                         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_natAtividade"/>
     *                                         &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
     *                                         &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cnpjSindCategProf"/>
     *                                         &lt;element name="FGTS" minOccurs="0">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;sequence>
     *                                                   &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtOpcFGTS"/>
     *                                                 &lt;/sequence>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="trabTemporario" minOccurs="0">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;sequence>
     *                                                   &lt;element name="hipLeg">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                         &lt;enumeration value="1"/>
     *                                                         &lt;enumeration value="2"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="justContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_999"/>
     *                                                   &lt;element name="ideEstabVinc">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpInsc_1_2"/>
     *                                                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrInsc_11_14"/>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="cpfTrabSubst" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                 &lt;/sequence>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_aprend" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="infoEstatutario">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpProv">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                               &lt;enumeration value="5"/>
     *                                               &lt;enumeration value="6"/>
     *                                               &lt;enumeration value="7"/>
     *                                               &lt;enumeration value="8"/>
     *                                               &lt;enumeration value="9"/>
     *                                               &lt;enumeration value="10"/>
     *                                               &lt;enumeration value="99"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                         &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpPlanRP" minOccurs="0"/>
     *                                         &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                         &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                         &lt;element name="dtIniAbono" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
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
     *                             &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                             &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
     *                             &lt;element name="dtIngrCargo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
     *                             &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
     *                             &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codCateg"/>
     *                             &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
     *                             &lt;element name="duracao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpContr"/>
     *                                       &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
     *                                       &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                       &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_objDet" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="localTrabalho" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
     *                                       &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_horContratual" minOccurs="0"/>
     *                             &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
     *                             &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
     *                             &lt;element name="tpInsc">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="5"/>
     *                                   &lt;enumeration value="6"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrInsc">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{8,14}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                             &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="transfDom" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cpfSubstituido" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
     *                             &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                             &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *                             &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
     *                             &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial"/>
     *                             &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
     *                             &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codMotAfast"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="desligamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="cessao" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_Id" />
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
        "vinculo"
    })
    public static class EvtAdmissao {

        @XmlElement(required = true)
        protected TIdeEventoTrabAdmissao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAdmissao.Trabalhador trabalhador;
        @XmlElement(required = true)
        protected ESocial.EvtAdmissao.Vinculo vinculo;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabAdmissao }
         *     
         */
        public TIdeEventoTrabAdmissao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabAdmissao }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabAdmissao value) {
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
         *     {@link ESocial.EvtAdmissao.Trabalhador }
         *     
         */
        public ESocial.EvtAdmissao.Trabalhador getTrabalhador() {
            return trabalhador;
        }

        /**
         * Define o valor da propriedade trabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAdmissao.Trabalhador }
         *     
         */
        public void setTrabalhador(ESocial.EvtAdmissao.Trabalhador value) {
            this.trabalhador = value;
        }

        /**
         * Obtém o valor da propriedade vinculo.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAdmissao.Vinculo }
         *     
         */
        public ESocial.EvtAdmissao.Vinculo getVinculo() {
            return vinculo;
        }

        /**
         * Define o valor da propriedade vinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAdmissao.Vinculo }
         *     
         */
        public void setVinculo(ESocial.EvtAdmissao.Vinculo value) {
            this.vinculo = value;
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpfTrab"/>
         *         &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmTrab"/>
         *         &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sexoTrab"/>
         *         &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_racaCorTrab"/>
         *         &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
         *         &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_grauInstr"/>
         *         &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
         *         &lt;element name="nascimento" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_nascimento"/>
         *         &lt;element name="endereco" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil"/>
         *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_exterior"/>
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
         *                   &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
         *                   &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_condIng"/>
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
         *                   &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defFisica"/>
         *                   &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defVisual"/>
         *                   &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defAuditiva"/>
         *                   &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defMental"/>
         *                   &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defIntelectual"/>
         *                   &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_reabReadap"/>
         *                   &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
         *                   &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpDep"/>
         *                   &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmDep"/>
         *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtNascto"/>
         *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
         *                   &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sexo" minOccurs="0"/>
         *                   &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depIRRF"/>
         *                   &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depSF"/>
         *                   &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_incTrab"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_contato" minOccurs="0"/>
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
            protected ESocial.EvtAdmissao.Trabalhador.Endereco endereco;
            protected ESocial.EvtAdmissao.Trabalhador.TrabImig trabImig;
            protected ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia infoDeficiencia;
            protected List<ESocial.EvtAdmissao.Trabalhador.Dependente> dependente;
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
             *     {@link ESocial.EvtAdmissao.Trabalhador.Endereco }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.Endereco getEndereco() {
                return endereco;
            }

            /**
             * Define o valor da propriedade endereco.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.Endereco }
             *     
             */
            public void setEndereco(ESocial.EvtAdmissao.Trabalhador.Endereco value) {
                this.endereco = value;
            }

            /**
             * Obtém o valor da propriedade trabImig.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.TrabImig }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.TrabImig getTrabImig() {
                return trabImig;
            }

            /**
             * Define o valor da propriedade trabImig.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.TrabImig }
             *     
             */
            public void setTrabImig(ESocial.EvtAdmissao.Trabalhador.TrabImig value) {
                this.trabImig = value;
            }

            /**
             * Obtém o valor da propriedade infoDeficiencia.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia }
             *     
             */
            public ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia getInfoDeficiencia() {
                return infoDeficiencia;
            }

            /**
             * Define o valor da propriedade infoDeficiencia.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia }
             *     
             */
            public void setInfoDeficiencia(ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia value) {
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
             * {@link ESocial.EvtAdmissao.Trabalhador.Dependente }
             * 
             * 
             */
            public List<ESocial.EvtAdmissao.Trabalhador.Dependente> getDependente() {
                if (dependente == null) {
                    dependente = new ArrayList<ESocial.EvtAdmissao.Trabalhador.Dependente>();
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
             *         &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpDep"/>
             *         &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nmDep"/>
             *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtNascto"/>
             *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
             *         &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sexo" minOccurs="0"/>
             *         &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depIRRF"/>
             *         &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_depSF"/>
             *         &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_incTrab"/>
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
                "sexoDep",
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
                @XmlSchemaType(name = "string")
                protected TSSexo sexoDep;
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
                 * Obtém o valor da propriedade sexoDep.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSexo }
                 *     
                 */
                public TSSexo getSexoDep() {
                    return sexoDep;
                }

                /**
                 * Define o valor da propriedade sexoDep.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSexo }
                 *     
                 */
                public void setSexoDep(TSSexo value) {
                    this.sexoDep = value;
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
             *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil"/>
             *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_exterior"/>
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
             *         &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defFisica"/>
             *         &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defVisual"/>
             *         &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defAuditiva"/>
             *         &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defMental"/>
             *         &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_defIntelectual"/>
             *         &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_reabReadap"/>
             *         &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                @XmlSchemaType(name = "string")
                protected TSSimNao infoCota;
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
                 * Obtém o valor da propriedade infoCota.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getInfoCota() {
                    return infoCota;
                }

                /**
                 * Define o valor da propriedade infoCota.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setInfoCota(TSSimNao value) {
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
             *         &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
             *         &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_condIng"/>
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
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial"/>
         *         &lt;element name="tpRegTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegTrab"/>
         *         &lt;element name="tpRegPrev" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegPrev"/>
         *         &lt;element name="cadIni">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="S"/>
         *               &lt;enumeration value="N"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="infoRegimeTrab">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="infoCeletista">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                               &lt;element name="tpAdmissao">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                     &lt;enumeration value="4"/>
         *                                     &lt;enumeration value="5"/>
         *                                     &lt;enumeration value="6"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="indAdmissao">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
         *                               &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegJor"/>
         *                               &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_natAtividade"/>
         *                               &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
         *                               &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cnpjSindCategProf"/>
         *                               &lt;element name="FGTS" minOccurs="0">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;sequence>
         *                                         &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtOpcFGTS"/>
         *                                       &lt;/sequence>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="trabTemporario" minOccurs="0">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;sequence>
         *                                         &lt;element name="hipLeg">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                               &lt;enumeration value="1"/>
         *                                               &lt;enumeration value="2"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="justContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_999"/>
         *                                         &lt;element name="ideEstabVinc">
         *                                           &lt;complexType>
         *                                             &lt;complexContent>
         *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                 &lt;sequence>
         *                                                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpInsc_1_2"/>
         *                                                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrInsc_11_14"/>
         *                                                 &lt;/sequence>
         *                                               &lt;/restriction>
         *                                             &lt;/complexContent>
         *                                           &lt;/complexType>
         *                                         &lt;/element>
         *                                         &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
         *                                           &lt;complexType>
         *                                             &lt;complexContent>
         *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                 &lt;sequence>
         *                                                   &lt;element name="cpfTrabSubst" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
         *                                                 &lt;/sequence>
         *                                               &lt;/restriction>
         *                                             &lt;/complexContent>
         *                                           &lt;/complexType>
         *                                         &lt;/element>
         *                                       &lt;/sequence>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_aprend" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="infoEstatutario">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpProv">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                     &lt;enumeration value="5"/>
         *                                     &lt;enumeration value="6"/>
         *                                     &lt;enumeration value="7"/>
         *                                     &lt;enumeration value="8"/>
         *                                     &lt;enumeration value="9"/>
         *                                     &lt;enumeration value="10"/>
         *                                     &lt;enumeration value="99"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                               &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpPlanRP" minOccurs="0"/>
         *                               &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                               &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                               &lt;element name="dtIniAbono" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
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
         *                   &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                   &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
         *                   &lt;element name="dtIngrCargo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
         *                   &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
         *                   &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codCateg"/>
         *                   &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
         *                   &lt;element name="duracao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpContr"/>
         *                             &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
         *                             &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                             &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_objDet" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="localTrabalho" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
         *                             &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_horContratual" minOccurs="0"/>
         *                   &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
         *                   &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
         *                   &lt;element name="tpInsc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="5"/>
         *                         &lt;enumeration value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrInsc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{8,14}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                   &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="transfDom" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cpfSubstituido" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
         *                   &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *                   &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
         *                   &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
         *                   &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial"/>
         *                   &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
         *                   &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codMotAfast"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="desligamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cessao" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "tpRegTrab",
            "tpRegPrev",
            "cadIni",
            "infoRegimeTrab",
            "infoContrato",
            "sucessaoVinc",
            "transfDom",
            "mudancaCPF",
            "afastamento",
            "desligamento",
            "cessao"
        })
        public static class Vinculo {

            @XmlElement(required = true)
            protected String matricula;
            protected byte tpRegTrab;
            protected byte tpRegPrev;
            @XmlElement(required = true)
            protected String cadIni;
            @XmlElement(required = true)
            protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab infoRegimeTrab;
            @XmlElement(required = true)
            protected ESocial.EvtAdmissao.Vinculo.InfoContrato infoContrato;
            protected ESocial.EvtAdmissao.Vinculo.SucessaoVinc sucessaoVinc;
            protected ESocial.EvtAdmissao.Vinculo.TransfDom transfDom;
            protected ESocial.EvtAdmissao.Vinculo.MudancaCPF mudancaCPF;
            protected ESocial.EvtAdmissao.Vinculo.Afastamento afastamento;
            protected ESocial.EvtAdmissao.Vinculo.Desligamento desligamento;
            protected ESocial.EvtAdmissao.Vinculo.Cessao cessao;

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
             * Obtém o valor da propriedade infoRegimeTrab.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab getInfoRegimeTrab() {
                return infoRegimeTrab;
            }

            /**
             * Define o valor da propriedade infoRegimeTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab }
             *     
             */
            public void setInfoRegimeTrab(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab value) {
                this.infoRegimeTrab = value;
            }

            /**
             * Obtém o valor da propriedade infoContrato.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.InfoContrato }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.InfoContrato getInfoContrato() {
                return infoContrato;
            }

            /**
             * Define o valor da propriedade infoContrato.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.InfoContrato }
             *     
             */
            public void setInfoContrato(ESocial.EvtAdmissao.Vinculo.InfoContrato value) {
                this.infoContrato = value;
            }

            /**
             * Obtém o valor da propriedade sucessaoVinc.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.SucessaoVinc }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.SucessaoVinc getSucessaoVinc() {
                return sucessaoVinc;
            }

            /**
             * Define o valor da propriedade sucessaoVinc.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.SucessaoVinc }
             *     
             */
            public void setSucessaoVinc(ESocial.EvtAdmissao.Vinculo.SucessaoVinc value) {
                this.sucessaoVinc = value;
            }

            /**
             * Obtém o valor da propriedade transfDom.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.TransfDom }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.TransfDom getTransfDom() {
                return transfDom;
            }

            /**
             * Define o valor da propriedade transfDom.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.TransfDom }
             *     
             */
            public void setTransfDom(ESocial.EvtAdmissao.Vinculo.TransfDom value) {
                this.transfDom = value;
            }

            /**
             * Obtém o valor da propriedade mudancaCPF.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.MudancaCPF }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.MudancaCPF getMudancaCPF() {
                return mudancaCPF;
            }

            /**
             * Define o valor da propriedade mudancaCPF.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.MudancaCPF }
             *     
             */
            public void setMudancaCPF(ESocial.EvtAdmissao.Vinculo.MudancaCPF value) {
                this.mudancaCPF = value;
            }

            /**
             * Obtém o valor da propriedade afastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Afastamento }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.Afastamento getAfastamento() {
                return afastamento;
            }

            /**
             * Define o valor da propriedade afastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Afastamento }
             *     
             */
            public void setAfastamento(ESocial.EvtAdmissao.Vinculo.Afastamento value) {
                this.afastamento = value;
            }

            /**
             * Obtém o valor da propriedade desligamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Desligamento }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.Desligamento getDesligamento() {
                return desligamento;
            }

            /**
             * Define o valor da propriedade desligamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Desligamento }
             *     
             */
            public void setDesligamento(ESocial.EvtAdmissao.Vinculo.Desligamento value) {
                this.desligamento = value;
            }

            /**
             * Obtém o valor da propriedade cessao.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Cessao }
             *     
             */
            public ESocial.EvtAdmissao.Vinculo.Cessao getCessao() {
                return cessao;
            }

            /**
             * Define o valor da propriedade cessao.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmissao.Vinculo.Cessao }
             *     
             */
            public void setCessao(ESocial.EvtAdmissao.Vinculo.Cessao value) {
                this.cessao = value;
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
             *         &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codMotAfast"/>
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
             *         &lt;element name="dtIniCessao" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "dtIniCessao"
            })
            public static class Cessao {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtIniCessao;

                /**
                 * Obtém o valor da propriedade dtIniCessao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIniCessao() {
                    return dtIniCessao;
                }

                /**
                 * Define o valor da propriedade dtIniCessao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIniCessao(XMLGregorianCalendar value) {
                    this.dtIniCessao = value;
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
             *         &lt;element name="dtDeslig" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "dtDeslig"
            })
            public static class Desligamento {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtDeslig;

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
             *         &lt;element name="nmCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *         &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOCargo" minOccurs="0"/>
             *         &lt;element name="dtIngrCargo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="nmFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_100" minOccurs="0"/>
             *         &lt;element name="CBOFuncao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_CBOFuncao" minOccurs="0"/>
             *         &lt;element name="acumCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codCateg"/>
             *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_remuneracao" minOccurs="0"/>
             *         &lt;element name="duracao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpContr"/>
             *                   &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
             *                   &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                   &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_objDet" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="localTrabalho" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
             *                   &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="horContratual" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_horContratual" minOccurs="0"/>
             *         &lt;element name="alvaraJudicial" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_alvaraJudicial" minOccurs="0"/>
             *         &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="treiCap" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_treiCap" maxOccurs="99" minOccurs="0"/>
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
                "dtIngrCargo",
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
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtIngrCargo;
                protected String nmFuncao;
                @XmlElement(name = "CBOFuncao")
                protected String cboFuncao;
                @XmlSchemaType(name = "string")
                protected TSSimNao acumCargo;
                @XmlElement(required = true)
                protected BigInteger codCateg;
                protected TRemuneracao remuneracao;
                protected ESocial.EvtAdmissao.Vinculo.InfoContrato.Duracao duracao;
                protected ESocial.EvtAdmissao.Vinculo.InfoContrato.LocalTrabalho localTrabalho;
                protected THorContratual horContratual;
                protected TAlvaraJudicial alvaraJudicial;
                protected List<ESocial.EvtAdmissao.Vinculo.InfoContrato.Observacoes> observacoes;
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
                 * Obtém o valor da propriedade dtIngrCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtIngrCargo() {
                    return dtIngrCargo;
                }

                /**
                 * Define o valor da propriedade dtIngrCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtIngrCargo(XMLGregorianCalendar value) {
                    this.dtIngrCargo = value;
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
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoContrato.Duracao }
                 *     
                 */
                public ESocial.EvtAdmissao.Vinculo.InfoContrato.Duracao getDuracao() {
                    return duracao;
                }

                /**
                 * Define o valor da propriedade duracao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoContrato.Duracao }
                 *     
                 */
                public void setDuracao(ESocial.EvtAdmissao.Vinculo.InfoContrato.Duracao value) {
                    this.duracao = value;
                }

                /**
                 * Obtém o valor da propriedade localTrabalho.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoContrato.LocalTrabalho }
                 *     
                 */
                public ESocial.EvtAdmissao.Vinculo.InfoContrato.LocalTrabalho getLocalTrabalho() {
                    return localTrabalho;
                }

                /**
                 * Define o valor da propriedade localTrabalho.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoContrato.LocalTrabalho }
                 *     
                 */
                public void setLocalTrabalho(ESocial.EvtAdmissao.Vinculo.InfoContrato.LocalTrabalho value) {
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
                 * {@link ESocial.EvtAdmissao.Vinculo.InfoContrato.Observacoes }
                 * 
                 * 
                 */
                public List<ESocial.EvtAdmissao.Vinculo.InfoContrato.Observacoes> getObservacoes() {
                    if (observacoes == null) {
                        observacoes = new ArrayList<ESocial.EvtAdmissao.Vinculo.InfoContrato.Observacoes>();
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
                 *         &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpContr"/>
                 *         &lt;element name="dtTerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtTerm" minOccurs="0"/>
                 *         &lt;element name="clauAssec" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *         &lt;element name="objDet" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_objDet" minOccurs="0"/>
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
                    "clauAssec",
                    "objDet"
                })
                public static class Duracao {

                    protected byte tpContr;
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtTerm;
                    @XmlSchemaType(name = "string")
                    protected TSSimNao clauAssec;
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
                     * Obtém o valor da propriedade clauAssec.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getClauAssec() {
                        return clauAssec;
                    }

                    /**
                     * Define o valor da propriedade clauAssec.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setClauAssec(TSSimNao value) {
                        this.clauAssec = value;
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
                 *         &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_localTrabGeral" minOccurs="0"/>
                 *         &lt;element name="localTempDom" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_endereco_brasil" minOccurs="0"/>
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
                 *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao"/>
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
             *         &lt;choice>
             *           &lt;element name="infoCeletista">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                     &lt;element name="tpAdmissao">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                           &lt;enumeration value="4"/>
             *                           &lt;enumeration value="5"/>
             *                           &lt;enumeration value="6"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="indAdmissao">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
             *                     &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegJor"/>
             *                     &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_natAtividade"/>
             *                     &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
             *                     &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cnpjSindCategProf"/>
             *                     &lt;element name="FGTS" minOccurs="0">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtOpcFGTS"/>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="trabTemporario" minOccurs="0">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="hipLeg">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                     &lt;enumeration value="1"/>
             *                                     &lt;enumeration value="2"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="justContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_999"/>
             *                               &lt;element name="ideEstabVinc">
             *                                 &lt;complexType>
             *                                   &lt;complexContent>
             *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                       &lt;sequence>
             *                                         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpInsc_1_2"/>
             *                                         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrInsc_11_14"/>
             *                                       &lt;/sequence>
             *                                     &lt;/restriction>
             *                                   &lt;/complexContent>
             *                                 &lt;/complexType>
             *                               &lt;/element>
             *                               &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
             *                                 &lt;complexType>
             *                                   &lt;complexContent>
             *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                       &lt;sequence>
             *                                         &lt;element name="cpfTrabSubst" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
             *                                       &lt;/sequence>
             *                                     &lt;/restriction>
             *                                   &lt;/complexContent>
             *                                 &lt;/complexType>
             *                               &lt;/element>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_aprend" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="infoEstatutario">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpProv">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                           &lt;enumeration value="5"/>
             *                           &lt;enumeration value="6"/>
             *                           &lt;enumeration value="7"/>
             *                           &lt;enumeration value="8"/>
             *                           &lt;enumeration value="9"/>
             *                           &lt;enumeration value="10"/>
             *                           &lt;enumeration value="99"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                     &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpPlanRP" minOccurs="0"/>
             *                     &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                     &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                     &lt;element name="dtIniAbono" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
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
                "infoCeletista",
                "infoEstatutario"
            })
            public static class InfoRegimeTrab {

                protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista infoCeletista;
                protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario infoEstatutario;

                /**
                 * Obtém o valor da propriedade infoCeletista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista }
                 *     
                 */
                public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista getInfoCeletista() {
                    return infoCeletista;
                }

                /**
                 * Define o valor da propriedade infoCeletista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista }
                 *     
                 */
                public void setInfoCeletista(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista value) {
                    this.infoCeletista = value;
                }

                /**
                 * Obtém o valor da propriedade infoEstatutario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario }
                 *     
                 */
                public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario getInfoEstatutario() {
                    return infoEstatutario;
                }

                /**
                 * Define o valor da propriedade infoEstatutario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario }
                 *     
                 */
                public void setInfoEstatutario(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario value) {
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
                 *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="tpAdmissao">
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
                 *         &lt;element name="indAdmissao">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nrProcTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
                 *         &lt;element name="tpRegJor" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpRegJor"/>
                 *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_natAtividade"/>
                 *         &lt;element name="dtBase" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtBase" minOccurs="0"/>
                 *         &lt;element name="cnpjSindCategProf" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cnpjSindCategProf"/>
                 *         &lt;element name="FGTS" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtOpcFGTS"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="trabTemporario" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="hipLeg">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                         &lt;enumeration value="1"/>
                 *                         &lt;enumeration value="2"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="justContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_999"/>
                 *                   &lt;element name="ideEstabVinc">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpInsc_1_2"/>
                 *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrInsc_11_14"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="cpfTrabSubst" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
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
                 *         &lt;element name="aprend" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}T_aprend" minOccurs="0"/>
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
                    "dtAdm",
                    "tpAdmissao",
                    "indAdmissao",
                    "nrProcTrab",
                    "tpRegJor",
                    "natAtividade",
                    "dtBase",
                    "cnpjSindCategProf",
                    "fgts",
                    "trabTemporario",
                    "aprend"
                })
                public static class InfoCeletista {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtAdm;
                    protected byte tpAdmissao;
                    protected byte indAdmissao;
                    protected String nrProcTrab;
                    protected byte tpRegJor;
                    protected byte natAtividade;
                    protected Byte dtBase;
                    @XmlElement(required = true)
                    protected String cnpjSindCategProf;
                    @XmlElement(name = "FGTS")
                    protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.FGTS fgts;
                    protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario trabTemporario;
                    protected TAprend aprend;

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
                     * Obtém o valor da propriedade tpAdmissao.
                     * 
                     */
                    public byte getTpAdmissao() {
                        return tpAdmissao;
                    }

                    /**
                     * Define o valor da propriedade tpAdmissao.
                     * 
                     */
                    public void setTpAdmissao(byte value) {
                        this.tpAdmissao = value;
                    }

                    /**
                     * Obtém o valor da propriedade indAdmissao.
                     * 
                     */
                    public byte getIndAdmissao() {
                        return indAdmissao;
                    }

                    /**
                     * Define o valor da propriedade indAdmissao.
                     * 
                     */
                    public void setIndAdmissao(byte value) {
                        this.indAdmissao = value;
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
                     * Obtém o valor da propriedade fgts.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.FGTS }
                     *     
                     */
                    public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.FGTS getFGTS() {
                        return fgts;
                    }

                    /**
                     * Define o valor da propriedade fgts.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.FGTS }
                     *     
                     */
                    public void setFGTS(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.FGTS value) {
                        this.fgts = value;
                    }

                    /**
                     * Obtém o valor da propriedade trabTemporario.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario }
                     *     
                     */
                    public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario getTrabTemporario() {
                        return trabTemporario;
                    }

                    /**
                     * Define o valor da propriedade trabTemporario.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario }
                     *     
                     */
                    public void setTrabTemporario(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario value) {
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
                     *         &lt;element name="dtOpcFGTS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_dtOpcFGTS"/>
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
                     *         &lt;element name="hipLeg">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *               &lt;enumeration value="1"/>
                     *               &lt;enumeration value="2"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="justContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_texto_999"/>
                     *         &lt;element name="ideEstabVinc">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpInsc_1_2"/>
                     *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrInsc_11_14"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="ideTrabSubstituido" maxOccurs="9" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="cpfTrabSubst" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
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
                        "hipLeg",
                        "justContr",
                        "ideEstabVinc",
                        "ideTrabSubstituido"
                    })
                    public static class TrabTemporario {

                        protected byte hipLeg;
                        @XmlElement(required = true)
                        protected String justContr;
                        @XmlElement(required = true)
                        protected ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeEstabVinc ideEstabVinc;
                        protected List<ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido> ideTrabSubstituido;

                        /**
                         * Obtém o valor da propriedade hipLeg.
                         * 
                         */
                        public byte getHipLeg() {
                            return hipLeg;
                        }

                        /**
                         * Define o valor da propriedade hipLeg.
                         * 
                         */
                        public void setHipLeg(byte value) {
                            this.hipLeg = value;
                        }

                        /**
                         * Obtém o valor da propriedade justContr.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getJustContr() {
                            return justContr;
                        }

                        /**
                         * Define o valor da propriedade justContr.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setJustContr(String value) {
                            this.justContr = value;
                        }

                        /**
                         * Obtém o valor da propriedade ideEstabVinc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeEstabVinc }
                         *     
                         */
                        public ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeEstabVinc getIdeEstabVinc() {
                            return ideEstabVinc;
                        }

                        /**
                         * Define o valor da propriedade ideEstabVinc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeEstabVinc }
                         *     
                         */
                        public void setIdeEstabVinc(ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeEstabVinc value) {
                            this.ideEstabVinc = value;
                        }

                        /**
                         * Gets the value of the ideTrabSubstituido property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the ideTrabSubstituido property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdeTrabSubstituido().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido }
                         * 
                         * 
                         */
                        public List<ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido> getIdeTrabSubstituido() {
                            if (ideTrabSubstituido == null) {
                                ideTrabSubstituido = new ArrayList<ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido>();
                            }
                            return this.ideTrabSubstituido;
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
                         *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpInsc_1_2"/>
                         *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_nrInsc_11_14"/>
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
                        public static class IdeEstabVinc {

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
                         *         &lt;element name="cpfTrabSubst" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
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
                            "cpfTrabSubst"
                        })
                        public static class IdeTrabSubstituido {

                            @XmlElement(required = true)
                            protected String cpfTrabSubst;

                            /**
                             * Obtém o valor da propriedade cpfTrabSubst.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCpfTrabSubst() {
                                return cpfTrabSubst;
                            }

                            /**
                             * Define o valor da propriedade cpfTrabSubst.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCpfTrabSubst(String value) {
                                this.cpfTrabSubst = value;
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
                 *         &lt;element name="tpProv">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *               &lt;enumeration value="5"/>
                 *               &lt;enumeration value="6"/>
                 *               &lt;enumeration value="7"/>
                 *               &lt;enumeration value="8"/>
                 *               &lt;enumeration value="9"/>
                 *               &lt;enumeration value="10"/>
                 *               &lt;enumeration value="99"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_tpPlanRP" minOccurs="0"/>
                 *         &lt;element name="indTetoRGPS" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *         &lt;element name="indAbonoPerm" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *         &lt;element name="dtIniAbono" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                    "tpProv",
                    "dtExercicio",
                    "tpPlanRP",
                    "indTetoRGPS",
                    "indAbonoPerm",
                    "dtIniAbono"
                })
                public static class InfoEstatutario {

                    protected byte tpProv;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtExercicio;
                    protected Byte tpPlanRP;
                    @XmlSchemaType(name = "string")
                    protected TSSimNao indTetoRGPS;
                    @XmlSchemaType(name = "string")
                    protected TSSimNao indAbonoPerm;
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtIniAbono;

                    /**
                     * Obtém o valor da propriedade tpProv.
                     * 
                     */
                    public byte getTpProv() {
                        return tpProv;
                    }

                    /**
                     * Define o valor da propriedade tpProv.
                     * 
                     */
                    public void setTpProv(byte value) {
                        this.tpProv = value;
                    }

                    /**
                     * Obtém o valor da propriedade dtExercicio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtExercicio() {
                        return dtExercicio;
                    }

                    /**
                     * Define o valor da propriedade dtExercicio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtExercicio(XMLGregorianCalendar value) {
                        this.dtExercicio = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpPlanRP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getTpPlanRP() {
                        return tpPlanRP;
                    }

                    /**
                     * Define o valor da propriedade tpPlanRP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setTpPlanRP(Byte value) {
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

                    /**
                     * Obtém o valor da propriedade dtIniAbono.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtIniAbono() {
                        return dtIniAbono;
                    }

                    /**
                     * Define o valor da propriedade dtIniAbono.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtIniAbono(XMLGregorianCalendar value) {
                        this.dtIniAbono = value;
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
             *         &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
             *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial"/>
             *         &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                @XmlElement(required = true)
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
             *         &lt;element name="tpInsc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="5"/>
             *               &lt;enumeration value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrInsc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{8,14}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *         &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                "dtTransf",
                "observacao"
            })
            public static class SucessaoVinc {

                protected byte tpInsc;
                @XmlElement(required = true)
                protected String nrInsc;
                protected String matricAnt;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTransf;
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
                 * Obtém o valor da propriedade dtTransf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTransf() {
                    return dtTransf;
                }

                /**
                 * Define o valor da propriedade dtTransf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTransf(XMLGregorianCalendar value) {
                    this.dtTransf = value;
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
             *         &lt;element name="cpfSubstituido" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_cpf"/>
             *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
             *         &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "cpfSubstituido",
                "matricAnt",
                "dtTransf"
            })
            public static class TransfDom {

                @XmlElement(required = true)
                protected String cpfSubstituido;
                protected String matricAnt;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTransf;

                /**
                 * Obtém o valor da propriedade cpfSubstituido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCpfSubstituido() {
                    return cpfSubstituido;
                }

                /**
                 * Define o valor da propriedade cpfSubstituido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCpfSubstituido(String value) {
                    this.cpfSubstituido = value;
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
                 * Obtém o valor da propriedade dtTransf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTransf() {
                    return dtTransf;
                }

                /**
                 * Define o valor da propriedade dtTransf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTransf(XMLGregorianCalendar value) {
                    this.dtTransf = value;
                }

            }

        }

    }

}
