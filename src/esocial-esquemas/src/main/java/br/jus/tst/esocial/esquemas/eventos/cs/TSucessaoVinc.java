//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:08 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de T_sucessaoVinc complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_sucessaoVinc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_tpInsc_1_2"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_nrInsc_11_14"/>
 *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtCS/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_sucessaoVinc", propOrder = {
    "tpInsc",
    "nrInsc",
    "matricAnt",
    "dtAdm"
})
public class TSucessaoVinc {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    protected String matricAnt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtAdm;

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Obtém o valor da propriedade nrInsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Define o valor da propriedade nrInsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

    /**
     * Obtém o valor da propriedade matricAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricAnt() {
        return matricAnt;
    }

    /**
     * Define o valor da propriedade matricAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricAnt(String value) {
        this.matricAnt = value;
    }

    /**
     * Obtém o valor da propriedade dtAdm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAdm() {
        return dtAdm;
    }

    /**
     * Define o valor da propriedade dtAdm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAdm(XMLGregorianCalendar value) {
        this.dtAdm = value;
    }

}
