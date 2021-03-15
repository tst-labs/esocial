//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:52 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

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
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfTrab"/>
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
 *                             &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtAlteracao"/>
 *                             &lt;element name="dadosTrabalhador">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmTrab"/>
 *                                       &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexoTrab"/>
 *                                       &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_racaCorTrab"/>
 *                                       &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
 *                                       &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_grauInstr"/>
 *                                       &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
 *                                       &lt;element name="paisNac" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_paisNac"/>
 *                                       &lt;element name="endereco">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_brasil"/>
 *                                                   &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_exterior"/>
 *                                                 &lt;/choice>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="trabImig" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
 *                                                 &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_condIng"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoDeficiencia" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defFisica"/>
 *                                                 &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defVisual"/>
 *                                                 &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defAuditiva"/>
 *                                                 &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defMental"/>
 *                                                 &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defIntelectual"/>
 *                                                 &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_reabReadap"/>
 *                                                 &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                                 &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="dependente" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tpDep"/>
 *                                                 &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmDep"/>
 *                                                 &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtNascto"/>
 *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
 *                                                 &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexo" minOccurs="0"/>
 *                                                 &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depIRRF"/>
 *                                                 &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depSF"/>
 *                                                 &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_incTrab"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_contato" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_Id" />
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfTrab"/>
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
     *                   &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtAlteracao"/>
     *                   &lt;element name="dadosTrabalhador">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmTrab"/>
     *                             &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexoTrab"/>
     *                             &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_racaCorTrab"/>
     *                             &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
     *                             &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_grauInstr"/>
     *                             &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
     *                             &lt;element name="paisNac" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_paisNac"/>
     *                             &lt;element name="endereco">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_brasil"/>
     *                                         &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_exterior"/>
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
     *                                       &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
     *                                       &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_condIng"/>
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
     *                                       &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defFisica"/>
     *                                       &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defVisual"/>
     *                                       &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defAuditiva"/>
     *                                       &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defMental"/>
     *                                       &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defIntelectual"/>
     *                                       &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_reabReadap"/>
     *                                       &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
     *                                       &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tpDep"/>
     *                                       &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmDep"/>
     *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtNascto"/>
     *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
     *                                       &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexo" minOccurs="0"/>
     *                                       &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depIRRF"/>
     *                                       &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depSF"/>
     *                                       &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_incTrab"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_contato" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_Id" />
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
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAltCadastral.IdeTrabalhador ideTrabalhador;
        @XmlElement(required = true)
        protected ESocial.EvtAltCadastral.Alteracao alteracao;
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
         *         &lt;element name="dtAlteracao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtAlteracao"/>
         *         &lt;element name="dadosTrabalhador">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmTrab"/>
         *                   &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexoTrab"/>
         *                   &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_racaCorTrab"/>
         *                   &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
         *                   &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_grauInstr"/>
         *                   &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
         *                   &lt;element name="paisNac" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_paisNac"/>
         *                   &lt;element name="endereco">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_brasil"/>
         *                               &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_exterior"/>
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
         *                             &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
         *                             &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_condIng"/>
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
         *                             &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defFisica"/>
         *                             &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defVisual"/>
         *                             &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defAuditiva"/>
         *                             &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defMental"/>
         *                             &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defIntelectual"/>
         *                             &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_reabReadap"/>
         *                             &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
         *                             &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tpDep"/>
         *                             &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmDep"/>
         *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtNascto"/>
         *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
         *                             &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexo" minOccurs="0"/>
         *                             &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depIRRF"/>
         *                             &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depSF"/>
         *                             &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_incTrab"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_contato" minOccurs="0"/>
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
            @XmlSchemaType(name = "date")
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
             *         &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmTrab"/>
             *         &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexoTrab"/>
             *         &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_racaCorTrab"/>
             *         &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_estCivilTrab" minOccurs="0"/>
             *         &lt;element name="grauInstr" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_grauInstr"/>
             *         &lt;element name="nmSoc" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmSoc" minOccurs="0"/>
             *         &lt;element name="paisNac" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_paisNac"/>
             *         &lt;element name="endereco">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_brasil"/>
             *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_exterior"/>
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
             *                   &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
             *                   &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_condIng"/>
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
             *                   &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defFisica"/>
             *                   &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defVisual"/>
             *                   &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defAuditiva"/>
             *                   &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defMental"/>
             *                   &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defIntelectual"/>
             *                   &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_reabReadap"/>
             *                   &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
             *                   &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tpDep"/>
             *                   &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmDep"/>
             *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtNascto"/>
             *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
             *                   &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexo" minOccurs="0"/>
             *                   &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depIRRF"/>
             *                   &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depSF"/>
             *                   &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_incTrab"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="contato" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_contato" minOccurs="0"/>
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
                "sexo",
                "racaCor",
                "estCiv",
                "grauInstr",
                "nmSoc",
                "paisNac",
                "endereco",
                "trabImig",
                "infoDeficiencia",
                "dependente",
                "contato"
            })
            public static class DadosTrabalhador {

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
                protected String paisNac;
                @XmlElement(required = true)
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco endereco;
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.TrabImig trabImig;
                protected ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia infoDeficiencia;
                protected List<ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente> dependente;
                protected TContato contato;

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
                 * Obtém o valor da propriedade trabImig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.TrabImig }
                 *     
                 */
                public ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.TrabImig getTrabImig() {
                    return trabImig;
                }

                /**
                 * Define o valor da propriedade trabImig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.TrabImig }
                 *     
                 */
                public void setTrabImig(ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.TrabImig value) {
                    this.trabImig = value;
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
                 * {@link ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente }
                 * 
                 * 
                 */
                public List<ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente> getDependente() {
                    if (dependente == null) {
                        dependente = new ArrayList<ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente>();
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
                 *         &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tpDep"/>
                 *         &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nmDep"/>
                 *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_dtNascto"/>
                 *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfDep" minOccurs="0"/>
                 *         &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sexo" minOccurs="0"/>
                 *         &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depIRRF"/>
                 *         &lt;element name="depSF" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_depSF"/>
                 *         &lt;element name="incTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_incTrab"/>
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
                 *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_brasil"/>
                 *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}T_endereco_exterior"/>
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
                 *         &lt;element name="defFisica" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defFisica"/>
                 *         &lt;element name="defVisual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defVisual"/>
                 *         &lt;element name="defAuditiva" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defAuditiva"/>
                 *         &lt;element name="defMental" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defMental"/>
                 *         &lt;element name="defIntelectual" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_defIntelectual"/>
                 *         &lt;element name="reabReadap" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_reabReadap"/>
                 *         &lt;element name="infoCota" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
                 *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                 *         &lt;element name="tmpResid" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tmpResid" minOccurs="0"/>
                 *         &lt;element name="condIng" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_condIng"/>
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_cpfTrab"/>
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
