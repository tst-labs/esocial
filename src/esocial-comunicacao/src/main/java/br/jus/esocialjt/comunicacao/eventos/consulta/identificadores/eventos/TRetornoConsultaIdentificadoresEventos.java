//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.02 at 10:11:49 AM BRT 
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
 * <p>Java class for TRetornoConsultaIdentificadoresEventos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the qtdeTotEvtsConsulta property.
     * 
     */
    public long getQtdeTotEvtsConsulta() {
        return qtdeTotEvtsConsulta;
    }

    /**
     * Sets the value of the qtdeTotEvtsConsulta property.
     * 
     */
    public void setQtdeTotEvtsConsulta(long value) {
        this.qtdeTotEvtsConsulta = value;
    }

    /**
     * Gets the value of the dhUltimoEvtRetornado property.
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
     * Sets the value of the dhUltimoEvtRetornado property.
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
     * Gets the value of the identificadoresEvts property.
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
     * Sets the value of the identificadoresEvts property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
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
             * Gets the value of the id property.
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
             * Sets the value of the id property.
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
             * Gets the value of the nrRec property.
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
             * Sets the value of the nrRec property.
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
