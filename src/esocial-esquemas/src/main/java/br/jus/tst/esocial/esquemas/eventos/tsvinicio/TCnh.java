//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvinicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Cartera Nacional de Habilitação
 * 
 * <p>Classe Java de TCnh complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCnh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrRegCnh">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtExped" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ufCnh">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AC"/>
 *               &lt;enumeration value="AL"/>
 *               &lt;enumeration value="AP"/>
 *               &lt;enumeration value="AM"/>
 *               &lt;enumeration value="BA"/>
 *               &lt;enumeration value="CE"/>
 *               &lt;enumeration value="DF"/>
 *               &lt;enumeration value="ES"/>
 *               &lt;enumeration value="GO"/>
 *               &lt;enumeration value="MA"/>
 *               &lt;enumeration value="MT"/>
 *               &lt;enumeration value="MS"/>
 *               &lt;enumeration value="MG"/>
 *               &lt;enumeration value="PA"/>
 *               &lt;enumeration value="PB"/>
 *               &lt;enumeration value="PR"/>
 *               &lt;enumeration value="PE"/>
 *               &lt;enumeration value="PI"/>
 *               &lt;enumeration value="RJ"/>
 *               &lt;enumeration value="RN"/>
 *               &lt;enumeration value="RS"/>
 *               &lt;enumeration value="RO"/>
 *               &lt;enumeration value="RR"/>
 *               &lt;enumeration value="SC"/>
 *               &lt;enumeration value="SP"/>
 *               &lt;enumeration value="SE"/>
 *               &lt;enumeration value="TO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtValid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtPriHab" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="categoriaCnh">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\w{1,2}"/>
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
@XmlType(name = "TCnh", propOrder = {
    "nrRegCnh",
    "dtExped",
    "ufCnh",
    "dtValid",
    "dtPriHab",
    "categoriaCnh"
})
public class TCnh {

    @XmlElement(required = true)
    protected String nrRegCnh;
    protected XMLGregorianCalendar dtExped;
    @XmlElement(required = true)
    protected String ufCnh;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dtValid;
    protected XMLGregorianCalendar dtPriHab;
    @XmlElement(required = true)
    protected String categoriaCnh;

    /**
     * Obtém o valor da propriedade nrRegCnh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRegCnh() {
        return nrRegCnh;
    }

    /**
     * Define o valor da propriedade nrRegCnh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRegCnh(String value) {
        this.nrRegCnh = value;
    }

    /**
     * Obtém o valor da propriedade dtExped.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtExped() {
        return dtExped;
    }

    /**
     * Define o valor da propriedade dtExped.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtExped(XMLGregorianCalendar value) {
        this.dtExped = value;
    }

    /**
     * Obtém o valor da propriedade ufCnh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfCnh() {
        return ufCnh;
    }

    /**
     * Define o valor da propriedade ufCnh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfCnh(String value) {
        this.ufCnh = value;
    }

    /**
     * Obtém o valor da propriedade dtValid.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtValid() {
        return dtValid;
    }

    /**
     * Define o valor da propriedade dtValid.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtValid(XMLGregorianCalendar value) {
        this.dtValid = value;
    }

    /**
     * Obtém o valor da propriedade dtPriHab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtPriHab() {
        return dtPriHab;
    }

    /**
     * Define o valor da propriedade dtPriHab.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtPriHab(XMLGregorianCalendar value) {
        this.dtPriHab = value;
    }

    /**
     * Obtém o valor da propriedade categoriaCnh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    /**
     * Define o valor da propriedade categoriaCnh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaCnh(String value) {
        this.categoriaCnh = value;
    }

}
