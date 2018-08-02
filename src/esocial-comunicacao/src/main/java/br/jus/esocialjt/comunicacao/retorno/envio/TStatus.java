//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:11:24 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.envio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contém o status atual do lote ou do Evento.
 * 
 * <p>Classe Java de TStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TStatus">
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
 *         &lt;element name="ocorrencias" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TOcorrencias" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatus", propOrder = {
    "cdResposta",
    "descResposta",
    "ocorrencias"
})
public class TStatus {

    protected int cdResposta;
    @XmlElement(required = true)
    protected String descResposta;
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
