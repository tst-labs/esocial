
/**
 * WsConsultarIdentificadoresEventosCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package br.jus.esocialjt.comunicacao.wsdl;

    /**
     *  WsConsultarIdentificadoresEventosCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WsConsultarIdentificadoresEventosCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WsConsultarIdentificadoresEventosCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WsConsultarIdentificadoresEventosCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for consultarIdentificadoresEventosEmpregador method
            * override this method for handling normal response from consultarIdentificadoresEventosEmpregador operation
            */
           public void receiveResultconsultarIdentificadoresEventosEmpregador(
                    br.jus.esocialjt.comunicacao.wsdl.WsConsultarIdentificadoresEventosStub.ConsultarIdentificadoresEventosEmpregadorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarIdentificadoresEventosEmpregador operation
           */
            public void receiveErrorconsultarIdentificadoresEventosEmpregador(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarIdentificadoresEventosTabela method
            * override this method for handling normal response from consultarIdentificadoresEventosTabela operation
            */
           public void receiveResultconsultarIdentificadoresEventosTabela(
                    br.jus.esocialjt.comunicacao.wsdl.WsConsultarIdentificadoresEventosStub.ConsultarIdentificadoresEventosTabelaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarIdentificadoresEventosTabela operation
           */
            public void receiveErrorconsultarIdentificadoresEventosTabela(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consultarIdentificadoresEventosTrabalhador method
            * override this method for handling normal response from consultarIdentificadoresEventosTrabalhador operation
            */
           public void receiveResultconsultarIdentificadoresEventosTrabalhador(
                    br.jus.esocialjt.comunicacao.wsdl.WsConsultarIdentificadoresEventosStub.ConsultarIdentificadoresEventosTrabalhadorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consultarIdentificadoresEventosTrabalhador operation
           */
            public void receiveErrorconsultarIdentificadoresEventosTrabalhador(java.lang.Exception e) {
            }
                


    }
    