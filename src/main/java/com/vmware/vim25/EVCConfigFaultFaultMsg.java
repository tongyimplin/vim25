package com.vmware.vim25;

import com.vmware.vim25.EVCConfigFault;
import com.vmware.vim25.EVCConfigFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "EVCConfigFaultFault", targetNamespace = "urn:vim25")
public class EVCConfigFaultFaultMsg extends Exception {
  private EVCConfigFault faultInfo;
  
  public EVCConfigFaultFaultMsg(String paramString, EVCConfigFault paramEVCConfigFault) {
    super(paramString);
    this.faultInfo = paramEVCConfigFault;
  }
  
  public EVCConfigFaultFaultMsg(String paramString, EVCConfigFault paramEVCConfigFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramEVCConfigFault;
  }
  
  public EVCConfigFault getFaultInfo() {
    return this.faultInfo;
  }
}
