package com.vmware.vim25;

import com.vmware.vim25.VmConfigFault;
import com.vmware.vim25.VmConfigFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "VmConfigFaultFault", targetNamespace = "urn:vim25")
public class VmConfigFaultFaultMsg extends Exception {
  private VmConfigFault faultInfo;
  
  public VmConfigFaultFaultMsg(String paramString, VmConfigFault paramVmConfigFault) {
    super(paramString);
    this.faultInfo = paramVmConfigFault;
  }
  
  public VmConfigFaultFaultMsg(String paramString, VmConfigFault paramVmConfigFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramVmConfigFault;
  }
  
  public VmConfigFault getFaultInfo() {
    return this.faultInfo;
  }
}
