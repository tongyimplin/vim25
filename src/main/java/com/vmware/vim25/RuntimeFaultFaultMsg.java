package com.vmware.vim25;

import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "RuntimeFaultFault", targetNamespace = "urn:vim25")
public class RuntimeFaultFaultMsg extends Exception {
  private RuntimeFault faultInfo;
  
  public RuntimeFaultFaultMsg(String paramString, RuntimeFault paramRuntimeFault) {
    super(paramString);
    this.faultInfo = paramRuntimeFault;
  }
  
  public RuntimeFaultFaultMsg(String paramString, RuntimeFault paramRuntimeFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramRuntimeFault;
  }
  
  public RuntimeFault getFaultInfo() {
    return this.faultInfo;
  }
}
