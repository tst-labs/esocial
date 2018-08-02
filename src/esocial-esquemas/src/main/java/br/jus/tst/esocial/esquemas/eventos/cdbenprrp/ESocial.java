//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:54 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenprrp;

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
 *         &lt;element name="evtCdBenPrRP">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TEmprPJ"/>
 *                   &lt;element name="ideBenef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nmBenefic">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="70"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dadosBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBenef"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoBeneficio">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpPlanRP">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="iniBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBeneficio" minOccurs="0"/>
 *                             &lt;element name="altBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBeneficio" minOccurs="0"/>
 *                             &lt;element name="fimBeneficio" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpBenef">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d{1,2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="nrBenefic">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="3"/>
 *                                             &lt;maxLength value="20"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dtFimBenef">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="mtvFim">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;pattern value="\d{1,2}"/>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
    "evtCdBenPrRP",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
    protected ESocial.EvtCdBenPrRP evtCdBenPrRP;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCdBenPrRP.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCdBenPrRP }
     *     
     */
    public ESocial.EvtCdBenPrRP getEvtCdBenPrRP() {
        return evtCdBenPrRP;
    }

    /**
     * Define o valor da propriedade evtCdBenPrRP.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCdBenPrRP }
     *     
     */
    public void setEvtCdBenPrRP(ESocial.EvtCdBenPrRP value) {
        this.evtCdBenPrRP = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TEmprPJ"/>
     *         &lt;element name="ideBenef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nmBenefic">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="70"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dadosBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBenef"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoBeneficio">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpPlanRP">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="iniBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBeneficio" minOccurs="0"/>
     *                   &lt;element name="altBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBeneficio" minOccurs="0"/>
     *                   &lt;element name="fimBeneficio" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpBenef">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d{1,2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="nrBenefic">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="3"/>
     *                                   &lt;maxLength value="20"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dtFimBenef">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="mtvFim">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;pattern value="\d{1,2}"/>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
        "ideBenef",
        "infoBeneficio"
    })
    public static class EvtCdBenPrRP {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected TEmprPJ ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected ESocial.EvtCdBenPrRP.IdeBenef ideBenef;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected ESocial.EvtCdBenPrRP.InfoBeneficio infoBeneficio;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEveTrab }
         *     
         */
        public TIdeEveTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEveTrab }
         *     
         */
        public void setIdeEvento(TIdeEveTrab value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TEmprPJ }
         *     
         */
        public TEmprPJ getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TEmprPJ }
         *     
         */
        public void setIdeEmpregador(TEmprPJ value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideBenef.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenPrRP.IdeBenef }
         *     
         */
        public ESocial.EvtCdBenPrRP.IdeBenef getIdeBenef() {
            return ideBenef;
        }

        /**
         * Define o valor da propriedade ideBenef.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenPrRP.IdeBenef }
         *     
         */
        public void setIdeBenef(ESocial.EvtCdBenPrRP.IdeBenef value) {
            this.ideBenef = value;
        }

        /**
         * Obtém o valor da propriedade infoBeneficio.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenPrRP.InfoBeneficio }
         *     
         */
        public ESocial.EvtCdBenPrRP.InfoBeneficio getInfoBeneficio() {
            return infoBeneficio;
        }

        /**
         * Define o valor da propriedade infoBeneficio.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenPrRP.InfoBeneficio }
         *     
         */
        public void setInfoBeneficio(ESocial.EvtCdBenPrRP.InfoBeneficio value) {
            this.infoBeneficio = value;
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
         *         &lt;element name="cpfBenef">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nmBenefic">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="70"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dadosBenef" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBenef"/>
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
            "cpfBenef",
            "nmBenefic",
            "dadosBenef"
        })
        public static class IdeBenef {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
            protected String cpfBenef;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
            protected String nmBenefic;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
            protected TDadosBenef dadosBenef;

            /**
             * Obtém o valor da propriedade cpfBenef.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfBenef() {
                return cpfBenef;
            }

            /**
             * Define o valor da propriedade cpfBenef.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfBenef(String value) {
                this.cpfBenef = value;
            }

            /**
             * Obtém o valor da propriedade nmBenefic.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmBenefic() {
                return nmBenefic;
            }

            /**
             * Define o valor da propriedade nmBenefic.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmBenefic(String value) {
                this.nmBenefic = value;
            }

            /**
             * Obtém o valor da propriedade dadosBenef.
             * 
             * @return
             *     possible object is
             *     {@link TDadosBenef }
             *     
             */
            public TDadosBenef getDadosBenef() {
                return dadosBenef;
            }

            /**
             * Define o valor da propriedade dadosBenef.
             * 
             * @param value
             *     allowed object is
             *     {@link TDadosBenef }
             *     
             */
            public void setDadosBenef(TDadosBenef value) {
                this.dadosBenef = value;
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
         *         &lt;element name="tpPlanRP">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="iniBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBeneficio" minOccurs="0"/>
         *         &lt;element name="altBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TDadosBeneficio" minOccurs="0"/>
         *         &lt;element name="fimBeneficio" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpBenef">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d{1,2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nrBenefic">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="3"/>
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dtFimBenef">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="mtvFim">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;pattern value="\d{1,2}"/>
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
            "tpPlanRP",
            "iniBeneficio",
            "altBeneficio",
            "fimBeneficio"
        })
        public static class InfoBeneficio {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
            protected byte tpPlanRP;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
            protected TDadosBeneficio iniBeneficio;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
            protected TDadosBeneficio altBeneficio;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
            protected ESocial.EvtCdBenPrRP.InfoBeneficio.FimBeneficio fimBeneficio;

            /**
             * Obtém o valor da propriedade tpPlanRP.
             * 
             */
            public byte getTpPlanRP() {
                return tpPlanRP;
            }

            /**
             * Define o valor da propriedade tpPlanRP.
             * 
             */
            public void setTpPlanRP(byte value) {
                this.tpPlanRP = value;
            }

            /**
             * Obtém o valor da propriedade iniBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link TDadosBeneficio }
             *     
             */
            public TDadosBeneficio getIniBeneficio() {
                return iniBeneficio;
            }

            /**
             * Define o valor da propriedade iniBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link TDadosBeneficio }
             *     
             */
            public void setIniBeneficio(TDadosBeneficio value) {
                this.iniBeneficio = value;
            }

            /**
             * Obtém o valor da propriedade altBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link TDadosBeneficio }
             *     
             */
            public TDadosBeneficio getAltBeneficio() {
                return altBeneficio;
            }

            /**
             * Define o valor da propriedade altBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link TDadosBeneficio }
             *     
             */
            public void setAltBeneficio(TDadosBeneficio value) {
                this.altBeneficio = value;
            }

            /**
             * Obtém o valor da propriedade fimBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtCdBenPrRP.InfoBeneficio.FimBeneficio }
             *     
             */
            public ESocial.EvtCdBenPrRP.InfoBeneficio.FimBeneficio getFimBeneficio() {
                return fimBeneficio;
            }

            /**
             * Define o valor da propriedade fimBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtCdBenPrRP.InfoBeneficio.FimBeneficio }
             *     
             */
            public void setFimBeneficio(ESocial.EvtCdBenPrRP.InfoBeneficio.FimBeneficio value) {
                this.fimBeneficio = value;
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
             *         &lt;element name="tpBenef">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d{1,2}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nrBenefic">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="3"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dtFimBenef">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="mtvFim">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;pattern value="\d{1,2}"/>
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
                "tpBenef",
                "nrBenefic",
                "dtFimBenef",
                "mtvFim"
            })
            public static class FimBeneficio {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
                protected byte tpBenef;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
                protected String nrBenefic;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
                protected XMLGregorianCalendar dtFimBenef;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
                protected byte mtvFim;

                /**
                 * Obtém o valor da propriedade tpBenef.
                 * 
                 */
                public byte getTpBenef() {
                    return tpBenef;
                }

                /**
                 * Define o valor da propriedade tpBenef.
                 * 
                 */
                public void setTpBenef(byte value) {
                    this.tpBenef = value;
                }

                /**
                 * Obtém o valor da propriedade nrBenefic.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrBenefic() {
                    return nrBenefic;
                }

                /**
                 * Define o valor da propriedade nrBenefic.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrBenefic(String value) {
                    this.nrBenefic = value;
                }

                /**
                 * Obtém o valor da propriedade dtFimBenef.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtFimBenef() {
                    return dtFimBenef;
                }

                /**
                 * Define o valor da propriedade dtFimBenef.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtFimBenef(XMLGregorianCalendar value) {
                    this.dtFimBenef = value;
                }

                /**
                 * Obtém o valor da propriedade mtvFim.
                 * 
                 */
                public byte getMtvFim() {
                    return mtvFim;
                }

                /**
                 * Define o valor da propriedade mtvFim.
                 * 
                 */
                public void setMtvFim(byte value) {
                    this.mtvFim = value;
                }

            }

        }

    }

}
