//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:58 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.benprrp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {tpInsc}, {nrInsc}
 * 
 * <p>Classe Java de T_ideEstab complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEstab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_tpInsc_1"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}TS_cnpj"/>
 *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_00_00}T_itensRemun_rpps" maxOccurs="200"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEstab", propOrder = {
    "tpInsc",
    "nrInsc",
    "itensRemun"
})
public class TIdeEstab {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    @XmlElement(required = true)
    protected List<TItensRemunRpps> itensRemun;

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
     * Gets the value of the itensRemun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensRemun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensRemun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TItensRemunRpps }
     * 
     * 
     */
    public List<TItensRemunRpps> getItensRemun() {
        if (itensRemun == null) {
            itensRemun = new ArrayList<TItensRemunRpps>();
        }
        return this.itensRemun;
    }

}
