//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:59 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.insapo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Detalha o(s) Ambiente(s) de Trabalho em que o trabalhador desempenha atividades insalubres/periculosa.
 * 
 * <p>Classe Java de TinfoAmbiente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TinfoAmbiente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fatRisco" maxOccurs="999">
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
@XmlType(name = "TinfoAmbiente", namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", propOrder = {
    "codAmb",
    "fatRisco"
})
public class TinfoAmbiente {

    @XmlElement(required = true)
    protected String codAmb;
    @XmlElement(required = true)
    protected List<TinfoAmbiente.FatRisco> fatRisco;

    /**
     * Obtém o valor da propriedade codAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAmb() {
        return codAmb;
    }

    /**
     * Define o valor da propriedade codAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAmb(String value) {
        this.codAmb = value;
    }

    /**
     * Gets the value of the fatRisco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fatRisco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFatRisco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TinfoAmbiente.FatRisco }
     * 
     * 
     */
    public List<TinfoAmbiente.FatRisco> getFatRisco() {
        if (fatRisco == null) {
            fatRisco = new ArrayList<TinfoAmbiente.FatRisco>();
        }
        return this.fatRisco;
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
    public static class FatRisco {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtInsApo/v02_04_02", required = true)
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
