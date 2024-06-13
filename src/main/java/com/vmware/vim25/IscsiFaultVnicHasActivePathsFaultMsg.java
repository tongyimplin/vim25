package com.vmware.vim25;

import com.vmware.vim25.IscsiFaultVnicHasActivePaths;
import com.vmware.vim25.IscsiFaultVnicHasActivePathsFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "IscsiFaultVnicHasActivePathsFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicHasActivePathsFaultMsg extends Exception {
  private IscsiFaultVnicHasActivePaths faultInfo;
  
  public IscsiFaultVnicHasActivePathsFaultMsg(String paramString, IscsiFaultVnicHasActivePaths paramIscsiFaultVnicHasActivePaths) {
    super(paramString);
    this.faultInfo = paramIscsiFaultVnicHasActivePaths;
  }
  
  public IscsiFaultVnicHasActivePathsFaultMsg(String paramString, IscsiFaultVnicHasActivePaths paramIscsiFaultVnicHasActivePaths, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramIscsiFaultVnicHasActivePaths;
  }
  
  public IscsiFaultVnicHasActivePaths getFaultInfo() {
    return this.faultInfo;
  }
}
