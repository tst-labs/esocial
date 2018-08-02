//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.04.09 às 12:51:09 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tablotacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações de identificação da lotação (código) e período de validade
 * 
 * <p>Classe Java de TIdeLotacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TIdeLotacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codLotacao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="iniValid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fimValid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
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
@XmlType(name = "TIdeLotacao", namespace = "http://www.esocial.gov.br/schema/evt/evtTabLotacao/v02_04_02", propOrder = {
    "codLotacao",
    "iniValid",
    "fimValid"
})
public class TIdeLotacao {

    @XmlElement(required = true)
    protected String codLotacao;
    @XmlElement(required = true)
    protected String iniValid;
    protected String fimValid;

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
     * Obtém o valor da propriedade iniValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniValid() {
        return iniValid;
    }

    /**
     * Define o valor da propriedade iniValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniValid(String value) {
        this.iniValid = value;
    }

    /**
     * Obtém o valor da propriedade fimValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFimValid() {
        return fimValid;
    }

    /**
     * Define o valor da propriedade fimValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFimValid(String value) {
        this.fimValid = value;
    }

}
