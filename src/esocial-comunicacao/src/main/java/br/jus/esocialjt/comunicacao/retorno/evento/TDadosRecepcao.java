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
 * Define os dados de recepção do evento.
 * 
 * <p>Classe Java de TDadosRecepcao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosRecepcao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="dhRecepcao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="versaoAppRecepcao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocoloEnvioLote" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
@XmlType(name = "TDadosRecepcao", namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", propOrder = {
    "tpAmb",
    "dhRecepcao",
    "versaoAppRecepcao",
    "protocoloEnvioLote"
})
public class TDadosRecepcao {

    @XmlSchemaType(name = "unsignedByte")
    protected short tpAmb;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhRecepcao;
    @XmlElement(required = true)
    protected String versaoAppRecepcao;
    protected String protocoloEnvioLote;

    /**
     * Obtém o valor da propriedade tpAmb.
     * 
     */
    public short getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     */
    public void setTpAmb(short value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade dhRecepcao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhRecepcao() {
        return dhRecepcao;
    }

    /**
     * Define o valor da propriedade dhRecepcao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhRecepcao(XMLGregorianCalendar value) {
        this.dhRecepcao = value;
    }

    /**
     * Obtém o valor da propriedade versaoAppRecepcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoAppRecepcao() {
        return versaoAppRecepcao;
    }

    /**
     * Define o valor da propriedade versaoAppRecepcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoAppRecepcao(String value) {
        this.versaoAppRecepcao = value;
    }

    /**
     * Obtém o valor da propriedade protocoloEnvioLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocoloEnvioLote() {
        return protocoloEnvioLote;
    }

    /**
     * Define o valor da propriedade protocoloEnvioLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocoloEnvioLote(String value) {
        this.protocoloEnvioLote = value;
    }

}
