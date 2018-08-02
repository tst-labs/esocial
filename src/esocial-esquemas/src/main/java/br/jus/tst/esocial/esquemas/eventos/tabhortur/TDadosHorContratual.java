//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:09 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabhortur;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações do Horário Contratual
 * 
 * <p>Classe Java de TDadosHorContratual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosHorContratual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hrEntr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hrSaida">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="durJornada">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="\d{1,4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="perHorFlexivel">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="horarioIntervalo" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpInterv">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="durInterv">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;pattern value="\d{1,3}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="iniInterv" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="termInterv" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
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
@XmlType(name = "TDadosHorContratual", namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", propOrder = {
    "hrEntr",
    "hrSaida",
    "durJornada",
    "perHorFlexivel",
    "horarioIntervalo"
})
public class TDadosHorContratual {

    @XmlElement(required = true)
    protected String hrEntr;
    @XmlElement(required = true)
    protected String hrSaida;
    @XmlElement(required = true)
    protected BigInteger durJornada;
    @XmlElement(required = true)
    protected String perHorFlexivel;
    protected List<TDadosHorContratual.HorarioIntervalo> horarioIntervalo;

    /**
     * Obtém o valor da propriedade hrEntr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrEntr() {
        return hrEntr;
    }

    /**
     * Define o valor da propriedade hrEntr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrEntr(String value) {
        this.hrEntr = value;
    }

    /**
     * Obtém o valor da propriedade hrSaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHrSaida() {
        return hrSaida;
    }

    /**
     * Define o valor da propriedade hrSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHrSaida(String value) {
        this.hrSaida = value;
    }

    /**
     * Obtém o valor da propriedade durJornada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDurJornada() {
        return durJornada;
    }

    /**
     * Define o valor da propriedade durJornada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDurJornada(BigInteger value) {
        this.durJornada = value;
    }

    /**
     * Obtém o valor da propriedade perHorFlexivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerHorFlexivel() {
        return perHorFlexivel;
    }

    /**
     * Define o valor da propriedade perHorFlexivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerHorFlexivel(String value) {
        this.perHorFlexivel = value;
    }

    /**
     * Gets the value of the horarioIntervalo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horarioIntervalo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorarioIntervalo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosHorContratual.HorarioIntervalo }
     * 
     * 
     */
    public List<TDadosHorContratual.HorarioIntervalo> getHorarioIntervalo() {
        if (horarioIntervalo == null) {
            horarioIntervalo = new ArrayList<TDadosHorContratual.HorarioIntervalo>();
        }
        return this.horarioIntervalo;
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
     *         &lt;element name="tpInterv">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="durInterv">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;pattern value="\d{1,3}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="iniInterv" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="termInterv" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
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
        "tpInterv",
        "durInterv",
        "iniInterv",
        "termInterv"
    })
    public static class HorarioIntervalo {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
        protected byte tpInterv;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02", required = true)
        protected BigInteger durInterv;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
        protected String iniInterv;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabHorTur/v02_04_02")
        protected String termInterv;

        /**
         * Obtém o valor da propriedade tpInterv.
         * 
         */
        public byte getTpInterv() {
            return tpInterv;
        }

        /**
         * Define o valor da propriedade tpInterv.
         * 
         */
        public void setTpInterv(byte value) {
            this.tpInterv = value;
        }

        /**
         * Obtém o valor da propriedade durInterv.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDurInterv() {
            return durInterv;
        }

        /**
         * Define o valor da propriedade durInterv.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDurInterv(BigInteger value) {
            this.durInterv = value;
        }

        /**
         * Obtém o valor da propriedade iniInterv.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIniInterv() {
            return iniInterv;
        }

        /**
         * Define o valor da propriedade iniInterv.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIniInterv(String value) {
            this.iniInterv = value;
        }

        /**
         * Obtém o valor da propriedade termInterv.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermInterv() {
            return termInterv;
        }

        /**
         * Define o valor da propriedade termInterv.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermInterv(String value) {
            this.termInterv = value;
        }

    }

}
