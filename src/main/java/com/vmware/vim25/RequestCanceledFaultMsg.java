package com.vmware.vim25;

import com.vmware.vim25.RequestCanceled;
import com.vmware.vim25.RequestCanceledFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "RequestCanceledFault", targetNamespace = "urn:vim25")
public class RequestCanceledFaultMsg extends Exception {
  private RequestCanceled faultInfo;
  
  public RequestCanceledFaultMsg(String paramString, RequestCanceled paramRequestCanceled) {
    super(paramString);
    this.faultInfo = paramRequestCanceled;
  }
  
  public RequestCanceledFaultMsg(String paramString, RequestCanceled paramRequestCanceled, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramRequestCanceled;
  }
  
  public RequestCanceled getFaultInfo() {
    return this.faultInfo;
  }
}
