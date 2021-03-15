//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:24 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.rmnrpps;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TS_tpAcConv.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TS_tpAcConv">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TS_tpAcConv")
@XmlEnum
public enum TSTpAcConv {


    /**
     * Acordo Coletivo de Trabalho
     * 
     */
    A,

    /**
     * Legislação federal, estadual, municipal ou distrital
     * 
     */
    B,

    /**
     * Convenção Coletiva de Trabalho
     * 
     */
    C,

    /**
     * Sentença normativa - Dissídio
     * 
     */
    D,

    /**
     * Conversão de licença saúde em acidente de trabalho
     * 
     */
    E,

    /**
     * Outras verbas de natureza salarial ou não salarial devidas após o desligamento
     * 
     */
    F,

    /**
     * Antecipação de diferenças de acordo, convenção ou dissídio coletivo
     * 
     */
    G,

    /**
     * Recolhimento mensal de FGTS anterior ao início de obrigatoriedade dos eventos periódicos
     * 
     */
    H;

    public String value() {
        return name();
    }

    public static TSTpAcConv fromValue(String v) {
        return valueOf(v);
    }

}
