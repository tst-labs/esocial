//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:24 PM BRT 
//


package br.jus.esocialjt.comunicacao.eventos.consulta.identificadores.eventos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Define os campos de retorno a consulta de eventos.
 * 
 * <p>Classe Java de TRetornoConsultaIdentificadoresEventos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRetornoConsultaIdentificadoresEventos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qtdeTotEvtsConsulta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dhUltimoEvtRetornado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="identificadoresEvts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identificadorEvt" maxOccurs="50">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *                             &lt;element name="nrRec">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
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
@XmlType(name = "TRetornoConsultaIdentificadoresEventos", propOrder = {
    "qtdeTotEvtsConsulta",
    "dhUltimoEvtRetornado",
    "identificadoresEvts"
})
public class TRetornoConsultaIdentificadoresEventos {

    protected long qtdeTotEvtsConsulta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhUltimoEvtRetornado;
    protected TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts identificadoresEvts;

    /**
     * Obtém o valor da propriedade qtdeTotEvtsConsulta.
     * 
     */
    public long getQtdeTotEvtsConsulta() {
        return qtdeTotEvtsConsulta;
    }

    /**
     * Define o valor da propriedade qtdeTotEvtsConsulta.
     * 
     */
    public void setQtdeTotEvtsConsulta(long value) {
        this.qtdeTotEvtsConsulta = value;
    }

    /**
     * Obtém o valor da propriedade dhUltimoEvtRetornado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhUltimoEvtRetornado() {
        return dhUltimoEvtRetornado;
    }

    /**
     * Define o valor da propriedade dhUltimoEvtRetornado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhUltimoEvtRetornado(XMLGregorianCalendar value) {
        this.dhUltimoEvtRetornado = value;
    }

    /**
     * Obtém o valor da propriedade identificadoresEvts.
     * 
     * @return
     *     possible object is
     *     {@link TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts }
     *     
     */
    public TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts getIdentificadoresEvts() {
        return identificadoresEvts;
    }

    /**
     * Define o valor da propriedade identificadoresEvts.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts }
     *     
     */
    public void setIdentificadoresEvts(TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts value) {
        this.identificadoresEvts = value;
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
     *         &lt;element name="identificadorEvt" maxOccurs="50">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
     *                   &lt;element name="nrRec">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
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
        "identificadorEvt"
    })
    public static class IdentificadoresEvts {

        @XmlElement(required = true)
        protected List<TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts.IdentificadorEvt> identificadorEvt;

        /**
         * Gets the value of the identificadorEvt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identificadorEvt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentificadorEvt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts.IdentificadorEvt }
         * 
         * 
         */
        public List<TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts.IdentificadorEvt> getIdentificadorEvt() {
            if (identificadorEvt == null) {
                identificadorEvt = new ArrayList<TRetornoConsultaIdentificadoresEventos.IdentificadoresEvts.IdentificadorEvt>();
            }
            return this.identificadorEvt;
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
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
         *         &lt;element name="nrRec">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="40"/>
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
        @XmlType(name = "", propOrder = {
            "id",
            "nrRec"
        })
        public static class IdentificadorEvt {

            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlElement(required = true)
            protected String nrRec;

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
             * Obtém o valor da propriedade nrRec.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRec() {
                return nrRec;
            }

            /**
             * Define o valor da propriedade nrRec.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRec(String value) {
                this.nrRec = value;
            }

        }

    }

}
