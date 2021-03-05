//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:16 PM BRT 
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
 * Detalhamento das informações do empregador.
 * 
 * <p>Classe Java de T_infoCadastro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
 *         &lt;element name="indCoop" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_indCoop" minOccurs="0"/>
 *         &lt;element name="indConstr" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_indConstr" minOccurs="0"/>
 *         &lt;element name="indDesFolha">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
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
 *         &lt;element name="cnpjEFR" type="{http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v_S_01_00_00}TS_cnpj" minOccurs="0"/>
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
    protected TInfoCadastro.DadosIsencao dadosIsencao;
    protected TInfoCadastro.InfoOrgInternacional infoOrgInternacional;

    /**
     * Obtém o valor da propriedade classTrib.
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
     * Define o valor da propriedade classTrib.
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
     * Obtém o valor da propriedade indCoop.
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
     * Define o valor da propriedade indCoop.
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
     * Obtém o valor da propriedade indConstr.
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
     * Define o valor da propriedade indConstr.
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
     * Obtém o valor da propriedade indDesFolha.
     * 
     */
    public byte getIndDesFolha() {
        return indDesFolha;
    }

    /**
     * Define o valor da propriedade indDesFolha.
     * 
     */
    public void setIndDesFolha(byte value) {
        this.indDesFolha = value;
    }

    /**
     * Obtém o valor da propriedade indOpcCP.
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
     * Define o valor da propriedade indOpcCP.
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
     * Obtém o valor da propriedade indPorte.
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
     * Define o valor da propriedade indPorte.
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
     * Obtém o valor da propriedade indOptRegEletron.
     * 
     */
    public byte getIndOptRegEletron() {
        return indOptRegEletron;
    }

    /**
     * Define o valor da propriedade indOptRegEletron.
     * 
     */
    public void setIndOptRegEletron(byte value) {
        this.indOptRegEletron = value;
    }

    /**
     * Obtém o valor da propriedade cnpjEFR.
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
     * Define o valor da propriedade cnpjEFR.
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
     * Obtém o valor da propriedade dadosIsencao.
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
     * Define o valor da propriedade dadosIsencao.
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
     * Obtém o valor da propriedade infoOrgInternacional.
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
     * Define o valor da propriedade infoOrgInternacional.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * Obtém o valor da propriedade ideMinLei.
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
         * Define o valor da propriedade ideMinLei.
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
         * Obtém o valor da propriedade nrCertif.
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
         * Define o valor da propriedade nrCertif.
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
         * Obtém o valor da propriedade dtEmisCertif.
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
         * Define o valor da propriedade dtEmisCertif.
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
         * Obtém o valor da propriedade dtVencCertif.
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
         * Define o valor da propriedade dtVencCertif.
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
         * Obtém o valor da propriedade nrProtRenov.
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
         * Define o valor da propriedade nrProtRenov.
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
         * Obtém o valor da propriedade dtProtRenov.
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
         * Define o valor da propriedade dtProtRenov.
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
         * Obtém o valor da propriedade dtDou.
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
         * Define o valor da propriedade dtDou.
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
         * Obtém o valor da propriedade pagDou.
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
         * Define o valor da propriedade pagDou.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * Obtém o valor da propriedade indAcordoIsenMulta.
         * 
         */
        public byte getIndAcordoIsenMulta() {
            return indAcordoIsenMulta;
        }

        /**
         * Define o valor da propriedade indAcordoIsenMulta.
         * 
         */
        public void setIndAcordoIsenMulta(byte value) {
            this.indAcordoIsenMulta = value;
        }

    }

}
