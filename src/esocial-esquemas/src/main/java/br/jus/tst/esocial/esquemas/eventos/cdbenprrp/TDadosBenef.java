//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:54 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenprrp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dados de beneficiário
 * 
 * <p>Classe Java de TDadosBenef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosBenef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosNasc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dtNascto">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="codMunic" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="uf" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="AC"/>
 *                         &lt;enumeration value="AL"/>
 *                         &lt;enumeration value="AP"/>
 *                         &lt;enumeration value="AM"/>
 *                         &lt;enumeration value="BA"/>
 *                         &lt;enumeration value="CE"/>
 *                         &lt;enumeration value="DF"/>
 *                         &lt;enumeration value="ES"/>
 *                         &lt;enumeration value="GO"/>
 *                         &lt;enumeration value="MA"/>
 *                         &lt;enumeration value="MT"/>
 *                         &lt;enumeration value="MS"/>
 *                         &lt;enumeration value="MG"/>
 *                         &lt;enumeration value="PA"/>
 *                         &lt;enumeration value="PB"/>
 *                         &lt;enumeration value="PR"/>
 *                         &lt;enumeration value="PE"/>
 *                         &lt;enumeration value="PI"/>
 *                         &lt;enumeration value="RJ"/>
 *                         &lt;enumeration value="RN"/>
 *                         &lt;enumeration value="RS"/>
 *                         &lt;enumeration value="RO"/>
 *                         &lt;enumeration value="RR"/>
 *                         &lt;enumeration value="SC"/>
 *                         &lt;enumeration value="SP"/>
 *                         &lt;enumeration value="SE"/>
 *                         &lt;enumeration value="TO"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="paisNascto">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="paisNac">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nmMae" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nmPai" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="endereco">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TEnderecoBrasil"/>
 *                     &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TEnderecoExterior"/>
 *                   &lt;/choice>
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
@XmlType(name = "TDadosBenef", namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", propOrder = {
    "dadosNasc",
    "endereco"
})
public class TDadosBenef {

    @XmlElement(required = true)
    protected TDadosBenef.DadosNasc dadosNasc;
    @XmlElement(required = true)
    protected TDadosBenef.Endereco endereco;

    /**
     * Obtém o valor da propriedade dadosNasc.
     * 
     * @return
     *     possible object is
     *     {@link TDadosBenef.DadosNasc }
     *     
     */
    public TDadosBenef.DadosNasc getDadosNasc() {
        return dadosNasc;
    }

    /**
     * Define o valor da propriedade dadosNasc.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosBenef.DadosNasc }
     *     
     */
    public void setDadosNasc(TDadosBenef.DadosNasc value) {
        this.dadosNasc = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link TDadosBenef.Endereco }
     *     
     */
    public TDadosBenef.Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosBenef.Endereco }
     *     
     */
    public void setEndereco(TDadosBenef.Endereco value) {
        this.endereco = value;
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
     *         &lt;element name="dtNascto">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="codMunic" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="uf" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="AC"/>
     *               &lt;enumeration value="AL"/>
     *               &lt;enumeration value="AP"/>
     *               &lt;enumeration value="AM"/>
     *               &lt;enumeration value="BA"/>
     *               &lt;enumeration value="CE"/>
     *               &lt;enumeration value="DF"/>
     *               &lt;enumeration value="ES"/>
     *               &lt;enumeration value="GO"/>
     *               &lt;enumeration value="MA"/>
     *               &lt;enumeration value="MT"/>
     *               &lt;enumeration value="MS"/>
     *               &lt;enumeration value="MG"/>
     *               &lt;enumeration value="PA"/>
     *               &lt;enumeration value="PB"/>
     *               &lt;enumeration value="PR"/>
     *               &lt;enumeration value="PE"/>
     *               &lt;enumeration value="PI"/>
     *               &lt;enumeration value="RJ"/>
     *               &lt;enumeration value="RN"/>
     *               &lt;enumeration value="RS"/>
     *               &lt;enumeration value="RO"/>
     *               &lt;enumeration value="RR"/>
     *               &lt;enumeration value="SC"/>
     *               &lt;enumeration value="SP"/>
     *               &lt;enumeration value="SE"/>
     *               &lt;enumeration value="TO"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="paisNascto">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="paisNac">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nmMae" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nmPai" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="70"/>
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
        "dtNascto",
        "codMunic",
        "uf",
        "paisNascto",
        "paisNac",
        "nmMae",
        "nmPai"
    })
    public static class DadosNasc {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected XMLGregorianCalendar dtNascto;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
        protected BigInteger codMunic;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
        protected String uf;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected String paisNascto;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected String paisNac;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
        protected String nmMae;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
        protected String nmPai;

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
         * Obtém o valor da propriedade codMunic.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodMunic() {
            return codMunic;
        }

        /**
         * Define o valor da propriedade codMunic.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodMunic(BigInteger value) {
            this.codMunic = value;
        }

        /**
         * Obtém o valor da propriedade uf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUf() {
            return uf;
        }

        /**
         * Define o valor da propriedade uf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUf(String value) {
            this.uf = value;
        }

        /**
         * Obtém o valor da propriedade paisNascto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaisNascto() {
            return paisNascto;
        }

        /**
         * Define o valor da propriedade paisNascto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaisNascto(String value) {
            this.paisNascto = value;
        }

        /**
         * Obtém o valor da propriedade paisNac.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaisNac() {
            return paisNac;
        }

        /**
         * Define o valor da propriedade paisNac.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaisNac(String value) {
            this.paisNac = value;
        }

        /**
         * Obtém o valor da propriedade nmMae.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmMae() {
            return nmMae;
        }

        /**
         * Define o valor da propriedade nmMae.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmMae(String value) {
            this.nmMae = value;
        }

        /**
         * Obtém o valor da propriedade nmPai.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmPai() {
            return nmPai;
        }

        /**
         * Define o valor da propriedade nmPai.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmPai(String value) {
            this.nmPai = value;
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
     *         &lt;choice>
     *           &lt;element name="brasil" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TEnderecoBrasil"/>
     *           &lt;element name="exterior" type="{http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02}TEnderecoExterior"/>
     *         &lt;/choice>
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
        "brasil",
        "exterior"
    })
    public static class Endereco {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
        protected TEnderecoBrasil brasil;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02")
        protected TEnderecoExterior exterior;

        /**
         * Obtém o valor da propriedade brasil.
         * 
         * @return
         *     possible object is
         *     {@link TEnderecoBrasil }
         *     
         */
        public TEnderecoBrasil getBrasil() {
            return brasil;
        }

        /**
         * Define o valor da propriedade brasil.
         * 
         * @param value
         *     allowed object is
         *     {@link TEnderecoBrasil }
         *     
         */
        public void setBrasil(TEnderecoBrasil value) {
            this.brasil = value;
        }

        /**
         * Obtém o valor da propriedade exterior.
         * 
         * @return
         *     possible object is
         *     {@link TEnderecoExterior }
         *     
         */
        public TEnderecoExterior getExterior() {
            return exterior;
        }

        /**
         * Define o valor da propriedade exterior.
         * 
         * @param value
         *     allowed object is
         *     {@link TEnderecoExterior }
         *     
         */
        public void setExterior(TEnderecoExterior value) {
            this.exterior = value;
        }

    }

}
