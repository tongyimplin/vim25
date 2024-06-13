package com.vmware.vim25;

import com.vmware.vim25.GuestPermissionDenied;
import com.vmware.vim25.GuestPermissionDeniedFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "GuestPermissionDeniedFault", targetNamespace = "urn:vim25")
public class GuestPermissionDeniedFaultMsg extends Exception {
  private GuestPermissionDenied faultInfo;
  
  public GuestPermissionDeniedFaultMsg(String paramString, GuestPermissionDenied paramGuestPermissionDenied) {
    super(paramString);
    this.faultInfo = paramGuestPermissionDenied;
  }
  
  public GuestPermissionDeniedFaultMsg(String paramString, GuestPermissionDenied paramGuestPermissionDenied, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramGuestPermissionDenied;
  }
  
  public GuestPermissionDenied getFaultInfo() {
    return this.faultInfo;
  }
}
