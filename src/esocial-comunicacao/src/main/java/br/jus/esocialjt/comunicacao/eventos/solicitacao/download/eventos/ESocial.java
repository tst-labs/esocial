//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:28 PM BRT 
//


package br.jus.esocialjt.comunicacao.eventos.solicitacao.download.eventos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="download">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0}TIdeEmpregador"/>
 *                   &lt;element name="solicDownloadEventosPorNrRecibo" type="{http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0}TSolicitacaoDownloadPorNrRecibo"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "download",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0", required = true)
    protected ESocial.Download download;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade download.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.Download }
     *     
     */
    public ESocial.Download getDownload() {
        return download;
    }

    /**
     * Define o valor da propriedade download.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.Download }
     *     
     */
    public void setDownload(ESocial.Download value) {
        this.download = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0}TIdeEmpregador"/>
     *         &lt;element name="solicDownloadEventosPorNrRecibo" type="{http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0}TSolicitacaoDownloadPorNrRecibo"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEmpregador",
        "solicDownloadEventosPorNrRecibo"
    })
    public static class Download {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0", required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/download/solicitacao/nrRecibo/v1_0_0", required = true)
        protected TSolicitacaoDownloadPorNrRecibo solicDownloadEventosPorNrRecibo;

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade solicDownloadEventosPorNrRecibo.
         * 
         * @return
         *     possible object is
         *     {@link TSolicitacaoDownloadPorNrRecibo }
         *     
         */
        public TSolicitacaoDownloadPorNrRecibo getSolicDownloadEventosPorNrRecibo() {
            return solicDownloadEventosPorNrRecibo;
        }

        /**
         * Define o valor da propriedade solicDownloadEventosPorNrRecibo.
         * 
         * @param value
         *     allowed object is
         *     {@link TSolicitacaoDownloadPorNrRecibo }
         *     
         */
        public void setSolicDownloadEventosPorNrRecibo(TSolicitacaoDownloadPorNrRecibo value) {
            this.solicDownloadEventosPorNrRecibo = value;
        }

    }

}
