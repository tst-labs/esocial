//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tsvinicio;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informações de cessão de trabalhador
 * 
 * <p>Classe Java de TCessaoTrab complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCessaoTrab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categOrig">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="\d{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cnpjCednt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="14"/>
 *               &lt;pattern value="\d{8,14}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="matricCed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtAdmCed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpRegTrab">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpRegPrev">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infOnus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
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
@XmlType(name = "TCessaoTrab", propOrder = {
    "categOrig",
    "cnpjCednt",
    "matricCed",
    "dtAdmCed",
    "tpRegTrab",
    "tpRegPrev",
    "infOnus"
})
public class TCessaoTrab {

    @XmlElement(required = true)
    protected BigInteger categOrig;
    @XmlElement(required = true)
    protected String cnpjCednt;
    @XmlElement(required = true)
    protected String matricCed;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dtAdmCed;
    protected byte tpRegTrab;
    protected byte tpRegPrev;
    protected byte infOnus;

    /**
     * Obtém o valor da propriedade categOrig.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategOrig() {
        return categOrig;
    }

    /**
     * Define o valor da propriedade categOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategOrig(BigInteger value) {
        this.categOrig = value;
    }

    /**
     * Obtém o valor da propriedade cnpjCednt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjCednt() {
        return cnpjCednt;
    }

    /**
     * Define o valor da propriedade cnpjCednt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjCednt(String value) {
        this.cnpjCednt = value;
    }

    /**
     * Obtém o valor da propriedade matricCed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricCed() {
        return matricCed;
    }

    /**
     * Define o valor da propriedade matricCed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricCed(String value) {
        this.matricCed = value;
    }

    /**
     * Obtém o valor da propriedade dtAdmCed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAdmCed() {
        return dtAdmCed;
    }

    /**
     * Define o valor da propriedade dtAdmCed.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAdmCed(XMLGregorianCalendar value) {
        this.dtAdmCed = value;
    }

    /**
     * Obtém o valor da propriedade tpRegTrab.
     * 
     */
    public byte getTpRegTrab() {
        return tpRegTrab;
    }

    /**
     * Define o valor da propriedade tpRegTrab.
     * 
     */
    public void setTpRegTrab(byte value) {
        this.tpRegTrab = value;
    }

    /**
     * Obtém o valor da propriedade tpRegPrev.
     * 
     */
    public byte getTpRegPrev() {
        return tpRegPrev;
    }

    /**
     * Define o valor da propriedade tpRegPrev.
     * 
     */
    public void setTpRegPrev(byte value) {
        this.tpRegPrev = value;
    }

    /**
     * Obtém o valor da propriedade infOnus.
     * 
     */
    public byte getInfOnus() {
        return infOnus;
    }

    /**
     * Define o valor da propriedade infOnus.
     * 
     */
    public void setInfOnus(byte value) {
        this.infOnus = value;
    }

}
