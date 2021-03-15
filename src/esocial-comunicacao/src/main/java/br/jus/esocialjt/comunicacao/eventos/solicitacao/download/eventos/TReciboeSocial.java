//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:27 PM BRT 
//


package br.jus.esocialjt.comunicacao.eventos.solicitacao.download.eventos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *         Define os dados de um arquivo do eSocial (recibo).
 *       
 * 
 * <p>Classe Java de TReciboeSocial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TReciboeSocial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip'/>
 *       &lt;/sequence>
 *       &lt;attribute name="nrRec" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="40"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TReciboeSocial", propOrder = {
    "any"
})
public class TReciboeSocial {

    @XmlAnyElement
    protected Element any;
    @XmlAttribute(name = "nrRec", required = true)
    protected String nrRec;

    /**
     * Obtém o valor da propriedade any.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Define o valor da propriedade any.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    /**
     * Obtém o valor da propriedade nrRec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRec() {
        return nrRec;
    }

    /**
     * Define o valor da propriedade nrRec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRec(String value) {
        this.nrRec = value;
    }

}
