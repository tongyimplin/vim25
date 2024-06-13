package com.vmware.vim25;

import com.vmware.vim25.PlatformConfigFault;
import com.vmware.vim25.PlatformConfigFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "PlatformConfigFaultFault", targetNamespace = "urn:vim25")
public class PlatformConfigFaultFaultMsg extends Exception {
  private PlatformConfigFault faultInfo;
  
  public PlatformConfigFaultFaultMsg(String paramString, PlatformConfigFault paramPlatformConfigFault) {
    super(paramString);
    this.faultInfo = paramPlatformConfigFault;
  }
  
  public PlatformConfigFaultFaultMsg(String paramString, PlatformConfigFault paramPlatformConfigFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramPlatformConfigFault;
  }
  
  public PlatformConfigFault getFaultInfo() {
    return this.faultInfo;
  }
}
