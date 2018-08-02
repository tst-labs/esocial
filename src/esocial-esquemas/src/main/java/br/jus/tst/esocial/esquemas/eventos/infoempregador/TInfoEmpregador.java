//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:59 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.infoempregador;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informações do Empregador
 * 
 * <p>Classe Java de TInfoEmpregador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TInfoEmpregador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nmRazao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="classTrib">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="natJurid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indCoop" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indConstr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indDesFolha">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indOptRegEletron">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indEntEd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indEtt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrRegEtt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2,30}"/>
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
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrCertif">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtEmisCertif">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtVencCertif">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nrProtRenov" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtProtRenov" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtDou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pagDou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;totalDigits value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contato">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nmCtt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cpfCtt">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="11"/>
 *                         &lt;pattern value="\d{11}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="foneFixo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="8"/>
 *                         &lt;maxLength value="13"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="foneCel" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="8"/>
 *                         &lt;maxLength value="13"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="6"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoOP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrSiafi">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\w{1,6}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="infoEFR" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ideEFR">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cnpjEFR" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{8,14}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoEnte" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nmEnte">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="uf">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="AC"/>
 *                                   &lt;enumeration value="AL"/>
 *                                   &lt;enumeration value="AP"/>
 *                                   &lt;enumeration value="AM"/>
 *                                   &lt;enumeration value="BA"/>
 *                                   &lt;enumeration value="CE"/>
 *                                   &lt;enumeration value="DF"/>
 *                                   &lt;enumeration value="ES"/>
 *                                   &lt;enumeration value="GO"/>
 *                                   &lt;enumeration value="MA"/>
 *                                   &lt;enumeration value="MT"/>
 *                                   &lt;enumeration value="MS"/>
 *                                   &lt;enumeration value="MG"/>
 *                                   &lt;enumeration value="PA"/>
 *                                   &lt;enumeration value="PB"/>
 *                                   &lt;enumeration value="PR"/>
 *                                   &lt;enumeration value="PE"/>
 *                                   &lt;enumeration value="PI"/>
 *                                   &lt;enumeration value="RJ"/>
 *                                   &lt;enumeration value="RN"/>
 *                                   &lt;enumeration value="RS"/>
 *                                   &lt;enumeration value="RO"/>
 *                                   &lt;enumeration value="RR"/>
 *                                   &lt;enumeration value="SC"/>
 *                                   &lt;enumeration value="SP"/>
 *                                   &lt;enumeration value="SE"/>
 *                                   &lt;enumeration value="TO"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="codMunic" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indRPPS">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="subteto">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;pattern value="\d{1}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="vrSubteto">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="14"/>
 *                                   &lt;fractionDigits value="2"/>
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
 *         &lt;element name="infoOrgInternacional" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indAcordoIsenMulta">
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
 *         &lt;element name="softwareHouse" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cnpjSoftHouse">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="14"/>
 *                         &lt;pattern value="\d{8,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nmRazao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nmCont">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="telefone">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="8"/>
 *                         &lt;maxLength value="13"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="6"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infoComplementares">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="situacaoPJ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indSitPJ">
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
 *                   &lt;element name="situacaoPF" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="indSitPF">
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
@XmlType(name = "TInfoEmpregador", namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", propOrder = {
    "nmRazao",
    "classTrib",
    "natJurid",
    "indCoop",
    "indConstr",
    "indDesFolha",
    "indOptRegEletron",
    "indEntEd",
    "indEtt",
    "nrRegEtt",
    "dadosIsencao",
    "contato",
    "infoOP",
    "infoOrgInternacional",
    "softwareHouse",
    "infoComplementares"
})
public class TInfoEmpregador {

    @XmlElement(required = true)
    protected String nmRazao;
    @XmlElement(required = true)
    protected String classTrib;
    protected String natJurid;
    protected Byte indCoop;
    protected Byte indConstr;
    protected byte indDesFolha;
    protected byte indOptRegEletron;
    protected String indEntEd;
    @XmlElement(required = true)
    protected String indEtt;
    protected String nrRegEtt;
    protected TInfoEmpregador.DadosIsencao dadosIsencao;
    @XmlElement(required = true)
    protected TInfoEmpregador.Contato contato;
    protected TInfoEmpregador.InfoOP infoOP;
    protected TInfoEmpregador.InfoOrgInternacional infoOrgInternacional;
    protected List<TInfoEmpregador.SoftwareHouse> softwareHouse;
    @XmlElement(required = true)
    protected TInfoEmpregador.InfoComplementares infoComplementares;

