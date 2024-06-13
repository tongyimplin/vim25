package com.vmware.vim25;

import com.vmware.vim25.VirtualMachinePrecisionClockInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePrecisionClockInfo", propOrder = {"systemClockProtocol"})
public class VirtualMachinePrecisionClockInfo extends VirtualMachineTargetInfo {
  protected String systemClockProtocol;
  
  public String getSystemClockProtocol() {
    return this.systemClockProtocol;
  }
  
  public void setSystemClockProtocol(String paramString) {
    this.systemClockProtocol = paramString;
  }
}
