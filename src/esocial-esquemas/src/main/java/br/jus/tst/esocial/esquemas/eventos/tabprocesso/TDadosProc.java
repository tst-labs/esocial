//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:10 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabprocesso;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dados do processo
 * 
 * <p>Classe Java de TDadosProc complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosProc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indAutoria" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indMatProc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d{1,2}"/>
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
 *         &lt;element name="dadosProcJud" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ufVara">
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
 *                   &lt;element name="codMunic">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="idVara">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;pattern value="\d{1,4}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoSusp" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codSusp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;pattern value="\d{1,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="indSusp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d{2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtDecisao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="indDeposito">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                         &lt;pattern value="[N|S]"/>
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
@XmlType(name = "TDadosProc", namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", propOrder = {
    "indAutoria",
    "indMatProc",
    "observacao",
    "dadosProcJud",
    "infoSusp"
})
public class TDadosProc {

    protected Byte indAutoria;
    protected byte indMatProc;
    protected String observacao;
    protected TDadosProc.DadosProcJud dadosProcJud;
    protected List<TDadosProc.InfoSusp> infoSusp;

    /**
     * Obtém o valor da propriedade indAutoria.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndAutoria() {
        return indAutoria;
    }

    /**
     * Define o valor da propriedade indAutoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndAutoria(Byte value) {
        this.indAutoria = value;
    }

    /**
     * Obtém o valor da propriedade indMatProc.
     * 
     */
    public byte getIndMatProc() {
        return indMatProc;
    }

    /**
     * Define o valor da propriedade indMatProc.
     * 
     */
    public void setIndMatProc(byte value) {
        this.indMatProc = value;
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
     * Obtém o valor da propriedade dadosProcJud.
     * 
     * @return
     *     possible object is
     *     {@link TDadosProc.DadosProcJud }
     *     
     */
    public TDadosProc.DadosProcJud getDadosProcJud() {
        return dadosProcJud;
    }

    /**
     * Define o valor da propriedade dadosProcJud.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosProc.DadosProcJud }
     *     
     */
    public void setDadosProcJud(TDadosProc.DadosProcJud value) {
        this.dadosProcJud = value;
    }

    /**
     * Gets the value of the infoSusp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoSusp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoSusp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosProc.InfoSusp }
     * 
     * 
     */
    public List<TDadosProc.InfoSusp> getInfoSusp() {
        if (infoSusp == null) {
            infoSusp = new ArrayList<TDadosProc.InfoSusp>();
        }
        return this.infoSusp;
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
     *         &lt;element name="ufVara">
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
     *         &lt;element name="codMunic">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="idVara">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;pattern value="\d{1,4}"/>
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
        "ufVara",
        "codMunic",
        "idVara"
    })
    public static class DadosProcJud {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", required = true)
        protected String ufVara;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", required = true)
        protected BigInteger codMunic;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", required = true)
        protected BigInteger idVara;

        /**
         * Obtém o valor da propriedade ufVara.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUfVara() {
            return ufVara;
        }

        /**
         * Define o valor da propriedade ufVara.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUfVara(String value) {
            this.ufVara = value;
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
         * Obtém o valor da propriedade idVara.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIdVara() {
            return idVara;
        }

        /**
         * Define o valor da propriedade idVara.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdVara(BigInteger value) {
            this.idVara = value;
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
     *         &lt;element name="codSusp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;pattern value="\d{1,14}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="indSusp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d{2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtDecisao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="indDeposito">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *               &lt;pattern value="[N|S]"/>
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
        "codSusp",
        "indSusp",
        "dtDecisao",
        "indDeposito"
    })
    public static class InfoSusp {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", required = true)
        protected BigInteger codSusp;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", required = true)
        protected String indSusp;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", required = true)
        protected XMLGregorianCalendar dtDecisao;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_04_02", required = true)
        protected String indDeposito;

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

        /**
         * Obtém o valor da propriedade indSusp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndSusp() {
            return indSusp;
        }

        /**
         * Define o valor da propriedade indSusp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndSusp(String value) {
            this.indSusp = value;
        }

        /**
         * Obtém o valor da propriedade dtDecisao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDtDecisao() {
            return dtDecisao;
        }

        /**
         * Define o valor da propriedade dtDecisao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDtDecisao(XMLGregorianCalendar value) {
            this.dtDecisao = value;
        }

        /**
         * Obtém o valor da propriedade indDeposito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndDeposito() {
            return indDeposito;
        }

        /**
         * Define o valor da propriedade indDeposito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndDeposito(String value) {
            this.indDeposito = value;
        }

    }

}
