//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:54 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenprrp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações do Endereço no Exterior
 * 
 * <p>Classe Java de TEnderecoExterior complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TEnderecoExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paisResid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dscLograd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrLograd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="complemento" minOccurs="0">
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
@XmlType(name = "TEnderecoExterior", namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", propOrder = {
    "paisResid",
    "dscLograd",
    "nrLograd",
    "complemento",
    "bairro",
    "nmCid",
    "codPostal"
})
public class TEnderecoExterior {

    @XmlElement(required = true)
    protected String paisResid;
    @XmlElement(required = true)
    protected String dscLograd;
    @XmlElement(required = true)
    protected String nrLograd;
    protected String complemento;
    protected String bairro;
    @XmlElement(required = true)
    protected String nmCid;
    protected String codPostal;

    /**
     * Obtém o valor da propriedade paisResid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisResid() {
        return paisResid;
    }

    /**
     * Define o valor da propriedade paisResid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisResid(String value) {
        this.paisResid = value;
    }

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
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
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
