package com.vmware.vim25;

import com.vmware.vim25.AuthMinimumAdminPermission;
import com.vmware.vim25.AuthMinimumAdminPermissionFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "AuthMinimumAdminPermissionFault", targetNamespace = "urn:vim25")
public class AuthMinimumAdminPermissionFaultMsg extends Exception {
  private AuthMinimumAdminPermission faultInfo;
  
  public AuthMinimumAdminPermissionFaultMsg(String paramString, AuthMinimumAdminPermission paramAuthMinimumAdminPermission) {
    super(paramString);
    this.faultInfo = paramAuthMinimumAdminPermission;
  }
  
  public AuthMinimumAdminPermissionFaultMsg(String paramString, AuthMinimumAdminPermission paramAuthMinimumAdminPermission, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramAuthMinimumAdminPermission;
  }
  
  public AuthMinimumAdminPermission getFaultInfo() {
    return this.faultInfo;
  }
}
