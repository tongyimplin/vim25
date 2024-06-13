package com.vmware.vim25;

import com.vmware.vim25.InvalidType;
import com.vmware.vim25.InvalidTypeFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidTypeFault", targetNamespace = "urn:vim25")
public class InvalidTypeFaultMsg extends Exception {
  private InvalidType faultInfo;
  
  public InvalidTypeFaultMsg(String paramString, InvalidType paramInvalidType) {
    super(paramString);
    this.faultInfo = paramInvalidType;
  }
  
  public InvalidTypeFaultMsg(String paramString, InvalidType paramInvalidType, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidType;
  }
  
  public InvalidType getFaultInfo() {
    return this.faultInfo;
  }
}
