//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.03 at 06:57:30 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.contratavnp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se {indRRA}(../indRRA) = [S]); N (nos demais casos)
 * 
 * <p>Java class for T_infoRRA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_infoRRA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_tpProc_1_2"/>
 *         &lt;element name="nrProcRRA" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_nrProc_17_20_21" minOccurs="0"/>
 *         &lt;element name="descRRA" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_descRRA"/>
 *         &lt;element name="qtdMesesRRA" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_qtdMesesRRA"/>
 *         &lt;element name="despProcJud" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_valorMonetario"/>
 *                   &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_valorMonetario"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ideAdv" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_tpInsc_1_2"/>
 *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_nrInsc_11_14"/>
 *                   &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
@XmlType(name = "T_infoRRA", propOrder = {
    "tpProcRRA",
    "nrProcRRA",
    "descRRA",
    "qtdMesesRRA",
    "despProcJud",
    "ideAdv"
})
public class TInfoRRA {

    protected byte tpProcRRA;
    protected String nrProcRRA;
    @XmlElement(required = true)
    protected String descRRA;
    @XmlElement(required = true)
    protected BigDecimal qtdMesesRRA;
    protected TInfoRRA.DespProcJud despProcJud;
    protected List<TInfoRRA.IdeAdv> ideAdv;

    /**
     * Gets the value of the tpProcRRA property.
     * 
     */
    public byte getTpProcRRA() {
        return tpProcRRA;
    }

    /**
     * Sets the value of the tpProcRRA property.
     * 
     */
    public void setTpProcRRA(byte value) {
        this.tpProcRRA = value;
    }

    /**
     * Gets the value of the nrProcRRA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProcRRA() {
        return nrProcRRA;
    }

    /**
     * Sets the value of the nrProcRRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProcRRA(String value) {
        this.nrProcRRA = value;
    }

    /**
     * Gets the value of the descRRA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRRA() {
        return descRRA;
    }

    /**
     * Sets the value of the descRRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRRA(String value) {
        this.descRRA = value;
    }

    /**
     * Gets the value of the qtdMesesRRA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdMesesRRA() {
        return qtdMesesRRA;
    }

    /**
     * Sets the value of the qtdMesesRRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdMesesRRA(BigDecimal value) {
        this.qtdMesesRRA = value;
    }

    /**
     * Gets the value of the despProcJud property.
     * 
     * @return
     *     possible object is
     *     {@link TInfoRRA.DespProcJud }
     *     
     */
    public TInfoRRA.DespProcJud getDespProcJud() {
        return despProcJud;
    }

    /**
     * Sets the value of the despProcJud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoRRA.DespProcJud }
     *     
     */
    public void setDespProcJud(TInfoRRA.DespProcJud value) {
        this.despProcJud = value;
    }

    /**
     * Gets the value of the ideAdv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideAdv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeAdv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInfoRRA.IdeAdv }
     * 
     * 
     */
    public List<TInfoRRA.IdeAdv> getIdeAdv() {
        if (ideAdv == null) {
            ideAdv = new ArrayList<TInfoRRA.IdeAdv>();
        }
        return this.ideAdv;
    }


    /**
     * CONDICAO_GRUPO: OC
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="vlrDespCustas" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_valorMonetario"/>
     *         &lt;element name="vlrDespAdvogados" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_valorMonetario"/>
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
        "vlrDespCustas",
        "vlrDespAdvogados"
    })
    public static class DespProcJud {

        @XmlElement(required = true)
        protected BigDecimal vlrDespCustas;
        @XmlElement(required = true)
        protected BigDecimal vlrDespAdvogados;

        /**
         * Gets the value of the vlrDespCustas property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrDespCustas() {
            return vlrDespCustas;
        }

        /**
         * Sets the value of the vlrDespCustas property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrDespCustas(BigDecimal value) {
            this.vlrDespCustas = value;
        }

        /**
         * Gets the value of the vlrDespAdvogados property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrDespAdvogados() {
            return vlrDespAdvogados;
        }

        /**
         * Sets the value of the vlrDespAdvogados property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrDespAdvogados(BigDecimal value) {
            this.vlrDespAdvogados = value;
        }

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
     *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_tpInsc_1_2"/>
     *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_nrInsc_11_14"/>
     *         &lt;element name="vlrAdv" type="{http://www.esocial.gov.br/schema/evt/evtContratAvNP/v_S_01_03_00}TS_valorMonetario" minOccurs="0"/>
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
        "tpInsc",
        "nrInsc",
        "vlrAdv"
    })
    public static class IdeAdv {

        protected byte tpInsc;
        @XmlElement(required = true)
        protected String nrInsc;
        protected BigDecimal vlrAdv;

        /**
         * Gets the value of the tpInsc property.
         * 
         */
        public byte getTpInsc() {
            return tpInsc;
        }

        /**
         * Sets the value of the tpInsc property.
         * 
         */
        public void setTpInsc(byte value) {
            this.tpInsc = value;
        }

        /**
         * Gets the value of the nrInsc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrInsc() {
            return nrInsc;
        }

        /**
         * Sets the value of the nrInsc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrInsc(String value) {
            this.nrInsc = value;
        }

        /**
         * Gets the value of the vlrAdv property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVlrAdv() {
            return vlrAdv;
        }

        /**
         * Sets the value of the vlrAdv property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVlrAdv(BigDecimal value) {
            this.vlrAdv = value;
        }

    }

}
