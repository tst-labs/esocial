//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:03 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenin;

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
 *         &lt;element name="evtCdBenIn">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}T_ideEvento_trab_PJ"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="beneficiario">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *                             &lt;element name="cnpjOrigem" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoBenInicio">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cadIni" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_sim_nao"/>
 *                             &lt;element name="indSitBenef" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
 *                             &lt;element name="dtIniBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtPublic" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="dadosBeneficio">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpBeneficio"/>
 *                                       &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPlanRP"/>
 *                                       &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
 *                                       &lt;element name="indDecJud" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *                                       &lt;element name="infoPenMorte" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPenMorte"/>
 *                                                 &lt;element name="instPenMorte" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cpfInst" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
 *                                                           &lt;element name="dtInst" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                             &lt;element name="sucessaoBenef" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cnpj"/>
 *                                       &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
 *                                       &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
 *                                       &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
 *                                       &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
 *                                       &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="infoBenTermino" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtTermBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="mtvTermino">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d{2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_Id" />
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
    "evtCdBenIn",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtCdBenIn evtCdBenIn;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCdBenIn.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCdBenIn }
     *     
     */
    public ESocial.EvtCdBenIn getEvtCdBenIn() {
        return evtCdBenIn;
    }

    /**
     * Define o valor da propriedade evtCdBenIn.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCdBenIn }
     *     
     */
    public void setEvtCdBenIn(ESocial.EvtCdBenIn value) {
        this.evtCdBenIn = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}T_ideEvento_trab_PJ"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="beneficiario">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
     *                   &lt;element name="cnpjOrigem" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoBenInicio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cadIni" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_sim_nao"/>
     *                   &lt;element name="indSitBenef" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
     *                   &lt;element name="dtIniBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtPublic" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="dadosBeneficio">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpBeneficio"/>
     *                             &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPlanRP"/>
     *                             &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
     *                             &lt;element name="indDecJud" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
     *                             &lt;element name="infoPenMorte" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPenMorte"/>
     *                                       &lt;element name="instPenMorte" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cpfInst" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
     *                                                 &lt;element name="dtInst" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *                   &lt;element name="sucessaoBenef" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cnpj"/>
     *                             &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
     *                             &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
     *                             &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
     *                             &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
     *                             &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="infoBenTermino" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtTermBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="mtvTermino">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d{2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_Id" />
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
        "beneficiario",
        "infoBenInicio"
    })
    public static class EvtCdBenIn {

        @XmlElement(required = true)
        protected TIdeEventoTrabPJ ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtCdBenIn.Beneficiario beneficiario;
        @XmlElement(required = true)
        protected ESocial.EvtCdBenIn.InfoBenInicio infoBenInicio;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public TIdeEventoTrabPJ getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabPJ value) {
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
         * Obtém o valor da propriedade beneficiario.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenIn.Beneficiario }
         *     
         */
        public ESocial.EvtCdBenIn.Beneficiario getBeneficiario() {
            return beneficiario;
        }

        /**
         * Define o valor da propriedade beneficiario.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenIn.Beneficiario }
         *     
         */
        public void setBeneficiario(ESocial.EvtCdBenIn.Beneficiario value) {
            this.beneficiario = value;
        }

        /**
         * Obtém o valor da propriedade infoBenInicio.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenIn.InfoBenInicio }
         *     
         */
        public ESocial.EvtCdBenIn.InfoBenInicio getInfoBenInicio() {
            return infoBenInicio;
        }

        /**
         * Define o valor da propriedade infoBenInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenIn.InfoBenInicio }
         *     
         */
        public void setInfoBenInicio(ESocial.EvtCdBenIn.InfoBenInicio value) {
            this.infoBenInicio = value;
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
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
         *         &lt;element name="cnpjOrigem" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
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
            "cpfBenef",
            "matricula",
            "cnpjOrigem"
        })
        public static class Beneficiario {

            @XmlElement(required = true)
            protected String cpfBenef;
            protected String matricula;
            protected String cnpjOrigem;

            /**
             * Obtém o valor da propriedade cpfBenef.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfBenef() {
                return cpfBenef;
            }

            /**
             * Define o valor da propriedade cpfBenef.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfBenef(String value) {
                this.cpfBenef = value;
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
             * Obtém o valor da propriedade cnpjOrigem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjOrigem() {
                return cnpjOrigem;
            }

            /**
             * Define o valor da propriedade cnpjOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjOrigem(String value) {
                this.cnpjOrigem = value;
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
         *         &lt;element name="cadIni" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_sim_nao"/>
         *         &lt;element name="indSitBenef" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
         *         &lt;element name="dtIniBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtPublic" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="dadosBeneficio">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpBeneficio"/>
         *                   &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPlanRP"/>
         *                   &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
         *                   &lt;element name="indDecJud" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
         *                   &lt;element name="infoPenMorte" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPenMorte"/>
         *                             &lt;element name="instPenMorte" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cpfInst" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
         *                                       &lt;element name="dtInst" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
         *         &lt;element name="sucessaoBenef" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cnpj"/>
         *                   &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
         *                   &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
         *                   &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
         *                   &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
         *                   &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infoBenTermino" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtTermBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="mtvTermino">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d{2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
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
            "cadIni",
            "indSitBenef",
            "nrBeneficio",
            "dtIniBeneficio",
            "dtPublic",
            "dadosBeneficio",
            "sucessaoBenef",
            "mudancaCPF",
            "infoBenTermino"
        })
        public static class InfoBenInicio {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected TSSimNao cadIni;
            protected Byte indSitBenef;
            @XmlElement(required = true)
            protected String nrBeneficio;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtIniBeneficio;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtPublic;
            @XmlElement(required = true)
            protected ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio dadosBeneficio;
            protected ESocial.EvtCdBenIn.InfoBenInicio.SucessaoBenef sucessaoBenef;
            protected ESocial.EvtCdBenIn.InfoBenInicio.MudancaCPF mudancaCPF;
            protected ESocial.EvtCdBenIn.InfoBenInicio.InfoBenTermino infoBenTermino;

            /**
             * Obtém o valor da propriedade cadIni.
             * 
             * @return
             *     possible object is
             *     {@link TSSimNao }
             *     
             */
            public TSSimNao getCadIni() {
                return cadIni;
            }

            /**
             * Define o valor da propriedade cadIni.
             * 
             * @param value
             *     allowed object is
             *     {@link TSSimNao }
             *     
             */
            public void setCadIni(TSSimNao value) {
                this.cadIni = value;
            }

            /**
             * Obtém o valor da propriedade indSitBenef.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getIndSitBenef() {
                return indSitBenef;
            }

            /**
             * Define o valor da propriedade indSitBenef.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setIndSitBenef(Byte value) {
                this.indSitBenef = value;
            }

            /**
             * Obtém o valor da propriedade nrBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrBeneficio() {
                return nrBeneficio;
            }

            /**
             * Define o valor da propriedade nrBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrBeneficio(String value) {
                this.nrBeneficio = value;
            }

            /**
             * Obtém o valor da propriedade dtIniBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtIniBeneficio() {
                return dtIniBeneficio;
            }

            /**
             * Define o valor da propriedade dtIniBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtIniBeneficio(XMLGregorianCalendar value) {
                this.dtIniBeneficio = value;
            }

            /**
             * Obtém o valor da propriedade dtPublic.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtPublic() {
                return dtPublic;
            }

            /**
             * Define o valor da propriedade dtPublic.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtPublic(XMLGregorianCalendar value) {
                this.dtPublic = value;
            }

            /**
             * Obtém o valor da propriedade dadosBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio }
             *     
             */
            public ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio getDadosBeneficio() {
                return dadosBeneficio;
            }

            /**
             * Define o valor da propriedade dadosBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio }
             *     
             */
            public void setDadosBeneficio(ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio value) {
                this.dadosBeneficio = value;
            }

            /**
             * Obtém o valor da propriedade sucessaoBenef.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.SucessaoBenef }
             *     
             */
            public ESocial.EvtCdBenIn.InfoBenInicio.SucessaoBenef getSucessaoBenef() {
                return sucessaoBenef;
            }

            /**
             * Define o valor da propriedade sucessaoBenef.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.SucessaoBenef }
             *     
             */
            public void setSucessaoBenef(ESocial.EvtCdBenIn.InfoBenInicio.SucessaoBenef value) {
                this.sucessaoBenef = value;
            }

            /**
             * Obtém o valor da propriedade mudancaCPF.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.MudancaCPF }
             *     
             */
            public ESocial.EvtCdBenIn.InfoBenInicio.MudancaCPF getMudancaCPF() {
                return mudancaCPF;
            }

            /**
             * Define o valor da propriedade mudancaCPF.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.MudancaCPF }
             *     
             */
            public void setMudancaCPF(ESocial.EvtCdBenIn.InfoBenInicio.MudancaCPF value) {
                this.mudancaCPF = value;
            }

            /**
             * Obtém o valor da propriedade infoBenTermino.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.InfoBenTermino }
             *     
             */
            public ESocial.EvtCdBenIn.InfoBenInicio.InfoBenTermino getInfoBenTermino() {
                return infoBenTermino;
            }

            /**
             * Define o valor da propriedade infoBenTermino.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCdBenIn.InfoBenInicio.InfoBenTermino }
             *     
             */
            public void setInfoBenTermino(ESocial.EvtCdBenIn.InfoBenInicio.InfoBenTermino value) {
                this.infoBenTermino = value;
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
             *         &lt;element name="tpBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpBeneficio"/>
             *         &lt;element name="tpPlanRP" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPlanRP"/>
             *         &lt;element name="dsc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_texto_255" minOccurs="0"/>
             *         &lt;element name="indDecJud" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
             *         &lt;element name="infoPenMorte" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPenMorte"/>
             *                   &lt;element name="instPenMorte" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cpfInst" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
             *                             &lt;element name="dtInst" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "tpBeneficio",
                "tpPlanRP",
                "dsc",
                "indDecJud",
                "infoPenMorte"
            })
            public static class DadosBeneficio {

                @XmlElement(required = true)
                protected BigInteger tpBeneficio;
                protected byte tpPlanRP;
                protected String dsc;
                @XmlSchemaType(name = "string")
                protected TSSimNao indDecJud;
                protected ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte infoPenMorte;

                /**
                 * Obtém o valor da propriedade tpBeneficio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTpBeneficio() {
                    return tpBeneficio;
                }

                /**
                 * Define o valor da propriedade tpBeneficio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTpBeneficio(BigInteger value) {
                    this.tpBeneficio = value;
                }

                /**
                 * Obtém o valor da propriedade tpPlanRP.
                 * 
                 */
                public byte getTpPlanRP() {
                    return tpPlanRP;
                }

                /**
                 * Define o valor da propriedade tpPlanRP.
                 * 
                 */
                public void setTpPlanRP(byte value) {
                    this.tpPlanRP = value;
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
                 * Obtém o valor da propriedade indDecJud.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIndDecJud() {
                    return indDecJud;
                }

                /**
                 * Define o valor da propriedade indDecJud.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIndDecJud(TSSimNao value) {
                    this.indDecJud = value;
                }

                /**
                 * Obtém o valor da propriedade infoPenMorte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte }
                 *     
                 */
                public ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte getInfoPenMorte() {
                    return infoPenMorte;
                }

                /**
                 * Define o valor da propriedade infoPenMorte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte }
                 *     
                 */
                public void setInfoPenMorte(ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte value) {
                    this.infoPenMorte = value;
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
                 *         &lt;element name="tpPenMorte" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_tpPenMorte"/>
                 *         &lt;element name="instPenMorte" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cpfInst" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
                 *                   &lt;element name="dtInst" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                    "tpPenMorte",
                    "instPenMorte"
                })
                public static class InfoPenMorte {

                    protected byte tpPenMorte;
                    protected ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte.InstPenMorte instPenMorte;

                    /**
                     * Obtém o valor da propriedade tpPenMorte.
                     * 
                     */
                    public byte getTpPenMorte() {
                        return tpPenMorte;
                    }

                    /**
                     * Define o valor da propriedade tpPenMorte.
                     * 
                     */
                    public void setTpPenMorte(byte value) {
                        this.tpPenMorte = value;
                    }

                    /**
                     * Obtém o valor da propriedade instPenMorte.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte.InstPenMorte }
                     *     
                     */
                    public ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte.InstPenMorte getInstPenMorte() {
                        return instPenMorte;
                    }

                    /**
                     * Define o valor da propriedade instPenMorte.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte.InstPenMorte }
                     *     
                     */
                    public void setInstPenMorte(ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte.InstPenMorte value) {
                        this.instPenMorte = value;
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
                     *         &lt;element name="cpfInst" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
                     *         &lt;element name="dtInst" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                        "cpfInst",
                        "dtInst"
                    })
                    public static class InstPenMorte {

                        @XmlElement(required = true)
                        protected String cpfInst;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dtInst;

                        /**
                         * Obtém o valor da propriedade cpfInst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCpfInst() {
                            return cpfInst;
                        }

                        /**
                         * Define o valor da propriedade cpfInst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCpfInst(String value) {
                            this.cpfInst = value;
                        }

                        /**
                         * Obtém o valor da propriedade dtInst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDtInst() {
                            return dtInst;
                        }

                        /**
                         * Define o valor da propriedade dtInst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDtInst(XMLGregorianCalendar value) {
                            this.dtInst = value;
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
             *         &lt;element name="dtTermBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="mtvTermino">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d{2}"/>
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
                "dtTermBeneficio",
                "mtvTermino"
            })
            public static class InfoBenTermino {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTermBeneficio;
                protected byte mtvTermino;

                /**
                 * Obtém o valor da propriedade dtTermBeneficio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTermBeneficio() {
                    return dtTermBeneficio;
                }

                /**
                 * Define o valor da propriedade dtTermBeneficio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTermBeneficio(XMLGregorianCalendar value) {
                    this.dtTermBeneficio = value;
                }

                /**
                 * Obtém o valor da propriedade mtvTermino.
                 * 
                 */
                public byte getMtvTermino() {
                    return mtvTermino;
                }

                /**
                 * Define o valor da propriedade mtvTermino.
                 * 
                 */
                public void setMtvTermino(byte value) {
                    this.mtvTermino = value;
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
             *         &lt;element name="cpfAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cpf"/>
             *         &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
             *         &lt;element name="dtAltCPF" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                "nrBeneficioAnt",
                "dtAltCPF",
                "observacao"
            })
            public static class MudancaCPF {

                @XmlElement(required = true)
                protected String cpfAnt;
                @XmlElement(required = true)
                protected String nrBeneficioAnt;
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
                 * Obtém o valor da propriedade nrBeneficioAnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrBeneficioAnt() {
                    return nrBeneficioAnt;
                }

                /**
                 * Define o valor da propriedade nrBeneficioAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrBeneficioAnt(String value) {
                    this.nrBeneficioAnt = value;
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
             *         &lt;element name="cnpjOrgaoAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_cnpj"/>
             *         &lt;element name="nrBeneficioAnt" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_nrBeneficio"/>
             *         &lt;element name="dtTransf" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtCdBenIn/v_S_01_00_00}TS_observacao" minOccurs="0"/>
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
                "nrBeneficioAnt",
                "dtTransf",
                "observacao"
            })
            public static class SucessaoBenef {

                @XmlElement(required = true)
                protected String cnpjOrgaoAnt;
                @XmlElement(required = true)
                protected String nrBeneficioAnt;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTransf;
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
                 * Obtém o valor da propriedade nrBeneficioAnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrBeneficioAnt() {
                    return nrBeneficioAnt;
                }

                /**
                 * Define o valor da propriedade nrBeneficioAnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrBeneficioAnt(String value) {
                    this.nrBeneficioAnt = value;
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

        }

    }

}
