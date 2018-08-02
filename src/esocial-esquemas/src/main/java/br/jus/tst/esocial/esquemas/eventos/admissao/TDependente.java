//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:49 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de TDependente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDependente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpDep">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmDep">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtNascto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cpfDep" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{11}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depIRRF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depSF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="incTrab">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
@XmlType(name = "TDependente", propOrder = {
    "tpDep",
    "nmDep",
    "dtNascto",
    "cpfDep",
    "depIRRF",
    "depSF",
    "incTrab"
})
public class TDependente {

    @XmlElement(required = true)
    protected String tpDep;
    @XmlElement(required = true)
    protected String nmDep;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dtNascto;
    protected String cpfDep;
    @XmlElement(required = true)
    protected String depIRRF;
    @XmlElement(required = true)
    protected String depSF;
    @XmlElement(required = true)
    protected String incTrab;

    /**
     * Obtém o valor da propriedade tpDep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpDep() {
        return tpDep;
    }

    /**
     * Define o valor da propriedade tpDep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpDep(String value) {
        this.tpDep = value;
    }

    /**
     * Obtém o valor da propriedade nmDep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmDep() {
        return nmDep;
    }

    /**
     * Define o valor da propriedade nmDep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmDep(String value) {
        this.nmDep = value;
    }

    /**
     * Obtém o valor da propriedade dtNascto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtNascto() {
        return dtNascto;
    }

    /**
     * Define o valor da propriedade dtNascto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtNascto(XMLGregorianCalendar value) {
        this.dtNascto = value;
    }

    /**
     * Obtém o valor da propriedade cpfDep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfDep() {
        return cpfDep;
    }

    /**
     * Define o valor da propriedade cpfDep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfDep(String value) {
        this.cpfDep = value;
    }

    /**
     * Obtém o valor da propriedade depIRRF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepIRRF() {
        return depIRRF;
    }

    /**
     * Define o valor da propriedade depIRRF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepIRRF(String value) {
        this.depIRRF = value;
    }

    /**
     * Obtém o valor da propriedade depSF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepSF() {
        return depSF;
    }

    /**
     * Define o valor da propriedade depSF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepSF(String value) {
        this.depSF = value;
    }

    /**
     * Obtém o valor da propriedade incTrab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncTrab() {
        return incTrab;
    }

    /**
     * Define o valor da propriedade incTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncTrab(String value) {
        this.incTrab = value;
    }

}
