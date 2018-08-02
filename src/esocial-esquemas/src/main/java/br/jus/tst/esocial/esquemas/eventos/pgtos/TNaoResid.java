//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:03 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.pgtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Endereço no Exterior - Fiscal
 * 
 * <p>Classe Java de TNaoResid complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TNaoResid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idePais">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codPais">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="indNIF">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nifBenef" minOccurs="0">
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
 *         &lt;element name="endExt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dscLograd">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrLograd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="complem" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="bairro" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nmCid">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codPostal" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="4"/>
 *                         &lt;maxLength value="12"/>
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
@XmlType(name = "TNaoResid", namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02", propOrder = {
    "idePais",
    "endExt"
})
public class TNaoResid {

    @XmlElement(required = true)
    protected TNaoResid.IdePais idePais;
    @XmlElement(required = true)
    protected TNaoResid.EndExt endExt;

    /**
     * Obtém o valor da propriedade idePais.
     * 
     * @return
     *     possible object is
     *     {@link TNaoResid.IdePais }
     *     
     */
    public TNaoResid.IdePais getIdePais() {
        return idePais;
    }

    /**
     * Define o valor da propriedade idePais.
     * 
     * @param value
     *     allowed object is
     *     {@link TNaoResid.IdePais }
     *     
     */
    public void setIdePais(TNaoResid.IdePais value) {
        this.idePais = value;
    }

    /**
     * Obtém o valor da propriedade endExt.
     * 
     * @return
     *     possible object is
     *     {@link TNaoResid.EndExt }
     *     
     */
    public TNaoResid.EndExt getEndExt() {
        return endExt;
    }

    /**
     * Define o valor da propriedade endExt.
     * 
     * @param value
     *     allowed object is
     *     {@link TNaoResid.EndExt }
     *     
     */
    public void setEndExt(TNaoResid.EndExt value) {
        this.endExt = value;
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
     *         &lt;element name="dscLograd">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="80"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrLograd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="complem" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="bairro" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nmCid">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codPostal" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="4"/>
     *               &lt;maxLength value="12"/>
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
        "dscLograd",
        "nrLograd",
        "complem",
        "bairro",
        "nmCid",
        "codPostal"
    })
    public static class EndExt {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02", required = true)
        protected String dscLograd;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02")
        protected String nrLograd;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02")
        protected String complem;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02")
        protected String bairro;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02", required = true)
        protected String nmCid;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02")
        protected String codPostal;

        /**
         * Obtém o valor da propriedade dscLograd.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDscLograd() {
            return dscLograd;
        }

        /**
         * Define o valor da propriedade dscLograd.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDscLograd(String value) {
            this.dscLograd = value;
        }

        /**
         * Obtém o valor da propriedade nrLograd.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrLograd() {
            return nrLograd;
        }

        /**
         * Define o valor da propriedade nrLograd.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrLograd(String value) {
            this.nrLograd = value;
        }

        /**
         * Obtém o valor da propriedade complem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComplem() {
            return complem;
        }

        /**
         * Define o valor da propriedade complem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComplem(String value) {
            this.complem = value;
        }

        /**
         * Obtém o valor da propriedade bairro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBairro() {
            return bairro;
        }

        /**
         * Define o valor da propriedade bairro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBairro(String value) {
            this.bairro = value;
        }

        /**
         * Obtém o valor da propriedade nmCid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmCid() {
            return nmCid;
        }

        /**
         * Define o valor da propriedade nmCid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmCid(String value) {
            this.nmCid = value;
        }

        /**
         * Obtém o valor da propriedade codPostal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodPostal() {
            return codPostal;
        }

        /**
         * Define o valor da propriedade codPostal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodPostal(String value) {
            this.codPostal = value;
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
     *         &lt;element name="codPais">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="indNIF">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nifBenef" minOccurs="0">
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
        "codPais",
        "indNIF",
        "nifBenef"
    })
    public static class IdePais {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02", required = true)
        protected String codPais;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02")
        protected byte indNIF;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02")
        protected String nifBenef;

        /**
         * Obtém o valor da propriedade codPais.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodPais() {
            return codPais;
        }

        /**
         * Define o valor da propriedade codPais.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodPais(String value) {
            this.codPais = value;
        }

        /**
         * Obtém o valor da propriedade indNIF.
         * 
         */
        public byte getIndNIF() {
            return indNIF;
        }

        /**
         * Define o valor da propriedade indNIF.
         * 
         */
        public void setIndNIF(byte value) {
            this.indNIF = value;
        }

        /**
         * Obtém o valor da propriedade nifBenef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNifBenef() {
            return nifBenef;
        }

        /**
         * Define o valor da propriedade nifBenef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNifBenef(String value) {
            this.nifBenef = value;
        }

    }

}
