package com.vmware.vim25;

import com.vmware.vim25.ProfileUpdateFailed;
import com.vmware.vim25.ProfileUpdateFailedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "ProfileUpdateFailedFault", targetNamespace = "urn:vim25")
public class ProfileUpdateFailedFaultMsg extends Exception {
  private ProfileUpdateFailed faultInfo;
  
  public ProfileUpdateFailedFaultMsg(String paramString, ProfileUpdateFailed paramProfileUpdateFailed) {
    super(paramString);
    this.faultInfo = paramProfileUpdateFailed;
  }
  
  public ProfileUpdateFailedFaultMsg(String paramString, ProfileUpdateFailed paramProfileUpdateFailed, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramProfileUpdateFailed;
  }
  
  public ProfileUpdateFailed getFaultInfo() {
    return this.faultInfo;
  }
}
