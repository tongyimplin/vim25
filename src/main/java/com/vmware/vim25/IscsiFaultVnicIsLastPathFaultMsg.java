package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicIsLastPath;
import com.vmware.vim25.IscsiFaultVnicIsLastPathFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicIsLastPathFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicIsLastPathFaultMsg extends Exception {
  private IscsiFaultVnicIsLastPath faultInfo;
  
  public IscsiFaultVnicIsLastPathFaultMsg(String paramString, IscsiFaultVnicIsLastPath paramIscsiFaultVnicIsLastPath) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicIsLastPath;
  }
  
  public IscsiFaultVnicIsLastPathFaultMsg(String paramString, IscsiFaultVnicIsLastPath paramIscsiFaultVnicIsLastPath, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicIsLastPath;
  }
  
  public IscsiFaultVnicIsLastPath getFaultInfo() {
    return this.faultInfo;
  }
}
