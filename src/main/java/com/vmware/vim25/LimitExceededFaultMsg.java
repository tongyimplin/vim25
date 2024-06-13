package com.vmware.vim25;

import com.vmware.vim25.LimitExceeded;
import com.vmware.vim25.LimitExceededFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "LimitExceededFault", targetNamespace = "urn:vim25")
public class LimitExceededFaultMsg extends Exception {
  private LimitExceeded faultInfo;
  
  public LimitExceededFaultMsg(String paramString, LimitExceeded paramLimitExceeded) {
    super(paramString);
    this.faultInfo = paramLimitExceeded;
  }
  
  public LimitExceededFaultMsg(String paramString, LimitExceeded paramLimitExceeded, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramLimitExceeded;
  }
  
  public LimitExceeded getFaultInfo() {
    return this.faultInfo;
  }
}
