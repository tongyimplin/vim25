package com.vmware.vim25;

import com.vmware.vim25.InvalidPowerState;
import com.vmware.vim25.InvalidPowerStateFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidPowerStateFault", targetNamespace = "urn:vim25")
public class InvalidPowerStateFaultMsg extends Exception {
  private InvalidPowerState faultInfo;
  
  public InvalidPowerStateFaultMsg(String paramString, InvalidPowerState paramInvalidPowerState) {
    super(paramString);
    this.faultInfo = paramInvalidPowerState;
  }
  
  public InvalidPowerStateFaultMsg(String paramString, InvalidPowerState paramInvalidPowerState, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidPowerState;
  }
  
  public InvalidPowerState getFaultInfo() {
    return this.faultInfo;
  }
}
