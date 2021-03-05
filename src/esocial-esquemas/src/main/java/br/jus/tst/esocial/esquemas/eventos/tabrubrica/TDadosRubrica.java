//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:28 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabrubrica;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Detalhamento das informações da rubrica.
 * 
 * <p>Classe Java de T_dadosRubrica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_dadosRubrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dscRubr" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_texto_100"/>
 *         &lt;element name="natRubr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="\d{4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpRubr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncCP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="00"/>
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="22"/>
 *               &lt;enumeration value="25"/>
 *               &lt;enumeration value="26"/>
 *               &lt;enumeration value="31"/>
 *               &lt;enumeration value="32"/>
 *               &lt;enumeration value="34"/>
 *               &lt;enumeration value="35"/>
 *               &lt;enumeration value="51"/>
 *               &lt;enumeration value="91"/>
 *               &lt;enumeration value="92"/>
 *               &lt;enumeration value="93"/>
 *               &lt;enumeration value="94"/>
 *               &lt;enumeration value="95"/>
 *               &lt;enumeration value="96"/>
 *               &lt;enumeration value="97"/>
 *               &lt;enumeration value="98"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncIRRF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="\d{1,4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncFGTS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="00"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="91"/>
 *               &lt;enumeration value="92"/>
 *               &lt;enumeration value="93"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncCPRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="00"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="31"/>
 *               &lt;enumeration value="32"/>
 *               &lt;enumeration value="91"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tetoRemun" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_observacao" minOccurs="0"/>
 *         &lt;element name="ideProcessoCP" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_tpProc_1_2"/>
 *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_nrProc_17_20_21"/>
 *                   &lt;element name="extDecisao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_codSusp"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ideProcessoIRRF" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_nrProcJud_1"/>
 *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_codSusp"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ideProcessoFGTS" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_nrProcJud_1_7"/>
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
@XmlType(name = "T_dadosRubrica", propOrder = {
    "dscRubr",
    "natRubr",
    "tpRubr",
    "codIncCP",
    "codIncIRRF",
    "codIncFGTS",
    "codIncCPRP",
    "tetoRemun",
    "observacao",
    "ideProcessoCP",
    "ideProcessoIRRF",
    "ideProcessoFGTS"
})
public class TDadosRubrica {

    @XmlElement(required = true)
    protected String dscRubr;
    @XmlElement(required = true)
    protected BigInteger natRubr;
    protected byte tpRubr;
    @XmlElement(required = true)
    protected String codIncCP;
    @XmlElement(required = true)
    protected BigInteger codIncIRRF;
    @XmlElement(required = true)
    protected String codIncFGTS;
    protected String codIncCPRP;
    @XmlSchemaType(name = "string")
    protected TSSimNao tetoRemun;
    protected String observacao;
    protected List<TDadosRubrica.IdeProcessoCP> ideProcessoCP;
    protected List<TDadosRubrica.IdeProcessoIRRF> ideProcessoIRRF;
    protected List<TDadosRubrica.IdeProcessoFGTS> ideProcessoFGTS;

    /**
     * Obtém o valor da propriedade dscRubr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscRubr() {
        return dscRubr;
    }

    /**
     * Define o valor da propriedade dscRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscRubr(String value) {
        this.dscRubr = value;
    }

    /**
     * Obtém o valor da propriedade natRubr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNatRubr() {
        return natRubr;
    }

    /**
     * Define o valor da propriedade natRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNatRubr(BigInteger value) {
        this.natRubr = value;
    }

    /**
     * Obtém o valor da propriedade tpRubr.
     * 
     */
    public byte getTpRubr() {
        return tpRubr;
    }

    /**
     * Define o valor da propriedade tpRubr.
     * 
     */
    public void setTpRubr(byte value) {
        this.tpRubr = value;
    }

    /**
     * Obtém o valor da propriedade codIncCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodIncCP() {
        return codIncCP;
    }

    /**
     * Define o valor da propriedade codIncCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIncCP(String value) {
        this.codIncCP = value;
    }

    /**
     * Obtém o valor da propriedade codIncIRRF.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodIncIRRF() {
        return codIncIRRF;
    }

    /**
     * Define o valor da propriedade codIncIRRF.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodIncIRRF(BigInteger value) {
        this.codIncIRRF = value;
    }

    /**
     * Obtém o valor da propriedade codIncFGTS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodIncFGTS() {
        return codIncFGTS;
    }

    /**
     * Define o valor da propriedade codIncFGTS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIncFGTS(String value) {
        this.codIncFGTS = value;
    }

    /**
     * Obtém o valor da propriedade codIncCPRP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodIncCPRP() {
        return codIncCPRP;
    }

    /**
     * Define o valor da propriedade codIncCPRP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIncCPRP(String value) {
        this.codIncCPRP = value;
    }

    /**
     * Obtém o valor da propriedade tetoRemun.
     * 
     * @return
     *     possible object is
     *     {@link TSSimNao }
     *     
     */
    public TSSimNao getTetoRemun() {
        return tetoRemun;
    }

    /**
     * Define o valor da propriedade tetoRemun.
     * 
     * @param value
     *     allowed object is
     *     {@link TSSimNao }
     *     
     */
    public void setTetoRemun(TSSimNao value) {
        this.tetoRemun = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the ideProcessoCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideProcessoCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeProcessoCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosRubrica.IdeProcessoCP }
     * 
     * 
     */
    public List<TDadosRubrica.IdeProcessoCP> getIdeProcessoCP() {
        if (ideProcessoCP == null) {
            ideProcessoCP = new ArrayList<TDadosRubrica.IdeProcessoCP>();
        }
        return this.ideProcessoCP;
    }

    /**
     * Gets the value of the ideProcessoIRRF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideProcessoIRRF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeProcessoIRRF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosRubrica.IdeProcessoIRRF }
     * 
     * 
     */
    public List<TDadosRubrica.IdeProcessoIRRF> getIdeProcessoIRRF() {
        if (ideProcessoIRRF == null) {
            ideProcessoIRRF = new ArrayList<TDadosRubrica.IdeProcessoIRRF>();
        }
        return this.ideProcessoIRRF;
    }

    /**
     * Gets the value of the ideProcessoFGTS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideProcessoFGTS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeProcessoFGTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosRubrica.IdeProcessoFGTS }
     * 
     * 
     */
    public List<TDadosRubrica.IdeProcessoFGTS> getIdeProcessoFGTS() {
        if (ideProcessoFGTS == null) {
            ideProcessoFGTS = new ArrayList<TDadosRubrica.IdeProcessoFGTS>();
        }
        return this.ideProcessoFGTS;
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
     *         &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_tpProc_1_2"/>
     *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_nrProc_17_20_21"/>
     *         &lt;element name="extDecisao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_codSusp"/>
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
        "tpProc",
        "nrProc",
        "extDecisao",
        "codSusp"
    })
    public static class IdeProcessoCP {

        protected byte tpProc;
        @XmlElement(required = true)
        protected String nrProc;
        protected byte extDecisao;
        @XmlElement(required = true)
        protected BigInteger codSusp;

        /**
         * Obtém o valor da propriedade tpProc.
         * 
         */
        public byte getTpProc() {
            return tpProc;
        }

        /**
         * Define o valor da propriedade tpProc.
         * 
         */
        public void setTpProc(byte value) {
            this.tpProc = value;
        }

        /**
         * Obtém o valor da propriedade nrProc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProc() {
            return nrProc;
        }

        /**
         * Define o valor da propriedade nrProc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProc(String value) {
            this.nrProc = value;
        }

        /**
         * Obtém o valor da propriedade extDecisao.
         * 
         */
        public byte getExtDecisao() {
            return extDecisao;
        }

        /**
         * Define o valor da propriedade extDecisao.
         * 
         */
        public void setExtDecisao(byte value) {
            this.extDecisao = value;
        }

        /**
         * Obtém o valor da propriedade codSusp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodSusp() {
            return codSusp;
        }

        /**
         * Define o valor da propriedade codSusp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodSusp(BigInteger value) {
            this.codSusp = value;
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
     *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_nrProcJud_1_7"/>
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
        "nrProc"
    })
    public static class IdeProcessoFGTS {

        @XmlElement(required = true)
        protected String nrProc;

        /**
         * Obtém o valor da propriedade nrProc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProc() {
            return nrProc;
        }

        /**
         * Define o valor da propriedade nrProc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProc(String value) {
            this.nrProc = value;
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
     *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_nrProcJud_1"/>
     *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_codSusp"/>
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
        "nrProc",
        "codSusp"
    })
    public static class IdeProcessoIRRF {

        @XmlElement(required = true)
        protected String nrProc;
        @XmlElement(required = true)
        protected BigInteger codSusp;

        /**
         * Obtém o valor da propriedade nrProc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProc() {
            return nrProc;
        }

        /**
         * Define o valor da propriedade nrProc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProc(String value) {
            this.nrProc = value;
        }

        /**
         * Obtém o valor da propriedade codSusp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodSusp() {
            return codSusp;
        }

        /**
         * Define o valor da propriedade codSusp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodSusp(BigInteger value) {
            this.codSusp = value;
        }

    }

}
