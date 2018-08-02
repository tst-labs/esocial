//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:11 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabrubrica;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Detalhamento da rubrica
 * 
 * <p>Classe Java de TDadosRubrica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosRubrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dscRubr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncCP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncIRRF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncFGTS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codIncSIND">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="observacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ideProcessoCP" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpProc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrProc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="21"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="extDecisao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codSusp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;pattern value="\d{1,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
 *                   &lt;element name="nrProc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="21"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codSusp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;pattern value="\d{1,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
 *                   &lt;element name="nrProc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="21"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ideProcessoSIND" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrProc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="21"/>
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
@XmlType(name = "TDadosRubrica", namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", propOrder = {
    "dscRubr",
    "natRubr",
    "tpRubr",
    "codIncCP",
    "codIncIRRF",
    "codIncFGTS",
    "codIncSIND",
    "observacao",
    "ideProcessoCP",
    "ideProcessoIRRF",
    "ideProcessoFGTS",
    "ideProcessoSIND"
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
    protected String codIncIRRF;
    @XmlElement(required = true)
    protected String codIncFGTS;
    @XmlElement(required = true)
    protected String codIncSIND;
    protected String observacao;
    protected List<TDadosRubrica.IdeProcessoCP> ideProcessoCP;
    protected List<TDadosRubrica.IdeProcessoIRRF> ideProcessoIRRF;
    protected List<TDadosRubrica.IdeProcessoFGTS> ideProcessoFGTS;
    protected List<TDadosRubrica.IdeProcessoSIND> ideProcessoSIND;

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
     *     {@link String }
     *     
     */
    public String getCodIncIRRF() {
        return codIncIRRF;
    }

    /**
     * Define o valor da propriedade codIncIRRF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIncIRRF(String value) {
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
     * Obtém o valor da propriedade codIncSIND.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodIncSIND() {
        return codIncSIND;
    }

    /**
     * Define o valor da propriedade codIncSIND.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodIncSIND(String value) {
        this.codIncSIND = value;
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
     * Gets the value of the ideProcessoSIND property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideProcessoSIND property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeProcessoSIND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosRubrica.IdeProcessoSIND }
     * 
     * 
     */
    public List<TDadosRubrica.IdeProcessoSIND> getIdeProcessoSIND() {
        if (ideProcessoSIND == null) {
            ideProcessoSIND = new ArrayList<TDadosRubrica.IdeProcessoSIND>();
        }
        return this.ideProcessoSIND;
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
     *         &lt;element name="tpProc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrProc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="21"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="extDecisao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codSusp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;pattern value="\d{1,14}"/>
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
        "tpProc",
        "nrProc",
        "extDecisao",
        "codSusp"
    })
    public static class IdeProcessoCP {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02")
        protected byte tpProc;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
        protected String nrProc;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02")
        protected byte extDecisao;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
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
     *         &lt;element name="nrProc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="21"/>
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
        "nrProc"
    })
    public static class IdeProcessoFGTS {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
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
     *         &lt;element name="nrProc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="21"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codSusp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;pattern value="\d{1,14}"/>
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
        "nrProc",
        "codSusp"
    })
    public static class IdeProcessoIRRF {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
        protected String nrProc;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
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
     *         &lt;element name="nrProc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="21"/>
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
        "nrProc"
    })
    public static class IdeProcessoSIND {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabRubrica/v02_04_02", required = true)
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

}
