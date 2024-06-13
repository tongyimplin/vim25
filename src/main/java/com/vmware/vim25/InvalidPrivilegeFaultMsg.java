package com.vmware.vim25;

import com.vmware.vim25.InvalidPrivilege;
import com.vmware.vim25.InvalidPrivilegeFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidPrivilegeFault", targetNamespace = "urn:vim25")
public class InvalidPrivilegeFaultMsg extends Exception {
  private InvalidPrivilege faultInfo;
  
  public InvalidPrivilegeFaultMsg(String paramString, InvalidPrivilege paramInvalidPrivilege) {
    super(paramString);
    this.faultInfo = paramInvalidPrivilege;
  }
  
  public InvalidPrivilegeFaultMsg(String paramString, InvalidPrivilege paramInvalidPrivilege, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidPrivilege;
  }
  
  public InvalidPrivilege getFaultInfo() {
    return this.faultInfo;
  }
}
