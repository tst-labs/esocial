//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:08 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabfuncao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações da Função
 * 
 * <p>Classe Java de TDadosFuncao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosFuncao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dscFuncao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCBO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{4,6}"/>
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
@XmlType(name = "TDadosFuncao", namespace = "http://www.esocial.gov.br/schema/evt/evtTabFuncao/v02_04_02", propOrder = {
    "dscFuncao",
    "codCBO"
})
public class TDadosFuncao {

    @XmlElement(required = true)
    protected String dscFuncao;
    @XmlElement(required = true)
    protected String codCBO;

    /**
     * Obtém o valor da propriedade dscFuncao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscFuncao() {
        return dscFuncao;
    }

    /**
     * Define o valor da propriedade dscFuncao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscFuncao(String value) {
        this.dscFuncao = value;
    }

    /**
     * Obtém o valor da propriedade codCBO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCBO() {
        return codCBO;
    }

    /**
     * Define o valor da propriedade codCBO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCBO(String value) {
        this.codCBO = value;
    }

}
