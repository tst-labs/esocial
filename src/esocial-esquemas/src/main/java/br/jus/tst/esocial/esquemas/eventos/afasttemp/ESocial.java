//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:51 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.afasttemp;

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
 *         &lt;element name="evtAfastTemp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}T_ideEvento_trab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideVinculo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cpfTrab"/>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoAfastamento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="iniAfastamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codMotAfast"/>
 *                                       &lt;element name="infoMesmoMtv" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                       &lt;element name="tpAcidTransito" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                                       &lt;element name="perAquis" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="dtFim" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoCessao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
 *                                                 &lt;element name="infOnus">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infoMandSind" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cnpjSind" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
 *                                                 &lt;element name="infOnusRemun">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                       &lt;enumeration value="1"/>
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="3"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
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
 *                                                 &lt;element name="cnpjMandElet" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
 *                                                 &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
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
 *                             &lt;element name="infoRetif" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="origRetif">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="tpProc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrProc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;pattern value="\d{10}|\d{17}|\d{20}|\d{21}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fimAfastamento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtTermAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_Id" />
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
    "evtAfastTemp",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAfastTemp evtAfastTemp;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAfastTemp.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAfastTemp }
     *     
     */
    public ESocial.EvtAfastTemp getEvtAfastTemp() {
        return evtAfastTemp;
    }

    /**
     * Define o valor da propriedade evtAfastTemp.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAfastTemp }
     *     
     */
    public void setEvtAfastTemp(ESocial.EvtAfastTemp value) {
        this.evtAfastTemp = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}T_ideEvento_trab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideVinculo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cpfTrab"/>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoAfastamento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="iniAfastamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codMotAfast"/>
     *                             &lt;element name="infoMesmoMtv" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                             &lt;element name="tpAcidTransito" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_observacao" minOccurs="0"/>
     *                             &lt;element name="perAquis" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="dtFim" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infoCessao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
     *                                       &lt;element name="infOnus">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
     *                             &lt;element name="infoMandSind" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjSind" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
     *                                       &lt;element name="infOnusRemun">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
     *                             &lt;element name="infoMandElet" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cnpjMandElet" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
     *                                       &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
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
     *                   &lt;element name="infoRetif" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="origRetif">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="tpProc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrProc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;pattern value="\d{10}|\d{17}|\d{20}|\d{21}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fimAfastamento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtTermAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_Id" />
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
        "infoAfastamento"
    })
    public static class EvtAfastTemp {

        @XmlElement(required = true)
        protected TIdeEventoTrab ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAfastTemp.IdeVinculo ideVinculo;
        @XmlElement(required = true)
        protected ESocial.EvtAfastTemp.InfoAfastamento infoAfastamento;
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
         *     {@link ESocial.EvtAfastTemp.IdeVinculo }
         *     
         */
        public ESocial.EvtAfastTemp.IdeVinculo getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Define o valor da propriedade ideVinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAfastTemp.IdeVinculo }
         *     
         */
        public void setIdeVinculo(ESocial.EvtAfastTemp.IdeVinculo value) {
            this.ideVinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoAfastamento.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAfastTemp.InfoAfastamento }
         *     
         */
        public ESocial.EvtAfastTemp.InfoAfastamento getInfoAfastamento() {
            return infoAfastamento;
        }

        /**
         * Define o valor da propriedade infoAfastamento.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAfastTemp.InfoAfastamento }
         *     
         */
        public void setInfoAfastamento(ESocial.EvtAfastTemp.InfoAfastamento value) {
            this.infoAfastamento = value;
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
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cpfTrab"/>
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codCateg" minOccurs="0"/>
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
            "matricula",
            "codCateg"
        })
        public static class IdeVinculo {

            @XmlElement(required = true)
            protected String cpfTrab;
            protected String matricula;
            protected BigInteger codCateg;

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
         *         &lt;element name="iniAfastamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codMotAfast"/>
         *                   &lt;element name="infoMesmoMtv" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                   &lt;element name="tpAcidTransito" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_observacao" minOccurs="0"/>
         *                   &lt;element name="perAquis" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="dtFim" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infoCessao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
         *                             &lt;element name="infOnus">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
         *                   &lt;element name="infoMandSind" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjSind" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
         *                             &lt;element name="infOnusRemun">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
         *                   &lt;element name="infoMandElet" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cnpjMandElet" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
         *                             &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
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
         *         &lt;element name="infoRetif" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="origRetif">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="tpProc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrProc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="\d{10}|\d{17}|\d{20}|\d{21}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fimAfastamento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtTermAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "iniAfastamento",
            "infoRetif",
            "fimAfastamento"
        })
        public static class InfoAfastamento {

            protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento iniAfastamento;
            protected ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif infoRetif;
            protected ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento fimAfastamento;

            /**
             * Obtém o valor da propriedade iniAfastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento }
             *     
             */
            public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento getIniAfastamento() {
                return iniAfastamento;
            }

            /**
             * Define o valor da propriedade iniAfastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento }
             *     
             */
            public void setIniAfastamento(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento value) {
                this.iniAfastamento = value;
            }

            /**
             * Obtém o valor da propriedade infoRetif.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif }
             *     
             */
            public ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif getInfoRetif() {
                return infoRetif;
            }

            /**
             * Define o valor da propriedade infoRetif.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif }
             *     
             */
            public void setInfoRetif(ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif value) {
                this.infoRetif = value;
            }

            /**
             * Obtém o valor da propriedade fimAfastamento.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento }
             *     
             */
            public ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento getFimAfastamento() {
                return fimAfastamento;
            }

            /**
             * Define o valor da propriedade fimAfastamento.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento }
             *     
             */
            public void setFimAfastamento(ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento value) {
                this.fimAfastamento = value;
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
             *         &lt;element name="dtTermAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "dtTermAfast"
            })
            public static class FimAfastamento {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTermAfast;

                /**
                 * Obtém o valor da propriedade dtTermAfast.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTermAfast() {
                    return dtTermAfast;
                }

                /**
                 * Define o valor da propriedade dtTermAfast.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTermAfast(XMLGregorianCalendar value) {
                    this.dtTermAfast = value;
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
             *         &lt;element name="origRetif">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="tpProc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrProc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="\d{10}|\d{17}|\d{20}|\d{21}"/>
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
                "origRetif",
                "tpProc",
                "nrProc"
            })
            public static class InfoRetif {

                protected byte origRetif;
                protected Byte tpProc;
                protected String nrProc;

                /**
                 * Obtém o valor da propriedade origRetif.
                 * 
                 */
                public byte getOrigRetif() {
                    return origRetif;
                }

                /**
                 * Define o valor da propriedade origRetif.
                 * 
                 */
                public void setOrigRetif(byte value) {
                    this.origRetif = value;
                }

                /**
                 * Obtém o valor da propriedade tpProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTpProc() {
                    return tpProc;
                }

                /**
                 * Define o valor da propriedade tpProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTpProc(Byte value) {
                    this.tpProc = value;
                }

                /**
                 * Obtém o valor da propriedade nrProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrProc() {
                    return nrProc;
                }

                /**
                 * Define o valor da propriedade nrProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrProc(String value) {
                    this.nrProc = value;
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
             *         &lt;element name="dtIniAfast" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="codMotAfast" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_codMotAfast"/>
             *         &lt;element name="infoMesmoMtv" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *         &lt;element name="tpAcidTransito" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_observacao" minOccurs="0"/>
             *         &lt;element name="perAquis" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="dtFim" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infoCessao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
             *                   &lt;element name="infOnus">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
             *         &lt;element name="infoMandSind" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjSind" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
             *                   &lt;element name="infOnusRemun">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
             *         &lt;element name="infoMandElet" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cnpjMandElet" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
             *                   &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
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
                "dtIniAfast",
                "codMotAfast",
                "infoMesmoMtv",
                "tpAcidTransito",
                "observacao",
                "perAquis",
                "infoCessao",
                "infoMandSind",
                "infoMandElet"
            })
            public static class IniAfastamento {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtIniAfast;
                @XmlElement(required = true)
                protected String codMotAfast;
                @XmlSchemaType(name = "string")
                protected TSSimNao infoMesmoMtv;
                protected Byte tpAcidTransito;
                protected String observacao;
                protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.PerAquis perAquis;
                protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao infoCessao;
                protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind infoMandSind;
                protected ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandElet infoMandElet;

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

                /**
                 * Obtém o valor da propriedade infoMesmoMtv.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getInfoMesmoMtv() {
                    return infoMesmoMtv;
                }

                /**
                 * Define o valor da propriedade infoMesmoMtv.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setInfoMesmoMtv(TSSimNao value) {
                    this.infoMesmoMtv = value;
                }

                /**
                 * Obtém o valor da propriedade tpAcidTransito.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTpAcidTransito() {
                    return tpAcidTransito;
                }

                /**
                 * Define o valor da propriedade tpAcidTransito.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTpAcidTransito(Byte value) {
                    this.tpAcidTransito = value;
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
                 * Obtém o valor da propriedade perAquis.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.PerAquis }
                 *     
                 */
                public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.PerAquis getPerAquis() {
                    return perAquis;
                }

                /**
                 * Define o valor da propriedade perAquis.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.PerAquis }
                 *     
                 */
                public void setPerAquis(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.PerAquis value) {
                    this.perAquis = value;
                }

                /**
                 * Obtém o valor da propriedade infoCessao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao }
                 *     
                 */
                public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao getInfoCessao() {
                    return infoCessao;
                }

                /**
                 * Define o valor da propriedade infoCessao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao }
                 *     
                 */
                public void setInfoCessao(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao value) {
                    this.infoCessao = value;
                }

                /**
                 * Obtém o valor da propriedade infoMandSind.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind }
                 *     
                 */
                public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind getInfoMandSind() {
                    return infoMandSind;
                }

                /**
                 * Define o valor da propriedade infoMandSind.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind }
                 *     
                 */
                public void setInfoMandSind(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind value) {
                    this.infoMandSind = value;
                }

                /**
                 * Obtém o valor da propriedade infoMandElet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandElet }
                 *     
                 */
                public ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandElet getInfoMandElet() {
                    return infoMandElet;
                }

                /**
                 * Define o valor da propriedade infoMandElet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandElet }
                 *     
                 */
                public void setInfoMandElet(ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandElet value) {
                    this.infoMandElet = value;
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
                 *         &lt;element name="cnpjCess" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
                 *         &lt;element name="infOnus">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
                    "cnpjCess",
                    "infOnus"
                })
                public static class InfoCessao {

                    @XmlElement(required = true)
                    protected String cnpjCess;
                    protected byte infOnus;

                    /**
                     * Obtém o valor da propriedade cnpjCess.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjCess() {
                        return cnpjCess;
                    }

                    /**
                     * Define o valor da propriedade cnpjCess.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjCess(String value) {
                        this.cnpjCess = value;
                    }

                    /**
                     * Obtém o valor da propriedade infOnus.
                     * 
                     */
                    public byte getInfOnus() {
                        return infOnus;
                    }

                    /**
                     * Define o valor da propriedade infOnus.
                     * 
                     */
                    public void setInfOnus(byte value) {
                        this.infOnus = value;
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
                 *         &lt;element name="cnpjMandElet" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
                 *         &lt;element name="indRemunCargo" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
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
                    "cnpjMandElet",
                    "indRemunCargo"
                })
                public static class InfoMandElet {

                    @XmlElement(required = true)
                    protected String cnpjMandElet;
                    @XmlSchemaType(name = "string")
                    protected TSSimNao indRemunCargo;

                    /**
                     * Obtém o valor da propriedade cnpjMandElet.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjMandElet() {
                        return cnpjMandElet;
                    }

                    /**
                     * Define o valor da propriedade cnpjMandElet.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjMandElet(String value) {
                        this.cnpjMandElet = value;
                    }

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
                 *         &lt;element name="cnpjSind" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_cnpj"/>
                 *         &lt;element name="infOnusRemun">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
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
                    "cnpjSind",
                    "infOnusRemun"
                })
                public static class InfoMandSind {

                    @XmlElement(required = true)
                    protected String cnpjSind;
                    protected byte infOnusRemun;

                    /**
                     * Obtém o valor da propriedade cnpjSind.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnpjSind() {
                        return cnpjSind;
                    }

                    /**
                     * Define o valor da propriedade cnpjSind.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnpjSind(String value) {
                        this.cnpjSind = value;
                    }

                    /**
                     * Obtém o valor da propriedade infOnusRemun.
                     * 
                     */
                    public byte getInfOnusRemun() {
                        return infOnusRemun;
                    }

                    /**
                     * Define o valor da propriedade infOnusRemun.
                     * 
                     */
                    public void setInfOnusRemun(byte value) {
                        this.infOnusRemun = value;
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
                 *         &lt;element name="dtInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *         &lt;element name="dtFim" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                    "dtInicio",
                    "dtFim"
                })
                public static class PerAquis {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtInicio;
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dtFim;

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
                     * Obtém o valor da propriedade dtFim.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDtFim() {
                        return dtFim;
                    }

                    /**
                     * Define o valor da propriedade dtFim.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDtFim(XMLGregorianCalendar value) {
                        this.dtFim = value;
                    }

                }

            }

        }

    }

}
