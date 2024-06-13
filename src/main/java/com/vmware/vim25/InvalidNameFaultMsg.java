package com.vmware.vim25;

import com.vmware.vim25.InvalidName;
import com.vmware.vim25.InvalidNameFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidNameFault", targetNamespace = "urn:vim25")
public class InvalidNameFaultMsg extends Exception {
  private InvalidName faultInfo;
  
  public InvalidNameFaultMsg(String paramString, InvalidName paramInvalidName) {
    super(paramString);
    this.faultInfo = paramInvalidName;
  }
  
  public InvalidNameFaultMsg(String paramString, InvalidName paramInvalidName, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidName;
  }
  
  public InvalidName getFaultInfo() {
    return this.faultInfo;
  }
}
