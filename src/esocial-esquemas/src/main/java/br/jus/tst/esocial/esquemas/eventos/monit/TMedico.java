//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:02 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.monit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TMedico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TMedico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nmMed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="crm" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02}TCrm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMedico", namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", propOrder = {
    "nmMed",
    "crm"
})
public class TMedico {

    @XmlElement(required = true)
    protected String nmMed;
    @XmlElement(required = true)
    protected TCrm crm;

    /**
     * Obtém o valor da propriedade nmMed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmMed() {
        return nmMed;
    }

    /**
     * Define o valor da propriedade nmMed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmMed(String value) {
        this.nmMed = value;
    }

    /**
     * Obtém o valor da propriedade crm.
     * 
     * @return
     *     possible object is
     *     {@link TCrm }
     *     
     */
    public TCrm getCrm() {
        return crm;
    }

    /**
     * Define o valor da propriedade crm.
     * 
     * @param value
     *     allowed object is
     *     {@link TCrm }
     *     
     */
    public void setCrm(TCrm value) {
        this.crm = value;
    }

}
