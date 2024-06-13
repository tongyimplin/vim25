package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicNotBound;
import com.vmware.vim25.IscsiFaultVnicNotBoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicNotBoundFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicNotBoundFaultMsg extends Exception {
  private IscsiFaultVnicNotBound faultInfo;
  
  public IscsiFaultVnicNotBoundFaultMsg(String paramString, IscsiFaultVnicNotBound paramIscsiFaultVnicNotBound) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicNotBound;
  }
  
  public IscsiFaultVnicNotBoundFaultMsg(String paramString, IscsiFaultVnicNotBound paramIscsiFaultVnicNotBound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicNotBound;
  }
  
  public IscsiFaultVnicNotBound getFaultInfo() {
    return this.faultInfo;
  }
}
