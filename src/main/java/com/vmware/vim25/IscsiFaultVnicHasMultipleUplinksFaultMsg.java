package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicHasMultipleUplinks;
import com.vmware.vim25.IscsiFaultVnicHasMultipleUplinksFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicHasMultipleUplinksFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicHasMultipleUplinksFaultMsg extends Exception {
  private IscsiFaultVnicHasMultipleUplinks faultInfo;
  
  public IscsiFaultVnicHasMultipleUplinksFaultMsg(String paramString, IscsiFaultVnicHasMultipleUplinks paramIscsiFaultVnicHasMultipleUplinks) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicHasMultipleUplinks;
  }
  
  public IscsiFaultVnicHasMultipleUplinksFaultMsg(String paramString, IscsiFaultVnicHasMultipleUplinks paramIscsiFaultVnicHasMultipleUplinks, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicHasMultipleUplinks;
  }
  
  public IscsiFaultVnicHasMultipleUplinks getFaultInfo() {
    return this.faultInfo;
  }
}
