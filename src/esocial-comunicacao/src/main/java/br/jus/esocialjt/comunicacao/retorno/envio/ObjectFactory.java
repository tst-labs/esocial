//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.03.05 às 01:11:24 PM BRT 
//


package br.jus.esocialjt.comunicacao.retorno.envio;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.jus.esocialjt.comunicacao.v01_04_01.retornoEnvio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.jus.esocialjt.comunicacao.v01_04_01.retornoEnvio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ESocial }
     * 
     */
    public ESocial createESocial() {
        return new ESocial();
    }

    /**
     * Create an instance of {@link TOcorrencias }
     * 
     */
    public TOcorrencias createTOcorrencias() {
        return new TOcorrencias();
    }

    /**
     * Create an instance of {@link ESocial.RetornoEnvioLoteEventos }
     * 
     */
    public ESocial.RetornoEnvioLoteEventos createESocialRetornoEnvioLoteEventos() {
        return new ESocial.RetornoEnvioLoteEventos();
    }

    /**
     * Create an instance of {@link TIdeEmpregador }
     * 
     */
    public TIdeEmpregador createTIdeEmpregador() {
        return new TIdeEmpregador();
    }

    /**
     * Create an instance of {@link TDadosRecepcao }
     * 
     */
    public TDadosRecepcao createTDadosRecepcao() {
        return new TDadosRecepcao();
    }

    /**
     * Create an instance of {@link TStatus }
     * 
     */
    public TStatus createTStatus() {
        return new TStatus();
    }

    /**
     * Create an instance of {@link TIdeTransmissor }
     * 
     */
    public TIdeTransmissor createTIdeTransmissor() {
        return new TIdeTransmissor();
    }

    /**
     * Create an instance of {@link TOcorrencias.Ocorrencia }
     * 
     */
    public TOcorrencias.Ocorrencia createTOcorrenciasOcorrencia() {
        return new TOcorrencias.Ocorrencia();
    }

}
