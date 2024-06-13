package com.vmware.vim25;

import com.vmware.vim25.RebootRequired;
import com.vmware.vim25.RebootRequiredFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "RebootRequiredFault", targetNamespace = "urn:vim25")
public class RebootRequiredFaultMsg extends Exception {
  private RebootRequired faultInfo;
  
  public RebootRequiredFaultMsg(String paramString, RebootRequired paramRebootRequired) {
    super(paramString);
    this.faultInfo = paramRebootRequired;
  }
  
  public RebootRequiredFaultMsg(String paramString, RebootRequired paramRebootRequired, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramRebootRequired;
  }
  
  public RebootRequired getFaultInfo() {
    return this.faultInfo;
  }
}
