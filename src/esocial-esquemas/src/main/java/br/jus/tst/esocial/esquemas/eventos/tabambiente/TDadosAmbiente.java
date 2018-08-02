//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:06 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabambiente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações do ambiente de trabalho.
 * 
 * <p>Classe Java de TDadosAmbiente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosAmbiente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dscAmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="localAmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpInsc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrInsc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{8,15}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fatorRisco" maxOccurs="999">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codFatRis">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="4"/>
 *                         &lt;maxLength value="10"/>
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
@XmlType(name = "TDadosAmbiente", namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", propOrder = {
    "dscAmb",
    "localAmb",
    "tpInsc",
    "nrInsc",
    "fatorRisco"
})
public class TDadosAmbiente {

    @XmlElement(required = true)
    protected String dscAmb;
    protected byte localAmb;
    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    @XmlElement(required = true)
    protected List<TDadosAmbiente.FatorRisco> fatorRisco;

    /**
     * Obtém o valor da propriedade dscAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscAmb() {
        return dscAmb;
    }

    /**
     * Define o valor da propriedade dscAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscAmb(String value) {
        this.dscAmb = value;
    }

    /**
     * Obtém o valor da propriedade localAmb.
     * 
     */
    public byte getLocalAmb() {
        return localAmb;
    }

    /**
     * Define o valor da propriedade localAmb.
     * 
     */
    public void setLocalAmb(byte value) {
        this.localAmb = value;
    }

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
     * Gets the value of the fatorRisco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fatorRisco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFatorRisco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDadosAmbiente.FatorRisco }
     * 
     * 
     */
    public List<TDadosAmbiente.FatorRisco> getFatorRisco() {
        if (fatorRisco == null) {
            fatorRisco = new ArrayList<TDadosAmbiente.FatorRisco>();
        }
        return this.fatorRisco;
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
     *         &lt;element name="codFatRis">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="4"/>
     *               &lt;maxLength value="10"/>
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
        "codFatRis"
    })
    public static class FatorRisco {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtTabAmbiente/v02_04_02", required = true)
        protected String codFatRis;

        /**
         * Obtém o valor da propriedade codFatRis.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodFatRis() {
            return codFatRis;
        }

        /**
         * Define o valor da propriedade codFatRis.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodFatRis(String value) {
            this.codFatRis = value;
        }

    }

}