    /**
     * Obtém o valor da propriedade nmRazao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmRazao() {
        return nmRazao;
    }

    /**
     * Define o valor da propriedade nmRazao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmRazao(String value) {
        this.nmRazao = value;
    }

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
     * Obtém o valor da propriedade natJurid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatJurid() {
        return natJurid;
    }

    /**
     * Define o valor da propriedade natJurid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatJurid(String value) {
        this.natJurid = value;
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
     * Obtém o valor da propriedade indEntEd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndEntEd() {
        return indEntEd;
    }

    /**
     * Define o valor da propriedade indEntEd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndEntEd(String value) {
        this.indEntEd = value;
    }

    /**
     * Obtém o valor da propriedade indEtt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndEtt() {
        return indEtt;
    }

    /**
     * Define o valor da propriedade indEtt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndEtt(String value) {
        this.indEtt = value;
    }

    /**
     * Obtém o valor da propriedade nrRegEtt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRegEtt() {
        return nrRegEtt;
    }

    /**
     * Define o valor da propriedade nrRegEtt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRegEtt(String value) {
        this.nrRegEtt = value;
    }

    /**
     * Obtém o valor da propriedade dadosIsencao.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEmpregador.DadosIsencao }
     *     
     */
    public TInfoEmpregador.DadosIsencao getDadosIsencao() {
        return dadosIsencao;
    }

    /**
     * Define o valor da propriedade dadosIsencao.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEmpregador.DadosIsencao }
     *     
     */
    public void setDadosIsencao(TInfoEmpregador.DadosIsencao value) {
        this.dadosIsencao = value;
    }

