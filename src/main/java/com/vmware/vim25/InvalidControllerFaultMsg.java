package com.vmware.vim25;

import com.vmware.vim25.InvalidController;
import com.vmware.vim25.InvalidControllerFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidControllerFault", targetNamespace = "urn:vim25")
public class InvalidControllerFaultMsg extends Exception {
  private InvalidController faultInfo;
  
  public InvalidControllerFaultMsg(String paramString, InvalidController paramInvalidController) {
    super(paramString);
    this.faultInfo = paramInvalidController;
  }
  
  public InvalidControllerFaultMsg(String paramString, InvalidController paramInvalidController, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidController;
  }
  
  public InvalidController getFaultInfo() {
    return this.faultInfo;
  }
}
