package com.vmware.vim25;

import com.vmware.vim25.HttpFault;
import com.vmware.vim25.HttpFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "HttpFaultFault", targetNamespace = "urn:vim25")
public class HttpFaultFaultMsg extends Exception {
  private HttpFault faultInfo;
  
  public HttpFaultFaultMsg(String paramString, HttpFault paramHttpFault) {
    super(paramString);
    this.faultInfo = paramHttpFault;
  }
  
  public HttpFaultFaultMsg(String paramString, HttpFault paramHttpFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramHttpFault;
  }
  
  public HttpFault getFaultInfo() {
    return this.faultInfo;
  }
}
