//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:25 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabestab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DESCRICAO_COMPLETA:Detalhamento das informações do estabelecimento, obra de construção civil ou unidade de órgão público.
 * 
 * <p>Classe Java de T_dadosEstab complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_dadosEstab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnaePrep" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnae"/>
 *         &lt;element name="aliqGilrat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_aliqRat" minOccurs="0"/>
 *                   &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_fap" minOccurs="0"/>
 *                   &lt;element name="procAdmJudRat" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2"/>
 *                             &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_17_20_21"/>
 *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="procAdmJudFap" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2_4"/>
 *                             &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_16_17_20_21"/>
 *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
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
 *         &lt;element name="infoCaepf" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpCaepf">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoObra" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_indSubstPatrObra"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoTrab" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infoApr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
 *                             &lt;element name="infoEntEduc" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoPCD" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud"/>
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
@XmlType(name = "T_dadosEstab", propOrder = {
    "cnaePrep",
    "aliqGilrat",
    "infoCaepf",
    "infoObra",
    "infoTrab"
})
public class TDadosEstab {

    @XmlElement(required = true)
    protected BigInteger cnaePrep;
    protected TDadosEstab.AliqGilrat aliqGilrat;
    protected TDadosEstab.InfoCaepf infoCaepf;
    protected TDadosEstab.InfoObra infoObra;
    protected TDadosEstab.InfoTrab infoTrab;

    /**
     * Obtém o valor da propriedade cnaePrep.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnaePrep() {
        return cnaePrep;
    }

    /**
     * Define o valor da propriedade cnaePrep.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnaePrep(BigInteger value) {
        this.cnaePrep = value;
    }

    /**
     * Obtém o valor da propriedade aliqGilrat.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.AliqGilrat }
     *     
     */
    public TDadosEstab.AliqGilrat getAliqGilrat() {
        return aliqGilrat;
    }

    /**
     * Define o valor da propriedade aliqGilrat.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.AliqGilrat }
     *     
     */
    public void setAliqGilrat(TDadosEstab.AliqGilrat value) {
        this.aliqGilrat = value;
    }

    /**
     * Obtém o valor da propriedade infoCaepf.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.InfoCaepf }
     *     
     */
    public TDadosEstab.InfoCaepf getInfoCaepf() {
        return infoCaepf;
    }

    /**
     * Define o valor da propriedade infoCaepf.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.InfoCaepf }
     *     
     */
    public void setInfoCaepf(TDadosEstab.InfoCaepf value) {
        this.infoCaepf = value;
    }

    /**
     * Obtém o valor da propriedade infoObra.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.InfoObra }
     *     
     */
    public TDadosEstab.InfoObra getInfoObra() {
        return infoObra;
    }

    /**
     * Define o valor da propriedade infoObra.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.InfoObra }
     *     
     */
    public void setInfoObra(TDadosEstab.InfoObra value) {
        this.infoObra = value;
    }

    /**
     * Obtém o valor da propriedade infoTrab.
     * 
     * @return
     *     possible object is
     *     {@link TDadosEstab.InfoTrab }
     *     
     */
    public TDadosEstab.InfoTrab getInfoTrab() {
        return infoTrab;
    }

