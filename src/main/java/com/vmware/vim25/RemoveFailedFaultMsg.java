package com.vmware.vim25;

import com.vmware.vim25.RemoveFailed;
import com.vmware.vim25.RemoveFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "RemoveFailedFault", targetNamespace = "urn:vim25")
public class RemoveFailedFaultMsg extends Exception {
  private RemoveFailed faultInfo;
  
  public RemoveFailedFaultMsg(String paramString, RemoveFailed paramRemoveFailed) {
    super(paramString);
    this.faultInfo = paramRemoveFailed;
  }
  
  public RemoveFailedFaultMsg(String paramString, RemoveFailed paramRemoveFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramRemoveFailed;
  }
  
  public RemoveFailed getFaultInfo() {
    return this.faultInfo;
  }
}
