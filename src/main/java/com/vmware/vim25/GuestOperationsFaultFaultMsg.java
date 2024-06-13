package com.vmware.vim25;

import com.vmware.vim25.GuestOperationsFault;
import com.vmware.vim25.GuestOperationsFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "GuestOperationsFaultFault", targetNamespace = "urn:vim25")
public class GuestOperationsFaultFaultMsg extends Exception {
  private GuestOperationsFault faultInfo;
  
  public GuestOperationsFaultFaultMsg(String paramString, GuestOperationsFault paramGuestOperationsFault) {
    super(paramString);
    this.faultInfo = paramGuestOperationsFault;
  }
  
  public GuestOperationsFaultFaultMsg(String paramString, GuestOperationsFault paramGuestOperationsFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramGuestOperationsFault;
  }
  
  public GuestOperationsFault getFaultInfo() {
    return this.faultInfo;
  }
}
