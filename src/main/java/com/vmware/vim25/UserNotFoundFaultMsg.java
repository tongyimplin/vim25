package com.vmware.vim25;

import com.vmware.vim25.UserNotFound;
import com.vmware.vim25.UserNotFoundFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "UserNotFoundFault", targetNamespace = "urn:vim25")
public class UserNotFoundFaultMsg extends Exception {
  private UserNotFound faultInfo;
  
  public UserNotFoundFaultMsg(String paramString, UserNotFound paramUserNotFound) {
    super(paramString);
    this.faultInfo = paramUserNotFound;
  }
  
  public UserNotFoundFaultMsg(String paramString, UserNotFound paramUserNotFound, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramUserNotFound;
  }
  
  public UserNotFound getFaultInfo() {
    return this.faultInfo;
  }
}
