//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:28 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabrubrica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {codRubr}, {ideTabRubr}, {iniValid}, {fimValid}
 * 
 * <p>Classe Java de T_ideRubrica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideRubrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_codigo_esocial"/>
 *         &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_ideTabRubr"/>
 *         &lt;element name="iniValid" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_iniValid"/>
 *         &lt;element name="fimValid" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_fimValid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideRubrica", propOrder = {
    "codRubr",
    "ideTabRubr",
    "iniValid",
    "fimValid"
})
public class TIdeRubrica {

    @XmlElement(required = true)
    protected String codRubr;
    @XmlElement(required = true)
    protected String ideTabRubr;
    @XmlElement(required = true)
    protected String iniValid;
    protected String fimValid;

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
     * Obtém o valor da propriedade iniValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniValid() {
        return iniValid;
    }

    /**
     * Define o valor da propriedade iniValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniValid(String value) {
        this.iniValid = value;
    }

    /**
     * Obtém o valor da propriedade fimValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFimValid() {
        return fimValid;
    }

    /**
     * Define o valor da propriedade fimValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFimValid(String value) {
        this.fimValid = value;
    }

}
