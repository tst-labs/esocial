//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:11:46 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.evento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Define os dados do recibo do evento.
 * 
 * <p>Classe Java de TDadosRecibo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrRecibo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contrato" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEmpregador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="trabalhador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="nisTrab" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="nmTrab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoDeficiencia" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="infoCota" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vinculo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoCeletista" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="tpRegJor" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="dtBase" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="cnpjSindCategProf" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoEstatutario" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtPosse" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infoContrato">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cargo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="nmCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="funcao" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="dscFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="codCateg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="remuneracao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vrSalFx" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="undSalFixo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="dscSalVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="duracao">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpContr" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="clauAsseg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="localTrabGeral" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="cnae" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="horContratual" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="qtdHrsSem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="tpJornada" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="dscTpJorn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tmpParc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="horario" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="codHorContrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="hrEntr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="hrSaida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="durJornada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="perHorFlexivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="horarioIntervalo" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="tpInterv" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                                 &lt;element name="durInterv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="iniInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="termInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
@XmlType(name = "TDadosRecibo", namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", propOrder = {
    "nrRecibo",
    "hash",
    "contrato"
})
public class TDadosRecibo {

    @XmlElement(required = true)
    protected String nrRecibo;
    @XmlElement(required = true)
    protected String hash;
    protected TDadosRecibo.Contrato contrato;

    /**
     * Obtém o valor da propriedade nrRecibo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRecibo() {
        return nrRecibo;
    }

    /**
     * Define o valor da propriedade nrRecibo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRecibo(String value) {
        this.nrRecibo = value;
    }

    /**
     * Obtém o valor da propriedade hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define o valor da propriedade hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Obtém o valor da propriedade contrato.
     * 
     * @return
     *     possible object is
     *     {@link TDadosRecibo.Contrato }
     *     
     */
    public TDadosRecibo.Contrato getContrato() {
        return contrato;
    }

