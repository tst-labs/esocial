//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.04.03 at 06:57:24 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.benprrp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_ideEstab_perAnt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_ideEstab_perAnt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_ideEstab">
 *       &lt;sequence>
 *         &lt;element name="itensRemun" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_03_00}T_itensRemun_rpps" maxOccurs="200"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEstab_perAnt", propOrder = {
    "itensRemun"
})
public class TIdeEstabPerAnt
    extends TIdeEstab
{

    @XmlElement(required = true)
    protected List<TItensRemunRpps> itensRemun;

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
