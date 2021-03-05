//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:02 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenefin;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_remuneracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_remuneracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_vrSalFx"/>
 *         &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_undSalFixo"/>
 *         &lt;element name="dscSalVar" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_texto_999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_remuneracao", propOrder = {
    "vrSalFx",
    "undSalFixo",
    "dscSalVar"
})
public class TRemuneracao {

    @XmlElement(required = true)
    protected BigDecimal vrSalFx;
    protected byte undSalFixo;
    protected String dscSalVar;

    /**
     * Obtém o valor da propriedade vrSalFx.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrSalFx() {
        return vrSalFx;
    }

    /**
     * Define o valor da propriedade vrSalFx.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrSalFx(BigDecimal value) {
        this.vrSalFx = value;
    }

    /**
     * Obtém o valor da propriedade undSalFixo.
     * 
     */
    public byte getUndSalFixo() {
        return undSalFixo;
    }

    /**
     * Define o valor da propriedade undSalFixo.
     * 
     */
    public void setUndSalFixo(byte value) {
        this.undSalFixo = value;
    }

    /**
     * Obtém o valor da propriedade dscSalVar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscSalVar() {
        return dscSalVar;
    }

    /**
     * Define o valor da propriedade dscSalVar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscSalVar(String value) {
        this.dscSalVar = value;
    }

}
