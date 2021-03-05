//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:01 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenefalt;

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
 *         &lt;element name="evtCdBenefAlt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_ideEvento_trab_PJ"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideBenef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpf"/>
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
 *                             &lt;element name="dtAlteracao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dadosBenef">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nmBenefic" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmBenefic"/>
 *                                       &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
 *                                       &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_racaCorBenef"/>
 *                                       &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_estCivilBenef" minOccurs="0"/>
 *                                       &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMen"/>
 *                                       &lt;element name="endereco">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_brasil"/>
 *                                                   &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_exterior"/>
 *                                                 &lt;/choice>
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
 *                                                 &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_tpDep"/>
 *                                                 &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmDep"/>
 *                                                 &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_dtNascto"/>
 *                                                 &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpfDepBenef" minOccurs="0"/>
 *                                                 &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
 *                                                 &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_depIRRF_Benef"/>
 *                                                 &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMenDep"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_Id" />
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
    "evtCdBenefAlt",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtCdBenefAlt evtCdBenefAlt;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCdBenefAlt.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCdBenefAlt }
     *     
     */
    public ESocial.EvtCdBenefAlt getEvtCdBenefAlt() {
        return evtCdBenefAlt;
    }

    /**
     * Define o valor da propriedade evtCdBenefAlt.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCdBenefAlt }
     *     
     */
    public void setEvtCdBenefAlt(ESocial.EvtCdBenefAlt value) {
        this.evtCdBenefAlt = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_ideEvento_trab_PJ"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideBenef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpf"/>
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
     *                   &lt;element name="dtAlteracao" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dadosBenef">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nmBenefic" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmBenefic"/>
     *                             &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
     *                             &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_racaCorBenef"/>
     *                             &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_estCivilBenef" minOccurs="0"/>
     *                             &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMen"/>
     *                             &lt;element name="endereco">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_brasil"/>
     *                                         &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_exterior"/>
     *                                       &lt;/choice>
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
     *                                       &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_tpDep"/>
     *                                       &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmDep"/>
     *                                       &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_dtNascto"/>
     *                                       &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpfDepBenef" minOccurs="0"/>
     *                                       &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
     *                                       &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_depIRRF_Benef"/>
     *                                       &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMenDep"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_Id" />
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
        "ideBenef",
        "alteracao"
    })
    public static class EvtCdBenefAlt {

        @XmlElement(required = true)
        protected TIdeEventoTrabPJ ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtCdBenefAlt.IdeBenef ideBenef;
        @XmlElement(required = true)
        protected ESocial.EvtCdBenefAlt.Alteracao alteracao;
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
         * Obtém o valor da propriedade ideBenef.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenefAlt.IdeBenef }
         *     
         */
        public ESocial.EvtCdBenefAlt.IdeBenef getIdeBenef() {
            return ideBenef;
        }

        /**
         * Define o valor da propriedade ideBenef.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenefAlt.IdeBenef }
         *     
         */
        public void setIdeBenef(ESocial.EvtCdBenefAlt.IdeBenef value) {
            this.ideBenef = value;
        }

        /**
         * Obtém o valor da propriedade alteracao.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenefAlt.Alteracao }
         *     
         */
        public ESocial.EvtCdBenefAlt.Alteracao getAlteracao() {
            return alteracao;
        }

        /**
         * Define o valor da propriedade alteracao.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenefAlt.Alteracao }
         *     
         */
        public void setAlteracao(ESocial.EvtCdBenefAlt.Alteracao value) {
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
         *         &lt;element name="dtAlteracao" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dadosBenef">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nmBenefic" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmBenefic"/>
         *                   &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
         *                   &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_racaCorBenef"/>
         *                   &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_estCivilBenef" minOccurs="0"/>
         *                   &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMen"/>
         *                   &lt;element name="endereco">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_brasil"/>
         *                               &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_exterior"/>
         *                             &lt;/choice>
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
         *                             &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_tpDep"/>
         *                             &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmDep"/>
         *                             &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_dtNascto"/>
         *                             &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpfDepBenef" minOccurs="0"/>
         *                             &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
         *                             &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_depIRRF_Benef"/>
         *                             &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMenDep"/>
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
            "dtAlteracao",
            "dadosBenef"
        })
        public static class Alteracao {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAlteracao;
            @XmlElement(required = true)
            protected ESocial.EvtCdBenefAlt.Alteracao.DadosBenef dadosBenef;

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
             * Obtém o valor da propriedade dadosBenef.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCdBenefAlt.Alteracao.DadosBenef }
             *     
             */
            public ESocial.EvtCdBenefAlt.Alteracao.DadosBenef getDadosBenef() {
                return dadosBenef;
            }

            /**
             * Define o valor da propriedade dadosBenef.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCdBenefAlt.Alteracao.DadosBenef }
             *     
             */
            public void setDadosBenef(ESocial.EvtCdBenefAlt.Alteracao.DadosBenef value) {
                this.dadosBenef = value;
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
             *         &lt;element name="nmBenefic" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmBenefic"/>
             *         &lt;element name="sexo" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
             *         &lt;element name="racaCor" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_racaCorBenef"/>
             *         &lt;element name="estCiv" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_estCivilBenef" minOccurs="0"/>
             *         &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMen"/>
             *         &lt;element name="endereco">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_brasil"/>
             *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_exterior"/>
             *                   &lt;/choice>
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
             *                   &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_tpDep"/>
             *                   &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmDep"/>
             *                   &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_dtNascto"/>
             *                   &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpfDepBenef" minOccurs="0"/>
             *                   &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
             *                   &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_depIRRF_Benef"/>
             *                   &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMenDep"/>
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
                "nmBenefic",
                "sexo",
                "racaCor",
                "estCiv",
                "incFisMen",
                "endereco",
                "dependente"
            })
            public static class DadosBenef {

                @XmlElement(required = true)
                protected String nmBenefic;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSexo sexo;
                protected byte racaCor;
                protected Byte estCiv;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TSSimNao incFisMen;
                @XmlElement(required = true)
                protected ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Endereco endereco;
                protected List<ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Dependente> dependente;

                /**
                 * Obtém o valor da propriedade nmBenefic.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNmBenefic() {
                    return nmBenefic;
                }

                /**
                 * Define o valor da propriedade nmBenefic.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNmBenefic(String value) {
                    this.nmBenefic = value;
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
                 * Obtém o valor da propriedade incFisMen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TSSimNao }
                 *     
                 */
                public TSSimNao getIncFisMen() {
                    return incFisMen;
                }

                /**
                 * Define o valor da propriedade incFisMen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TSSimNao }
                 *     
                 */
                public void setIncFisMen(TSSimNao value) {
                    this.incFisMen = value;
                }

                /**
                 * Obtém o valor da propriedade endereco.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Endereco }
                 *     
                 */
                public ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Endereco getEndereco() {
                    return endereco;
                }

                /**
                 * Define o valor da propriedade endereco.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Endereco }
                 *     
                 */
                public void setEndereco(ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Endereco value) {
                    this.endereco = value;
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
                 * {@link ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Dependente }
                 * 
                 * 
                 */
                public List<ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Dependente> getDependente() {
                    if (dependente == null) {
                        dependente = new ArrayList<ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Dependente>();
                    }
                    return this.dependente;
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
                 *         &lt;element name="tpDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_tpDep"/>
                 *         &lt;element name="nmDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_nmDep"/>
                 *         &lt;element name="dtNascto" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_dtNascto"/>
                 *         &lt;element name="cpfDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpfDepBenef" minOccurs="0"/>
                 *         &lt;element name="sexoDep" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_sexo"/>
                 *         &lt;element name="depIRRF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_depIRRF_Benef"/>
                 *         &lt;element name="incFisMen" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_incFisMenDep"/>
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
                    "incFisMen"
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
                    protected TSSexo sexoDep;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "string")
                    protected TSSimNao depIRRF;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "string")
                    protected TSSimNao incFisMen;

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
                     * Obtém o valor da propriedade incFisMen.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public TSSimNao getIncFisMen() {
                        return incFisMen;
                    }

                    /**
                     * Define o valor da propriedade incFisMen.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TSSimNao }
                     *     
                     */
                    public void setIncFisMen(TSSimNao value) {
                        this.incFisMen = value;
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
                 *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_brasil"/>
                 *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}T_endereco_exterior"/>
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
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefAlt/v_S_01_00_00}TS_cpf"/>
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
            "cpfBenef"
        })
        public static class IdeBenef {

            @XmlElement(required = true)
            protected String cpfBenef;

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

        }

    }

}
