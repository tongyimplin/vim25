package com.vmware.vim25;

import com.vmware.vim25.VmFaultToleranceIssue;
import com.vmware.vim25.VmFaultToleranceIssueFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "VmFaultToleranceIssueFault", targetNamespace = "urn:vim25")
public class VmFaultToleranceIssueFaultMsg extends Exception {
  private VmFaultToleranceIssue faultInfo;
  
  public VmFaultToleranceIssueFaultMsg(String paramString, VmFaultToleranceIssue paramVmFaultToleranceIssue) {
    super(paramString);
    this.faultInfo = paramVmFaultToleranceIssue;
  }
  
  public VmFaultToleranceIssueFaultMsg(String paramString, VmFaultToleranceIssue paramVmFaultToleranceIssue, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramVmFaultToleranceIssue;
  }
  
  public VmFaultToleranceIssue getFaultInfo() {
    return this.faultInfo;
  }
}
