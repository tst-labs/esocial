//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:22 PM BRT 
//


package br.jus.esocialjt.comunicacao.eventos.consulta.identificadores.eventos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Define o filtro para consulta aos eventos de tabela.
 * 
 * <p>Classe Java de TConsultaEventosTabela complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConsultaEventosTabela">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpEvt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="chEvt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtIni" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtFim" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
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
@XmlType(name = "TConsultaEventosTabela", namespace = "http://www.esocial.gov.br/schema/consulta/identificadores-eventos/tabela/v1_0_0", propOrder = {
    "tpEvt",
    "chEvt",
    "dtIni",
    "dtFim"
})
public class TConsultaEventosTabela {

    @XmlElement(required = true)
    protected String tpEvt;
    protected String chEvt;
    protected XMLGregorianCalendar dtIni;
    protected XMLGregorianCalendar dtFim;

    /**
     * Obtém o valor da propriedade tpEvt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpEvt() {
        return tpEvt;
    }

    /**
     * Define o valor da propriedade tpEvt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpEvt(String value) {
        this.tpEvt = value;
    }

    /**
     * Obtém o valor da propriedade chEvt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChEvt() {
        return chEvt;
    }

    /**
     * Define o valor da propriedade chEvt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChEvt(String value) {
        this.chEvt = value;
    }

    /**
     * Obtém o valor da propriedade dtIni.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtIni() {
        return dtIni;
    }

    /**
     * Define o valor da propriedade dtIni.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtIni(XMLGregorianCalendar value) {
        this.dtIni = value;
    }

    /**
     * Obtém o valor da propriedade dtFim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFim() {
        return dtFim;
    }

    /**
     * Define o valor da propriedade dtFim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFim(XMLGregorianCalendar value) {
        this.dtFim = value;
    }

}
