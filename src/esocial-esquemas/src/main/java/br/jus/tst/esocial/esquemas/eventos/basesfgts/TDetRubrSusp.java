//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:55 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.basesfgts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_detRubrSusp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_detRubrSusp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_codigo_esocial"/>
 *         &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_ideTabRubr"/>
 *         &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_vrRubr"/>
 *         &lt;element name="ideProcessoFGTS" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
@XmlType(name = "T_detRubrSusp", propOrder = {
    "codRubr",
    "ideTabRubr",
    "vrRubr",
    "ideProcessoFGTS"
})
public class TDetRubrSusp {

    @XmlElement(required = true)
    protected String codRubr;
    @XmlElement(required = true)
    protected String ideTabRubr;
    @XmlElement(required = true)
    protected BigDecimal vrRubr;
    @XmlElement(required = true)
    protected List<TDetRubrSusp.IdeProcessoFGTS> ideProcessoFGTS;

    /**
     * Obtém o valor da propriedade codRubr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRubr() {
        return codRubr;
    }

    /**
     * Define o valor da propriedade codRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRubr(String value) {
        this.codRubr = value;
    }

    /**
     * Obtém o valor da propriedade ideTabRubr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeTabRubr() {
        return ideTabRubr;
    }

    /**
     * Define o valor da propriedade ideTabRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeTabRubr(String value) {
        this.ideTabRubr = value;
    }

    /**
     * Obtém o valor da propriedade vrRubr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrRubr() {
        return vrRubr;
    }

    /**
     * Define o valor da propriedade vrRubr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrRubr(BigDecimal value) {
        this.vrRubr = value;
    }

    /**
     * Gets the value of the ideProcessoFGTS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideProcessoFGTS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdeProcessoFGTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDetRubrSusp.IdeProcessoFGTS }
     * 
     * 
     */
    public List<TDetRubrSusp.IdeProcessoFGTS> getIdeProcessoFGTS() {
        if (ideProcessoFGTS == null) {
            ideProcessoFGTS = new ArrayList<TDetRubrSusp.IdeProcessoFGTS>();
        }
        return this.ideProcessoFGTS;
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
     *         &lt;element name="nrProc" type="{http://www.esocial.gov.br/schema/evt/evtBasesFGTS/v_S_01_00_00}TS_nrProcJud"/>
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
        "nrProc"
    })
    public static class IdeProcessoFGTS {

        @XmlElement(required = true)
        protected String nrProc;

        /**
         * Obtém o valor da propriedade nrProc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrProc() {
            return nrProc;
        }

        /**
         * Define o valor da propriedade nrProc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrProc(String value) {
            this.nrProc = value;
        }

    }

}
