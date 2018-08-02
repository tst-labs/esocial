//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:49 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações de Horário Contratual
 * 
 * <p>Classe Java de THorario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="THorario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codHorContrat">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
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
@XmlType(name = "THorario", propOrder = {
    "dia",
    "codHorContrat"
})
public class THorario {

    protected byte dia;
    @XmlElement(required = true)
    protected String codHorContrat;

    /**
     * Obtém o valor da propriedade dia.
     * 
     */
    public byte getDia() {
        return dia;
    }

    /**
     * Define o valor da propriedade dia.
     * 
     */
    public void setDia(byte value) {
        this.dia = value;
    }

    /**
     * Obtém o valor da propriedade codHorContrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodHorContrat() {
        return codHorContrat;
    }

    /**
     * Define o valor da propriedade codHorContrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodHorContrat(String value) {
        this.codHorContrat = value;
    }

}
