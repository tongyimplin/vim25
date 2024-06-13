package com.vmware.vim25;

import com.vmware.vim25.InvalidState;
import com.vmware.vim25.InvalidStateFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidStateFault", targetNamespace = "urn:vim25")
public class InvalidStateFaultMsg extends Exception {
  private InvalidState faultInfo;
  
  public InvalidStateFaultMsg(String paramString, InvalidState paramInvalidState) {
    super(paramString);
    this.faultInfo = paramInvalidState;
  }
  
  public InvalidStateFaultMsg(String paramString, InvalidState paramInvalidState, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidState;
  }
  
  public InvalidState getFaultInfo() {
    return this.faultInfo;
  }
}
