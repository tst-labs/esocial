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
 *         &lt;element name="retornoConsultaIdentificadoresEvts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="status" type="{http://www.esocial.gov.br/schema/consulta/identificadores-eventos/retorno/v1_0_0}TStatus"/>
 *                   &lt;element name="retornoIdentificadoresEvts" type="{http://www.esocial.gov.br/schema/consulta/identificadores-eventos/retorno/v1_0_0}TRetornoConsultaIdentificadoresEventos" minOccurs="0"/>
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
    "retornoConsultaIdentificadoresEvts"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.RetornoConsultaIdentificadoresEvts retornoConsultaIdentificadoresEvts;

    /**
     * Obtém o valor da propriedade retornoConsultaIdentificadoresEvts.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.RetornoConsultaIdentificadoresEvts }
     *     
     */
    public ESocial.RetornoConsultaIdentificadoresEvts getRetornoConsultaIdentificadoresEvts() {
        return retornoConsultaIdentificadoresEvts;
    }

    /**
     * Define o valor da propriedade retornoConsultaIdentificadoresEvts.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.RetornoConsultaIdentificadoresEvts }
     *     
     */
    public void setRetornoConsultaIdentificadoresEvts(ESocial.RetornoConsultaIdentificadoresEvts value) {
        this.retornoConsultaIdentificadoresEvts = value;
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
     *         &lt;element name="status" type="{http://www.esocial.gov.br/schema/consulta/identificadores-eventos/retorno/v1_0_0}TStatus"/>
     *         &lt;element name="retornoIdentificadoresEvts" type="{http://www.esocial.gov.br/schema/consulta/identificadores-eventos/retorno/v1_0_0}TRetornoConsultaIdentificadoresEventos" minOccurs="0"/>
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
        "retornoIdentificadoresEvts"
    })
    public static class RetornoConsultaIdentificadoresEvts {

        @XmlElement(required = true)
        protected TStatus status;
        protected TRetornoConsultaIdentificadoresEventos retornoIdentificadoresEvts;

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
         * Obtém o valor da propriedade retornoIdentificadoresEvts.
         * 
         * @return
         *     possible object is
         *     {@link TRetornoConsultaIdentificadoresEventos }
         *     
         */
        public TRetornoConsultaIdentificadoresEventos getRetornoIdentificadoresEvts() {
            return retornoIdentificadoresEvts;
        }

        /**
         * Define o valor da propriedade retornoIdentificadoresEvts.
         * 
         * @param value
         *     allowed object is
         *     {@link TRetornoConsultaIdentificadoresEventos }
         *     
         */
        public void setRetornoIdentificadoresEvts(TRetornoConsultaIdentificadoresEventos value) {
            this.retornoIdentificadoresEvts = value;
        }

    }

}
