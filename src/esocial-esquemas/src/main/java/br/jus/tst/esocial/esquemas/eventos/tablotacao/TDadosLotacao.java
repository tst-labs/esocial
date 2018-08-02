//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:09 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tablotacao;

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
 * <p>Classe Java de TDadosLotacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosLotacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpLotacao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpInsc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrInsc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8,15}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fpasLotacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fpas">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codTercs">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codTercsSusp" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
 *                                       &lt;element name="codTerc">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;length value="4"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrProcJud">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="21"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="codSusp">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                             &lt;pattern value="\d{1,14}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 *                   &lt;element name="tpInscContrat">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrInscContrat">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d{11,15}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tpInscProp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrInscProp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d{11,15}"/>
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
@XmlType(name = "TDadosLotacao", namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", propOrder = {
    "tpLotacao",
    "tpInsc",
    "nrInsc",
    "fpasLotacao",
    "infoEmprParcial"
})
public class TDadosLotacao {

    @XmlElement(required = true)
    protected String tpLotacao;
    protected Byte tpInsc;
    protected String nrInsc;
    @XmlElement(required = true)
    protected TDadosLotacao.FpasLotacao fpasLotacao;
    protected TDadosLotacao.InfoEmprParcial infoEmprParcial;

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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fpas">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codTercs">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codTercsSusp" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
     *                             &lt;element name="codTerc">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;length value="4"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrProcJud">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="21"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="codSusp">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                   &lt;pattern value="\d{1,14}"/>
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
    @XmlType(name = "", propOrder = {
        "fpas",
        "codTercs",
        "codTercsSusp",
        "infoProcJudTerceiros"
    })
    public static class FpasLotacao {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
        protected BigInteger fpas;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
        protected String codTercs;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02")
        protected String codTercsSusp;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02")
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
         *                   &lt;element name="codTerc">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;length value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrProcJud">
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

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
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
             *         &lt;element name="codTerc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;length value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrProcJud">
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
                "codTerc",
                "nrProcJud",
                "codSusp"
            })
            public static class ProcJudTerceiro {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
                protected String codTerc;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
                protected String nrProcJud;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
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
     *         &lt;element name="tpInscContrat">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrInscContrat">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d{11,15}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tpInscProp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrInscProp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d{11,15}"/>
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
        "tpInscContrat",
        "nrInscContrat",
        "tpInscProp",
        "nrInscProp"
    })
    public static class InfoEmprParcial {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02")
        protected byte tpInscContrat;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
        protected String nrInscContrat;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02")
        protected byte tpInscProp;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", required = true)
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
         */
        public byte getTpInscProp() {
            return tpInscProp;
        }

        /**
         * Define o valor da propriedade tpInscProp.
         * 
         */
        public void setTpInscProp(byte value) {
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
