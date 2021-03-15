//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:27 PM BRT 
//


package br.jus.esocialjt.comunicacao.eventos.solicitacao.download.eventos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define os campos de retorno a solicitação de download de eventos.
 * 
 * <p>Classe Java de TRetornoSolicitacaoDownloadEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRetornoSolicitacaoDownloadEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arquivos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="arquivo" maxOccurs="50">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="status" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TStatus"/>
 *                             &lt;element name="evt" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TEventoeSocial" minOccurs="0"/>
 *                             &lt;element name="rec" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TReciboeSocial" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "TRetornoSolicitacaoDownloadEvento", propOrder = {
    "arquivos"
})
public class TRetornoSolicitacaoDownloadEvento {

    @XmlElement(required = true)
    protected TRetornoSolicitacaoDownloadEvento.Arquivos arquivos;

    /**
     * Obtém o valor da propriedade arquivos.
     * 
     * @return
     *     possible object is
     *     {@link TRetornoSolicitacaoDownloadEvento.Arquivos }
     *     
     */
    public TRetornoSolicitacaoDownloadEvento.Arquivos getArquivos() {
        return arquivos;
    }

    /**
     * Define o valor da propriedade arquivos.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetornoSolicitacaoDownloadEvento.Arquivos }
     *     
     */
    public void setArquivos(TRetornoSolicitacaoDownloadEvento.Arquivos value) {
        this.arquivos = value;
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
     *         &lt;element name="arquivo" maxOccurs="50">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="status" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TStatus"/>
     *                   &lt;element name="evt" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TEventoeSocial" minOccurs="0"/>
     *                   &lt;element name="rec" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TReciboeSocial" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "arquivo"
    })
    public static class Arquivos {

        @XmlElement(required = true)
        protected List<TRetornoSolicitacaoDownloadEvento.Arquivos.Arquivo> arquivo;

        /**
         * Gets the value of the arquivo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arquivo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArquivo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRetornoSolicitacaoDownloadEvento.Arquivos.Arquivo }
         * 
         * 
         */
        public List<TRetornoSolicitacaoDownloadEvento.Arquivos.Arquivo> getArquivo() {
            if (arquivo == null) {
                arquivo = new ArrayList<TRetornoSolicitacaoDownloadEvento.Arquivos.Arquivo>();
            }
            return this.arquivo;
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
         *         &lt;element name="status" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TStatus"/>
         *         &lt;element name="evt" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TEventoeSocial" minOccurs="0"/>
         *         &lt;element name="rec" type="{http://www.esocial.gov.br/schema/download/solicitacao/retorno/v1_0_0}TReciboeSocial" minOccurs="0"/>
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
            "status",
            "evt",
            "rec"
        })
        public static class Arquivo {

            @XmlElement(required = true)
            protected TStatus status;
            protected TEventoeSocial evt;
            protected TReciboeSocial rec;

            /**
             * Obtém o valor da propriedade status.
             * 
             * @return
             *     possible object is
             *     {@link TStatus }
             *     
             */
            public TStatus getStatus() {
                return status;
            }

            /**
             * Define o valor da propriedade status.
             * 
             * @param value
             *     allowed object is
             *     {@link TStatus }
             *     
             */
            public void setStatus(TStatus value) {
                this.status = value;
            }

            /**
             * Obtém o valor da propriedade evt.
             * 
             * @return
             *     possible object is
             *     {@link TEventoeSocial }
             *     
             */
            public TEventoeSocial getEvt() {
                return evt;
            }

            /**
             * Define o valor da propriedade evt.
             * 
             * @param value
             *     allowed object is
             *     {@link TEventoeSocial }
             *     
             */
            public void setEvt(TEventoeSocial value) {
                this.evt = value;
            }

            /**
             * Obtém o valor da propriedade rec.
             * 
             * @return
             *     possible object is
             *     {@link TReciboeSocial }
             *     
             */
            public TReciboeSocial getRec() {
                return rec;
            }

            /**
             * Define o valor da propriedade rec.
             * 
             * @param value
             *     allowed object is
             *     {@link TReciboeSocial }
             *     
             */
            public void setRec(TReciboeSocial value) {
                this.rec = value;
            }

        }

    }

}
