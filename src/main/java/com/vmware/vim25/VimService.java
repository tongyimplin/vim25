package com.vmware.vim25;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "VimService", targetNamespace = "urn:vim25Service", wsdlLocation = "com/vmware/vim25/vimService.wsdl")
public class VimService extends Service {
  private static final URL VIMSERVICE_WSDL_LOCATION;
  
  private static final WebServiceException VIMSERVICE_EXCEPTION;
  
  private static final QName VIMSERVICE_QNAME = new QName("urn:vim25Service", "VimService");
  
  public VimService() {
    super(__getWsdlLocation(), VIMSERVICE_QNAME);
  }
  
  public VimService(WebServiceFeature... paramVarArgs) {
    super(__getWsdlLocation(), VIMSERVICE_QNAME, paramVarArgs);
  }
  
  public VimService(URL paramURL) {
    super(paramURL, VIMSERVICE_QNAME);
  }
  
  public VimService(URL paramURL, WebServiceFeature... paramVarArgs) {
    super(paramURL, VIMSERVICE_QNAME, paramVarArgs);
  }
  
  public VimService(URL paramURL, QName paramQName) {
    super(paramURL, paramQName);
  }
  
  public VimService(URL paramURL, QName paramQName, WebServiceFeature... paramVarArgs) {
    super(paramURL, paramQName, paramVarArgs);
  }
  
  @WebEndpoint(name = "VimPort")
  public VimPortType getVimPort() {
    return (VimPortType)getPort(new QName("urn:vim25Service", "VimPort"), VimPortType.class);
  }
  
  @WebEndpoint(name = "VimPort")
  public VimPortType getVimPort(WebServiceFeature... paramVarArgs) {
    return (VimPortType)getPort(new QName("urn:vim25Service", "VimPort"), VimPortType.class, paramVarArgs);
  }
  
  private static URL __getWsdlLocation() {
    if (VIMSERVICE_EXCEPTION != null)
      throw VIMSERVICE_EXCEPTION; 
    return VIMSERVICE_WSDL_LOCATION;
  }
  
  static {
    VIMSERVICE_WSDL_LOCATION = VimService.class.getResource("com/vmware/vim25/vimService.wsdl");
    WebServiceException webServiceException = null;
    if (VIMSERVICE_WSDL_LOCATION == null)
      webServiceException = new WebServiceException("Cannot find 'vimService.wsdl' wsdl. Place the resource correctly in the classpath."); 
    VIMSERVICE_EXCEPTION = webServiceException;
  }
}
