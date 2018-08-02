//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:10:44 PM BRT 
//


package br.jus.esocialjt.comunicacao.envio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="envioLoteEventos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1}TIdeEmpregador"/>
 *                   &lt;element name="ideTransmissor" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1}TIdeTransmissor"/>
 *                   &lt;element name="eventos">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="evento" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1}TArquivoEsocial"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="grupo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
    "envioLoteEventos"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EnvioLoteEventos envioLoteEventos;

    /**
     * Obtém o valor da propriedade envioLoteEventos.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EnvioLoteEventos }
     *     
     */
    public ESocial.EnvioLoteEventos getEnvioLoteEventos() {
        return envioLoteEventos;
    }

    /**
     * Define o valor da propriedade envioLoteEventos.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EnvioLoteEventos }
     *     
     */
    public void setEnvioLoteEventos(ESocial.EnvioLoteEventos value) {
        this.envioLoteEventos = value;
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
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1}TIdeEmpregador"/>
     *         &lt;element name="ideTransmissor" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1}TIdeTransmissor"/>
     *         &lt;element name="eventos">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="evento" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1}TArquivoEsocial"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="grupo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
        "ideTransmissor",
        "eventos"
    })
    public static class EnvioLoteEventos {

        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected TIdeTransmissor ideTransmissor;
        @XmlElement(required = true)
        protected ESocial.EnvioLoteEventos.Eventos eventos;
        @XmlAttribute(name = "grupo", required = true)
        protected int grupo;

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
         * Obtém o valor da propriedade ideTransmissor.
         * 
         * @return
         *     possible object is
         *     {@link TIdeTransmissor }
         *     
         */
        public TIdeTransmissor getIdeTransmissor() {
            return ideTransmissor;
        }

        /**
         * Define o valor da propriedade ideTransmissor.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeTransmissor }
         *     
         */
        public void setIdeTransmissor(TIdeTransmissor value) {
            this.ideTransmissor = value;
        }

        /**
         * Obtém o valor da propriedade eventos.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EnvioLoteEventos.Eventos }
         *     
         */
        public ESocial.EnvioLoteEventos.Eventos getEventos() {
            return eventos;
        }

        /**
         * Define o valor da propriedade eventos.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EnvioLoteEventos.Eventos }
         *     
         */
        public void setEventos(ESocial.EnvioLoteEventos.Eventos value) {
            this.eventos = value;
        }

        /**
         * Obtém o valor da propriedade grupo.
         * 
         */
        public int getGrupo() {
            return grupo;
        }

        /**
         * Define o valor da propriedade grupo.
         * 
         */
        public void setGrupo(int value) {
            this.grupo = value;
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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="evento" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/v1_1_1}TArquivoEsocial"/>
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
            "evento"
        })
        public static class Eventos {

            @XmlElement(required = true)
            protected List<TArquivoEsocial> evento;

            /**
             * Gets the value of the evento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the evento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEvento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TArquivoEsocial }
             * 
             * 
             */
            public List<TArquivoEsocial> getEvento() {
                if (evento == null) {
                    evento = new ArrayList<TArquivoEsocial>();
                }
                return this.evento;
            }

        }

    }

}
