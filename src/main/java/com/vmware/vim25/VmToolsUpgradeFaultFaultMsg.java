package com.vmware.vim25;

import com.vmware.vim25.VmToolsUpgradeFault;
import com.vmware.vim25.VmToolsUpgradeFaultFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "VmToolsUpgradeFaultFault", targetNamespace = "urn:vim25")
public class VmToolsUpgradeFaultFaultMsg extends Exception {
  private VmToolsUpgradeFault faultInfo;
  
  public VmToolsUpgradeFaultFaultMsg(String paramString, VmToolsUpgradeFault paramVmToolsUpgradeFault) {
    super(paramString);
    this.faultInfo = paramVmToolsUpgradeFault;
  }
  
  public VmToolsUpgradeFaultFaultMsg(String paramString, VmToolsUpgradeFault paramVmToolsUpgradeFault, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramVmToolsUpgradeFault;
  }
  
  public VmToolsUpgradeFault getFaultInfo() {
    return this.faultInfo;
  }
}
