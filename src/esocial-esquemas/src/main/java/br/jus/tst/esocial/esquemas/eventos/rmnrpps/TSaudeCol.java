//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:05 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.rmnrpps;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Planos de saúde coletivo
 * 
 * <p>Classe Java de TSaudeCol complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TSaudeCol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detOper" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cnpjOper">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="14"/>
 *                         &lt;pattern value="\d{8,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="regANS">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vrPgTit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="14"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="detPlano" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpDep">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cpfDep" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nmDep">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtNascto">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vlrPgDep">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="14"/>
 *                                   &lt;fractionDigits value="2"/>
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
@XmlType(name = "TSaudeCol", namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", propOrder = {
    "detOper"
})
public class TSaudeCol {

    @XmlElement(required = true)
    protected List<TSaudeCol.DetOper> detOper;

    /**
     * Gets the value of the detOper property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detOper property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetOper().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSaudeCol.DetOper }
     * 
     * 
     */
    public List<TSaudeCol.DetOper> getDetOper() {
        if (detOper == null) {
            detOper = new ArrayList<TSaudeCol.DetOper>();
        }
        return this.detOper;
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
     *         &lt;element name="cnpjOper">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="14"/>
     *               &lt;pattern value="\d{8,14}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="regANS">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vrPgTit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="14"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="detPlano" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpDep">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cpfDep" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nmDep">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtNascto">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vlrPgDep">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="14"/>
     *                         &lt;fractionDigits value="2"/>
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
        "cnpjOper",
        "regANS",
        "vrPgTit",
        "detPlano"
    })
    public static class DetOper {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", required = true)
        protected String cnpjOper;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", required = true)
        protected String regANS;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", required = true)
        protected BigDecimal vrPgTit;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02")
        protected List<TSaudeCol.DetOper.DetPlano> detPlano;

        /**
         * Obtém o valor da propriedade cnpjOper.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjOper() {
            return cnpjOper;
        }

        /**
         * Define o valor da propriedade cnpjOper.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjOper(String value) {
            this.cnpjOper = value;
        }

        /**
         * Obtém o valor da propriedade regANS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegANS() {
            return regANS;
        }

        /**
         * Define o valor da propriedade regANS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegANS(String value) {
            this.regANS = value;
        }

        /**
         * Obtém o valor da propriedade vrPgTit.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrPgTit() {
            return vrPgTit;
        }

        /**
         * Define o valor da propriedade vrPgTit.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrPgTit(BigDecimal value) {
            this.vrPgTit = value;
        }

        /**
         * Gets the value of the detPlano property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detPlano property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetPlano().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TSaudeCol.DetOper.DetPlano }
         * 
         * 
         */
        public List<TSaudeCol.DetOper.DetPlano> getDetPlano() {
            if (detPlano == null) {
                detPlano = new ArrayList<TSaudeCol.DetOper.DetPlano>();
            }
            return this.detPlano;
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
         *         &lt;element name="tpDep">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cpfDep" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nmDep">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtNascto">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vlrPgDep">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="14"/>
         *               &lt;fractionDigits value="2"/>
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
            "tpDep",
            "cpfDep",
            "nmDep",
            "dtNascto",
            "vlrPgDep"
        })
        public static class DetPlano {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", required = true)
            protected String tpDep;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02")
            protected String cpfDep;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", required = true)
            protected String nmDep;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", required = true)
            protected XMLGregorianCalendar dtNascto;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtRmnRPPS/v02_04_02", required = true)
            protected BigDecimal vlrPgDep;

            /**
             * Obtém o valor da propriedade tpDep.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpDep() {
                return tpDep;
            }

            /**
             * Define o valor da propriedade tpDep.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpDep(String value) {
                this.tpDep = value;
            }

            /**
             * Obtém o valor da propriedade cpfDep.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfDep() {
                return cpfDep;
            }

            /**
             * Define o valor da propriedade cpfDep.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfDep(String value) {
                this.cpfDep = value;
            }

            /**
             * Obtém o valor da propriedade nmDep.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmDep() {
                return nmDep;
            }

            /**
             * Define o valor da propriedade nmDep.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmDep(String value) {
                this.nmDep = value;
            }

            /**
             * Obtém o valor da propriedade dtNascto.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtNascto() {
                return dtNascto;
            }

            /**
             * Define o valor da propriedade dtNascto.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtNascto(XMLGregorianCalendar value) {
                this.dtNascto = value;
            }

            /**
             * Obtém o valor da propriedade vlrPgDep.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVlrPgDep() {
                return vlrPgDep;
            }

            /**
             * Define o valor da propriedade vlrPgDep.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVlrPgDep(BigDecimal value) {
                this.vlrPgDep = value;
            }

        }

    }

}