    /**
     * Define o valor da propriedade infoTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosEstab.InfoTrab }
     *     
     */
    public void setInfoTrab(TDadosEstab.InfoTrab value) {
        this.infoTrab = value;
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
     *         &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_aliqRat" minOccurs="0"/>
     *         &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_fap" minOccurs="0"/>
     *         &lt;element name="procAdmJudRat" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2"/>
     *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_17_20_21"/>
     *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="procAdmJudFap" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2_4"/>
     *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_16_17_20_21"/>
     *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
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
        "aliqRat",
        "fap",
        "procAdmJudRat",
        "procAdmJudFap"
    })
    public static class AliqGilrat {

        protected Byte aliqRat;
        protected BigDecimal fap;
        protected TDadosEstab.AliqGilrat.ProcAdmJudRat procAdmJudRat;
        protected TDadosEstab.AliqGilrat.ProcAdmJudFap procAdmJudFap;

        /**
         * Obtém o valor da propriedade aliqRat.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getAliqRat() {
            return aliqRat;
        }

        /**
         * Define o valor da propriedade aliqRat.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setAliqRat(Byte value) {
            this.aliqRat = value;
        }

        /**
         * Obtém o valor da propriedade fap.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFap() {
            return fap;
        }

        /**
         * Define o valor da propriedade fap.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFap(BigDecimal value) {
            this.fap = value;
        }

        /**
         * Obtém o valor da propriedade procAdmJudRat.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudRat }
         *     
         */
        public TDadosEstab.AliqGilrat.ProcAdmJudRat getProcAdmJudRat() {
            return procAdmJudRat;
        }

        /**
         * Define o valor da propriedade procAdmJudRat.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudRat }
         *     
         */
        public void setProcAdmJudRat(TDadosEstab.AliqGilrat.ProcAdmJudRat value) {
            this.procAdmJudRat = value;
        }

        /**
         * Obtém o valor da propriedade procAdmJudFap.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudFap }
         *     
         */
        public TDadosEstab.AliqGilrat.ProcAdmJudFap getProcAdmJudFap() {
            return procAdmJudFap;
        }

        /**
         * Define o valor da propriedade procAdmJudFap.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.AliqGilrat.ProcAdmJudFap }
         *     
         */
        public void setProcAdmJudFap(TDadosEstab.AliqGilrat.ProcAdmJudFap value) {
            this.procAdmJudFap = value;
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
         *         &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2_4"/>
         *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_16_17_20_21"/>
         *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
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
            "codSusp"
        })
        public static class ProcAdmJudFap {

            protected byte tpProc;
            @XmlElement(required = true)
            protected String nrProc;
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
         *         &lt;element name="tpProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_tpProc_1_2"/>
         *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProc_17_20_21"/>
         *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_codSusp"/>
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
            "codSusp"
        })
        public static class ProcAdmJudRat {

            protected byte tpProc;
            @XmlElement(required = true)
            protected String nrProc;
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
     *         &lt;element name="tpCaepf">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
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
        "tpCaepf"
    })
    public static class InfoCaepf {

        protected byte tpCaepf;

        /**
         * Obtém o valor da propriedade tpCaepf.
         * 
         */
        public byte getTpCaepf() {
            return tpCaepf;
        }

        /**
         * Define o valor da propriedade tpCaepf.
         * 
         */
        public void setTpCaepf(byte value) {
            this.tpCaepf = value;
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
     *         &lt;element name="indSubstPatrObra" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_indSubstPatrObra"/>
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
        "indSubstPatrObra"
    })
    public static class InfoObra {

        protected byte indSubstPatrObra;

        /**
         * Obtém o valor da propriedade indSubstPatrObra.
         * 
         */
        public byte getIndSubstPatrObra() {
            return indSubstPatrObra;
        }

        /**
         * Define o valor da propriedade indSubstPatrObra.
         * 
         */
        public void setIndSubstPatrObra(byte value) {
            this.indSubstPatrObra = value;
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
     *         &lt;element name="infoApr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
     *                   &lt;element name="infoEntEduc" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
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
     *         &lt;element name="infoPCD" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud"/>
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
        "infoApr",
        "infoPCD"
    })
    public static class InfoTrab {

        protected TDadosEstab.InfoTrab.InfoApr infoApr;
        protected TDadosEstab.InfoTrab.InfoPCD infoPCD;

        /**
         * Obtém o valor da propriedade infoApr.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.InfoTrab.InfoApr }
         *     
         */
        public TDadosEstab.InfoTrab.InfoApr getInfoApr() {
            return infoApr;
        }

        /**
         * Define o valor da propriedade infoApr.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.InfoTrab.InfoApr }
         *     
         */
        public void setInfoApr(TDadosEstab.InfoTrab.InfoApr value) {
            this.infoApr = value;
        }

        /**
         * Obtém o valor da propriedade infoPCD.
         * 
         * @return
         *     possible object is
         *     {@link TDadosEstab.InfoTrab.InfoPCD }
         *     
         */
        public TDadosEstab.InfoTrab.InfoPCD getInfoPCD() {
            return infoPCD;
        }

        /**
         * Define o valor da propriedade infoPCD.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosEstab.InfoTrab.InfoPCD }
         *     
         */
        public void setInfoPCD(TDadosEstab.InfoTrab.InfoPCD value) {
            this.infoPCD = value;
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
         *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud" minOccurs="0"/>
         *         &lt;element name="infoEntEduc" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
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
            "nrProcJud",
            "infoEntEduc"
        })
        public static class InfoApr {

            protected String nrProcJud;
            protected List<TDadosEstab.InfoTrab.InfoApr.InfoEntEduc> infoEntEduc;

            /**
             * Obtém o valor da propriedade nrProcJud.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProcJud() {
                return nrProcJud;
            }

            /**
             * Define o valor da propriedade nrProcJud.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProcJud(String value) {
                this.nrProcJud = value;
            }

            /**
             * Gets the value of the infoEntEduc property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoEntEduc property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoEntEduc().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TDadosEstab.InfoTrab.InfoApr.InfoEntEduc }
             * 
             * 
             */
            public List<TDadosEstab.InfoTrab.InfoApr.InfoEntEduc> getInfoEntEduc() {
                if (infoEntEduc == null) {
                    infoEntEduc = new ArrayList<TDadosEstab.InfoTrab.InfoApr.InfoEntEduc>();
                }
                return this.infoEntEduc;
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
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_cnpj"/>
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
                "nrInsc"
            })
            public static class InfoEntEduc {

                @XmlElement(required = true)
                protected String nrInsc;

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
         *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabEstab/v_S_01_00_00}TS_nrProcJud"/>
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
            "nrProcJud"
        })
        public static class InfoPCD {

            @XmlElement(required = true)
            protected String nrProcJud;

            /**
             * Obtém o valor da propriedade nrProcJud.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrProcJud() {
                return nrProcJud;
            }

            /**
             * Define o valor da propriedade nrProcJud.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrProcJud(String value) {
                this.nrProcJud = value;
            }

        }

    }

}
