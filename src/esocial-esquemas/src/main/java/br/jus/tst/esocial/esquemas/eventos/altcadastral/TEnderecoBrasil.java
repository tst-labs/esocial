//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações do Endereço no Brasil
 * 
 * <p>Classe Java de TEnderecoBrasil complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TEnderecoBrasil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpLograd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="4"/>
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
 *         &lt;element name="cep">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codMunic">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="uf">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEnderecoBrasil", propOrder = {
    "tpLograd",
    "dscLograd",
    "nrLograd",
    "complemento",
    "bairro",
    "cep",
    "codMunic",
    "uf"
})
public class TEnderecoBrasil {

    @XmlElement(required = true)
    protected String tpLograd;
    @XmlElement(required = true)
    protected String dscLograd;
    @XmlElement(required = true)
    protected String nrLograd;
    protected String complemento;
    protected String bairro;
    @XmlElement(required = true)
    protected String cep;
    @XmlElement(required = true)
    protected BigInteger codMunic;
    @XmlElement(required = true)
    protected String uf;

    /**
     * Obtém o valor da propriedade tpLograd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpLograd() {
        return tpLograd;
    }

    /**
     * Define o valor da propriedade tpLograd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpLograd(String value) {
        this.tpLograd = value;
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
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade codMunic.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodMunic() {
        return codMunic;
    }

    /**
     * Define o valor da propriedade codMunic.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodMunic(BigInteger value) {
        this.codMunic = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

}
