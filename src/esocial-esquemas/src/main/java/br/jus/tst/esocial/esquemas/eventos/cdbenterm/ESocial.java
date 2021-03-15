//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:04 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenterm;

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
 *         &lt;element name="evtCdBenTerm">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}T_ideEvento_trab_PJ"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}T_ideEmpregador_cnpj"/>
 *                   &lt;element name="ideBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}T_ideBeneficio"/>
 *                   &lt;element name="infoBenTermino">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtTermBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="mtvTermino">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cnpjOrgaoSuc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
 *                             &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cpf" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_Id" />
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
    "evtCdBenTerm",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtCdBenTerm evtCdBenTerm;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtCdBenTerm.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtCdBenTerm }
     *     
     */
    public ESocial.EvtCdBenTerm getEvtCdBenTerm() {
        return evtCdBenTerm;
    }

    /**
     * Define o valor da propriedade evtCdBenTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtCdBenTerm }
     *     
     */
    public void setEvtCdBenTerm(ESocial.EvtCdBenTerm value) {
        this.evtCdBenTerm = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}T_ideEvento_trab_PJ"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}T_ideEmpregador_cnpj"/>
     *         &lt;element name="ideBeneficio" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}T_ideBeneficio"/>
     *         &lt;element name="infoBenTermino">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtTermBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="mtvTermino">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cnpjOrgaoSuc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
     *                   &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cpf" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_Id" />
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
        "ideBeneficio",
        "infoBenTermino"
    })
    public static class EvtCdBenTerm {

        @XmlElement(required = true)
        protected TIdeEventoTrabPJ ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregadorCnpj ideEmpregador;
        @XmlElement(required = true)
        protected TIdeBeneficio ideBeneficio;
        @XmlElement(required = true)
        protected ESocial.EvtCdBenTerm.InfoBenTermino infoBenTermino;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public TIdeEventoTrabPJ getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabPJ }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabPJ value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public TIdeEmpregadorCnpj getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregadorCnpj }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregadorCnpj value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade ideBeneficio.
         * 
         * @return
         *     possible object is
         *     {@link TIdeBeneficio }
         *     
         */
        public TIdeBeneficio getIdeBeneficio() {
            return ideBeneficio;
        }

        /**
         * Define o valor da propriedade ideBeneficio.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeBeneficio }
         *     
         */
        public void setIdeBeneficio(TIdeBeneficio value) {
            this.ideBeneficio = value;
        }

        /**
         * Obtém o valor da propriedade infoBenTermino.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtCdBenTerm.InfoBenTermino }
         *     
         */
        public ESocial.EvtCdBenTerm.InfoBenTermino getInfoBenTermino() {
            return infoBenTermino;
        }

        /**
         * Define o valor da propriedade infoBenTermino.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtCdBenTerm.InfoBenTermino }
         *     
         */
        public void setInfoBenTermino(ESocial.EvtCdBenTerm.InfoBenTermino value) {
            this.infoBenTermino = value;
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
         *         &lt;element name="dtTermBeneficio" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="mtvTermino">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cnpjOrgaoSuc" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
         *         &lt;element name="novoCPF" type="{http://www.esocial.gov.br/schema/evt/evtCdBenTerm/v_S_01_00_00}TS_cpf" minOccurs="0"/>
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
            "dtTermBeneficio",
            "mtvTermino",
            "cnpjOrgaoSuc",
            "novoCPF"
        })
        public static class InfoBenTermino {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtTermBeneficio;
            protected byte mtvTermino;
            protected String cnpjOrgaoSuc;
            protected String novoCPF;

            /**
             * Obtém o valor da propriedade dtTermBeneficio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtTermBeneficio() {
                return dtTermBeneficio;
            }

            /**
             * Define o valor da propriedade dtTermBeneficio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtTermBeneficio(XMLGregorianCalendar value) {
                this.dtTermBeneficio = value;
            }

            /**
             * Obtém o valor da propriedade mtvTermino.
             * 
             */
            public byte getMtvTermino() {
                return mtvTermino;
            }

            /**
             * Define o valor da propriedade mtvTermino.
             * 
             */
            public void setMtvTermino(byte value) {
                this.mtvTermino = value;
            }

            /**
             * Obtém o valor da propriedade cnpjOrgaoSuc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjOrgaoSuc() {
                return cnpjOrgaoSuc;
            }

            /**
             * Define o valor da propriedade cnpjOrgaoSuc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjOrgaoSuc(String value) {
                this.cnpjOrgaoSuc = value;
            }

            /**
             * Obtém o valor da propriedade novoCPF.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNovoCPF() {
                return novoCPF;
            }

            /**
             * Define o valor da propriedade novoCPF.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNovoCPF(String value) {
                this.novoCPF = value;
            }

        }

    }

}
