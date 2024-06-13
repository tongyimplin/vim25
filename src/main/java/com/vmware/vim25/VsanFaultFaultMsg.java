package com.vmware.vim25;

import com.vmware.vim25.VsanFault;
import com.vmware.vim25.VsanFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "VsanFaultFault", targetNamespace = "urn:vim25")
public class VsanFaultFaultMsg extends Exception {
  private VsanFault faultInfo;
  
  public VsanFaultFaultMsg(String paramString, VsanFault paramVsanFault) {
    super(paramString);
    this.faultInfo = paramVsanFault;
  }
  
  public VsanFaultFaultMsg(String paramString, VsanFault paramVsanFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramVsanFault;
  }
  
  public VsanFault getFaultInfo() {
    return this.faultInfo;
  }
}
