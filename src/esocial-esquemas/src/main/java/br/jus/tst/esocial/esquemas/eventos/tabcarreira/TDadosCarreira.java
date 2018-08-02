//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:07 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabcarreira;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informações da Carreira
 * 
 * <p>Classe Java de TDadosCarreira complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosCarreira">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dscCarreira">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="leiCarr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtLeiCarr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sitCarr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
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
@XmlType(name = "TDadosCarreira", namespace = "http://www.esocial.gov.br/schema/evt/evtTabCarreira/v02_04_02", propOrder = {
    "dscCarreira",
    "leiCarr",
    "dtLeiCarr",
    "sitCarr"
})
public class TDadosCarreira {

    @XmlElement(required = true)
    protected String dscCarreira;
    protected String leiCarr;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dtLeiCarr;
    protected byte sitCarr;

    /**
     * Obtém o valor da propriedade dscCarreira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscCarreira() {
        return dscCarreira;
    }

    /**
     * Define o valor da propriedade dscCarreira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscCarreira(String value) {
        this.dscCarreira = value;
    }

    /**
     * Obtém o valor da propriedade leiCarr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeiCarr() {
        return leiCarr;
    }

    /**
     * Define o valor da propriedade leiCarr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeiCarr(String value) {
        this.leiCarr = value;
    }

    /**
     * Obtém o valor da propriedade dtLeiCarr.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtLeiCarr() {
        return dtLeiCarr;
    }

    /**
     * Define o valor da propriedade dtLeiCarr.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtLeiCarr(XMLGregorianCalendar value) {
        this.dtLeiCarr = value;
    }

    /**
     * Obtém o valor da propriedade sitCarr.
     * 
     */
    public byte getSitCarr() {
        return sitCarr;
    }

    /**
     * Define o valor da propriedade sitCarr.
     * 
     */
    public void setSitCarr(byte value) {
        this.sitCarr = value;
    }

}
