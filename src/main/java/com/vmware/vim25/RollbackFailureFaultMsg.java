package com.vmware.vim25;

import com.vmware.vim25.RollbackFailure;
import com.vmware.vim25.RollbackFailureFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "RollbackFailureFault", targetNamespace = "urn:vim25")
public class RollbackFailureFaultMsg extends Exception {
  private RollbackFailure faultInfo;
  
  public RollbackFailureFaultMsg(String paramString, RollbackFailure paramRollbackFailure) {
    super(paramString);
    this.faultInfo = paramRollbackFailure;
  }
  
  public RollbackFailureFaultMsg(String paramString, RollbackFailure paramRollbackFailure, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramRollbackFailure;
  }
  
  public RollbackFailure getFaultInfo() {
    return this.faultInfo;
  }
}
