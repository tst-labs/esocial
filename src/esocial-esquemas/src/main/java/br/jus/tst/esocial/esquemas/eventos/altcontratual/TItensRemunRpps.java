//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:53 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcontratual;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DESCRICAO_COMPLETA:Rubricas que compõem a remuneração do trabalhador.
 * 
 * <p>Classe Java de T_itensRemun_rpps complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_itensRemun_rpps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_codigo_esocial"/>
 *         &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_ideTabRubr"/>
 *         &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_qtdRubr" minOccurs="0"/>
 *         &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_fator" minOccurs="0"/>
 *         &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_vrRubr"/>
 *         &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtAltContratual/v_S_01_00_00}TS_indApurIR"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_itensRemun_rpps", propOrder = {
    "codRubr",
    "ideTabRubr",
    "qtdRubr",
    "fatorRubr",
    "vrRubr",
    "indApurIR"
})
public class TItensRemunRpps {

    @XmlElement(required = true)
    protected String codRubr;
    @XmlElement(required = true)
    protected String ideTabRubr;
    protected BigDecimal qtdRubr;
    protected BigDecimal fatorRubr;
    @XmlElement(required = true)
    protected BigDecimal vrRubr;
    protected byte indApurIR;

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

    /**
     * Obtém o valor da propriedade indApurIR.
     * 
     */
    public byte getIndApurIR() {
        return indApurIR;
    }

    /**
     * Define o valor da propriedade indApurIR.
     * 
     */
    public void setIndApurIR(byte value) {
        this.indApurIR = value;
    }

}
