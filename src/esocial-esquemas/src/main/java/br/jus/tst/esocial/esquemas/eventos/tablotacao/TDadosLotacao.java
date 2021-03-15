//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:26 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tablotacao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Detalhamento das informações da lotação.
 * 
 * <p>Classe Java de T_dadosLotacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_dadosLotacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_tpLotacao"/>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
 *         &lt;element name="fpasLotacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fpas" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_fpas"/>
 *                   &lt;element name="codTercs" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs"/>
 *                   &lt;element name="codTercsSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs" minOccurs="0"/>
 *                   &lt;element name="infoProcJudTerceiros" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="procJudTerceiro" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs"/>
 *                                       &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrProcJud_1"/>
 *                                       &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codSusp"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoEmprParcial" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_tpInsc_1_2"/>
 *                   &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrInsc_11_14"/>
 *                   &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_tpInsc_1_2" minOccurs="0"/>
 *                   &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrInsc_11_14" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosOpPort" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_aliqRat"/>
 *                   &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_fap"/>
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
@XmlType(name = "T_dadosLotacao", propOrder = {
    "tpLotacao",
    "tpInsc",
    "nrInsc",
    "fpasLotacao",
    "infoEmprParcial",
    "dadosOpPort"
})
public class TDadosLotacao {

    @XmlElement(required = true)
    protected String tpLotacao;
    protected Byte tpInsc;
    protected String nrInsc;
    @XmlElement(required = true)
    protected TDadosLotacao.FpasLotacao fpasLotacao;
    protected TDadosLotacao.InfoEmprParcial infoEmprParcial;
    protected TDadosLotacao.DadosOpPort dadosOpPort;

    /**
     * Obtém o valor da propriedade tpLotacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpLotacao() {
        return tpLotacao;
    }

    /**
     * Define o valor da propriedade tpLotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpLotacao(String value) {
        this.tpLotacao = value;
    }

    /**
     * Obtém o valor da propriedade tpInsc.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Define o valor da propriedade tpInsc.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTpInsc(Byte value) {
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
     * Obtém o valor da propriedade fpasLotacao.
     * 
     * @return
     *     possible object is
     *     {@link TDadosLotacao.FpasLotacao }
     *     
     */
    public TDadosLotacao.FpasLotacao getFpasLotacao() {
        return fpasLotacao;
    }

    /**
     * Define o valor da propriedade fpasLotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosLotacao.FpasLotacao }
     *     
     */
    public void setFpasLotacao(TDadosLotacao.FpasLotacao value) {
        this.fpasLotacao = value;
    }

    /**
     * Obtém o valor da propriedade infoEmprParcial.
     * 
     * @return
     *     possible object is
     *     {@link TDadosLotacao.InfoEmprParcial }
     *     
     */
    public TDadosLotacao.InfoEmprParcial getInfoEmprParcial() {
        return infoEmprParcial;
    }

    /**
     * Define o valor da propriedade infoEmprParcial.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosLotacao.InfoEmprParcial }
     *     
     */
    public void setInfoEmprParcial(TDadosLotacao.InfoEmprParcial value) {
        this.infoEmprParcial = value;
    }

    /**
     * Obtém o valor da propriedade dadosOpPort.
     * 
     * @return
     *     possible object is
     *     {@link TDadosLotacao.DadosOpPort }
     *     
     */
    public TDadosLotacao.DadosOpPort getDadosOpPort() {
        return dadosOpPort;
    }

