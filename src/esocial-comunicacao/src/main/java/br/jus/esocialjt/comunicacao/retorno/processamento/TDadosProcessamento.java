//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:12:06 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.processamento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Define os dados de processamento de um lote de eventos.
 * 
 * <p>Classe Java de TDadosProcessamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosProcessamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versaoAplicativoProcessamentoLote" minOccurs="0">
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
@XmlType(name = "TDadosProcessamento", propOrder = {
    "versaoAplicativoProcessamentoLote"
})
public class TDadosProcessamento {

    protected String versaoAplicativoProcessamentoLote;

    /**
     * Obtém o valor da propriedade versaoAplicativoProcessamentoLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoAplicativoProcessamentoLote() {
        return versaoAplicativoProcessamentoLote;
    }

    /**
     * Define o valor da propriedade versaoAplicativoProcessamentoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoAplicativoProcessamentoLote(String value) {
        this.versaoAplicativoProcessamentoLote = value;
    }

}
