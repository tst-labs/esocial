//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:11:46 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.evento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="retornoEvento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TIdeEmpregador"/>
 *                   &lt;element name="recepcao" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TDadosRecepcao"/>
 *                   &lt;element name="processamento" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TDadosProcessamentoEvento"/>
 *                   &lt;element name="recibo" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TDadosRecibo" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
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
    "retornoEvento",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
    protected ESocial.RetornoEvento retornoEvento;
    @XmlElement(name = "Signature")
    protected SignatureType signature;

    /**
     * Obtém o valor da propriedade retornoEvento.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.RetornoEvento }
     *     
     */
    public ESocial.RetornoEvento getRetornoEvento() {
        return retornoEvento;
    }

    /**
     * Define o valor da propriedade retornoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.RetornoEvento }
     *     
     */
    public void setRetornoEvento(ESocial.RetornoEvento value) {
        this.retornoEvento = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TIdeEmpregador"/>
     *         &lt;element name="recepcao" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TDadosRecepcao"/>
     *         &lt;element name="processamento" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TDadosProcessamentoEvento"/>
     *         &lt;element name="recibo" type="{http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0}TDadosRecibo" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEmpregador",
        "recepcao",
        "processamento",
        "recibo"
    })
    public static class RetornoEvento {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TDadosRecepcao recepcao;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0", required = true)
        protected TDadosProcessamentoEvento processamento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/retornoEvento/v1_2_0")
        protected TDadosRecibo recibo;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Obtém o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obtém o valor da propriedade recepcao.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecepcao }
         *     
         */
        public TDadosRecepcao getRecepcao() {
            return recepcao;
        }

        /**
         * Define o valor da propriedade recepcao.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecepcao }
         *     
         */
        public void setRecepcao(TDadosRecepcao value) {
            this.recepcao = value;
        }

        /**
         * Obtém o valor da propriedade processamento.
         * 
         * @return
         *     possible object is
         *     {@link TDadosProcessamentoEvento }
         *     
         */
        public TDadosProcessamentoEvento getProcessamento() {
            return processamento;
        }

        /**
         * Define o valor da propriedade processamento.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosProcessamentoEvento }
         *     
         */
        public void setProcessamento(TDadosProcessamentoEvento value) {
            this.processamento = value;
        }

        /**
         * Obtém o valor da propriedade recibo.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecibo }
         *     
         */
        public TDadosRecibo getRecibo() {
            return recibo;
        }

        /**
         * Define o valor da propriedade recibo.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecibo }
         *     
         */
        public void setRecibo(TDadosRecibo value) {
            this.recibo = value;
        }

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
