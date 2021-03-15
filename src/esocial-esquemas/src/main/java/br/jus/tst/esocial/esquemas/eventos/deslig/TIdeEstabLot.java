//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:09 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.deslig;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_ideEstabLot complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEstabLot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_tpInsc_EstabLot"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_nrInsc_EstabLot"/>
 *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codLotacao"/>
 *         &lt;element name="detVerbas" maxOccurs="200">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
 *                   &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_ideTabRubr"/>
 *                   &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_qtdRubr" minOccurs="0"/>
 *                   &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_fator" minOccurs="0"/>
 *                   &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_vrRubr"/>
 *                   &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_indApurIR" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoAgNocivo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_grauExp"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoSimples" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}T_infoSimples" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEstabLot", propOrder = {
    "tpInsc",
    "nrInsc",
    "codLotacao",
    "detVerbas",
    "infoAgNocivo",
    "infoSimples"
})
public class TIdeEstabLot {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    @XmlElement(required = true)
    protected String codLotacao;
    @XmlElement(required = true)
    protected List<TIdeEstabLot.DetVerbas> detVerbas;
    protected TIdeEstabLot.InfoAgNocivo infoAgNocivo;
    protected TInfoSimples infoSimples;

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Obtém o valor da propriedade nrInsc.
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
     * Define o valor da propriedade nrInsc.
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
     * Obtém o valor da propriedade codLotacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLotacao() {
        return codLotacao;
    }

    /**
     * Define o valor da propriedade codLotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLotacao(String value) {
        this.codLotacao = value;
    }

    /**
     * Gets the value of the detVerbas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detVerbas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetVerbas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIdeEstabLot.DetVerbas }
     * 
     * 
     */
    public List<TIdeEstabLot.DetVerbas> getDetVerbas() {
        if (detVerbas == null) {
            detVerbas = new ArrayList<TIdeEstabLot.DetVerbas>();
        }
        return this.detVerbas;
    }

    /**
     * Obtém o valor da propriedade infoAgNocivo.
     * 
     * @return
     *     possible object is
     *     {@link TIdeEstabLot.InfoAgNocivo }
     *     
     */
    public TIdeEstabLot.InfoAgNocivo getInfoAgNocivo() {
        return infoAgNocivo;
    }

    /**
     * Define o valor da propriedade infoAgNocivo.
     * 
     * @param value
     *     allowed object is
     *     {@link TIdeEstabLot.InfoAgNocivo }
     *     
     */
    public void setInfoAgNocivo(TIdeEstabLot.InfoAgNocivo value) {
        this.infoAgNocivo = value;
    }

    /**
     * Obtém o valor da propriedade infoSimples.
     * 
     * @return
     *     possible object is
     *     {@link TInfoSimples }
     *     
     */
    public TInfoSimples getInfoSimples() {
        return infoSimples;
    }

    /**
     * Define o valor da propriedade infoSimples.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoSimples }
     *     
     */
    public void setInfoSimples(TInfoSimples value) {
        this.infoSimples = value;
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
     *         &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_codigo_esocial"/>
     *         &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_ideTabRubr"/>
     *         &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_qtdRubr" minOccurs="0"/>
     *         &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_fator" minOccurs="0"/>
     *         &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_vrRubr"/>
     *         &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_indApurIR" minOccurs="0"/>
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
        "codRubr",
        "ideTabRubr",
        "qtdRubr",
        "fatorRubr",
        "vrRubr",
        "indApurIR"
    })
    public static class DetVerbas {

        @XmlElement(required = true)
        protected String codRubr;
        @XmlElement(required = true)
        protected String ideTabRubr;
        protected BigDecimal qtdRubr;
        protected BigDecimal fatorRubr;
        @XmlElement(required = true)
        protected BigDecimal vrRubr;
        protected Byte indApurIR;

        /**
         * Obtém o valor da propriedade codRubr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodRubr() {
            return codRubr;
        }

        /**
         * Define o valor da propriedade codRubr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodRubr(String value) {
            this.codRubr = value;
        }

        /**
         * Obtém o valor da propriedade ideTabRubr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeTabRubr() {
            return ideTabRubr;
        }

        /**
         * Define o valor da propriedade ideTabRubr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeTabRubr(String value) {
            this.ideTabRubr = value;
        }

        /**
         * Obtém o valor da propriedade qtdRubr.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQtdRubr() {
            return qtdRubr;
        }

        /**
         * Define o valor da propriedade qtdRubr.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQtdRubr(BigDecimal value) {
            this.qtdRubr = value;
        }

        /**
         * Obtém o valor da propriedade fatorRubr.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFatorRubr() {
            return fatorRubr;
        }

        /**
         * Define o valor da propriedade fatorRubr.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFatorRubr(BigDecimal value) {
            this.fatorRubr = value;
        }

        /**
         * Obtém o valor da propriedade vrRubr.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVrRubr() {
            return vrRubr;
        }

        /**
         * Define o valor da propriedade vrRubr.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVrRubr(BigDecimal value) {
            this.vrRubr = value;
        }

        /**
         * Obtém o valor da propriedade indApurIR.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getIndApurIR() {
            return indApurIR;
        }

        /**
         * Define o valor da propriedade indApurIR.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setIndApurIR(Byte value) {
            this.indApurIR = value;
        }

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
     *         &lt;element name="grauExp" type="{http://www.esocial.gov.br/schema/evt/evtDeslig/v_S_01_00_00}TS_grauExp"/>
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
        "grauExp"
    })
    public static class InfoAgNocivo {

        protected byte grauExp;

        /**
         * Obtém o valor da propriedade grauExp.
         * 
         */
        public byte getGrauExp() {
            return grauExp;
        }

        /**
         * Define o valor da propriedade grauExp.
         * 
         */
        public void setGrauExp(byte value) {
            this.grauExp = value;
        }

    }

}
