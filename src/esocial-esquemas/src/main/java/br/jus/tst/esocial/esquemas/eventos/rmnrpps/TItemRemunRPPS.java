//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:05 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.rmnrpps;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações dos itens (rubricas) da remuneração
 * 
 * <p>Classe Java de TItemRemunRPPS complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TItemRemunRPPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRubr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ideTabRubr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="qtdRubr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fatorRubr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vrUnit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vrRubr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "TItemRemunRPPS", namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", propOrder = {
    "codRubr",
    "ideTabRubr",
    "qtdRubr",
    "fatorRubr",
    "vrUnit",
    "vrRubr"
})
public class TItemRemunRPPS {

    @XmlElement(required = true)
    protected String codRubr;
    @XmlElement(required = true)
    protected String ideTabRubr;
    protected BigDecimal qtdRubr;
    protected BigDecimal fatorRubr;
    protected BigDecimal vrUnit;
    @XmlElement(required = true)
    protected BigDecimal vrRubr;

    /**
     * Obtém o valor da propriedade codRubr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRubr() {
        return codRubr;
    }

    /**
     * Define o valor da propriedade codRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRubr(String value) {
        this.codRubr = value;
    }

    /**
     * Obtém o valor da propriedade ideTabRubr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeTabRubr() {
        return ideTabRubr;
    }

    /**
     * Define o valor da propriedade ideTabRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeTabRubr(String value) {
        this.ideTabRubr = value;
    }

    /**
     * Obtém o valor da propriedade qtdRubr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdRubr() {
        return qtdRubr;
    }

    /**
     * Define o valor da propriedade qtdRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdRubr(BigDecimal value) {
        this.qtdRubr = value;
    }

    /**
     * Obtém o valor da propriedade fatorRubr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFatorRubr() {
        return fatorRubr;
    }

    /**
     * Define o valor da propriedade fatorRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFatorRubr(BigDecimal value) {
        this.fatorRubr = value;
    }

    /**
     * Obtém o valor da propriedade vrUnit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrUnit() {
        return vrUnit;
    }

    /**
     * Define o valor da propriedade vrUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrUnit(BigDecimal value) {
        this.vrUnit = value;
    }

    /**
     * Obtém o valor da propriedade vrRubr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrRubr() {
        return vrRubr;
    }

    /**
     * Define o valor da propriedade vrRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrRubr(BigDecimal value) {
        this.vrRubr = value;
    }

}
