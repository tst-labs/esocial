//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.03 at 06:57:24 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_contato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_contato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fonePrinc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="13"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emailPrinc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="6"/>
 *               &lt;maxLength value="60"/>
 *               &lt;pattern value=".*[^\s].*"/>
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
@XmlType(name = "T_contato", propOrder = {
    "fonePrinc",
    "emailPrinc"
})
public class TContato {

    protected String fonePrinc;
    protected String emailPrinc;

    /**
     * Gets the value of the fonePrinc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonePrinc() {
        return fonePrinc;
    }

    /**
     * Sets the value of the fonePrinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonePrinc(String value) {
        this.fonePrinc = value;
    }

    /**
     * Gets the value of the emailPrinc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPrinc() {
        return emailPrinc;
    }

    /**
     * Sets the value of the emailPrinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPrinc(String value) {
        this.emailPrinc = value;
    }

}
