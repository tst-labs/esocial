//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:24 PM BRT 
//


package br.jus.esocialjt.comunicacao.eventos.consulta.identificadores.eventos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contém o status da solicitação realizada.
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
    "descResposta"
})
public class TStatus {

    protected int cdResposta;
    @XmlElement(required = true)
    protected String descResposta;

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

}
