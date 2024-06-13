package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicNotFound;
import com.vmware.vim25.IscsiFaultVnicNotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicNotFoundFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicNotFoundFaultMsg extends Exception {
  private IscsiFaultVnicNotFound faultInfo;
  
  public IscsiFaultVnicNotFoundFaultMsg(String paramString, IscsiFaultVnicNotFound paramIscsiFaultVnicNotFound) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicNotFound;
  }
  
  public IscsiFaultVnicNotFoundFaultMsg(String paramString, IscsiFaultVnicNotFound paramIscsiFaultVnicNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicNotFound;
  }
  
  public IscsiFaultVnicNotFound getFaultInfo() {
    return this.faultInfo;
  }
}
