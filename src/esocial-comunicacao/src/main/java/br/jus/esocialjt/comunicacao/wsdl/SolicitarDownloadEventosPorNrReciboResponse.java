//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:20 PM BRT 
//


package br.jus.esocialjt.comunicacao.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitarDownloadEventosPorNrReciboResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "solicitarDownloadEventosPorNrReciboResult"
})
@XmlRootElement(name = "SolicitarDownloadEventosPorNrReciboResponse", namespace = "http://www.esocial.gov.br/servicos/empregador/download/solicitacao/v1_0_0")
public class SolicitarDownloadEventosPorNrReciboResponse {

    @XmlElement(name = "SolicitarDownloadEventosPorNrReciboResult", namespace = "http://www.esocial.gov.br/servicos/empregador/download/solicitacao/v1_0_0")
    protected SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult solicitarDownloadEventosPorNrReciboResult;

    /**
     * Obtém o valor da propriedade solicitarDownloadEventosPorNrReciboResult.
     * 
     * @return
     *     possible object is
     *     {@link SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult }
     *     
     */
    public SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult getSolicitarDownloadEventosPorNrReciboResult() {
        return solicitarDownloadEventosPorNrReciboResult;
    }

    /**
     * Define o valor da propriedade solicitarDownloadEventosPorNrReciboResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult }
     *     
     */
    public void setSolicitarDownloadEventosPorNrReciboResult(SolicitarDownloadEventosPorNrReciboResponse.SolicitarDownloadEventosPorNrReciboResult value) {
        this.solicitarDownloadEventosPorNrReciboResult = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class SolicitarDownloadEventosPorNrReciboResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Obtém o valor da propriedade any.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Define o valor da propriedade any.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
