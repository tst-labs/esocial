//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:17 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.irrfbenef;

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
 *         &lt;element name="evtIrrfBenef">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_nrRecibo"/>
 *                             &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_perApur_mensal"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideTrabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_cpf"/>
 *                             &lt;element name="dmDev" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_perApur"/>
 *                                       &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codigo_esocial"/>
 *                                       &lt;element name="tpPgto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codCateg"/>
 *                                       &lt;element name="infoIR" maxOccurs="999">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInfoIR">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                       &lt;enumeration value="11"/>
 *                                                       &lt;enumeration value="12"/>
 *                                                       &lt;enumeration value="14"/>
 *                                                       &lt;enumeration value="31"/>
 *                                                       &lt;enumeration value="32"/>
 *                                                       &lt;enumeration value="34"/>
 *                                                       &lt;enumeration value="41"/>
 *                                                       &lt;enumeration value="42"/>
 *                                                       &lt;enumeration value="46"/>
 *                                                       &lt;enumeration value="47"/>
 *                                                       &lt;enumeration value="51"/>
 *                                                       &lt;enumeration value="52"/>
 *                                                       &lt;enumeration value="54"/>
 *                                                       &lt;enumeration value="61"/>
 *                                                       &lt;enumeration value="62"/>
 *                                                       &lt;enumeration value="63"/>
 *                                                       &lt;enumeration value="64"/>
 *                                                       &lt;enumeration value="67"/>
 *                                                       &lt;enumeration value="70"/>
 *                                                       &lt;enumeration value="71"/>
 *                                                       &lt;enumeration value="72"/>
 *                                                       &lt;enumeration value="73"/>
 *                                                       &lt;enumeration value="74"/>
 *                                                       &lt;enumeration value="75"/>
 *                                                       &lt;enumeration value="76"/>
 *                                                       &lt;enumeration value="77"/>
 *                                                       &lt;enumeration value="700"/>
 *                                                       &lt;enumeration value="701"/>
 *                                                       &lt;enumeration value="79"/>
 *                                                       &lt;enumeration value="7900"/>
 *                                                       &lt;enumeration value="7950"/>
 *                                                       &lt;enumeration value="7951"/>
 *                                                       &lt;enumeration value="7952"/>
 *                                                       &lt;enumeration value="7953"/>
 *                                                       &lt;enumeration value="7954"/>
 *                                                       &lt;enumeration value="7955"/>
 *                                                       &lt;enumeration value="7956"/>
 *                                                       &lt;enumeration value="7957"/>
 *                                                       &lt;enumeration value="7958"/>
 *                                                       &lt;enumeration value="7959"/>
 *                                                       &lt;enumeration value="7960"/>
 *                                                       &lt;enumeration value="7961"/>
 *                                                       &lt;enumeration value="7962"/>
 *                                                       &lt;enumeration value="7963"/>
 *                                                       &lt;enumeration value="7964"/>
 *                                                       &lt;enumeration value="9011"/>
 *                                                       &lt;enumeration value="9012"/>
 *                                                       &lt;enumeration value="9014"/>
 *                                                       &lt;enumeration value="9031"/>
 *                                                       &lt;enumeration value="9032"/>
 *                                                       &lt;enumeration value="9034"/>
 *                                                       &lt;enumeration value="9831"/>
 *                                                       &lt;enumeration value="9832"/>
 *                                                       &lt;enumeration value="9834"/>
 *                                                       &lt;enumeration value="9041"/>
 *                                                       &lt;enumeration value="9042"/>
 *                                                       &lt;enumeration value="9046"/>
 *                                                       &lt;enumeration value="9047"/>
 *                                                       &lt;enumeration value="9051"/>
 *                                                       &lt;enumeration value="9052"/>
 *                                                       &lt;enumeration value="9054"/>
 *                                                       &lt;enumeration value="9061"/>
 *                                                       &lt;enumeration value="9062"/>
 *                                                       &lt;enumeration value="9063"/>
 *                                                       &lt;enumeration value="9064"/>
 *                                                       &lt;enumeration value="9067"/>
 *                                                       &lt;enumeration value="9082"/>
 *                                                       &lt;enumeration value="9083"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_valor"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_Id_retorno" />
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
    "evtIrrfBenef",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtIrrfBenef evtIrrfBenef;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtIrrfBenef.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtIrrfBenef }
     *     
     */
    public ESocial.EvtIrrfBenef getEvtIrrfBenef() {
        return evtIrrfBenef;
    }

    /**
     * Define o valor da propriedade evtIrrfBenef.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtIrrfBenef }
     *     
     */
    public void setEvtIrrfBenef(ESocial.EvtIrrfBenef value) {
        this.evtIrrfBenef = value;
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
     *         &lt;element name="ideEvento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_nrRecibo"/>
     *                   &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_perApur_mensal"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideTrabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_cpf"/>
     *                   &lt;element name="dmDev" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_perApur"/>
     *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codigo_esocial"/>
     *                             &lt;element name="tpPgto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codCateg"/>
     *                             &lt;element name="infoIR" maxOccurs="999">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInfoIR">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                             &lt;enumeration value="11"/>
     *                                             &lt;enumeration value="12"/>
     *                                             &lt;enumeration value="14"/>
     *                                             &lt;enumeration value="31"/>
     *                                             &lt;enumeration value="32"/>
     *                                             &lt;enumeration value="34"/>
     *                                             &lt;enumeration value="41"/>
     *                                             &lt;enumeration value="42"/>
     *                                             &lt;enumeration value="46"/>
     *                                             &lt;enumeration value="47"/>
     *                                             &lt;enumeration value="51"/>
     *                                             &lt;enumeration value="52"/>
     *                                             &lt;enumeration value="54"/>
     *                                             &lt;enumeration value="61"/>
     *                                             &lt;enumeration value="62"/>
     *                                             &lt;enumeration value="63"/>
     *                                             &lt;enumeration value="64"/>
     *                                             &lt;enumeration value="67"/>
     *                                             &lt;enumeration value="70"/>
     *                                             &lt;enumeration value="71"/>
     *                                             &lt;enumeration value="72"/>
     *                                             &lt;enumeration value="73"/>
     *                                             &lt;enumeration value="74"/>
     *                                             &lt;enumeration value="75"/>
     *                                             &lt;enumeration value="76"/>
     *                                             &lt;enumeration value="77"/>
     *                                             &lt;enumeration value="700"/>
     *                                             &lt;enumeration value="701"/>
     *                                             &lt;enumeration value="79"/>
     *                                             &lt;enumeration value="7900"/>
     *                                             &lt;enumeration value="7950"/>
     *                                             &lt;enumeration value="7951"/>
     *                                             &lt;enumeration value="7952"/>
     *                                             &lt;enumeration value="7953"/>
     *                                             &lt;enumeration value="7954"/>
     *                                             &lt;enumeration value="7955"/>
     *                                             &lt;enumeration value="7956"/>
     *                                             &lt;enumeration value="7957"/>
     *                                             &lt;enumeration value="7958"/>
     *                                             &lt;enumeration value="7959"/>
     *                                             &lt;enumeration value="7960"/>
     *                                             &lt;enumeration value="7961"/>
     *                                             &lt;enumeration value="7962"/>
     *                                             &lt;enumeration value="7963"/>
     *                                             &lt;enumeration value="7964"/>
     *                                             &lt;enumeration value="9011"/>
     *                                             &lt;enumeration value="9012"/>
     *                                             &lt;enumeration value="9014"/>
     *                                             &lt;enumeration value="9031"/>
     *                                             &lt;enumeration value="9032"/>
     *                                             &lt;enumeration value="9034"/>
     *                                             &lt;enumeration value="9831"/>
     *                                             &lt;enumeration value="9832"/>
     *                                             &lt;enumeration value="9834"/>
     *                                             &lt;enumeration value="9041"/>
     *                                             &lt;enumeration value="9042"/>
     *                                             &lt;enumeration value="9046"/>
     *                                             &lt;enumeration value="9047"/>
     *                                             &lt;enumeration value="9051"/>
     *                                             &lt;enumeration value="9052"/>
     *                                             &lt;enumeration value="9054"/>
     *                                             &lt;enumeration value="9061"/>
     *                                             &lt;enumeration value="9062"/>
     *                                             &lt;enumeration value="9063"/>
     *                                             &lt;enumeration value="9064"/>
     *                                             &lt;enumeration value="9067"/>
     *                                             &lt;enumeration value="9082"/>
     *                                             &lt;enumeration value="9083"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_valor"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_Id_retorno" />
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
        "ideTrabalhador"
    })
    public static class EvtIrrfBenef {

        @XmlElement(required = true)
        protected ESocial.EvtIrrfBenef.IdeEvento ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtIrrfBenef.IdeTrabalhador ideTrabalhador;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtIrrfBenef.IdeEvento }
         *     
         */
        public ESocial.EvtIrrfBenef.IdeEvento getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtIrrfBenef.IdeEvento }
         *     
         */
        public void setIdeEvento(ESocial.EvtIrrfBenef.IdeEvento value) {
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
         *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador }
         *     
         */
        public ESocial.EvtIrrfBenef.IdeTrabalhador getIdeTrabalhador() {
            return ideTrabalhador;
        }

        /**
         * Define o valor da propriedade ideTrabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtIrrfBenef.IdeTrabalhador }
         *     
         */
        public void setIdeTrabalhador(ESocial.EvtIrrfBenef.IdeTrabalhador value) {
            this.ideTrabalhador = value;
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
         *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_nrRecibo"/>
         *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_perApur_mensal"/>
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
            "perApur"
        })
        public static class IdeEvento {

            @XmlElement(required = true)
            protected String nrRecArqBase;
            @XmlElement(required = true)
            protected String perApur;

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
             * Obtém o valor da propriedade perApur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPerApur() {
                return perApur;
            }

            /**
             * Define o valor da propriedade perApur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPerApur(String value) {
                this.perApur = value;
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
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_cpf"/>
         *         &lt;element name="dmDev" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_perApur"/>
         *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codigo_esocial"/>
         *                   &lt;element name="tpPgto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codCateg"/>
         *                   &lt;element name="infoIR" maxOccurs="999">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInfoIR">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                   &lt;enumeration value="11"/>
         *                                   &lt;enumeration value="12"/>
         *                                   &lt;enumeration value="14"/>
         *                                   &lt;enumeration value="31"/>
         *                                   &lt;enumeration value="32"/>
         *                                   &lt;enumeration value="34"/>
         *                                   &lt;enumeration value="41"/>
         *                                   &lt;enumeration value="42"/>
         *                                   &lt;enumeration value="46"/>
         *                                   &lt;enumeration value="47"/>
         *                                   &lt;enumeration value="51"/>
         *                                   &lt;enumeration value="52"/>
         *                                   &lt;enumeration value="54"/>
         *                                   &lt;enumeration value="61"/>
         *                                   &lt;enumeration value="62"/>
         *                                   &lt;enumeration value="63"/>
         *                                   &lt;enumeration value="64"/>
         *                                   &lt;enumeration value="67"/>
         *                                   &lt;enumeration value="70"/>
         *                                   &lt;enumeration value="71"/>
         *                                   &lt;enumeration value="72"/>
         *                                   &lt;enumeration value="73"/>
         *                                   &lt;enumeration value="74"/>
         *                                   &lt;enumeration value="75"/>
         *                                   &lt;enumeration value="76"/>
         *                                   &lt;enumeration value="77"/>
         *                                   &lt;enumeration value="700"/>
         *                                   &lt;enumeration value="701"/>
         *                                   &lt;enumeration value="79"/>
         *                                   &lt;enumeration value="7900"/>
         *                                   &lt;enumeration value="7950"/>
         *                                   &lt;enumeration value="7951"/>
         *                                   &lt;enumeration value="7952"/>
         *                                   &lt;enumeration value="7953"/>
         *                                   &lt;enumeration value="7954"/>
         *                                   &lt;enumeration value="7955"/>
         *                                   &lt;enumeration value="7956"/>
         *                                   &lt;enumeration value="7957"/>
         *                                   &lt;enumeration value="7958"/>
         *                                   &lt;enumeration value="7959"/>
         *                                   &lt;enumeration value="7960"/>
         *                                   &lt;enumeration value="7961"/>
         *                                   &lt;enumeration value="7962"/>
         *                                   &lt;enumeration value="7963"/>
         *                                   &lt;enumeration value="7964"/>
         *                                   &lt;enumeration value="9011"/>
         *                                   &lt;enumeration value="9012"/>
         *                                   &lt;enumeration value="9014"/>
         *                                   &lt;enumeration value="9031"/>
         *                                   &lt;enumeration value="9032"/>
         *                                   &lt;enumeration value="9034"/>
         *                                   &lt;enumeration value="9831"/>
         *                                   &lt;enumeration value="9832"/>
         *                                   &lt;enumeration value="9834"/>
         *                                   &lt;enumeration value="9041"/>
         *                                   &lt;enumeration value="9042"/>
         *                                   &lt;enumeration value="9046"/>
         *                                   &lt;enumeration value="9047"/>
         *                                   &lt;enumeration value="9051"/>
         *                                   &lt;enumeration value="9052"/>
         *                                   &lt;enumeration value="9054"/>
         *                                   &lt;enumeration value="9061"/>
         *                                   &lt;enumeration value="9062"/>
         *                                   &lt;enumeration value="9063"/>
         *                                   &lt;enumeration value="9064"/>
         *                                   &lt;enumeration value="9067"/>
         *                                   &lt;enumeration value="9082"/>
         *                                   &lt;enumeration value="9083"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_valor"/>
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
            "cpfBenef",
            "dmDev"
        })
        public static class IdeTrabalhador {

            @XmlElement(required = true)
            protected String cpfBenef;
            @XmlElement(required = true)
            protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev> dmDev;

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
             * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev }
             * 
             * 
             */
            public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev> getDmDev() {
                if (dmDev == null) {
                    dmDev = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev>();
                }
                return this.dmDev;
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
             *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_perApur"/>
             *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codigo_esocial"/>
             *         &lt;element name="tpPgto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codCateg"/>
             *         &lt;element name="infoIR" maxOccurs="999">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInfoIR">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                         &lt;enumeration value="11"/>
             *                         &lt;enumeration value="12"/>
             *                         &lt;enumeration value="14"/>
             *                         &lt;enumeration value="31"/>
             *                         &lt;enumeration value="32"/>
             *                         &lt;enumeration value="34"/>
             *                         &lt;enumeration value="41"/>
             *                         &lt;enumeration value="42"/>
             *                         &lt;enumeration value="46"/>
             *                         &lt;enumeration value="47"/>
             *                         &lt;enumeration value="51"/>
             *                         &lt;enumeration value="52"/>
             *                         &lt;enumeration value="54"/>
             *                         &lt;enumeration value="61"/>
             *                         &lt;enumeration value="62"/>
             *                         &lt;enumeration value="63"/>
             *                         &lt;enumeration value="64"/>
             *                         &lt;enumeration value="67"/>
             *                         &lt;enumeration value="70"/>
             *                         &lt;enumeration value="71"/>
             *                         &lt;enumeration value="72"/>
             *                         &lt;enumeration value="73"/>
             *                         &lt;enumeration value="74"/>
             *                         &lt;enumeration value="75"/>
             *                         &lt;enumeration value="76"/>
             *                         &lt;enumeration value="77"/>
             *                         &lt;enumeration value="700"/>
             *                         &lt;enumeration value="701"/>
             *                         &lt;enumeration value="79"/>
             *                         &lt;enumeration value="7900"/>
             *                         &lt;enumeration value="7950"/>
             *                         &lt;enumeration value="7951"/>
             *                         &lt;enumeration value="7952"/>
             *                         &lt;enumeration value="7953"/>
             *                         &lt;enumeration value="7954"/>
             *                         &lt;enumeration value="7955"/>
             *                         &lt;enumeration value="7956"/>
             *                         &lt;enumeration value="7957"/>
             *                         &lt;enumeration value="7958"/>
             *                         &lt;enumeration value="7959"/>
             *                         &lt;enumeration value="7960"/>
             *                         &lt;enumeration value="7961"/>
             *                         &lt;enumeration value="7962"/>
             *                         &lt;enumeration value="7963"/>
             *                         &lt;enumeration value="7964"/>
             *                         &lt;enumeration value="9011"/>
             *                         &lt;enumeration value="9012"/>
             *                         &lt;enumeration value="9014"/>
             *                         &lt;enumeration value="9031"/>
             *                         &lt;enumeration value="9032"/>
             *                         &lt;enumeration value="9034"/>
             *                         &lt;enumeration value="9831"/>
             *                         &lt;enumeration value="9832"/>
             *                         &lt;enumeration value="9834"/>
             *                         &lt;enumeration value="9041"/>
             *                         &lt;enumeration value="9042"/>
             *                         &lt;enumeration value="9046"/>
             *                         &lt;enumeration value="9047"/>
             *                         &lt;enumeration value="9051"/>
             *                         &lt;enumeration value="9052"/>
             *                         &lt;enumeration value="9054"/>
             *                         &lt;enumeration value="9061"/>
             *                         &lt;enumeration value="9062"/>
             *                         &lt;enumeration value="9063"/>
             *                         &lt;enumeration value="9064"/>
             *                         &lt;enumeration value="9067"/>
             *                         &lt;enumeration value="9082"/>
             *                         &lt;enumeration value="9083"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_valor"/>
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
                "ideDmDev",
                "tpPgto",
                "dtPgto",
                "codCateg",
                "infoIR"
            })
            public static class DmDev {

                @XmlElement(required = true)
                protected String perRef;
                @XmlElement(required = true)
                protected String ideDmDev;
                protected byte tpPgto;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtPgto;
                @XmlElement(required = true)
                protected BigInteger codCateg;
                @XmlElement(required = true)
                protected List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR> infoIR;

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
                 * Obtém o valor da propriedade tpPgto.
                 * 
                 */
                public byte getTpPgto() {
                    return tpPgto;
                }

                /**
                 * Define o valor da propriedade tpPgto.
                 * 
                 */
                public void setTpPgto(byte value) {
                    this.tpPgto = value;
                }

                /**
                 * Obtém o valor da propriedade dtPgto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtPgto() {
                    return dtPgto;
                }

                /**
                 * Define o valor da propriedade dtPgto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtPgto(XMLGregorianCalendar value) {
                    this.dtPgto = value;
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
                 * Gets the value of the infoIR property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infoIR property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfoIR().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR }
                 * 
                 * 
                 */
                public List<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR> getInfoIR() {
                    if (infoIR == null) {
                        infoIR = new ArrayList<ESocial.EvtIrrfBenef.IdeTrabalhador.DmDev.InfoIR>();
                    }
                    return this.infoIR;
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
                 *         &lt;element name="tpInfoIR">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *               &lt;enumeration value="11"/>
                 *               &lt;enumeration value="12"/>
                 *               &lt;enumeration value="14"/>
                 *               &lt;enumeration value="31"/>
                 *               &lt;enumeration value="32"/>
                 *               &lt;enumeration value="34"/>
                 *               &lt;enumeration value="41"/>
                 *               &lt;enumeration value="42"/>
                 *               &lt;enumeration value="46"/>
                 *               &lt;enumeration value="47"/>
                 *               &lt;enumeration value="51"/>
                 *               &lt;enumeration value="52"/>
                 *               &lt;enumeration value="54"/>
                 *               &lt;enumeration value="61"/>
                 *               &lt;enumeration value="62"/>
                 *               &lt;enumeration value="63"/>
                 *               &lt;enumeration value="64"/>
                 *               &lt;enumeration value="67"/>
                 *               &lt;enumeration value="70"/>
                 *               &lt;enumeration value="71"/>
                 *               &lt;enumeration value="72"/>
                 *               &lt;enumeration value="73"/>
                 *               &lt;enumeration value="74"/>
                 *               &lt;enumeration value="75"/>
                 *               &lt;enumeration value="76"/>
                 *               &lt;enumeration value="77"/>
                 *               &lt;enumeration value="700"/>
                 *               &lt;enumeration value="701"/>
                 *               &lt;enumeration value="79"/>
                 *               &lt;enumeration value="7900"/>
                 *               &lt;enumeration value="7950"/>
                 *               &lt;enumeration value="7951"/>
                 *               &lt;enumeration value="7952"/>
                 *               &lt;enumeration value="7953"/>
                 *               &lt;enumeration value="7954"/>
                 *               &lt;enumeration value="7955"/>
                 *               &lt;enumeration value="7956"/>
                 *               &lt;enumeration value="7957"/>
                 *               &lt;enumeration value="7958"/>
                 *               &lt;enumeration value="7959"/>
                 *               &lt;enumeration value="7960"/>
                 *               &lt;enumeration value="7961"/>
                 *               &lt;enumeration value="7962"/>
                 *               &lt;enumeration value="7963"/>
                 *               &lt;enumeration value="7964"/>
                 *               &lt;enumeration value="9011"/>
                 *               &lt;enumeration value="9012"/>
                 *               &lt;enumeration value="9014"/>
                 *               &lt;enumeration value="9031"/>
                 *               &lt;enumeration value="9032"/>
                 *               &lt;enumeration value="9034"/>
                 *               &lt;enumeration value="9831"/>
                 *               &lt;enumeration value="9832"/>
                 *               &lt;enumeration value="9834"/>
                 *               &lt;enumeration value="9041"/>
                 *               &lt;enumeration value="9042"/>
                 *               &lt;enumeration value="9046"/>
                 *               &lt;enumeration value="9047"/>
                 *               &lt;enumeration value="9051"/>
                 *               &lt;enumeration value="9052"/>
                 *               &lt;enumeration value="9054"/>
                 *               &lt;enumeration value="9061"/>
                 *               &lt;enumeration value="9062"/>
                 *               &lt;enumeration value="9063"/>
                 *               &lt;enumeration value="9064"/>
                 *               &lt;enumeration value="9067"/>
                 *               &lt;enumeration value="9082"/>
                 *               &lt;enumeration value="9083"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="valor" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_valor"/>
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
                    "tpInfoIR",
                    "valor"
                })
                public static class InfoIR {

                    @XmlElement(required = true)
                    protected BigInteger tpInfoIR;
                    @XmlElement(required = true)
                    protected BigDecimal valor;

                    /**
                     * Obtém o valor da propriedade tpInfoIR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getTpInfoIR() {
                        return tpInfoIR;
                    }

                    /**
                     * Define o valor da propriedade tpInfoIR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setTpInfoIR(BigInteger value) {
                        this.tpInfoIR = value;
                    }

                    /**
                     * Obtém o valor da propriedade valor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValor() {
                        return valor;
                    }

                    /**
                     * Define o valor da propriedade valor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValor(BigDecimal value) {
                        this.valor = value;
                    }

                }

            }

        }

    }

}
