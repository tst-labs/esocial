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
 * Informações do Trabalhador Estrangeiro
 * 
 * <p>Classe Java de TTrabEstrang complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TTrabEstrang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtChegada" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="classTrabEstrang">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d{1,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="casadoBr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="filhosBr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;pattern value="[N|S]"/>
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
@XmlType(name = "TTrabEstrang", propOrder = {
    "dtChegada",
    "classTrabEstrang",
    "casadoBr",
    "filhosBr"
})
public class TTrabEstrang {

    protected XMLGregorianCalendar dtChegada;
    protected byte classTrabEstrang;
    @XmlElement(required = true)
    protected String casadoBr;
    @XmlElement(required = true)
    protected String filhosBr;

    /**
     * Obtém o valor da propriedade dtChegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtChegada() {
        return dtChegada;
    }

    /**
     * Define o valor da propriedade dtChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtChegada(XMLGregorianCalendar value) {
        this.dtChegada = value;
    }

    /**
     * Obtém o valor da propriedade classTrabEstrang.
     * 
     */
    public byte getClassTrabEstrang() {
        return classTrabEstrang;
    }

    /**
     * Define o valor da propriedade classTrabEstrang.
     * 
     */
    public void setClassTrabEstrang(byte value) {
        this.classTrabEstrang = value;
    }

    /**
     * Obtém o valor da propriedade casadoBr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasadoBr() {
        return casadoBr;
    }

    /**
     * Define o valor da propriedade casadoBr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasadoBr(String value) {
        this.casadoBr = value;
    }

    /**
     * Obtém o valor da propriedade filhosBr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilhosBr() {
        return filhosBr;
    }

    /**
     * Define o valor da propriedade filhosBr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilhosBr(String value) {
        this.filhosBr = value;
    }

}
