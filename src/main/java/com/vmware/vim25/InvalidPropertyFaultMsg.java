package com.vmware.vim25;

import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.InvalidPropertyFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidPropertyFault", targetNamespace = "urn:vim25")
public class InvalidPropertyFaultMsg extends Exception {
  private InvalidProperty faultInfo;
  
  public InvalidPropertyFaultMsg(String paramString, InvalidProperty paramInvalidProperty) {
    super(paramString);
    this.faultInfo = paramInvalidProperty;
  }
  
  public InvalidPropertyFaultMsg(String paramString, InvalidProperty paramInvalidProperty, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidProperty;
  }
  
  public InvalidProperty getFaultInfo() {
    return this.faultInfo;
  }
}
