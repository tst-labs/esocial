//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.03 at 06:57:34 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.infoempregador;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * CONDICAO_GRUPO: N (se {procEmi}(1000_ideEvento_procEmi) = [8]); O (nos demais casos).
 * 
 * <p>Java class for T_infoCadastro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_infoCadastro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classTrib">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indCoop" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_indCoop" minOccurs="0"/>
 *         &lt;element name="indConstr" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_indConstr" minOccurs="0"/>
 *         &lt;element name="indDesFolha">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indOpcCP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indPorte" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indOptRegEletron">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cnpjEFR" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_03_00}TS_cnpj" minOccurs="0"/>
 *         &lt;element name="dtTrans11096" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="indTribFolhaPisPasep" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indPertIRRF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dadosIsencao" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideMinLei">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="70"/>
 *                         &lt;pattern value=".*[^\s].*"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrCertif">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="40"/>
 *                         &lt;pattern value=".*[^\s].*"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtEmisCertif" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="dtVencCertif" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="nrProtRenov" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="40"/>
 *                         &lt;pattern value=".*[^\s].*"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtProtRenov" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="dtDou" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="pagDou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;pattern value="\d{1,5}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoOrgInternacional" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indAcordoIsenMulta">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
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
@XmlType(name = "T_infoCadastro", propOrder = {
    "classTrib",
    "indCoop",
    "indConstr",
    "indDesFolha",
    "indOpcCP",
    "indPorte",
    "indOptRegEletron",
    "cnpjEFR",
    "dtTrans11096",
    "indTribFolhaPisPasep",
    "indPertIRRF",
    "dadosIsencao",
    "infoOrgInternacional"
})
public class TInfoCadastro {

    @XmlElement(required = true)
    protected String classTrib;
    protected Byte indCoop;
    protected Byte indConstr;
    protected byte indDesFolha;
    protected Byte indOpcCP;
    protected String indPorte;
    protected byte indOptRegEletron;
    protected String cnpjEFR;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtTrans11096;
    protected String indTribFolhaPisPasep;
    protected String indPertIRRF;
    protected TInfoCadastro.DadosIsencao dadosIsencao;
    protected TInfoCadastro.InfoOrgInternacional infoOrgInternacional;

    /**
     * Gets the value of the classTrib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassTrib() {
        return classTrib;
    }

    /**
     * Sets the value of the classTrib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassTrib(String value) {
        this.classTrib = value;
    }

    /**
     * Gets the value of the indCoop property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndCoop() {
        return indCoop;
    }

    /**
     * Sets the value of the indCoop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndCoop(Byte value) {
        this.indCoop = value;
    }

    /**
     * Gets the value of the indConstr property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndConstr() {
        return indConstr;
    }

    /**
     * Sets the value of the indConstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndConstr(Byte value) {
        this.indConstr = value;
    }

    /**
     * Gets the value of the indDesFolha property.
     * 
     */
    public byte getIndDesFolha() {
        return indDesFolha;
    }

    /**
     * Sets the value of the indDesFolha property.
     * 
     */
    public void setIndDesFolha(byte value) {
        this.indDesFolha = value;
    }

    /**
     * Gets the value of the indOpcCP property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndOpcCP() {
        return indOpcCP;
    }

    /**
     * Sets the value of the indOpcCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndOpcCP(Byte value) {
        this.indOpcCP = value;
    }

    /**
     * Gets the value of the indPorte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPorte() {
        return indPorte;
    }

    /**
     * Sets the value of the indPorte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPorte(String value) {
        this.indPorte = value;
    }

    /**
     * Gets the value of the indOptRegEletron property.
     * 
     */
    public byte getIndOptRegEletron() {
        return indOptRegEletron;
    }

    /**
     * Sets the value of the indOptRegEletron property.
     * 
     */
    public void setIndOptRegEletron(byte value) {
        this.indOptRegEletron = value;
    }

    /**
     * Gets the value of the cnpjEFR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEFR() {
        return cnpjEFR;
    }

    /**
     * Sets the value of the cnpjEFR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEFR(String value) {
        this.cnpjEFR = value;
    }

    /**
     * Gets the value of the dtTrans11096 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTrans11096() {
        return dtTrans11096;
    }

    /**
     * Sets the value of the dtTrans11096 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTrans11096(XMLGregorianCalendar value) {
        this.dtTrans11096 = value;
    }

    /**
     * Gets the value of the indTribFolhaPisPasep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndTribFolhaPisPasep() {
        return indTribFolhaPisPasep;
    }

    /**
     * Sets the value of the indTribFolhaPisPasep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndTribFolhaPisPasep(String value) {
        this.indTribFolhaPisPasep = value;
    }

    /**
     * Gets the value of the indPertIRRF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPertIRRF() {
        return indPertIRRF;
    }

    /**
     * Sets the value of the indPertIRRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPertIRRF(String value) {
        this.indPertIRRF = value;
    }

    /**
     * Gets the value of the dadosIsencao property.
     * 
     * @return
     *     possible object is
     *     {@link TInfoCadastro.DadosIsencao }
     *     
     */
    public TInfoCadastro.DadosIsencao getDadosIsencao() {
        return dadosIsencao;
    }

