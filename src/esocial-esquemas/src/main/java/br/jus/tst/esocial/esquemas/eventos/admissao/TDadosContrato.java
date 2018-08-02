//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:49 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admissao;

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
 * Informações do Contrato de Trabalho
 * 
 * <p>Classe Java de TDadosContrato complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosContrato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCargo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codFuncao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCateg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;pattern value="\d{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codCarreira" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\w{1,30}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtIngrCarr" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="remuneracao" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TRemun"/>
 *         &lt;element name="duracao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpContr">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dtTerm" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="clauAssec" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[N|S]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localTrabalho">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TLocalTrab" minOccurs="0"/>
 *                   &lt;element name="localTrabDom" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoBrasil" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="horContratual" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qtdHrsSem" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="4"/>
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tpJornada">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dscTpJorn" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tmpParc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;pattern value="\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="horario" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}THorario" maxOccurs="99" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="filiacaoSindical" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cnpjSindTrab">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="14"/>
 *                         &lt;pattern value="\d{8,14}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alvaraJudicial" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrProcJud">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="21"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacoes" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="observacao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="3"/>
 *                         &lt;maxLength value="255"/>
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
@XmlType(name = "TDadosContrato", propOrder = {
    "codCargo",
    "codFuncao",
    "codCateg",
    "codCarreira",
    "dtIngrCarr",
    "remuneracao",
    "duracao",
    "localTrabalho",
    "horContratual",
    "filiacaoSindical",
    "alvaraJudicial",
    "observacoes"
})
public class TDadosContrato {

    protected String codCargo;
    protected String codFuncao;
    @XmlElement(required = true)
    protected BigInteger codCateg;
    protected String codCarreira;
    protected XMLGregorianCalendar dtIngrCarr;
    @XmlElement(required = true)
    protected TRemun remuneracao;
    @XmlElement(required = true)
    protected TDadosContrato.Duracao duracao;
    @XmlElement(required = true)
    protected TDadosContrato.LocalTrabalho localTrabalho;
    protected TDadosContrato.HorContratual horContratual;
    protected List<TDadosContrato.FiliacaoSindical> filiacaoSindical;
    protected TDadosContrato.AlvaraJudicial alvaraJudicial;
    protected List<TDadosContrato.Observacoes> observacoes;

    /**
     * Obtém o valor da propriedade codCargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCargo() {
        return codCargo;
    }

    /**
     * Define o valor da propriedade codCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCargo(String value) {
        this.codCargo = value;
    }

    /**
     * Obtém o valor da propriedade codFuncao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFuncao() {
        return codFuncao;
    }

    /**
     * Define o valor da propriedade codFuncao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFuncao(String value) {
        this.codFuncao = value;
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
     * Obtém o valor da propriedade codCarreira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCarreira() {
        return codCarreira;
    }

    /**
     * Define o valor da propriedade codCarreira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCarreira(String value) {
        this.codCarreira = value;
    }

    /**
     * Obtém o valor da propriedade dtIngrCarr.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtIngrCarr() {
        return dtIngrCarr;
    }

    /**
     * Define o valor da propriedade dtIngrCarr.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtIngrCarr(XMLGregorianCalendar value) {
        this.dtIngrCarr = value;
    }

    /**
     * Obtém o valor da propriedade remuneracao.
     * 
     * @return
     *     possible object is
     *     {@link TRemun }
     *     
     */
    public TRemun getRemuneracao() {
        return remuneracao;
    }

    /**
     * Define o valor da propriedade remuneracao.
     * 
     * @param value
     *     allowed object is
     *     {@link TRemun }
     *     
     */
    public void setRemuneracao(TRemun value) {
        this.remuneracao = value;
    }

    /**
     * Obtém o valor da propriedade duracao.
     * 
     * @return
     *     possible object is
     *     {@link TDadosContrato.Duracao }
     *     
     */
    public TDadosContrato.Duracao getDuracao() {
        return duracao;
    }

    /**
     * Define o valor da propriedade duracao.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosContrato.Duracao }
     *     
     */
    public void setDuracao(TDadosContrato.Duracao value) {
        this.duracao = value;
    }

    /**
     * Obtém o valor da propriedade localTrabalho.
     * 
     * @return
     *     possible object is
     *     {@link TDadosContrato.LocalTrabalho }
     *     
     */
    public TDadosContrato.LocalTrabalho getLocalTrabalho() {
        return localTrabalho;
    }

    /**
     * Define o valor da propriedade localTrabalho.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosContrato.LocalTrabalho }
     *     
     */
    public void setLocalTrabalho(TDadosContrato.LocalTrabalho value) {
        this.localTrabalho = value;
    }

    /**
     * Obtém o valor da propriedade horContratual.
     * 
     * @return
     *     possible object is
     *     {@link TDadosContrato.HorContratual }
     *     
     */
    public TDadosContrato.HorContratual getHorContratual() {
        return horContratual;
    }

    /**
     * Define o valor da propriedade horContratual.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosContrato.HorContratual }
     *     
     */
    public void setHorContratual(TDadosContrato.HorContratual value) {
        this.horContratual = value;
    }

    /**
     * Gets the value of the filiacaoSindical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filiacaoSindical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiliacaoSindical().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosContrato.FiliacaoSindical }
     * 
     * 
     */
    public List<TDadosContrato.FiliacaoSindical> getFiliacaoSindical() {
        if (filiacaoSindical == null) {
            filiacaoSindical = new ArrayList<TDadosContrato.FiliacaoSindical>();
        }
        return this.filiacaoSindical;
    }