    /**
     * Define o valor da propriedade dadosOpPort.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosLotacao.DadosOpPort }
     *     
     */
    public void setDadosOpPort(TDadosLotacao.DadosOpPort value) {
        this.dadosOpPort = value;
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
     *         &lt;element name="aliqRat" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_aliqRat"/>
     *         &lt;element name="fap" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_fap"/>
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
        "fap"
    })
    public static class DadosOpPort {

        protected byte aliqRat;
        @XmlElement(required = true)
        protected BigDecimal fap;

        /**
         * Obtém o valor da propriedade aliqRat.
         * 
         */
        public byte getAliqRat() {
            return aliqRat;
        }

        /**
         * Define o valor da propriedade aliqRat.
         * 
         */
        public void setAliqRat(byte value) {
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
     *         &lt;element name="fpas" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_fpas"/>
     *         &lt;element name="codTercs" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs"/>
     *         &lt;element name="codTercsSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs" minOccurs="0"/>
     *         &lt;element name="infoProcJudTerceiros" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="procJudTerceiro" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs"/>
     *                             &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrProcJud_1"/>
     *                             &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codSusp"/>
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
        "fpas",
        "codTercs",
        "codTercsSusp",
        "infoProcJudTerceiros"
    })
    public static class FpasLotacao {

        @XmlElement(required = true)
        protected BigInteger fpas;
        @XmlElement(required = true)
        protected String codTercs;
        protected String codTercsSusp;
        protected TDadosLotacao.FpasLotacao.InfoProcJudTerceiros infoProcJudTerceiros;

        /**
         * Obtém o valor da propriedade fpas.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFpas() {
            return fpas;
        }

        /**
         * Define o valor da propriedade fpas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFpas(BigInteger value) {
            this.fpas = value;
        }

        /**
         * Obtém o valor da propriedade codTercs.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodTercs() {
            return codTercs;
        }

        /**
         * Define o valor da propriedade codTercs.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodTercs(String value) {
            this.codTercs = value;
        }

        /**
         * Obtém o valor da propriedade codTercsSusp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodTercsSusp() {
            return codTercsSusp;
        }

        /**
         * Define o valor da propriedade codTercsSusp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodTercsSusp(String value) {
            this.codTercsSusp = value;
        }

        /**
         * Obtém o valor da propriedade infoProcJudTerceiros.
         * 
         * @return
         *     possible object is
         *     {@link TDadosLotacao.FpasLotacao.InfoProcJudTerceiros }
         *     
         */
        public TDadosLotacao.FpasLotacao.InfoProcJudTerceiros getInfoProcJudTerceiros() {
            return infoProcJudTerceiros;
        }

        /**
         * Define o valor da propriedade infoProcJudTerceiros.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosLotacao.FpasLotacao.InfoProcJudTerceiros }
         *     
         */
        public void setInfoProcJudTerceiros(TDadosLotacao.FpasLotacao.InfoProcJudTerceiros value) {
            this.infoProcJudTerceiros = value;
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
         *         &lt;element name="procJudTerceiro" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs"/>
         *                   &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrProcJud_1"/>
         *                   &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codSusp"/>
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
            "procJudTerceiro"
        })
        public static class InfoProcJudTerceiros {

            @XmlElement(required = true)
            protected List<TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro> procJudTerceiro;

            /**
             * Gets the value of the procJudTerceiro property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the procJudTerceiro property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProcJudTerceiro().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro }
             * 
             * 
             */
            public List<TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro> getProcJudTerceiro() {
                if (procJudTerceiro == null) {
                    procJudTerceiro = new ArrayList<TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro>();
                }
                return this.procJudTerceiro;
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
             *         &lt;element name="codTerc" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codTercs"/>
             *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrProcJud_1"/>
             *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_codSusp"/>
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
                "codTerc",
                "nrProcJud",
                "codSusp"
            })
            public static class ProcJudTerceiro {

                @XmlElement(required = true)
                protected String codTerc;
                @XmlElement(required = true)
                protected String nrProcJud;
                @XmlElement(required = true)
                protected BigInteger codSusp;

                /**
                 * Obtém o valor da propriedade codTerc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodTerc() {
                    return codTerc;
                }

                /**
                 * Define o valor da propriedade codTerc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodTerc(String value) {
                    this.codTerc = value;
                }

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
     *         &lt;element name="tpInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_tpInsc_1_2"/>
     *         &lt;element name="nrInscContrat" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrInsc_11_14"/>
     *         &lt;element name="tpInscProp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_tpInsc_1_2" minOccurs="0"/>
     *         &lt;element name="nrInscProp" type="{http://www.esocial.gov.br/schema/evt/evtTabLotacao/v_S_01_00_00}TS_nrInsc_11_14" minOccurs="0"/>
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
        "tpInscContrat",
        "nrInscContrat",
        "tpInscProp",
        "nrInscProp"
    })
    public static class InfoEmprParcial {

        protected byte tpInscContrat;
        @XmlElement(required = true)
        protected String nrInscContrat;
        protected Byte tpInscProp;
        protected String nrInscProp;

        /**
         * Obtém o valor da propriedade tpInscContrat.
         * 
         */
        public byte getTpInscContrat() {
            return tpInscContrat;
        }

        /**
         * Define o valor da propriedade tpInscContrat.
         * 
         */
        public void setTpInscContrat(byte value) {
            this.tpInscContrat = value;
        }

        /**
         * Obtém o valor da propriedade nrInscContrat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrInscContrat() {
            return nrInscContrat;
        }

        /**
         * Define o valor da propriedade nrInscContrat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrInscContrat(String value) {
            this.nrInscContrat = value;
        }

        /**
         * Obtém o valor da propriedade tpInscProp.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getTpInscProp() {
            return tpInscProp;
        }

        /**
         * Define o valor da propriedade tpInscProp.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setTpInscProp(Byte value) {
            this.tpInscProp = value;
        }

        /**
         * Obtém o valor da propriedade nrInscProp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrInscProp() {
            return nrInscProp;
        }

        /**
         * Define o valor da propriedade nrInscProp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrInscProp(String value) {
            this.nrInscProp = value;
        }

    }

}
