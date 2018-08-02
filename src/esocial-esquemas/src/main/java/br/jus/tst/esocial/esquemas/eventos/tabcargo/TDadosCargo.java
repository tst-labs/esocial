//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:07 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabcargo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informações do Cargo
 * 
 * <p>Classe Java de TDadosCargo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosCargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nmCargo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCBO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{4,6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cargoPublico" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="acumCargo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="contagemEsp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dedicExcl">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[N|S]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="leiCargo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrLei">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dtLei">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="sitCargo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d"/>
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
@XmlType(name = "TDadosCargo", namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", propOrder = {
    "nmCargo",
    "codCBO",
    "cargoPublico"
})
public class TDadosCargo {

    @XmlElement(required = true)
    protected String nmCargo;
    @XmlElement(required = true)
    protected String codCBO;
    protected TDadosCargo.CargoPublico cargoPublico;

    /**
     * Obtém o valor da propriedade nmCargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmCargo() {
        return nmCargo;
    }

    /**
     * Define o valor da propriedade nmCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmCargo(String value) {
        this.nmCargo = value;
    }

    /**
     * Obtém o valor da propriedade codCBO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCBO() {
        return codCBO;
    }

    /**
     * Define o valor da propriedade codCBO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCBO(String value) {
        this.codCBO = value;
    }

    /**
     * Obtém o valor da propriedade cargoPublico.
     * 
     * @return
     *     possible object is
     *     {@link TDadosCargo.CargoPublico }
     *     
     */
    public TDadosCargo.CargoPublico getCargoPublico() {
        return cargoPublico;
    }

    /**
     * Define o valor da propriedade cargoPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosCargo.CargoPublico }
     *     
     */
    public void setCargoPublico(TDadosCargo.CargoPublico value) {
        this.cargoPublico = value;
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
     *         &lt;element name="acumCargo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="contagemEsp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dedicExcl">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[N|S]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="leiCargo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrLei">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dtLei">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="sitCargo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d"/>
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
        "acumCargo",
        "contagemEsp",
        "dedicExcl",
        "leiCargo"
    })
    public static class CargoPublico {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
        protected byte acumCargo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
        protected byte contagemEsp;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
        protected String dedicExcl;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
        protected TDadosCargo.CargoPublico.LeiCargo leiCargo;

        /**
         * Obtém o valor da propriedade acumCargo.
         * 
         */
        public byte getAcumCargo() {
            return acumCargo;
        }

        /**
         * Define o valor da propriedade acumCargo.
         * 
         */
        public void setAcumCargo(byte value) {
            this.acumCargo = value;
        }

        /**
         * Obtém o valor da propriedade contagemEsp.
         * 
         */
        public byte getContagemEsp() {
            return contagemEsp;
        }

        /**
         * Define o valor da propriedade contagemEsp.
         * 
         */
        public void setContagemEsp(byte value) {
            this.contagemEsp = value;
        }

        /**
         * Obtém o valor da propriedade dedicExcl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDedicExcl() {
            return dedicExcl;
        }

        /**
         * Define o valor da propriedade dedicExcl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDedicExcl(String value) {
            this.dedicExcl = value;
        }

        /**
         * Obtém o valor da propriedade leiCargo.
         * 
         * @return
         *     possible object is
         *     {@link TDadosCargo.CargoPublico.LeiCargo }
         *     
         */
        public TDadosCargo.CargoPublico.LeiCargo getLeiCargo() {
            return leiCargo;
        }

        /**
         * Define o valor da propriedade leiCargo.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosCargo.CargoPublico.LeiCargo }
         *     
         */
        public void setLeiCargo(TDadosCargo.CargoPublico.LeiCargo value) {
            this.leiCargo = value;
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
         *         &lt;element name="nrLei">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="12"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dtLei">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="sitCargo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d"/>
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
            "nrLei",
            "dtLei",
            "sitCargo"
        })
        public static class LeiCargo {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
            protected String nrLei;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02", required = true)
            protected XMLGregorianCalendar dtLei;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabCargo/v02_04_02")
            protected byte sitCargo;

            /**
             * Obtém o valor da propriedade nrLei.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrLei() {
                return nrLei;
            }

            /**
             * Define o valor da propriedade nrLei.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrLei(String value) {
                this.nrLei = value;
            }

            /**
             * Obtém o valor da propriedade dtLei.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtLei() {
                return dtLei;
            }

            /**
             * Define o valor da propriedade dtLei.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtLei(XMLGregorianCalendar value) {
                this.dtLei = value;
            }

            /**
             * Obtém o valor da propriedade sitCargo.
             * 
             */
            public byte getSitCargo() {
                return sitCargo;
            }

            /**
             * Define o valor da propriedade sitCargo.
             * 
             */
            public void setSitCargo(byte value) {
                this.sitCargo = value;
            }

        }

    }

}
