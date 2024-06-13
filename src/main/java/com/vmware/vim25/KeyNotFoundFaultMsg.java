package com.vmware.vim25;

import com.vmware.vim25.KeyNotFound;
import com.vmware.vim25.KeyNotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "KeyNotFoundFault", targetNamespace = "urn:vim25")
public class KeyNotFoundFaultMsg extends Exception {
  private KeyNotFound faultInfo;
  
  public KeyNotFoundFaultMsg(String paramString, KeyNotFound paramKeyNotFound) {
    super(paramString);
    this.faultInfo = paramKeyNotFound;
  }
  
  public KeyNotFoundFaultMsg(String paramString, KeyNotFound paramKeyNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramKeyNotFound;
  }
  
  public KeyNotFound getFaultInfo() {
    return this.faultInfo;
  }
}
