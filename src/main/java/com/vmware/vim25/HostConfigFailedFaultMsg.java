package com.vmware.vim25;

import com.vmware.vim25.HostConfigFailed;
import com.vmware.vim25.HostConfigFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "HostConfigFailedFault", targetNamespace = "urn:vim25")
public class HostConfigFailedFaultMsg extends Exception {
  private HostConfigFailed faultInfo;
  
  public HostConfigFailedFaultMsg(String paramString, HostConfigFailed paramHostConfigFailed) {
    super(paramString);
    this.faultInfo = paramHostConfigFailed;
  }
  
  public HostConfigFailedFaultMsg(String paramString, HostConfigFailed paramHostConfigFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramHostConfigFailed;
  }
  
  public HostConfigFailed getFaultInfo() {
    return this.faultInfo;
  }
}
