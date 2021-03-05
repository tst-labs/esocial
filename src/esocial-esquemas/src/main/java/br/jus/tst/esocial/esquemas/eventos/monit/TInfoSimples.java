//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:18 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.monit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [03]); N (nos demais casos)
 * 
 * <p>Classe Java de T_infoSimples complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_infoSimples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtMonit/v_S_01_00_00}TS_indSimples"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_infoSimples", propOrder = {
    "indSimples"
})
public class TInfoSimples {

    protected byte indSimples;

    /**
     * Obtém o valor da propriedade indSimples.
     * 
     */
    public byte getIndSimples() {
        return indSimples;
    }

    /**
     * Define o valor da propriedade indSimples.
     * 
     */
    public void setIndSimples(byte value) {
        this.indSimples = value;
    }

}
