//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:58 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.fechaevper;

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
 *         &lt;element name="evtFechaEvPer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indApuracao">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="perApur">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="4"/>
 *                                   &lt;maxLength value="7"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAmb">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="procEmi">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="verProc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02}TEmpregador"/>
 *                   &lt;element name="ideRespInf" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nmResp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cpfResp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="11"/>
 *                                   &lt;pattern value="\d{11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="telefone">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="8"/>
 *                                   &lt;maxLength value="13"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="email" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="6"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoFech">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="evtRemun">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="evtPgtos">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="evtAqProd">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="1"/>
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="evtComProd">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="1"/>
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="evtContratAvNP">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="1"/>
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="evtInfoComplPer">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="compSemMovto" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="7"/>
 *                                   &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
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
    "evtFechaEvPer",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
    protected ESocial.EvtFechaEvPer evtFechaEvPer;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtFechaEvPer.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtFechaEvPer }
     *     
     */
    public ESocial.EvtFechaEvPer getEvtFechaEvPer() {
        return evtFechaEvPer;
    }

    /**
     * Define o valor da propriedade evtFechaEvPer.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtFechaEvPer }
     *     
     */
    public void setEvtFechaEvPer(ESocial.EvtFechaEvPer value) {
        this.evtFechaEvPer = value;
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
     *                   &lt;element name="indApuracao">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="perApur">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="4"/>
     *                         &lt;maxLength value="7"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpAmb">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="procEmi">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="verProc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02}TEmpregador"/>
     *         &lt;element name="ideRespInf" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nmResp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cpfResp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="11"/>
     *                         &lt;pattern value="\d{11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="telefone">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="8"/>
     *                         &lt;maxLength value="13"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="email" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="6"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoFech">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="evtRemun">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="evtPgtos">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="evtAqProd">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="1"/>
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="evtComProd">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="1"/>
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="evtContratAvNP">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="1"/>
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="evtInfoComplPer">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="compSemMovto" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="7"/>
     *                         &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
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
        "ideRespInf",
        "infoFech"
    })
    public static class EvtFechaEvPer {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
        protected ESocial.EvtFechaEvPer.IdeEvento ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02")
        protected ESocial.EvtFechaEvPer.IdeRespInf ideRespInf;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
        protected ESocial.EvtFechaEvPer.InfoFech infoFech;
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
         *     {@link ESocial.EvtFechaEvPer.IdeEvento }
         *     
         */
        public ESocial.EvtFechaEvPer.IdeEvento getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFechaEvPer.IdeEvento }
         *     
         */
        public void setIdeEvento(ESocial.EvtFechaEvPer.IdeEvento value) {
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
         * Obtém o valor da propriedade ideRespInf.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFechaEvPer.IdeRespInf }
         *     
         */
        public ESocial.EvtFechaEvPer.IdeRespInf getIdeRespInf() {
            return ideRespInf;
        }

        /**
         * Define o valor da propriedade ideRespInf.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFechaEvPer.IdeRespInf }
         *     
         */
        public void setIdeRespInf(ESocial.EvtFechaEvPer.IdeRespInf value) {
            this.ideRespInf = value;
        }

        /**
         * Obtém o valor da propriedade infoFech.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFechaEvPer.InfoFech }
         *     
         */
        public ESocial.EvtFechaEvPer.InfoFech getInfoFech() {
            return infoFech;
        }

        /**
         * Define o valor da propriedade infoFech.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFechaEvPer.InfoFech }
         *     
         */
        public void setInfoFech(ESocial.EvtFechaEvPer.InfoFech value) {
            this.infoFech = value;
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
         *         &lt;element name="indApuracao">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="perApur">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="4"/>
         *               &lt;maxLength value="7"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAmb">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="procEmi">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="verProc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
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
            "indApuracao",
            "perApur",
            "tpAmb",
            "procEmi",
            "verProc"
        })
        public static class IdeEvento {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02")
            protected byte indApuracao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String perApur;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02")
            protected byte tpAmb;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02")
            protected byte procEmi;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String verProc;

            /**
             * Obtém o valor da propriedade indApuracao.
             * 
             */
            public byte getIndApuracao() {
                return indApuracao;
            }

            /**
             * Define o valor da propriedade indApuracao.
             * 
             */
            public void setIndApuracao(byte value) {
                this.indApuracao = value;
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

            /**
             * Obtém o valor da propriedade tpAmb.
             * 
             */
            public byte getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             * 
             */
            public void setTpAmb(byte value) {
                this.tpAmb = value;
            }

            /**
             * Obtém o valor da propriedade procEmi.
             * 
             */
            public byte getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             * 
             */
            public void setProcEmi(byte value) {
                this.procEmi = value;
            }

            /**
             * Obtém o valor da propriedade verProc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
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
         *         &lt;element name="nmResp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cpfResp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="11"/>
         *               &lt;pattern value="\d{11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="telefone">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="8"/>
         *               &lt;maxLength value="13"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="email" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="6"/>
         *               &lt;maxLength value="60"/>
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
            "nmResp",
            "cpfResp",
            "telefone",
            "email"
        })
        public static class IdeRespInf {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String nmResp;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String cpfResp;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String telefone;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02")
            protected String email;

            /**
             * Obtém o valor da propriedade nmResp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmResp() {
                return nmResp;
            }

            /**
             * Define o valor da propriedade nmResp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmResp(String value) {
                this.nmResp = value;
            }

            /**
             * Obtém o valor da propriedade cpfResp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfResp() {
                return cpfResp;
            }

            /**
             * Define o valor da propriedade cpfResp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfResp(String value) {
                this.cpfResp = value;
            }

            /**
             * Obtém o valor da propriedade telefone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelefone() {
                return telefone;
            }

            /**
             * Define o valor da propriedade telefone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelefone(String value) {
                this.telefone = value;
            }

            /**
             * Obtém o valor da propriedade email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
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
         *         &lt;element name="evtRemun">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="evtPgtos">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="evtAqProd">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="1"/>
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="evtComProd">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="1"/>
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="evtContratAvNP">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="1"/>
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="evtInfoComplPer">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="compSemMovto" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="7"/>
         *               &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
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
            "evtRemun",
            "evtPgtos",
            "evtAqProd",
            "evtComProd",
            "evtContratAvNP",
            "evtInfoComplPer",
            "compSemMovto"
        })
        public static class InfoFech {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String evtRemun;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String evtPgtos;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String evtAqProd;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String evtComProd;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String evtContratAvNP;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02", required = true)
            protected String evtInfoComplPer;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtFechaEvPer/v02_04_02")
            protected String compSemMovto;

            /**
             * Obtém o valor da propriedade evtRemun.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvtRemun() {
                return evtRemun;
            }

            /**
             * Define o valor da propriedade evtRemun.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvtRemun(String value) {
                this.evtRemun = value;
            }

            /**
             * Obtém o valor da propriedade evtPgtos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvtPgtos() {
                return evtPgtos;
            }

            /**
             * Define o valor da propriedade evtPgtos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvtPgtos(String value) {
                this.evtPgtos = value;
            }

            /**
             * Obtém o valor da propriedade evtAqProd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvtAqProd() {
                return evtAqProd;
            }

            /**
             * Define o valor da propriedade evtAqProd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvtAqProd(String value) {
                this.evtAqProd = value;
            }

            /**
             * Obtém o valor da propriedade evtComProd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvtComProd() {
                return evtComProd;
            }

            /**
             * Define o valor da propriedade evtComProd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvtComProd(String value) {
                this.evtComProd = value;
            }

            /**
             * Obtém o valor da propriedade evtContratAvNP.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvtContratAvNP() {
                return evtContratAvNP;
            }

            /**
             * Define o valor da propriedade evtContratAvNP.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvtContratAvNP(String value) {
                this.evtContratAvNP = value;
            }

            /**
             * Obtém o valor da propriedade evtInfoComplPer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvtInfoComplPer() {
                return evtInfoComplPer;
            }

            /**
             * Define o valor da propriedade evtInfoComplPer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvtInfoComplPer(String value) {
                this.evtInfoComplPer = value;
            }

            /**
             * Obtém o valor da propriedade compSemMovto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompSemMovto() {
                return compSemMovto;
            }

            /**
             * Define o valor da propriedade compSemMovto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompSemMovto(String value) {
                this.compSemMovto = value;
            }

        }

    }

}
