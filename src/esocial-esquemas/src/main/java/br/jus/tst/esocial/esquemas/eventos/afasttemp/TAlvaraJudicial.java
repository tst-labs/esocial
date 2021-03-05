//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:51 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.afasttemp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_alvaraJudicial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_alvaraJudicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_nrProcJud"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_alvaraJudicial", propOrder = {
    "nrProcJud"
})
public class TAlvaraJudicial {

    @XmlElement(required = true)
    protected String nrProcJud;

    /**
     * Obtém o valor da propriedade nrProcJud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProcJud() {
        return nrProcJud;
    }

    /**
     * Define o valor da propriedade nrProcJud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProcJud(String value) {
        this.nrProcJud = value;
    }

}
