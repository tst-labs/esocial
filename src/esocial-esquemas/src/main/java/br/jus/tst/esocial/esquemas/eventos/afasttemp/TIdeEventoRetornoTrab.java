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
 * Identificação do evento de retorno.
 * 
 * <p>Classe Java de T_ideEvento_retorno_trab complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEvento_retorno_trab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_nrRecibo"/>
 *         &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_indApuracao"/>
 *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtAfastTemp/v_S_01_00_00}TS_perApur"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEvento_retorno_trab", propOrder = {
    "nrRecArqBase",
    "indApuracao",
    "perApur"
})
public class TIdeEventoRetornoTrab {

    @XmlElement(required = true)
    protected String nrRecArqBase;
    protected byte indApuracao;
    @XmlElement(required = true)
    protected String perApur;

    /**
     * Obtém o valor da propriedade nrRecArqBase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRecArqBase() {
        return nrRecArqBase;
    }

    /**
     * Define o valor da propriedade nrRecArqBase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRecArqBase(String value) {
        this.nrRecArqBase = value;
    }

    /**
     * Obtém o valor da propriedade indApuracao.
     * 
     */
    public byte getIndApuracao() {
        return indApuracao;
    }

    /**
     * Define o valor da propriedade indApuracao.
     * 
     */
    public void setIndApuracao(byte value) {
        this.indApuracao = value;
    }

    /**
     * Obtém o valor da propriedade perApur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerApur() {
        return perApur;
    }

    /**
     * Define o valor da propriedade perApur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerApur(String value) {
        this.perApur = value;
    }

}
