package com.vmware.vim25;

import com.vmware.vim25.HostConfigFault;
import com.vmware.vim25.HostConfigFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "HostConfigFaultFault", targetNamespace = "urn:vim25")
public class HostConfigFaultFaultMsg extends Exception {
  private HostConfigFault faultInfo;
  
  public HostConfigFaultFaultMsg(String paramString, HostConfigFault paramHostConfigFault) {
    super(paramString);
    this.faultInfo = paramHostConfigFault;
  }
  
  public HostConfigFaultFaultMsg(String paramString, HostConfigFault paramHostConfigFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramHostConfigFault;
  }
  
  public HostConfigFault getFaultInfo() {
    return this.faultInfo;
  }
}
