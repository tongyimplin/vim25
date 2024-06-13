package com.vmware.vim25;

import com.vmware.vim25.ConcurrentAccess;
import com.vmware.vim25.ConcurrentAccessFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ConcurrentAccessFault", targetNamespace = "urn:vim25")
public class ConcurrentAccessFaultMsg extends Exception {
  private ConcurrentAccess faultInfo;
  
  public ConcurrentAccessFaultMsg(String paramString, ConcurrentAccess paramConcurrentAccess) {
    super(paramString);
    this.faultInfo = paramConcurrentAccess;
  }
  
  public ConcurrentAccessFaultMsg(String paramString, ConcurrentAccess paramConcurrentAccess, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramConcurrentAccess;
  }
  
  public ConcurrentAccess getFaultInfo() {
    return this.faultInfo;
  }
}