    /**
     * Define o valor da propriedade contrato.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosRecibo.Contrato }
     *     
     */
    public void setContrato(TDadosRecibo.Contrato value) {
        this.contrato = value;
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
     *         &lt;element name="ideEmpregador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="trabalhador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="nisTrab" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="nmTrab" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoDeficiencia" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="infoCota" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vinculo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoCeletista" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="tpRegJor" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="dtBase" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="cnpjSindCategProf" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoEstatutario" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtPosse" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infoContrato">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cargo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="nmCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="funcao" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="dscFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="codCateg" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="remuneracao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vrSalFx" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="undSalFixo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="dscSalVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="duracao">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpContr" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="clauAsseg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="localTrabGeral" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="cnae" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
     *                   &lt;element name="qtdHrsSem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="tpJornada" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="dscTpJorn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tmpParc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="horario" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="codHorContrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="hrEntr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="hrSaida" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="durJornada" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="perHorFlexivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="horarioIntervalo" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="tpInterv" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                                       &lt;element name="durInterv" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="iniInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="termInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ideEmpregador",
        "trabalhador",
        "infoDeficiencia",
        "vinculo",
        "infoCeletista",
        "infoEstatutario",
        "infoContrato",
        "remuneracao",
        "duracao",
        "localTrabGeral",
        "horContratual"
    })
    public static class Contrato {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TDadosRecibo.Contrato.IdeEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TDadosRecibo.Contrato.Trabalhador trabalhador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
        protected TDadosRecibo.Contrato.InfoDeficiencia infoDeficiencia;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
        protected TDadosRecibo.Contrato.Vinculo vinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
        protected TDadosRecibo.Contrato.InfoCeletista infoCeletista;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
        protected TDadosRecibo.Contrato.InfoEstatutario infoEstatutario;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TDadosRecibo.Contrato.InfoContrato infoContrato;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TDadosRecibo.Contrato.Remuneracao remuneracao;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TDadosRecibo.Contrato.Duracao duracao;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
        protected TDadosRecibo.Contrato.LocalTrabGeral localTrabGeral;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
        protected TDadosRecibo.Contrato.HorContratual horContratual;

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.IdeEmpregador }
         *     
         */
        public TDadosRecibo.Contrato.IdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.IdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TDadosRecibo.Contrato.IdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade trabalhador.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.Trabalhador }
         *     
         */
        public TDadosRecibo.Contrato.Trabalhador getTrabalhador() {
            return trabalhador;
        }

        /**
         * Define o valor da propriedade trabalhador.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.Trabalhador }
         *     
         */
        public void setTrabalhador(TDadosRecibo.Contrato.Trabalhador value) {
            this.trabalhador = value;
        }

        /**
         * Obtém o valor da propriedade infoDeficiencia.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.InfoDeficiencia }
         *     
         */
        public TDadosRecibo.Contrato.InfoDeficiencia getInfoDeficiencia() {
            return infoDeficiencia;
        }

        /**
         * Define o valor da propriedade infoDeficiencia.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.InfoDeficiencia }
         *     
         */
        public void setInfoDeficiencia(TDadosRecibo.Contrato.InfoDeficiencia value) {
            this.infoDeficiencia = value;
        }

        /**
         * Obtém o valor da propriedade vinculo.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.Vinculo }
         *     
         */
        public TDadosRecibo.Contrato.Vinculo getVinculo() {
            return vinculo;
        }

        /**
         * Define o valor da propriedade vinculo.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.Vinculo }
         *     
         */
        public void setVinculo(TDadosRecibo.Contrato.Vinculo value) {
            this.vinculo = value;
        }

        /**
         * Obtém o valor da propriedade infoCeletista.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.InfoCeletista }
         *     
         */
        public TDadosRecibo.Contrato.InfoCeletista getInfoCeletista() {
            return infoCeletista;
        }

        /**
         * Define o valor da propriedade infoCeletista.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.InfoCeletista }
         *     
         */
        public void setInfoCeletista(TDadosRecibo.Contrato.InfoCeletista value) {
            this.infoCeletista = value;
        }

        /**
         * Obtém o valor da propriedade infoEstatutario.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.InfoEstatutario }
         *     
         */
        public TDadosRecibo.Contrato.InfoEstatutario getInfoEstatutario() {
            return infoEstatutario;
        }

        /**
         * Define o valor da propriedade infoEstatutario.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.InfoEstatutario }
         *     
         */
        public void setInfoEstatutario(TDadosRecibo.Contrato.InfoEstatutario value) {
            this.infoEstatutario = value;
        }

        /**
         * Obtém o valor da propriedade infoContrato.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.InfoContrato }
         *     
         */
        public TDadosRecibo.Contrato.InfoContrato getInfoContrato() {
            return infoContrato;
        }

        /**
         * Define o valor da propriedade infoContrato.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.InfoContrato }
         *     
         */
        public void setInfoContrato(TDadosRecibo.Contrato.InfoContrato value) {
            this.infoContrato = value;
        }

        /**
         * Obtém o valor da propriedade remuneracao.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.Remuneracao }
         *     
         */
        public TDadosRecibo.Contrato.Remuneracao getRemuneracao() {
            return remuneracao;
        }

        /**
         * Define o valor da propriedade remuneracao.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.Remuneracao }
         *     
         */
        public void setRemuneracao(TDadosRecibo.Contrato.Remuneracao value) {
            this.remuneracao = value;
        }

        /**
         * Obtém o valor da propriedade duracao.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.Duracao }
         *     
         */
        public TDadosRecibo.Contrato.Duracao getDuracao() {
            return duracao;
        }

        /**
         * Define o valor da propriedade duracao.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.Duracao }
         *     
         */
        public void setDuracao(TDadosRecibo.Contrato.Duracao value) {
            this.duracao = value;
        }

        /**
         * Obtém o valor da propriedade localTrabGeral.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.LocalTrabGeral }
         *     
         */
        public TDadosRecibo.Contrato.LocalTrabGeral getLocalTrabGeral() {
            return localTrabGeral;
        }

        /**
         * Define o valor da propriedade localTrabGeral.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.LocalTrabGeral }
         *     
         */
        public void setLocalTrabGeral(TDadosRecibo.Contrato.LocalTrabGeral value) {
            this.localTrabGeral = value;
        }

        /**
         * Obtém o valor da propriedade horContratual.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo.Contrato.HorContratual }
         *     
         */
        public TDadosRecibo.Contrato.HorContratual getHorContratual() {
            return horContratual;
        }

        /**
         * Define o valor da propriedade horContratual.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo.Contrato.HorContratual }
         *     
         */
        public void setHorContratual(TDadosRecibo.Contrato.HorContratual value) {
            this.horContratual = value;
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
         *         &lt;element name="tpContr" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="clauAsseg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "clauAsseg"
        })
        public static class Duracao {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected byte tpContr;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtTerm;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected String clauAsseg;

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
             * Obtém o valor da propriedade clauAsseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClauAsseg() {
                return clauAsseg;
            }

            /**
             * Define o valor da propriedade clauAsseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClauAsseg(String value) {
                this.clauAsseg = value;
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
         *         &lt;element name="qtdHrsSem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="tpJornada" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="dscTpJorn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tmpParc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="horario" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="codHorContrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="hrEntr" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="hrSaida" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="durJornada" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="perHorFlexivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="horarioIntervalo" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="tpInterv" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                             &lt;element name="durInterv" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="iniInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="termInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "qtdHrsSem",
            "tpJornada",
            "dscTpJorn",
            "tmpParc",
            "horario"
        })
        public static class HorContratual {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            protected BigDecimal qtdHrsSem;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected byte tpJornada;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected String dscTpJorn;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            protected String tmpParc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected List<TDadosRecibo.Contrato.HorContratual.Horario> horario;

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
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTmpParc() {
                return tmpParc;
            }

            /**
             * Define o valor da propriedade tmpParc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTmpParc(String value) {
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
             * {@link TDadosRecibo.Contrato.HorContratual.Horario }
             * 
             * 
             */
            public List<TDadosRecibo.Contrato.HorContratual.Horario> getHorario() {
                if (horario == null) {
                    horario = new ArrayList<TDadosRecibo.Contrato.HorContratual.Horario>();
                }
                return this.horario;
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
             *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="codHorContrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="hrEntr" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="hrSaida" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="durJornada" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="perHorFlexivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="horarioIntervalo" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="tpInterv" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *                   &lt;element name="durInterv" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="iniInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="termInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "dia",
                "codHorContrat",
                "hrEntr",
                "hrSaida",
                "durJornada",
                "perHorFlexivel",
                "horarioIntervalo"
            })
            public static class Horario {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                protected byte dia;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String codHorContrat;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String hrEntr;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String hrSaida;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                protected int durJornada;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String perHorFlexivel;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                protected List<TDadosRecibo.Contrato.HorContratual.Horario.HorarioIntervalo> horarioIntervalo;

                /**
                 * Obtém o valor da propriedade dia.
                 * 
                 */
                public byte getDia() {
                    return dia;
                }

                /**
                 * Define o valor da propriedade dia.
                 * 
                 */
                public void setDia(byte value) {
                    this.dia = value;
                }

                /**
                 * Obtém o valor da propriedade codHorContrat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodHorContrat() {
                    return codHorContrat;
                }

                /**
                 * Define o valor da propriedade codHorContrat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodHorContrat(String value) {
                    this.codHorContrat = value;
                }

                /**
                 * Obtém o valor da propriedade hrEntr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHrEntr() {
                    return hrEntr;
                }

                /**
                 * Define o valor da propriedade hrEntr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHrEntr(String value) {
                    this.hrEntr = value;
                }

                /**
                 * Obtém o valor da propriedade hrSaida.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHrSaida() {
                    return hrSaida;
                }

                /**
                 * Define o valor da propriedade hrSaida.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHrSaida(String value) {
                    this.hrSaida = value;
                }

                /**
                 * Obtém o valor da propriedade durJornada.
                 * 
                 */
                public int getDurJornada() {
                    return durJornada;
                }

                /**
                 * Define o valor da propriedade durJornada.
                 * 
                 */
                public void setDurJornada(int value) {
                    this.durJornada = value;
                }

                /**
                 * Obtém o valor da propriedade perHorFlexivel.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPerHorFlexivel() {
                    return perHorFlexivel;
                }

                /**
                 * Define o valor da propriedade perHorFlexivel.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPerHorFlexivel(String value) {
                    this.perHorFlexivel = value;
                }

                /**
                 * Gets the value of the horarioIntervalo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the horarioIntervalo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHorarioIntervalo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TDadosRecibo.Contrato.HorContratual.Horario.HorarioIntervalo }
                 * 
                 * 
                 */
                public List<TDadosRecibo.Contrato.HorContratual.Horario.HorarioIntervalo> getHorarioIntervalo() {
                    if (horarioIntervalo == null) {
                        horarioIntervalo = new ArrayList<TDadosRecibo.Contrato.HorContratual.Horario.HorarioIntervalo>();
                    }
                    return this.horarioIntervalo;
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
                 *         &lt;element name="tpInterv" type="{http://www.w3.org/2001/XMLSchema}byte"/>
                 *         &lt;element name="durInterv" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="iniInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="termInterv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "tpInterv",
                    "durInterv",
                    "iniInterv",
                    "termInterv"
                })
                public static class HorarioIntervalo {

                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                    protected byte tpInterv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                    protected int durInterv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                    protected String iniInterv;
                    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                    protected String termInterv;

                    /**
                     * Obtém o valor da propriedade tpInterv.
                     * 
                     */
                    public byte getTpInterv() {
                        return tpInterv;
                    }

                    /**
                     * Define o valor da propriedade tpInterv.
                     * 
                     */
                    public void setTpInterv(byte value) {
                        this.tpInterv = value;
                    }

                    /**
                     * Obtém o valor da propriedade durInterv.
                     * 
                     */
                    public int getDurInterv() {
                        return durInterv;
                    }

                    /**
                     * Define o valor da propriedade durInterv.
                     * 
                     */
                    public void setDurInterv(int value) {
                        this.durInterv = value;
                    }

                    /**
                     * Obtém o valor da propriedade iniInterv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIniInterv() {
                        return iniInterv;
                    }

                    /**
                     * Define o valor da propriedade iniInterv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIniInterv(String value) {
                        this.iniInterv = value;
                    }

                    /**
                     * Obtém o valor da propriedade termInterv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTermInterv() {
                        return termInterv;
                    }

                    /**
                     * Define o valor da propriedade termInterv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTermInterv(String value) {
                        this.termInterv = value;
                    }

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
         *         &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
            "tpInsc",
            "nrInsc"
        })
        public static class IdeEmpregador {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected byte tpInsc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected long nrInsc;

            /**
             * Obtém o valor da propriedade tpInsc.
             * 
             */
            public byte getTpInsc() {
                return tpInsc;
            }

            /**
             * Define o valor da propriedade tpInsc.
             * 
             */
            public void setTpInsc(byte value) {
                this.tpInsc = value;
            }

            /**
             * Obtém o valor da propriedade nrInsc.
             * 
             */
            public long getNrInsc() {
                return nrInsc;
            }

            /**
             * Define o valor da propriedade nrInsc.
             * 
             */
            public void setNrInsc(long value) {
                this.nrInsc = value;
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
         *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="tpRegJor" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="dtBase" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="cnpjSindCategProf" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
            "dtAdm",
            "tpRegJor",
            "dtBase",
            "cnpjSindCategProf"
        })
        public static class InfoCeletista {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAdm;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected byte tpRegJor;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtBase;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected long cnpjSindCategProf;

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
             * Obtém o valor da propriedade tpRegJor.
             * 
             */
            public byte getTpRegJor() {
                return tpRegJor;
            }

            /**
             * Define o valor da propriedade tpRegJor.
             * 
             */
            public void setTpRegJor(byte value) {
                this.tpRegJor = value;
            }

            /**
             * Obtém o valor da propriedade dtBase.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtBase() {
                return dtBase;
            }

            /**
             * Define o valor da propriedade dtBase.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtBase(XMLGregorianCalendar value) {
                this.dtBase = value;
            }

            /**
             * Obtém o valor da propriedade cnpjSindCategProf.
             * 
             */
            public long getCnpjSindCategProf() {
                return cnpjSindCategProf;
            }

            /**
             * Define o valor da propriedade cnpjSindCategProf.
             * 
             */
            public void setCnpjSindCategProf(long value) {
                this.cnpjSindCategProf = value;
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
         *         &lt;element name="cargo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="nmCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="funcao" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="dscFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="codCateg" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "cargo",
            "funcao",
            "codCateg"
        })
        public static class InfoContrato {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected TDadosRecibo.Contrato.InfoContrato.Cargo cargo;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected TDadosRecibo.Contrato.InfoContrato.Funcao funcao;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected int codCateg;

            /**
             * Obtém o valor da propriedade cargo.
             * 
             * @return
             *     possible object is
             *     {@link TDadosRecibo.Contrato.InfoContrato.Cargo }
             *     
             */
            public TDadosRecibo.Contrato.InfoContrato.Cargo getCargo() {
                return cargo;
            }

            /**
             * Define o valor da propriedade cargo.
             * 
             * @param value
             *     allowed object is
             *     {@link TDadosRecibo.Contrato.InfoContrato.Cargo }
             *     
             */
            public void setCargo(TDadosRecibo.Contrato.InfoContrato.Cargo value) {
                this.cargo = value;
            }

            /**
             * Obtém o valor da propriedade funcao.
             * 
             * @return
             *     possible object is
             *     {@link TDadosRecibo.Contrato.InfoContrato.Funcao }
             *     
             */
            public TDadosRecibo.Contrato.InfoContrato.Funcao getFuncao() {
                return funcao;
            }

            /**
             * Define o valor da propriedade funcao.
             * 
             * @param value
             *     allowed object is
             *     {@link TDadosRecibo.Contrato.InfoContrato.Funcao }
             *     
             */
            public void setFuncao(TDadosRecibo.Contrato.InfoContrato.Funcao value) {
                this.funcao = value;
            }

            /**
             * Obtém o valor da propriedade codCateg.
             * 
             */
            public int getCodCateg() {
                return codCateg;
            }

            /**
             * Define o valor da propriedade codCateg.
             * 
             */
            public void setCodCateg(int value) {
                this.codCateg = value;
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
             *         &lt;element name="codCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="nmCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
                "codCargo",
                "nmCargo",
                "codCBO"
            })
            public static class Cargo {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String codCargo;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String nmCargo;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                protected int codCBO;

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
                 */
                public int getCodCBO() {
                    return codCBO;
                }

                /**
                 * Define o valor da propriedade codCBO.
                 * 
                 */
                public void setCodCBO(int value) {
                    this.codCBO = value;
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
             *         &lt;element name="codFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="dscFuncao" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="codCBO" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
                "codFuncao",
                "dscFuncao",
                "codCBO"
            })
            public static class Funcao {

                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String codFuncao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
                protected String dscFuncao;
                @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
                protected int codCBO;

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
                 * Obtém o valor da propriedade dscFuncao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDscFuncao() {
                    return dscFuncao;
                }

                /**
                 * Define o valor da propriedade dscFuncao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDscFuncao(String value) {
                    this.dscFuncao = value;
                }

                /**
                 * Obtém o valor da propriedade codCBO.
                 * 
                 */
                public int getCodCBO() {
                    return codCBO;
                }

                /**
                 * Define o valor da propriedade codCBO.
                 * 
                 */
                public void setCodCBO(int value) {
                    this.codCBO = value;
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
         *         &lt;element name="infoCota" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "infoCota"
        })
        public static class InfoDeficiencia {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            protected String infoCota;

            /**
             * Obtém o valor da propriedade infoCota.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfoCota() {
                return infoCota;
            }

            /**
             * Define o valor da propriedade infoCota.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfoCota(String value) {
                this.infoCota = value;
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
         *         &lt;element name="dtPosse" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtExercicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "dtPosse",
            "dtExercicio"
        })
        public static class InfoEstatutario {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtPosse;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtExercicio;

            /**
             * Obtém o valor da propriedade dtPosse.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtPosse() {
                return dtPosse;
            }

            /**
             * Define o valor da propriedade dtPosse.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtPosse(XMLGregorianCalendar value) {
                this.dtPosse = value;
            }

            /**
             * Obtém o valor da propriedade dtExercicio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtExercicio() {
                return dtExercicio;
            }

            /**
             * Define o valor da propriedade dtExercicio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtExercicio(XMLGregorianCalendar value) {
                this.dtExercicio = value;
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
         *         &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="cnae" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
            "tpInsc",
            "nrInsc",
            "cnae"
        })
        public static class LocalTrabGeral {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected byte tpInsc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected long nrInsc;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected long cnae;

            /**
             * Obtém o valor da propriedade tpInsc.
             * 
             */
            public byte getTpInsc() {
                return tpInsc;
            }

            /**
             * Define o valor da propriedade tpInsc.
             * 
             */
            public void setTpInsc(byte value) {
                this.tpInsc = value;
            }

            /**
             * Obtém o valor da propriedade nrInsc.
             * 
             */
            public long getNrInsc() {
                return nrInsc;
            }

            /**
             * Define o valor da propriedade nrInsc.
             * 
             */
            public void setNrInsc(long value) {
                this.nrInsc = value;
            }

            /**
             * Obtém o valor da propriedade cnae.
             * 
             */
            public long getCnae() {
                return cnae;
            }

            /**
             * Define o valor da propriedade cnae.
             * 
             */
            public void setCnae(long value) {
                this.cnae = value;
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
         *         &lt;element name="vrSalFx" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="undSalFixo" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="dscSalVar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "vrSalFx",
            "undSalFixo",
            "dscSalVar"
        })
        public static class Remuneracao {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            protected BigDecimal vrSalFx;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected byte undSalFixo;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected String dscSalVar;

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
             * Obtém o valor da propriedade dscSalVar.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDscSalVar() {
                return dscSalVar;
            }

            /**
             * Define o valor da propriedade dscSalVar.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDscSalVar(String value) {
                this.dscSalVar = value;
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
         *         &lt;element name="cpfTrab" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="nisTrab" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="nmTrab" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "nisTrab",
            "nmTrab"
        })
        public static class Trabalhador {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected long cpfTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
            protected long nisTrab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            protected String nmTrab;

            /**
             * Obtém o valor da propriedade cpfTrab.
             * 
             */
            public long getCpfTrab() {
                return cpfTrab;
            }

            /**
             * Define o valor da propriedade cpfTrab.
             * 
             */
            public void setCpfTrab(long value) {
                this.cpfTrab = value;
            }

            /**
             * Obtém o valor da propriedade nisTrab.
             * 
             */
            public long getNisTrab() {
                return nisTrab;
            }

            /**
             * Define o valor da propriedade nisTrab.
             * 
             */
            public void setNisTrab(long value) {
                this.nisTrab = value;
            }

            /**
             * Obtém o valor da propriedade nmTrab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmTrab() {
                return nmTrab;
            }

            /**
             * Define o valor da propriedade nmTrab.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmTrab(String value) {
                this.nmTrab = value;
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
         *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "matricula"
        })
        public static class Vinculo {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
            protected String matricula;

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

        }

    }

}
