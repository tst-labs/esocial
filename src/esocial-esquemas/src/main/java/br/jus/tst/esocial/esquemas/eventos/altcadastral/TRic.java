//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Registro de Identificação Civil
 * 
 * <p>Classe Java de TRic complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrRic">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orgaoEmissor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtExped" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
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
@XmlType(name = "TRic", propOrder = {
    "nrRic",
    "orgaoEmissor",
    "dtExped"
})
public class TRic {

    @XmlElement(required = true)
    protected String nrRic;
    @XmlElement(required = true)
    protected String orgaoEmissor;
    protected XMLGregorianCalendar dtExped;

    /**
     * Obtém o valor da propriedade nrRic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRic() {
        return nrRic;
    }

    /**
     * Define o valor da propriedade nrRic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRic(String value) {
        this.nrRic = value;
    }

    /**
     * Obtém o valor da propriedade orgaoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * Define o valor da propriedade orgaoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgaoEmissor(String value) {
        this.orgaoEmissor = value;
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

}
