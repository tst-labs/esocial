//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações de Contato
 * 
 * <p>Classe Java de TContato complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TContato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fonePrinc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="foneAlternat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emailPrinc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="6"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="emailAlternat" minOccurs="0">
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
@XmlType(name = "TContato", propOrder = {
    "fonePrinc",
    "foneAlternat",
    "emailPrinc",
    "emailAlternat"
})
public class TContato {

    protected String fonePrinc;
    protected String foneAlternat;
    protected String emailPrinc;
    protected String emailAlternat;

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
     * Obtém o valor da propriedade foneAlternat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoneAlternat() {
        return foneAlternat;
    }

    /**
     * Define o valor da propriedade foneAlternat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoneAlternat(String value) {
        this.foneAlternat = value;
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

    /**
     * Obtém o valor da propriedade emailAlternat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAlternat() {
        return emailAlternat;
    }

    /**
     * Define o valor da propriedade emailAlternat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAlternat(String value) {
        this.emailAlternat = value;
    }

}
