package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicHasWrongUplink;
import com.vmware.vim25.IscsiFaultVnicHasWrongUplinkFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicHasWrongUplinkFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicHasWrongUplinkFaultMsg extends Exception {
  private IscsiFaultVnicHasWrongUplink faultInfo;
  
  public IscsiFaultVnicHasWrongUplinkFaultMsg(String paramString, IscsiFaultVnicHasWrongUplink paramIscsiFaultVnicHasWrongUplink) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicHasWrongUplink;
  }
  
  public IscsiFaultVnicHasWrongUplinkFaultMsg(String paramString, IscsiFaultVnicHasWrongUplink paramIscsiFaultVnicHasWrongUplink, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicHasWrongUplink;
  }
  
  public IscsiFaultVnicHasWrongUplink getFaultInfo() {
    return this.faultInfo;
  }
}
