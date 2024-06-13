package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicAlreadyBound;
import com.vmware.vim25.IscsiFaultVnicAlreadyBoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicAlreadyBoundFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicAlreadyBoundFaultMsg extends Exception {
  private IscsiFaultVnicAlreadyBound faultInfo;
  
  public IscsiFaultVnicAlreadyBoundFaultMsg(String paramString, IscsiFaultVnicAlreadyBound paramIscsiFaultVnicAlreadyBound) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicAlreadyBound;
  }
  
  public IscsiFaultVnicAlreadyBoundFaultMsg(String paramString, IscsiFaultVnicAlreadyBound paramIscsiFaultVnicAlreadyBound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicAlreadyBound;
  }
  
  public IscsiFaultVnicAlreadyBound getFaultInfo() {
    return this.faultInfo;
  }
}
