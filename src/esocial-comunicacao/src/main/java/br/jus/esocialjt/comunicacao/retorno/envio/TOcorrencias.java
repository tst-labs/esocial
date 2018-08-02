//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:11:24 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.envio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Define uma ocorrência encontrada no processamento de um arquivo.
 * 
 * <p>Classe Java de TOcorrencias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TOcorrencias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ocorrencia" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="descricao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2048"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *                   &lt;element name="localizacao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2048"/>
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
@XmlType(name = "TOcorrencias", propOrder = {
    "ocorrencia"
})
public class TOcorrencias {

    @XmlElement(required = true)
    protected List<TOcorrencias.Ocorrencia> ocorrencia;

    /**
     * Gets the value of the ocorrencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocorrencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcorrencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TOcorrencias.Ocorrencia }
     * 
     * 
     */
    public List<TOcorrencias.Ocorrencia> getOcorrencia() {
        if (ocorrencia == null) {
            ocorrencia = new ArrayList<TOcorrencias.Ocorrencia>();
        }
        return this.ocorrencia;
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
     *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="descricao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2048"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *         &lt;element name="localizacao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2048"/>
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
        "codigo",
        "descricao",
        "tipo",
        "localizacao"
    })
    public static class Ocorrencia {

        protected int codigo;
        @XmlElement(required = true)
        protected String descricao;
        @XmlSchemaType(name = "unsignedByte")
        protected short tipo;
        protected String localizacao;

        /**
         * Obtém o valor da propriedade codigo.
         * 
         */
        public int getCodigo() {
            return codigo;
        }

        /**
         * Define o valor da propriedade codigo.
         * 
         */
        public void setCodigo(int value) {
            this.codigo = value;
        }

        /**
         * Obtém o valor da propriedade descricao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Define o valor da propriedade descricao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricao(String value) {
            this.descricao = value;
        }

        /**
         * Obtém o valor da propriedade tipo.
         * 
         */
        public short getTipo() {
            return tipo;
        }

        /**
         * Define o valor da propriedade tipo.
         * 
         */
        public void setTipo(short value) {
            this.tipo = value;
        }

        /**
         * Obtém o valor da propriedade localizacao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalizacao() {
            return localizacao;
        }

        /**
         * Define o valor da propriedade localizacao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalizacao(String value) {
            this.localizacao = value;
        }

    }

}