    /**
     * Obtém o valor da propriedade alvaraJudicial.
     * 
     * @return
     *     possible object is
     *     {@link TDadosContrato.AlvaraJudicial }
     *     
     */
    public TDadosContrato.AlvaraJudicial getAlvaraJudicial() {
        return alvaraJudicial;
    }

    /**
     * Define o valor da propriedade alvaraJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosContrato.AlvaraJudicial }
     *     
     */
    public void setAlvaraJudicial(TDadosContrato.AlvaraJudicial value) {
        this.alvaraJudicial = value;
    }

    /**
     * Gets the value of the observacoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observacoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservacoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosContrato.Observacoes }
     * 
     * 
     */
    public List<TDadosContrato.Observacoes> getObservacoes() {
        if (observacoes == null) {
            observacoes = new ArrayList<TDadosContrato.Observacoes>();
        }
        return this.observacoes;
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
     *         &lt;element name="nrProcJud">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="21"/>
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
        "nrProcJud"
    })
    public static class AlvaraJudicial {

        @XmlElement(required = true)
        protected String nrProcJud;

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
     *         &lt;element name="tpContr">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dtTerm" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="clauAssec" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
        "tpContr",
        "dtTerm",
        "clauAssec"
    })
    public static class Duracao {

        protected byte tpContr;
        protected XMLGregorianCalendar dtTerm;
        protected String clauAssec;

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

        /**
         * Obtém o valor da propriedade clauAssec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClauAssec() {
            return clauAssec;
        }

        /**
         * Define o valor da propriedade clauAssec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClauAssec(String value) {
            this.clauAssec = value;
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
     *         &lt;element name="cnpjSindTrab">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="14"/>
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
        "cnpjSindTrab"
    })
    public static class FiliacaoSindical {

        @XmlElement(required = true)
        protected String cnpjSindTrab;

        /**
         * Obtém o valor da propriedade cnpjSindTrab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjSindTrab() {
            return cnpjSindTrab;
        }

        /**
         * Define o valor da propriedade cnpjSindTrab.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjSindTrab(String value) {
            this.cnpjSindTrab = value;
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
     *         &lt;element name="qtdHrsSem" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="4"/>
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tpJornada">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dscTpJorn" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tmpParc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;pattern value="\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="horario" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}THorario" maxOccurs="99" minOccurs="0"/>
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
        "qtdHrsSem",
        "tpJornada",
        "dscTpJorn",
        "tmpParc",
        "horario"
    })
    public static class HorContratual {

        protected BigDecimal qtdHrsSem;
        protected byte tpJornada;
        protected String dscTpJorn;
        protected byte tmpParc;
        protected List<THorario> horario;

        /**
         * Obtém o valor da propriedade qtdHrsSem.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQtdHrsSem() {
            return qtdHrsSem;
        }

        /**
         * Define o valor da propriedade qtdHrsSem.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQtdHrsSem(BigDecimal value) {
            this.qtdHrsSem = value;
        }

        /**
         * Obtém o valor da propriedade tpJornada.
         * 
         */
        public byte getTpJornada() {
            return tpJornada;
        }

        /**
         * Define o valor da propriedade tpJornada.
         * 
         */
        public void setTpJornada(byte value) {
            this.tpJornada = value;
        }

        /**
         * Obtém o valor da propriedade dscTpJorn.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDscTpJorn() {
            return dscTpJorn;
        }

        /**
         * Define o valor da propriedade dscTpJorn.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDscTpJorn(String value) {
            this.dscTpJorn = value;
        }

        /**
         * Obtém o valor da propriedade tmpParc.
         * 
         */
        public byte getTmpParc() {
            return tmpParc;
        }

        /**
         * Define o valor da propriedade tmpParc.
         * 
         */
        public void setTmpParc(byte value) {
            this.tmpParc = value;
        }

        /**
         * Gets the value of the horario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the horario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHorario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link THorario }
         * 
         * 
         */
        public List<THorario> getHorario() {
            if (horario == null) {
                horario = new ArrayList<THorario>();
            }
            return this.horario;
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
     *         &lt;element name="localTrabGeral" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TLocalTrab" minOccurs="0"/>
     *         &lt;element name="localTrabDom" type="{http://www.esocial.gov.br/schema/evt/evtAdmissao/v02_04_02}TEnderecoBrasil" minOccurs="0"/>
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
        "localTrabGeral",
        "localTrabDom"
    })
    public static class LocalTrabalho {

        protected TLocalTrab localTrabGeral;
        protected TEnderecoBrasil localTrabDom;

        /**
         * Obtém o valor da propriedade localTrabGeral.
         * 
         * @return
         *     possible object is
         *     {@link TLocalTrab }
         *     
         */
        public TLocalTrab getLocalTrabGeral() {
            return localTrabGeral;
        }

        /**
         * Define o valor da propriedade localTrabGeral.
         * 
         * @param value
         *     allowed object is
         *     {@link TLocalTrab }
         *     
         */
        public void setLocalTrabGeral(TLocalTrab value) {
            this.localTrabGeral = value;
        }

        /**
         * Obtém o valor da propriedade localTrabDom.
         * 
         * @return
         *     possible object is
         *     {@link TEnderecoBrasil }
         *     
         */
        public TEnderecoBrasil getLocalTrabDom() {
            return localTrabDom;
        }

        /**
         * Define o valor da propriedade localTrabDom.
         * 
         * @param value
         *     allowed object is
         *     {@link TEnderecoBrasil }
         *     
         */
        public void setLocalTrabDom(TEnderecoBrasil value) {
            this.localTrabDom = value;
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
     *         &lt;element name="observacao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="3"/>
     *               &lt;maxLength value="255"/>
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
        "observacao"
    })
    public static class Observacoes {

        @XmlElement(required = true)
        protected String observacao;

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

    }

}
