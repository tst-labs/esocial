//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.03 at 06:57:25 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenalt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {perApur*}, {indGuia*}
 * 
 * <p>Java class for T_ideEvento_folha_mensal_PF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_ideEvento_folha_mensal_PF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indRetif" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_03_00}TS_indRetif"/>
 *         &lt;element name="nrRecibo" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_03_00}TS_nrRecibo" minOccurs="0"/>
 *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_03_00}TS_perApur_mensal"/>
 *         &lt;element name="indGuia" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_03_00}TS_indGuia" minOccurs="0"/>
 *         &lt;element name="tpAmb" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_03_00}TS_tpAmb"/>
 *         &lt;element name="procEmi" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_03_00}TS_procEmi_PF"/>
 *         &lt;element name="verProc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenAlt/v_S_01_03_00}TS_verProc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEvento_folha_mensal_PF", propOrder = {
    "indRetif",
    "nrRecibo",
    "perApur",
    "indGuia",
    "tpAmb",
    "procEmi",
    "verProc"
})
public class TIdeEventoFolhaMensalPF {

    protected byte indRetif;
    protected String nrRecibo;
    @XmlElement(required = true)
    protected String perApur;
    protected Byte indGuia;
    protected byte tpAmb;
    protected byte procEmi;
    @XmlElement(required = true)
    protected String verProc;

    /**
     * Gets the value of the indRetif property.
     * 
     */
    public byte getIndRetif() {
        return indRetif;
    }

    /**
     * Sets the value of the indRetif property.
     * 
     */
    public void setIndRetif(byte value) {
        this.indRetif = value;
    }

    /**
     * Gets the value of the nrRecibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRecibo() {
        return nrRecibo;
    }

    /**
     * Sets the value of the nrRecibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRecibo(String value) {
        this.nrRecibo = value;
    }

    /**
     * Gets the value of the perApur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerApur() {
        return perApur;
    }

    /**
     * Sets the value of the perApur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerApur(String value) {
        this.perApur = value;
    }

    /**
     * Gets the value of the indGuia property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndGuia() {
        return indGuia;
    }

    /**
     * Sets the value of the indGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndGuia(Byte value) {
        this.indGuia = value;
    }

    /**
     * Gets the value of the tpAmb property.
     * 
     */
    public byte getTpAmb() {
        return tpAmb;
    }

    /**
     * Sets the value of the tpAmb property.
     * 
     */
    public void setTpAmb(byte value) {
        this.tpAmb = value;
    }

    /**
     * Gets the value of the procEmi property.
     * 
     */
    public byte getProcEmi() {
        return procEmi;
    }

    /**
     * Sets the value of the procEmi property.
     * 
     */
    public void setProcEmi(byte value) {
        this.procEmi = value;
    }

    /**
     * Gets the value of the verProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerProc() {
        return verProc;
    }

    /**
     * Sets the value of the verProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerProc(String value) {
        this.verProc = value;
    }

}
