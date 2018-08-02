//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:50:54 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenprrp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dados do benefício previdenciário
 * 
 * <p>Classe Java de TDadosBeneficio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDadosBeneficio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpBenef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d{1,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrBenefic">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dtIniBenef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vrBenef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infoPenMorte" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idQuota">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cpfInst">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d{11}"/>
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
@XmlType(name = "TDadosBeneficio", namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", propOrder = {
    "tpBenef",
    "nrBenefic",
    "dtIniBenef",
    "vrBenef",
    "infoPenMorte"
})
public class TDadosBeneficio {

    protected byte tpBenef;
    @XmlElement(required = true)
    protected String nrBenefic;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dtIniBenef;
    @XmlElement(required = true)
    protected BigDecimal vrBenef;
    protected TDadosBeneficio.InfoPenMorte infoPenMorte;

    /**
     * Obtém o valor da propriedade tpBenef.
     * 
     */
    public byte getTpBenef() {
        return tpBenef;
    }

    /**
     * Define o valor da propriedade tpBenef.
     * 
     */
    public void setTpBenef(byte value) {
        this.tpBenef = value;
    }

    /**
     * Obtém o valor da propriedade nrBenefic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrBenefic() {
        return nrBenefic;
    }

    /**
     * Define o valor da propriedade nrBenefic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrBenefic(String value) {
        this.nrBenefic = value;
    }

    /**
     * Obtém o valor da propriedade dtIniBenef.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtIniBenef() {
        return dtIniBenef;
    }

    /**
     * Define o valor da propriedade dtIniBenef.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtIniBenef(XMLGregorianCalendar value) {
        this.dtIniBenef = value;
    }

    /**
     * Obtém o valor da propriedade vrBenef.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrBenef() {
        return vrBenef;
    }

    /**
     * Define o valor da propriedade vrBenef.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrBenef(BigDecimal value) {
        this.vrBenef = value;
    }

    /**
     * Obtém o valor da propriedade infoPenMorte.
     * 
     * @return
     *     possible object is
     *     {@link TDadosBeneficio.InfoPenMorte }
     *     
     */
    public TDadosBeneficio.InfoPenMorte getInfoPenMorte() {
        return infoPenMorte;
    }

    /**
     * Define o valor da propriedade infoPenMorte.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosBeneficio.InfoPenMorte }
     *     
     */
    public void setInfoPenMorte(TDadosBeneficio.InfoPenMorte value) {
        this.infoPenMorte = value;
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
     *         &lt;element name="idQuota">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cpfInst">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d{11}"/>
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
        "idQuota",
        "cpfInst"
    })
    public static class InfoPenMorte {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected String idQuota;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtCdBenPrRP/v02_04_02", required = true)
        protected String cpfInst;

        /**
         * Obtém o valor da propriedade idQuota.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdQuota() {
            return idQuota;
        }

        /**
         * Define o valor da propriedade idQuota.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdQuota(String value) {
            this.idQuota = value;
        }

        /**
         * Obtém o valor da propriedade cpfInst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpfInst() {
            return cpfInst;
        }

        /**
         * Define o valor da propriedade cpfInst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpfInst(String value) {
            this.cpfInst = value;
        }

    }

}
