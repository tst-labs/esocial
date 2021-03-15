//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admprelim;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se não informado o grupo {exterior}(../exterior)); N (nos demais casos)
 * 
 * <p>Classe Java de T_endereco_brasil complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_endereco_brasil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpLograd" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_tpLograd" minOccurs="0"/>
 *         &lt;element name="dscLograd" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_dscLograd"/>
 *         &lt;element name="nrLograd" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_nrLograd"/>
 *         &lt;element name="complemento" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_complemento" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_bairro" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cep"/>
 *         &lt;element name="codMunic" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_codMunic"/>
 *         &lt;element name="uf" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_uf"/>
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
     *     {@link TSUf }
     *     
     */
    public TSUf getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
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
