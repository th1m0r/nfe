/*
  MDFeRecepcaoCallbackHandler.java
  <p>
  This file was auto-generated from WSDL
  by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.fincatto.documentofiscal.mdfe3.webservices.recepcao;

/**
 *  Serviços Assincronos serão desativados na data de 30 de Junho de 2024 conforme versa a NT 2024.001.
 * 
 *  MDFeRecepcaoCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
@Deprecated
public abstract class MDFeRecepcaoCallbackHandler {

    protected final Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public MDFeRecepcaoCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public MDFeRecepcaoCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }


    /**
     * auto generated Axis2 call back method for mdfeRecepcaoLote method
     * override this method for handling normal response from mdfeRecepcaoLote operation
     */
    public void receiveResultmdfeRecepcaoLote(
            com.fincatto.documentofiscal.mdfe3.webservices.recepcao.MDFeRecepcaoStub.MdfeRecepcaoLoteResult result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from mdfeRecepcaoLote operation
     */
    public void receiveErrormdfeRecepcaoLote(java.lang.Exception e) {
    }


}
    