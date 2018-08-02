//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:10 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.taboperport;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações do Operador Portuário
 * 
 * <p>Classe Java de TDadosOperPortuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosOperPortuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliqRat">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fap">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aliqRatAjust">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="4"/>
 *               &lt;minInclusive value="0"/>
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
@XmlType(name = "TDadosOperPortuario", namespace = "http://www.esocial.gov.br/schema/evt/evtTabOperPort/v02_04_02", propOrder = {
    "aliqRat",
    "fap",
    "aliqRatAjust"
})
public class TDadosOperPortuario {

    @XmlElement(required = true)
    protected BigInteger aliqRat;
    @XmlElement(required = true)
    protected BigDecimal fap;
    @XmlElement(required = true)
    protected BigDecimal aliqRatAjust;

    /**
     * Obtém o valor da propriedade aliqRat.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAliqRat() {
        return aliqRat;
    }

    /**
     * Define o valor da propriedade aliqRat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAliqRat(BigInteger value) {
        this.aliqRat = value;
    }

    /**
     * Obtém o valor da propriedade fap.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFap() {
        return fap;
    }

    /**
     * Define o valor da propriedade fap.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFap(BigDecimal value) {
        this.fap = value;
    }

    /**
     * Obtém o valor da propriedade aliqRatAjust.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliqRatAjust() {
        return aliqRatAjust;
    }

    /**
     * Define o valor da propriedade aliqRatAjust.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliqRatAjust(BigDecimal value) {
        this.aliqRatAjust = value;
    }

}
