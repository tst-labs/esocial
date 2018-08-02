//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:03 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.pgtos;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Pensao alimentícia
 * 
 * <p>Classe Java de TPensaoAlim complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TPensaoAlim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfBenef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{11}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtNasctoBenef" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmBenefic">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vlrPensao">
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
@XmlType(name = "TPensaoAlim", namespace = "http://www.esocial.gov.br/schema/evt/evtPgtos/v02_04_02", propOrder = {
    "cpfBenef",
    "dtNasctoBenef",
    "nmBenefic",
    "vlrPensao"
})
public class TPensaoAlim {

    @XmlElement(required = true)
    protected String cpfBenef;
    protected XMLGregorianCalendar dtNasctoBenef;
    @XmlElement(required = true)
    protected String nmBenefic;
    @XmlElement(required = true)
    protected BigDecimal vlrPensao;

    /**
     * Obtém o valor da propriedade cpfBenef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfBenef() {
        return cpfBenef;
    }

    /**
     * Define o valor da propriedade cpfBenef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfBenef(String value) {
        this.cpfBenef = value;
    }

    /**
     * Obtém o valor da propriedade dtNasctoBenef.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtNasctoBenef() {
        return dtNasctoBenef;
    }

    /**
     * Define o valor da propriedade dtNasctoBenef.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtNasctoBenef(XMLGregorianCalendar value) {
        this.dtNasctoBenef = value;
    }

    /**
     * Obtém o valor da propriedade nmBenefic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmBenefic() {
        return nmBenefic;
    }

    /**
     * Define o valor da propriedade nmBenefic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmBenefic(String value) {
        this.nmBenefic = value;
    }

    /**
     * Obtém o valor da propriedade vlrPensao.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVlrPensao() {
        return vlrPensao;
    }

    /**
     * Define o valor da propriedade vlrPensao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVlrPensao(BigDecimal value) {
        this.vlrPensao = value;
    }

}
