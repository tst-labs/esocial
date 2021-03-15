//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:50 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admprelim;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="evtAdmPrelim">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}T_ideEvento_trab_admissao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoRegPrelim">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cpfTrab"/>
 *                             &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_codigo_esocial"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_codCateg"/>
 *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
 *                             &lt;element name="infoRegCTPS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cbo"/>
 *                                       &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_vrSalFx"/>
 *                                       &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_undSalFixo"/>
 *                                       &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_tpContr"/>
 *                                       &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_Id" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtAdmPrelim",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAdmPrelim evtAdmPrelim;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtAdmPrelim.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAdmPrelim }
     *     
     */
    public ESocial.EvtAdmPrelim getEvtAdmPrelim() {
        return evtAdmPrelim;
    }

    /**
     * Define o valor da propriedade evtAdmPrelim.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAdmPrelim }
     *     
     */
    public void setEvtAdmPrelim(ESocial.EvtAdmPrelim value) {
        this.evtAdmPrelim = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}T_ideEvento_trab_admissao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoRegPrelim">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cpfTrab"/>
     *                   &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_codigo_esocial"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_codCateg"/>
     *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
     *                   &lt;element name="infoRegCTPS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cbo"/>
     *                             &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_vrSalFx"/>
     *                             &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_undSalFixo"/>
     *                             &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_tpContr"/>
     *                             &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_Id" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoRegPrelim"
    })
    public static class EvtAdmPrelim {

        @XmlElement(required = true)
        protected TIdeEventoTrabAdmissao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAdmPrelim.InfoRegPrelim infoRegPrelim;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabAdmissao }
         *     
         */
        public TIdeEventoTrabAdmissao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabAdmissao }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabAdmissao value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoRegPrelim.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim }
         *     
         */
        public ESocial.EvtAdmPrelim.InfoRegPrelim getInfoRegPrelim() {
            return infoRegPrelim;
        }

        /**
         * Define o valor da propriedade infoRegPrelim.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim }
         *     
         */
        public void setInfoRegPrelim(ESocial.EvtAdmPrelim.InfoRegPrelim value) {
            this.infoRegPrelim = value;
        }

        /**
         * Obtém o valor da propriedade id.
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
         * Define o valor da propriedade id.
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
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cpfTrab"/>
         *         &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_codigo_esocial"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_codCateg"/>
         *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_natAtividade" minOccurs="0"/>
         *         &lt;element name="infoRegCTPS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cbo"/>
         *                   &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_vrSalFx"/>
         *                   &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_undSalFixo"/>
         *                   &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_tpContr"/>
         *                   &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "cpfTrab",
            "dtNascto",
            "dtAdm",
            "matricula",
            "codCateg",
            "natAtividade",
            "infoRegCTPS"
        })
        public static class InfoRegPrelim {

            @XmlElement(required = true)
            protected String cpfTrab;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtNascto;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAdm;
            @XmlElement(required = true)
            protected String matricula;
            @XmlElement(required = true)
            protected BigInteger codCateg;
            protected Byte natAtividade;
            protected ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS infoRegCTPS;

            /**
             * Obtém o valor da propriedade cpfTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfTrab() {
                return cpfTrab;
            }

            /**
             * Define o valor da propriedade cpfTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfTrab(String value) {
                this.cpfTrab = value;
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
             * Obtém o valor da propriedade dtAdm.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAdm() {
                return dtAdm;
            }

            /**
             * Define o valor da propriedade dtAdm.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAdm(XMLGregorianCalendar value) {
                this.dtAdm = value;
            }

            /**
             * Obtém o valor da propriedade matricula.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatricula() {
                return matricula;
            }

            /**
             * Define o valor da propriedade matricula.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatricula(String value) {
                this.matricula = value;
            }

            /**
             * Obtém o valor da propriedade codCateg.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodCateg() {
                return codCateg;
            }

            /**
             * Define o valor da propriedade codCateg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodCateg(BigInteger value) {
                this.codCateg = value;
            }

            /**
             * Obtém o valor da propriedade natAtividade.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getNatAtividade() {
                return natAtividade;
            }

            /**
             * Define o valor da propriedade natAtividade.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setNatAtividade(Byte value) {
                this.natAtividade = value;
            }

            /**
             * Obtém o valor da propriedade infoRegCTPS.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS }
             *     
             */
            public ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS getInfoRegCTPS() {
                return infoRegCTPS;
            }

            /**
             * Define o valor da propriedade infoRegCTPS.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS }
             *     
             */
            public void setInfoRegCTPS(ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS value) {
                this.infoRegCTPS = value;
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
             *         &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_cbo"/>
             *         &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_vrSalFx"/>
             *         &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_undSalFixo"/>
             *         &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_00_00}TS_tpContr"/>
             *         &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "cboCargo",
                "vrSalFx",
                "undSalFixo",
                "tpContr",
                "dtTerm"
            })
            public static class InfoRegCTPS {

                @XmlElement(name = "CBOCargo", required = true)
                protected String cboCargo;
                @XmlElement(required = true)
                protected BigDecimal vrSalFx;
                protected byte undSalFixo;
                protected byte tpContr;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTerm;

                /**
                 * Obtém o valor da propriedade cboCargo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCBOCargo() {
                    return cboCargo;
                }

                /**
                 * Define o valor da propriedade cboCargo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCBOCargo(String value) {
                    this.cboCargo = value;
                }

                /**
                 * Obtém o valor da propriedade vrSalFx.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrSalFx() {
                    return vrSalFx;
                }

                /**
                 * Define o valor da propriedade vrSalFx.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrSalFx(BigDecimal value) {
                    this.vrSalFx = value;
                }

                /**
                 * Obtém o valor da propriedade undSalFixo.
                 * 
                 */
                public byte getUndSalFixo() {
                    return undSalFixo;
                }

                /**
                 * Define o valor da propriedade undSalFixo.
                 * 
                 */
                public void setUndSalFixo(byte value) {
                    this.undSalFixo = value;
                }

                /**
                 * Obtém o valor da propriedade tpContr.
                 * 
                 */
                public byte getTpContr() {
                    return tpContr;
                }

                /**
                 * Define o valor da propriedade tpContr.
                 * 
                 */
                public void setTpContr(byte value) {
                    this.tpContr = value;
                }

                /**
                 * Obtém o valor da propriedade dtTerm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTerm() {
                    return dtTerm;
                }

                /**
                 * Define o valor da propriedade dtTerm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTerm(XMLGregorianCalendar value) {
                    this.dtTerm = value;
                }

            }

        }

    }

}
