package com.vmware.vim25;

import com.vmware.vim25.InvalidGuestLogin;
import com.vmware.vim25.InvalidGuestLoginFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "InvalidGuestLoginFault", targetNamespace = "urn:vim25")
public class InvalidGuestLoginFaultMsg extends Exception {
  private InvalidGuestLogin faultInfo;
  
  public InvalidGuestLoginFaultMsg(String paramString, InvalidGuestLogin paramInvalidGuestLogin) {
    super(paramString);
    this.faultInfo = paramInvalidGuestLogin;
  }
  
  public InvalidGuestLoginFaultMsg(String paramString, InvalidGuestLogin paramInvalidGuestLogin, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramInvalidGuestLogin;
  }
  
  public InvalidGuestLogin getFaultInfo() {
    return this.faultInfo;
  }
}
