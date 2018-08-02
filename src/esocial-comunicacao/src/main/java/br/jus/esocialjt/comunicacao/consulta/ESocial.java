//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:10:04 PM BRT 
//


package br.jus.esocialjt.comunicacao.consulta;

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
 *         &lt;element name="consultaLoteEventos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocoloEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "consultaLoteEventos"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.ConsultaLoteEventos consultaLoteEventos;

    /**
     * Obtém o valor da propriedade consultaLoteEventos.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.ConsultaLoteEventos }
     *     
     */
    public ESocial.ConsultaLoteEventos getConsultaLoteEventos() {
        return consultaLoteEventos;
    }

    /**
     * Define o valor da propriedade consultaLoteEventos.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.ConsultaLoteEventos }
     *     
     */
    public void setConsultaLoteEventos(ESocial.ConsultaLoteEventos value) {
        this.consultaLoteEventos = value;
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
     *         &lt;element name="protocoloEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "protocoloEnvio"
    })
    public static class ConsultaLoteEventos {

        @XmlElement(required = true)
        protected String protocoloEnvio;

        /**
         * Obtém o valor da propriedade protocoloEnvio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocoloEnvio() {
            return protocoloEnvio;
        }

        /**
         * Define o valor da propriedade protocoloEnvio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocoloEnvio(String value) {
            this.protocoloEnvio = value;
        }

    }

}
