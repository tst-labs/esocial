//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:24 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.rmnrpps;

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
 *         &lt;element name="evtRmnRPPS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_ideEvento_folha_opp"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cpfRemun"/>
 *                             &lt;element name="infoComplem" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_nmTrab"/>
 *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_dtNascto"/>
 *                                       &lt;element name="sucessaoVinc" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
 *                                                 &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
 *                                                 &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
 *                   &lt;element name="dmDev" maxOccurs="999">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_codigo_esocial"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_codCateg"/>
 *                             &lt;element name="infoPerApur" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ideEstab" maxOccurs="500">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
 *                                                 &lt;element name="remunPerApur" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
 *                                       &lt;element name="remunOrgSuc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_sim_nao"/>
 *                                       &lt;element name="idePeriodo" maxOccurs="180">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_periodo_mensal"/>
 *                                                 &lt;element name="ideEstab" maxOccurs="500">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
 *                                                           &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
 *                                                           &lt;element name="remunPerAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_Id" />
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
    "evtRmnRPPS",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtRmnRPPS evtRmnRPPS;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtRmnRPPS.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtRmnRPPS }
     *     
     */
    public ESocial.EvtRmnRPPS getEvtRmnRPPS() {
        return evtRmnRPPS;
    }

    /**
     * Define o valor da propriedade evtRmnRPPS.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtRmnRPPS }
     *     
     */
    public void setEvtRmnRPPS(ESocial.EvtRmnRPPS value) {
        this.evtRmnRPPS = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_ideEvento_folha_opp"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cpfRemun"/>
     *                   &lt;element name="infoComplem" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_nmTrab"/>
     *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_dtNascto"/>
     *                             &lt;element name="sucessaoVinc" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
     *                                       &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
     *                                       &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
     *         &lt;element name="dmDev" maxOccurs="999">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_codigo_esocial"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_codCateg"/>
     *                   &lt;element name="infoPerApur" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ideEstab" maxOccurs="500">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
     *                                       &lt;element name="remunPerApur" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
     *                             &lt;element name="remunOrgSuc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_sim_nao"/>
     *                             &lt;element name="idePeriodo" maxOccurs="180">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_periodo_mensal"/>
     *                                       &lt;element name="ideEstab" maxOccurs="500">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
     *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
     *                                                 &lt;element name="remunPerAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_Id" />
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
    public static class EvtRmnRPPS {

        @XmlElement(required = true)
        protected TIdeEventoFolhaOpp ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtRmnRPPS.IdeTrabalhador ideTrabalhador;
        @XmlElement(required = true)
        protected List<ESocial.EvtRmnRPPS.DmDev> dmDev;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaOpp }
         *     
         */
        public TIdeEventoFolhaOpp getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaOpp }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaOpp value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public TIdeEmpregadorCnpj getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregadorCnpj value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideTrabalhador.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtRmnRPPS.IdeTrabalhador }
         *     
         */
        public ESocial.EvtRmnRPPS.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtRmnRPPS.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtRmnRPPS.IdeTrabalhador value) {
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
         * {@link ESocial.EvtRmnRPPS.DmDev }
         * 
         * 
         */
        public List<ESocial.EvtRmnRPPS.DmDev> getDmDev() {
            if (dmDev == null) {
                dmDev = new ArrayList<ESocial.EvtRmnRPPS.DmDev>();
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
         *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_codigo_esocial"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_codCateg"/>
         *         &lt;element name="infoPerApur" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ideEstab" maxOccurs="500">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
         *                             &lt;element name="remunPerApur" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
         *                   &lt;element name="remunOrgSuc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_sim_nao"/>
         *                   &lt;element name="idePeriodo" maxOccurs="180">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_periodo_mensal"/>
         *                             &lt;element name="ideEstab" maxOccurs="500">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
         *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
         *                                       &lt;element name="remunPerAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
            "codCateg",
            "infoPerApur",
            "infoPerAnt"
        })
        public static class DmDev {

            @XmlElement(required = true)
            protected String ideDmDev;
            @XmlElement(required = true)
            protected BigInteger codCateg;
            protected ESocial.EvtRmnRPPS.DmDev.InfoPerApur infoPerApur;
            protected ESocial.EvtRmnRPPS.DmDev.InfoPerAnt infoPerAnt;

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
             *     {@link ESocial.EvtRmnRPPS.DmDev.InfoPerApur }
             *     
             */
            public ESocial.EvtRmnRPPS.DmDev.InfoPerApur getInfoPerApur() {
                return infoPerApur;
            }

            /**
             * Define o valor da propriedade infoPerApur.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRmnRPPS.DmDev.InfoPerApur }
             *     
             */
            public void setInfoPerApur(ESocial.EvtRmnRPPS.DmDev.InfoPerApur value) {
                this.infoPerApur = value;
            }

            /**
             * Obtém o valor da propriedade infoPerAnt.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRmnRPPS.DmDev.InfoPerAnt }
             *     
             */
            public ESocial.EvtRmnRPPS.DmDev.InfoPerAnt getInfoPerAnt() {
                return infoPerAnt;
            }

            /**
             * Define o valor da propriedade infoPerAnt.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRmnRPPS.DmDev.InfoPerAnt }
             *     
             */
            public void setInfoPerAnt(ESocial.EvtRmnRPPS.DmDev.InfoPerAnt value) {
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
             *         &lt;element name="remunOrgSuc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_sim_nao"/>
             *         &lt;element name="idePeriodo" maxOccurs="180">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_periodo_mensal"/>
             *                   &lt;element name="ideEstab" maxOccurs="500">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
             *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
             *                             &lt;element name="remunPerAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
                "remunOrgSuc",
                "idePeriodo"
            })
            public static class InfoPerAnt {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao remunOrgSuc;
                @XmlElement(required = true)
                protected List<ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo> idePeriodo;

                /**
                 * Obtém o valor da propriedade remunOrgSuc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getRemunOrgSuc() {
                    return remunOrgSuc;
                }

                /**
                 * Define o valor da propriedade remunOrgSuc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setRemunOrgSuc(TSSimNao value) {
                    this.remunOrgSuc = value;
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
                 * {@link ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo }
                 * 
                 * 
                 */
                public List<ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo> getIdePeriodo() {
                    if (idePeriodo == null) {
                        idePeriodo = new ArrayList<ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo>();
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
                 *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_periodo_mensal"/>
                 *         &lt;element name="ideEstab" maxOccurs="500">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
                 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
                 *                   &lt;element name="remunPerAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
                    "ideEstab"
                })
                public static class IdePeriodo {

                    @XmlElement(required = true)
                    protected String perRef;
                    @XmlElement(required = true)
                    protected List<ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo.IdeEstab> ideEstab;

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
                     * {@link ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo.IdeEstab }
                     * 
                     * 
                     */
                    public List<ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo.IdeEstab> getIdeEstab() {
                        if (ideEstab == null) {
                            ideEstab = new ArrayList<ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo.IdeEstab>();
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
                     *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
                     *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
                     *         &lt;element name="remunPerAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
                        "remunPerAnt"
                    })
                    public static class IdeEstab {

                        protected byte tpInsc;
                        @XmlElement(required = true)
                        protected String nrInsc;
                        @XmlElement(required = true)
                        protected List<TRemunPer> remunPerAnt;

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
                         * {@link TRemunPer }
                         * 
                         * 
                         */
                        public List<TRemunPer> getRemunPerAnt() {
                            if (remunPerAnt == null) {
                                remunPerAnt = new ArrayList<TRemunPer>();
                            }
                            return this.remunPerAnt;
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
             *         &lt;element name="ideEstab" maxOccurs="500">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
             *                   &lt;element name="remunPerApur" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
                "ideEstab"
            })
            public static class InfoPerApur {

                @XmlElement(required = true)
                protected List<ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab> ideEstab;

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
                 * {@link ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab }
                 * 
                 * 
                 */
                public List<ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab> getIdeEstab() {
                    if (ideEstab == null) {
                        ideEstab = new ArrayList<ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab>();
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
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_tpInsc_1"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
                 *         &lt;element name="remunPerApur" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}T_remunPer" maxOccurs="8"/>
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
                    "remunPerApur"
                })
                public static class IdeEstab {

                    protected byte tpInsc;
                    @XmlElement(required = true)
                    protected String nrInsc;
                    @XmlElement(required = true)
                    protected List<TRemunPer> remunPerApur;

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
                     * {@link TRemunPer }
                     * 
                     * 
                     */
                    public List<TRemunPer> getRemunPerApur() {
                        if (remunPerApur == null) {
                            remunPerApur = new ArrayList<TRemunPer>();
                        }
                        return this.remunPerApur;
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cpfRemun"/>
         *         &lt;element name="infoComplem" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_nmTrab"/>
         *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_dtNascto"/>
         *                   &lt;element name="sucessaoVinc" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
         *                             &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
         *                             &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
            "cpfTrab",
            "infoComplem"
        })
        public static class IdeTrabalhador {

            @XmlElement(required = true)
            protected String cpfTrab;
            protected ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem infoComplem;

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
             * Obtém o valor da propriedade infoComplem.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem }
             *     
             */
            public ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem getInfoComplem() {
                return infoComplem;
            }

            /**
             * Define o valor da propriedade infoComplem.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem }
             *     
             */
            public void setInfoComplem(ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem value) {
                this.infoComplem = value;
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
             *         &lt;element name="nmTrab" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_nmTrab"/>
             *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_dtNascto"/>
             *         &lt;element name="sucessaoVinc" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
             *                   &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
             *                   &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                protected ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem.SucessaoVinc sucessaoVinc;

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
                 *     {@link ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem.SucessaoVinc }
                 *     
                 */
                public ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem.SucessaoVinc getSucessaoVinc() {
                    return sucessaoVinc;
                }

                /**
                 * Define o valor da propriedade sucessaoVinc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem.SucessaoVinc }
                 *     
                 */
                public void setSucessaoVinc(ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem.SucessaoVinc value) {
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
                 *         &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_cnpj"/>
                 *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_matricAnt" minOccurs="0"/>
                 *         &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                    "cnpjOrgaoAnt",
                    "matricAnt",
                    "dtExercicio",
                    "observacao"
                })
                public static class SucessaoVinc {

                    @XmlElement(required = true)
                    protected String cnpjOrgaoAnt;
                    protected String matricAnt;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtExercicio;
                    protected String observacao;

                    /**
                     * Obtém o valor da propriedade cnpjOrgaoAnt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjOrgaoAnt() {
                        return cnpjOrgaoAnt;
                    }

                    /**
                     * Define o valor da propriedade cnpjOrgaoAnt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjOrgaoAnt(String value) {
                        this.cnpjOrgaoAnt = value;
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

        }

    }

}
