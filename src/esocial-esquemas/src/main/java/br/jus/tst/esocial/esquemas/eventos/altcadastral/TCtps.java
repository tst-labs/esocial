//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Carteira de Trabalho e Previdência Social
 * 
 * <p>Classe Java de TCtps complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCtps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrCtps">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serieCtps">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ufCtps">
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
@XmlType(name = "TCtps", propOrder = {
    "nrCtps",
    "serieCtps",
    "ufCtps"
})
public class TCtps {

    @XmlElement(required = true)
    protected String nrCtps;
    @XmlElement(required = true)
    protected String serieCtps;
    @XmlElement(required = true)
    protected String ufCtps;

    /**
     * Obtém o valor da propriedade nrCtps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCtps() {
        return nrCtps;
    }

    /**
     * Define o valor da propriedade nrCtps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCtps(String value) {
        this.nrCtps = value;
    }

    /**
     * Obtém o valor da propriedade serieCtps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieCtps() {
        return serieCtps;
    }

    /**
     * Define o valor da propriedade serieCtps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieCtps(String value) {
        this.serieCtps = value;
    }

    /**
     * Obtém o valor da propriedade ufCtps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfCtps() {
        return ufCtps;
    }

    /**
     * Define o valor da propriedade ufCtps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfCtps(String value) {
        this.ufCtps = value;
    }

}
