//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:12:06 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.processamento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


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
 *         &lt;element name="retornoProcessamentoLoteEventos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TIdeEmpregador" minOccurs="0"/>
 *                   &lt;element name="ideTransmissor" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TIdeTransmissor" minOccurs="0"/>
 *                   &lt;element name="status" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TStatus"/>
 *                   &lt;element name="dadosRecepcaoLote" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TDadosRecepcao" minOccurs="0"/>
 *                   &lt;element name="dadosProcessamentoLote" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TDadosProcessamento" minOccurs="0"/>
 *                   &lt;element name="retornoEventos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="50">
 *                             &lt;element name="evento">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="retornoEvento" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TArquivoEsocial"/>
 *                                       &lt;element name="tot" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;any processContents='skip'/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                     &lt;attribute name="evtDupl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlType(name = "", propOrder = {
    "retornoProcessamentoLoteEventos"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.RetornoProcessamentoLoteEventos retornoProcessamentoLoteEventos;

    /**
     * Obtém o valor da propriedade retornoProcessamentoLoteEventos.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.RetornoProcessamentoLoteEventos }
     *     
     */
    public ESocial.RetornoProcessamentoLoteEventos getRetornoProcessamentoLoteEventos() {
        return retornoProcessamentoLoteEventos;
    }

    /**
     * Define o valor da propriedade retornoProcessamentoLoteEventos.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.RetornoProcessamentoLoteEventos }
     *     
     */
    public void setRetornoProcessamentoLoteEventos(ESocial.RetornoProcessamentoLoteEventos value) {
        this.retornoProcessamentoLoteEventos = value;
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
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TIdeEmpregador" minOccurs="0"/>
     *         &lt;element name="ideTransmissor" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TIdeTransmissor" minOccurs="0"/>
     *         &lt;element name="status" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TStatus"/>
     *         &lt;element name="dadosRecepcaoLote" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TDadosRecepcao" minOccurs="0"/>
     *         &lt;element name="dadosProcessamentoLote" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TDadosProcessamento" minOccurs="0"/>
     *         &lt;element name="retornoEventos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="50">
     *                   &lt;element name="evento">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="retornoEvento" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TArquivoEsocial"/>
     *                             &lt;element name="tot" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;any processContents='skip'/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                           &lt;attribute name="evtDupl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    @XmlType(name = "", propOrder = {
        "ideEmpregador",
        "ideTransmissor",
        "status",
        "dadosRecepcaoLote",
        "dadosProcessamentoLote",
        "retornoEventos"
    })
    public static class RetornoProcessamentoLoteEventos {

        protected TIdeEmpregador ideEmpregador;
        protected TIdeTransmissor ideTransmissor;
        @XmlElement(required = true)
        protected TStatus status;
        protected TDadosRecepcao dadosRecepcaoLote;
        protected TDadosProcessamento dadosProcessamentoLote;
        protected ESocial.RetornoProcessamentoLoteEventos.RetornoEventos retornoEventos;

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
         * Obtém o valor da propriedade dadosRecepcaoLote.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecepcao }
         *     
         */
        public TDadosRecepcao getDadosRecepcaoLote() {
            return dadosRecepcaoLote;
        }

        /**
         * Define o valor da propriedade dadosRecepcaoLote.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecepcao }
         *     
         */
        public void setDadosRecepcaoLote(TDadosRecepcao value) {
            this.dadosRecepcaoLote = value;
        }

        /**
         * Obtém o valor da propriedade dadosProcessamentoLote.
         * 
         * @return
         *     possible object is
         *     {@link TDadosProcessamento }
         *     
         */
        public TDadosProcessamento getDadosProcessamentoLote() {
            return dadosProcessamentoLote;
        }

        /**
         * Define o valor da propriedade dadosProcessamentoLote.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosProcessamento }
         *     
         */
        public void setDadosProcessamentoLote(TDadosProcessamento value) {
            this.dadosProcessamentoLote = value;
        }

        /**
         * Obtém o valor da propriedade retornoEventos.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.RetornoProcessamentoLoteEventos.RetornoEventos }
         *     
         */
        public ESocial.RetornoProcessamentoLoteEventos.RetornoEventos getRetornoEventos() {
            return retornoEventos;
        }

        /**
         * Define o valor da propriedade retornoEventos.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.RetornoProcessamentoLoteEventos.RetornoEventos }
         *     
         */
        public void setRetornoEventos(ESocial.RetornoProcessamentoLoteEventos.RetornoEventos value) {
            this.retornoEventos = value;
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
         *       &lt;sequence maxOccurs="50">
         *         &lt;element name="evento">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="retornoEvento" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TArquivoEsocial"/>
         *                   &lt;element name="tot" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;any processContents='skip'/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *                 &lt;attribute name="evtDupl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "evento"
        })
        public static class RetornoEventos {

            @XmlElement(required = true)
            protected List<ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento> evento;

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
             * {@link ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento }
             * 
             * 
             */
            public List<ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento> getEvento() {
                if (evento == null) {
                    evento = new ArrayList<ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento>();
                }
                return this.evento;
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
             *         &lt;element name="retornoEvento" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoProcessamento/v1_3_0}TArquivoEsocial"/>
             *         &lt;element name="tot" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;any processContents='skip'/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
             *       &lt;attribute name="evtDupl" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "retornoEvento",
                "tot"
            })
            public static class Evento {

                @XmlElement(required = true)
                protected TArquivoEsocial retornoEvento;
                protected List<ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento.Tot> tot;
                @XmlAttribute(name = "Id", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String id;
                @XmlAttribute(name = "evtDupl")
                protected Boolean evtDupl;

                /**
                 * Obtém o valor da propriedade retornoEvento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TArquivoEsocial }
                 *     
                 */
                public TArquivoEsocial getRetornoEvento() {
                    return retornoEvento;
                }

                /**
                 * Define o valor da propriedade retornoEvento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TArquivoEsocial }
                 *     
                 */
                public void setRetornoEvento(TArquivoEsocial value) {
                    this.retornoEvento = value;
                }

                /**
                 * Gets the value of the tot property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tot property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTot().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento.Tot }
                 * 
                 * 
                 */
                public List<ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento.Tot> getTot() {
                    if (tot == null) {
                        tot = new ArrayList<ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento.Tot>();
                    }
                    return this.tot;
                }

                /**
                 * Obtém o valor da propriedade id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define o valor da propriedade id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Obtém o valor da propriedade evtDupl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isEvtDupl() {
                    return evtDupl;
                }

                /**
                 * Define o valor da propriedade evtDupl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setEvtDupl(Boolean value) {
                    this.evtDupl = value;
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
                 *         &lt;any processContents='skip'/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "any"
                })
                public static class Tot {

                    @XmlAnyElement
                    protected Element any;
                    @XmlAttribute(name = "tipo", required = true)
                    @XmlSchemaType(name = "anySimpleType")
                    protected String tipo;

                    /**
                     * Obtém o valor da propriedade any.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Element }
                     *     
                     */
                    public Element getAny() {
                        return any;
                    }

                    /**
                     * Define o valor da propriedade any.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Element }
                     *     
                     */
                    public void setAny(Element value) {
                        this.any = value;
                    }

                    /**
                     * Obtém o valor da propriedade tipo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipo() {
                        return tipo;
                    }

                    /**
                     * Define o valor da propriedade tipo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipo(String value) {
                        this.tipo = value;
                    }

                }

            }

        }

    }

}
