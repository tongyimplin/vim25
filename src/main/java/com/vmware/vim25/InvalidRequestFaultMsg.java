package com.vmware.vim25;

import com.vmware.vim25.InvalidRequest;
import com.vmware.vim25.InvalidRequestFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidRequestFault", targetNamespace = "urn:vim25")
public class InvalidRequestFaultMsg extends Exception {
  private InvalidRequest faultInfo;
  
  public InvalidRequestFaultMsg(String paramString, InvalidRequest paramInvalidRequest) {
    super(paramString);
    this.faultInfo = paramInvalidRequest;
  }
  
  public InvalidRequestFaultMsg(String paramString, InvalidRequest paramInvalidRequest, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidRequest;
  }
  
  public InvalidRequest getFaultInfo() {
    return this.faultInfo;
  }
}
