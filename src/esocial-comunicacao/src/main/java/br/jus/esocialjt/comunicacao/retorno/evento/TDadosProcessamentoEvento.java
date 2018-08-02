//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:11:46 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.evento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Define os dados de processamento dos eventos
 * 
 * <p>Classe Java de TDadosProcessamentoEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosProcessamentoEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdResposta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descResposta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2048"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="versaoAppProcessamento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhProcessamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ocorrencias" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TOcorrencias" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDadosProcessamentoEvento", namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", propOrder = {
    "cdResposta",
    "descResposta",
    "versaoAppProcessamento",
    "dhProcessamento",
    "ocorrencias"
})
public class TDadosProcessamentoEvento {

    protected int cdResposta;
    @XmlElement(required = true)
    protected String descResposta;
    @XmlElement(required = true)
    protected String versaoAppProcessamento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhProcessamento;
    protected TOcorrencias ocorrencias;

    /**
     * Obtém o valor da propriedade cdResposta.
     * 
     */
    public int getCdResposta() {
        return cdResposta;
    }

    /**
     * Define o valor da propriedade cdResposta.
     * 
     */
    public void setCdResposta(int value) {
        this.cdResposta = value;
    }

    /**
     * Obtém o valor da propriedade descResposta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescResposta() {
        return descResposta;
    }

    /**
     * Define o valor da propriedade descResposta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescResposta(String value) {
        this.descResposta = value;
    }

    /**
     * Obtém o valor da propriedade versaoAppProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoAppProcessamento() {
        return versaoAppProcessamento;
    }

    /**
     * Define o valor da propriedade versaoAppProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoAppProcessamento(String value) {
        this.versaoAppProcessamento = value;
    }

    /**
     * Obtém o valor da propriedade dhProcessamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhProcessamento() {
        return dhProcessamento;
    }

    /**
     * Define o valor da propriedade dhProcessamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhProcessamento(XMLGregorianCalendar value) {
        this.dhProcessamento = value;
    }

    /**
     * Obtém o valor da propriedade ocorrencias.
     * 
     * @return
     *     possible object is
     *     {@link TOcorrencias }
     *     
     */
    public TOcorrencias getOcorrencias() {
        return ocorrencias;
    }

    /**
     * Define o valor da propriedade ocorrencias.
     * 
     * @param value
     *     allowed object is
     *     {@link TOcorrencias }
     *     
     */
    public void setOcorrencias(TOcorrencias value) {
        this.ocorrencias = value;
    }

}
