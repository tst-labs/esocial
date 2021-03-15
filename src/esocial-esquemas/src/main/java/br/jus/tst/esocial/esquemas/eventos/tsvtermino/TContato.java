//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:31 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvtermino;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_contato complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade fonePrinc.
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
     * Define o valor da propriedade fonePrinc.
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
     * Obtém o valor da propriedade emailPrinc.
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
     * Define o valor da propriedade emailPrinc.
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
