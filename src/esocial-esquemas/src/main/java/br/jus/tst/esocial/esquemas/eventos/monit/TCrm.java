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
 * Informações da Inscrição no CRM
 * 
 * <p>Classe Java de TCrm complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCrm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrCRM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ufCRM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AC"/>
 *               &lt;enumeration value="AL"/>
 *               &lt;enumeration value="AP"/>
 *               &lt;enumeration value="AM"/>
 *               &lt;enumeration value="BA"/>
 *               &lt;enumeration value="CE"/>
 *               &lt;enumeration value="DF"/>
 *               &lt;enumeration value="ES"/>
 *               &lt;enumeration value="GO"/>
 *               &lt;enumeration value="MA"/>
 *               &lt;enumeration value="MT"/>
 *               &lt;enumeration value="MS"/>
 *               &lt;enumeration value="MG"/>
 *               &lt;enumeration value="PA"/>
 *               &lt;enumeration value="PB"/>
 *               &lt;enumeration value="PR"/>
 *               &lt;enumeration value="PE"/>
 *               &lt;enumeration value="PI"/>
 *               &lt;enumeration value="RJ"/>
 *               &lt;enumeration value="RN"/>
 *               &lt;enumeration value="RS"/>
 *               &lt;enumeration value="RO"/>
 *               &lt;enumeration value="RR"/>
 *               &lt;enumeration value="SC"/>
 *               &lt;enumeration value="SP"/>
 *               &lt;enumeration value="SE"/>
 *               &lt;enumeration value="TO"/>
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
@XmlType(name = "TCrm", namespace = "http://www.esocial.gov.br/schema/evt/evtMonit/v02_04_02", propOrder = {
    "nrCRM",
    "ufCRM"
})
public class TCrm {

    @XmlElement(required = true)
    protected String nrCRM;
    @XmlElement(required = true)
    protected String ufCRM;

    /**
     * Obtém o valor da propriedade nrCRM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCRM() {
        return nrCRM;
    }

    /**
     * Define o valor da propriedade nrCRM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCRM(String value) {
        this.nrCRM = value;
    }

    /**
     * Obtém o valor da propriedade ufCRM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfCRM() {
        return ufCRM;
    }

    /**
     * Define o valor da propriedade ufCRM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfCRM(String value) {
        this.ufCRM = value;
    }

}