    /**
     * Obtém o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEmpregador.Contato }
     *     
     */
    public TInfoEmpregador.Contato getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEmpregador.Contato }
     *     
     */
    public void setContato(TInfoEmpregador.Contato value) {
        this.contato = value;
    }

    /**
     * Obtém o valor da propriedade infoOP.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEmpregador.InfoOP }
     *     
     */
    public TInfoEmpregador.InfoOP getInfoOP() {
        return infoOP;
    }

    /**
     * Define o valor da propriedade infoOP.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEmpregador.InfoOP }
     *     
     */
    public void setInfoOP(TInfoEmpregador.InfoOP value) {
        this.infoOP = value;
    }

    /**
     * Obtém o valor da propriedade infoOrgInternacional.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEmpregador.InfoOrgInternacional }
     *     
     */
    public TInfoEmpregador.InfoOrgInternacional getInfoOrgInternacional() {
        return infoOrgInternacional;
    }

    /**
     * Define o valor da propriedade infoOrgInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEmpregador.InfoOrgInternacional }
     *     
     */
    public void setInfoOrgInternacional(TInfoEmpregador.InfoOrgInternacional value) {
        this.infoOrgInternacional = value;
    }

    /**
     * Gets the value of the softwareHouse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareHouse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareHouse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TInfoEmpregador.SoftwareHouse }
     * 
     * 
     */
    public List<TInfoEmpregador.SoftwareHouse> getSoftwareHouse() {
        if (softwareHouse == null) {
            softwareHouse = new ArrayList<TInfoEmpregador.SoftwareHouse>();
        }
        return this.softwareHouse;
    }

    /**
     * Obtém o valor da propriedade infoComplementares.
     * 
     * @return
     *     possible object is
     *     {@link TInfoEmpregador.InfoComplementares }
     *     
     */
    public TInfoEmpregador.InfoComplementares getInfoComplementares() {
        return infoComplementares;
    }

    /**
     * Define o valor da propriedade infoComplementares.
     * 
     * @param value
     *     allowed object is
     *     {@link TInfoEmpregador.InfoComplementares }
     *     
     */
    public void setInfoComplementares(TInfoEmpregador.InfoComplementares value) {
        this.infoComplementares = value;
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
     *         &lt;element name="nmCtt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cpfCtt">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="11"/>
     *               &lt;pattern value="\d{11}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="foneFixo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="8"/>
     *               &lt;maxLength value="13"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="foneCel" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="8"/>
     *               &lt;maxLength value="13"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="6"/>
     *               &lt;maxLength value="60"/>
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
        "nmCtt",
        "cpfCtt",
        "foneFixo",
        "foneCel",
        "email"
    })
    public static class Contato {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String nmCtt;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String cpfCtt;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected String foneFixo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected String foneCel;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected String email;

        /**
         * Obtém o valor da propriedade nmCtt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmCtt() {
            return nmCtt;
        }

        /**
         * Define o valor da propriedade nmCtt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmCtt(String value) {
            this.nmCtt = value;
        }

        /**
         * Obtém o valor da propriedade cpfCtt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpfCtt() {
            return cpfCtt;
        }

        /**
         * Define o valor da propriedade cpfCtt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpfCtt(String value) {
            this.cpfCtt = value;
        }

        /**
         * Obtém o valor da propriedade foneFixo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFoneFixo() {
            return foneFixo;
        }

        /**
         * Define o valor da propriedade foneFixo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFoneFixo(String value) {
            this.foneFixo = value;
        }

        /**
         * Obtém o valor da propriedade foneCel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFoneCel() {
            return foneCel;
        }

        /**
         * Define o valor da propriedade foneCel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFoneCel(String value) {
            this.foneCel = value;
        }

        /**
         * Obtém o valor da propriedade email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Define o valor da propriedade email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
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
     *         &lt;element name="ideMinLei">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrCertif">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="40"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtEmisCertif">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtVencCertif">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nrProtRenov" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="40"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtProtRenov" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtDou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pagDou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;totalDigits value="5"/>
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

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String ideMinLei;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String nrCertif;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected XMLGregorianCalendar dtEmisCertif;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected XMLGregorianCalendar dtVencCertif;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected String nrProtRenov;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected XMLGregorianCalendar dtProtRenov;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected XMLGregorianCalendar dtDou;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
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
     *         &lt;element name="situacaoPJ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indSitPJ">
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
     *         &lt;element name="situacaoPF" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="indSitPF">
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
        "situacaoPJ",
        "situacaoPF"
    })
    public static class InfoComplementares {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected TInfoEmpregador.InfoComplementares.SituacaoPJ situacaoPJ;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected TInfoEmpregador.InfoComplementares.SituacaoPF situacaoPF;

        /**
         * Obtém o valor da propriedade situacaoPJ.
         * 
         * @return
         *     possible object is
         *     {@link TInfoEmpregador.InfoComplementares.SituacaoPJ }
         *     
         */
        public TInfoEmpregador.InfoComplementares.SituacaoPJ getSituacaoPJ() {
            return situacaoPJ;
        }

        /**
         * Define o valor da propriedade situacaoPJ.
         * 
         * @param value
         *     allowed object is
         *     {@link TInfoEmpregador.InfoComplementares.SituacaoPJ }
         *     
         */
        public void setSituacaoPJ(TInfoEmpregador.InfoComplementares.SituacaoPJ value) {
            this.situacaoPJ = value;
        }

        /**
         * Obtém o valor da propriedade situacaoPF.
         * 
         * @return
         *     possible object is
         *     {@link TInfoEmpregador.InfoComplementares.SituacaoPF }
         *     
         */
        public TInfoEmpregador.InfoComplementares.SituacaoPF getSituacaoPF() {
            return situacaoPF;
        }

        /**
         * Define o valor da propriedade situacaoPF.
         * 
         * @param value
         *     allowed object is
         *     {@link TInfoEmpregador.InfoComplementares.SituacaoPF }
         *     
         */
        public void setSituacaoPF(TInfoEmpregador.InfoComplementares.SituacaoPF value) {
            this.situacaoPF = value;
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
         *         &lt;element name="indSitPF">
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
            "indSitPF"
        })
        public static class SituacaoPF {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
            protected byte indSitPF;

            /**
             * Obtém o valor da propriedade indSitPF.
             * 
             */
            public byte getIndSitPF() {
                return indSitPF;
            }

            /**
             * Define o valor da propriedade indSitPF.
             * 
             */
            public void setIndSitPF(byte value) {
                this.indSitPF = value;
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
         *         &lt;element name="indSitPJ">
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
            "indSitPJ"
        })
        public static class SituacaoPJ {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
            protected byte indSitPJ;

            /**
             * Obtém o valor da propriedade indSitPJ.
             * 
             */
            public byte getIndSitPJ() {
                return indSitPJ;
            }

            /**
             * Define o valor da propriedade indSitPJ.
             * 
             */
            public void setIndSitPJ(byte value) {
                this.indSitPJ = value;
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
     *         &lt;element name="nrSiafi">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\w{1,6}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="infoEFR" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ideEFR">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cnpjEFR" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{8,14}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoEnte" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nmEnte">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="uf">
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
     *                   &lt;element name="codMunic" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indRPPS">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="subteto">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;pattern value="\d{1}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="vrSubteto">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="14"/>
     *                         &lt;fractionDigits value="2"/>
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
        "nrSiafi",
        "infoEFR",
        "infoEnte"
    })
    public static class InfoOP {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String nrSiafi;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected TInfoEmpregador.InfoOP.InfoEFR infoEFR;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected TInfoEmpregador.InfoOP.InfoEnte infoEnte;

        /**
         * Obtém o valor da propriedade nrSiafi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrSiafi() {
            return nrSiafi;
        }

        /**
         * Define o valor da propriedade nrSiafi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrSiafi(String value) {
            this.nrSiafi = value;
        }

        /**
         * Obtém o valor da propriedade infoEFR.
         * 
         * @return
         *     possible object is
         *     {@link TInfoEmpregador.InfoOP.InfoEFR }
         *     
         */
        public TInfoEmpregador.InfoOP.InfoEFR getInfoEFR() {
            return infoEFR;
        }

        /**
         * Define o valor da propriedade infoEFR.
         * 
         * @param value
         *     allowed object is
         *     {@link TInfoEmpregador.InfoOP.InfoEFR }
         *     
         */
        public void setInfoEFR(TInfoEmpregador.InfoOP.InfoEFR value) {
            this.infoEFR = value;
        }

        /**
         * Obtém o valor da propriedade infoEnte.
         * 
         * @return
         *     possible object is
         *     {@link TInfoEmpregador.InfoOP.InfoEnte }
         *     
         */
        public TInfoEmpregador.InfoOP.InfoEnte getInfoEnte() {
            return infoEnte;
        }

        /**
         * Define o valor da propriedade infoEnte.
         * 
         * @param value
         *     allowed object is
         *     {@link TInfoEmpregador.InfoOP.InfoEnte }
         *     
         */
        public void setInfoEnte(TInfoEmpregador.InfoOP.InfoEnte value) {
            this.infoEnte = value;
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
         *         &lt;element name="ideEFR">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cnpjEFR" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{8,14}"/>
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
            "ideEFR",
            "cnpjEFR"
        })
        public static class InfoEFR {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
            protected String ideEFR;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
            protected String cnpjEFR;

            /**
             * Obtém o valor da propriedade ideEFR.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdeEFR() {
                return ideEFR;
            }

            /**
             * Define o valor da propriedade ideEFR.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdeEFR(String value) {
                this.ideEFR = value;
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
         *         &lt;element name="nmEnte">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="uf">
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
         *         &lt;element name="codMunic" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indRPPS">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="subteto">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;pattern value="\d{1}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vrSubteto">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="14"/>
         *               &lt;fractionDigits value="2"/>
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
            "nmEnte",
            "uf",
            "codMunic",
            "indRPPS",
            "subteto",
            "vrSubteto"
        })
        public static class InfoEnte {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
            protected String nmEnte;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
            protected String uf;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
            protected BigInteger codMunic;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
            protected String indRPPS;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
            protected byte subteto;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
            protected BigDecimal vrSubteto;

            /**
             * Obtém o valor da propriedade nmEnte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmEnte() {
                return nmEnte;
            }

            /**
             * Define o valor da propriedade nmEnte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmEnte(String value) {
                this.nmEnte = value;
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
             * Obtém o valor da propriedade indRPPS.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndRPPS() {
                return indRPPS;
            }

            /**
             * Define o valor da propriedade indRPPS.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndRPPS(String value) {
                this.indRPPS = value;
            }

            /**
             * Obtém o valor da propriedade subteto.
             * 
             */
            public byte getSubteto() {
                return subteto;
            }

            /**
             * Define o valor da propriedade subteto.
             * 
             */
            public void setSubteto(byte value) {
                this.subteto = value;
            }

            /**
             * Obtém o valor da propriedade vrSubteto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVrSubteto() {
                return vrSubteto;
            }

            /**
             * Define o valor da propriedade vrSubteto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVrSubteto(BigDecimal value) {
                this.vrSubteto = value;
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
     *         &lt;element name="indAcordoIsenMulta">
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
        "indAcordoIsenMulta"
    })
    public static class InfoOrgInternacional {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
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
     *         &lt;element name="cnpjSoftHouse">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="14"/>
     *               &lt;pattern value="\d{8,14}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nmRazao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nmCont">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="telefone">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="8"/>
     *               &lt;maxLength value="13"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="6"/>
     *               &lt;maxLength value="60"/>
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
        "cnpjSoftHouse",
        "nmRazao",
        "nmCont",
        "telefone",
        "email"
    })
    public static class SoftwareHouse {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String cnpjSoftHouse;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String nmRazao;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String nmCont;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02", required = true)
        protected String telefone;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_02")
        protected String email;

        /**
         * Obtém o valor da propriedade cnpjSoftHouse.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjSoftHouse() {
            return cnpjSoftHouse;
        }

        /**
         * Define o valor da propriedade cnpjSoftHouse.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjSoftHouse(String value) {
            this.cnpjSoftHouse = value;
        }

        /**
         * Obtém o valor da propriedade nmRazao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmRazao() {
            return nmRazao;
        }

        /**
         * Define o valor da propriedade nmRazao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmRazao(String value) {
            this.nmRazao = value;
        }

        /**
         * Obtém o valor da propriedade nmCont.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNmCont() {
            return nmCont;
        }

        /**
         * Define o valor da propriedade nmCont.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNmCont(String value) {
            this.nmCont = value;
        }

        /**
         * Obtém o valor da propriedade telefone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefone() {
            return telefone;
        }

        /**
         * Define o valor da propriedade telefone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefone(String value) {
            this.telefone = value;
        }

        /**
         * Obtém o valor da propriedade email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Define o valor da propriedade email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

    }

}
