//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.exprisco;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de T_horContratual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_horContratual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qtdHrsSem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minExclusive value="0"/>
 *               &lt;maxInclusive value="99.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpJornada">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tmpParc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="horNoturno" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_sim_nao" minOccurs="0"/>
 *         &lt;element name="dscJorn" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_texto_999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_horContratual", propOrder = {
    "qtdHrsSem",
    "tpJornada",
    "tmpParc",
    "horNoturno",
    "dscJorn"
})
public class THorContratual {

    protected BigDecimal qtdHrsSem;
    protected byte tpJornada;
    protected byte tmpParc;
    @XmlSchemaType(name = "string")
    protected TSSimNao horNoturno;
    @XmlElement(required = true)
    protected String dscJorn;

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
     * Obtém o valor da propriedade horNoturno.
     * 
     * @return
     *     possible object is
     *     {@link TSSimNao }
     *     
     */
    public TSSimNao getHorNoturno() {
        return horNoturno;
    }

    /**
     * Define o valor da propriedade horNoturno.
     * 
     * @param value
     *     allowed object is
     *     {@link TSSimNao }
     *     
     */
    public void setHorNoturno(TSSimNao value) {
        this.horNoturno = value;
    }

    /**
     * Obtém o valor da propriedade dscJorn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscJorn() {
        return dscJorn;
    }

    /**
     * Define o valor da propriedade dscJorn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscJorn(String value) {
        this.dscJorn = value;
    }

}
