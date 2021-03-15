//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:14 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.fgts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="evtFGTS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}T_ideEvento_retorno_contrib"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="infoFGTS">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrRecArqBase"/>
 *                             &lt;element name="indExistInfo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ideEstab" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
 *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
 *                                       &lt;element name="ideLotacao" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_codigo_esocial"/>
 *                                                 &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpLotacao"/>
 *                                                 &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
 *                                                 &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
 *                                                 &lt;element name="infoBaseFGTS" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="tpValor">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                                                           &lt;enumeration value="11"/>
 *                                                                           &lt;enumeration value="12"/>
 *                                                                           &lt;enumeration value="13"/>
 *                                                                           &lt;enumeration value="14"/>
 *                                                                           &lt;enumeration value="15"/>
 *                                                                           &lt;enumeration value="16"/>
 *                                                                           &lt;enumeration value="17"/>
 *                                                                           &lt;enumeration value="18"/>
 *                                                                           &lt;enumeration value="19"/>
 *                                                                           &lt;enumeration value="21"/>
 *                                                                           &lt;enumeration value="22"/>
 *                                                                           &lt;enumeration value="23"/>
 *                                                                           &lt;enumeration value="24"/>
 *                                                                           &lt;enumeration value="25"/>
 *                                                                           &lt;enumeration value="26"/>
 *                                                                           &lt;enumeration value="27"/>
 *                                                                           &lt;enumeration value="28"/>
 *                                                                           &lt;enumeration value="29"/>
 *                                                                           &lt;enumeration value="30"/>
 *                                                                           &lt;enumeration value="31"/>
 *                                                                           &lt;enumeration value="32"/>
 *                                                                           &lt;enumeration value="41"/>
 *                                                                           &lt;enumeration value="42"/>
 *                                                                           &lt;enumeration value="43"/>
 *                                                                           &lt;enumeration value="44"/>
 *                                                                           &lt;enumeration value="45"/>
 *                                                                           &lt;enumeration value="46"/>
 *                                                                           &lt;enumeration value="47"/>
 *                                                                           &lt;enumeration value="48"/>
 *                                                                           &lt;enumeration value="49"/>
 *                                                                           &lt;enumeration value="50"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
 *                                                                     &lt;element name="baseFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                                     &lt;element name="vrFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_periodo_mensal"/>
 *                                                                     &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
 *                                                                     &lt;element name="basePerAntE" maxOccurs="99">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
 *                                                                               &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
 *                                                                               &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
 *                                                                               &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_Id_retorno" />
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
    "evtFGTS",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtFGTS evtFGTS;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade evtFGTS.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtFGTS }
     *     
     */
    public ESocial.EvtFGTS getEvtFGTS() {
        return evtFGTS;
    }

    /**
     * Define o valor da propriedade evtFGTS.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtFGTS }
     *     
     */
    public void setEvtFGTS(ESocial.EvtFGTS value) {
        this.evtFGTS = value;
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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}T_ideEvento_retorno_contrib"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="infoFGTS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrRecArqBase"/>
     *                   &lt;element name="indExistInfo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ideEstab" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
     *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
     *                             &lt;element name="ideLotacao" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_codigo_esocial"/>
     *                                       &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpLotacao"/>
     *                                       &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
     *                                       &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
     *                                       &lt;element name="infoBaseFGTS" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="tpValor">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                                                 &lt;enumeration value="11"/>
     *                                                                 &lt;enumeration value="12"/>
     *                                                                 &lt;enumeration value="13"/>
     *                                                                 &lt;enumeration value="14"/>
     *                                                                 &lt;enumeration value="15"/>
     *                                                                 &lt;enumeration value="16"/>
     *                                                                 &lt;enumeration value="17"/>
     *                                                                 &lt;enumeration value="18"/>
     *                                                                 &lt;enumeration value="19"/>
     *                                                                 &lt;enumeration value="21"/>
     *                                                                 &lt;enumeration value="22"/>
     *                                                                 &lt;enumeration value="23"/>
     *                                                                 &lt;enumeration value="24"/>
     *                                                                 &lt;enumeration value="25"/>
     *                                                                 &lt;enumeration value="26"/>
     *                                                                 &lt;enumeration value="27"/>
     *                                                                 &lt;enumeration value="28"/>
     *                                                                 &lt;enumeration value="29"/>
     *                                                                 &lt;enumeration value="30"/>
     *                                                                 &lt;enumeration value="31"/>
     *                                                                 &lt;enumeration value="32"/>
     *                                                                 &lt;enumeration value="41"/>
     *                                                                 &lt;enumeration value="42"/>
     *                                                                 &lt;enumeration value="43"/>
     *                                                                 &lt;enumeration value="44"/>
     *                                                                 &lt;enumeration value="45"/>
     *                                                                 &lt;enumeration value="46"/>
     *                                                                 &lt;enumeration value="47"/>
     *                                                                 &lt;enumeration value="48"/>
     *                                                                 &lt;enumeration value="49"/>
     *                                                                 &lt;enumeration value="50"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
     *                                                           &lt;element name="baseFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                                           &lt;element name="vrFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_periodo_mensal"/>
     *                                                           &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
     *                                                           &lt;element name="basePerAntE" maxOccurs="99">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
     *                                                                     &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
     *                                                                     &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
     *                                                                     &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
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
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_Id_retorno" />
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
        "infoFGTS"
    })
    public static class EvtFGTS {

        @XmlElement(required = true)
        protected TIdeEventoRetornoContrib ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtFGTS.InfoFGTS infoFGTS;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoRetornoContrib }
         *     
         */
        public TIdeEventoRetornoContrib getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoRetornoContrib }
         *     
         */
        public void setIdeEvento(TIdeEventoRetornoContrib value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade infoFGTS.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtFGTS.InfoFGTS }
         *     
         */
        public ESocial.EvtFGTS.InfoFGTS getInfoFGTS() {
            return infoFGTS;
        }

        /**
         * Define o valor da propriedade infoFGTS.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtFGTS.InfoFGTS }
         *     
         */
        public void setInfoFGTS(ESocial.EvtFGTS.InfoFGTS value) {
            this.infoFGTS = value;
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
         *         &lt;element name="nrRecArqBase" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrRecArqBase"/>
         *         &lt;element name="indExistInfo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ideEstab" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
         *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
         *                   &lt;element name="ideLotacao" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_codigo_esocial"/>
         *                             &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpLotacao"/>
         *                             &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
         *                             &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
         *                             &lt;element name="infoBaseFGTS" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="tpValor">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                                                       &lt;enumeration value="11"/>
         *                                                       &lt;enumeration value="12"/>
         *                                                       &lt;enumeration value="13"/>
         *                                                       &lt;enumeration value="14"/>
         *                                                       &lt;enumeration value="15"/>
         *                                                       &lt;enumeration value="16"/>
         *                                                       &lt;enumeration value="17"/>
         *                                                       &lt;enumeration value="18"/>
         *                                                       &lt;enumeration value="19"/>
         *                                                       &lt;enumeration value="21"/>
         *                                                       &lt;enumeration value="22"/>
         *                                                       &lt;enumeration value="23"/>
         *                                                       &lt;enumeration value="24"/>
         *                                                       &lt;enumeration value="25"/>
         *                                                       &lt;enumeration value="26"/>
         *                                                       &lt;enumeration value="27"/>
         *                                                       &lt;enumeration value="28"/>
         *                                                       &lt;enumeration value="29"/>
         *                                                       &lt;enumeration value="30"/>
         *                                                       &lt;enumeration value="31"/>
         *                                                       &lt;enumeration value="32"/>
         *                                                       &lt;enumeration value="41"/>
         *                                                       &lt;enumeration value="42"/>
         *                                                       &lt;enumeration value="43"/>
         *                                                       &lt;enumeration value="44"/>
         *                                                       &lt;enumeration value="45"/>
         *                                                       &lt;enumeration value="46"/>
         *                                                       &lt;enumeration value="47"/>
         *                                                       &lt;enumeration value="48"/>
         *                                                       &lt;enumeration value="49"/>
         *                                                       &lt;enumeration value="50"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
         *                                                 &lt;element name="baseFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                                                 &lt;element name="vrFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_periodo_mensal"/>
         *                                                 &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
         *                                                 &lt;element name="basePerAntE" maxOccurs="99">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
         *                                                           &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
         *                                                           &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
         *                                                           &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
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
        @XmlType(name = "", propOrder = {
            "nrRecArqBase",
            "indExistInfo",
            "ideEstab"
        })
        public static class InfoFGTS {

            @XmlElement(required = true)
            protected String nrRecArqBase;
            protected byte indExistInfo;
            protected List<ESocial.EvtFGTS.InfoFGTS.IdeEstab> ideEstab;

            /**
             * Obtém o valor da propriedade nrRecArqBase.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrRecArqBase() {
                return nrRecArqBase;
            }

            /**
             * Define o valor da propriedade nrRecArqBase.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrRecArqBase(String value) {
                this.nrRecArqBase = value;
            }

            /**
             * Obtém o valor da propriedade indExistInfo.
             * 
             */
            public byte getIndExistInfo() {
                return indExistInfo;
            }

            /**
             * Define o valor da propriedade indExistInfo.
             * 
             */
            public void setIndExistInfo(byte value) {
                this.indExistInfo = value;
            }

            /**
             * Gets the value of the ideEstab property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ideEstab property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIdeEstab().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtFGTS.InfoFGTS.IdeEstab }
             * 
             * 
             */
            public List<ESocial.EvtFGTS.InfoFGTS.IdeEstab> getIdeEstab() {
                if (ideEstab == null) {
                    ideEstab = new ArrayList<ESocial.EvtFGTS.InfoFGTS.IdeEstab>();
                }
                return this.ideEstab;
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
             *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_3_4"/>
             *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14"/>
             *         &lt;element name="ideLotacao" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_codigo_esocial"/>
             *                   &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpLotacao"/>
             *                   &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
             *                   &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
             *                   &lt;element name="infoBaseFGTS" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="tpValor">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *                                             &lt;enumeration value="11"/>
             *                                             &lt;enumeration value="12"/>
             *                                             &lt;enumeration value="13"/>
             *                                             &lt;enumeration value="14"/>
             *                                             &lt;enumeration value="15"/>
             *                                             &lt;enumeration value="16"/>
             *                                             &lt;enumeration value="17"/>
             *                                             &lt;enumeration value="18"/>
             *                                             &lt;enumeration value="19"/>
             *                                             &lt;enumeration value="21"/>
             *                                             &lt;enumeration value="22"/>
             *                                             &lt;enumeration value="23"/>
             *                                             &lt;enumeration value="24"/>
             *                                             &lt;enumeration value="25"/>
             *                                             &lt;enumeration value="26"/>
             *                                             &lt;enumeration value="27"/>
             *                                             &lt;enumeration value="28"/>
             *                                             &lt;enumeration value="29"/>
             *                                             &lt;enumeration value="30"/>
             *                                             &lt;enumeration value="31"/>
             *                                             &lt;enumeration value="32"/>
             *                                             &lt;enumeration value="41"/>
             *                                             &lt;enumeration value="42"/>
             *                                             &lt;enumeration value="43"/>
             *                                             &lt;enumeration value="44"/>
             *                                             &lt;enumeration value="45"/>
             *                                             &lt;enumeration value="46"/>
             *                                             &lt;enumeration value="47"/>
             *                                             &lt;enumeration value="48"/>
             *                                             &lt;enumeration value="49"/>
             *                                             &lt;enumeration value="50"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
             *                                       &lt;element name="baseFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                                       &lt;element name="vrFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_periodo_mensal"/>
             *                                       &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
             *                                       &lt;element name="basePerAntE" maxOccurs="99">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
             *                                                 &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
             *                                                 &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
             *                                                 &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
            @XmlType(name = "", propOrder = {
                "tpInsc",
                "nrInsc",
                "ideLotacao"
            })
            public static class IdeEstab {

                protected byte tpInsc;
                @XmlElement(required = true)
                protected String nrInsc;
                @XmlElement(required = true)
                protected List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao> ideLotacao;

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
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNrInsc() {
                    return nrInsc;
                }

                /**
                 * Define o valor da propriedade nrInsc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNrInsc(String value) {
                    this.nrInsc = value;
                }

                /**
                 * Gets the value of the ideLotacao property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ideLotacao property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIdeLotacao().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao }
                 * 
                 * 
                 */
                public List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao> getIdeLotacao() {
                    if (ideLotacao == null) {
                        ideLotacao = new ArrayList<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao>();
                    }
                    return this.ideLotacao;
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
                 *         &lt;element name="codLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_codigo_esocial"/>
                 *         &lt;element name="tpLotacao" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpLotacao"/>
                 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpInsc_1_2_4" minOccurs="0"/>
                 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_nrInsc_11_12_14" minOccurs="0"/>
                 *         &lt;element name="infoBaseFGTS" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpValor">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                 *                                   &lt;enumeration value="11"/>
                 *                                   &lt;enumeration value="12"/>
                 *                                   &lt;enumeration value="13"/>
                 *                                   &lt;enumeration value="14"/>
                 *                                   &lt;enumeration value="15"/>
                 *                                   &lt;enumeration value="16"/>
                 *                                   &lt;enumeration value="17"/>
                 *                                   &lt;enumeration value="18"/>
                 *                                   &lt;enumeration value="19"/>
                 *                                   &lt;enumeration value="21"/>
                 *                                   &lt;enumeration value="22"/>
                 *                                   &lt;enumeration value="23"/>
                 *                                   &lt;enumeration value="24"/>
                 *                                   &lt;enumeration value="25"/>
                 *                                   &lt;enumeration value="26"/>
                 *                                   &lt;enumeration value="27"/>
                 *                                   &lt;enumeration value="28"/>
                 *                                   &lt;enumeration value="29"/>
                 *                                   &lt;enumeration value="30"/>
                 *                                   &lt;enumeration value="31"/>
                 *                                   &lt;enumeration value="32"/>
                 *                                   &lt;enumeration value="41"/>
                 *                                   &lt;enumeration value="42"/>
                 *                                   &lt;enumeration value="43"/>
                 *                                   &lt;enumeration value="44"/>
                 *                                   &lt;enumeration value="45"/>
                 *                                   &lt;enumeration value="46"/>
                 *                                   &lt;enumeration value="47"/>
                 *                                   &lt;enumeration value="48"/>
                 *                                   &lt;enumeration value="49"/>
                 *                                   &lt;enumeration value="50"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
                 *                             &lt;element name="baseFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *                             &lt;element name="vrFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_periodo_mensal"/>
                 *                             &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
                 *                             &lt;element name="basePerAntE" maxOccurs="99">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
                 *                                       &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
                 *                                       &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                 *                                       &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                    "codLotacao",
                    "tpLotacao",
                    "tpInsc",
                    "nrInsc",
                    "infoBaseFGTS"
                })
                public static class IdeLotacao {

                    @XmlElement(required = true)
                    protected String codLotacao;
                    @XmlElement(required = true)
                    protected String tpLotacao;
                    protected Byte tpInsc;
                    protected String nrInsc;
                    protected ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS infoBaseFGTS;

                    /**
                     * Obtém o valor da propriedade codLotacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodLotacao() {
                        return codLotacao;
                    }

                    /**
                     * Define o valor da propriedade codLotacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodLotacao(String value) {
                        this.codLotacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpLotacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpLotacao() {
                        return tpLotacao;
                    }

                    /**
                     * Define o valor da propriedade tpLotacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpLotacao(String value) {
                        this.tpLotacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpInsc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getTpInsc() {
                        return tpInsc;
                    }

                    /**
                     * Define o valor da propriedade tpInsc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setTpInsc(Byte value) {
                        this.tpInsc = value;
                    }

                    /**
                     * Obtém o valor da propriedade nrInsc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNrInsc() {
                        return nrInsc;
                    }

                    /**
                     * Define o valor da propriedade nrInsc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNrInsc(String value) {
                        this.nrInsc = value;
                    }

                    /**
                     * Obtém o valor da propriedade infoBaseFGTS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS }
                     *     
                     */
                    public ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS getInfoBaseFGTS() {
                        return infoBaseFGTS;
                    }

                    /**
                     * Define o valor da propriedade infoBaseFGTS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS }
                     *     
                     */
                    public void setInfoBaseFGTS(ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS value) {
                        this.infoBaseFGTS = value;
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
                     *         &lt;element name="basePerApur" maxOccurs="99" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpValor">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                     *                         &lt;enumeration value="11"/>
                     *                         &lt;enumeration value="12"/>
                     *                         &lt;enumeration value="13"/>
                     *                         &lt;enumeration value="14"/>
                     *                         &lt;enumeration value="15"/>
                     *                         &lt;enumeration value="16"/>
                     *                         &lt;enumeration value="17"/>
                     *                         &lt;enumeration value="18"/>
                     *                         &lt;enumeration value="19"/>
                     *                         &lt;enumeration value="21"/>
                     *                         &lt;enumeration value="22"/>
                     *                         &lt;enumeration value="23"/>
                     *                         &lt;enumeration value="24"/>
                     *                         &lt;enumeration value="25"/>
                     *                         &lt;enumeration value="26"/>
                     *                         &lt;enumeration value="27"/>
                     *                         &lt;enumeration value="28"/>
                     *                         &lt;enumeration value="29"/>
                     *                         &lt;enumeration value="30"/>
                     *                         &lt;enumeration value="31"/>
                     *                         &lt;enumeration value="32"/>
                     *                         &lt;enumeration value="41"/>
                     *                         &lt;enumeration value="42"/>
                     *                         &lt;enumeration value="43"/>
                     *                         &lt;enumeration value="44"/>
                     *                         &lt;enumeration value="45"/>
                     *                         &lt;enumeration value="46"/>
                     *                         &lt;enumeration value="47"/>
                     *                         &lt;enumeration value="48"/>
                     *                         &lt;enumeration value="49"/>
                     *                         &lt;enumeration value="50"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
                     *                   &lt;element name="baseFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                     *                   &lt;element name="vrFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="infoBasePerAntE" maxOccurs="180" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_periodo_mensal"/>
                     *                   &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
                     *                   &lt;element name="basePerAntE" maxOccurs="99">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
                     *                             &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
                     *                             &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                     *                             &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                        "basePerApur",
                        "infoBasePerAntE"
                    })
                    public static class InfoBaseFGTS {

                        protected List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.BasePerApur> basePerApur;
                        protected List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE> infoBasePerAntE;

                        /**
                         * Gets the value of the basePerApur property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the basePerApur property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getBasePerApur().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.BasePerApur }
                         * 
                         * 
                         */
                        public List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.BasePerApur> getBasePerApur() {
                            if (basePerApur == null) {
                                basePerApur = new ArrayList<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.BasePerApur>();
                            }
                            return this.basePerApur;
                        }

                        /**
                         * Gets the value of the infoBasePerAntE property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the infoBasePerAntE property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getInfoBasePerAntE().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE }
                         * 
                         * 
                         */
                        public List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE> getInfoBasePerAntE() {
                            if (infoBasePerAntE == null) {
                                infoBasePerAntE = new ArrayList<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE>();
                            }
                            return this.infoBasePerAntE;
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
                         *         &lt;element name="tpValor">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
                         *               &lt;enumeration value="11"/>
                         *               &lt;enumeration value="12"/>
                         *               &lt;enumeration value="13"/>
                         *               &lt;enumeration value="14"/>
                         *               &lt;enumeration value="15"/>
                         *               &lt;enumeration value="16"/>
                         *               &lt;enumeration value="17"/>
                         *               &lt;enumeration value="18"/>
                         *               &lt;enumeration value="19"/>
                         *               &lt;enumeration value="21"/>
                         *               &lt;enumeration value="22"/>
                         *               &lt;enumeration value="23"/>
                         *               &lt;enumeration value="24"/>
                         *               &lt;enumeration value="25"/>
                         *               &lt;enumeration value="26"/>
                         *               &lt;enumeration value="27"/>
                         *               &lt;enumeration value="28"/>
                         *               &lt;enumeration value="29"/>
                         *               &lt;enumeration value="30"/>
                         *               &lt;enumeration value="31"/>
                         *               &lt;enumeration value="32"/>
                         *               &lt;enumeration value="41"/>
                         *               &lt;enumeration value="42"/>
                         *               &lt;enumeration value="43"/>
                         *               &lt;enumeration value="44"/>
                         *               &lt;enumeration value="45"/>
                         *               &lt;enumeration value="46"/>
                         *               &lt;enumeration value="47"/>
                         *               &lt;enumeration value="48"/>
                         *               &lt;enumeration value="49"/>
                         *               &lt;enumeration value="50"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="indIncid" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
                         *         &lt;element name="baseFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                         *         &lt;element name="vrFGTS" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                            "tpValor",
                            "indIncid",
                            "baseFGTS",
                            "vrFGTS"
                        })
                        public static class BasePerApur {

                            protected byte tpValor;
                            protected byte indIncid;
                            @XmlElement(required = true)
                            protected BigDecimal baseFGTS;
                            protected BigDecimal vrFGTS;

                            /**
                             * Obtém o valor da propriedade tpValor.
                             * 
                             */
                            public byte getTpValor() {
                                return tpValor;
                            }

                            /**
                             * Define o valor da propriedade tpValor.
                             * 
                             */
                            public void setTpValor(byte value) {
                                this.tpValor = value;
                            }

                            /**
                             * Obtém o valor da propriedade indIncid.
                             * 
                             */
                            public byte getIndIncid() {
                                return indIncid;
                            }

                            /**
                             * Define o valor da propriedade indIncid.
                             * 
                             */
                            public void setIndIncid(byte value) {
                                this.indIncid = value;
                            }

                            /**
                             * Obtém o valor da propriedade baseFGTS.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getBaseFGTS() {
                                return baseFGTS;
                            }

                            /**
                             * Define o valor da propriedade baseFGTS.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setBaseFGTS(BigDecimal value) {
                                this.baseFGTS = value;
                            }

                            /**
                             * Obtém o valor da propriedade vrFGTS.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getVrFGTS() {
                                return vrFGTS;
                            }

                            /**
                             * Define o valor da propriedade vrFGTS.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setVrFGTS(BigDecimal value) {
                                this.vrFGTS = value;
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
                         *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_periodo_mensal"/>
                         *         &lt;element name="tpAcConv" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpAcConv_FGTS"/>
                         *         &lt;element name="basePerAntE" maxOccurs="99">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
                         *                   &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
                         *                   &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                         *                   &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                            "perRef",
                            "tpAcConv",
                            "basePerAntE"
                        })
                        public static class InfoBasePerAntE {

                            @XmlElement(required = true)
                            protected String perRef;
                            @XmlElement(required = true)
                            @XmlSchemaType(name = "string")
                            protected TSTpAcConvFGTS tpAcConv;
                            @XmlElement(required = true)
                            protected List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE> basePerAntE;

                            /**
                             * Obtém o valor da propriedade perRef.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPerRef() {
                                return perRef;
                            }

                            /**
                             * Define o valor da propriedade perRef.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPerRef(String value) {
                                this.perRef = value;
                            }

                            /**
                             * Obtém o valor da propriedade tpAcConv.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TSTpAcConvFGTS }
                             *     
                             */
                            public TSTpAcConvFGTS getTpAcConv() {
                                return tpAcConv;
                            }

                            /**
                             * Define o valor da propriedade tpAcConv.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TSTpAcConvFGTS }
                             *     
                             */
                            public void setTpAcConv(TSTpAcConvFGTS value) {
                                this.tpAcConv = value;
                            }

                            /**
                             * Gets the value of the basePerAntE property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the basePerAntE property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getBasePerAntE().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE }
                             * 
                             * 
                             */
                            public List<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE> getBasePerAntE() {
                                if (basePerAntE == null) {
                                    basePerAntE = new ArrayList<ESocial.EvtFGTS.InfoFGTS.IdeEstab.IdeLotacao.InfoBaseFGTS.InfoBasePerAntE.BasePerAntE>();
                                }
                                return this.basePerAntE;
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
                             *         &lt;element name="tpValorE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_tpValorE"/>
                             *         &lt;element name="indIncidE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_indIncid"/>
                             *         &lt;element name="baseFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo"/>
                             *         &lt;element name="vrFGTSE" type="{http://www.esocial.gov.br/schema/evt/evtFGTS/v_S_01_00_00}TS_valorMonetario_positivo" minOccurs="0"/>
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
                                "tpValorE",
                                "indIncidE",
                                "baseFGTSE",
                                "vrFGTSE"
                            })
                            public static class BasePerAntE {

                                protected byte tpValorE;
                                protected byte indIncidE;
                                @XmlElement(required = true)
                                protected BigDecimal baseFGTSE;
                                protected BigDecimal vrFGTSE;

                                /**
                                 * Obtém o valor da propriedade tpValorE.
                                 * 
                                 */
                                public byte getTpValorE() {
                                    return tpValorE;
                                }

                                /**
                                 * Define o valor da propriedade tpValorE.
                                 * 
                                 */
                                public void setTpValorE(byte value) {
                                    this.tpValorE = value;
                                }

                                /**
                                 * Obtém o valor da propriedade indIncidE.
                                 * 
                                 */
                                public byte getIndIncidE() {
                                    return indIncidE;
                                }

                                /**
                                 * Define o valor da propriedade indIncidE.
                                 * 
                                 */
                                public void setIndIncidE(byte value) {
                                    this.indIncidE = value;
                                }

                                /**
                                 * Obtém o valor da propriedade baseFGTSE.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getBaseFGTSE() {
                                    return baseFGTSE;
                                }

                                /**
                                 * Define o valor da propriedade baseFGTSE.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setBaseFGTSE(BigDecimal value) {
                                    this.baseFGTSE = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vrFGTSE.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getVrFGTSE() {
                                    return vrFGTSE;
                                }

                                /**
                                 * Define o valor da propriedade vrFGTSE.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setVrFGTSE(BigDecimal value) {
                                    this.vrFGTSE = value;
                                }

                            }

                        }

                    }

                }

            }

        }

    }

}
