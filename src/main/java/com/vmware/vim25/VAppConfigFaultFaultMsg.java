package com.vmware.vim25;

import com.vmware.vim25.VAppConfigFault;
import com.vmware.vim25.VAppConfigFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "VAppConfigFaultFault", targetNamespace = "urn:vim25")
public class VAppConfigFaultFaultMsg extends Exception {
  private VAppConfigFault faultInfo;
  
  public VAppConfigFaultFaultMsg(String paramString, VAppConfigFault paramVAppConfigFault) {
    super(paramString);
    this.faultInfo = paramVAppConfigFault;
  }
  
  public VAppConfigFaultFaultMsg(String paramString, VAppConfigFault paramVAppConfigFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramVAppConfigFault;
  }
  
  public VAppConfigFault getFaultInfo() {
    return this.faultInfo;
  }
}
