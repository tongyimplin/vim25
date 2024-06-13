package com.vmware.vim25;

import com.vmware.vim25.InvalidHostState;
import com.vmware.vim25.InvalidHostStateFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidHostStateFault", targetNamespace = "urn:vim25")
public class InvalidHostStateFaultMsg extends Exception {
  private InvalidHostState faultInfo;
  
  public InvalidHostStateFaultMsg(String paramString, InvalidHostState paramInvalidHostState) {
    super(paramString);
    this.faultInfo = paramInvalidHostState;
  }
  
  public InvalidHostStateFaultMsg(String paramString, InvalidHostState paramInvalidHostState, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidHostState;
  }
  
  public InvalidHostState getFaultInfo() {
    return this.faultInfo;
  }
}