    /**
     * Sets the value of the dadosIsencao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoCadastro.DadosIsencao }
     *     
     */
    public void setDadosIsencao(TInfoCadastro.DadosIsencao value) {
        this.dadosIsencao = value;
    }

    /**
     * Gets the value of the infoOrgInternacional property.
     * 
     * @return
     *     possible object is
     *     {@link TInfoCadastro.InfoOrgInternacional }
     *     
     */
    public TInfoCadastro.InfoOrgInternacional getInfoOrgInternacional() {
        return infoOrgInternacional;
    }

    /**
     * Sets the value of the infoOrgInternacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoCadastro.InfoOrgInternacional }
     *     
     */
    public void setInfoOrgInternacional(TInfoCadastro.InfoOrgInternacional value) {
        this.infoOrgInternacional = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideMinLei">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="70"/>
     *               &lt;pattern value=".*[^\s].*"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrCertif">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="40"/>
     *               &lt;pattern value=".*[^\s].*"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtEmisCertif" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="dtVencCertif" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="nrProtRenov" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="40"/>
     *               &lt;pattern value=".*[^\s].*"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtProtRenov" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="dtDou" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="pagDou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;pattern value="\d{1,5}"/>
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
        "ideMinLei",
        "nrCertif",
        "dtEmisCertif",
        "dtVencCertif",
        "nrProtRenov",
        "dtProtRenov",
        "dtDou",
        "pagDou"
    })
    public static class DadosIsencao {

        @XmlElement(required = true)
        protected String ideMinLei;
        @XmlElement(required = true)
        protected String nrCertif;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dtEmisCertif;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dtVencCertif;
        protected String nrProtRenov;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dtProtRenov;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dtDou;
        protected BigInteger pagDou;

        /**
         * Gets the value of the ideMinLei property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeMinLei() {
            return ideMinLei;
        }

        /**
         * Sets the value of the ideMinLei property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeMinLei(String value) {
            this.ideMinLei = value;
        }

        /**
         * Gets the value of the nrCertif property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrCertif() {
            return nrCertif;
        }

        /**
         * Sets the value of the nrCertif property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrCertif(String value) {
            this.nrCertif = value;
        }

        /**
         * Gets the value of the dtEmisCertif property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDtEmisCertif() {
            return dtEmisCertif;
        }

        /**
         * Sets the value of the dtEmisCertif property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDtEmisCertif(XMLGregorianCalendar value) {
            this.dtEmisCertif = value;
        }

        /**
         * Gets the value of the dtVencCertif property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDtVencCertif() {
            return dtVencCertif;
        }

        /**
         * Sets the value of the dtVencCertif property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDtVencCertif(XMLGregorianCalendar value) {
            this.dtVencCertif = value;
        }

        /**
         * Gets the value of the nrProtRenov property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProtRenov() {
            return nrProtRenov;
        }

        /**
         * Sets the value of the nrProtRenov property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProtRenov(String value) {
            this.nrProtRenov = value;
        }

        /**
         * Gets the value of the dtProtRenov property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDtProtRenov() {
            return dtProtRenov;
        }

        /**
         * Sets the value of the dtProtRenov property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDtProtRenov(XMLGregorianCalendar value) {
            this.dtProtRenov = value;
        }

        /**
         * Gets the value of the dtDou property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDtDou() {
            return dtDou;
        }

        /**
         * Sets the value of the dtDou property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDtDou(XMLGregorianCalendar value) {
            this.dtDou = value;
        }

        /**
         * Gets the value of the pagDou property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPagDou() {
            return pagDou;
        }

        /**
         * Sets the value of the pagDou property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPagDou(BigInteger value) {
            this.pagDou = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="indAcordoIsenMulta">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
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
        "indAcordoIsenMulta"
    })
    public static class InfoOrgInternacional {

        protected byte indAcordoIsenMulta;

        /**
         * Gets the value of the indAcordoIsenMulta property.
         * 
         */
        public byte getIndAcordoIsenMulta() {
            return indAcordoIsenMulta;
        }

        /**
         * Sets the value of the indAcordoIsenMulta property.
         * 
         */
        public void setIndAcordoIsenMulta(byte value) {
            this.indAcordoIsenMulta = value;
        }

    }

}
