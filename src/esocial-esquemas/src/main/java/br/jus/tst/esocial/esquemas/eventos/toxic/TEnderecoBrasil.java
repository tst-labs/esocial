//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.10.11 at 04:27:58 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.toxic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se não informado o grupo {exterior}(../exterior)); N (nos demais casos)
 * 
 * <p>Java class for T_endereco_brasil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_endereco_brasil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpLograd" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_tpLograd" minOccurs="0"/>
 *         &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_dscLograd"/>
 *         &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_nrLograd"/>
 *         &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_complemento" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_bairro" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_cep"/>
 *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_codMunic"/>
 *         &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v_S_01_03_00}TS_uf"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_endereco_brasil", propOrder = {
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
    @XmlSchemaType(name = "string")
    protected TSUf uf;

    /**
     * Gets the value of the tpLograd property.
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
     * Sets the value of the tpLograd property.
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
     * Gets the value of the dscLograd property.
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
     * Sets the value of the dscLograd property.
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
     * Gets the value of the nrLograd property.
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
     * Sets the value of the nrLograd property.
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
     * Gets the value of the complemento property.
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
     * Sets the value of the complemento property.
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
     * Gets the value of the bairro property.
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
     * Sets the value of the bairro property.
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
     * Gets the value of the cep property.
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
     * Sets the value of the cep property.
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
     * Gets the value of the codMunic property.
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
     * Sets the value of the codMunic property.
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
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link TSUf }
     *     
     */
    public TSUf getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSUf }
     *     
     */
    public void setUf(TSUf value) {
        this.uf = value;
    }

}