//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:49 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admissao;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Remuneração e periodicidade de pagamento
 * 
 * <p>Classe Java de TRemun complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRemun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vrSalFx">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="undSalFixo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dscSalVar" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="255"/>
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
@XmlType(name = "TRemun", propOrder = {
    "vrSalFx",
    "undSalFixo",
    "dscSalVar"
})
public class TRemun {

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
