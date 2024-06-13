package com.vmware.vim25;

import com.vmware.vim25.DvsNotAuthorized;
import com.vmware.vim25.DvsNotAuthorizedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DvsNotAuthorizedFault", targetNamespace = "urn:vim25")
public class DvsNotAuthorizedFaultMsg extends Exception {
  private DvsNotAuthorized faultInfo;
  
  public DvsNotAuthorizedFaultMsg(String paramString, DvsNotAuthorized paramDvsNotAuthorized) {
    super(paramString);
    this.faultInfo = paramDvsNotAuthorized;
  }
  
  public DvsNotAuthorizedFaultMsg(String paramString, DvsNotAuthorized paramDvsNotAuthorized, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDvsNotAuthorized;
  }
  
  public DvsNotAuthorized getFaultInfo() {
    return this.faultInfo;
  }
}
