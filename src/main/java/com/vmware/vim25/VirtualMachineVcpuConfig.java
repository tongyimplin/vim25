package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LatencySensitivity;
import com.vmware.vim25.VirtualMachineVcpuConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVcpuConfig", propOrder = {"latencySensitivity"})
public class VirtualMachineVcpuConfig extends DynamicData {
  protected LatencySensitivity latencySensitivity;
  
  public LatencySensitivity getLatencySensitivity() {
    return this.latencySensitivity;
  }
  
  public void setLatencySensitivity(LatencySensitivity paramLatencySensitivity) {
    this.latencySensitivity = paramLatencySensitivity;
  }
}
