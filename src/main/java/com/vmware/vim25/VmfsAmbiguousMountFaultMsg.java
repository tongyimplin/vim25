package com.vmware.vim25;

import com.vmware.vim25.VmfsAmbiguousMount;
import com.vmware.vim25.VmfsAmbiguousMountFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "VmfsAmbiguousMountFault", targetNamespace = "urn:vim25")
public class VmfsAmbiguousMountFaultMsg extends Exception {
  private VmfsAmbiguousMount faultInfo;
  
  public VmfsAmbiguousMountFaultMsg(String paramString, VmfsAmbiguousMount paramVmfsAmbiguousMount) {
    super(paramString);
    this.faultInfo = paramVmfsAmbiguousMount;
  }
  
  public VmfsAmbiguousMountFaultMsg(String paramString, VmfsAmbiguousMount paramVmfsAmbiguousMount, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramVmfsAmbiguousMount;
  }
  
  public VmfsAmbiguousMount getFaultInfo() {
    return this.faultInfo;
  }
}
