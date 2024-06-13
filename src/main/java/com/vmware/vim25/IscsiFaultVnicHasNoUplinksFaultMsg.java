package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicHasNoUplinks;
import com.vmware.vim25.IscsiFaultVnicHasNoUplinksFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicHasNoUplinksFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicHasNoUplinksFaultMsg extends Exception {
  private IscsiFaultVnicHasNoUplinks faultInfo;
  
  public IscsiFaultVnicHasNoUplinksFaultMsg(String paramString, IscsiFaultVnicHasNoUplinks paramIscsiFaultVnicHasNoUplinks) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicHasNoUplinks;
  }
  
  public IscsiFaultVnicHasNoUplinksFaultMsg(String paramString, IscsiFaultVnicHasNoUplinks paramIscsiFaultVnicHasNoUplinks, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicHasNoUplinks;
  }
  
  public IscsiFaultVnicHasNoUplinks getFaultInfo() {
    return this.faultInfo;
  }
}
