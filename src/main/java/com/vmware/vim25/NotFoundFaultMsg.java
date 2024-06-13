package com.vmware.vim25;

import com.vmware.vim25.NotFound;
import com.vmware.vim25.NotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "NotFoundFault", targetNamespace = "urn:vim25")
public class NotFoundFaultMsg extends Exception {
  private NotFound faultInfo;
  
  public NotFoundFaultMsg(String paramString, NotFound paramNotFound) {
    super(paramString);
    this.faultInfo = paramNotFound;
  }
  
  public NotFoundFaultMsg(String paramString, NotFound paramNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramNotFound;
  }
  
  public NotFound getFaultInfo() {
    return this.faultInfo;
  }
}
