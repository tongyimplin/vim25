package com.vmware.vim25;

import com.vmware.vim25.InvalidLogin;
import com.vmware.vim25.InvalidLoginFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidLoginFault", targetNamespace = "urn:vim25")
public class InvalidLoginFaultMsg extends Exception {
  private InvalidLogin faultInfo;
  
  public InvalidLoginFaultMsg(String paramString, InvalidLogin paramInvalidLogin) {
    super(paramString);
    this.faultInfo = paramInvalidLogin;
  }
  
  public InvalidLoginFaultMsg(String paramString, InvalidLogin paramInvalidLogin, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidLogin;
  }
  
  public InvalidLogin getFaultInfo() {
    return this.faultInfo;
  }
}
